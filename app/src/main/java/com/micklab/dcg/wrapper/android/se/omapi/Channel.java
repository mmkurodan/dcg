// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.se.omapi;

public final class Channel {
    private final android.se.omapi.Channel real;

    public Channel(android.se.omapi.Channel real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.se.omapi.Channel wrap(android.se.omapi.Channel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.se.omapi.Channel(real);
    }

    public android.se.omapi.Channel unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public byte[] getSelectResponse() {
        return real.getSelectResponse();
    }

    public com.micklab.dcg.wrapper.android.se.omapi.Session getSession() {
        return com.micklab.dcg.wrapper.android.se.omapi.Session.wrap(real.getSession());
    }

    public boolean isBasicChannel() {
        return real.isBasicChannel();
    }

    public boolean isOpen() {
        return real.isOpen();
    }

    public boolean selectNext() throws java.io.IOException {
        return real.selectNext();
    }

    public byte[] transmit(byte[] arg0) throws java.io.IOException {
        return real.transmit(arg0);
    }

}
