// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class View {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private View(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.View wrap(android.view.View real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.View(real, (__DcgwBridgeToken) null);
    }

    public android.view.View getReal() {
        return (android.view.View) real;
    }

    public android.view.View unwrap() {
        return getReal();
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.View(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.View(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.view.View(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.view.View(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.view.View) real).addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void addOnAttachStateChangeListener(com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener arg0) {
        ((android.view.View) real).addOnAttachStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnLayoutChangeListener(com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener arg0) {
        ((android.view.View) real).addOnLayoutChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnUnhandledKeyEventListener(com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener arg0) {
        ((android.view.View) real).addOnUnhandledKeyEventListener(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator animate() {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(((android.view.View) real).animate());
    }

    public void announceForAccessibility(java.lang.CharSequence arg0) {
        ((android.view.View) real).announceForAccessibility(arg0);
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.view.View) real).autofill(arg0 == null ? null : arg0.getReal());
    }

    public void bringToFront() {
        ((android.view.View) real).bringToFront();
    }

    public void buildDrawingCache() {
        ((android.view.View) real).buildDrawingCache();
    }

    public void buildDrawingCache(boolean arg0) {
        ((android.view.View) real).buildDrawingCache(arg0);
    }

    public void buildLayer() {
        ((android.view.View) real).buildLayer();
    }

    public boolean callOnClick() {
        return ((android.view.View) real).callOnClick();
    }

    public boolean canResolveLayoutDirection() {
        return ((android.view.View) real).canResolveLayoutDirection();
    }

    public boolean canResolveTextAlignment() {
        return ((android.view.View) real).canResolveTextAlignment();
    }

    public boolean canResolveTextDirection() {
        return ((android.view.View) real).canResolveTextDirection();
    }

    public boolean canScrollHorizontally(int arg0) {
        return ((android.view.View) real).canScrollHorizontally(arg0);
    }

    public boolean canScrollVertically(int arg0) {
        return ((android.view.View) real).canScrollVertically(arg0);
    }

    public void cancelDragAndDrop() {
        ((android.view.View) real).cancelDragAndDrop();
    }

    public void cancelLongPress() {
        ((android.view.View) real).cancelLongPress();
    }

    public void cancelPendingInputEvents() {
        ((android.view.View) real).cancelPendingInputEvents();
    }

    public boolean checkInputConnectionProxy(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.View) real).checkInputConnectionProxy(arg0 == null ? null : arg0.getReal());
    }

    public void clearAnimation() {
        ((android.view.View) real).clearAnimation();
    }

    public void clearFocus() {
        ((android.view.View) real).clearFocus();
    }

    public void clearPendingCredentialRequest() {
        ((android.view.View) real).clearPendingCredentialRequest();
    }

    public void clearViewTranslationCallback() {
        ((android.view.View) real).clearViewTranslationCallback();
    }

    public static int combineMeasuredStates(int arg0, int arg1) {
        return android.view.View.combineMeasuredStates(arg0, arg1);
    }

    public void computeScroll() {
        ((android.view.View) real).computeScroll();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets computeSystemWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.View) real).computeSystemWindowInsets(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.view.View) real).createAccessibilityNodeInfo());
    }

    public void createContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0) {
        ((android.view.View) real).createContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public void destroyDrawingCache() {
        ((android.view.View) real).destroyDrawingCache();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets dispatchApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.View) real).dispatchApplyWindowInsets(arg0 == null ? null : arg0.getReal()));
    }

    public boolean dispatchCapturedPointerEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).dispatchCapturedPointerEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.view.View) real).dispatchConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchDisplayHint(int arg0) {
        ((android.view.View) real).dispatchDisplayHint(arg0);
    }

    public boolean dispatchDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return ((android.view.View) real).dispatchDragEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchDrawableHotspotChanged(float arg0, float arg1) {
        ((android.view.View) real).dispatchDrawableHotspotChanged(arg0, arg1);
    }

    public void dispatchFinishTemporaryDetach() {
        ((android.view.View) real).dispatchFinishTemporaryDetach();
    }

    public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).dispatchGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.View) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyEventPreIme(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.View) real).dispatchKeyEventPreIme(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.View) real).dispatchKeyShortcutEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchNestedFling(float arg0, float arg1, boolean arg2) {
        return ((android.view.View) real).dispatchNestedFling(arg0, arg1, arg2);
    }

    public boolean dispatchNestedPreFling(float arg0, float arg1) {
        return ((android.view.View) real).dispatchNestedPreFling(arg0, arg1);
    }

    public boolean dispatchNestedPrePerformAccessibilityAction(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.view.View) real).dispatchNestedPrePerformAccessibilityAction(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean dispatchNestedPreScroll(int arg0, int arg1, int[] arg2, int[] arg3) {
        return ((android.view.View) real).dispatchNestedPreScroll(arg0, arg1, arg2, arg3);
    }

    public boolean dispatchNestedScroll(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        return ((android.view.View) real).dispatchNestedScroll(arg0, arg1, arg2, arg3, arg4);
    }

    public void dispatchPointerCaptureChanged(boolean arg0) {
        ((android.view.View) real).dispatchPointerCaptureChanged(arg0);
    }

    public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        return ((android.view.View) real).dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.view.View) real).dispatchProvideAutofillStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void dispatchProvideStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        ((android.view.View) real).dispatchProvideStructure(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchStartTemporaryDetach() {
        ((android.view.View) real).dispatchStartTemporaryDetach();
    }

    public void dispatchSystemUiVisibilityChanged(int arg0) {
        ((android.view.View) real).dispatchSystemUiVisibilityChanged(arg0);
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchUnhandledMove(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return ((android.view.View) real).dispatchUnhandledMove(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void dispatchWindowFocusChanged(boolean arg0) {
        ((android.view.View) real).dispatchWindowFocusChanged(arg0);
    }

    public void dispatchWindowInsetsAnimationEnd(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
        ((android.view.View) real).dispatchWindowInsetsAnimationEnd(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchWindowInsetsAnimationPrepare(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
        ((android.view.View) real).dispatchWindowInsetsAnimationPrepare(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0, com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds arg1) {
        return com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds.wrap(((android.view.View) real).dispatchWindowInsetsAnimationStart(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void dispatchWindowSystemUiVisiblityChanged(int arg0) {
        ((android.view.View) real).dispatchWindowSystemUiVisiblityChanged(arg0);
    }

    public void dispatchWindowVisibilityChanged(int arg0) {
        ((android.view.View) real).dispatchWindowVisibilityChanged(arg0);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.View) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        ((android.view.View) real).drawableHotspotChanged(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View findFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.View) real).findFocus());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(((android.view.View) real).findOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.view.View focusSearch(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.View) real).focusSearch(arg0));
    }

    public void forceHasOverlappingRendering(boolean arg0) {
        ((android.view.View) real).forceHasOverlappingRendering(arg0);
    }

    public void forceLayout() {
        ((android.view.View) real).forceLayout();
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return ((android.view.View) real).gatherTransparentRegion(arg0 == null ? null : arg0.getReal());
    }

    public void generateDisplayHash(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashResultCallback arg3) {
        ((android.view.View) real).generateDisplayHash(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public static int generateViewId() {
        return android.view.View.generateViewId();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.view.View) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate getAccessibilityDelegate() {
        return com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate.wrap(((android.view.View) real).getAccessibilityDelegate());
    }

    public int getAccessibilityLiveRegion() {
        return ((android.view.View) real).getAccessibilityLiveRegion();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(((android.view.View) real).getAccessibilityNodeProvider());
    }

    public java.lang.CharSequence getAccessibilityPaneTitle() {
        return ((android.view.View) real).getAccessibilityPaneTitle();
    }

    public int getAccessibilityTraversalAfter() {
        return ((android.view.View) real).getAccessibilityTraversalAfter();
    }

    public int getAccessibilityTraversalBefore() {
        return ((android.view.View) real).getAccessibilityTraversalBefore();
    }

    public java.lang.String getAllowedHandwritingDelegatePackageName() {
        return ((android.view.View) real).getAllowedHandwritingDelegatePackageName();
    }

    public java.lang.String getAllowedHandwritingDelegatorPackageName() {
        return ((android.view.View) real).getAllowedHandwritingDelegatorPackageName();
    }

    public float getAlpha() {
        return ((android.view.View) real).getAlpha();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(((android.view.View) real).getAnimation());
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getAnimationMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(((android.view.View) real).getAnimationMatrix());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getApplicationWindowToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.view.View) real).getApplicationWindowToken());
    }

    public int[] getAttributeResolutionStack(int arg0) {
        return ((android.view.View) real).getAttributeResolutionStack(arg0);
    }

    public java.lang.String[] getAutofillHints() {
        return ((android.view.View) real).getAutofillHints();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.view.View) real).getAutofillId());
    }

    public int getAutofillType() {
        return ((android.view.View) real).getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.view.View) real).getAutofillValue());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.View) real).getBackground());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getBackgroundTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.view.View) real).getBackgroundTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getBackgroundTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.view.View) real).getBackgroundTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(((android.view.View) real).getBackgroundTintMode());
    }

    public int getBaseline() {
        return ((android.view.View) real).getBaseline();
    }

    public int getBottom() {
        return ((android.view.View) real).getBottom();
    }

    public float getCameraDistance() {
        return ((android.view.View) real).getCameraDistance();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getClipBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.View) real).getClipBounds());
    }

    public boolean getClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.view.View) real).getClipBounds(arg0 == null ? null : arg0.getReal());
    }

    public boolean getClipToOutline() {
        return ((android.view.View) real).getClipToOutline();
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession getContentCaptureSession() {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession.wrap(((android.view.View) real).getContentCaptureSession());
    }

    public java.lang.CharSequence getContentDescription() {
        return ((android.view.View) real).getContentDescription();
    }

    public int getContentSensitivity() {
        return ((android.view.View) real).getContentSensitivity();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.view.View) real).getContext());
    }

    public boolean getDefaultFocusHighlightEnabled() {
        return ((android.view.View) real).getDefaultFocusHighlightEnabled();
    }

    public static int getDefaultSize(int arg0, int arg1) {
        return android.view.View.getDefaultSize(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(((android.view.View) real).getDisplay());
    }

    public int[] getDrawableState() {
        return ((android.view.View) real).getDrawableState();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getDrawingCache() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.view.View) real).getDrawingCache());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getDrawingCache(boolean arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.view.View) real).getDrawingCache(arg0));
    }

    public int getDrawingCacheBackgroundColor() {
        return ((android.view.View) real).getDrawingCacheBackgroundColor();
    }

    public int getDrawingCacheQuality() {
        return ((android.view.View) real).getDrawingCacheQuality();
    }

    public void getDrawingRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.View) real).getDrawingRect(arg0 == null ? null : arg0.getReal());
    }

    public long getDrawingTime() {
        return ((android.view.View) real).getDrawingTime();
    }

    public float getElevation() {
        return ((android.view.View) real).getElevation();
    }

    public int getExplicitStyle() {
        return ((android.view.View) real).getExplicitStyle();
    }

    public boolean getFilterTouchesWhenObscured() {
        return ((android.view.View) real).getFilterTouchesWhenObscured();
    }

    public boolean getFitsSystemWindows() {
        return ((android.view.View) real).getFitsSystemWindows();
    }

    public int getFocusable() {
        return ((android.view.View) real).getFocusable();
    }

    public void getFocusedRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.View) real).getFocusedRect(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getForeground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.View) real).getForeground());
    }

    public int getForegroundGravity() {
        return ((android.view.View) real).getForegroundGravity();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getForegroundTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.view.View) real).getForegroundTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getForegroundTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.view.View) real).getForegroundTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getForegroundTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(((android.view.View) real).getForegroundTintMode());
    }

    public float getFrameContentVelocity() {
        return ((android.view.View) real).getFrameContentVelocity();
    }

    public boolean getGlobalVisibleRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.view.View) real).getGlobalVisibleRect(arg0 == null ? null : arg0.getReal());
    }

    public boolean getGlobalVisibleRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1) {
        return ((android.view.View) real).getGlobalVisibleRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Handler getHandler() {
        return com.micklab.dcg.wrapper.android.os.Handler.wrap(((android.view.View) real).getHandler());
    }

    public float getHandwritingBoundsOffsetBottom() {
        return ((android.view.View) real).getHandwritingBoundsOffsetBottom();
    }

    public float getHandwritingBoundsOffsetLeft() {
        return ((android.view.View) real).getHandwritingBoundsOffsetLeft();
    }

    public float getHandwritingBoundsOffsetRight() {
        return ((android.view.View) real).getHandwritingBoundsOffsetRight();
    }

    public float getHandwritingBoundsOffsetTop() {
        return ((android.view.View) real).getHandwritingBoundsOffsetTop();
    }

    public int getHandwritingDelegateFlags() {
        return ((android.view.View) real).getHandwritingDelegateFlags();
    }

    public java.lang.Runnable getHandwritingDelegatorCallback() {
        return ((android.view.View) real).getHandwritingDelegatorCallback();
    }

    public boolean getHasOverlappingRendering() {
        return ((android.view.View) real).getHasOverlappingRendering();
    }

    public int getHeight() {
        return ((android.view.View) real).getHeight();
    }

    public void getHitRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.View) real).getHitRect(arg0 == null ? null : arg0.getReal());
    }

    public int getHorizontalFadingEdgeLength() {
        return ((android.view.View) real).getHorizontalFadingEdgeLength();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getHorizontalScrollbarThumbDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.View) real).getHorizontalScrollbarThumbDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getHorizontalScrollbarTrackDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.View) real).getHorizontalScrollbarTrackDrawable());
    }

    public int getId() {
        return ((android.view.View) real).getId();
    }

    public int getImportantForAccessibility() {
        return ((android.view.View) real).getImportantForAccessibility();
    }

    public int getImportantForAutofill() {
        return ((android.view.View) real).getImportantForAutofill();
    }

    public int getImportantForContentCapture() {
        return ((android.view.View) real).getImportantForContentCapture();
    }

    public boolean getKeepScreenOn() {
        return ((android.view.View) real).getKeepScreenOn();
    }

    public com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState getKeyDispatcherState() {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState.wrap(((android.view.View) real).getKeyDispatcherState());
    }

    public int getLabelFor() {
        return ((android.view.View) real).getLabelFor();
    }

    public int getLayerType() {
        return ((android.view.View) real).getLayerType();
    }

    public int getLayoutDirection() {
        return ((android.view.View) real).getLayoutDirection();
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams getLayoutParams() {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams.wrap(((android.view.View) real).getLayoutParams());
    }

    public int getLeft() {
        return ((android.view.View) real).getLeft();
    }

    public boolean getLocalVisibleRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.view.View) real).getLocalVisibleRect(arg0 == null ? null : arg0.getReal());
    }

    public void getLocationInSurface(int[] arg0) {
        ((android.view.View) real).getLocationInSurface(arg0);
    }

    public void getLocationInWindow(int[] arg0) {
        ((android.view.View) real).getLocationInWindow(arg0);
    }

    public void getLocationOnScreen(int[] arg0) {
        ((android.view.View) real).getLocationOnScreen(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(((android.view.View) real).getMatrix());
    }

    public int getMeasuredHeight() {
        return ((android.view.View) real).getMeasuredHeight();
    }

    public int getMeasuredHeightAndState() {
        return ((android.view.View) real).getMeasuredHeightAndState();
    }

    public int getMeasuredState() {
        return ((android.view.View) real).getMeasuredState();
    }

    public int getMeasuredWidth() {
        return ((android.view.View) real).getMeasuredWidth();
    }

    public int getMeasuredWidthAndState() {
        return ((android.view.View) real).getMeasuredWidthAndState();
    }

    public int getMinimumHeight() {
        return ((android.view.View) real).getMinimumHeight();
    }

    public int getMinimumWidth() {
        return ((android.view.View) real).getMinimumWidth();
    }

    public int getNextClusterForwardId() {
        return ((android.view.View) real).getNextClusterForwardId();
    }

    public int getNextFocusDownId() {
        return ((android.view.View) real).getNextFocusDownId();
    }

    public int getNextFocusForwardId() {
        return ((android.view.View) real).getNextFocusForwardId();
    }

    public int getNextFocusLeftId() {
        return ((android.view.View) real).getNextFocusLeftId();
    }

    public int getNextFocusRightId() {
        return ((android.view.View) real).getNextFocusRightId();
    }

    public int getNextFocusUpId() {
        return ((android.view.View) real).getNextFocusUpId();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
        return com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener.wrap(((android.view.View) real).getOnFocusChangeListener());
    }

    public int getOutlineAmbientShadowColor() {
        return ((android.view.View) real).getOutlineAmbientShadowColor();
    }

    public com.micklab.dcg.wrapper.android.view.ViewOutlineProvider getOutlineProvider() {
        return com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(((android.view.View) real).getOutlineProvider());
    }

    public int getOutlineSpotShadowColor() {
        return ((android.view.View) real).getOutlineSpotShadowColor();
    }

    public int getOverScrollMode() {
        return ((android.view.View) real).getOverScrollMode();
    }

    public com.micklab.dcg.wrapper.android.view.ViewOverlay getOverlay() {
        return com.micklab.dcg.wrapper.android.view.ViewOverlay.wrap(((android.view.View) real).getOverlay());
    }

    public int getPaddingBottom() {
        return ((android.view.View) real).getPaddingBottom();
    }

    public int getPaddingEnd() {
        return ((android.view.View) real).getPaddingEnd();
    }

    public int getPaddingLeft() {
        return ((android.view.View) real).getPaddingLeft();
    }

    public int getPaddingRight() {
        return ((android.view.View) real).getPaddingRight();
    }

    public int getPaddingStart() {
        return ((android.view.View) real).getPaddingStart();
    }

    public int getPaddingTop() {
        return ((android.view.View) real).getPaddingTop();
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParent() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(((android.view.View) real).getParent());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParentForAccessibility() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(((android.view.View) real).getParentForAccessibility());
    }

    public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest getPendingCredentialRequest() {
        return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.wrap(((android.view.View) real).getPendingCredentialRequest());
    }

    public float getPivotX() {
        return ((android.view.View) real).getPivotX();
    }

    public float getPivotY() {
        return ((android.view.View) real).getPivotY();
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon getPointerIcon() {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.view.View) real).getPointerIcon());
    }

    public java.lang.String[] getReceiveContentMimeTypes() {
        return ((android.view.View) real).getReceiveContentMimeTypes();
    }

    public float getRequestedFrameRate() {
        return ((android.view.View) real).getRequestedFrameRate();
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(((android.view.View) real).getResources());
    }

    public boolean getRevealOnFocusHint() {
        return ((android.view.View) real).getRevealOnFocusHint();
    }

    public int getRight() {
        return ((android.view.View) real).getRight();
    }

    public com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl getRootSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.wrap(((android.view.View) real).getRootSurfaceControl());
    }

    public com.micklab.dcg.wrapper.android.view.View getRootView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.View) real).getRootView());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets getRootWindowInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.View) real).getRootWindowInsets());
    }

    public float getRotation() {
        return ((android.view.View) real).getRotation();
    }

    public float getRotationX() {
        return ((android.view.View) real).getRotationX();
    }

    public float getRotationY() {
        return ((android.view.View) real).getRotationY();
    }

    public float getScaleX() {
        return ((android.view.View) real).getScaleX();
    }

    public float getScaleY() {
        return ((android.view.View) real).getScaleY();
    }

    public int getScrollBarDefaultDelayBeforeFade() {
        return ((android.view.View) real).getScrollBarDefaultDelayBeforeFade();
    }

    public int getScrollBarFadeDuration() {
        return ((android.view.View) real).getScrollBarFadeDuration();
    }

    public int getScrollBarSize() {
        return ((android.view.View) real).getScrollBarSize();
    }

    public int getScrollBarStyle() {
        return ((android.view.View) real).getScrollBarStyle();
    }

    public int getScrollCaptureHint() {
        return ((android.view.View) real).getScrollCaptureHint();
    }

    public int getScrollIndicators() {
        return ((android.view.View) real).getScrollIndicators();
    }

    public int getScrollX() {
        return ((android.view.View) real).getScrollX();
    }

    public int getScrollY() {
        return ((android.view.View) real).getScrollY();
    }

    public int getSolidColor() {
        return ((android.view.View) real).getSolidColor();
    }

    public int getSourceLayoutResId() {
        return ((android.view.View) real).getSourceLayoutResId();
    }

    public java.lang.CharSequence getStateDescription() {
        return ((android.view.View) real).getStateDescription();
    }

    public com.micklab.dcg.wrapper.android.animation.StateListAnimator getStateListAnimator() {
        return com.micklab.dcg.wrapper.android.animation.StateListAnimator.wrap(((android.view.View) real).getStateListAnimator());
    }

    public java.lang.CharSequence getSupplementalDescription() {
        return ((android.view.View) real).getSupplementalDescription();
    }

    public int getSystemUiVisibility() {
        return ((android.view.View) real).getSystemUiVisibility();
    }

    public java.lang.Object getTag() {
        return ((android.view.View) real).getTag();
    }

    public java.lang.Object getTag(int arg0) {
        return ((android.view.View) real).getTag(arg0);
    }

    public int getTextAlignment() {
        return ((android.view.View) real).getTextAlignment();
    }

    public int getTextDirection() {
        return ((android.view.View) real).getTextDirection();
    }

    public java.lang.CharSequence getTooltipText() {
        return ((android.view.View) real).getTooltipText();
    }

    public int getTop() {
        return ((android.view.View) real).getTop();
    }

    public com.micklab.dcg.wrapper.android.view.TouchDelegate getTouchDelegate() {
        return com.micklab.dcg.wrapper.android.view.TouchDelegate.wrap(((android.view.View) real).getTouchDelegate());
    }

    public float getTransitionAlpha() {
        return ((android.view.View) real).getTransitionAlpha();
    }

    public java.lang.String getTransitionName() {
        return ((android.view.View) real).getTransitionName();
    }

    public float getTranslationX() {
        return ((android.view.View) real).getTranslationX();
    }

    public float getTranslationY() {
        return ((android.view.View) real).getTranslationY();
    }

    public float getTranslationZ() {
        return ((android.view.View) real).getTranslationZ();
    }

    public long getUniqueDrawingId() {
        return ((android.view.View) real).getUniqueDrawingId();
    }

    public int getVerticalFadingEdgeLength() {
        return ((android.view.View) real).getVerticalFadingEdgeLength();
    }

    public int getVerticalScrollbarPosition() {
        return ((android.view.View) real).getVerticalScrollbarPosition();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getVerticalScrollbarThumbDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.View) real).getVerticalScrollbarThumbDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getVerticalScrollbarTrackDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.View) real).getVerticalScrollbarTrackDrawable());
    }

    public int getVerticalScrollbarWidth() {
        return ((android.view.View) real).getVerticalScrollbarWidth();
    }

    public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse getViewTranslationResponse() {
        return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.wrap(((android.view.View) real).getViewTranslationResponse());
    }

    public com.micklab.dcg.wrapper.android.view.ViewTreeObserver getViewTreeObserver() {
        return com.micklab.dcg.wrapper.android.view.ViewTreeObserver.wrap(((android.view.View) real).getViewTreeObserver());
    }

    public int getVisibility() {
        return ((android.view.View) real).getVisibility();
    }

    public int getWidth() {
        return ((android.view.View) real).getWidth();
    }

    public com.micklab.dcg.wrapper.android.view.WindowId getWindowId() {
        return com.micklab.dcg.wrapper.android.view.WindowId.wrap(((android.view.View) real).getWindowId());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsetsController getWindowInsetsController() {
        return com.micklab.dcg.wrapper.android.view.WindowInsetsController.wrap(((android.view.View) real).getWindowInsetsController());
    }

    public int getWindowSystemUiVisibility() {
        return ((android.view.View) real).getWindowSystemUiVisibility();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getWindowToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.view.View) real).getWindowToken());
    }

    public int getWindowVisibility() {
        return ((android.view.View) real).getWindowVisibility();
    }

    public void getWindowVisibleDisplayFrame(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.View) real).getWindowVisibleDisplayFrame(arg0 == null ? null : arg0.getReal());
    }

    public float getX() {
        return ((android.view.View) real).getX();
    }

    public float getY() {
        return ((android.view.View) real).getY();
    }

    public float getZ() {
        return ((android.view.View) real).getZ();
    }

    public boolean hasExplicitFocusable() {
        return ((android.view.View) real).hasExplicitFocusable();
    }

    public boolean hasFocus() {
        return ((android.view.View) real).hasFocus();
    }

    public boolean hasFocusable() {
        return ((android.view.View) real).hasFocusable();
    }

    public boolean hasNestedScrollingParent() {
        return ((android.view.View) real).hasNestedScrollingParent();
    }

    public boolean hasOnClickListeners() {
        return ((android.view.View) real).hasOnClickListeners();
    }

    public boolean hasOnLongClickListeners() {
        return ((android.view.View) real).hasOnLongClickListeners();
    }

    public boolean hasOverlappingRendering() {
        return ((android.view.View) real).hasOverlappingRendering();
    }

    public boolean hasPointerCapture() {
        return ((android.view.View) real).hasPointerCapture();
    }

    public boolean hasTransientState() {
        return ((android.view.View) real).hasTransientState();
    }

    public boolean hasWindowFocus() {
        return ((android.view.View) real).hasWindowFocus();
    }

    public static com.micklab.dcg.wrapper.android.view.View inflate(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(android.view.View.inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public void invalidate() {
        ((android.view.View) real).invalidate();
    }

    public void invalidate(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.View) real).invalidate(arg0 == null ? null : arg0.getReal());
    }

    public void invalidate(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.View) real).invalidate(arg0, arg1, arg2, arg3);
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).invalidateDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void invalidateOutline() {
        ((android.view.View) real).invalidateOutline();
    }

    public boolean isAccessibilityDataSensitive() {
        return ((android.view.View) real).isAccessibilityDataSensitive();
    }

    public boolean isAccessibilityFocused() {
        return ((android.view.View) real).isAccessibilityFocused();
    }

    public boolean isAccessibilityHeading() {
        return ((android.view.View) real).isAccessibilityHeading();
    }

    public boolean isActivated() {
        return ((android.view.View) real).isActivated();
    }

    public boolean isAttachedToWindow() {
        return ((android.view.View) real).isAttachedToWindow();
    }

    public boolean isAutoHandwritingEnabled() {
        return ((android.view.View) real).isAutoHandwritingEnabled();
    }

    public boolean isClickable() {
        return ((android.view.View) real).isClickable();
    }

    public boolean isContentSensitive() {
        return ((android.view.View) real).isContentSensitive();
    }

    public boolean isContextClickable() {
        return ((android.view.View) real).isContextClickable();
    }

    public boolean isCredential() {
        return ((android.view.View) real).isCredential();
    }

    public boolean isDirty() {
        return ((android.view.View) real).isDirty();
    }

    public boolean isDrawingCacheEnabled() {
        return ((android.view.View) real).isDrawingCacheEnabled();
    }

    public boolean isDuplicateParentStateEnabled() {
        return ((android.view.View) real).isDuplicateParentStateEnabled();
    }

    public boolean isEnabled() {
        return ((android.view.View) real).isEnabled();
    }

    public boolean isFocusable() {
        return ((android.view.View) real).isFocusable();
    }

    public boolean isFocusableInTouchMode() {
        return ((android.view.View) real).isFocusableInTouchMode();
    }

    public boolean isFocused() {
        return ((android.view.View) real).isFocused();
    }

    public boolean isFocusedByDefault() {
        return ((android.view.View) real).isFocusedByDefault();
    }

    public boolean isForceDarkAllowed() {
        return ((android.view.View) real).isForceDarkAllowed();
    }

    public boolean isHandwritingDelegate() {
        return ((android.view.View) real).isHandwritingDelegate();
    }

    public boolean isHapticFeedbackEnabled() {
        return ((android.view.View) real).isHapticFeedbackEnabled();
    }

    public boolean isHardwareAccelerated() {
        return ((android.view.View) real).isHardwareAccelerated();
    }

    public boolean isHorizontalFadingEdgeEnabled() {
        return ((android.view.View) real).isHorizontalFadingEdgeEnabled();
    }

    public boolean isHorizontalScrollBarEnabled() {
        return ((android.view.View) real).isHorizontalScrollBarEnabled();
    }

    public boolean isHovered() {
        return ((android.view.View) real).isHovered();
    }

    public boolean isImportantForAccessibility() {
        return ((android.view.View) real).isImportantForAccessibility();
    }

    public boolean isImportantForAutofill() {
        return ((android.view.View) real).isImportantForAutofill();
    }

    public boolean isImportantForContentCapture() {
        return ((android.view.View) real).isImportantForContentCapture();
    }

    public boolean isInEditMode() {
        return ((android.view.View) real).isInEditMode();
    }

    public boolean isInLayout() {
        return ((android.view.View) real).isInLayout();
    }

    public boolean isInTouchMode() {
        return ((android.view.View) real).isInTouchMode();
    }

    public boolean isKeyboardNavigationCluster() {
        return ((android.view.View) real).isKeyboardNavigationCluster();
    }

    public boolean isLaidOut() {
        return ((android.view.View) real).isLaidOut();
    }

    public boolean isLayoutDirectionResolved() {
        return ((android.view.View) real).isLayoutDirectionResolved();
    }

    public boolean isLayoutRequested() {
        return ((android.view.View) real).isLayoutRequested();
    }

    public boolean isLongClickable() {
        return ((android.view.View) real).isLongClickable();
    }

    public boolean isNestedScrollingEnabled() {
        return ((android.view.View) real).isNestedScrollingEnabled();
    }

    public boolean isOpaque() {
        return ((android.view.View) real).isOpaque();
    }

    public boolean isPaddingRelative() {
        return ((android.view.View) real).isPaddingRelative();
    }

    public boolean isPivotSet() {
        return ((android.view.View) real).isPivotSet();
    }

    public boolean isPreferKeepClear() {
        return ((android.view.View) real).isPreferKeepClear();
    }

    public boolean isPressed() {
        return ((android.view.View) real).isPressed();
    }

    public boolean isSaveEnabled() {
        return ((android.view.View) real).isSaveEnabled();
    }

    public boolean isSaveFromParentEnabled() {
        return ((android.view.View) real).isSaveFromParentEnabled();
    }

    public boolean isScreenReaderFocusable() {
        return ((android.view.View) real).isScreenReaderFocusable();
    }

    public boolean isScrollContainer() {
        return ((android.view.View) real).isScrollContainer();
    }

    public boolean isScrollbarFadingEnabled() {
        return ((android.view.View) real).isScrollbarFadingEnabled();
    }

    public boolean isSelected() {
        return ((android.view.View) real).isSelected();
    }

    public boolean isShowingLayoutBounds() {
        return ((android.view.View) real).isShowingLayoutBounds();
    }

    public boolean isShown() {
        return ((android.view.View) real).isShown();
    }

    public boolean isSoundEffectsEnabled() {
        return ((android.view.View) real).isSoundEffectsEnabled();
    }

    public boolean isTemporarilyDetached() {
        return ((android.view.View) real).isTemporarilyDetached();
    }

    public boolean isTextAlignmentResolved() {
        return ((android.view.View) real).isTextAlignmentResolved();
    }

    public boolean isTextDirectionResolved() {
        return ((android.view.View) real).isTextDirectionResolved();
    }

    public boolean isVerticalFadingEdgeEnabled() {
        return ((android.view.View) real).isVerticalFadingEdgeEnabled();
    }

    public boolean isVerticalScrollBarEnabled() {
        return ((android.view.View) real).isVerticalScrollBarEnabled();
    }

    public boolean isVisibleToUserForAutofill(int arg0) {
        return ((android.view.View) real).isVisibleToUserForAutofill(arg0);
    }

    public void jumpDrawablesToCurrentState() {
        ((android.view.View) real).jumpDrawablesToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.view.View keyboardNavigationClusterSearch(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.View) real).keyboardNavigationClusterSearch(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void layout(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.View) real).layout(arg0, arg1, arg2, arg3);
    }

    public void measure(int arg0, int arg1) {
        ((android.view.View) real).measure(arg0, arg1);
    }

    public void offsetLeftAndRight(int arg0) {
        ((android.view.View) real).offsetLeftAndRight(arg0);
    }

    public void offsetTopAndBottom(int arg0) {
        ((android.view.View) real).offsetTopAndBottom(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets onApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.View) real).onApplyWindowInsets(arg0 == null ? null : arg0.getReal()));
    }

    public void onCancelPendingInputEvents() {
        ((android.view.View) real).onCancelPendingInputEvents();
    }

    public boolean onCapturedPointerEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).onCapturedPointerEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onCheckIsTextEditor() {
        return ((android.view.View) real).onCheckIsTextEditor();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(((android.view.View) real).onCreateInputConnection(arg0 == null ? null : arg0.getReal()));
    }

    public boolean onDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return ((android.view.View) real).onDragEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onDrawForeground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.View) real).onDrawForeground(arg0 == null ? null : arg0.getReal());
    }

    public boolean onFilterTouchEventForSecurity(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).onFilterTouchEventForSecurity(arg0 == null ? null : arg0.getReal());
    }

    public void onFinishTemporaryDetach() {
        ((android.view.View) real).onFinishTemporaryDetach();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onHoverChanged(boolean arg0) {
        ((android.view.View) real).onHoverChanged(arg0);
    }

    public boolean onHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).onHoverEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onInitializeAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        ((android.view.View) real).onInitializeAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        ((android.view.View) real).onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.view.View) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.view.View) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.view.View) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.view.View) real).onKeyPreIme(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.view.View) real).onKeyShortcut(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.view.View) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onPointerCaptureChange(boolean arg0) {
        ((android.view.View) real).onPointerCaptureChange(arg0);
    }

    public void onPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        ((android.view.View) real).onPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.view.View) real).onProvideAutofillStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onProvideAutofillVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.view.View) real).onProvideAutofillVirtualStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onProvideContentCaptureStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.view.View) real).onProvideContentCaptureStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onProvideStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        ((android.view.View) real).onProvideStructure(arg0 == null ? null : arg0.getReal());
    }

    public void onProvideVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        ((android.view.View) real).onProvideVirtualStructure(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo onReceiveContent(com.micklab.dcg.wrapper.android.view.ContentInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(((android.view.View) real).onReceiveContent(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.view.View) real).onResolvePointerIcon(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void onRtlPropertiesChanged(int arg0) {
        ((android.view.View) real).onRtlPropertiesChanged(arg0);
    }

    public void onScreenStateChanged(int arg0) {
        ((android.view.View) real).onScreenStateChanged(arg0);
    }

    public void onStartTemporaryDetach() {
        ((android.view.View) real).onStartTemporaryDetach();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.View) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onViewTranslationResponse(com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse arg0) {
        ((android.view.View) real).onViewTranslationResponse(arg0 == null ? null : arg0.getReal());
    }

    public void onVisibilityAggregated(boolean arg0) {
        ((android.view.View) real).onVisibilityAggregated(arg0);
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.view.View) real).onWindowFocusChanged(arg0);
    }

    public void onWindowSystemUiVisibilityChanged(int arg0) {
        ((android.view.View) real).onWindowSystemUiVisibilityChanged(arg0);
    }

    public boolean performAccessibilityAction(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.view.View) real).performAccessibilityAction(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean performClick() {
        return ((android.view.View) real).performClick();
    }

    public boolean performContextClick() {
        return ((android.view.View) real).performContextClick();
    }

    public boolean performContextClick(float arg0, float arg1) {
        return ((android.view.View) real).performContextClick(arg0, arg1);
    }

    public boolean performHapticFeedback(int arg0) {
        return ((android.view.View) real).performHapticFeedback(arg0);
    }

    public boolean performHapticFeedback(int arg0, int arg1) {
        return ((android.view.View) real).performHapticFeedback(arg0, arg1);
    }

    public boolean performLongClick() {
        return ((android.view.View) real).performLongClick();
    }

    public boolean performLongClick(float arg0, float arg1) {
        return ((android.view.View) real).performLongClick(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo performReceiveContent(com.micklab.dcg.wrapper.android.view.ContentInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(((android.view.View) real).performReceiveContent(arg0 == null ? null : arg0.getReal()));
    }

    public void playSoundEffect(int arg0) {
        ((android.view.View) real).playSoundEffect(arg0);
    }

    public boolean post(java.lang.Runnable arg0) {
        return ((android.view.View) real).post(arg0);
    }

    public boolean postDelayed(java.lang.Runnable arg0, long arg1) {
        return ((android.view.View) real).postDelayed(arg0, arg1);
    }

    public void postInvalidate() {
        ((android.view.View) real).postInvalidate();
    }

    public void postInvalidate(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.View) real).postInvalidate(arg0, arg1, arg2, arg3);
    }

    public void postInvalidateDelayed(long arg0) {
        ((android.view.View) real).postInvalidateDelayed(arg0);
    }

    public void postInvalidateDelayed(long arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.view.View) real).postInvalidateDelayed(arg0, arg1, arg2, arg3, arg4);
    }

    public void postInvalidateOnAnimation() {
        ((android.view.View) real).postInvalidateOnAnimation();
    }

    public void postInvalidateOnAnimation(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.View) real).postInvalidateOnAnimation(arg0, arg1, arg2, arg3);
    }

    public void postOnAnimation(java.lang.Runnable arg0) {
        ((android.view.View) real).postOnAnimation(arg0);
    }

    public void postOnAnimationDelayed(java.lang.Runnable arg0, long arg1) {
        ((android.view.View) real).postOnAnimationDelayed(arg0, arg1);
    }

    public void refreshDrawableState() {
        ((android.view.View) real).refreshDrawableState();
    }

    public void releasePointerCapture() {
        ((android.view.View) real).releasePointerCapture();
    }

    public boolean removeCallbacks(java.lang.Runnable arg0) {
        return ((android.view.View) real).removeCallbacks(arg0);
    }

    public void removeOnAttachStateChangeListener(com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener arg0) {
        ((android.view.View) real).removeOnAttachStateChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnLayoutChangeListener(com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener arg0) {
        ((android.view.View) real).removeOnLayoutChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnUnhandledKeyEventListener(com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener arg0) {
        ((android.view.View) real).removeOnUnhandledKeyEventListener(arg0 == null ? null : arg0.getReal());
    }

    public void reportAppJankStats(com.micklab.dcg.wrapper.android.app.jank.AppJankStats arg0) {
        ((android.view.View) real).reportAppJankStats(arg0 == null ? null : arg0.getReal());
    }

    public void requestApplyInsets() {
        ((android.view.View) real).requestApplyInsets();
    }

    public void requestFitSystemWindows() {
        ((android.view.View) real).requestFitSystemWindows();
    }

    public boolean requestFocus() {
        return ((android.view.View) real).requestFocus();
    }

    public boolean requestFocus(int arg0) {
        return ((android.view.View) real).requestFocus(arg0);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return ((android.view.View) real).requestFocus(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean requestFocusFromTouch() {
        return ((android.view.View) real).requestFocusFromTouch();
    }

    public void requestLayout() {
        ((android.view.View) real).requestLayout();
    }

    public void requestPointerCapture() {
        ((android.view.View) real).requestPointerCapture();
    }

    public boolean requestRectangleOnScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.view.View) real).requestRectangleOnScreen(arg0 == null ? null : arg0.getReal());
    }

    public boolean requestRectangleOnScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0, boolean arg1) {
        return ((android.view.View) real).requestRectangleOnScreen(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void requestUnbufferedDispatch(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        ((android.view.View) real).requestUnbufferedDispatch(arg0 == null ? null : arg0.getReal());
    }

    public void requestUnbufferedDispatch(int arg0) {
        ((android.view.View) real).requestUnbufferedDispatch(arg0);
    }

    public void resetPivot() {
        ((android.view.View) real).resetPivot();
    }

    public static int resolveSize(int arg0, int arg1) {
        return android.view.View.resolveSize(arg0, arg1);
    }

    public static int resolveSizeAndState(int arg0, int arg1, int arg2) {
        return android.view.View.resolveSizeAndState(arg0, arg1, arg2);
    }

    public boolean restoreDefaultFocus() {
        return ((android.view.View) real).restoreDefaultFocus();
    }

    public void saveAttributeDataForStyleable(com.micklab.dcg.wrapper.android.content.Context arg0, int[] arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.TypedArray arg3, int arg4, int arg5) {
        ((android.view.View) real).saveAttributeDataForStyleable(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5);
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        ((android.view.View) real).scheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void scrollBy(int arg0, int arg1) {
        ((android.view.View) real).scrollBy(arg0, arg1);
    }

    public void scrollTo(int arg0, int arg1) {
        ((android.view.View) real).scrollTo(arg0, arg1);
    }

    public void sendAccessibilityEvent(int arg0) {
        ((android.view.View) real).sendAccessibilityEvent(arg0);
    }

    public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        ((android.view.View) real).sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.getReal());
    }

    public void setAccessibilityDataSensitive(int arg0) {
        ((android.view.View) real).setAccessibilityDataSensitive(arg0);
    }

    public void setAccessibilityDelegate(com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate arg0) {
        ((android.view.View) real).setAccessibilityDelegate(arg0 == null ? null : arg0.getReal());
    }

    public void setAccessibilityHeading(boolean arg0) {
        ((android.view.View) real).setAccessibilityHeading(arg0);
    }

    public void setAccessibilityLiveRegion(int arg0) {
        ((android.view.View) real).setAccessibilityLiveRegion(arg0);
    }

    public void setAccessibilityPaneTitle(java.lang.CharSequence arg0) {
        ((android.view.View) real).setAccessibilityPaneTitle(arg0);
    }

    public void setAccessibilityTraversalAfter(int arg0) {
        ((android.view.View) real).setAccessibilityTraversalAfter(arg0);
    }

    public void setAccessibilityTraversalBefore(int arg0) {
        ((android.view.View) real).setAccessibilityTraversalBefore(arg0);
    }

    public void setActivated(boolean arg0) {
        ((android.view.View) real).setActivated(arg0);
    }

    public void setAllowClickWhenDisabled(boolean arg0) {
        ((android.view.View) real).setAllowClickWhenDisabled(arg0);
    }

    public void setAllowedHandwritingDelegatePackage(java.lang.String arg0) {
        ((android.view.View) real).setAllowedHandwritingDelegatePackage(arg0);
    }

    public void setAllowedHandwritingDelegatorPackage(java.lang.String arg0) {
        ((android.view.View) real).setAllowedHandwritingDelegatorPackage(arg0);
    }

    public void setAlpha(float arg0) {
        ((android.view.View) real).setAlpha(arg0);
    }

    public void setAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        ((android.view.View) real).setAnimation(arg0 == null ? null : arg0.getReal());
    }

    public void setAnimationMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.view.View) real).setAnimationMatrix(arg0 == null ? null : arg0.getReal());
    }

    public void setAutoHandwritingEnabled(boolean arg0) {
        ((android.view.View) real).setAutoHandwritingEnabled(arg0);
    }

    public void setAutofillHints(java.lang.String... arg0) {
        ((android.view.View) real).setAutofillHints(arg0);
    }

    public void setAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
        ((android.view.View) real).setAutofillId(arg0 == null ? null : arg0.getReal());
    }

    public void setBackground(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).setBackground(arg0 == null ? null : arg0.getReal());
    }

    public void setBackgroundColor(int arg0) {
        ((android.view.View) real).setBackgroundColor(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).setBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setBackgroundResource(int arg0) {
        ((android.view.View) real).setBackgroundResource(arg0);
    }

    public void setBackgroundTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.view.View) real).setBackgroundTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setBackgroundTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.view.View) real).setBackgroundTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setBackgroundTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        ((android.view.View) real).setBackgroundTintMode(arg0 == null ? null : arg0.getReal());
    }

    public void setBottom(int arg0) {
        ((android.view.View) real).setBottom(arg0);
    }

    public void setCameraDistance(float arg0) {
        ((android.view.View) real).setCameraDistance(arg0);
    }

    public void setClickable(boolean arg0) {
        ((android.view.View) real).setClickable(arg0);
    }

    public void setClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.View) real).setClipBounds(arg0 == null ? null : arg0.getReal());
    }

    public void setClipToOutline(boolean arg0) {
        ((android.view.View) real).setClipToOutline(arg0);
    }

    public void setContentCaptureSession(com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession arg0) {
        ((android.view.View) real).setContentCaptureSession(arg0 == null ? null : arg0.getReal());
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        ((android.view.View) real).setContentDescription(arg0);
    }

    public void setContentSensitivity(int arg0) {
        ((android.view.View) real).setContentSensitivity(arg0);
    }

    public void setContextClickable(boolean arg0) {
        ((android.view.View) real).setContextClickable(arg0);
    }

    public void setDefaultFocusHighlightEnabled(boolean arg0) {
        ((android.view.View) real).setDefaultFocusHighlightEnabled(arg0);
    }

    public void setDrawingCacheBackgroundColor(int arg0) {
        ((android.view.View) real).setDrawingCacheBackgroundColor(arg0);
    }

    public void setDrawingCacheEnabled(boolean arg0) {
        ((android.view.View) real).setDrawingCacheEnabled(arg0);
    }

    public void setDrawingCacheQuality(int arg0) {
        ((android.view.View) real).setDrawingCacheQuality(arg0);
    }

    public void setDuplicateParentStateEnabled(boolean arg0) {
        ((android.view.View) real).setDuplicateParentStateEnabled(arg0);
    }

    public void setElevation(float arg0) {
        ((android.view.View) real).setElevation(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.view.View) real).setEnabled(arg0);
    }

    public void setFadingEdgeLength(int arg0) {
        ((android.view.View) real).setFadingEdgeLength(arg0);
    }

    public void setFilterTouchesWhenObscured(boolean arg0) {
        ((android.view.View) real).setFilterTouchesWhenObscured(arg0);
    }

    public void setFitsSystemWindows(boolean arg0) {
        ((android.view.View) real).setFitsSystemWindows(arg0);
    }

    public void setFocusable(boolean arg0) {
        ((android.view.View) real).setFocusable(arg0);
    }

    public void setFocusable(int arg0) {
        ((android.view.View) real).setFocusable(arg0);
    }

    public void setFocusableInTouchMode(boolean arg0) {
        ((android.view.View) real).setFocusableInTouchMode(arg0);
    }

    public void setFocusedByDefault(boolean arg0) {
        ((android.view.View) real).setFocusedByDefault(arg0);
    }

    public void setForceDarkAllowed(boolean arg0) {
        ((android.view.View) real).setForceDarkAllowed(arg0);
    }

    public void setForeground(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).setForeground(arg0 == null ? null : arg0.getReal());
    }

    public void setForegroundGravity(int arg0) {
        ((android.view.View) real).setForegroundGravity(arg0);
    }

    public void setForegroundTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.view.View) real).setForegroundTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setForegroundTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.view.View) real).setForegroundTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setForegroundTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        ((android.view.View) real).setForegroundTintMode(arg0 == null ? null : arg0.getReal());
    }

    public void setFrameContentVelocity(float arg0) {
        ((android.view.View) real).setFrameContentVelocity(arg0);
    }

    public void setHandwritingBoundsOffsets(float arg0, float arg1, float arg2, float arg3) {
        ((android.view.View) real).setHandwritingBoundsOffsets(arg0, arg1, arg2, arg3);
    }

    public void setHandwritingDelegateFlags(int arg0) {
        ((android.view.View) real).setHandwritingDelegateFlags(arg0);
    }

    public void setHandwritingDelegatorCallback(java.lang.Runnable arg0) {
        ((android.view.View) real).setHandwritingDelegatorCallback(arg0);
    }

    public void setHapticFeedbackEnabled(boolean arg0) {
        ((android.view.View) real).setHapticFeedbackEnabled(arg0);
    }

    public void setHasTransientState(boolean arg0) {
        ((android.view.View) real).setHasTransientState(arg0);
    }

    public void setHorizontalFadingEdgeEnabled(boolean arg0) {
        ((android.view.View) real).setHorizontalFadingEdgeEnabled(arg0);
    }

    public void setHorizontalScrollBarEnabled(boolean arg0) {
        ((android.view.View) real).setHorizontalScrollBarEnabled(arg0);
    }

    public void setHorizontalScrollbarThumbDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).setHorizontalScrollbarThumbDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setHorizontalScrollbarTrackDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).setHorizontalScrollbarTrackDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setHovered(boolean arg0) {
        ((android.view.View) real).setHovered(arg0);
    }

    public void setId(int arg0) {
        ((android.view.View) real).setId(arg0);
    }

    public void setImportantForAccessibility(int arg0) {
        ((android.view.View) real).setImportantForAccessibility(arg0);
    }

    public void setImportantForAutofill(int arg0) {
        ((android.view.View) real).setImportantForAutofill(arg0);
    }

    public void setImportantForContentCapture(int arg0) {
        ((android.view.View) real).setImportantForContentCapture(arg0);
    }

    public void setIsCredential(boolean arg0) {
        ((android.view.View) real).setIsCredential(arg0);
    }

    public void setIsHandwritingDelegate(boolean arg0) {
        ((android.view.View) real).setIsHandwritingDelegate(arg0);
    }

    public void setKeepScreenOn(boolean arg0) {
        ((android.view.View) real).setKeepScreenOn(arg0);
    }

    public void setKeyboardNavigationCluster(boolean arg0) {
        ((android.view.View) real).setKeyboardNavigationCluster(arg0);
    }

    public void setLabelFor(int arg0) {
        ((android.view.View) real).setLabelFor(arg0);
    }

    public void setLayerPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        ((android.view.View) real).setLayerPaint(arg0 == null ? null : arg0.getReal());
    }

    public void setLayerType(int arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.view.View) real).setLayerType(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setLayoutDirection(int arg0) {
        ((android.view.View) real).setLayoutDirection(arg0);
    }

    public void setLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
        ((android.view.View) real).setLayoutParams(arg0 == null ? null : arg0.getReal());
    }

    public void setLeft(int arg0) {
        ((android.view.View) real).setLeft(arg0);
    }

    public void setLeftTopRightBottom(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.View) real).setLeftTopRightBottom(arg0, arg1, arg2, arg3);
    }

    public void setLongClickable(boolean arg0) {
        ((android.view.View) real).setLongClickable(arg0);
    }

    public void setMinimumHeight(int arg0) {
        ((android.view.View) real).setMinimumHeight(arg0);
    }

    public void setMinimumWidth(int arg0) {
        ((android.view.View) real).setMinimumWidth(arg0);
    }

    public void setNestedScrollingEnabled(boolean arg0) {
        ((android.view.View) real).setNestedScrollingEnabled(arg0);
    }

    public void setNextClusterForwardId(int arg0) {
        ((android.view.View) real).setNextClusterForwardId(arg0);
    }

    public void setNextFocusDownId(int arg0) {
        ((android.view.View) real).setNextFocusDownId(arg0);
    }

    public void setNextFocusForwardId(int arg0) {
        ((android.view.View) real).setNextFocusForwardId(arg0);
    }

    public void setNextFocusLeftId(int arg0) {
        ((android.view.View) real).setNextFocusLeftId(arg0);
    }

    public void setNextFocusRightId(int arg0) {
        ((android.view.View) real).setNextFocusRightId(arg0);
    }

    public void setNextFocusUpId(int arg0) {
        ((android.view.View) real).setNextFocusUpId(arg0);
    }

    public void setOnApplyWindowInsetsListener(com.micklab.dcg.wrapper.android.view.View.OnApplyWindowInsetsListener arg0) {
        ((android.view.View) real).setOnApplyWindowInsetsListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnCapturedPointerListener(com.micklab.dcg.wrapper.android.view.View.OnCapturedPointerListener arg0) {
        ((android.view.View) real).setOnCapturedPointerListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.view.View) real).setOnClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnContextClickListener(com.micklab.dcg.wrapper.android.view.View.OnContextClickListener arg0) {
        ((android.view.View) real).setOnContextClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnCreateContextMenuListener(com.micklab.dcg.wrapper.android.view.View.OnCreateContextMenuListener arg0) {
        ((android.view.View) real).setOnCreateContextMenuListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDragListener(com.micklab.dcg.wrapper.android.view.View.OnDragListener arg0) {
        ((android.view.View) real).setOnDragListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnFocusChangeListener(com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener arg0) {
        ((android.view.View) real).setOnFocusChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnGenericMotionListener(com.micklab.dcg.wrapper.android.view.View.OnGenericMotionListener arg0) {
        ((android.view.View) real).setOnGenericMotionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnHoverListener(com.micklab.dcg.wrapper.android.view.View.OnHoverListener arg0) {
        ((android.view.View) real).setOnHoverListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnKeyListener(com.micklab.dcg.wrapper.android.view.View.OnKeyListener arg0) {
        ((android.view.View) real).setOnKeyListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnLongClickListener(com.micklab.dcg.wrapper.android.view.View.OnLongClickListener arg0) {
        ((android.view.View) real).setOnLongClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnReceiveContentListener(java.lang.String[] arg0, com.micklab.dcg.wrapper.android.view.OnReceiveContentListener arg1) {
        ((android.view.View) real).setOnReceiveContentListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnScrollChangeListener(com.micklab.dcg.wrapper.android.view.View.OnScrollChangeListener arg0) {
        ((android.view.View) real).setOnScrollChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnSystemUiVisibilityChangeListener(com.micklab.dcg.wrapper.android.view.View.OnSystemUiVisibilityChangeListener arg0) {
        ((android.view.View) real).setOnSystemUiVisibilityChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnTouchListener(com.micklab.dcg.wrapper.android.view.View.OnTouchListener arg0) {
        ((android.view.View) real).setOnTouchListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOutlineAmbientShadowColor(int arg0) {
        ((android.view.View) real).setOutlineAmbientShadowColor(arg0);
    }

    public void setOutlineProvider(com.micklab.dcg.wrapper.android.view.ViewOutlineProvider arg0) {
        ((android.view.View) real).setOutlineProvider(arg0 == null ? null : arg0.getReal());
    }

    public void setOutlineSpotShadowColor(int arg0) {
        ((android.view.View) real).setOutlineSpotShadowColor(arg0);
    }

    public void setOverScrollMode(int arg0) {
        ((android.view.View) real).setOverScrollMode(arg0);
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.View) real).setPadding(arg0, arg1, arg2, arg3);
    }

    public void setPaddingRelative(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.View) real).setPaddingRelative(arg0, arg1, arg2, arg3);
    }

    public void setPivotX(float arg0) {
        ((android.view.View) real).setPivotX(arg0);
    }

    public void setPivotY(float arg0) {
        ((android.view.View) real).setPivotY(arg0);
    }

    public void setPointerIcon(com.micklab.dcg.wrapper.android.view.PointerIcon arg0) {
        ((android.view.View) real).setPointerIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setPreferKeepClear(boolean arg0) {
        ((android.view.View) real).setPreferKeepClear(arg0);
    }

    public void setPressed(boolean arg0) {
        ((android.view.View) real).setPressed(arg0);
    }

    public void setRenderEffect(com.micklab.dcg.wrapper.android.graphics.RenderEffect arg0) {
        ((android.view.View) real).setRenderEffect(arg0 == null ? null : arg0.getReal());
    }

    public void setRequestedFrameRate(float arg0) {
        ((android.view.View) real).setRequestedFrameRate(arg0);
    }

    public void setRevealOnFocusHint(boolean arg0) {
        ((android.view.View) real).setRevealOnFocusHint(arg0);
    }

    public void setRight(int arg0) {
        ((android.view.View) real).setRight(arg0);
    }

    public void setRotation(float arg0) {
        ((android.view.View) real).setRotation(arg0);
    }

    public void setRotationX(float arg0) {
        ((android.view.View) real).setRotationX(arg0);
    }

    public void setRotationY(float arg0) {
        ((android.view.View) real).setRotationY(arg0);
    }

    public void setSaveEnabled(boolean arg0) {
        ((android.view.View) real).setSaveEnabled(arg0);
    }

    public void setSaveFromParentEnabled(boolean arg0) {
        ((android.view.View) real).setSaveFromParentEnabled(arg0);
    }

    public void setScaleX(float arg0) {
        ((android.view.View) real).setScaleX(arg0);
    }

    public void setScaleY(float arg0) {
        ((android.view.View) real).setScaleY(arg0);
    }

    public void setScreenReaderFocusable(boolean arg0) {
        ((android.view.View) real).setScreenReaderFocusable(arg0);
    }

    public void setScrollBarDefaultDelayBeforeFade(int arg0) {
        ((android.view.View) real).setScrollBarDefaultDelayBeforeFade(arg0);
    }

    public void setScrollBarFadeDuration(int arg0) {
        ((android.view.View) real).setScrollBarFadeDuration(arg0);
    }

    public void setScrollBarSize(int arg0) {
        ((android.view.View) real).setScrollBarSize(arg0);
    }

    public void setScrollBarStyle(int arg0) {
        ((android.view.View) real).setScrollBarStyle(arg0);
    }

    public void setScrollCaptureCallback(com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg0) {
        ((android.view.View) real).setScrollCaptureCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setScrollCaptureHint(int arg0) {
        ((android.view.View) real).setScrollCaptureHint(arg0);
    }

    public void setScrollContainer(boolean arg0) {
        ((android.view.View) real).setScrollContainer(arg0);
    }

    public void setScrollIndicators(int arg0) {
        ((android.view.View) real).setScrollIndicators(arg0);
    }

    public void setScrollIndicators(int arg0, int arg1) {
        ((android.view.View) real).setScrollIndicators(arg0, arg1);
    }

    public void setScrollX(int arg0) {
        ((android.view.View) real).setScrollX(arg0);
    }

    public void setScrollY(int arg0) {
        ((android.view.View) real).setScrollY(arg0);
    }

    public void setScrollbarFadingEnabled(boolean arg0) {
        ((android.view.View) real).setScrollbarFadingEnabled(arg0);
    }

    public void setSelected(boolean arg0) {
        ((android.view.View) real).setSelected(arg0);
    }

    public void setSoundEffectsEnabled(boolean arg0) {
        ((android.view.View) real).setSoundEffectsEnabled(arg0);
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        ((android.view.View) real).setStateDescription(arg0);
    }

    public void setStateListAnimator(com.micklab.dcg.wrapper.android.animation.StateListAnimator arg0) {
        ((android.view.View) real).setStateListAnimator(arg0 == null ? null : arg0.getReal());
    }

    public void setSupplementalDescription(java.lang.CharSequence arg0) {
        ((android.view.View) real).setSupplementalDescription(arg0);
    }

    public void setSystemUiVisibility(int arg0) {
        ((android.view.View) real).setSystemUiVisibility(arg0);
    }

    public void setTag(java.lang.Object arg0) {
        ((android.view.View) real).setTag(arg0);
    }

    public void setTag(int arg0, java.lang.Object arg1) {
        ((android.view.View) real).setTag(arg0, arg1);
    }

    public void setTextAlignment(int arg0) {
        ((android.view.View) real).setTextAlignment(arg0);
    }

    public void setTextDirection(int arg0) {
        ((android.view.View) real).setTextDirection(arg0);
    }

    public void setTooltipText(java.lang.CharSequence arg0) {
        ((android.view.View) real).setTooltipText(arg0);
    }

    public void setTop(int arg0) {
        ((android.view.View) real).setTop(arg0);
    }

    public void setTouchDelegate(com.micklab.dcg.wrapper.android.view.TouchDelegate arg0) {
        ((android.view.View) real).setTouchDelegate(arg0 == null ? null : arg0.getReal());
    }

    public void setTransitionAlpha(float arg0) {
        ((android.view.View) real).setTransitionAlpha(arg0);
    }

    public void setTransitionName(java.lang.String arg0) {
        ((android.view.View) real).setTransitionName(arg0);
    }

    public void setTransitionVisibility(int arg0) {
        ((android.view.View) real).setTransitionVisibility(arg0);
    }

    public void setTranslationX(float arg0) {
        ((android.view.View) real).setTranslationX(arg0);
    }

    public void setTranslationY(float arg0) {
        ((android.view.View) real).setTranslationY(arg0);
    }

    public void setTranslationZ(float arg0) {
        ((android.view.View) real).setTranslationZ(arg0);
    }

    public void setVerticalFadingEdgeEnabled(boolean arg0) {
        ((android.view.View) real).setVerticalFadingEdgeEnabled(arg0);
    }

    public void setVerticalScrollBarEnabled(boolean arg0) {
        ((android.view.View) real).setVerticalScrollBarEnabled(arg0);
    }

    public void setVerticalScrollbarPosition(int arg0) {
        ((android.view.View) real).setVerticalScrollbarPosition(arg0);
    }

    public void setVerticalScrollbarThumbDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).setVerticalScrollbarThumbDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setVerticalScrollbarTrackDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).setVerticalScrollbarTrackDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setViewTranslationCallback(com.micklab.dcg.wrapper.android.view.translation.ViewTranslationCallback arg0) {
        ((android.view.View) real).setViewTranslationCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setVisibility(int arg0) {
        ((android.view.View) real).setVisibility(arg0);
    }

    public void setWillNotCacheDrawing(boolean arg0) {
        ((android.view.View) real).setWillNotCacheDrawing(arg0);
    }

    public void setWillNotDraw(boolean arg0) {
        ((android.view.View) real).setWillNotDraw(arg0);
    }

    public void setWindowInsetsAnimationCallback(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback arg0) {
        ((android.view.View) real).setWindowInsetsAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setX(float arg0) {
        ((android.view.View) real).setX(arg0);
    }

    public void setY(float arg0) {
        ((android.view.View) real).setY(arg0);
    }

    public void setZ(float arg0) {
        ((android.view.View) real).setZ(arg0);
    }

    public boolean showContextMenu() {
        return ((android.view.View) real).showContextMenu();
    }

    public boolean showContextMenu(float arg0, float arg1) {
        return ((android.view.View) real).showContextMenu(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.View) real).startActionMode(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.View) real).startActionMode(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void startAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        ((android.view.View) real).startAnimation(arg0 == null ? null : arg0.getReal());
    }

    public boolean startDrag(com.micklab.dcg.wrapper.android.content.ClipData arg0, com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder arg1, java.lang.Object arg2, int arg3) {
        return ((android.view.View) real).startDrag(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public boolean startDragAndDrop(com.micklab.dcg.wrapper.android.content.ClipData arg0, com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder arg1, java.lang.Object arg2, int arg3) {
        return ((android.view.View) real).startDragAndDrop(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public boolean startNestedScroll(int arg0) {
        return ((android.view.View) real).startNestedScroll(arg0);
    }

    public void stopNestedScroll() {
        ((android.view.View) real).stopNestedScroll();
    }

    public java.lang.String toString() {
        return ((android.view.View) real).toString();
    }

    public void transformMatrixToGlobal(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.view.View) real).transformMatrixToGlobal(arg0 == null ? null : arg0.getReal());
    }

    public void transformMatrixToLocal(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.view.View) real).transformMatrixToLocal(arg0 == null ? null : arg0.getReal());
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.View) real).unscheduleDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        ((android.view.View) real).unscheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void updateDragShadow(com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder arg0) {
        ((android.view.View) real).updateDragShadow(arg0 == null ? null : arg0.getReal());
    }

    public boolean willNotCacheDrawing() {
        return ((android.view.View) real).willNotCacheDrawing();
    }

    public boolean willNotDraw() {
        return ((android.view.View) real).willNotDraw();
    }

    public static final int ACCESSIBILITY_DATA_SENSITIVE_AUTO = android.view.View.ACCESSIBILITY_DATA_SENSITIVE_AUTO;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_NO = android.view.View.ACCESSIBILITY_DATA_SENSITIVE_NO;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_YES = android.view.View.ACCESSIBILITY_DATA_SENSITIVE_YES;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = android.view.View.ACCESSIBILITY_LIVE_REGION_ASSERTIVE;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = android.view.View.ACCESSIBILITY_LIVE_REGION_NONE;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = android.view.View.ACCESSIBILITY_LIVE_REGION_POLITE;
    public static final int AUTOFILL_FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = android.view.View.AUTOFILL_FLAG_INCLUDE_NOT_IMPORTANT_VIEWS;
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE = android.view.View.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE;
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY = android.view.View.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY;
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH = android.view.View.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH;
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR = android.view.View.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR;
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_NUMBER = android.view.View.AUTOFILL_HINT_CREDIT_CARD_NUMBER;
    public static final java.lang.String AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE = android.view.View.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE;
    public static final java.lang.String AUTOFILL_HINT_EMAIL_ADDRESS = android.view.View.AUTOFILL_HINT_EMAIL_ADDRESS;
    public static final java.lang.String AUTOFILL_HINT_NAME = android.view.View.AUTOFILL_HINT_NAME;
    public static final java.lang.String AUTOFILL_HINT_PASSWORD = android.view.View.AUTOFILL_HINT_PASSWORD;
    public static final java.lang.String AUTOFILL_HINT_PHONE = android.view.View.AUTOFILL_HINT_PHONE;
    public static final java.lang.String AUTOFILL_HINT_POSTAL_ADDRESS = android.view.View.AUTOFILL_HINT_POSTAL_ADDRESS;
    public static final java.lang.String AUTOFILL_HINT_POSTAL_CODE = android.view.View.AUTOFILL_HINT_POSTAL_CODE;
    public static final java.lang.String AUTOFILL_HINT_USERNAME = android.view.View.AUTOFILL_HINT_USERNAME;
    public static final int AUTOFILL_TYPE_DATE = android.view.View.AUTOFILL_TYPE_DATE;
    public static final int AUTOFILL_TYPE_LIST = android.view.View.AUTOFILL_TYPE_LIST;
    public static final int AUTOFILL_TYPE_NONE = android.view.View.AUTOFILL_TYPE_NONE;
    public static final int AUTOFILL_TYPE_TEXT = android.view.View.AUTOFILL_TYPE_TEXT;
    public static final int AUTOFILL_TYPE_TOGGLE = android.view.View.AUTOFILL_TYPE_TOGGLE;
    public static final int CONTENT_SENSITIVITY_AUTO = android.view.View.CONTENT_SENSITIVITY_AUTO;
    public static final int CONTENT_SENSITIVITY_NOT_SENSITIVE = android.view.View.CONTENT_SENSITIVITY_NOT_SENSITIVE;
    public static final int CONTENT_SENSITIVITY_SENSITIVE = android.view.View.CONTENT_SENSITIVITY_SENSITIVE;
    public static final int DRAG_FLAG_ACCESSIBILITY_ACTION = android.view.View.DRAG_FLAG_ACCESSIBILITY_ACTION;
    public static final int DRAG_FLAG_GLOBAL = android.view.View.DRAG_FLAG_GLOBAL;
    public static final int DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION = android.view.View.DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION;
    public static final int DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION = android.view.View.DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION;
    public static final int DRAG_FLAG_GLOBAL_SAME_APPLICATION = android.view.View.DRAG_FLAG_GLOBAL_SAME_APPLICATION;
    public static final int DRAG_FLAG_GLOBAL_URI_READ = android.view.View.DRAG_FLAG_GLOBAL_URI_READ;
    public static final int DRAG_FLAG_GLOBAL_URI_WRITE = android.view.View.DRAG_FLAG_GLOBAL_URI_WRITE;
    public static final int DRAG_FLAG_HIDE_CALLING_TASK_ON_DRAG_START = android.view.View.DRAG_FLAG_HIDE_CALLING_TASK_ON_DRAG_START;
    public static final int DRAG_FLAG_OPAQUE = android.view.View.DRAG_FLAG_OPAQUE;
    public static final int DRAG_FLAG_START_INTENT_SENDER_ON_UNHANDLED_DRAG = android.view.View.DRAG_FLAG_START_INTENT_SENDER_ON_UNHANDLED_DRAG;
    public static final int DRAWING_CACHE_QUALITY_AUTO = android.view.View.DRAWING_CACHE_QUALITY_AUTO;
    public static final int DRAWING_CACHE_QUALITY_HIGH = android.view.View.DRAWING_CACHE_QUALITY_HIGH;
    public static final int DRAWING_CACHE_QUALITY_LOW = android.view.View.DRAWING_CACHE_QUALITY_LOW;
    public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = android.view.View.FIND_VIEWS_WITH_CONTENT_DESCRIPTION;
    public static final int FIND_VIEWS_WITH_TEXT = android.view.View.FIND_VIEWS_WITH_TEXT;
    public static final int FOCUSABLE = android.view.View.FOCUSABLE;
    public static final int FOCUSABLES_ALL = android.view.View.FOCUSABLES_ALL;
    public static final int FOCUSABLES_TOUCH_MODE = android.view.View.FOCUSABLES_TOUCH_MODE;
    public static final int FOCUSABLE_AUTO = android.view.View.FOCUSABLE_AUTO;
    public static final int FOCUS_BACKWARD = android.view.View.FOCUS_BACKWARD;
    public static final int FOCUS_DOWN = android.view.View.FOCUS_DOWN;
    public static final int FOCUS_FORWARD = android.view.View.FOCUS_FORWARD;
    public static final int FOCUS_LEFT = android.view.View.FOCUS_LEFT;
    public static final int FOCUS_RIGHT = android.view.View.FOCUS_RIGHT;
    public static final int FOCUS_UP = android.view.View.FOCUS_UP;
    public static final int GONE = android.view.View.GONE;
    public static final int HAPTIC_FEEDBACK_ENABLED = android.view.View.HAPTIC_FEEDBACK_ENABLED;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = android.view.View.IMPORTANT_FOR_ACCESSIBILITY_AUTO;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = android.view.View.IMPORTANT_FOR_ACCESSIBILITY_NO;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = android.view.View.IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = android.view.View.IMPORTANT_FOR_ACCESSIBILITY_YES;
    public static final int IMPORTANT_FOR_AUTOFILL_AUTO = android.view.View.IMPORTANT_FOR_AUTOFILL_AUTO;
    public static final int IMPORTANT_FOR_AUTOFILL_NO = android.view.View.IMPORTANT_FOR_AUTOFILL_NO;
    public static final int IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS = android.view.View.IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS;
    public static final int IMPORTANT_FOR_AUTOFILL_YES = android.view.View.IMPORTANT_FOR_AUTOFILL_YES;
    public static final int IMPORTANT_FOR_AUTOFILL_YES_EXCLUDE_DESCENDANTS = android.view.View.IMPORTANT_FOR_AUTOFILL_YES_EXCLUDE_DESCENDANTS;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = android.view.View.IMPORTANT_FOR_CONTENT_CAPTURE_AUTO;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = android.view.View.IMPORTANT_FOR_CONTENT_CAPTURE_NO;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = android.view.View.IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = android.view.View.IMPORTANT_FOR_CONTENT_CAPTURE_YES;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = android.view.View.IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS;
    public static final int INVISIBLE = android.view.View.INVISIBLE;
    public static final int KEEP_SCREEN_ON = android.view.View.KEEP_SCREEN_ON;
    public static final int LAYER_TYPE_HARDWARE = android.view.View.LAYER_TYPE_HARDWARE;
    public static final int LAYER_TYPE_NONE = android.view.View.LAYER_TYPE_NONE;
    public static final int LAYER_TYPE_SOFTWARE = android.view.View.LAYER_TYPE_SOFTWARE;
    public static final int LAYOUT_DIRECTION_INHERIT = android.view.View.LAYOUT_DIRECTION_INHERIT;
    public static final int LAYOUT_DIRECTION_LOCALE = android.view.View.LAYOUT_DIRECTION_LOCALE;
    public static final int LAYOUT_DIRECTION_LTR = android.view.View.LAYOUT_DIRECTION_LTR;
    public static final int LAYOUT_DIRECTION_RTL = android.view.View.LAYOUT_DIRECTION_RTL;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = android.view.View.MEASURED_HEIGHT_STATE_SHIFT;
    public static final int MEASURED_SIZE_MASK = android.view.View.MEASURED_SIZE_MASK;
    public static final int MEASURED_STATE_MASK = android.view.View.MEASURED_STATE_MASK;
    public static final int MEASURED_STATE_TOO_SMALL = android.view.View.MEASURED_STATE_TOO_SMALL;
    public static final int NOT_FOCUSABLE = android.view.View.NOT_FOCUSABLE;
    public static final int NO_ID = android.view.View.NO_ID;
    public static final int OVER_SCROLL_ALWAYS = android.view.View.OVER_SCROLL_ALWAYS;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = android.view.View.OVER_SCROLL_IF_CONTENT_SCROLLS;
    public static final int OVER_SCROLL_NEVER = android.view.View.OVER_SCROLL_NEVER;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_DEFAULT = android.view.View.REQUESTED_FRAME_RATE_CATEGORY_DEFAULT;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_HIGH = android.view.View.REQUESTED_FRAME_RATE_CATEGORY_HIGH;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_LOW = android.view.View.REQUESTED_FRAME_RATE_CATEGORY_LOW;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NORMAL = android.view.View.REQUESTED_FRAME_RATE_CATEGORY_NORMAL;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NO_PREFERENCE = android.view.View.REQUESTED_FRAME_RATE_CATEGORY_NO_PREFERENCE;
    public static final int SCREEN_STATE_OFF = android.view.View.SCREEN_STATE_OFF;
    public static final int SCREEN_STATE_ON = android.view.View.SCREEN_STATE_ON;
    public static final int SCROLLBARS_INSIDE_INSET = android.view.View.SCROLLBARS_INSIDE_INSET;
    public static final int SCROLLBARS_INSIDE_OVERLAY = android.view.View.SCROLLBARS_INSIDE_OVERLAY;
    public static final int SCROLLBARS_OUTSIDE_INSET = android.view.View.SCROLLBARS_OUTSIDE_INSET;
    public static final int SCROLLBARS_OUTSIDE_OVERLAY = android.view.View.SCROLLBARS_OUTSIDE_OVERLAY;
    public static final int SCROLLBAR_POSITION_DEFAULT = android.view.View.SCROLLBAR_POSITION_DEFAULT;
    public static final int SCROLLBAR_POSITION_LEFT = android.view.View.SCROLLBAR_POSITION_LEFT;
    public static final int SCROLLBAR_POSITION_RIGHT = android.view.View.SCROLLBAR_POSITION_RIGHT;
    public static final int SCROLL_AXIS_HORIZONTAL = android.view.View.SCROLL_AXIS_HORIZONTAL;
    public static final int SCROLL_AXIS_NONE = android.view.View.SCROLL_AXIS_NONE;
    public static final int SCROLL_AXIS_VERTICAL = android.view.View.SCROLL_AXIS_VERTICAL;
    public static final int SCROLL_CAPTURE_HINT_AUTO = android.view.View.SCROLL_CAPTURE_HINT_AUTO;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE = android.view.View.SCROLL_CAPTURE_HINT_EXCLUDE;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE_DESCENDANTS = android.view.View.SCROLL_CAPTURE_HINT_EXCLUDE_DESCENDANTS;
    public static final int SCROLL_CAPTURE_HINT_INCLUDE = android.view.View.SCROLL_CAPTURE_HINT_INCLUDE;
    public static final int SCROLL_INDICATOR_BOTTOM = android.view.View.SCROLL_INDICATOR_BOTTOM;
    public static final int SCROLL_INDICATOR_END = android.view.View.SCROLL_INDICATOR_END;
    public static final int SCROLL_INDICATOR_LEFT = android.view.View.SCROLL_INDICATOR_LEFT;
    public static final int SCROLL_INDICATOR_RIGHT = android.view.View.SCROLL_INDICATOR_RIGHT;
    public static final int SCROLL_INDICATOR_START = android.view.View.SCROLL_INDICATOR_START;
    public static final int SCROLL_INDICATOR_TOP = android.view.View.SCROLL_INDICATOR_TOP;
    public static final int SOUND_EFFECTS_ENABLED = android.view.View.SOUND_EFFECTS_ENABLED;
    public static final int STATUS_BAR_HIDDEN = android.view.View.STATUS_BAR_HIDDEN;
    public static final int STATUS_BAR_VISIBLE = android.view.View.STATUS_BAR_VISIBLE;
    public static final int SYSTEM_UI_FLAG_FULLSCREEN = android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
    public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    public static final int SYSTEM_UI_FLAG_IMMERSIVE = android.view.View.SYSTEM_UI_FLAG_IMMERSIVE;
    public static final int SYSTEM_UI_FLAG_IMMERSIVE_STICKY = android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
    public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
    public static final int SYSTEM_UI_FLAG_LAYOUT_STABLE = android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
    public static final int SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
    public static final int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    public static final int SYSTEM_UI_FLAG_VISIBLE = android.view.View.SYSTEM_UI_FLAG_VISIBLE;
    public static final int SYSTEM_UI_LAYOUT_FLAGS = android.view.View.SYSTEM_UI_LAYOUT_FLAGS;
    public static final int TEXT_ALIGNMENT_CENTER = android.view.View.TEXT_ALIGNMENT_CENTER;
    public static final int TEXT_ALIGNMENT_GRAVITY = android.view.View.TEXT_ALIGNMENT_GRAVITY;
    public static final int TEXT_ALIGNMENT_INHERIT = android.view.View.TEXT_ALIGNMENT_INHERIT;
    public static final int TEXT_ALIGNMENT_TEXT_END = android.view.View.TEXT_ALIGNMENT_TEXT_END;
    public static final int TEXT_ALIGNMENT_TEXT_START = android.view.View.TEXT_ALIGNMENT_TEXT_START;
    public static final int TEXT_ALIGNMENT_VIEW_END = android.view.View.TEXT_ALIGNMENT_VIEW_END;
    public static final int TEXT_ALIGNMENT_VIEW_START = android.view.View.TEXT_ALIGNMENT_VIEW_START;
    public static final int TEXT_DIRECTION_ANY_RTL = android.view.View.TEXT_DIRECTION_ANY_RTL;
    public static final int TEXT_DIRECTION_FIRST_STRONG = android.view.View.TEXT_DIRECTION_FIRST_STRONG;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = android.view.View.TEXT_DIRECTION_FIRST_STRONG_LTR;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = android.view.View.TEXT_DIRECTION_FIRST_STRONG_RTL;
    public static final int TEXT_DIRECTION_INHERIT = android.view.View.TEXT_DIRECTION_INHERIT;
    public static final int TEXT_DIRECTION_LOCALE = android.view.View.TEXT_DIRECTION_LOCALE;
    public static final int TEXT_DIRECTION_LTR = android.view.View.TEXT_DIRECTION_LTR;
    public static final int TEXT_DIRECTION_RTL = android.view.View.TEXT_DIRECTION_RTL;
    public static final int VISIBLE = android.view.View.VISIBLE;

    public static final class AccessibilityDelegate {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AccessibilityDelegate(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate wrap(android.view.View.AccessibilityDelegate real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.AccessibilityDelegate getReal() {
            return (android.view.View.AccessibilityDelegate) real;
        }

        public android.view.View.AccessibilityDelegate unwrap() {
            return getReal();
        }

        public AccessibilityDelegate() {
            this(new android.view.View.AccessibilityDelegate(), (__DcgwBridgeToken) null);
        }

        public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
            ((android.view.View.AccessibilityDelegate) real).addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
        }

        public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            return ((android.view.View.AccessibilityDelegate) real).dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(((android.view.View.AccessibilityDelegate) real).getAccessibilityNodeProvider(arg0 == null ? null : arg0.getReal()));
        }

        public void onInitializeAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            ((android.view.View.AccessibilityDelegate) real).onInitializeAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg1) {
            ((android.view.View.AccessibilityDelegate) real).onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            ((android.view.View.AccessibilityDelegate) real).onPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public boolean onRequestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg2) {
            return ((android.view.View.AccessibilityDelegate) real).onRequestSendAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public boolean performAccessibilityAction(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            return ((android.view.View.AccessibilityDelegate) real).performAccessibilityAction(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void sendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
            ((android.view.View.AccessibilityDelegate) real).sendAccessibilityEvent(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            ((android.view.View.AccessibilityDelegate) real).sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class BaseSavedState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BaseSavedState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.BaseSavedState wrap(android.view.View.BaseSavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.BaseSavedState(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.BaseSavedState getReal() {
            return (android.view.View.BaseSavedState) real;
        }

        public android.view.View.BaseSavedState unwrap() {
            return getReal();
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
            this(new android.view.View.BaseSavedState(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.view.View.BaseSavedState(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcel arg0, java.lang.ClassLoader arg1) {
            this(new android.view.View.BaseSavedState(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.View.BaseSavedState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class DragShadowBuilder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DragShadowBuilder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder wrap(android.view.View.DragShadowBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.DragShadowBuilder getReal() {
            return (android.view.View.DragShadowBuilder) real;
        }

        public android.view.View.DragShadowBuilder unwrap() {
            return getReal();
        }

        public DragShadowBuilder() {
            this(new android.view.View.DragShadowBuilder(), (__DcgwBridgeToken) null);
        }

        public DragShadowBuilder(com.micklab.dcg.wrapper.android.view.View arg0) {
            this(new android.view.View.DragShadowBuilder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.View getView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.View.DragShadowBuilder) real).getView());
        }

        public void onDrawShadow(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
            ((android.view.View.DragShadowBuilder) real).onDrawShadow(arg0 == null ? null : arg0.getReal());
        }

        public void onProvideShadowMetrics(com.micklab.dcg.wrapper.android.graphics.Point arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1) {
            ((android.view.View.DragShadowBuilder) real).onProvideShadowMetrics(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class MeasureSpec {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MeasureSpec(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.MeasureSpec wrap(android.view.View.MeasureSpec real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.MeasureSpec(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.MeasureSpec getReal() {
            return (android.view.View.MeasureSpec) real;
        }

        public android.view.View.MeasureSpec unwrap() {
            return getReal();
        }

        public MeasureSpec() {
            this(new android.view.View.MeasureSpec(), (__DcgwBridgeToken) null);
        }

        public static int getMode(int arg0) {
            return android.view.View.MeasureSpec.getMode(arg0);
        }

        public static int getSize(int arg0) {
            return android.view.View.MeasureSpec.getSize(arg0);
        }

        public static int makeMeasureSpec(int arg0, int arg1) {
            return android.view.View.MeasureSpec.makeMeasureSpec(arg0, arg1);
        }

        public static java.lang.String toString(int arg0) {
            return android.view.View.MeasureSpec.toString(arg0);
        }

        public static final int AT_MOST = android.view.View.MeasureSpec.AT_MOST;
        public static final int EXACTLY = android.view.View.MeasureSpec.EXACTLY;
        public static final int UNSPECIFIED = android.view.View.MeasureSpec.UNSPECIFIED;

    }
    public static final class OnApplyWindowInsetsListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnApplyWindowInsetsListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnApplyWindowInsetsListener wrap(android.view.View.OnApplyWindowInsetsListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnApplyWindowInsetsListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnApplyWindowInsetsListener getReal() {
            return (android.view.View.OnApplyWindowInsetsListener) real;
        }

        public android.view.View.OnApplyWindowInsetsListener unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets onApplyWindowInsets(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.WindowInsets arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.View.OnApplyWindowInsetsListener) real).onApplyWindowInsets(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

    }
    public static final class OnAttachStateChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnAttachStateChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener wrap(android.view.View.OnAttachStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnAttachStateChangeListener getReal() {
            return (android.view.View.OnAttachStateChangeListener) real;
        }

        public android.view.View.OnAttachStateChangeListener unwrap() {
            return getReal();
        }

        public void onViewAttachedToWindow(com.micklab.dcg.wrapper.android.view.View arg0) {
            ((android.view.View.OnAttachStateChangeListener) real).onViewAttachedToWindow(arg0 == null ? null : arg0.getReal());
        }

        public void onViewDetachedFromWindow(com.micklab.dcg.wrapper.android.view.View arg0) {
            ((android.view.View.OnAttachStateChangeListener) real).onViewDetachedFromWindow(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnCapturedPointerListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCapturedPointerListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnCapturedPointerListener wrap(android.view.View.OnCapturedPointerListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnCapturedPointerListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnCapturedPointerListener getReal() {
            return (android.view.View.OnCapturedPointerListener) real;
        }

        public android.view.View.OnCapturedPointerListener unwrap() {
            return getReal();
        }

        public boolean onCapturedPointer(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return ((android.view.View.OnCapturedPointerListener) real).onCapturedPointer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnClickListener wrap(android.view.View.OnClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnClickListener getReal() {
            return (android.view.View.OnClickListener) real;
        }

        public android.view.View.OnClickListener unwrap() {
            return getReal();
        }

        public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            ((android.view.View.OnClickListener) real).onClick(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnContextClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnContextClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnContextClickListener wrap(android.view.View.OnContextClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnContextClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnContextClickListener getReal() {
            return (android.view.View.OnContextClickListener) real;
        }

        public android.view.View.OnContextClickListener unwrap() {
            return getReal();
        }

        public boolean onContextClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            return ((android.view.View.OnContextClickListener) real).onContextClick(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnCreateContextMenuListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCreateContextMenuListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnCreateContextMenuListener wrap(android.view.View.OnCreateContextMenuListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnCreateContextMenuListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnCreateContextMenuListener getReal() {
            return (android.view.View.OnCreateContextMenuListener) real;
        }

        public android.view.View.OnCreateContextMenuListener unwrap() {
            return getReal();
        }

        public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
            ((android.view.View.OnCreateContextMenuListener) real).onCreateContextMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

    }
    public static final class OnDragListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDragListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnDragListener wrap(android.view.View.OnDragListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnDragListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnDragListener getReal() {
            return (android.view.View.OnDragListener) real;
        }

        public android.view.View.OnDragListener unwrap() {
            return getReal();
        }

        public boolean onDrag(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.DragEvent arg1) {
            return ((android.view.View.OnDragListener) real).onDrag(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnFocusChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnFocusChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener wrap(android.view.View.OnFocusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnFocusChangeListener getReal() {
            return (android.view.View.OnFocusChangeListener) real;
        }

        public android.view.View.OnFocusChangeListener unwrap() {
            return getReal();
        }

        public void onFocusChange(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
            ((android.view.View.OnFocusChangeListener) real).onFocusChange(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class OnGenericMotionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGenericMotionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnGenericMotionListener wrap(android.view.View.OnGenericMotionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnGenericMotionListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnGenericMotionListener getReal() {
            return (android.view.View.OnGenericMotionListener) real;
        }

        public android.view.View.OnGenericMotionListener unwrap() {
            return getReal();
        }

        public boolean onGenericMotion(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return ((android.view.View.OnGenericMotionListener) real).onGenericMotion(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnHoverListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnHoverListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnHoverListener wrap(android.view.View.OnHoverListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnHoverListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnHoverListener getReal() {
            return (android.view.View.OnHoverListener) real;
        }

        public android.view.View.OnHoverListener unwrap() {
            return getReal();
        }

        public boolean onHover(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return ((android.view.View.OnHoverListener) real).onHover(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnKeyListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnKeyListener wrap(android.view.View.OnKeyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnKeyListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnKeyListener getReal() {
            return (android.view.View.OnKeyListener) real;
        }

        public android.view.View.OnKeyListener unwrap() {
            return getReal();
        }

        public boolean onKey(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return ((android.view.View.OnKeyListener) real).onKey(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

    }
    public static final class OnLayoutChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnLayoutChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener wrap(android.view.View.OnLayoutChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnLayoutChangeListener getReal() {
            return (android.view.View.OnLayoutChangeListener) real;
        }

        public android.view.View.OnLayoutChangeListener unwrap() {
            return getReal();
        }

        public void onLayoutChange(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
            ((android.view.View.OnLayoutChangeListener) real).onLayoutChange(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }

    }
    public static final class OnLongClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnLongClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnLongClickListener wrap(android.view.View.OnLongClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnLongClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnLongClickListener getReal() {
            return (android.view.View.OnLongClickListener) real;
        }

        public android.view.View.OnLongClickListener unwrap() {
            return getReal();
        }

        public boolean onLongClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            return ((android.view.View.OnLongClickListener) real).onLongClick(arg0 == null ? null : arg0.getReal());
        }

        public boolean onLongClickUseDefaultHapticFeedback(com.micklab.dcg.wrapper.android.view.View arg0) {
            return ((android.view.View.OnLongClickListener) real).onLongClickUseDefaultHapticFeedback(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnScrollChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnScrollChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnScrollChangeListener wrap(android.view.View.OnScrollChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnScrollChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnScrollChangeListener getReal() {
            return (android.view.View.OnScrollChangeListener) real;
        }

        public android.view.View.OnScrollChangeListener unwrap() {
            return getReal();
        }

        public void onScrollChange(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
            ((android.view.View.OnScrollChangeListener) real).onScrollChange(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
        }

    }
    public static final class OnSystemUiVisibilityChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSystemUiVisibilityChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnSystemUiVisibilityChangeListener wrap(android.view.View.OnSystemUiVisibilityChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnSystemUiVisibilityChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnSystemUiVisibilityChangeListener getReal() {
            return (android.view.View.OnSystemUiVisibilityChangeListener) real;
        }

        public android.view.View.OnSystemUiVisibilityChangeListener unwrap() {
            return getReal();
        }

        public void onSystemUiVisibilityChange(int arg0) {
            ((android.view.View.OnSystemUiVisibilityChangeListener) real).onSystemUiVisibilityChange(arg0);
        }

    }
    public static final class OnTouchListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTouchListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnTouchListener wrap(android.view.View.OnTouchListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnTouchListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnTouchListener getReal() {
            return (android.view.View.OnTouchListener) real;
        }

        public android.view.View.OnTouchListener unwrap() {
            return getReal();
        }

        public boolean onTouch(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return ((android.view.View.OnTouchListener) real).onTouch(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnUnhandledKeyEventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnUnhandledKeyEventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener wrap(android.view.View.OnUnhandledKeyEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.View.OnUnhandledKeyEventListener getReal() {
            return (android.view.View.OnUnhandledKeyEventListener) real;
        }

        public android.view.View.OnUnhandledKeyEventListener unwrap() {
            return getReal();
        }

        public boolean onUnhandledKeyEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.view.View.OnUnhandledKeyEventListener) real).onUnhandledKeyEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
