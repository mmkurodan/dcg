// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class Session {
    private final android.se.omapi.Session real;

    public Session(android.se.omapi.Session real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.Session wrap(android.se.omapi.Session real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.Session(real);
    }

    public android.se.omapi.Session unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public void closeChannels() {
        real.closeChannels();
    }

    public byte[] getATR() {
        return real.getATR();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Reader getReader() {
        return com.micklab.dcg.wrapper.android.se.omapi.Reader.wrap(real.getReader());
    }

    public boolean isClosed() {
        return real.isClosed();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openBasicChannel(byte[] arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(real.openBasicChannel(arg0));
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openBasicChannel(byte[] arg0, byte arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(real.openBasicChannel(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openLogicalChannel(byte[] arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(real.openLogicalChannel(arg0));
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Channel openLogicalChannel(byte[] arg0, byte arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.se.omapi.Channel.wrap(real.openLogicalChannel(arg0, arg1));
    }

}
