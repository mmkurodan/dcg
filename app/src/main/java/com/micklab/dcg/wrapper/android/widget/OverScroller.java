// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class OverScroller {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OverScroller(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.OverScroller wrap(android.widget.OverScroller real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.OverScroller(real, (__DcgwBridgeToken) null);
    }

    public android.widget.OverScroller getReal() {
        return (android.widget.OverScroller) real;
    }

    public android.widget.OverScroller unwrap() {
        return getReal();
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, float arg2, float arg3) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public OverScroller(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, float arg2, float arg3, boolean arg4) {
        this(new android.widget.OverScroller(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public void abortAnimation() {
        ((android.widget.OverScroller) real).abortAnimation();
    }

    public boolean computeScrollOffset() {
        return ((android.widget.OverScroller) real).computeScrollOffset();
    }

    public void fling(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ((android.widget.OverScroller) real).fling(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public void fling(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ((android.widget.OverScroller) real).fling(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public void forceFinished(boolean arg0) {
        ((android.widget.OverScroller) real).forceFinished(arg0);
    }

    public float getCurrVelocity() {
        return ((android.widget.OverScroller) real).getCurrVelocity();
    }

    public int getCurrX() {
        return ((android.widget.OverScroller) real).getCurrX();
    }

    public int getCurrY() {
        return ((android.widget.OverScroller) real).getCurrY();
    }

    public int getFinalX() {
        return ((android.widget.OverScroller) real).getFinalX();
    }

    public int getFinalY() {
        return ((android.widget.OverScroller) real).getFinalY();
    }

    public int getStartX() {
        return ((android.widget.OverScroller) real).getStartX();
    }

    public int getStartY() {
        return ((android.widget.OverScroller) real).getStartY();
    }

    public boolean isFinished() {
        return ((android.widget.OverScroller) real).isFinished();
    }

    public boolean isOverScrolled() {
        return ((android.widget.OverScroller) real).isOverScrolled();
    }

    public void notifyHorizontalEdgeReached(int arg0, int arg1, int arg2) {
        ((android.widget.OverScroller) real).notifyHorizontalEdgeReached(arg0, arg1, arg2);
    }

    public void notifyVerticalEdgeReached(int arg0, int arg1, int arg2) {
        ((android.widget.OverScroller) real).notifyVerticalEdgeReached(arg0, arg1, arg2);
    }

    public void setFriction(float arg0) {
        ((android.widget.OverScroller) real).setFriction(arg0);
    }

    public boolean springBack(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return ((android.widget.OverScroller) real).springBack(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3) {
        ((android.widget.OverScroller) real).startScroll(arg0, arg1, arg2, arg3);
    }

    public void startScroll(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.OverScroller) real).startScroll(arg0, arg1, arg2, arg3, arg4);
    }

}
