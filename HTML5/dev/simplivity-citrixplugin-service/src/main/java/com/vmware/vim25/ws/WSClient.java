/*================================================================================
Copyright (c) 2013 Steve Jin, All Rights Reserved.
Copyright (c) 2009 VMware, Inc. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice,
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice,
this list of conditions and the following disclaimer in the documentation
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25.ws;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.rmi.RemoteException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Set;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.google.common.collect.Sets;
import com.nimblestorage.hi.utils.Logger;

/**
 * The Web Service Engine
 * @author Steve Jin (sjin@vmware.com)
*/

final public class WSClient
{
    private static final Logger logger = Logger.getLogger(WSClient.class);

  private final static String SOAP_ACTION_HEADER = "SOAPAction";
  private final static String SOAP_ACTION_V40 = "urn:vim25/4.0";
  private final static String SOAP_ACTION_V41 = "urn:vim25/4.1";
  private final static String SOAP_ACTION_V50 = "urn:vim25/5.0";
  private final static String SOAP_ACTION_V51 = "urn:vim25/5.1";
  private final static String SOAP_ACTION_V55 = "urn:vim25/5.5";
  private final static String SOAP_ACTION_V60 = "urn:vim25/6.0";
  private final static String SOAP_ACTION_V65 = "urn:vim25/6.5";

  public final static String SMS_SOAP_ACTION_V50 = "urn:sms/5.0";
  public final static String SMS_SOAP_ACTION_V65 = "urn:sms/6.5";

  public final static String PBM_SOAP_ACTION = "urn:pbm";

  public final static String SMS_NAMESPACE = " xmlns:urn=\"urn:sms/2.0\">";
  public final static String PBM_NAMESPACE = " xmlns=\"urn:pbm\" xmlns:pbm=\"urn:pbm\">";

  private URL baseUrl = null;
  private String cookie = null;
  private String vimNameSpace = null;
  private String soapAction = null;
  private int connectTimeout = 0;
  private int readTimeout = 0;

  private Set<Integer> invalidResponseCodes = Sets.newHashSet(HttpURLConnection.HTTP_UNAVAILABLE);

  public WSClient(String serverUrl) throws MalformedURLException
  {
    this(serverUrl, true);
  }

  public WSClient(String serverUrl, boolean ignoreCert) throws MalformedURLException
  {
    if(serverUrl.endsWith("/"))
    {
      serverUrl = serverUrl.substring(0, serverUrl.length()-1);
    }
    this.baseUrl = new URL(serverUrl);
    if(ignoreCert)
    {
      try
      {
        trustAllHttpsCertificates();
        HttpsURLConnection.setDefaultHostnameVerifier
        (
          new HostnameVerifier()
          {
            @Override
            public boolean verify(String urlHostName, SSLSession session)
            {
              return true;
            }
          }
        );
      } catch (Exception e)  {}
    }
  }

  public Object invoke(String methodName, Argument[] paras, String returnType) throws RemoteException
  {
    return invoke(methodName, paras, returnType, null);
  }

  public Object invoke(String methodName, Argument[] paras, String returnType, String nameSpace) throws RemoteException
  {
    String soapMsg = getSoapMessage(methodName, paras, returnType, nameSpace);
    logger.trace("VI SOAP request: {0}", soapMsg);

    return invoke(soapMsg, returnType);
  }

  private Object invoke(String soapMsg, String returnType) throws RemoteException {
      InputStream is = null;
      try
      {
        is = post(soapMsg);

        if (logger.isTraceEnabled()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
            logger.trace("VI SOAP response: {0}", out.toString());

            is = new ByteArrayInputStream(out.toString().getBytes());
        }

        return new XmlGenStreaming().fromXML(returnType, is);
      }
      catch (RemoteException ex) {
          throw ex;
      }
      catch (Exception e1)
      {
        throw new RemoteException("VI SDK invoke exception: " + e1, e1);
      }
      finally
      {
        if(is!=null)
          try { is.close(); } catch(IOException ioe) {}
      }
  }

  private String getSoapMessage(String methodName, Argument[] paras, String returnType, String nameSpace) {
      if (nameSpace != null) {
          return XmlGen.toCookieXml(methodName, paras, nameSpace, cookie);
      } else {
          return XmlGen.toXML(methodName, paras, vimNameSpace);
      }
  }

  public InputStream post(String soapMsg) throws IOException
  {
    HttpURLConnection postCon = (HttpURLConnection) baseUrl.openConnection();

    if(connectTimeout > 0)
      postCon.setConnectTimeout(connectTimeout);
    if(readTimeout > 0)
      postCon.setReadTimeout(readTimeout);

    try {
        postCon.setRequestMethod("POST");
    } catch (ProtocolException e)
    {
        logger.error(e, "Error while setting request method on HttpURLConnection");
    }
    postCon.setDoOutput(true);
    postCon.setDoInput(true);
    postCon.setRequestProperty(SOAP_ACTION_HEADER, soapAction);
    postCon.setRequestProperty("Content-Type", "text/xml; charset=utf-8");

    if(cookie!=null)
    {
      postCon.setRequestProperty("Cookie", cookie);
    }

    OutputStream os = postCon.getOutputStream();
    OutputStreamWriter out = new OutputStreamWriter(os, Charset.forName("UTF-8"));

    out.write(soapMsg);
    out.close();

    InputStream is;

    try
    {
    	is = postCon.getInputStream();
    }
    catch(IOException ioe)
    {
        if (ioe instanceof SocketTimeoutException) {
            throw ioe;
        }

        if (ioe instanceof FileNotFoundException) {
            throw ioe;
        }

        // VMware returns a 500 (Internal Server Error) when the error stream contains a valid fault response.
        // We need to process that.  However, we need to throw invalid response codes as Exceptions here because
        // the error stream for those cannot be processed by the response parser.
        if (invalidResponseCodes.contains(postCon.getResponseCode())) {
            throw ioe;
        }

    	is = postCon.getErrorStream();
    }

    if(cookie==null)
    {
      cookie = postCon.getHeaderField("Set-Cookie");
    }

    return is;
  }

  public URL getBaseUrl()
  {
    return this.baseUrl;
  }

  public void setBaseUrl(URL baseUrl)
  {
    this.baseUrl = baseUrl;
  }

  public String getCookie()
  {
    return cookie;
  }

  public void setCookie(String cookie)
  {
    this.cookie = cookie;
  }

  public String getVimNameSpace()
  {
    return vimNameSpace;
  }

  public void setVimNameSpace(String vimNameSpace)
  {
    this.vimNameSpace = vimNameSpace;
  }

  public void setConnectTimeout(int timeoutMilliSec)
  {
    this.connectTimeout = timeoutMilliSec;
  }

  public int getConnectTimeout()
  {
    return this.connectTimeout;
  }

  public void setReadTimeout(int timeoutMilliSec)
  {
    this.readTimeout = timeoutMilliSec;
  }

  public int getReadTimeout()
  {
    return this.readTimeout;
  }

/*===============================================
   * API versions *
  "2.0.0"     VI 3.0
  "2.5.0"     VI 3.5 (and u1)
  "2.5u2"     VI 3.5u2 (and u3, u4)
  "4.0"       vSphere 4.0 (and u1)
  "4.1"       vSphere 4.1
  "5.0"       vSphere 5.0
  "5.1"       vSphere 5.1
  "5.5"       vSphere 5.5
  "6.0"       vSphere 6.0
  "6.5"       vSphere 6.5
  ===============================================*/
  public void setSoapActionOnApiVersion(String apiVersion)
  {
    if("4.0".equals(apiVersion))
    {
      soapAction = SOAP_ACTION_V40;
    }
    else if("4.1".equals(apiVersion))
    {
      soapAction = SOAP_ACTION_V41;
    }
    else if("5.0".equals(apiVersion))
    {
      soapAction = SOAP_ACTION_V50;
    }
    else if("5.1".equals(apiVersion))
    {
      soapAction = SOAP_ACTION_V51;
    }
    else if("5.5".equals(apiVersion))
    {
      soapAction = SOAP_ACTION_V55;
    }
    else if("6.0".equals(apiVersion)) {
        soapAction = SOAP_ACTION_V60;
    }
    else
    {   //always defaults to latest version
        soapAction = SOAP_ACTION_V65;
    }
  }

  public void setSoapAction(String soapAction) {
      this.soapAction = soapAction;
  }

  private static void trustAllHttpsCertificates()
    throws NoSuchAlgorithmException, KeyManagementException
  {
    TrustManager[] trustAllCerts = new TrustManager[1];
    trustAllCerts[0] = new TrustAllManager();
    SSLContext sc = SSLContext.getInstance("TLSv1.2");
    sc.init(null, trustAllCerts, null);
    HttpsURLConnection.setDefaultSSLSocketFactory(
        sc.getSocketFactory());
  }

  private static class TrustAllManager implements X509TrustManager
  {
    @Override
    public X509Certificate[] getAcceptedIssuers()
    {
      return null;
    }
    @Override
    public void checkServerTrusted(X509Certificate[] certs,
        String authType)
      throws CertificateException
    {
    }
    @Override
    public void checkClientTrusted(X509Certificate[] certs,
        String authType)
    throws CertificateException
    {
    }
  }
}
