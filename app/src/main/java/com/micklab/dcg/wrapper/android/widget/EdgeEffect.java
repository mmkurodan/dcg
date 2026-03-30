// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class EdgeEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EdgeEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.EdgeEffect wrap(android.widget.EdgeEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.EdgeEffect(real, (__DcgwBridgeToken) null);
    }

    public android.widget.EdgeEffect getReal() {
        return (android.widget.EdgeEffect) real;
    }

    public android.widget.EdgeEffect unwrap() {
        return getReal();
    }

    public EdgeEffect(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.EdgeEffect(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public EdgeEffect(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.EdgeEffect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return ((android.widget.EdgeEffect) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public void finish() {
        ((android.widget.EdgeEffect) real).finish();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.EdgeEffect) real).getBlendMode());
    }

    public int getColor() {
        return ((android.widget.EdgeEffect) real).getColor();
    }

    public float getDistance() {
        return ((android.widget.EdgeEffect) real).getDistance();
    }

    public int getMaxHeight() {
        return ((android.widget.EdgeEffect) real).getMaxHeight();
    }

    public boolean isFinished() {
        return ((android.widget.EdgeEffect) real).isFinished();
    }

    public void onAbsorb(int arg0) {
        ((android.widget.EdgeEffect) real).onAbsorb(arg0);
    }

    public void onPull(float arg0) {
        ((android.widget.EdgeEffect) real).onPull(arg0);
    }

    public void onPull(float arg0, float arg1) {
        ((android.widget.EdgeEffect) real).onPull(arg0, arg1);
    }

    public float onPullDistance(float arg0, float arg1) {
        return ((android.widget.EdgeEffect) real).onPullDistance(arg0, arg1);
    }

    public void onRelease() {
        ((android.widget.EdgeEffect) real).onRelease();
    }

    public void setBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.EdgeEffect) real).setBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setColor(int arg0) {
        ((android.widget.EdgeEffect) real).setColor(arg0);
    }

    public void setSize(int arg0, int arg1) {
        ((android.widget.EdgeEffect) real).setSize(arg0, arg1);
    }

    public static final com.micklab.dcg.wrapper.android.graphics.BlendMode DEFAULT_BLEND_MODE = com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(android.widget.EdgeEffect.DEFAULT_BLEND_MODE);

}
