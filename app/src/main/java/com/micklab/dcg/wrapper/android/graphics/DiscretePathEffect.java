// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class DiscretePathEffect {
    private final android.graphics.DiscretePathEffect real;

    public DiscretePathEffect(android.graphics.DiscretePathEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.DiscretePathEffect wrap(android.graphics.DiscretePathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.DiscretePathEffect(real);
    }

    public android.graphics.DiscretePathEffect unwrap() {
        return real;
    }

    public DiscretePathEffect(float arg0, float arg1) {
        this(new android.graphics.DiscretePathEffect(arg0, arg1));
    }

}
