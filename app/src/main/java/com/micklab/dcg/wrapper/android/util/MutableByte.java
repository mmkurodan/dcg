// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableByte {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableByte(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableByte wrap(android.util.MutableByte real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableByte(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableByte getReal() {
        return (android.util.MutableByte) real;
    }

    public android.util.MutableByte unwrap() {
        return getReal();
    }

    public MutableByte(byte arg0) {
        this(new android.util.MutableByte(arg0), (__DcgwBridgeToken) null);
    }


}
