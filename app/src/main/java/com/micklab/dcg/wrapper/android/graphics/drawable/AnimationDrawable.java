// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimationDrawable {
    private final android.graphics.drawable.AnimationDrawable real;

    public AnimationDrawable(android.graphics.drawable.AnimationDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimationDrawable wrap(android.graphics.drawable.AnimationDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimationDrawable(real);
    }

    public android.graphics.drawable.AnimationDrawable unwrap() {
        return real;
    }

    public AnimationDrawable() {
        this(new android.graphics.drawable.AnimationDrawable());
    }

    public void addFrame(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, int arg1) {
        real.addFrame(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int getDuration(int arg0) {
        return real.getDuration(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getFrame(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getFrame(arg0));
    }

    public int getNumberOfFrames() {
        return real.getNumberOfFrames();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isOneShot() {
        return real.isOneShot();
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public void run() {
        real.run();
    }

    public void setOneShot(boolean arg0) {
        real.setOneShot(arg0);
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return real.setVisible(arg0, arg1);
    }

    public void start() {
        real.start();
    }

    public void stop() {
        real.stop();
    }

    public void unscheduleSelf(java.lang.Runnable arg0) {
        real.unscheduleSelf(arg0);
    }

}
