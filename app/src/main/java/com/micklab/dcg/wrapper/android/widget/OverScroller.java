// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class OverScroller {
    private final android.widget.OverScroller real;

    public OverScroller(android.widget.OverScroller real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.OverScroller wrap(android.widget.OverScroller real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.OverScroller(real);
    }

    public android.widget.OverScroller unwrap() {
        return real;
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.unwrap()));
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, float arg2, float arg3) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, float arg2, float arg3, boolean arg4) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public void abortAnimation() {
        real.abortAnimation();
    }

    public boolean computeScrollOffset() {
        return real.computeScrollOffset();
    }

    public void fling(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        real.fling(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public void fling(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        real.fling(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
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

    public boolean isOverScrolled() {
        return real.isOverScrolled();
    }

    public void notifyHorizontalEdgeReached(int arg0, int arg1, int arg2) {
        real.notifyHorizontalEdgeReached(arg0, arg1, arg2);
    }

    public void notifyVerticalEdgeReached(int arg0, int arg1, int arg2) {
        real.notifyVerticalEdgeReached(arg0, arg1, arg2);
    }

    public void setFriction(float arg0) {
        real.setFriction(arg0);
    }

    public boolean springBack(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return real.springBack(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3) {
        real.startScroll(arg0, arg1, arg2, arg3);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.startScroll(arg0, arg1, arg2, arg3, arg4);
    }

}
