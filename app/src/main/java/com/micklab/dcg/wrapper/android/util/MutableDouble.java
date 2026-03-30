// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableDouble {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MutableDouble(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableDouble wrap(android.util.MutableDouble real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableDouble(real, (__DcgwBridgeToken) null);
    }

    public android.util.MutableDouble getReal() {
        return (android.util.MutableDouble) real;
    }

    public android.util.MutableDouble unwrap() {
        return getReal();
    }

    public MutableDouble(double arg0) {
        this(new android.util.MutableDouble(arg0), (__DcgwBridgeToken) null);
    }


}
