// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class StateListDrawable {
    private final android.graphics.drawable.StateListDrawable real;

    public StateListDrawable(android.graphics.drawable.StateListDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.StateListDrawable wrap(android.graphics.drawable.StateListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.StateListDrawable(real);
    }

    public android.graphics.drawable.StateListDrawable unwrap() {
        return real;
    }

    public StateListDrawable() {
        this(new android.graphics.drawable.StateListDrawable());
    }

    public void addState(int[] arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        real.addState(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public int findStateDrawableIndex(int[] arg0) {
        return real.findStateDrawableIndex(arg0);
    }

    public int getStateCount() {
        return real.getStateCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getStateDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getStateDrawable(arg0));
    }

    public int[] getStateSet(int arg0) {
        return real.getStateSet(arg0);
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

}
