// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class Reader {
    private final android.se.omapi.Reader real;

    public Reader(android.se.omapi.Reader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.Reader wrap(android.se.omapi.Reader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.Reader(real);
    }

    public android.se.omapi.Reader unwrap() {
        return real;
    }

    public void closeSessions() {
        real.closeSessions();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.SEService getSEService() {
        return com.micklab.dcg.wrapper.android.se.omapi.SEService.wrap(real.getSEService());
    }

    public boolean isSecureElementPresent() {
        return real.isSecureElementPresent();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Session openSession() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Session.wrap(real.openSession());
    }

}
