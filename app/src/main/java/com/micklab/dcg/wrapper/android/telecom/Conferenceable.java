// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class Conferenceable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Conferenceable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.Conferenceable wrap(android.telecom.Conferenceable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.Conferenceable(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.Conferenceable getReal() {
        return (android.telecom.Conferenceable) real;
    }

    public android.telecom.Conferenceable unwrap() {
        return getReal();
    }

}
