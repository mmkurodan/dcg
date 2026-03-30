// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class SumPathEffect {
    private final android.graphics.SumPathEffect real;

    public SumPathEffect(android.graphics.SumPathEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.SumPathEffect wrap(android.graphics.SumPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SumPathEffect(real);
    }

    public android.graphics.SumPathEffect unwrap() {
        return real;
    }

    public SumPathEffect(com.micklab.dcg.wrapper.android.graphics.PathEffect arg0, com.micklab.dcg.wrapper.android.graphics.PathEffect arg1) {
        this(new android.graphics.SumPathEffect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

}
