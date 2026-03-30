// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PorterDuffXfermode {
    private final android.graphics.PorterDuffXfermode real;

    public PorterDuffXfermode(android.graphics.PorterDuffXfermode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PorterDuffXfermode wrap(android.graphics.PorterDuffXfermode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PorterDuffXfermode(real);
    }

    public android.graphics.PorterDuffXfermode unwrap() {
        return real;
    }

    public PorterDuffXfermode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        this(new android.graphics.PorterDuffXfermode(arg0 == null ? null : arg0.unwrap()));
    }

}
