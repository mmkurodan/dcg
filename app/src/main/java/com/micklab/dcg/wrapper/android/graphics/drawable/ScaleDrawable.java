// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class ScaleDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScaleDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.ScaleDrawable wrap(android.graphics.drawable.ScaleDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ScaleDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.ScaleDrawable getReal() {
        return (android.graphics.drawable.ScaleDrawable) real;
    }

    public android.graphics.drawable.ScaleDrawable unwrap() {
        return getReal();
    }

    public ScaleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1, float arg2, float arg3) {
        this(new android.graphics.drawable.ScaleDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.ScaleDrawable) real).applyTheme(arg0);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.ScaleDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getOpacity() {
        return ((android.graphics.drawable.ScaleDrawable) real).getOpacity();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.ScaleDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

}
