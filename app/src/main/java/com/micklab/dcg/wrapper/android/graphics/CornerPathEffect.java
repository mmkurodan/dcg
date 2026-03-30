// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class CornerPathEffect {
    private final android.graphics.CornerPathEffect real;

    public CornerPathEffect(android.graphics.CornerPathEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.CornerPathEffect wrap(android.graphics.CornerPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.CornerPathEffect(real);
    }

    public android.graphics.CornerPathEffect unwrap() {
        return real;
    }

    public CornerPathEffect(float arg0) {
        this(new android.graphics.CornerPathEffect(arg0));
    }

}
