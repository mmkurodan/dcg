// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class Reader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Reader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.Reader wrap(android.se.omapi.Reader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.Reader(real, (__DcgwBridgeToken) null);
    }

    public android.se.omapi.Reader getReal() {
        return (android.se.omapi.Reader) real;
    }

    public android.se.omapi.Reader unwrap() {
        return getReal();
    }

    public void closeSessions() {
        ((android.se.omapi.Reader) real).closeSessions();
    }

    public java.lang.String getName() {
        return ((android.se.omapi.Reader) real).getName();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.SEService getSEService() {
        return com.micklab.dcg.wrapper.android.se.omapi.SEService.wrap(((android.se.omapi.Reader) real).getSEService());
    }

    public boolean isSecureElementPresent() {
        return ((android.se.omapi.Reader) real).isSecureElementPresent();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Session openSession() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Session.wrap(((android.se.omapi.Reader) real).openSession());
    }

}
