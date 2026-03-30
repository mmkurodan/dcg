// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewParent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewParent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewParent wrap(android.view.ViewParent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewParent(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewParent getReal() {
        return (android.view.ViewParent) real;
    }

    public android.view.ViewParent unwrap() {
        return getReal();
    }

    public void bringChildToFront(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewParent) real).bringChildToFront(arg0 == null ? null : arg0.getReal());
    }

    public boolean canResolveLayoutDirection() {
        return ((android.view.ViewParent) real).canResolveLayoutDirection();
    }

    public boolean canResolveTextAlignment() {
        return ((android.view.ViewParent) real).canResolveTextAlignment();
    }

    public boolean canResolveTextDirection() {
        return ((android.view.ViewParent) real).canResolveTextDirection();
    }

    public void childDrawableStateChanged(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewParent) real).childDrawableStateChanged(arg0 == null ? null : arg0.getReal());
    }

    public void childHasTransientStateChanged(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        ((android.view.ViewParent) real).childHasTransientStateChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void clearChildFocus(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewParent) real).clearChildFocus(arg0 == null ? null : arg0.getReal());
    }

    public void createContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0) {
        ((android.view.ViewParent) real).createContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(((android.view.ViewParent) real).findOnBackInvokedDispatcherForChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View focusSearch(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ViewParent) real).focusSearch(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void focusableViewAvailable(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewParent) real).focusableViewAvailable(arg0 == null ? null : arg0.getReal());
    }

    public boolean getChildVisibleRect(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2) {
        return ((android.view.ViewParent) real).getChildVisibleRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int getLayoutDirection() {
        return ((android.view.ViewParent) real).getLayoutDirection();
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParent() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(((android.view.ViewParent) real).getParent());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParentForAccessibility() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(((android.view.ViewParent) real).getParentForAccessibility());
    }

    public int getTextAlignment() {
        return ((android.view.ViewParent) real).getTextAlignment();
    }

    public int getTextDirection() {
        return ((android.view.ViewParent) real).getTextDirection();
    }

    public void invalidateChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        ((android.view.ViewParent) real).invalidateChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent invalidateChildInParent(int[] arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(((android.view.ViewParent) real).invalidateChildInParent(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public boolean isLayoutDirectionResolved() {
        return ((android.view.ViewParent) real).isLayoutDirectionResolved();
    }

    public boolean isLayoutRequested() {
        return ((android.view.ViewParent) real).isLayoutRequested();
    }

    public boolean isTextAlignmentResolved() {
        return ((android.view.ViewParent) real).isTextAlignmentResolved();
    }

    public boolean isTextDirectionResolved() {
        return ((android.view.ViewParent) real).isTextDirectionResolved();
    }

    public com.micklab.dcg.wrapper.android.view.View keyboardNavigationClusterSearch(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ViewParent) real).keyboardNavigationClusterSearch(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void notifySubtreeAccessibilityStateChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.view.ViewParent) real).notifySubtreeAccessibilityStateChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onDescendantInvalidated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.view.ViewParent) real).onDescendantInvalidated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onNestedFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2, boolean arg3) {
        return ((android.view.ViewParent) real).onNestedFling(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public boolean onNestedPreFling(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return ((android.view.ViewParent) real).onNestedPreFling(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean onNestedPrePerformAccessibilityAction(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.view.ViewParent) real).onNestedPrePerformAccessibilityAction(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onNestedPreScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int[] arg3) {
        ((android.view.ViewParent) real).onNestedPreScroll(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.view.ViewParent) real).onNestedScroll(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void onNestedScrollAccepted(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.view.ViewParent) real).onNestedScrollAccepted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean onStartNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        return ((android.view.ViewParent) real).onStartNestedScroll(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onStopNestedScroll(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewParent) real).onStopNestedScroll(arg0 == null ? null : arg0.getReal());
    }

    public void recomputeViewAttributes(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewParent) real).recomputeViewAttributes(arg0 == null ? null : arg0.getReal());
    }

    public void requestChildFocus(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.view.ViewParent) real).requestChildFocus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return ((android.view.ViewParent) real).requestChildRectangleOnScreen(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg0) {
        ((android.view.ViewParent) real).requestDisallowInterceptTouchEvent(arg0);
    }

    public void requestFitSystemWindows() {
        ((android.view.ViewParent) real).requestFitSystemWindows();
    }

    public void requestLayout() {
        ((android.view.ViewParent) real).requestLayout();
    }

    public boolean requestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
        return ((android.view.ViewParent) real).requestSendAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void requestTransparentRegion(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewParent) real).requestTransparentRegion(arg0 == null ? null : arg0.getReal());
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.ViewParent) real).showContextMenuForChild(arg0 == null ? null : arg0.getReal());
    }

    public boolean showContextMenuForChild(com.micklab.dcg.wrapper.android.view.View arg0, float arg1, float arg2) {
        return ((android.view.ViewParent) real).showContextMenuForChild(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionModeForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.ViewParent) real).startActionModeForChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionModeForChild(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.ViewParent) real).startActionModeForChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

}
