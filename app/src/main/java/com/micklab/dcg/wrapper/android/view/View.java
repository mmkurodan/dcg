// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class View {
    private final android.view.View real;

    public View(android.view.View real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.View wrap(android.view.View real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.View(real);
    }

    public android.view.View unwrap() {
        return real;
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.View(arg0 == null ? null : arg0.unwrap()));
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.View(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.view.View(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public View(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.view.View(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void addOnAttachStateChangeListener(com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener arg0) {
        real.addOnAttachStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnLayoutChangeListener(com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener arg0) {
        real.addOnLayoutChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnUnhandledKeyEventListener(com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener arg0) {
        real.addOnUnhandledKeyEventListener(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator animate() {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.animate());
    }

    public void announceForAccessibility(java.lang.CharSequence arg0) {
        real.announceForAccessibility(arg0);
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        real.autofill(arg0 == null ? null : arg0.unwrap());
    }

    public void bringToFront() {
        real.bringToFront();
    }

    public void buildDrawingCache() {
        real.buildDrawingCache();
    }

    public void buildDrawingCache(boolean arg0) {
        real.buildDrawingCache(arg0);
    }

    public void buildLayer() {
        real.buildLayer();
    }

    public boolean callOnClick() {
        return real.callOnClick();
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

    public boolean canScrollHorizontally(int arg0) {
        return real.canScrollHorizontally(arg0);
    }

    public boolean canScrollVertically(int arg0) {
        return real.canScrollVertically(arg0);
    }

    public void cancelDragAndDrop() {
        real.cancelDragAndDrop();
    }

    public void cancelLongPress() {
        real.cancelLongPress();
    }

    public void cancelPendingInputEvents() {
        real.cancelPendingInputEvents();
    }

    public boolean checkInputConnectionProxy(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.checkInputConnectionProxy(arg0 == null ? null : arg0.unwrap());
    }

    public void clearAnimation() {
        real.clearAnimation();
    }

    public void clearFocus() {
        real.clearFocus();
    }

    public void clearPendingCredentialRequest() {
        real.clearPendingCredentialRequest();
    }

    public void clearViewTranslationCallback() {
        real.clearViewTranslationCallback();
    }

    public static int combineMeasuredStates(int arg0, int arg1) {
        return android.view.View.combineMeasuredStates(arg0, arg1);
    }

    public void computeScroll() {
        real.computeScroll();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets computeSystemWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.computeSystemWindowInsets(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(real.createAccessibilityNodeInfo());
    }

    public void createContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0) {
        real.createContextMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void destroyDrawingCache() {
        real.destroyDrawingCache();
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

    public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
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

    public boolean dispatchNestedFling(float arg0, float arg1, boolean arg2) {
        return real.dispatchNestedFling(arg0, arg1, arg2);
    }

    public boolean dispatchNestedPreFling(float arg0, float arg1) {
        return real.dispatchNestedPreFling(arg0, arg1);
    }

    public boolean dispatchNestedPrePerformAccessibilityAction(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.dispatchNestedPrePerformAccessibilityAction(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean dispatchNestedPreScroll(int arg0, int arg1, int[] arg2, int[] arg3) {
        return real.dispatchNestedPreScroll(arg0, arg1, arg2, arg3);
    }

    public boolean dispatchNestedScroll(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        return real.dispatchNestedScroll(arg0, arg1, arg2, arg3, arg4);
    }

    public void dispatchPointerCaptureChanged(boolean arg0) {
        real.dispatchPointerCaptureChanged(arg0);
    }

    public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        return real.dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.dispatchProvideAutofillStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void dispatchProvideStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        real.dispatchProvideStructure(arg0 == null ? null : arg0.unwrap());
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

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.View findFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.findFocus());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(real.findOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.view.View focusSearch(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.focusSearch(arg0));
    }

    public void forceHasOverlappingRendering(boolean arg0) {
        real.forceHasOverlappingRendering(arg0);
    }

    public void forceLayout() {
        real.forceLayout();
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return real.gatherTransparentRegion(arg0 == null ? null : arg0.unwrap());
    }

    public void generateDisplayHash(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashResultCallback arg3) {
        real.generateDisplayHash(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public static int generateViewId() {
        return android.view.View.generateViewId();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate getAccessibilityDelegate() {
        return com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate.wrap(real.getAccessibilityDelegate());
    }

    public int getAccessibilityLiveRegion() {
        return real.getAccessibilityLiveRegion();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(real.getAccessibilityNodeProvider());
    }

    public java.lang.CharSequence getAccessibilityPaneTitle() {
        return real.getAccessibilityPaneTitle();
    }

    public int getAccessibilityTraversalAfter() {
        return real.getAccessibilityTraversalAfter();
    }

    public int getAccessibilityTraversalBefore() {
        return real.getAccessibilityTraversalBefore();
    }

    public java.lang.String getAllowedHandwritingDelegatePackageName() {
        return real.getAllowedHandwritingDelegatePackageName();
    }

    public java.lang.String getAllowedHandwritingDelegatorPackageName() {
        return real.getAllowedHandwritingDelegatorPackageName();
    }

    public float getAlpha() {
        return real.getAlpha();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(real.getAnimation());
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getAnimationMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(real.getAnimationMatrix());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getApplicationWindowToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getApplicationWindowToken());
    }

    public int[] getAttributeResolutionStack(int arg0) {
        return real.getAttributeResolutionStack(arg0);
    }

    public java.lang.String[] getAutofillHints() {
        return real.getAutofillHints();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.getAutofillId());
    }

    public int getAutofillType() {
        return real.getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getAutofillValue());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getBackground());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getBackgroundTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getBackgroundTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getBackgroundTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getBackgroundTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getBackgroundTintMode());
    }

    public int getBaseline() {
        return real.getBaseline();
    }

    public int getBottom() {
        return real.getBottom();
    }

    public float getCameraDistance() {
        return real.getCameraDistance();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getClipBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getClipBounds());
    }

    public boolean getClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getClipBounds(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getClipToOutline() {
        return real.getClipToOutline();
    }

    public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession getContentCaptureSession() {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession.wrap(real.getContentCaptureSession());
    }

    public java.lang.CharSequence getContentDescription() {
        return real.getContentDescription();
    }

    public int getContentSensitivity() {
        return real.getContentSensitivity();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public boolean getDefaultFocusHighlightEnabled() {
        return real.getDefaultFocusHighlightEnabled();
    }

    public static int getDefaultSize(int arg0, int arg1) {
        return android.view.View.getDefaultSize(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(real.getDisplay());
    }

    public int[] getDrawableState() {
        return real.getDrawableState();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getDrawingCache() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getDrawingCache());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getDrawingCache(boolean arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getDrawingCache(arg0));
    }

    public int getDrawingCacheBackgroundColor() {
        return real.getDrawingCacheBackgroundColor();
    }

    public int getDrawingCacheQuality() {
        return real.getDrawingCacheQuality();
    }

    public void getDrawingRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getDrawingRect(arg0 == null ? null : arg0.unwrap());
    }

    public long getDrawingTime() {
        return real.getDrawingTime();
    }

    public float getElevation() {
        return real.getElevation();
    }

    public int getExplicitStyle() {
        return real.getExplicitStyle();
    }

    public boolean getFilterTouchesWhenObscured() {
        return real.getFilterTouchesWhenObscured();
    }

    public boolean getFitsSystemWindows() {
        return real.getFitsSystemWindows();
    }

    public int getFocusable() {
        return real.getFocusable();
    }

    public void getFocusedRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getFocusedRect(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getForeground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getForeground());
    }

    public int getForegroundGravity() {
        return real.getForegroundGravity();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getForegroundTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getForegroundTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getForegroundTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getForegroundTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getForegroundTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getForegroundTintMode());
    }

    public float getFrameContentVelocity() {
        return real.getFrameContentVelocity();
    }

    public boolean getGlobalVisibleRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getGlobalVisibleRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getGlobalVisibleRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1) {
        return real.getGlobalVisibleRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Handler getHandler() {
        return com.micklab.dcg.wrapper.android.os.Handler.wrap(real.getHandler());
    }

    public float getHandwritingBoundsOffsetBottom() {
        return real.getHandwritingBoundsOffsetBottom();
    }

    public float getHandwritingBoundsOffsetLeft() {
        return real.getHandwritingBoundsOffsetLeft();
    }

    public float getHandwritingBoundsOffsetRight() {
        return real.getHandwritingBoundsOffsetRight();
    }

    public float getHandwritingBoundsOffsetTop() {
        return real.getHandwritingBoundsOffsetTop();
    }

    public int getHandwritingDelegateFlags() {
        return real.getHandwritingDelegateFlags();
    }

    public java.lang.Runnable getHandwritingDelegatorCallback() {
        return real.getHandwritingDelegatorCallback();
    }

    public boolean getHasOverlappingRendering() {
        return real.getHasOverlappingRendering();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public void getHitRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getHitRect(arg0 == null ? null : arg0.unwrap());
    }

    public int getHorizontalFadingEdgeLength() {
        return real.getHorizontalFadingEdgeLength();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getHorizontalScrollbarThumbDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getHorizontalScrollbarThumbDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getHorizontalScrollbarTrackDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getHorizontalScrollbarTrackDrawable());
    }

    public int getId() {
        return real.getId();
    }

    public int getImportantForAccessibility() {
        return real.getImportantForAccessibility();
    }

    public int getImportantForAutofill() {
        return real.getImportantForAutofill();
    }

    public int getImportantForContentCapture() {
        return real.getImportantForContentCapture();
    }

    public boolean getKeepScreenOn() {
        return real.getKeepScreenOn();
    }

    public com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState getKeyDispatcherState() {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState.wrap(real.getKeyDispatcherState());
    }

    public int getLabelFor() {
        return real.getLabelFor();
    }

    public int getLayerType() {
        return real.getLayerType();
    }

    public int getLayoutDirection() {
        return real.getLayoutDirection();
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams getLayoutParams() {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams.wrap(real.getLayoutParams());
    }

    public int getLeft() {
        return real.getLeft();
    }

    public boolean getLocalVisibleRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getLocalVisibleRect(arg0 == null ? null : arg0.unwrap());
    }

    public void getLocationInSurface(int[] arg0) {
        real.getLocationInSurface(arg0);
    }

    public void getLocationInWindow(int[] arg0) {
        real.getLocationInWindow(arg0);
    }

    public void getLocationOnScreen(int[] arg0) {
        real.getLocationOnScreen(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(real.getMatrix());
    }

    public int getMeasuredHeight() {
        return real.getMeasuredHeight();
    }

    public int getMeasuredHeightAndState() {
        return real.getMeasuredHeightAndState();
    }

    public int getMeasuredState() {
        return real.getMeasuredState();
    }

    public int getMeasuredWidth() {
        return real.getMeasuredWidth();
    }

    public int getMeasuredWidthAndState() {
        return real.getMeasuredWidthAndState();
    }

    public int getMinimumHeight() {
        return real.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return real.getMinimumWidth();
    }

    public int getNextClusterForwardId() {
        return real.getNextClusterForwardId();
    }

    public int getNextFocusDownId() {
        return real.getNextFocusDownId();
    }

    public int getNextFocusForwardId() {
        return real.getNextFocusForwardId();
    }

    public int getNextFocusLeftId() {
        return real.getNextFocusLeftId();
    }

    public int getNextFocusRightId() {
        return real.getNextFocusRightId();
    }

    public int getNextFocusUpId() {
        return real.getNextFocusUpId();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
        return com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener.wrap(real.getOnFocusChangeListener());
    }

    public int getOutlineAmbientShadowColor() {
        return real.getOutlineAmbientShadowColor();
    }

    public com.micklab.dcg.wrapper.android.view.ViewOutlineProvider getOutlineProvider() {
        return com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(real.getOutlineProvider());
    }

    public int getOutlineSpotShadowColor() {
        return real.getOutlineSpotShadowColor();
    }

    public int getOverScrollMode() {
        return real.getOverScrollMode();
    }

    public com.micklab.dcg.wrapper.android.view.ViewOverlay getOverlay() {
        return com.micklab.dcg.wrapper.android.view.ViewOverlay.wrap(real.getOverlay());
    }

    public int getPaddingBottom() {
        return real.getPaddingBottom();
    }

    public int getPaddingEnd() {
        return real.getPaddingEnd();
    }

    public int getPaddingLeft() {
        return real.getPaddingLeft();
    }

    public int getPaddingRight() {
        return real.getPaddingRight();
    }

    public int getPaddingStart() {
        return real.getPaddingStart();
    }

    public int getPaddingTop() {
        return real.getPaddingTop();
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParent() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(real.getParent());
    }

    public com.micklab.dcg.wrapper.android.view.ViewParent getParentForAccessibility() {
        return com.micklab.dcg.wrapper.android.view.ViewParent.wrap(real.getParentForAccessibility());
    }

    public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest getPendingCredentialRequest() {
        return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.wrap(real.getPendingCredentialRequest());
    }

    public float getPivotX() {
        return real.getPivotX();
    }

    public float getPivotY() {
        return real.getPivotY();
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon getPointerIcon() {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.getPointerIcon());
    }

    public java.lang.String[] getReceiveContentMimeTypes() {
        return real.getReceiveContentMimeTypes();
    }

    public float getRequestedFrameRate() {
        return real.getRequestedFrameRate();
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(real.getResources());
    }

    public boolean getRevealOnFocusHint() {
        return real.getRevealOnFocusHint();
    }

    public int getRight() {
        return real.getRight();
    }

    public com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl getRootSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.wrap(real.getRootSurfaceControl());
    }

    public com.micklab.dcg.wrapper.android.view.View getRootView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getRootView());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets getRootWindowInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.getRootWindowInsets());
    }

    public float getRotation() {
        return real.getRotation();
    }

    public float getRotationX() {
        return real.getRotationX();
    }

    public float getRotationY() {
        return real.getRotationY();
    }

    public float getScaleX() {
        return real.getScaleX();
    }

    public float getScaleY() {
        return real.getScaleY();
    }

    public int getScrollBarDefaultDelayBeforeFade() {
        return real.getScrollBarDefaultDelayBeforeFade();
    }

    public int getScrollBarFadeDuration() {
        return real.getScrollBarFadeDuration();
    }

    public int getScrollBarSize() {
        return real.getScrollBarSize();
    }

    public int getScrollBarStyle() {
        return real.getScrollBarStyle();
    }

    public int getScrollCaptureHint() {
        return real.getScrollCaptureHint();
    }

    public int getScrollIndicators() {
        return real.getScrollIndicators();
    }

    public int getScrollX() {
        return real.getScrollX();
    }

    public int getScrollY() {
        return real.getScrollY();
    }

    public int getSolidColor() {
        return real.getSolidColor();
    }

    public int getSourceLayoutResId() {
        return real.getSourceLayoutResId();
    }

    public java.lang.CharSequence getStateDescription() {
        return real.getStateDescription();
    }

    public com.micklab.dcg.wrapper.android.animation.StateListAnimator getStateListAnimator() {
        return com.micklab.dcg.wrapper.android.animation.StateListAnimator.wrap(real.getStateListAnimator());
    }

    public int getSystemUiVisibility() {
        return real.getSystemUiVisibility();
    }

    public java.lang.Object getTag() {
        return real.getTag();
    }

    public java.lang.Object getTag(int arg0) {
        return real.getTag(arg0);
    }

    public int getTextAlignment() {
        return real.getTextAlignment();
    }

    public int getTextDirection() {
        return real.getTextDirection();
    }

    public java.lang.CharSequence getTooltipText() {
        return real.getTooltipText();
    }

    public int getTop() {
        return real.getTop();
    }

    public com.micklab.dcg.wrapper.android.view.TouchDelegate getTouchDelegate() {
        return com.micklab.dcg.wrapper.android.view.TouchDelegate.wrap(real.getTouchDelegate());
    }

    public float getTransitionAlpha() {
        return real.getTransitionAlpha();
    }

    public java.lang.String getTransitionName() {
        return real.getTransitionName();
    }

    public float getTranslationX() {
        return real.getTranslationX();
    }

    public float getTranslationY() {
        return real.getTranslationY();
    }

    public float getTranslationZ() {
        return real.getTranslationZ();
    }

    public long getUniqueDrawingId() {
        return real.getUniqueDrawingId();
    }

    public int getVerticalFadingEdgeLength() {
        return real.getVerticalFadingEdgeLength();
    }

    public int getVerticalScrollbarPosition() {
        return real.getVerticalScrollbarPosition();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getVerticalScrollbarThumbDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getVerticalScrollbarThumbDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getVerticalScrollbarTrackDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getVerticalScrollbarTrackDrawable());
    }

    public int getVerticalScrollbarWidth() {
        return real.getVerticalScrollbarWidth();
    }

    public com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse getViewTranslationResponse() {
        return com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse.wrap(real.getViewTranslationResponse());
    }

    public com.micklab.dcg.wrapper.android.view.ViewTreeObserver getViewTreeObserver() {
        return com.micklab.dcg.wrapper.android.view.ViewTreeObserver.wrap(real.getViewTreeObserver());
    }

    public int getVisibility() {
        return real.getVisibility();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public com.micklab.dcg.wrapper.android.view.WindowId getWindowId() {
        return com.micklab.dcg.wrapper.android.view.WindowId.wrap(real.getWindowId());
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsetsController getWindowInsetsController() {
        return com.micklab.dcg.wrapper.android.view.WindowInsetsController.wrap(real.getWindowInsetsController());
    }

    public int getWindowSystemUiVisibility() {
        return real.getWindowSystemUiVisibility();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getWindowToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getWindowToken());
    }

    public int getWindowVisibility() {
        return real.getWindowVisibility();
    }

    public void getWindowVisibleDisplayFrame(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getWindowVisibleDisplayFrame(arg0 == null ? null : arg0.unwrap());
    }

    public float getX() {
        return real.getX();
    }

    public float getY() {
        return real.getY();
    }

    public float getZ() {
        return real.getZ();
    }

    public boolean hasExplicitFocusable() {
        return real.hasExplicitFocusable();
    }

    public boolean hasFocus() {
        return real.hasFocus();
    }

    public boolean hasFocusable() {
        return real.hasFocusable();
    }

    public boolean hasNestedScrollingParent() {
        return real.hasNestedScrollingParent();
    }

    public boolean hasOnClickListeners() {
        return real.hasOnClickListeners();
    }

    public boolean hasOnLongClickListeners() {
        return real.hasOnLongClickListeners();
    }

    public boolean hasOverlappingRendering() {
        return real.hasOverlappingRendering();
    }

    public boolean hasPointerCapture() {
        return real.hasPointerCapture();
    }

    public boolean hasTransientState() {
        return real.hasTransientState();
    }

    public boolean hasWindowFocus() {
        return real.hasWindowFocus();
    }

    public static com.micklab.dcg.wrapper.android.view.View inflate(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(android.view.View.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public void invalidate() {
        real.invalidate();
    }

    public void invalidate(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.invalidate(arg0 == null ? null : arg0.unwrap());
    }

    public void invalidate(int arg0, int arg1, int arg2, int arg3) {
        real.invalidate(arg0, arg1, arg2, arg3);
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void invalidateOutline() {
        real.invalidateOutline();
    }

    public boolean isAccessibilityDataSensitive() {
        return real.isAccessibilityDataSensitive();
    }

    public boolean isAccessibilityFocused() {
        return real.isAccessibilityFocused();
    }

    public boolean isAccessibilityHeading() {
        return real.isAccessibilityHeading();
    }

    public boolean isActivated() {
        return real.isActivated();
    }

    public boolean isAttachedToWindow() {
        return real.isAttachedToWindow();
    }

    public boolean isAutoHandwritingEnabled() {
        return real.isAutoHandwritingEnabled();
    }

    public boolean isClickable() {
        return real.isClickable();
    }

    public boolean isContentSensitive() {
        return real.isContentSensitive();
    }

    public boolean isContextClickable() {
        return real.isContextClickable();
    }

    public boolean isCredential() {
        return real.isCredential();
    }

    public boolean isDirty() {
        return real.isDirty();
    }

    public boolean isDrawingCacheEnabled() {
        return real.isDrawingCacheEnabled();
    }

    public boolean isDuplicateParentStateEnabled() {
        return real.isDuplicateParentStateEnabled();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isFocusable() {
        return real.isFocusable();
    }

    public boolean isFocusableInTouchMode() {
        return real.isFocusableInTouchMode();
    }

    public boolean isFocused() {
        return real.isFocused();
    }

    public boolean isFocusedByDefault() {
        return real.isFocusedByDefault();
    }

    public boolean isForceDarkAllowed() {
        return real.isForceDarkAllowed();
    }

    public boolean isHandwritingDelegate() {
        return real.isHandwritingDelegate();
    }

    public boolean isHapticFeedbackEnabled() {
        return real.isHapticFeedbackEnabled();
    }

    public boolean isHardwareAccelerated() {
        return real.isHardwareAccelerated();
    }

    public boolean isHorizontalFadingEdgeEnabled() {
        return real.isHorizontalFadingEdgeEnabled();
    }

    public boolean isHorizontalScrollBarEnabled() {
        return real.isHorizontalScrollBarEnabled();
    }

    public boolean isHovered() {
        return real.isHovered();
    }

    public boolean isImportantForAccessibility() {
        return real.isImportantForAccessibility();
    }

    public boolean isImportantForAutofill() {
        return real.isImportantForAutofill();
    }

    public boolean isImportantForContentCapture() {
        return real.isImportantForContentCapture();
    }

    public boolean isInEditMode() {
        return real.isInEditMode();
    }

    public boolean isInLayout() {
        return real.isInLayout();
    }

    public boolean isInTouchMode() {
        return real.isInTouchMode();
    }

    public boolean isKeyboardNavigationCluster() {
        return real.isKeyboardNavigationCluster();
    }

    public boolean isLaidOut() {
        return real.isLaidOut();
    }

    public boolean isLayoutDirectionResolved() {
        return real.isLayoutDirectionResolved();
    }

    public boolean isLayoutRequested() {
        return real.isLayoutRequested();
    }

    public boolean isLongClickable() {
        return real.isLongClickable();
    }

    public boolean isNestedScrollingEnabled() {
        return real.isNestedScrollingEnabled();
    }

    public boolean isOpaque() {
        return real.isOpaque();
    }

    public boolean isPaddingRelative() {
        return real.isPaddingRelative();
    }

    public boolean isPivotSet() {
        return real.isPivotSet();
    }

    public boolean isPreferKeepClear() {
        return real.isPreferKeepClear();
    }

    public boolean isPressed() {
        return real.isPressed();
    }

    public boolean isSaveEnabled() {
        return real.isSaveEnabled();
    }

    public boolean isSaveFromParentEnabled() {
        return real.isSaveFromParentEnabled();
    }

    public boolean isScreenReaderFocusable() {
        return real.isScreenReaderFocusable();
    }

    public boolean isScrollContainer() {
        return real.isScrollContainer();
    }

    public boolean isScrollbarFadingEnabled() {
        return real.isScrollbarFadingEnabled();
    }

    public boolean isSelected() {
        return real.isSelected();
    }

    public boolean isShowingLayoutBounds() {
        return real.isShowingLayoutBounds();
    }

    public boolean isShown() {
        return real.isShown();
    }

    public boolean isSoundEffectsEnabled() {
        return real.isSoundEffectsEnabled();
    }

    public boolean isTemporarilyDetached() {
        return real.isTemporarilyDetached();
    }

    public boolean isTextAlignmentResolved() {
        return real.isTextAlignmentResolved();
    }

    public boolean isTextDirectionResolved() {
        return real.isTextDirectionResolved();
    }

    public boolean isVerticalFadingEdgeEnabled() {
        return real.isVerticalFadingEdgeEnabled();
    }

    public boolean isVerticalScrollBarEnabled() {
        return real.isVerticalScrollBarEnabled();
    }

    public boolean isVisibleToUserForAutofill(int arg0) {
        return real.isVisibleToUserForAutofill(arg0);
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.view.View keyboardNavigationClusterSearch(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.keyboardNavigationClusterSearch(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void layout(int arg0, int arg1, int arg2, int arg3) {
        real.layout(arg0, arg1, arg2, arg3);
    }

    public void measure(int arg0, int arg1) {
        real.measure(arg0, arg1);
    }

    public void offsetLeftAndRight(int arg0) {
        real.offsetLeftAndRight(arg0);
    }

    public void offsetTopAndBottom(int arg0) {
        real.offsetTopAndBottom(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets onApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.onApplyWindowInsets(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCancelPendingInputEvents() {
        real.onCancelPendingInputEvents();
    }

    public boolean onCapturedPointerEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onCapturedPointerEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onCheckIsTextEditor() {
        return real.onCheckIsTextEditor();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(real.onCreateInputConnection(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean onDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return real.onDragEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onDrawForeground(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.onDrawForeground(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onFilterTouchEventForSecurity(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onFilterTouchEventForSecurity(arg0 == null ? null : arg0.unwrap());
    }

    public void onFinishTemporaryDetach() {
        real.onFinishTemporaryDetach();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onHoverChanged(boolean arg0) {
        real.onHoverChanged(arg0);
    }

    public boolean onHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onHoverEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onInitializeAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        real.onInitializeAccessibilityEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        real.onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyLongPress(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyPreIme(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyShortcut(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onPointerCaptureChange(boolean arg0) {
        real.onPointerCaptureChange(arg0);
    }

    public void onPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        real.onPopulateAccessibilityEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onProvideAutofillStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.onProvideAutofillStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onProvideAutofillVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.onProvideAutofillVirtualStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onProvideContentCaptureStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        real.onProvideContentCaptureStructure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onProvideStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        real.onProvideStructure(arg0 == null ? null : arg0.unwrap());
    }

    public void onProvideVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        real.onProvideVirtualStructure(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo onReceiveContent(com.micklab.dcg.wrapper.android.view.ContentInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(real.onReceiveContent(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(real.onResolvePointerIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void onRtlPropertiesChanged(int arg0) {
        real.onRtlPropertiesChanged(arg0);
    }

    public void onScreenStateChanged(int arg0) {
        real.onScreenStateChanged(arg0);
    }

    public void onStartTemporaryDetach() {
        real.onStartTemporaryDetach();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onViewTranslationResponse(com.micklab.dcg.wrapper.android.view.translation.ViewTranslationResponse arg0) {
        real.onViewTranslationResponse(arg0 == null ? null : arg0.unwrap());
    }

    public void onVisibilityAggregated(boolean arg0) {
        real.onVisibilityAggregated(arg0);
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public void onWindowSystemUiVisibilityChanged(int arg0) {
        real.onWindowSystemUiVisibilityChanged(arg0);
    }

    public boolean performAccessibilityAction(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.performAccessibilityAction(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean performClick() {
        return real.performClick();
    }

    public boolean performContextClick() {
        return real.performContextClick();
    }

    public boolean performContextClick(float arg0, float arg1) {
        return real.performContextClick(arg0, arg1);
    }

    public boolean performHapticFeedback(int arg0) {
        return real.performHapticFeedback(arg0);
    }

    public boolean performHapticFeedback(int arg0, int arg1) {
        return real.performHapticFeedback(arg0, arg1);
    }

    public boolean performLongClick() {
        return real.performLongClick();
    }

    public boolean performLongClick(float arg0, float arg1) {
        return real.performLongClick(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo performReceiveContent(com.micklab.dcg.wrapper.android.view.ContentInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(real.performReceiveContent(arg0 == null ? null : arg0.unwrap()));
    }

    public void playSoundEffect(int arg0) {
        real.playSoundEffect(arg0);
    }

    public boolean post(java.lang.Runnable arg0) {
        return real.post(arg0);
    }

    public boolean postDelayed(java.lang.Runnable arg0, long arg1) {
        return real.postDelayed(arg0, arg1);
    }

    public void postInvalidate() {
        real.postInvalidate();
    }

    public void postInvalidate(int arg0, int arg1, int arg2, int arg3) {
        real.postInvalidate(arg0, arg1, arg2, arg3);
    }

    public void postInvalidateDelayed(long arg0) {
        real.postInvalidateDelayed(arg0);
    }

    public void postInvalidateDelayed(long arg0, int arg1, int arg2, int arg3, int arg4) {
        real.postInvalidateDelayed(arg0, arg1, arg2, arg3, arg4);
    }

    public void postInvalidateOnAnimation() {
        real.postInvalidateOnAnimation();
    }

    public void postInvalidateOnAnimation(int arg0, int arg1, int arg2, int arg3) {
        real.postInvalidateOnAnimation(arg0, arg1, arg2, arg3);
    }

    public void postOnAnimation(java.lang.Runnable arg0) {
        real.postOnAnimation(arg0);
    }

    public void postOnAnimationDelayed(java.lang.Runnable arg0, long arg1) {
        real.postOnAnimationDelayed(arg0, arg1);
    }

    public void refreshDrawableState() {
        real.refreshDrawableState();
    }

    public void releasePointerCapture() {
        real.releasePointerCapture();
    }

    public boolean removeCallbacks(java.lang.Runnable arg0) {
        return real.removeCallbacks(arg0);
    }

    public void removeOnAttachStateChangeListener(com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener arg0) {
        real.removeOnAttachStateChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnLayoutChangeListener(com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener arg0) {
        real.removeOnLayoutChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnUnhandledKeyEventListener(com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener arg0) {
        real.removeOnUnhandledKeyEventListener(arg0 == null ? null : arg0.unwrap());
    }

    public void requestApplyInsets() {
        real.requestApplyInsets();
    }

    public void requestFitSystemWindows() {
        real.requestFitSystemWindows();
    }

    public boolean requestFocus() {
        return real.requestFocus();
    }

    public boolean requestFocus(int arg0) {
        return real.requestFocus(arg0);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return real.requestFocus(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean requestFocusFromTouch() {
        return real.requestFocusFromTouch();
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public void requestPointerCapture() {
        real.requestPointerCapture();
    }

    public boolean requestRectangleOnScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.requestRectangleOnScreen(arg0 == null ? null : arg0.unwrap());
    }

    public boolean requestRectangleOnScreen(com.micklab.dcg.wrapper.android.graphics.Rect arg0, boolean arg1) {
        return real.requestRectangleOnScreen(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void requestUnbufferedDispatch(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.requestUnbufferedDispatch(arg0 == null ? null : arg0.unwrap());
    }

    public void requestUnbufferedDispatch(int arg0) {
        real.requestUnbufferedDispatch(arg0);
    }

    public void resetPivot() {
        real.resetPivot();
    }

    public static int resolveSize(int arg0, int arg1) {
        return android.view.View.resolveSize(arg0, arg1);
    }

    public static int resolveSizeAndState(int arg0, int arg1, int arg2) {
        return android.view.View.resolveSizeAndState(arg0, arg1, arg2);
    }

    public boolean restoreDefaultFocus() {
        return real.restoreDefaultFocus();
    }

    public void saveAttributeDataForStyleable(com.micklab.dcg.wrapper.android.content.Context arg0, int[] arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.TypedArray arg3, int arg4, int arg5) {
        real.saveAttributeDataForStyleable(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5);
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        real.scheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void scrollBy(int arg0, int arg1) {
        real.scrollBy(arg0, arg1);
    }

    public void scrollTo(int arg0, int arg1) {
        real.scrollTo(arg0, arg1);
    }

    public void sendAccessibilityEvent(int arg0) {
        real.sendAccessibilityEvent(arg0);
    }

    public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        real.sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.unwrap());
    }

    public void setAccessibilityDataSensitive(int arg0) {
        real.setAccessibilityDataSensitive(arg0);
    }

    public void setAccessibilityDelegate(com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate arg0) {
        real.setAccessibilityDelegate(arg0 == null ? null : arg0.unwrap());
    }

    public void setAccessibilityHeading(boolean arg0) {
        real.setAccessibilityHeading(arg0);
    }

    public void setAccessibilityLiveRegion(int arg0) {
        real.setAccessibilityLiveRegion(arg0);
    }

    public void setAccessibilityPaneTitle(java.lang.CharSequence arg0) {
        real.setAccessibilityPaneTitle(arg0);
    }

    public void setAccessibilityTraversalAfter(int arg0) {
        real.setAccessibilityTraversalAfter(arg0);
    }

    public void setAccessibilityTraversalBefore(int arg0) {
        real.setAccessibilityTraversalBefore(arg0);
    }

    public void setActivated(boolean arg0) {
        real.setActivated(arg0);
    }

    public void setAllowClickWhenDisabled(boolean arg0) {
        real.setAllowClickWhenDisabled(arg0);
    }

    public void setAllowedHandwritingDelegatePackage(java.lang.String arg0) {
        real.setAllowedHandwritingDelegatePackage(arg0);
    }

    public void setAllowedHandwritingDelegatorPackage(java.lang.String arg0) {
        real.setAllowedHandwritingDelegatorPackage(arg0);
    }

    public void setAlpha(float arg0) {
        real.setAlpha(arg0);
    }

    public void setAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        real.setAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnimationMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.setAnimationMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public void setAutoHandwritingEnabled(boolean arg0) {
        real.setAutoHandwritingEnabled(arg0);
    }

    public void setAutofillHints(java.lang.String... arg0) {
        real.setAutofillHints(arg0);
    }

    public void setAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
        real.setAutofillId(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackground(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setBackground(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackgroundColor(int arg0) {
        real.setBackgroundColor(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackgroundResource(int arg0) {
        real.setBackgroundResource(arg0);
    }

    public void setBackgroundTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setBackgroundTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackgroundTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setBackgroundTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackgroundTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setBackgroundTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setBottom(int arg0) {
        real.setBottom(arg0);
    }

    public void setCameraDistance(float arg0) {
        real.setCameraDistance(arg0);
    }

    public void setClickable(boolean arg0) {
        real.setClickable(arg0);
    }

    public void setClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setClipBounds(arg0 == null ? null : arg0.unwrap());
    }

    public void setClipToOutline(boolean arg0) {
        real.setClipToOutline(arg0);
    }

    public void setContentCaptureSession(com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSession arg0) {
        real.setContentCaptureSession(arg0 == null ? null : arg0.unwrap());
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        real.setContentDescription(arg0);
    }

    public void setContentSensitivity(int arg0) {
        real.setContentSensitivity(arg0);
    }

    public void setContextClickable(boolean arg0) {
        real.setContextClickable(arg0);
    }

    public void setDefaultFocusHighlightEnabled(boolean arg0) {
        real.setDefaultFocusHighlightEnabled(arg0);
    }

    public void setDrawingCacheBackgroundColor(int arg0) {
        real.setDrawingCacheBackgroundColor(arg0);
    }

    public void setDrawingCacheEnabled(boolean arg0) {
        real.setDrawingCacheEnabled(arg0);
    }

    public void setDrawingCacheQuality(int arg0) {
        real.setDrawingCacheQuality(arg0);
    }

    public void setDuplicateParentStateEnabled(boolean arg0) {
        real.setDuplicateParentStateEnabled(arg0);
    }

    public void setElevation(float arg0) {
        real.setElevation(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setFadingEdgeLength(int arg0) {
        real.setFadingEdgeLength(arg0);
    }

    public void setFilterTouchesWhenObscured(boolean arg0) {
        real.setFilterTouchesWhenObscured(arg0);
    }

    public void setFitsSystemWindows(boolean arg0) {
        real.setFitsSystemWindows(arg0);
    }

    public void setFocusable(int arg0) {
        real.setFocusable(arg0);
    }

    public void setFocusable(boolean arg0) {
        real.setFocusable(arg0);
    }

    public void setFocusableInTouchMode(boolean arg0) {
        real.setFocusableInTouchMode(arg0);
    }

    public void setFocusedByDefault(boolean arg0) {
        real.setFocusedByDefault(arg0);
    }

    public void setForceDarkAllowed(boolean arg0) {
        real.setForceDarkAllowed(arg0);
    }

    public void setForeground(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setForeground(arg0 == null ? null : arg0.unwrap());
    }

    public void setForegroundGravity(int arg0) {
        real.setForegroundGravity(arg0);
    }

    public void setForegroundTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setForegroundTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setForegroundTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setForegroundTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setForegroundTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setForegroundTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setFrameContentVelocity(float arg0) {
        real.setFrameContentVelocity(arg0);
    }

    public void setHandwritingBoundsOffsets(float arg0, float arg1, float arg2, float arg3) {
        real.setHandwritingBoundsOffsets(arg0, arg1, arg2, arg3);
    }

    public void setHandwritingDelegateFlags(int arg0) {
        real.setHandwritingDelegateFlags(arg0);
    }

    public void setHandwritingDelegatorCallback(java.lang.Runnable arg0) {
        real.setHandwritingDelegatorCallback(arg0);
    }

    public void setHapticFeedbackEnabled(boolean arg0) {
        real.setHapticFeedbackEnabled(arg0);
    }

    public void setHasTransientState(boolean arg0) {
        real.setHasTransientState(arg0);
    }

    public void setHorizontalFadingEdgeEnabled(boolean arg0) {
        real.setHorizontalFadingEdgeEnabled(arg0);
    }

    public void setHorizontalScrollBarEnabled(boolean arg0) {
        real.setHorizontalScrollBarEnabled(arg0);
    }

    public void setHorizontalScrollbarThumbDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setHorizontalScrollbarThumbDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setHorizontalScrollbarTrackDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setHorizontalScrollbarTrackDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setHovered(boolean arg0) {
        real.setHovered(arg0);
    }

    public void setId(int arg0) {
        real.setId(arg0);
    }

    public void setImportantForAccessibility(int arg0) {
        real.setImportantForAccessibility(arg0);
    }

    public void setImportantForAutofill(int arg0) {
        real.setImportantForAutofill(arg0);
    }

    public void setImportantForContentCapture(int arg0) {
        real.setImportantForContentCapture(arg0);
    }

    public void setIsCredential(boolean arg0) {
        real.setIsCredential(arg0);
    }

    public void setIsHandwritingDelegate(boolean arg0) {
        real.setIsHandwritingDelegate(arg0);
    }

    public void setKeepScreenOn(boolean arg0) {
        real.setKeepScreenOn(arg0);
    }

    public void setKeyboardNavigationCluster(boolean arg0) {
        real.setKeyboardNavigationCluster(arg0);
    }

    public void setLabelFor(int arg0) {
        real.setLabelFor(arg0);
    }

    public void setLayerPaint(com.micklab.dcg.wrapper.android.graphics.Paint arg0) {
        real.setLayerPaint(arg0 == null ? null : arg0.unwrap());
    }

    public void setLayerType(int arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.setLayerType(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setLayoutDirection(int arg0) {
        real.setLayoutDirection(arg0);
    }

    public void setLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
        real.setLayoutParams(arg0 == null ? null : arg0.unwrap());
    }

    public void setLeft(int arg0) {
        real.setLeft(arg0);
    }

    public void setLeftTopRightBottom(int arg0, int arg1, int arg2, int arg3) {
        real.setLeftTopRightBottom(arg0, arg1, arg2, arg3);
    }

    public void setLongClickable(boolean arg0) {
        real.setLongClickable(arg0);
    }

    public void setMinimumHeight(int arg0) {
        real.setMinimumHeight(arg0);
    }

    public void setMinimumWidth(int arg0) {
        real.setMinimumWidth(arg0);
    }

    public void setNestedScrollingEnabled(boolean arg0) {
        real.setNestedScrollingEnabled(arg0);
    }

    public void setNextClusterForwardId(int arg0) {
        real.setNextClusterForwardId(arg0);
    }

    public void setNextFocusDownId(int arg0) {
        real.setNextFocusDownId(arg0);
    }

    public void setNextFocusForwardId(int arg0) {
        real.setNextFocusForwardId(arg0);
    }

    public void setNextFocusLeftId(int arg0) {
        real.setNextFocusLeftId(arg0);
    }

    public void setNextFocusRightId(int arg0) {
        real.setNextFocusRightId(arg0);
    }

    public void setNextFocusUpId(int arg0) {
        real.setNextFocusUpId(arg0);
    }

    public void setOnApplyWindowInsetsListener(com.micklab.dcg.wrapper.android.view.View.OnApplyWindowInsetsListener arg0) {
        real.setOnApplyWindowInsetsListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnCapturedPointerListener(com.micklab.dcg.wrapper.android.view.View.OnCapturedPointerListener arg0) {
        real.setOnCapturedPointerListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setOnClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnContextClickListener(com.micklab.dcg.wrapper.android.view.View.OnContextClickListener arg0) {
        real.setOnContextClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnCreateContextMenuListener(com.micklab.dcg.wrapper.android.view.View.OnCreateContextMenuListener arg0) {
        real.setOnCreateContextMenuListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDragListener(com.micklab.dcg.wrapper.android.view.View.OnDragListener arg0) {
        real.setOnDragListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnFocusChangeListener(com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener arg0) {
        real.setOnFocusChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnGenericMotionListener(com.micklab.dcg.wrapper.android.view.View.OnGenericMotionListener arg0) {
        real.setOnGenericMotionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnHoverListener(com.micklab.dcg.wrapper.android.view.View.OnHoverListener arg0) {
        real.setOnHoverListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnKeyListener(com.micklab.dcg.wrapper.android.view.View.OnKeyListener arg0) {
        real.setOnKeyListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnLongClickListener(com.micklab.dcg.wrapper.android.view.View.OnLongClickListener arg0) {
        real.setOnLongClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnReceiveContentListener(java.lang.String[] arg0, com.micklab.dcg.wrapper.android.view.OnReceiveContentListener arg1) {
        real.setOnReceiveContentListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setOnScrollChangeListener(com.micklab.dcg.wrapper.android.view.View.OnScrollChangeListener arg0) {
        real.setOnScrollChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnSystemUiVisibilityChangeListener(com.micklab.dcg.wrapper.android.view.View.OnSystemUiVisibilityChangeListener arg0) {
        real.setOnSystemUiVisibilityChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnTouchListener(com.micklab.dcg.wrapper.android.view.View.OnTouchListener arg0) {
        real.setOnTouchListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOutlineAmbientShadowColor(int arg0) {
        real.setOutlineAmbientShadowColor(arg0);
    }

    public void setOutlineProvider(com.micklab.dcg.wrapper.android.view.ViewOutlineProvider arg0) {
        real.setOutlineProvider(arg0 == null ? null : arg0.unwrap());
    }

    public void setOutlineSpotShadowColor(int arg0) {
        real.setOutlineSpotShadowColor(arg0);
    }

    public void setOverScrollMode(int arg0) {
        real.setOverScrollMode(arg0);
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        real.setPadding(arg0, arg1, arg2, arg3);
    }

    public void setPaddingRelative(int arg0, int arg1, int arg2, int arg3) {
        real.setPaddingRelative(arg0, arg1, arg2, arg3);
    }

    public void setPivotX(float arg0) {
        real.setPivotX(arg0);
    }

    public void setPivotY(float arg0) {
        real.setPivotY(arg0);
    }

    public void setPointerIcon(com.micklab.dcg.wrapper.android.view.PointerIcon arg0) {
        real.setPointerIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreferKeepClear(boolean arg0) {
        real.setPreferKeepClear(arg0);
    }

    public void setPressed(boolean arg0) {
        real.setPressed(arg0);
    }

    public void setRenderEffect(com.micklab.dcg.wrapper.android.graphics.RenderEffect arg0) {
        real.setRenderEffect(arg0 == null ? null : arg0.unwrap());
    }

    public void setRequestedFrameRate(float arg0) {
        real.setRequestedFrameRate(arg0);
    }

    public void setRevealOnFocusHint(boolean arg0) {
        real.setRevealOnFocusHint(arg0);
    }

    public void setRight(int arg0) {
        real.setRight(arg0);
    }

    public void setRotation(float arg0) {
        real.setRotation(arg0);
    }

    public void setRotationX(float arg0) {
        real.setRotationX(arg0);
    }

    public void setRotationY(float arg0) {
        real.setRotationY(arg0);
    }

    public void setSaveEnabled(boolean arg0) {
        real.setSaveEnabled(arg0);
    }

    public void setSaveFromParentEnabled(boolean arg0) {
        real.setSaveFromParentEnabled(arg0);
    }

    public void setScaleX(float arg0) {
        real.setScaleX(arg0);
    }

    public void setScaleY(float arg0) {
        real.setScaleY(arg0);
    }

    public void setScreenReaderFocusable(boolean arg0) {
        real.setScreenReaderFocusable(arg0);
    }

    public void setScrollBarDefaultDelayBeforeFade(int arg0) {
        real.setScrollBarDefaultDelayBeforeFade(arg0);
    }

    public void setScrollBarFadeDuration(int arg0) {
        real.setScrollBarFadeDuration(arg0);
    }

    public void setScrollBarSize(int arg0) {
        real.setScrollBarSize(arg0);
    }

    public void setScrollBarStyle(int arg0) {
        real.setScrollBarStyle(arg0);
    }

    public void setScrollCaptureCallback(com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg0) {
        real.setScrollCaptureCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setScrollCaptureHint(int arg0) {
        real.setScrollCaptureHint(arg0);
    }

    public void setScrollContainer(boolean arg0) {
        real.setScrollContainer(arg0);
    }

    public void setScrollIndicators(int arg0) {
        real.setScrollIndicators(arg0);
    }

    public void setScrollIndicators(int arg0, int arg1) {
        real.setScrollIndicators(arg0, arg1);
    }

    public void setScrollX(int arg0) {
        real.setScrollX(arg0);
    }

    public void setScrollY(int arg0) {
        real.setScrollY(arg0);
    }

    public void setScrollbarFadingEnabled(boolean arg0) {
        real.setScrollbarFadingEnabled(arg0);
    }

    public void setSelected(boolean arg0) {
        real.setSelected(arg0);
    }

    public void setSoundEffectsEnabled(boolean arg0) {
        real.setSoundEffectsEnabled(arg0);
    }

    public void setStateDescription(java.lang.CharSequence arg0) {
        real.setStateDescription(arg0);
    }

    public void setStateListAnimator(com.micklab.dcg.wrapper.android.animation.StateListAnimator arg0) {
        real.setStateListAnimator(arg0 == null ? null : arg0.unwrap());
    }

    public void setSystemUiVisibility(int arg0) {
        real.setSystemUiVisibility(arg0);
    }

    public void setTag(java.lang.Object arg0) {
        real.setTag(arg0);
    }

    public void setTag(int arg0, java.lang.Object arg1) {
        real.setTag(arg0, arg1);
    }

    public void setTextAlignment(int arg0) {
        real.setTextAlignment(arg0);
    }

    public void setTextDirection(int arg0) {
        real.setTextDirection(arg0);
    }

    public void setTooltipText(java.lang.CharSequence arg0) {
        real.setTooltipText(arg0);
    }

    public void setTop(int arg0) {
        real.setTop(arg0);
    }

    public void setTouchDelegate(com.micklab.dcg.wrapper.android.view.TouchDelegate arg0) {
        real.setTouchDelegate(arg0 == null ? null : arg0.unwrap());
    }

    public void setTransitionAlpha(float arg0) {
        real.setTransitionAlpha(arg0);
    }

    public void setTransitionName(java.lang.String arg0) {
        real.setTransitionName(arg0);
    }

    public void setTransitionVisibility(int arg0) {
        real.setTransitionVisibility(arg0);
    }

    public void setTranslationX(float arg0) {
        real.setTranslationX(arg0);
    }

    public void setTranslationY(float arg0) {
        real.setTranslationY(arg0);
    }

    public void setTranslationZ(float arg0) {
        real.setTranslationZ(arg0);
    }

    public void setVerticalFadingEdgeEnabled(boolean arg0) {
        real.setVerticalFadingEdgeEnabled(arg0);
    }

    public void setVerticalScrollBarEnabled(boolean arg0) {
        real.setVerticalScrollBarEnabled(arg0);
    }

    public void setVerticalScrollbarPosition(int arg0) {
        real.setVerticalScrollbarPosition(arg0);
    }

    public void setVerticalScrollbarThumbDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setVerticalScrollbarThumbDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setVerticalScrollbarTrackDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setVerticalScrollbarTrackDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setViewTranslationCallback(com.micklab.dcg.wrapper.android.view.translation.ViewTranslationCallback arg0) {
        real.setViewTranslationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setVisibility(int arg0) {
        real.setVisibility(arg0);
    }

    public void setWillNotCacheDrawing(boolean arg0) {
        real.setWillNotCacheDrawing(arg0);
    }

    public void setWillNotDraw(boolean arg0) {
        real.setWillNotDraw(arg0);
    }

    public void setWindowInsetsAnimationCallback(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback arg0) {
        real.setWindowInsetsAnimationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setX(float arg0) {
        real.setX(arg0);
    }

    public void setY(float arg0) {
        real.setY(arg0);
    }

    public void setZ(float arg0) {
        real.setZ(arg0);
    }

    public boolean showContextMenu() {
        return real.showContextMenu();
    }

    public boolean showContextMenu(float arg0, float arg1) {
        return real.showContextMenu(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.startActionMode(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.startActionMode(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void startAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        real.startAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public boolean startDrag(com.micklab.dcg.wrapper.android.content.ClipData arg0, com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder arg1, java.lang.Object arg2, int arg3) {
        return real.startDrag(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public boolean startDragAndDrop(com.micklab.dcg.wrapper.android.content.ClipData arg0, com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder arg1, java.lang.Object arg2, int arg3) {
        return real.startDragAndDrop(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public boolean startNestedScroll(int arg0) {
        return real.startNestedScroll(arg0);
    }

    public void stopNestedScroll() {
        real.stopNestedScroll();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void transformMatrixToGlobal(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.transformMatrixToGlobal(arg0 == null ? null : arg0.unwrap());
    }

    public void transformMatrixToLocal(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.transformMatrixToLocal(arg0 == null ? null : arg0.unwrap());
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.unscheduleDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        real.unscheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void updateDragShadow(com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder arg0) {
        real.updateDragShadow(arg0 == null ? null : arg0.unwrap());
    }

    public boolean willNotCacheDrawing() {
        return real.willNotCacheDrawing();
    }

    public boolean willNotDraw() {
        return real.willNotDraw();
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
        private final android.view.View.AccessibilityDelegate real;

        public AccessibilityDelegate(android.view.View.AccessibilityDelegate real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate wrap(android.view.View.AccessibilityDelegate real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.AccessibilityDelegate(real);
        }

        public android.view.View.AccessibilityDelegate unwrap() {
            return real;
        }

        public AccessibilityDelegate() {
            this(new android.view.View.AccessibilityDelegate());
        }

        public void addExtraDataToAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
            real.addExtraDataToAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
        }

        public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            return real.dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(com.micklab.dcg.wrapper.android.view.View arg0) {
            return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(real.getAccessibilityNodeProvider(arg0 == null ? null : arg0.unwrap()));
        }

        public void onInitializeAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            real.onInitializeAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg1) {
            real.onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            real.onPopulateAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public boolean onRequestSendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg2) {
            return real.onRequestSendAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public boolean performAccessibilityAction(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            return real.performAccessibilityAction(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void sendAccessibilityEvent(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
            real.sendAccessibilityEvent(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void sendAccessibilityEventUnchecked(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg1) {
            real.sendAccessibilityEventUnchecked(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class BaseSavedState {
        private final android.view.View.BaseSavedState real;

        public BaseSavedState(android.view.View.BaseSavedState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.BaseSavedState wrap(android.view.View.BaseSavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.BaseSavedState(real);
        }

        public android.view.View.BaseSavedState unwrap() {
            return real;
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
            this(new android.view.View.BaseSavedState(arg0 == null ? null : arg0.unwrap()));
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.view.View.BaseSavedState(arg0 == null ? null : arg0.unwrap()));
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcel arg0, java.lang.ClassLoader arg1) {
            this(new android.view.View.BaseSavedState(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class DragShadowBuilder {
        private final android.view.View.DragShadowBuilder real;

        public DragShadowBuilder(android.view.View.DragShadowBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder wrap(android.view.View.DragShadowBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.DragShadowBuilder(real);
        }

        public android.view.View.DragShadowBuilder unwrap() {
            return real;
        }

        public DragShadowBuilder() {
            this(new android.view.View.DragShadowBuilder());
        }

        public DragShadowBuilder(com.micklab.dcg.wrapper.android.view.View arg0) {
            this(new android.view.View.DragShadowBuilder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.View getView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView());
        }

        public void onDrawShadow(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
            real.onDrawShadow(arg0 == null ? null : arg0.unwrap());
        }

        public void onProvideShadowMetrics(com.micklab.dcg.wrapper.android.graphics.Point arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1) {
            real.onProvideShadowMetrics(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class MeasureSpec {
        private final android.view.View.MeasureSpec real;

        public MeasureSpec(android.view.View.MeasureSpec real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.MeasureSpec wrap(android.view.View.MeasureSpec real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.MeasureSpec(real);
        }

        public android.view.View.MeasureSpec unwrap() {
            return real;
        }

        public MeasureSpec() {
            this(new android.view.View.MeasureSpec());
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
        private final android.view.View.OnApplyWindowInsetsListener real;

        public OnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnApplyWindowInsetsListener wrap(android.view.View.OnApplyWindowInsetsListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnApplyWindowInsetsListener(real);
        }

        public android.view.View.OnApplyWindowInsetsListener unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsets onApplyWindowInsets(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.WindowInsets arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.onApplyWindowInsets(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

    }
    public static final class OnAttachStateChangeListener {
        private final android.view.View.OnAttachStateChangeListener real;

        public OnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener wrap(android.view.View.OnAttachStateChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnAttachStateChangeListener(real);
        }

        public android.view.View.OnAttachStateChangeListener unwrap() {
            return real;
        }

        public void onViewAttachedToWindow(com.micklab.dcg.wrapper.android.view.View arg0) {
            real.onViewAttachedToWindow(arg0 == null ? null : arg0.unwrap());
        }

        public void onViewDetachedFromWindow(com.micklab.dcg.wrapper.android.view.View arg0) {
            real.onViewDetachedFromWindow(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnCapturedPointerListener {
        private final android.view.View.OnCapturedPointerListener real;

        public OnCapturedPointerListener(android.view.View.OnCapturedPointerListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnCapturedPointerListener wrap(android.view.View.OnCapturedPointerListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnCapturedPointerListener(real);
        }

        public android.view.View.OnCapturedPointerListener unwrap() {
            return real;
        }

        public boolean onCapturedPointer(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return real.onCapturedPointer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnClickListener {
        private final android.view.View.OnClickListener real;

        public OnClickListener(android.view.View.OnClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnClickListener wrap(android.view.View.OnClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnClickListener(real);
        }

        public android.view.View.OnClickListener unwrap() {
            return real;
        }

        public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            real.onClick(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnContextClickListener {
        private final android.view.View.OnContextClickListener real;

        public OnContextClickListener(android.view.View.OnContextClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnContextClickListener wrap(android.view.View.OnContextClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnContextClickListener(real);
        }

        public android.view.View.OnContextClickListener unwrap() {
            return real;
        }

        public boolean onContextClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            return real.onContextClick(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnCreateContextMenuListener {
        private final android.view.View.OnCreateContextMenuListener real;

        public OnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnCreateContextMenuListener wrap(android.view.View.OnCreateContextMenuListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnCreateContextMenuListener(real);
        }

        public android.view.View.OnCreateContextMenuListener unwrap() {
            return real;
        }

        public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
            real.onCreateContextMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class OnDragListener {
        private final android.view.View.OnDragListener real;

        public OnDragListener(android.view.View.OnDragListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnDragListener wrap(android.view.View.OnDragListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnDragListener(real);
        }

        public android.view.View.OnDragListener unwrap() {
            return real;
        }

        public boolean onDrag(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.DragEvent arg1) {
            return real.onDrag(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnFocusChangeListener {
        private final android.view.View.OnFocusChangeListener real;

        public OnFocusChangeListener(android.view.View.OnFocusChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener wrap(android.view.View.OnFocusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnFocusChangeListener(real);
        }

        public android.view.View.OnFocusChangeListener unwrap() {
            return real;
        }

        public void onFocusChange(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
            real.onFocusChange(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class OnGenericMotionListener {
        private final android.view.View.OnGenericMotionListener real;

        public OnGenericMotionListener(android.view.View.OnGenericMotionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnGenericMotionListener wrap(android.view.View.OnGenericMotionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnGenericMotionListener(real);
        }

        public android.view.View.OnGenericMotionListener unwrap() {
            return real;
        }

        public boolean onGenericMotion(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return real.onGenericMotion(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnHoverListener {
        private final android.view.View.OnHoverListener real;

        public OnHoverListener(android.view.View.OnHoverListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnHoverListener wrap(android.view.View.OnHoverListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnHoverListener(real);
        }

        public android.view.View.OnHoverListener unwrap() {
            return real;
        }

        public boolean onHover(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return real.onHover(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnKeyListener {
        private final android.view.View.OnKeyListener real;

        public OnKeyListener(android.view.View.OnKeyListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnKeyListener wrap(android.view.View.OnKeyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnKeyListener(real);
        }

        public android.view.View.OnKeyListener unwrap() {
            return real;
        }

        public boolean onKey(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return real.onKey(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class OnLayoutChangeListener {
        private final android.view.View.OnLayoutChangeListener real;

        public OnLayoutChangeListener(android.view.View.OnLayoutChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener wrap(android.view.View.OnLayoutChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnLayoutChangeListener(real);
        }

        public android.view.View.OnLayoutChangeListener unwrap() {
            return real;
        }

        public void onLayoutChange(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
            real.onLayoutChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }

    }
    public static final class OnLongClickListener {
        private final android.view.View.OnLongClickListener real;

        public OnLongClickListener(android.view.View.OnLongClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnLongClickListener wrap(android.view.View.OnLongClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnLongClickListener(real);
        }

        public android.view.View.OnLongClickListener unwrap() {
            return real;
        }

        public boolean onLongClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            return real.onLongClick(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onLongClickUseDefaultHapticFeedback(com.micklab.dcg.wrapper.android.view.View arg0) {
            return real.onLongClickUseDefaultHapticFeedback(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnScrollChangeListener {
        private final android.view.View.OnScrollChangeListener real;

        public OnScrollChangeListener(android.view.View.OnScrollChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnScrollChangeListener wrap(android.view.View.OnScrollChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnScrollChangeListener(real);
        }

        public android.view.View.OnScrollChangeListener unwrap() {
            return real;
        }

        public void onScrollChange(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
            real.onScrollChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
        }

    }
    public static final class OnSystemUiVisibilityChangeListener {
        private final android.view.View.OnSystemUiVisibilityChangeListener real;

        public OnSystemUiVisibilityChangeListener(android.view.View.OnSystemUiVisibilityChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnSystemUiVisibilityChangeListener wrap(android.view.View.OnSystemUiVisibilityChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnSystemUiVisibilityChangeListener(real);
        }

        public android.view.View.OnSystemUiVisibilityChangeListener unwrap() {
            return real;
        }

        public void onSystemUiVisibilityChange(int arg0) {
            real.onSystemUiVisibilityChange(arg0);
        }

    }
    public static final class OnTouchListener {
        private final android.view.View.OnTouchListener real;

        public OnTouchListener(android.view.View.OnTouchListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnTouchListener wrap(android.view.View.OnTouchListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnTouchListener(real);
        }

        public android.view.View.OnTouchListener unwrap() {
            return real;
        }

        public boolean onTouch(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            return real.onTouch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnUnhandledKeyEventListener {
        private final android.view.View.OnUnhandledKeyEventListener real;

        public OnUnhandledKeyEventListener(android.view.View.OnUnhandledKeyEventListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener wrap(android.view.View.OnUnhandledKeyEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.View.OnUnhandledKeyEventListener(real);
        }

        public android.view.View.OnUnhandledKeyEventListener unwrap() {
            return real;
        }

        public boolean onUnhandledKeyEvent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return real.onUnhandledKeyEvent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
