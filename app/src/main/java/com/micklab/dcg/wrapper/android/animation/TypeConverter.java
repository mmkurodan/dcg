// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TypeConverter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TypeConverter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TypeConverter wrap(android.animation.TypeConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TypeConverter(real, (__DcgwBridgeToken) null);
    }

    public android.animation.TypeConverter getReal() {
        return (android.animation.TypeConverter) real;
    }

    public android.animation.TypeConverter unwrap() {
        return getReal();
    }

    public java.lang.Object convert(java.lang.Object arg0) {
        return ((android.animation.TypeConverter) real).convert(arg0);
    }

}
