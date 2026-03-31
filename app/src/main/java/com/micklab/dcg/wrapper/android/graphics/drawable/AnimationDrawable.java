// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimationDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnimationDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimationDrawable wrap(android.graphics.drawable.AnimationDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimationDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.AnimationDrawable getReal() {
        return (android.graphics.drawable.AnimationDrawable) real;
    }

    public android.graphics.drawable.AnimationDrawable unwrap() {
        return getReal();
    }

    public AnimationDrawable() {
        this(new android.graphics.drawable.AnimationDrawable(), (__DcgwBridgeToken) null);
    }

    public void addFrame(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1) {
        ((android.graphics.drawable.AnimationDrawable) real).addFrame(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int getDuration(int arg0) {
        return ((android.graphics.drawable.AnimationDrawable) real).getDuration(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getFrame(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.AnimationDrawable) real).getFrame(arg0));
    }

    public int getNumberOfFrames() {
        return ((android.graphics.drawable.AnimationDrawable) real).getNumberOfFrames();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.AnimationDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public boolean isOneShot() {
        return ((android.graphics.drawable.AnimationDrawable) real).isOneShot();
    }

    public boolean isRunning() {
        return ((android.graphics.drawable.AnimationDrawable) real).isRunning();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.AnimationDrawable) real).mutate());
    }

    public void run() {
        ((android.graphics.drawable.AnimationDrawable) real).run();
    }

    public void setOneShot(boolean arg0) {
        ((android.graphics.drawable.AnimationDrawable) real).setOneShot(arg0);
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return ((android.graphics.drawable.AnimationDrawable) real).setVisible(arg0, arg1);
    }

    public void start() {
        ((android.graphics.drawable.AnimationDrawable) real).start();
    }

    public void stop() {
        ((android.graphics.drawable.AnimationDrawable) real).stop();
    }

    public void unscheduleSelf(java.lang.Runnable arg0) {
        ((android.graphics.drawable.AnimationDrawable) real).unscheduleSelf(arg0);
    }

}
