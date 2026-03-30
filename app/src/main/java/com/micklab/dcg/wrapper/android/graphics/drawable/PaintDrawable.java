// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class PaintDrawable {
    private final android.graphics.drawable.PaintDrawable real;

    public PaintDrawable(android.graphics.drawable.PaintDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.PaintDrawable wrap(android.graphics.drawable.PaintDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.PaintDrawable(real);
    }

    public android.graphics.drawable.PaintDrawable unwrap() {
        return real;
    }

    public PaintDrawable() {
        this(new android.graphics.drawable.PaintDrawable());
    }

    public PaintDrawable(int arg0) {
        this(new android.graphics.drawable.PaintDrawable(arg0));
    }

    public void setCornerRadii(float[] arg0) {
        real.setCornerRadii(arg0);
    }

    public void setCornerRadius(float arg0) {
        real.setCornerRadius(arg0);
    }

}
