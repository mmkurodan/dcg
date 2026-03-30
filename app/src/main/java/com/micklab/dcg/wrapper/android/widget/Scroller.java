// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Scroller {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Scroller(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Scroller wrap(android.widget.Scroller real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Scroller(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Scroller getReal() {
        return (android.widget.Scroller) real;
    }

    public android.widget.Scroller unwrap() {
        return getReal();
    }

    public Scroller(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Scroller(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Scroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1) {
        this(new android.widget.Scroller(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Scroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, boolean arg2) {
        this(new android.widget.Scroller(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public void abortAnimation() {
        ((android.widget.Scroller) real).abortAnimation();
    }

    public boolean computeScrollOffset() {
        return ((android.widget.Scroller) real).computeScrollOffset();
    }

    public void extendDuration(int arg0) {
        ((android.widget.Scroller) real).extendDuration(arg0);
    }

    public void fling(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ((android.widget.Scroller) real).fling(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public void forceFinished(boolean arg0) {
        ((android.widget.Scroller) real).forceFinished(arg0);
    }

    public float getCurrVelocity() {
        return ((android.widget.Scroller) real).getCurrVelocity();
    }

    public int getCurrX() {
        return ((android.widget.Scroller) real).getCurrX();
    }

    public int getCurrY() {
        return ((android.widget.Scroller) real).getCurrY();
    }

    public int getDuration() {
        return ((android.widget.Scroller) real).getDuration();
    }

    public int getFinalX() {
        return ((android.widget.Scroller) real).getFinalX();
    }

    public int getFinalY() {
        return ((android.widget.Scroller) real).getFinalY();
    }

    public int getStartX() {
        return ((android.widget.Scroller) real).getStartX();
    }

    public int getStartY() {
        return ((android.widget.Scroller) real).getStartY();
    }

    public boolean isFinished() {
        return ((android.widget.Scroller) real).isFinished();
    }

    public void setFinalX(int arg0) {
        ((android.widget.Scroller) real).setFinalX(arg0);
    }

    public void setFinalY(int arg0) {
        ((android.widget.Scroller) real).setFinalY(arg0);
    }

    public void setFriction(float arg0) {
        ((android.widget.Scroller) real).setFriction(arg0);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.Scroller) real).startScroll(arg0, arg1, arg2, arg3);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.Scroller) real).startScroll(arg0, arg1, arg2, arg3, arg4);
    }

    public int timePassed() {
        return ((android.widget.Scroller) real).timePassed();
    }

}
