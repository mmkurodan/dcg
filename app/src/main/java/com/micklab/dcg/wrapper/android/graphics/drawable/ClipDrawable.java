// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class ClipDrawable {
    private final android.graphics.drawable.ClipDrawable real;

    public ClipDrawable(android.graphics.drawable.ClipDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.ClipDrawable wrap(android.graphics.drawable.ClipDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ClipDrawable(real);
    }

    public android.graphics.drawable.ClipDrawable unwrap() {
        return real;
    }

    public ClipDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1, int arg2) {
        this(new android.graphics.drawable.ClipDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public static final int HORIZONTAL = android.graphics.drawable.ClipDrawable.HORIZONTAL;
    public static final int VERTICAL = android.graphics.drawable.ClipDrawable.VERTICAL;

}
