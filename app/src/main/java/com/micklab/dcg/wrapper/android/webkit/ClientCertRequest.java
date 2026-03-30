// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ClientCertRequest {
    private final android.webkit.ClientCertRequest real;

    public ClientCertRequest(android.webkit.ClientCertRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ClientCertRequest wrap(android.webkit.ClientCertRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ClientCertRequest(real);
    }

    public android.webkit.ClientCertRequest unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public java.lang.String getHost() {
        return real.getHost();
    }

    public java.lang.String[] getKeyTypes() {
        return real.getKeyTypes();
    }

    public int getPort() {
        return real.getPort();
    }

    public java.security.Principal[] getPrincipals() {
        return real.getPrincipals();
    }

    public void ignore() {
        real.ignore();
    }

    public void proceed(java.security.PrivateKey arg0, java.security.cert.X509Certificate[] arg1) {
        real.proceed(arg0, arg1);
    }

}
