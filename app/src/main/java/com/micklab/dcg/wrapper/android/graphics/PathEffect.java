// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathEffect {
    private final android.graphics.PathEffect real;

    public PathEffect(android.graphics.PathEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathEffect wrap(android.graphics.PathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathEffect(real);
    }

    public android.graphics.PathEffect unwrap() {
        return real;
    }

    public PathEffect() {
        this(new android.graphics.PathEffect());
    }

}
