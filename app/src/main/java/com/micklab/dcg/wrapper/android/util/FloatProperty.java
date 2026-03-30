// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class FloatProperty {
    private final android.util.FloatProperty real;

    public FloatProperty(android.util.FloatProperty real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.FloatProperty wrap(android.util.FloatProperty real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.FloatProperty(real);
    }

    public android.util.FloatProperty unwrap() {
        return real;
    }

    public void set(java.lang.Object arg0, java.lang.Float arg1) {
        real.set(arg0, arg1);
    }

    public void setValue(java.lang.Object arg0, float arg1) {
        real.setValue(arg0, arg1);
    }

}
