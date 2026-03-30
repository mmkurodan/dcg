// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class FloatProperty {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FloatProperty(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.FloatProperty wrap(android.util.FloatProperty real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.FloatProperty(real, (__DcgwBridgeToken) null);
    }

    public android.util.FloatProperty getReal() {
        return (android.util.FloatProperty) real;
    }

    public android.util.FloatProperty unwrap() {
        return getReal();
    }

    public void set(java.lang.Object arg0, java.lang.Float arg1) {
        ((android.util.FloatProperty) real).set(arg0, arg1);
    }

    public void setValue(java.lang.Object arg0, float arg1) {
        ((android.util.FloatProperty) real).setValue(arg0, arg1);
    }

}
