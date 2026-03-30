// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class InsetDrawable {
    private final android.graphics.drawable.InsetDrawable real;

    public InsetDrawable(android.graphics.drawable.InsetDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.InsetDrawable wrap(android.graphics.drawable.InsetDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.InsetDrawable(real);
    }

    public android.graphics.drawable.InsetDrawable unwrap() {
        return real;
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, float arg1) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, float arg1, float arg2, float arg3, float arg4) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getPadding(arg0 == null ? null : arg0.unwrap());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

}
