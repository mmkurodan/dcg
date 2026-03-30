// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ViewAnimator {
    private final android.widget.ViewAnimator real;

    public ViewAnimator(android.widget.ViewAnimator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ViewAnimator wrap(android.widget.ViewAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ViewAnimator(real);
    }

    public android.widget.ViewAnimator unwrap() {
        return real;
    }

    public ViewAnimator(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ViewAnimator(arg0 == null ? null : arg0.unwrap()));
    }

    public ViewAnimator(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ViewAnimator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean getAnimateFirstView() {
        return real.getAnimateFirstView();
    }

    public int getBaseline() {
        return real.getBaseline();
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCurrentView());
    }

    public int getDisplayedChild() {
        return real.getDisplayedChild();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getInAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(real.getInAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getOutAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(real.getOutAnimation());
    }

    public void removeAllViews() {
        real.removeAllViews();
    }

    public void removeView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.removeView(arg0 == null ? null : arg0.unwrap());
    }

    public void removeViewAt(int arg0) {
        real.removeViewAt(arg0);
    }

    public void removeViewInLayout(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.removeViewInLayout(arg0 == null ? null : arg0.unwrap());
    }

    public void removeViews(int arg0, int arg1) {
        real.removeViews(arg0, arg1);
    }

    public void removeViewsInLayout(int arg0, int arg1) {
        real.removeViewsInLayout(arg0, arg1);
    }

    public void setAnimateFirstView(boolean arg0) {
        real.setAnimateFirstView(arg0);
    }

    public void setDisplayedChild(int arg0) {
        real.setDisplayedChild(arg0);
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        real.setInAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public void setInAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setInAnimation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        real.setOutAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public void setOutAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setOutAnimation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void showNext() {
        real.showNext();
    }

    public void showPrevious() {
        real.showPrevious();
    }

}
