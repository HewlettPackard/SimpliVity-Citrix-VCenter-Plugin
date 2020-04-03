/**
 * Copyright 2018 Hewlett Packard Enterprise Development LP
 */
package com.vmware.vim25.ws;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.doublecloud.ws.util.ReflectUtil;
import org.doublecloud.ws.util.TypeUtil;

import com.nimblestorage.hi.utils.Logger;
import com.vmware.vim25.ManagedObjectReference;

/**
 * This class provides a mechanism to stream the XML response from the vSphere WS into
 * the vi-java client side objects
 *
 * @author gcostea
 *
 */
public class XmlGenStreaming extends XmlGen {

    private static final Logger logger = Logger.getLogger(XmlGenStreaming.class);

    private XMLStreamReader reader;

    @Override
    public Object fromXML(String returnType, InputStream in) throws Exception {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        reader = xmlInputFactory.createFilteredReader(xmlInputFactory.createXMLStreamReader(in), new StreamFilter() {
            @Override
            public boolean accept(XMLStreamReader reader) {
                return reader.isStartElement() || reader.isEndElement() || (reader.isCharacters() && !reader.isWhiteSpace());
            }
        });

        // skip the document start and the envelope
        reader.next();
        reader.next();

        String localName = reader.getLocalName();

        // handle errors
        if (localName.equals("faultcode") || localName.equals("Fault")) {
            logger.debug("Received a SOAP fault");

            reader.next();
            SoapFaultException sfe = null;
            try {
                sfe = parseSoapFault();
            } catch (Exception e) {
                throw new RemoteException("Exception in XmlGenStreaming:", e);
            }
            if (sfe != null && sfe.detail != null) {
                throw (RemoteException) sfe.detail;
            } else {
                throw sfe;
            }
        } else {

            if (returnType != null) {
                logger.trace("Specified return type of {0}", returnType);

                if (returnType.startsWith("ManagedObjectReference")) {

                    reader.next();
                    if (!returnType.endsWith("[]")) {
                        return getManagedObjectReference();
                    } else {
                        List<ManagedObjectReference> results = new ArrayList<>();
                        while (reader.hasNext()) {
                            if (reader.isStartElement()) {
                                results.add(getManagedObjectReference());
                            } else if (reader.isEndElement()) {
                                break;
                            }
                        }

                        logger.trace("Returning array of managed object references: {0}", results);
                        return results.toArray(new ManagedObjectReference[] {});
                    }

                } else if (TypeUtil.isBasicType(returnType)) {

                    List<String> results = new ArrayList<>();
                    while (reader.hasNext()) {
                        if (reader.isStartElement()) {
                            results.add(getText());
                        } else if (reader.isEndElement()) {
                            break;
                        }
                    }

                    logger.trace("Returning basic type: {0}", results);
                    return ReflectUtil.parseToObject(returnType, results);

                } else if (returnType.endsWith("[]")) {

                    reader.next();

                    // if we reach an end tag here, that means nothing is returned
                    if (reader.isEndElement()) {
                        logger.trace("No array of this object type returned");
                        return null;
                    }

                    String arrayItemTypeName = returnType.substring(0, returnType.length() - 2);
                    String type = reader.getAttributeValue(SoapConsts.XSI_NAMESPACE_URI, "type");

                    reader.next();

                    List<Object> results = new ArrayList<>();
                    while (reader.hasNext()) {
                        if (reader.isStartElement()) {
                            Object result = fromXml(TypeUtil.getVimClass(type == null ? arrayItemTypeName : type));
                            results.add(result);
                        }

                        reader.next();
                        reader.next();
                    }

                    if (results.size() > 0) {
                        Class<?> clazz = TypeUtil.getVimClass(arrayItemTypeName);
                        Object array = Array.newInstance(clazz, results.size());

                        for (int i = 0; i < results.size(); i++) {
                            Array.set(array, i, results.get(i));
                        }

                        logger.trace("Returning array of objects: {0}", results);
                        return array;
                    } else {
                        logger.trace("No array of this object type returned");
                        return null;
                    }

                } else {

                    // skip the response tag and the returnval tag
                    reader.next();
                    reader.next();

                    // return null if the object is not present
                    if (reader.isEndElement()) {
                        logger.debug("Nothing returned in the response but an end element");
                        return null;
                    }

                    return fromXml(TypeUtil.getVimClass(returnType));
                }

            } else {
                logger.debug("No bad response found and no return type specified... returning null");
                return null;
            }
        }
    }

    /**
     * Parses the SOAP fault from the xml stream
     *
     * @return
     * @throws Exception
     */
    private SoapFaultException parseSoapFault() throws Exception {
        SoapFaultException sfe = new SoapFaultException();

        while (reader.hasNext()) {
            if (reader.isStartElement()) {
                String localName = reader.getLocalName();

                if (localName.equals("faultcode")) {
                    sfe.setFaultCode(getText());
                } else if (localName.equals("faultstring")) {
                    sfe.setFaultString(getText());
                } else if (localName.equals("faultactor")) {
                    sfe.setFaultActor(getText());
                } else if (localName.equals("detail")) {
                    reader.next();
                    String type = reader.getAttributeValue(SoapConsts.XSI_NAMESPACE_URI, "type");
                    if (type != null) {
                        reader.next();
                        sfe.detail = ((Throwable) fromXml(TypeUtil.getVimClass(type)));
                    }
                }
            } else if (reader.isEndElement()) {
                break;
            }
        }

        logger.debug("Returning SOAP fault with detail faultcode {0}, faultString {1}, faultActor {2}, and detail {3}",
                sfe.getFaultCode(), sfe.getFaultString(), sfe.getFaultActor(), sfe.detail);

        return sfe;
    }

    /**
     * Creates a vi-java client side object through reflection given the Class<?> information to build.
     *
     * @param clazz
     * @return
     * @throws Exception
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    private Object fromXml(Class<?> clazz) throws Exception {
        try {
            if (clazz == null) {
                throw new RemoteException("Cannot instantiate null");
            }

            Object object = clazz.newInstance();
            String simpleName = clazz.getSimpleName();
            logger.trace("Creating object of type: {0}", simpleName);

            while (reader.hasNext()) {
                if (reader.isStartElement()) {
                    String localName = reader.getLocalName();

                    Field field = null;
                    if (TypeUtil.isPrimitiveType(localName)) {
                        field = clazz.getField("_" + localName);
                    } else {
                        field = clazz.getField(localName);
                    }
                    logger.trace("   Processing field {0}", field.getName());

                    Class<?> fType = field.getType();
                    boolean isFieldArray = fType.isArray();
                    // if field is an array, adjust it to the component type
                    if (isFieldArray) {
                        fType = fType.getComponentType();
                    }

                    // The XML response does not tell us the type, so we need to handle base64 types manually
                    boolean isBase64Type = false;
                    if (localName.equalsIgnoreCase("vmxConfigChecksum")
                            || localName.equalsIgnoreCase("hostConfigCheckSum")
                            || localName.equals("scriptCheckSum")) {
                        isBase64Type = true;
                    }

                    Class fRealType = fType;
                    String xsiType = reader.getAttributeValue(SoapConsts.XSI_NAMESPACE_URI, "type");
                    if (xsiType != null && !xsiType.startsWith("xsd:")) {
                        fRealType = TypeUtil.getVimClass(xsiType);
                    }

                    if (fRealType == ManagedObjectReference.class) { // ManagedObjectReference
                        if (isFieldArray) {
                            List<ManagedObjectReference> results = new ArrayList<>();
                            while (reader.hasNext()) {
                                if (reader.isStartElement()) {
                                    String elementName = reader.getLocalName();
                                    if (!elementName.equals(localName)) {
                                        break;
                                    }

                                    results.add(getManagedObjectReference());
                                } else if (reader.isEndElement()) {
                                    break;
                                }
                            }
                            field.set(object, results.toArray(new ManagedObjectReference[] {}));
                        } else {
                            field.set(object, getManagedObjectReference());
                        }
                    } else if (fRealType.isEnum()) {
                        if (!isFieldArray) {
                            Object fo = Enum.valueOf(fRealType, getText());
                            field.set(object, fo);
                        } else {
                            // never seen this in testing and it doesn't appear to be requested anywhere from VimStub
                            // but here's an implementation anyway.
                            List<Object> results = new ArrayList<>();
                            while (reader.hasNext()) {
                                if (reader.isStartElement()) {
                                    results.add(getText());
                                } else if (reader.isEndElement()) {
                                    break;
                                }
                            }
                            ReflectUtil.setArrayField(object, results, field, fType);
                        }
                    } else if (TypeUtil.isBasicType(fRealType)) {
                        if (isFieldArray) {
                            List<String> results = new ArrayList<>();
                            while (reader.hasNext()) {
                                if (reader.isStartElement()) {
                                    String elementName = reader.getLocalName();
                                    if (elementName.equals(localName)) {
                                        results.add(getText());
                                    } else {
                                        break;
                                    }
                                } else if (reader.isEndElement()) {
                                    break;
                                }
                            }
                            ReflectUtil.setObjectArrayField(object, field, fRealType.getSimpleName() + "[]", results, isBase64Type);
                        } else {
                            if (xsiType != null) {
                                xsiType = xsiType.substring("xsd:".length());
                                ReflectUtil.setObjectField(object, field, xsiType, getText());
                            } else {
                                ReflectUtil.setObjectField(object, field, fRealType.getSimpleName(), getText());
                            }
                        }
                    } else {
                        // VI java object
                        if (isFieldArray) {
                            List<Object> results = new ArrayList<>();
                            while (reader.hasNext()) {
                                if (reader.isStartElement()) {
                                    String elementName = reader.getLocalName();
                                    if (elementName.equals(localName)) {
                                        xsiType = reader.getAttributeValue(SoapConsts.XSI_NAMESPACE_URI, "type");
                                        if (xsiType != null && !xsiType.startsWith("xsd:")) {
                                            fRealType = TypeUtil.getVimClass(xsiType);
                                        }

                                        reader.next();
                                        Object o = fromXml(fRealType);
                                        results.add(o);
                                        reader.next();
                                    } else {
                                        break;
                                    }
                                } else if (reader.isEndElement()) {
                                    break;
                                }
                            }

                            // remove the supportedAdvancedOptions from the HostInternetScsiHbaSendTarget
                            if ("HostInternetScsiHbaSendTarget".equals(simpleName) && "supportedAdvancedOptions".equals(localName)) {
                                continue;
                            }

                            // and both supportedAdvancedOptions and advancedOptions from the HostInternetScsiHbaStaticTarget
                            if ("HostInternetScsiHbaStaticTarget".equals(simpleName) && ("supportedAdvancedOptions".equals(localName) || "advancedOptions".equals(localName))) {
                                continue;
                            }

                            // since they consume a huge amount of memory simply storing descriptions of what each option is for

                            ReflectUtil.setArrayField(object, results, field, fType);
                        } else {
                            reader.next();
                            Object o = fromXml(fRealType);
                            field.set(object, o);
                            reader.next();
                        }
                    }
                } else {
                    if (reader.isEndElement()) {
                        logger.trace("Reached the end of the element... return it");
                        return object;
                    }

                    logger.warn("We may have missed a property if we get here: {0}", reader.isCharacters() ? reader.getText() : "");
                    reader.next();
                }
            }

        } catch (RemoteException ex) {
            throw ex;
        } catch (Exception ex) {
            logger.error(ex, "Failed to build VIM object");
            throw new RemoteException("Failed to build VIM object", ex);
        }

        return null;
    }

    /**
     * Builds a ManagedObjectReference from the current element being processed
     *
     * @return
     * @throws XMLStreamException
     */
    private ManagedObjectReference getManagedObjectReference() throws XMLStreamException {
        String type = reader.getAttributeValue("", "type");
        String value = getText();
        return XmlGen.createMOR(type, value);
    }

    /**
     * Gets the text from the current element and skips past end element after the characters
     *
     * @return
     * @throws XMLStreamException
     */
    private String getText() throws XMLStreamException {
        // If a single getText() gets the entire text block up to the end element, then
        // we only use the String value. If we require a concatenation, then we create a
        // StringBuilder and use it for further results from getText().
        // This micro-optimization saves us from creating unnecessary StringBuilders in
        // the majority case where getText() returns the entire text block.

        String value = null;
        StringBuilder valueBuilder = null;

        while (reader.hasNext()) {
            reader.next();
            if (reader.isCharacters()) {
                if (value == null) {
                    value = reader.getText();
                } else {
                    if (valueBuilder == null) {
                        valueBuilder = new StringBuilder(value);
                    }
                    valueBuilder.append(reader.getText());
                }
            } else if (reader.isEndElement()) {
                reader.next();
                break;
            }
        }

        if (valueBuilder != null) {
            value = valueBuilder.toString();
        }

        return value;
    }
}
