// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewConfiguration wrap(android.view.ViewConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewConfiguration getReal() {
        return (android.view.ViewConfiguration) real;
    }

    public android.view.ViewConfiguration unwrap() {
        return getReal();
    }

    public ViewConfiguration() {
        this(new android.view.ViewConfiguration(), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.view.ViewConfiguration get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewConfiguration.wrap(android.view.ViewConfiguration.get(arg0 == null ? null : arg0.getReal()));
    }

    public static float getAmbiguousGestureMultiplier() {
        return android.view.ViewConfiguration.getAmbiguousGestureMultiplier();
    }

    public static long getDefaultActionModeHideDuration() {
        return android.view.ViewConfiguration.getDefaultActionModeHideDuration();
    }

    public static int getDoubleTapTimeout() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    public static int getEdgeSlop() {
        return android.view.ViewConfiguration.getEdgeSlop();
    }

    public static int getFadingEdgeLength() {
        return android.view.ViewConfiguration.getFadingEdgeLength();
    }

    public static long getGlobalActionKeyTimeout() {
        return android.view.ViewConfiguration.getGlobalActionKeyTimeout();
    }

    public static int getJumpTapTimeout() {
        return android.view.ViewConfiguration.getJumpTapTimeout();
    }

    public static int getKeyRepeatDelay() {
        return android.view.ViewConfiguration.getKeyRepeatDelay();
    }

    public static int getKeyRepeatTimeout() {
        return android.view.ViewConfiguration.getKeyRepeatTimeout();
    }

    public static int getLongPressTimeout() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    public static int getMaximumDrawingCacheSize() {
        return android.view.ViewConfiguration.getMaximumDrawingCacheSize();
    }

    public static int getMaximumFlingVelocity() {
        return android.view.ViewConfiguration.getMaximumFlingVelocity();
    }

    public static int getMinimumFlingVelocity() {
        return android.view.ViewConfiguration.getMinimumFlingVelocity();
    }

    public static int getMultiPressTimeout() {
        return android.view.ViewConfiguration.getMultiPressTimeout();
    }

    public static int getPressedStateDuration() {
        return android.view.ViewConfiguration.getPressedStateDuration();
    }

    public float getScaledAmbiguousGestureMultiplier() {
        return ((android.view.ViewConfiguration) real).getScaledAmbiguousGestureMultiplier();
    }

    public int getScaledDoubleTapSlop() {
        return ((android.view.ViewConfiguration) real).getScaledDoubleTapSlop();
    }

    public int getScaledEdgeSlop() {
        return ((android.view.ViewConfiguration) real).getScaledEdgeSlop();
    }

    public int getScaledFadingEdgeLength() {
        return ((android.view.ViewConfiguration) real).getScaledFadingEdgeLength();
    }

    public int getScaledHandwritingGestureLineMargin() {
        return ((android.view.ViewConfiguration) real).getScaledHandwritingGestureLineMargin();
    }

    public int getScaledHandwritingSlop() {
        return ((android.view.ViewConfiguration) real).getScaledHandwritingSlop();
    }

    public float getScaledHorizontalScrollFactor() {
        return ((android.view.ViewConfiguration) real).getScaledHorizontalScrollFactor();
    }

    public int getScaledHoverSlop() {
        return ((android.view.ViewConfiguration) real).getScaledHoverSlop();
    }

    public int getScaledMaximumDrawingCacheSize() {
        return ((android.view.ViewConfiguration) real).getScaledMaximumDrawingCacheSize();
    }

    public int getScaledMaximumFlingVelocity() {
        return ((android.view.ViewConfiguration) real).getScaledMaximumFlingVelocity();
    }

    public int getScaledMaximumFlingVelocity(int arg0, int arg1, int arg2) {
        return ((android.view.ViewConfiguration) real).getScaledMaximumFlingVelocity(arg0, arg1, arg2);
    }

    public int getScaledMinimumFlingVelocity() {
        return ((android.view.ViewConfiguration) real).getScaledMinimumFlingVelocity();
    }

    public int getScaledMinimumFlingVelocity(int arg0, int arg1, int arg2) {
        return ((android.view.ViewConfiguration) real).getScaledMinimumFlingVelocity(arg0, arg1, arg2);
    }

    public int getScaledMinimumScalingSpan() {
        return ((android.view.ViewConfiguration) real).getScaledMinimumScalingSpan();
    }

    public int getScaledOverflingDistance() {
        return ((android.view.ViewConfiguration) real).getScaledOverflingDistance();
    }

    public int getScaledOverscrollDistance() {
        return ((android.view.ViewConfiguration) real).getScaledOverscrollDistance();
    }

    public int getScaledPagingTouchSlop() {
        return ((android.view.ViewConfiguration) real).getScaledPagingTouchSlop();
    }

    public int getScaledScrollBarSize() {
        return ((android.view.ViewConfiguration) real).getScaledScrollBarSize();
    }

    public int getScaledTouchSlop() {
        return ((android.view.ViewConfiguration) real).getScaledTouchSlop();
    }

    public float getScaledVerticalScrollFactor() {
        return ((android.view.ViewConfiguration) real).getScaledVerticalScrollFactor();
    }

    public int getScaledWindowTouchSlop() {
        return ((android.view.ViewConfiguration) real).getScaledWindowTouchSlop();
    }

    public static int getScrollBarFadeDuration() {
        return android.view.ViewConfiguration.getScrollBarFadeDuration();
    }

    public static int getScrollBarSize() {
        return android.view.ViewConfiguration.getScrollBarSize();
    }

    public static int getScrollDefaultDelay() {
        return android.view.ViewConfiguration.getScrollDefaultDelay();
    }

    public static float getScrollFriction() {
        return android.view.ViewConfiguration.getScrollFriction();
    }

    public static int getTapTimeout() {
        return android.view.ViewConfiguration.getTapTimeout();
    }

    public static int getTouchSlop() {
        return android.view.ViewConfiguration.getTouchSlop();
    }

    public static int getWindowTouchSlop() {
        return android.view.ViewConfiguration.getWindowTouchSlop();
    }

    public static long getZoomControlsTimeout() {
        return android.view.ViewConfiguration.getZoomControlsTimeout();
    }

    public boolean hasPermanentMenuKey() {
        return ((android.view.ViewConfiguration) real).hasPermanentMenuKey();
    }

    public boolean shouldShowMenuShortcutsWhenKeyboardPresent() {
        return ((android.view.ViewConfiguration) real).shouldShowMenuShortcutsWhenKeyboardPresent();
    }

}
