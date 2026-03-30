// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class Session {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Session(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.Session wrap(android.se.omapi.Session real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.Session(real, (__DcgwBridgeToken) null);
    }

    public android.se.omapi.Session getReal() {
        return (android.se.omapi.Session) real;
    }

    public android.se.omapi.Session unwrap() {
        return getReal();
    }

    public void close() {
        ((android.se.omapi.Session) real).close();
    }

    public void closeChannels() {
        ((android.se.omapi.Session) real).closeChannels();
    }

    public byte[] getATR() {
        return ((android.se.omapi.Session) real).getATR();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Reader getReader() {
        return com.micklab.dcg.wrapper.android.se.omapi.Reader.wrap(((android.se.omapi.Session) real).getReader());
    }

    public boolean isClosed() {
        return ((android.se.omapi.Session) real).isClosed();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openBasicChannel(byte[] arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(((android.se.omapi.Session) real).openBasicChannel(arg0));
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openBasicChannel(byte[] arg0, byte arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(((android.se.omapi.Session) real).openBasicChannel(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openLogicalChannel(byte[] arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(((android.se.omapi.Session) real).openLogicalChannel(arg0));
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openLogicalChannel(byte[] arg0, byte arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(((android.se.omapi.Session) real).openLogicalChannel(arg0, arg1));
    }

}
