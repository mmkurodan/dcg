// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableBoolean {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableBoolean(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableBoolean wrap(android.util.MutableBoolean real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableBoolean(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableBoolean getReal() {
        return (android.util.MutableBoolean) real;
    }

    public android.util.MutableBoolean unwrap() {
        return getReal();
    }

    public MutableBoolean(boolean arg0) {
        this(new android.util.MutableBoolean(arg0), (__DcgwBridgeToken) null);
    }


}
