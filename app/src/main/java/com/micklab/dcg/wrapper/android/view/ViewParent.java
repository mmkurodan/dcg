// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewParent {
    private final android.view.ViewParent real;

    public ViewParent(android.view.ViewParent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewParent wrap(android.view.ViewParent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewParent(real);
    }

    public android.view.ViewParent unwrap() {
        return real;
    }

    public void bringChildToFront(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.bringChildToFront(arg0 == null ? null : arg0.unwrap());
    }

    public boolean canResolveLayoutDirection() {
        return real.canResolveLayoutDirection();
    }

    public boolean canResolveTextAlignment() {
        return real.canResolveTextAlignment();
    }

    public boolean canResolveTextDirection() {
        return real.canResolveTextDirection();
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

    public void createContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0) {
        real.createContextMenu(arg0 == null ? null : arg0.unwrap());
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

    public boolean getChildVisibleRect(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2) {
        return real.getChildVisibleRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public int getLayoutDirection() {
        return real.getLayoutDirection();
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParent() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(real.getParent());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParentForAccessibility() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(real.getParentForAccessibility());
    }

    public int getTextAlignment() {
        return real.getTextAlignment();
    }

    public int getTextDirection() {
        return real.getTextDirection();
    }

    public void invalidateChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        real.invalidateChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent invalidateChildInParent(int[] arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(real.invalidateChildInParent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public boolean isLayoutDirectionResolved() {
        return real.isLayoutDirectionResolved();
    }

    public boolean isLayoutRequested() {
        return real.isLayoutRequested();
    }

    public boolean isTextAlignmentResolved() {
        return real.isTextAlignmentResolved();
    }

    public boolean isTextDirectionResolved() {
        return real.isTextDirectionResolved();
    }

    public com.micklab.dcg.wrapper.android.view.View keyboardNavigationClusterSearch(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.keyboardNavigationClusterSearch(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void notifySubtreeAccessibilityStateChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        real.notifySubtreeAccessibilityStateChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onDescendantInvalidated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.onDescendantInvalidated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
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

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return real.onStartNestedScroll(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onStopNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onStopNestedScroll(arg0 == null ? null : arg0.unwrap());
    }

    public void recomputeViewAttributes(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.recomputeViewAttributes(arg0 == null ? null : arg0.unwrap());
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

    public void requestFitSystemWindows() {
        real.requestFitSystemWindows();
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public boolean requestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
        return real.requestSendAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void requestTransparentRegion(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.requestTransparentRegion(arg0 == null ? null : arg0.unwrap());
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

}
