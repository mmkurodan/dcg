// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ScrollView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScrollView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ScrollView wrap(android.widget.ScrollView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ScrollView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ScrollView getReal() {
        return (android.widget.ScrollView) real;
    }

    public android.widget.ScrollView unwrap() {
        return getReal();
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ScrollView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ScrollView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ScrollView) real).addView(arg0 == null ? null : arg0.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.widget.ScrollView) real).addView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.widget.ScrollView) real).addView(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.widget.ScrollView) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean arrowScroll(int arg0) {
        return ((android.widget.ScrollView) real).arrowScroll(arg0);
    }

    public void computeScroll() {
        ((android.widget.ScrollView) real).computeScroll();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.widget.ScrollView) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.widget.ScrollView) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public boolean executeKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.widget.ScrollView) real).executeKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public void fling(int arg0) {
        ((android.widget.ScrollView) real).fling(arg0);
    }

    public boolean fullScroll(int arg0) {
        return ((android.widget.ScrollView) real).fullScroll(arg0);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ScrollView) real).getAccessibilityClassName();
    }

    public int getBottomEdgeEffectColor() {
        return ((android.widget.ScrollView) real).getBottomEdgeEffectColor();
    }

    public int getMaxScrollAmount() {
        return ((android.widget.ScrollView) real).getMaxScrollAmount();
    }

    public int getTopEdgeEffectColor() {
        return ((android.widget.ScrollView) real).getTopEdgeEffectColor();
    }

    public boolean isFillViewport() {
        return ((android.widget.ScrollView) real).isFillViewport();
    }

    public boolean isSmoothScrollingEnabled() {
        return ((android.widget.ScrollView) real).isSmoothScrollingEnabled();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.ScrollView) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.ScrollView) real).onInterceptTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onNestedFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2, boolean arg3) {
        return ((android.widget.ScrollView) real).onNestedFling(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.ScrollView) real).onNestedScroll(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void onNestedScrollAccepted(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.widget.ScrollView) real).onNestedScrollAccepted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return ((android.widget.ScrollView) real).onStartNestedScroll(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onStopNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ScrollView) real).onStopNestedScroll(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.ScrollView) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean pageScroll(int arg0) {
        return ((android.widget.ScrollView) real).pageScroll(arg0);
    }

    public void requestChildFocus(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.widget.ScrollView) real).requestChildFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return ((android.widget.ScrollView) real).requestChildRectangleOnScreen(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg0) {
        ((android.widget.ScrollView) real).requestDisallowInterceptTouchEvent(arg0);
    }

    public void requestLayout() {
        ((android.widget.ScrollView) real).requestLayout();
    }

    public void scrollTo(int arg0, int arg1) {
        ((android.widget.ScrollView) real).scrollTo(arg0, arg1);
    }

    public void scrollToDescendant(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.ScrollView) real).scrollToDescendant(arg0 == null ? null : arg0.getReal());
    }

    public void setBottomEdgeEffectColor(int arg0) {
        ((android.widget.ScrollView) real).setBottomEdgeEffectColor(arg0);
    }

    public void setEdgeEffectColor(int arg0) {
        ((android.widget.ScrollView) real).setEdgeEffectColor(arg0);
    }

    public void setFillViewport(boolean arg0) {
        ((android.widget.ScrollView) real).setFillViewport(arg0);
    }

    public void setSmoothScrollingEnabled(boolean arg0) {
        ((android.widget.ScrollView) real).setSmoothScrollingEnabled(arg0);
    }

    public void setTopEdgeEffectColor(int arg0) {
        ((android.widget.ScrollView) real).setTopEdgeEffectColor(arg0);
    }

    public boolean shouldDelayChildPressedState() {
        return ((android.widget.ScrollView) real).shouldDelayChildPressedState();
    }

    public void smoothScrollBy(int arg0, int arg1) {
        ((android.widget.ScrollView) real).smoothScrollBy(arg0, arg1);
    }

    public void smoothScrollTo(int arg0, int arg1) {
        ((android.widget.ScrollView) real).smoothScrollTo(arg0, arg1);
    }

}
