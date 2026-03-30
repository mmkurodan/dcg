// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Scroller {
    private final android.widget.Scroller real;

    public Scroller(android.widget.Scroller real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Scroller wrap(android.widget.Scroller real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Scroller(real);
    }

    public android.widget.Scroller unwrap() {
        return real;
    }

    public Scroller(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Scroller(arg0 == null ? null : arg0.unwrap()));
    }

    public Scroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1) {
        this(new android.widget.Scroller(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Scroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, boolean arg2) {
        this(new android.widget.Scroller(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public void abortAnimation() {
        real.abortAnimation();
    }

    public boolean computeScrollOffset() {
        return real.computeScrollOffset();
    }

    public void extendDuration(int arg0) {
        real.extendDuration(arg0);
    }

    public void fling(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        real.fling(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public void forceFinished(boolean arg0) {
        real.forceFinished(arg0);
    }

    public float getCurrVelocity() {
        return real.getCurrVelocity();
    }

    public int getCurrX() {
        return real.getCurrX();
    }

    public int getCurrY() {
        return real.getCurrY();
    }

    public int getDuration() {
        return real.getDuration();
    }

    public int getFinalX() {
        return real.getFinalX();
    }

    public int getFinalY() {
        return real.getFinalY();
    }

    public int getStartX() {
        return real.getStartX();
    }

    public int getStartY() {
        return real.getStartY();
    }

    public boolean isFinished() {
        return real.isFinished();
    }

    public void setFinalX(int arg0) {
        real.setFinalX(arg0);
    }

    public void setFinalY(int arg0) {
        real.setFinalY(arg0);
    }

    public void setFriction(float arg0) {
        real.setFriction(arg0);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3) {
        real.startScroll(arg0, arg1, arg2, arg3);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.startScroll(arg0, arg1, arg2, arg3, arg4);
    }

    public int timePassed() {
        return real.timePassed();
    }

}
