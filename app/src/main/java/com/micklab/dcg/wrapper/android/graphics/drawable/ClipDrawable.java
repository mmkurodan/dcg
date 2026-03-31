// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class ClipDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClipDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.ClipDrawable wrap(android.graphics.drawable.ClipDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ClipDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.ClipDrawable getReal() {
        return (android.graphics.drawable.ClipDrawable) real;
    }

    public android.graphics.drawable.ClipDrawable unwrap() {
        return getReal();
    }

    public ClipDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1, int arg2) {
        this(new android.graphics.drawable.ClipDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public void applyTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.ClipDrawable) real).applyTheme(arg0 == null ? null : arg0.getReal());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.ClipDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getOpacity() {
        return ((android.graphics.drawable.ClipDrawable) real).getOpacity();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.ClipDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public static final int HORIZONTAL = android.graphics.drawable.ClipDrawable.HORIZONTAL;
    public static final int VERTICAL = android.graphics.drawable.ClipDrawable.VERTICAL;

}
