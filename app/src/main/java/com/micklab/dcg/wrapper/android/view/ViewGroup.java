// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewGroup wrap(android.view.ViewGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewGroup getReal() {
        return (android.view.ViewGroup) real;
    }

    public android.view.ViewGroup unwrap() {
        return getReal();
    }

    public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.view.ViewGroup) real).addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean addStatesFromChildren() {
        return ((android.view.ViewGroup) real).addStatesFromChildren();
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).addView(arg0 == null ? null : arg0.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.view.ViewGroup) real).addView(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.view.ViewGroup) real).addView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.view.ViewGroup) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        ((android.view.ViewGroup) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void bringChildToFront(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).bringChildToFront(arg0 == null ? null : arg0.getReal());
    }

    public void childDrawableStateChanged(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).childDrawableStateChanged(arg0 == null ? null : arg0.getReal());
    }

    public void childHasTransientStateChanged(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        ((android.view.ViewGroup) real).childHasTransientStateChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void clearChildFocus(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).clearChildFocus(arg0 == null ? null : arg0.getReal());
    }

    public void clearDisappearingChildren() {
        ((android.view.ViewGroup) real).clearDisappearingChildren();
    }

    public void clearFocus() {
        ((android.view.ViewGroup) real).clearFocus();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets dispatchApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.ViewGroup) real).dispatchApplyWindowInsets(arg0 == null ? null : arg0.getReal()));
    }

    public boolean dispatchCapturedPointerEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.ViewGroup) real).dispatchCapturedPointerEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.view.ViewGroup) real).dispatchConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchDisplayHint(int arg0) {
        ((android.view.ViewGroup) real).dispatchDisplayHint(arg0);
    }

    public boolean dispatchDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return ((android.view.ViewGroup) real).dispatchDragEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchDrawableHotspotChanged(float arg0, float arg1) {
        ((android.view.ViewGroup) real).dispatchDrawableHotspotChanged(arg0, arg1);
    }

    public void dispatchFinishTemporaryDetach() {
        ((android.view.ViewGroup) real).dispatchFinishTemporaryDetach();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.ViewGroup) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyEventPreIme(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.ViewGroup) real).dispatchKeyEventPreIme(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.ViewGroup) real).dispatchKeyShortcutEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchPointerCaptureChanged(boolean arg0) {
        ((android.view.ViewGroup) real).dispatchPointerCaptureChanged(arg0);
    }

    public void dispatchProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.view.ViewGroup) real).dispatchProvideAutofillStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void dispatchProvideStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        ((android.view.ViewGroup) real).dispatchProvideStructure(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchSetActivated(boolean arg0) {
        ((android.view.ViewGroup) real).dispatchSetActivated(arg0);
    }

    public void dispatchSetSelected(boolean arg0) {
        ((android.view.ViewGroup) real).dispatchSetSelected(arg0);
    }

    public void dispatchStartTemporaryDetach() {
        ((android.view.ViewGroup) real).dispatchStartTemporaryDetach();
    }

    public void dispatchSystemUiVisibilityChanged(int arg0) {
        ((android.view.ViewGroup) real).dispatchSystemUiVisibilityChanged(arg0);
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.ViewGroup) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.ViewGroup) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchUnhandledMove(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return ((android.view.ViewGroup) real).dispatchUnhandledMove(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void dispatchWindowFocusChanged(boolean arg0) {
        ((android.view.ViewGroup) real).dispatchWindowFocusChanged(arg0);
    }

    public void dispatchWindowInsetsAnimationEnd(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
        ((android.view.ViewGroup) real).dispatchWindowInsetsAnimationEnd(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchWindowInsetsAnimationPrepare(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
        ((android.view.ViewGroup) real).dispatchWindowInsetsAnimationPrepare(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0, com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds arg1) {
        return com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds.wrap(((android.view.ViewGroup) real).dispatchWindowInsetsAnimationStart(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void dispatchWindowSystemUiVisiblityChanged(int arg0) {
        ((android.view.ViewGroup) real).dispatchWindowSystemUiVisiblityChanged(arg0);
    }

    public void dispatchWindowVisibilityChanged(int arg0) {
        ((android.view.ViewGroup) real).dispatchWindowVisibilityChanged(arg0);
    }

    public void endViewTransition(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).endViewTransition(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View findFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ViewGroup) real).findFocus());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(((android.view.ViewGroup) real).findOnBackInvokedDispatcherForChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View focusSearch(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ViewGroup) real).focusSearch(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void focusableViewAvailable(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).focusableViewAvailable(arg0 == null ? null : arg0.getReal());
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return ((android.view.ViewGroup) real).gatherTransparentRegion(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams.wrap(((android.view.ViewGroup) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.view.ViewGroup) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getChildAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ViewGroup) real).getChildAt(arg0));
    }

    public int getChildCount() {
        return ((android.view.ViewGroup) real).getChildCount();
    }

    public int getChildDrawingOrder(int arg0) {
        return ((android.view.ViewGroup) real).getChildDrawingOrder(arg0);
    }

    public static int getChildMeasureSpec(int arg0, int arg1, int arg2) {
        return android.view.ViewGroup.getChildMeasureSpec(arg0, arg1, arg2);
    }

    public boolean getChildVisibleRect(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2) {
        return ((android.view.ViewGroup) real).getChildVisibleRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean getClipChildren() {
        return ((android.view.ViewGroup) real).getClipChildren();
    }

    public boolean getClipToPadding() {
        return ((android.view.ViewGroup) real).getClipToPadding();
    }

    public int getDescendantFocusability() {
        return ((android.view.ViewGroup) real).getDescendantFocusability();
    }

    public com.micklab.dcg.wrapper.android.view.View getFocusedChild() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ViewGroup) real).getFocusedChild());
    }

    public com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController getLayoutAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController.wrap(((android.view.ViewGroup) real).getLayoutAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener getLayoutAnimationListener() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener.wrap(((android.view.ViewGroup) real).getLayoutAnimationListener());
    }

    public int getLayoutMode() {
        return ((android.view.ViewGroup) real).getLayoutMode();
    }

    public com.micklab.dcg.wrapper.android.animation.LayoutTransition getLayoutTransition() {
        return com.micklab.dcg.wrapper.android.animation.LayoutTransition.wrap(((android.view.ViewGroup) real).getLayoutTransition());
    }

    public int getNestedScrollAxes() {
        return ((android.view.ViewGroup) real).getNestedScrollAxes();
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroupOverlay getOverlay() {
        return com.micklab.dcg.wrapper.android.view.ViewGroupOverlay.wrap(((android.view.ViewGroup) real).getOverlay());
    }

    public int getPersistentDrawingCache() {
        return ((android.view.ViewGroup) real).getPersistentDrawingCache();
    }

    public boolean getTouchscreenBlocksFocus() {
        return ((android.view.ViewGroup) real).getTouchscreenBlocksFocus();
    }

    public boolean hasFocus() {
        return ((android.view.ViewGroup) real).hasFocus();
    }

    public boolean hasTransientState() {
        return ((android.view.ViewGroup) real).hasTransientState();
    }

    public int indexOfChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.ViewGroup) real).indexOfChild(arg0 == null ? null : arg0.getReal());
    }

    public void invalidateChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        ((android.view.ViewGroup) real).invalidateChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent invalidateChildInParent(int[] arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(((android.view.ViewGroup) real).invalidateChildInParent(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public boolean isAlwaysDrawnWithCacheEnabled() {
        return ((android.view.ViewGroup) real).isAlwaysDrawnWithCacheEnabled();
    }

    public boolean isAnimationCacheEnabled() {
        return ((android.view.ViewGroup) real).isAnimationCacheEnabled();
    }

    public boolean isLayoutSuppressed() {
        return ((android.view.ViewGroup) real).isLayoutSuppressed();
    }

    public boolean isMotionEventSplittingEnabled() {
        return ((android.view.ViewGroup) real).isMotionEventSplittingEnabled();
    }

    public boolean isTransitionGroup() {
        return ((android.view.ViewGroup) real).isTransitionGroup();
    }

    public void jumpDrawablesToCurrentState() {
        ((android.view.ViewGroup) real).jumpDrawablesToCurrentState();
    }

    public void layout(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.ViewGroup) real).layout(arg0, arg1, arg2, arg3);
    }

    public void notifySubtreeAccessibilityStateChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.view.ViewGroup) real).notifySubtreeAccessibilityStateChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void offsetDescendantRectToMyCoords(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        ((android.view.ViewGroup) real).offsetDescendantRectToMyCoords(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void offsetRectIntoDescendantCoords(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        ((android.view.ViewGroup) real).offsetRectIntoDescendantCoords(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onDescendantInvalidated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.view.ViewGroup) real).onDescendantInvalidated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onInterceptHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.ViewGroup) real).onInterceptHoverEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.ViewGroup) real).onInterceptTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onNestedFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2, boolean arg3) {
        return ((android.view.ViewGroup) real).onNestedFling(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public boolean onNestedPreFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return ((android.view.ViewGroup) real).onNestedPreFling(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean onNestedPrePerformAccessibilityAction(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.view.ViewGroup) real).onNestedPrePerformAccessibilityAction(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onNestedPreScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int[] arg3) {
        ((android.view.ViewGroup) real).onNestedPreScroll(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.view.ViewGroup) real).onNestedScroll(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void onNestedScrollAccepted(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.view.ViewGroup) real).onNestedScrollAccepted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onRequestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
        return ((android.view.ViewGroup) real).onRequestSendAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.view.ViewGroup) real).onResolvePointerIcon(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return ((android.view.ViewGroup) real).onStartNestedScroll(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onStopNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).onStopNestedScroll(arg0 == null ? null : arg0.getReal());
    }

    public void onViewAdded(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).onViewAdded(arg0 == null ? null : arg0.getReal());
    }

    public void onViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).onViewRemoved(arg0 == null ? null : arg0.getReal());
    }

    public void recomputeViewAttributes(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).recomputeViewAttributes(arg0 == null ? null : arg0.getReal());
    }

    public void removeAllViews() {
        ((android.view.ViewGroup) real).removeAllViews();
    }

    public void removeAllViewsInLayout() {
        ((android.view.ViewGroup) real).removeAllViewsInLayout();
    }

    public void removeView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).removeView(arg0 == null ? null : arg0.getReal());
    }

    public void removeViewAt(int arg0) {
        ((android.view.ViewGroup) real).removeViewAt(arg0);
    }

    public void removeViewInLayout(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).removeViewInLayout(arg0 == null ? null : arg0.getReal());
    }

    public void removeViews(int arg0, int arg1) {
        ((android.view.ViewGroup) real).removeViews(arg0, arg1);
    }

    public void removeViewsInLayout(int arg0, int arg1) {
        ((android.view.ViewGroup) real).removeViewsInLayout(arg0, arg1);
    }

    public void requestChildFocus(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.view.ViewGroup) real).requestChildFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return ((android.view.ViewGroup) real).requestChildRectangleOnScreen(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg0) {
        ((android.view.ViewGroup) real).requestDisallowInterceptTouchEvent(arg0);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return ((android.view.ViewGroup) real).requestFocus(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean requestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
        return ((android.view.ViewGroup) real).requestSendAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void requestTransparentRegion(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).requestTransparentRegion(arg0 == null ? null : arg0.getReal());
    }

    public boolean restoreDefaultFocus() {
        return ((android.view.ViewGroup) real).restoreDefaultFocus();
    }

    public void scheduleLayoutAnimation() {
        ((android.view.ViewGroup) real).scheduleLayoutAnimation();
    }

    public void setAddStatesFromChildren(boolean arg0) {
        ((android.view.ViewGroup) real).setAddStatesFromChildren(arg0);
    }

    public void setAlwaysDrawnWithCacheEnabled(boolean arg0) {
        ((android.view.ViewGroup) real).setAlwaysDrawnWithCacheEnabled(arg0);
    }

    public void setAnimationCacheEnabled(boolean arg0) {
        ((android.view.ViewGroup) real).setAnimationCacheEnabled(arg0);
    }

    public void setClipChildren(boolean arg0) {
        ((android.view.ViewGroup) real).setClipChildren(arg0);
    }

    public void setClipToPadding(boolean arg0) {
        ((android.view.ViewGroup) real).setClipToPadding(arg0);
    }

    public void setDescendantFocusability(int arg0) {
        ((android.view.ViewGroup) real).setDescendantFocusability(arg0);
    }

    public void setLayoutAnimation(com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController arg0) {
        ((android.view.ViewGroup) real).setLayoutAnimation(arg0 == null ? null : arg0.getReal());
    }

    public void setLayoutAnimationListener(com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener arg0) {
        ((android.view.ViewGroup) real).setLayoutAnimationListener(arg0 == null ? null : arg0.getReal());
    }

    public void setLayoutMode(int arg0) {
        ((android.view.ViewGroup) real).setLayoutMode(arg0);
    }

    public void setLayoutTransition(com.micklab.dcg.wrapper.android.animation.LayoutTransition arg0) {
        ((android.view.ViewGroup) real).setLayoutTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setMotionEventSplittingEnabled(boolean arg0) {
        ((android.view.ViewGroup) real).setMotionEventSplittingEnabled(arg0);
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        ((android.view.ViewGroup) real).setOnHierarchyChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPersistentDrawingCache(int arg0) {
        ((android.view.ViewGroup) real).setPersistentDrawingCache(arg0);
    }

    public void setTouchscreenBlocksFocus(boolean arg0) {
        ((android.view.ViewGroup) real).setTouchscreenBlocksFocus(arg0);
    }

    public void setTransitionGroup(boolean arg0) {
        ((android.view.ViewGroup) real).setTransitionGroup(arg0);
    }

    public void setWindowInsetsAnimationCallback(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback arg0) {
        ((android.view.ViewGroup) real).setWindowInsetsAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

    public boolean shouldDelayChildPressedState() {
        return ((android.view.ViewGroup) real).shouldDelayChildPressedState();
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.ViewGroup) real).showContextMenuForChild(arg0 == null ? null : arg0.getReal());
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return ((android.view.ViewGroup) real).showContextMenuForChild(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionModeForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.ViewGroup) real).startActionModeForChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionModeForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.ViewGroup) real).startActionModeForChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public void startLayoutAnimation() {
        ((android.view.ViewGroup) real).startLayoutAnimation();
    }

    public void startViewTransition(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroup) real).startViewTransition(arg0 == null ? null : arg0.getReal());
    }

    public void suppressLayout(boolean arg0) {
        ((android.view.ViewGroup) real).suppressLayout(arg0);
    }

    public void updateViewLayout(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.view.ViewGroup) real).updateViewLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams wrap(android.view.ViewGroup.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewGroup.LayoutParams getReal() {
            return (android.view.ViewGroup.LayoutParams) real;
        }

        public android.view.ViewGroup.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.view.ViewGroup.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.view.ViewGroup.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.view.ViewGroup.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public void resolveLayoutDirection(int arg0) {
            ((android.view.ViewGroup.LayoutParams) real).resolveLayoutDirection(arg0);
        }

        public static final int FILL_PARENT = android.view.ViewGroup.LayoutParams.FILL_PARENT;
        public static final int MATCH_PARENT = android.view.ViewGroup.LayoutParams.MATCH_PARENT;
        public static final int WRAP_CONTENT = android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

    }
    public static final class MarginLayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MarginLayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams wrap(android.view.ViewGroup.MarginLayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewGroup.MarginLayoutParams getReal() {
            return (android.view.ViewGroup.MarginLayoutParams) real;
        }

        public android.view.ViewGroup.MarginLayoutParams unwrap() {
            return getReal();
        }

        public MarginLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public MarginLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public MarginLayoutParams(int arg0, int arg1) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public MarginLayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.view.ViewGroup.MarginLayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public int getLayoutDirection() {
            return ((android.view.ViewGroup.MarginLayoutParams) real).getLayoutDirection();
        }

        public int getMarginEnd() {
            return ((android.view.ViewGroup.MarginLayoutParams) real).getMarginEnd();
        }

        public int getMarginStart() {
            return ((android.view.ViewGroup.MarginLayoutParams) real).getMarginStart();
        }

        public boolean isMarginRelative() {
            return ((android.view.ViewGroup.MarginLayoutParams) real).isMarginRelative();
        }

        public void resolveLayoutDirection(int arg0) {
            ((android.view.ViewGroup.MarginLayoutParams) real).resolveLayoutDirection(arg0);
        }

        public void setLayoutDirection(int arg0) {
            ((android.view.ViewGroup.MarginLayoutParams) real).setLayoutDirection(arg0);
        }

        public void setMarginEnd(int arg0) {
            ((android.view.ViewGroup.MarginLayoutParams) real).setMarginEnd(arg0);
        }

        public void setMarginStart(int arg0) {
            ((android.view.ViewGroup.MarginLayoutParams) real).setMarginStart(arg0);
        }

        public void setMargins(int arg0, int arg1, int arg2, int arg3) {
            ((android.view.ViewGroup.MarginLayoutParams) real).setMargins(arg0, arg1, arg2, arg3);
        }


    }
    public static final class OnHierarchyChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnHierarchyChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener wrap(android.view.ViewGroup.OnHierarchyChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewGroup.OnHierarchyChangeListener getReal() {
            return (android.view.ViewGroup.OnHierarchyChangeListener) real;
        }

        public android.view.ViewGroup.OnHierarchyChangeListener unwrap() {
            return getReal();
        }

        public void onChildViewAdded(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            ((android.view.ViewGroup.OnHierarchyChangeListener) real).onChildViewAdded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onChildViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            ((android.view.ViewGroup.OnHierarchyChangeListener) real).onChildViewRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
