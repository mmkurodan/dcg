// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class IntProperty {
    private final android.util.IntProperty real;

    public IntProperty(android.util.IntProperty real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.IntProperty wrap(android.util.IntProperty real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.IntProperty(real);
    }

    public android.util.IntProperty unwrap() {
        return real;
    }

    public void set(java.lang.Object arg0, java.lang.Integer arg1) {
        real.set(arg0, arg1);
    }

    public void setValue(java.lang.Object arg0, int arg1) {
        real.setValue(arg0, arg1);
    }

}
