// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ColorFilter {
    private final android.graphics.ColorFilter real;

    public ColorFilter(android.graphics.ColorFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorFilter wrap(android.graphics.ColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorFilter(real);
    }

    public android.graphics.ColorFilter unwrap() {
        return real;
    }

    public ColorFilter() {
        this(new android.graphics.ColorFilter());
    }

}
