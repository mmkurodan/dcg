// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ComposePathEffect {
    private final android.graphics.ComposePathEffect real;

    public ComposePathEffect(android.graphics.ComposePathEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ComposePathEffect wrap(android.graphics.ComposePathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ComposePathEffect(real);
    }

    public android.graphics.ComposePathEffect unwrap() {
        return real;
    }

    public ComposePathEffect(com.micklab.dcg.wrapper.android.graphics.PathEffect arg0, com.micklab.dcg.wrapper.android.graphics.PathEffect arg1) {
        this(new android.graphics.ComposePathEffect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

}
