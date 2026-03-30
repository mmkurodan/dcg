// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ServiceStartNotAllowedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceStartNotAllowedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ServiceStartNotAllowedException wrap(android.app.ServiceStartNotAllowedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ServiceStartNotAllowedException(real, (__DcgwBridgeToken) null);
    }

    public android.app.ServiceStartNotAllowedException getReal() {
        return (android.app.ServiceStartNotAllowedException) real;
    }

    public android.app.ServiceStartNotAllowedException unwrap() {
        return getReal();
    }

    public java.lang.Throwable getCause() {
        return ((android.app.ServiceStartNotAllowedException) real).getCause();
    }

}
