// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ViewAnimator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewAnimator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ViewAnimator wrap(android.widget.ViewAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewAnimator(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ViewAnimator getReal() {
        return (android.widget.ViewAnimator) real;
    }

    public android.widget.ViewAnimator unwrap() {
        return getReal();
    }

    public ViewAnimator(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ViewAnimator(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ViewAnimator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ViewAnimator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.widget.ViewAnimator) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ViewAnimator) real).getAccessibilityClassName();
    }

    public boolean getAnimateFirstView() {
        return ((android.widget.ViewAnimator) real).getAnimateFirstView();
    }

    public int getBaseline() {
        return ((android.widget.ViewAnimator) real).getBaseline();
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ViewAnimator) real).getCurrentView());
    }

    public int getDisplayedChild() {
        return ((android.widget.ViewAnimator) real).getDisplayedChild();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getInAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(((android.widget.ViewAnimator) real).getInAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getOutAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(((android.widget.ViewAnimator) real).getOutAnimation());
    }

    public void removeAllViews() {
        ((android.widget.ViewAnimator) real).removeAllViews();
    }

    public void removeView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ViewAnimator) real).removeView(arg0 == null ? null : arg0.getReal());
    }

    public void removeViewAt(int arg0) {
        ((android.widget.ViewAnimator) real).removeViewAt(arg0);
    }

    public void removeViewInLayout(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ViewAnimator) real).removeViewInLayout(arg0 == null ? null : arg0.getReal());
    }

    public void removeViews(int arg0, int arg1) {
        ((android.widget.ViewAnimator) real).removeViews(arg0, arg1);
    }

    public void removeViewsInLayout(int arg0, int arg1) {
        ((android.widget.ViewAnimator) real).removeViewsInLayout(arg0, arg1);
    }

    public void setAnimateFirstView(boolean arg0) {
        ((android.widget.ViewAnimator) real).setAnimateFirstView(arg0);
    }

    public void setDisplayedChild(int arg0) {
        ((android.widget.ViewAnimator) real).setDisplayedChild(arg0);
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        ((android.widget.ViewAnimator) real).setInAnimation(arg0 == null ? null : arg0.getReal());
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.widget.ViewAnimator) real).setInAnimation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        ((android.widget.ViewAnimator) real).setOutAnimation(arg0 == null ? null : arg0.getReal());
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.widget.ViewAnimator) real).setOutAnimation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void showNext() {
        ((android.widget.ViewAnimator) real).showNext();
    }

    public void showPrevious() {
        ((android.widget.ViewAnimator) real).showPrevious();
    }

}
