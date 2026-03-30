// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TypeConverter {
    private final android.animation.TypeConverter real;

    public TypeConverter(android.animation.TypeConverter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TypeConverter wrap(android.animation.TypeConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TypeConverter(real);
    }

    public android.animation.TypeConverter unwrap() {
        return real;
    }

    public java.lang.Object convert(java.lang.Object arg0) {
        return real.convert(arg0);
    }

}
