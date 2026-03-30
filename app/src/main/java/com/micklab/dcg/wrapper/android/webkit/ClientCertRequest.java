// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ClientCertRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClientCertRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ClientCertRequest wrap(android.webkit.ClientCertRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ClientCertRequest(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.ClientCertRequest getReal() {
        return (android.webkit.ClientCertRequest) real;
    }

    public android.webkit.ClientCertRequest unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.webkit.ClientCertRequest) real).cancel();
    }

    public java.lang.String getHost() {
        return ((android.webkit.ClientCertRequest) real).getHost();
    }

    public java.lang.String[] getKeyTypes() {
        return ((android.webkit.ClientCertRequest) real).getKeyTypes();
    }

    public int getPort() {
        return ((android.webkit.ClientCertRequest) real).getPort();
    }

    public java.security.Principal[] getPrincipals() {
        return ((android.webkit.ClientCertRequest) real).getPrincipals();
    }

    public void ignore() {
        ((android.webkit.ClientCertRequest) real).ignore();
    }

    public void proceed(java.security.PrivateKey arg0, java.security.cert.X509Certificate[] arg1) {
        ((android.webkit.ClientCertRequest) real).proceed(arg0, arg1);
    }

}
