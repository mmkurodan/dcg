// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class RotateDrawable {
    private final android.graphics.drawable.RotateDrawable real;

    public RotateDrawable(android.graphics.drawable.RotateDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.RotateDrawable wrap(android.graphics.drawable.RotateDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.RotateDrawable(real);
    }

    public android.graphics.drawable.RotateDrawable unwrap() {
        return real;
    }

    public RotateDrawable() {
        this(new android.graphics.drawable.RotateDrawable());
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public float getFromDegrees() {
        return real.getFromDegrees();
    }

    public float getPivotX() {
        return real.getPivotX();
    }

    public float getPivotY() {
        return real.getPivotY();
    }

    public float getToDegrees() {
        return real.getToDegrees();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isPivotXRelative() {
        return real.isPivotXRelative();
    }

    public boolean isPivotYRelative() {
        return real.isPivotYRelative();
    }

    public void setFromDegrees(float arg0) {
        real.setFromDegrees(arg0);
    }

    public void setPivotX(float arg0) {
        real.setPivotX(arg0);
    }

    public void setPivotXRelative(boolean arg0) {
        real.setPivotXRelative(arg0);
    }

    public void setPivotY(float arg0) {
        real.setPivotY(arg0);
    }

    public void setPivotYRelative(boolean arg0) {
        real.setPivotYRelative(arg0);
    }

    public void setToDegrees(float arg0) {
        real.setToDegrees(arg0);
    }

}
