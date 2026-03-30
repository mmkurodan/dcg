// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class DashPathEffect {
    private final android.graphics.DashPathEffect real;

    public DashPathEffect(android.graphics.DashPathEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.DashPathEffect wrap(android.graphics.DashPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.DashPathEffect(real);
    }

    public android.graphics.DashPathEffect unwrap() {
        return real;
    }

    public DashPathEffect(float[] arg0, float arg1) {
        this(new android.graphics.DashPathEffect(arg0, arg1));
    }

}
