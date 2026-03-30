// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class IntProperty {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntProperty(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.IntProperty wrap(android.util.IntProperty real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.IntProperty(real, (__DcgwBridgeToken) null);
    }

    public android.util.IntProperty getReal() {
        return (android.util.IntProperty) real;
    }

    public android.util.IntProperty unwrap() {
        return getReal();
    }

    public void set(java.lang.Object arg0, java.lang.Integer arg1) {
        ((android.util.IntProperty) real).set(arg0, arg1);
    }

    public void setValue(java.lang.Object arg0, int arg1) {
        ((android.util.IntProperty) real).setValue(arg0, arg1);
    }

}
