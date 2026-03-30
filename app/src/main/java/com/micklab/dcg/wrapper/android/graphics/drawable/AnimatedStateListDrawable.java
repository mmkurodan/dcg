// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimatedStateListDrawable {
    private final android.graphics.drawable.AnimatedStateListDrawable real;

    public AnimatedStateListDrawable(android.graphics.drawable.AnimatedStateListDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedStateListDrawable wrap(android.graphics.drawable.AnimatedStateListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedStateListDrawable(real);
    }

    public android.graphics.drawable.AnimatedStateListDrawable unwrap() {
        return real;
    }

    public AnimatedStateListDrawable() {
        this(new android.graphics.drawable.AnimatedStateListDrawable());
    }

    public void addState(int[] arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, int arg2) {
        real.addState(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public void jumpToCurrentState() {
        real.jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return real.setVisible(arg0, arg1);
    }

}
