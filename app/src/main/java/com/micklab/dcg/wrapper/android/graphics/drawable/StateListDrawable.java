// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class StateListDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StateListDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.StateListDrawable wrap(android.graphics.drawable.StateListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.StateListDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.StateListDrawable getReal() {
        return (android.graphics.drawable.StateListDrawable) real;
    }

    public android.graphics.drawable.StateListDrawable unwrap() {
        return getReal();
    }

    public StateListDrawable() {
        this(new android.graphics.drawable.StateListDrawable(), (__DcgwBridgeToken) null);
    }

    public void addState(int[] arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        ((android.graphics.drawable.StateListDrawable) real).addState(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.StateListDrawable) real).applyTheme(arg0);
    }

    public int findStateDrawableIndex(int[] arg0) {
        return ((android.graphics.drawable.StateListDrawable) real).findStateDrawableIndex(arg0);
    }

    public int getStateCount() {
        return ((android.graphics.drawable.StateListDrawable) real).getStateCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getStateDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.StateListDrawable) real).getStateDrawable(arg0));
    }

    public int[] getStateSet(int arg0) {
        return ((android.graphics.drawable.StateListDrawable) real).getStateSet(arg0);
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.StateListDrawable) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.StateListDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.StateListDrawable) real).isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.StateListDrawable) real).mutate());
    }

}
