// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class DrawFilter {
    private final android.graphics.DrawFilter real;

    public DrawFilter(android.graphics.DrawFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.DrawFilter wrap(android.graphics.DrawFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.DrawFilter(real);
    }

    public android.graphics.DrawFilter unwrap() {
        return real;
    }

    public DrawFilter() {
        this(new android.graphics.DrawFilter());
    }

}
