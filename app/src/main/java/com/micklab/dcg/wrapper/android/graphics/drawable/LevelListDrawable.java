// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class LevelListDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LevelListDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.LevelListDrawable wrap(android.graphics.drawable.LevelListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.LevelListDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.LevelListDrawable getReal() {
        return (android.graphics.drawable.LevelListDrawable) real;
    }

    public android.graphics.drawable.LevelListDrawable unwrap() {
        return getReal();
    }

    public LevelListDrawable() {
        this(new android.graphics.drawable.LevelListDrawable(), (__DcgwBridgeToken) null);
    }

    public void addLevel(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2) {
        ((android.graphics.drawable.LevelListDrawable) real).addLevel(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.LevelListDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.LevelListDrawable) real).mutate());
    }

}
