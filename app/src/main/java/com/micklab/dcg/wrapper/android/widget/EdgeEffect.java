// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class EdgeEffect {
    private final android.widget.EdgeEffect real;

    public EdgeEffect(android.widget.EdgeEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.EdgeEffect wrap(android.widget.EdgeEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.EdgeEffect(real);
    }

    public android.widget.EdgeEffect unwrap() {
        return real;
    }

    public EdgeEffect(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.EdgeEffect(arg0 == null ? null : arg0.unwrap()));
    }

    public EdgeEffect(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.EdgeEffect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public boolean draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public void finish() {
        real.finish();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getBlendMode());
    }

    public int getColor() {
        return real.getColor();
    }

    public float getDistance() {
        return real.getDistance();
    }

    public int getMaxHeight() {
        return real.getMaxHeight();
    }

    public boolean isFinished() {
        return real.isFinished();
    }

    public void onAbsorb(int arg0) {
        real.onAbsorb(arg0);
    }

    public void onPull(float arg0) {
        real.onPull(arg0);
    }

    public void onPull(float arg0, float arg1) {
        real.onPull(arg0, arg1);
    }

    public float onPullDistance(float arg0, float arg1) {
        return real.onPullDistance(arg0, arg1);
    }

    public void onRelease() {
        real.onRelease();
    }

    public void setBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setColor(int arg0) {
        real.setColor(arg0);
    }

    public void setSize(int arg0, int arg1) {
        real.setSize(arg0, arg1);
    }

    public static final com.micklab.dcg.wrapper.android.graphics.BlendMode DEFAULT_BLEND_MODE = com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(android.widget.EdgeEffect.DEFAULT_BLEND_MODE);

}
