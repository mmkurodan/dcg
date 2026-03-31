// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimatedStateListDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnimatedStateListDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedStateListDrawable wrap(android.graphics.drawable.AnimatedStateListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedStateListDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.AnimatedStateListDrawable getReal() {
        return (android.graphics.drawable.AnimatedStateListDrawable) real;
    }

    public android.graphics.drawable.AnimatedStateListDrawable unwrap() {
        return getReal();
    }

    public AnimatedStateListDrawable() {
        this(new android.graphics.drawable.AnimatedStateListDrawable(), (__DcgwBridgeToken) null);
    }

    public void addState(int[] arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, int arg2) {
        ((android.graphics.drawable.AnimatedStateListDrawable) real).addState(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void applyTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.AnimatedStateListDrawable) real).applyTheme(arg0 == null ? null : arg0.getReal());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.AnimatedStateListDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.AnimatedStateListDrawable) real).isStateful();
    }

    public void jumpToCurrentState() {
        ((android.graphics.drawable.AnimatedStateListDrawable) real).jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.AnimatedStateListDrawable) real).mutate());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return ((android.graphics.drawable.AnimatedStateListDrawable) real).setVisible(arg0, arg1);
    }

}
