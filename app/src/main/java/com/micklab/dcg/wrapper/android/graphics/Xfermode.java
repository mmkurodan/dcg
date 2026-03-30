// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Xfermode {
    private final android.graphics.Xfermode real;

    public Xfermode(android.graphics.Xfermode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Xfermode wrap(android.graphics.Xfermode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Xfermode(real);
    }

    public android.graphics.Xfermode unwrap() {
        return real;
    }

    public Xfermode() {
        this(new android.graphics.Xfermode());
    }

}
