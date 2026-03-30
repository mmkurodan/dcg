// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewGroup {
    private final android.view.ViewGroup real;

    public ViewGroup(android.view.ViewGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewGroup wrap(android.view.ViewGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup(real);
    }

    public android.view.ViewGroup unwrap() {
        return real;
    }

    public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean addStatesFromChildren() {
        return real.addStatesFromChildren();
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addView(arg0 == null ? null : arg0.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void bringChildToFront(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.bringChildToFront(arg0 == null ? null : arg0.unwrap());
    }

    public void childDrawableStateChanged(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.childDrawableStateChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void childHasTransientStateChanged(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        real.childHasTransientStateChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void clearChildFocus(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.clearChildFocus(arg0 == null ? null : arg0.unwrap());
    }

    public void clearDisappearingChildren() {
        real.clearDisappearingChildren();
    }

    public void clearFocus() {
        real.clearFocus();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets dispatchApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.dispatchApplyWindowInsets(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean dispatchCapturedPointerEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchCapturedPointerEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.dispatchConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchDisplayHint(int arg0) {
        real.dispatchDisplayHint(arg0);
    }

    public boolean dispatchDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return real.dispatchDragEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchDrawableHotspotChanged(float arg0, float arg1) {
        real.dispatchDrawableHotspotChanged(arg0, arg1);
    }

    public void dispatchFinishTemporaryDetach() {
        real.dispatchFinishTemporaryDetach();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchKeyEventPreIme(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEventPreIme(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyShortcutEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchPointerCaptureChanged(boolean arg0) {
        real.dispatchPointerCaptureChanged(arg0);
    }

    public void dispatchProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.dispatchProvideAutofillStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void dispatchProvideStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        real.dispatchProvideStructure(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchSetActivated(boolean arg0) {
        real.dispatchSetActivated(arg0);
    }

    public void dispatchSetSelected(boolean arg0) {
        real.dispatchSetSelected(arg0);
    }

    public void dispatchStartTemporaryDetach() {
        real.dispatchStartTemporaryDetach();
    }

    public void dispatchSystemUiVisibilityChanged(int arg0) {
        real.dispatchSystemUiVisibilityChanged(arg0);
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchUnhandledMove(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return real.dispatchUnhandledMove(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void dispatchWindowFocusChanged(boolean arg0) {
        real.dispatchWindowFocusChanged(arg0);
    }

    public void dispatchWindowInsetsAnimationEnd(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
        real.dispatchWindowInsetsAnimationEnd(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchWindowInsetsAnimationPrepare(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
        real.dispatchWindowInsetsAnimationPrepare(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0, com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds arg1) {
        return com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds.wrap(real.dispatchWindowInsetsAnimationStart(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void dispatchWindowSystemUiVisiblityChanged(int arg0) {
        real.dispatchWindowSystemUiVisiblityChanged(arg0);
    }

    public void dispatchWindowVisibilityChanged(int arg0) {
        real.dispatchWindowVisibilityChanged(arg0);
    }

    public void endViewTransition(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.endViewTransition(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.View findFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.findFocus());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(real.findOnBackInvokedDispatcherForChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View focusSearch(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.focusSearch(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void focusableViewAvailable(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.focusableViewAvailable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return real.gatherTransparentRegion(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getChildAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getChildAt(arg0));
    }

    public int getChildCount() {
        return real.getChildCount();
    }

    public int getChildDrawingOrder(int arg0) {
        return real.getChildDrawingOrder(arg0);
    }

    public static int getChildMeasureSpec(int arg0, int arg1, int arg2) {
        return android.view.ViewGroup.getChildMeasureSpec(arg0, arg1, arg2);
    }

    public boolean getChildVisibleRect(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2) {
        return real.getChildVisibleRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean getClipChildren() {
        return real.getClipChildren();
    }

    public boolean getClipToPadding() {
        return real.getClipToPadding();
    }

    public int getDescendantFocusability() {
        return real.getDescendantFocusability();
    }

    public com.micklab.dcg.wrapper.android.view.View getFocusedChild() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getFocusedChild());
    }

    public com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController getLayoutAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController.wrap(real.getLayoutAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener getLayoutAnimationListener() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener.wrap(real.getLayoutAnimationListener());
    }

    public int getLayoutMode() {
        return real.getLayoutMode();
    }

    public com.micklab.dcg.wrapper.android.animation.LayoutTransition getLayoutTransition() {
        return com.micklab.dcg.wrapper.android.animation.LayoutTransition.wrap(real.getLayoutTransition());
    }

    public int getNestedScrollAxes() {
        return real.getNestedScrollAxes();
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroupOverlay getOverlay() {
        return com.micklab.dcg.wrapper.android.view.ViewGroupOverlay.wrap(real.getOverlay());
    }

    public int getPersistentDrawingCache() {
        return real.getPersistentDrawingCache();
    }

    public boolean getTouchscreenBlocksFocus() {
        return real.getTouchscreenBlocksFocus();
    }

    public boolean hasFocus() {
        return real.hasFocus();
    }

    public boolean hasTransientState() {
        return real.hasTransientState();
    }

    public int indexOfChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.indexOfChild(arg0 == null ? null : arg0.unwrap());
    }

    public void invalidateChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        real.invalidateChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent invalidateChildInParent(int[] arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(real.invalidateChildInParent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public boolean isAlwaysDrawnWithCacheEnabled() {
        return real.isAlwaysDrawnWithCacheEnabled();
    }

    public boolean isAnimationCacheEnabled() {
        return real.isAnimationCacheEnabled();
    }

    public boolean isLayoutSuppressed() {
        return real.isLayoutSuppressed();
    }

    public boolean isMotionEventSplittingEnabled() {
        return real.isMotionEventSplittingEnabled();
    }

    public boolean isTransitionGroup() {
        return real.isTransitionGroup();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public void layout(int arg0, int arg1, int arg2, int arg3) {
        real.layout(arg0, arg1, arg2, arg3);
    }

    public void notifySubtreeAccessibilityStateChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        real.notifySubtreeAccessibilityStateChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void offsetDescendantRectToMyCoords(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        real.offsetDescendantRectToMyCoords(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void offsetRectIntoDescendantCoords(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        real.offsetRectIntoDescendantCoords(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onDescendantInvalidated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.onDescendantInvalidated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean onInterceptHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptHoverEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onNestedFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2, boolean arg3) {
        return real.onNestedFling(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public boolean onNestedPreFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return real.onNestedPreFling(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean onNestedPrePerformAccessibilityAction(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.onNestedPrePerformAccessibilityAction(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void onNestedPreScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int[] arg3) {
        real.onNestedPreScroll(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        real.onNestedScroll(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void onNestedScrollAccepted(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        real.onNestedScrollAccepted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean onRequestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
        return real.onRequestSendAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return real.onStartNestedScroll(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onStopNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onStopNestedScroll(arg0 == null ? null : arg0.unwrap());
    }

    public void onViewAdded(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onViewAdded(arg0 == null ? null : arg0.unwrap());
    }

    public void onViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onViewRemoved(arg0 == null ? null : arg0.unwrap());
    }

    public void recomputeViewAttributes(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.recomputeViewAttributes(arg0 == null ? null : arg0.unwrap());
    }

    public void removeAllViews() {
        real.removeAllViews();
    }

    public void removeAllViewsInLayout() {
        real.removeAllViewsInLayout();
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

    public void requestChildFocus(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.requestChildFocus(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return real.requestChildRectangleOnScreen(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg0) {
        real.requestDisallowInterceptTouchEvent(arg0);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return real.requestFocus(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean requestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
        return real.requestSendAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void requestTransparentRegion(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.requestTransparentRegion(arg0 == null ? null : arg0.unwrap());
    }

    public boolean restoreDefaultFocus() {
        return real.restoreDefaultFocus();
    }

    public void scheduleLayoutAnimation() {
        real.scheduleLayoutAnimation();
    }

    public void setAddStatesFromChildren(boolean arg0) {
        real.setAddStatesFromChildren(arg0);
    }

    public void setAlwaysDrawnWithCacheEnabled(boolean arg0) {
        real.setAlwaysDrawnWithCacheEnabled(arg0);
    }

    public void setAnimationCacheEnabled(boolean arg0) {
        real.setAnimationCacheEnabled(arg0);
    }

    public void setClipChildren(boolean arg0) {
        real.setClipChildren(arg0);
    }

    public void setClipToPadding(boolean arg0) {
        real.setClipToPadding(arg0);
    }

    public void setDescendantFocusability(int arg0) {
        real.setDescendantFocusability(arg0);
    }

    public void setLayoutAnimation(com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController arg0) {
        real.setLayoutAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public void setLayoutAnimationListener(com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener arg0) {
        real.setLayoutAnimationListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setLayoutMode(int arg0) {
        real.setLayoutMode(arg0);
    }

    public void setLayoutTransition(com.micklab.dcg.wrapper.android.animation.LayoutTransition arg0) {
        real.setLayoutTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setMotionEventSplittingEnabled(boolean arg0) {
        real.setMotionEventSplittingEnabled(arg0);
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        real.setOnHierarchyChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPersistentDrawingCache(int arg0) {
        real.setPersistentDrawingCache(arg0);
    }

    public void setTouchscreenBlocksFocus(boolean arg0) {
        real.setTouchscreenBlocksFocus(arg0);
    }

    public void setTransitionGroup(boolean arg0) {
        real.setTransitionGroup(arg0);
    }

    public void setWindowInsetsAnimationCallback(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback arg0) {
        real.setWindowInsetsAnimationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public boolean shouldDelayChildPressedState() {
        return real.shouldDelayChildPressedState();
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.showContextMenuForChild(arg0 == null ? null : arg0.unwrap());
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return real.showContextMenuForChild(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionModeForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.startActionModeForChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionModeForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.startActionModeForChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public void startLayoutAnimation() {
        real.startLayoutAnimation();
    }

    public void startViewTransition(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.startViewTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void suppressLayout(boolean arg0) {
        real.suppressLayout(arg0);
    }

    public void updateViewLayout(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.updateViewLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final int FOCUS_AFTER_DESCENDANTS = android.view.ViewGroup.FOCUS_AFTER_DESCENDANTS;
    public static final int FOCUS_BEFORE_DESCENDANTS = android.view.ViewGroup.FOCUS_BEFORE_DESCENDANTS;
    public static final int FOCUS_BLOCK_DESCENDANTS = android.view.ViewGroup.FOCUS_BLOCK_DESCENDANTS;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = android.view.ViewGroup.LAYOUT_MODE_CLIP_BOUNDS;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = android.view.ViewGroup.LAYOUT_MODE_OPTICAL_BOUNDS;
    public static final int PERSISTENT_ALL_CACHES = android.view.ViewGroup.PERSISTENT_ALL_CACHES;
    public static final int PERSISTENT_ANIMATION_CACHE = android.view.ViewGroup.PERSISTENT_ANIMATION_CACHE;
    public static final int PERSISTENT_NO_CACHE = android.view.ViewGroup.PERSISTENT_NO_CACHE;
    public static final int PERSISTENT_SCROLLING_CACHE = android.view.ViewGroup.PERSISTENT_SCROLLING_CACHE;

    public static final class LayoutParams {
        private final android.view.ViewGroup.LayoutParams real;

        public LayoutParams(android.view.ViewGroup.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams wrap(android.view.ViewGroup.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams(real);
        }

        public android.view.ViewGroup.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.view.ViewGroup.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.view.ViewGroup.LayoutParams(arg0, arg1));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.view.ViewGroup.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public void resolveLayoutDirection(int arg0) {
            real.resolveLayoutDirection(arg0);
        }

        public static final int FILL_PARENT = android.view.ViewGroup.LayoutParams.FILL_PARENT;
        public static final int MATCH_PARENT = android.view.ViewGroup.LayoutParams.MATCH_PARENT;
        public static final int WRAP_CONTENT = android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

    }
    public static final class MarginLayoutParams {
        private final android.view.ViewGroup.MarginLayoutParams real;

        public MarginLayoutParams(android.view.ViewGroup.MarginLayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams wrap(android.view.ViewGroup.MarginLayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams(real);
        }

        public android.view.ViewGroup.MarginLayoutParams unwrap() {
            return real;
        }

        public MarginLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public MarginLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public MarginLayoutParams(int arg0, int arg1) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0, arg1));
        }

        public MarginLayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public int getLayoutDirection() {
            return real.getLayoutDirection();
        }

        public int getMarginEnd() {
            return real.getMarginEnd();
        }

        public int getMarginStart() {
            return real.getMarginStart();
        }

        public boolean isMarginRelative() {
            return real.isMarginRelative();
        }

        public void resolveLayoutDirection(int arg0) {
            real.resolveLayoutDirection(arg0);
        }

        public void setLayoutDirection(int arg0) {
            real.setLayoutDirection(arg0);
        }

        public void setMarginEnd(int arg0) {
            real.setMarginEnd(arg0);
        }

        public void setMarginStart(int arg0) {
            real.setMarginStart(arg0);
        }

        public void setMargins(int arg0, int arg1, int arg2, int arg3) {
            real.setMargins(arg0, arg1, arg2, arg3);
        }


    }
    public static final class OnHierarchyChangeListener {
        private final android.view.ViewGroup.OnHierarchyChangeListener real;

        public OnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener wrap(android.view.ViewGroup.OnHierarchyChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener(real);
        }

        public android.view.ViewGroup.OnHierarchyChangeListener unwrap() {
            return real;
        }

        public void onChildViewAdded(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            real.onChildViewAdded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onChildViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            real.onChildViewRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
