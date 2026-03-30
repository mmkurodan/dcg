// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class Channel {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Channel(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.Channel wrap(android.se.omapi.Channel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.Channel(real, (__DcgwBridgeToken) null);
    }

    public android.se.omapi.Channel getReal() {
        return (android.se.omapi.Channel) real;
    }

    public android.se.omapi.Channel unwrap() {
        return getReal();
    }

    public void close() {
        ((android.se.omapi.Channel) real).close();
    }

    public byte[] getSelectResponse() {
        return ((android.se.omapi.Channel) real).getSelectResponse();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Session getSession() {
        return com.micklab.dcg.wrapper.android.se.omapi.Session.wrap(((android.se.omapi.Channel) real).getSession());
    }

    public boolean isBasicChannel() {
        return ((android.se.omapi.Channel) real).isBasicChannel();
    }

    public boolean isOpen() {
        return ((android.se.omapi.Channel) real).isOpen();
    }

    public boolean selectNext() throws java.io.IOException {
        return ((android.se.omapi.Channel) real).selectNext();
    }

    public byte[] transmit(byte[] arg0) throws java.io.IOException {
        return ((android.se.omapi.Channel) real).transmit(arg0);
    }

}
