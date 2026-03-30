// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewConfiguration {
    private final android.view.ViewConfiguration real;

    public ViewConfiguration(android.view.ViewConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewConfiguration wrap(android.view.ViewConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewConfiguration(real);
    }

    public android.view.ViewConfiguration unwrap() {
        return real;
    }

    public ViewConfiguration() {
        this(new android.view.ViewConfiguration());
    }

    public static com.micklab.dcg.wrapper.android.view.ViewConfiguration get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewConfiguration.wrap(android.view.ViewConfiguration.get(arg0 == null ? null : arg0.unwrap()));
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
        return real.getScaledAmbiguousGestureMultiplier();
    }

    public int getScaledDoubleTapSlop() {
        return real.getScaledDoubleTapSlop();
    }

    public int getScaledEdgeSlop() {
        return real.getScaledEdgeSlop();
    }

    public int getScaledFadingEdgeLength() {
        return real.getScaledFadingEdgeLength();
    }

    public int getScaledHandwritingGestureLineMargin() {
        return real.getScaledHandwritingGestureLineMargin();
    }

    public int getScaledHandwritingSlop() {
        return real.getScaledHandwritingSlop();
    }

    public float getScaledHorizontalScrollFactor() {
        return real.getScaledHorizontalScrollFactor();
    }

    public int getScaledHoverSlop() {
        return real.getScaledHoverSlop();
    }

    public int getScaledMaximumDrawingCacheSize() {
        return real.getScaledMaximumDrawingCacheSize();
    }

    public int getScaledMaximumFlingVelocity() {
        return real.getScaledMaximumFlingVelocity();
    }

    public int getScaledMaximumFlingVelocity(int arg0, int arg1, int arg2) {
        return real.getScaledMaximumFlingVelocity(arg0, arg1, arg2);
    }

    public int getScaledMinimumFlingVelocity() {
        return real.getScaledMinimumFlingVelocity();
    }

    public int getScaledMinimumFlingVelocity(int arg0, int arg1, int arg2) {
        return real.getScaledMinimumFlingVelocity(arg0, arg1, arg2);
    }

    public int getScaledMinimumScalingSpan() {
        return real.getScaledMinimumScalingSpan();
    }

    public int getScaledOverflingDistance() {
        return real.getScaledOverflingDistance();
    }

    public int getScaledOverscrollDistance() {
        return real.getScaledOverscrollDistance();
    }

    public int getScaledPagingTouchSlop() {
        return real.getScaledPagingTouchSlop();
    }

    public int getScaledScrollBarSize() {
        return real.getScaledScrollBarSize();
    }

    public int getScaledTouchSlop() {
        return real.getScaledTouchSlop();
    }

    public float getScaledVerticalScrollFactor() {
        return real.getScaledVerticalScrollFactor();
    }

    public int getScaledWindowTouchSlop() {
        return real.getScaledWindowTouchSlop();
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
        return real.hasPermanentMenuKey();
    }

    public boolean shouldShowMenuShortcutsWhenKeyboardPresent() {
        return real.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

}
