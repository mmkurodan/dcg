// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class InsetDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InsetDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.InsetDrawable wrap(android.graphics.drawable.InsetDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.InsetDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.InsetDrawable getReal() {
        return (android.graphics.drawable.InsetDrawable) real;
    }

    public android.graphics.drawable.InsetDrawable unwrap() {
        return getReal();
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, float arg1) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, float arg1, float arg2, float arg3, float arg4) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public InsetDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.graphics.drawable.InsetDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.InsetDrawable) real).applyTheme(arg0);
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.InsetDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.InsetDrawable) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.InsetDrawable) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.graphics.drawable.InsetDrawable) real).getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.InsetDrawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.drawable.InsetDrawable) real).getPadding(arg0 == null ? null : arg0.getReal());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.InsetDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

}
