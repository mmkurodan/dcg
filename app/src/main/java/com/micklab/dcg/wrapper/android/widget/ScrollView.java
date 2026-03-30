// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ScrollView {
    private final android.widget.ScrollView real;

    public ScrollView(android.widget.ScrollView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ScrollView wrap(android.widget.ScrollView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ScrollView(real);
    }

    public android.widget.ScrollView unwrap() {
        return real;
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.unwrap()));
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addView(arg0 == null ? null : arg0.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean arrowScroll(int arg0) {
        return real.arrowScroll(arg0);
    }

    public void computeScroll() {
        real.computeScroll();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public boolean executeKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.executeKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void fling(int arg0) {
        real.fling(arg0);
    }

    public boolean fullScroll(int arg0) {
        return real.fullScroll(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getBottomEdgeEffectColor() {
        return real.getBottomEdgeEffectColor();
    }

    public int getMaxScrollAmount() {
        return real.getMaxScrollAmount();
    }

    public int getTopEdgeEffectColor() {
        return real.getTopEdgeEffectColor();
    }

    public boolean isFillViewport() {
        return real.isFillViewport();
    }

    public boolean isSmoothScrollingEnabled() {
        return real.isSmoothScrollingEnabled();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onNestedFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2, boolean arg3) {
        return real.onNestedFling(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        real.onNestedScroll(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void onNestedScrollAccepted(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        real.onNestedScrollAccepted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return real.onStartNestedScroll(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onStopNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onStopNestedScroll(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean pageScroll(int arg0) {
        return real.pageScroll(arg0);
    }

    public void requestChildFocus(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.requestChildFocus(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return real.requestChildRectangleOnScreen(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg0) {
        real.requestDisallowInterceptTouchEvent(arg0);
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public void scrollTo(int arg0, int arg1) {
        real.scrollTo(arg0, arg1);
    }

    public void scrollToDescendant(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.scrollToDescendant(arg0 == null ? null : arg0.unwrap());
    }

    public void setBottomEdgeEffectColor(int arg0) {
        real.setBottomEdgeEffectColor(arg0);
    }

    public void setEdgeEffectColor(int arg0) {
        real.setEdgeEffectColor(arg0);
    }

    public void setFillViewport(boolean arg0) {
        real.setFillViewport(arg0);
    }

    public void setSmoothScrollingEnabled(boolean arg0) {
        real.setSmoothScrollingEnabled(arg0);
    }

    public void setTopEdgeEffectColor(int arg0) {
        real.setTopEdgeEffectColor(arg0);
    }

    public boolean shouldDelayChildPressedState() {
        return real.shouldDelayChildPressedState();
    }

    public void smoothScrollBy(int arg0, int arg1) {
        real.smoothScrollBy(arg0, arg1);
    }

    public void smoothScrollTo(int arg0, int arg1) {
        real.smoothScrollTo(arg0, arg1);
    }

}
