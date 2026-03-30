// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class RotateDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RotateDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.RotateDrawable wrap(android.graphics.drawable.RotateDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.RotateDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.RotateDrawable getReal() {
        return (android.graphics.drawable.RotateDrawable) real;
    }

    public android.graphics.drawable.RotateDrawable unwrap() {
        return getReal();
    }

    public RotateDrawable() {
        this(new android.graphics.drawable.RotateDrawable(), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.RotateDrawable) real).applyTheme(arg0);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.RotateDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public float getFromDegrees() {
        return ((android.graphics.drawable.RotateDrawable) real).getFromDegrees();
    }

    public float getPivotX() {
        return ((android.graphics.drawable.RotateDrawable) real).getPivotX();
    }

    public float getPivotY() {
        return ((android.graphics.drawable.RotateDrawable) real).getPivotY();
    }

    public float getToDegrees() {
        return ((android.graphics.drawable.RotateDrawable) real).getToDegrees();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.RotateDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isPivotXRelative() {
        return ((android.graphics.drawable.RotateDrawable) real).isPivotXRelative();
    }

    public boolean isPivotYRelative() {
        return ((android.graphics.drawable.RotateDrawable) real).isPivotYRelative();
    }

    public void setFromDegrees(float arg0) {
        ((android.graphics.drawable.RotateDrawable) real).setFromDegrees(arg0);
    }

    public void setPivotX(float arg0) {
        ((android.graphics.drawable.RotateDrawable) real).setPivotX(arg0);
    }

    public void setPivotXRelative(boolean arg0) {
        ((android.graphics.drawable.RotateDrawable) real).setPivotXRelative(arg0);
    }

    public void setPivotY(float arg0) {
        ((android.graphics.drawable.RotateDrawable) real).setPivotY(arg0);
    }

    public void setPivotYRelative(boolean arg0) {
        ((android.graphics.drawable.RotateDrawable) real).setPivotYRelative(arg0);
    }

    public void setToDegrees(float arg0) {
        ((android.graphics.drawable.RotateDrawable) real).setToDegrees(arg0);
    }

}
