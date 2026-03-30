// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableChar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableChar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableChar wrap(android.util.MutableChar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableChar(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableChar getReal() {
        return (android.util.MutableChar) real;
    }

    public android.util.MutableChar unwrap() {
        return getReal();
    }

    public MutableChar(char arg0) {
        this(new android.util.MutableChar(arg0), (__DcgwBridgeToken) null);
    }


}
