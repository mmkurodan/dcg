// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class MaskFilter {
    private final android.graphics.MaskFilter real;

    public MaskFilter(android.graphics.MaskFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.MaskFilter wrap(android.graphics.MaskFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MaskFilter(real);
    }

    public android.graphics.MaskFilter unwrap() {
        return real;
    }

    public MaskFilter() {
        this(new android.graphics.MaskFilter());
    }

}
