// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Window {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Window(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Window wrap(android.view.Window real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window(real, (__DcgwBridgeToken) null);
    }

    public android.view.Window getReal() {
        return (android.view.Window) real;
    }

    public android.view.Window unwrap() {
        return getReal();
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.view.Window) real).addContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addFlags(int arg0) {
        ((android.view.Window) real).addFlags(arg0);
    }

    public void addOnFrameMetricsAvailableListener(com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.view.Window) real).addOnFrameMetricsAvailableListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void clearFlags(int arg0) {
        ((android.view.Window) real).clearFlags(arg0);
    }

    public void closeAllPanels() {
        ((android.view.Window) real).closeAllPanels();
    }

    public void closePanel(int arg0) {
        ((android.view.Window) real).closePanel(arg0);
    }

    public boolean getAllowEnterTransitionOverlap() {
        return ((android.view.Window) real).getAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return ((android.view.Window) real).getAllowReturnTransitionOverlap();
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams getAttributes() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams.wrap(((android.view.Window) real).getAttributes());
    }

    public com.micklab.dcg.wrapper.android.view.Window.Callback getCallback() {
        return com.micklab.dcg.wrapper.android.view.Window.Callback.wrap(((android.view.Window) real).getCallback());
    }

    public int getColorMode() {
        return ((android.view.Window) real).getColorMode();
    }

    public com.micklab.dcg.wrapper.android.view.Window getContainer() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(((android.view.Window) real).getContainer());
    }

    public com.micklab.dcg.wrapper.android.transition.Scene getContentScene() {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(((android.view.Window) real).getContentScene());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.view.Window) real).getContext());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.Window) real).getCurrentFocus());
    }

    public com.micklab.dcg.wrapper.android.view.View getDecorView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.Window) real).getDecorView());
    }

    public static int getDefaultFeatures(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.view.Window.getDefaultFeatures(arg0 == null ? null : arg0.getReal());
    }

    public float getDesiredHdrHeadroom() {
        return ((android.view.Window) real).getDesiredHdrHeadroom();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getExitTransition());
    }

    public boolean getFrameRateBoostOnTouchEnabled() {
        return ((android.view.Window) real).getFrameRateBoostOnTouchEnabled();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsetsController getInsetsController() {
        return com.micklab.dcg.wrapper.android.view.WindowInsetsController.wrap(((android.view.Window) real).getInsetsController());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.view.Window) real).getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController getMediaController() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.wrap(((android.view.Window) real).getMediaController());
    }

    public int getNavigationBarColor() {
        return ((android.view.Window) real).getNavigationBarColor();
    }

    public int getNavigationBarDividerColor() {
        return ((android.view.Window) real).getNavigationBarDividerColor();
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(((android.view.Window) real).getOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReenterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getReenterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getReturnTransition());
    }

    public com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl getRootSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.wrap(((android.view.Window) real).getRootSurfaceControl());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getSharedElementEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getSharedElementExitTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementReenterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getSharedElementReenterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.view.Window) real).getSharedElementReturnTransition());
    }

    public boolean getSharedElementsUseOverlay() {
        return ((android.view.Window) real).getSharedElementsUseOverlay();
    }

    public int getStatusBarColor() {
        return ((android.view.Window) real).getStatusBarColor();
    }

    public long getTransitionBackgroundFadeDuration() {
        return ((android.view.Window) real).getTransitionBackgroundFadeDuration();
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionManager getTransitionManager() {
        return com.micklab.dcg.wrapper.android.transition.TransitionManager.wrap(((android.view.Window) real).getTransitionManager());
    }

    public int getVolumeControlStream() {
        return ((android.view.Window) real).getVolumeControlStream();
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager getWindowManager() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.wrap(((android.view.Window) real).getWindowManager());
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray getWindowStyle() {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(((android.view.Window) real).getWindowStyle());
    }

    public boolean hasChildren() {
        return ((android.view.Window) real).hasChildren();
    }

    public boolean hasFeature(int arg0) {
        return ((android.view.Window) real).hasFeature(arg0);
    }

    public void injectInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        ((android.view.Window) real).injectInputEvent(arg0 == null ? null : arg0.getReal());
    }

    public void invalidatePanelMenu(int arg0) {
        ((android.view.Window) real).invalidatePanelMenu(arg0);
    }

    public boolean isActive() {
        return ((android.view.Window) real).isActive();
    }

    public boolean isFloating() {
        return ((android.view.Window) real).isFloating();
    }

    public boolean isFrameRatePowerSavingsBalanced() {
        return ((android.view.Window) real).isFrameRatePowerSavingsBalanced();
    }

    public boolean isNavigationBarContrastEnforced() {
        return ((android.view.Window) real).isNavigationBarContrastEnforced();
    }

    public boolean isShortcutKey(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.view.Window) real).isShortcutKey(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean isStatusBarContrastEnforced() {
        return ((android.view.Window) real).isStatusBarContrastEnforced();
    }

    public boolean isWideColorGamut() {
        return ((android.view.Window) real).isWideColorGamut();
    }

    public void makeActive() {
        ((android.view.Window) real).makeActive();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.view.Window) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void openPanel(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        ((android.view.Window) real).openPanel(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View peekDecorView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.Window) real).peekDecorView());
    }

    public boolean performContextMenuIdentifierAction(int arg0, int arg1) {
        return ((android.view.Window) real).performContextMenuIdentifierAction(arg0, arg1);
    }

    public boolean performPanelIdentifierAction(int arg0, int arg1, int arg2) {
        return ((android.view.Window) real).performPanelIdentifierAction(arg0, arg1, arg2);
    }

    public boolean performPanelShortcut(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2, int arg3) {
        return ((android.view.Window) real).performPanelShortcut(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void registerScrollCaptureCallback(com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg0) {
        ((android.view.Window) real).registerScrollCaptureCallback(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnFrameMetricsAvailableListener(com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener arg0) {
        ((android.view.Window) real).removeOnFrameMetricsAvailableListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean requestFeature(int arg0) {
        return ((android.view.Window) real).requestFeature(arg0);
    }

    public void restoreHierarchyState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.view.Window) real).restoreHierarchyState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle saveHierarchyState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.Window) real).saveHierarchyState());
    }

    public void setAllowEnterTransitionOverlap(boolean arg0) {
        ((android.view.Window) real).setAllowEnterTransitionOverlap(arg0);
    }

    public void setAllowReturnTransitionOverlap(boolean arg0) {
        ((android.view.Window) real).setAllowReturnTransitionOverlap(arg0);
    }

    public void setAttributes(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
        ((android.view.Window) real).setAttributes(arg0 == null ? null : arg0.getReal());
    }

    public void setBackgroundBlurRadius(int arg0) {
        ((android.view.Window) real).setBackgroundBlurRadius(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.Window) real).setBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setBackgroundDrawableResource(int arg0) {
        ((android.view.Window) real).setBackgroundDrawableResource(arg0);
    }

    public void setCallback(com.micklab.dcg.wrapper.android.view.Window.Callback arg0) {
        ((android.view.Window) real).setCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setChildDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        ((android.view.Window) real).setChildDrawable(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setChildInt(int arg0, int arg1) {
        ((android.view.Window) real).setChildInt(arg0, arg1);
    }

    public void setClipToOutline(boolean arg0) {
        ((android.view.Window) real).setClipToOutline(arg0);
    }

    public void setColorMode(int arg0) {
        ((android.view.Window) real).setColorMode(arg0);
    }

    public void setContainer(com.micklab.dcg.wrapper.android.view.Window arg0) {
        ((android.view.Window) real).setContainer(arg0 == null ? null : arg0.getReal());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.Window) real).setContentView(arg0 == null ? null : arg0.getReal());
    }

    public void setContentView(int arg0) {
        ((android.view.Window) real).setContentView(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.view.Window) real).setContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setDecorCaptionShade(int arg0) {
        ((android.view.Window) real).setDecorCaptionShade(arg0);
    }

    public void setDecorFitsSystemWindows(boolean arg0) {
        ((android.view.Window) real).setDecorFitsSystemWindows(arg0);
    }

    public void setDesiredHdrHeadroom(float arg0) {
        ((android.view.Window) real).setDesiredHdrHeadroom(arg0);
    }

    public void setDimAmount(float arg0) {
        ((android.view.Window) real).setDimAmount(arg0);
    }

    public void setElevation(float arg0) {
        ((android.view.Window) real).setElevation(arg0);
    }

    public void setEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setEnterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setExitTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setFeatureDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        ((android.view.Window) real).setFeatureDrawable(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setFeatureDrawableAlpha(int arg0, int arg1) {
        ((android.view.Window) real).setFeatureDrawableAlpha(arg0, arg1);
    }

    public void setFeatureDrawableResource(int arg0, int arg1) {
        ((android.view.Window) real).setFeatureDrawableResource(arg0, arg1);
    }

    public void setFeatureDrawableUri(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.view.Window) real).setFeatureDrawableUri(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setFeatureInt(int arg0, int arg1) {
        ((android.view.Window) real).setFeatureInt(arg0, arg1);
    }

    public void setFlags(int arg0, int arg1) {
        ((android.view.Window) real).setFlags(arg0, arg1);
    }

    public void setFormat(int arg0) {
        ((android.view.Window) real).setFormat(arg0);
    }

    public void setFrameRateBoostOnTouchEnabled(boolean arg0) {
        ((android.view.Window) real).setFrameRateBoostOnTouchEnabled(arg0);
    }

    public void setFrameRatePowerSavingsBalanced(boolean arg0) {
        ((android.view.Window) real).setFrameRatePowerSavingsBalanced(arg0);
    }

    public void setGravity(int arg0) {
        ((android.view.Window) real).setGravity(arg0);
    }

    public void setHideOverlayWindows(boolean arg0) {
        ((android.view.Window) real).setHideOverlayWindows(arg0);
    }

    public void setIcon(int arg0) {
        ((android.view.Window) real).setIcon(arg0);
    }

    public void setLayout(int arg0, int arg1) {
        ((android.view.Window) real).setLayout(arg0, arg1);
    }

    public void setLocalFocus(boolean arg0, boolean arg1) {
        ((android.view.Window) real).setLocalFocus(arg0, arg1);
    }

    public void setLogo(int arg0) {
        ((android.view.Window) real).setLogo(arg0);
    }

    public void setMediaController(com.micklab.dcg.wrapper.android.media.session.MediaController arg0) {
        ((android.view.Window) real).setMediaController(arg0 == null ? null : arg0.getReal());
    }

    public void setNavigationBarColor(int arg0) {
        ((android.view.Window) real).setNavigationBarColor(arg0);
    }

    public void setNavigationBarContrastEnforced(boolean arg0) {
        ((android.view.Window) real).setNavigationBarContrastEnforced(arg0);
    }

    public void setNavigationBarDividerColor(int arg0) {
        ((android.view.Window) real).setNavigationBarDividerColor(arg0);
    }

    public void setPreferMinimalPostProcessing(boolean arg0) {
        ((android.view.Window) real).setPreferMinimalPostProcessing(arg0);
    }

    public void setReenterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setReenterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setResizingCaptionDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.Window) real).setResizingCaptionDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setRestrictedCaptionAreaListener(com.micklab.dcg.wrapper.android.view.Window.OnRestrictedCaptionAreaChangedListener arg0) {
        ((android.view.Window) real).setRestrictedCaptionAreaListener(arg0 == null ? null : arg0.getReal());
    }

    public void setReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setReturnTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedElementEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setSharedElementEnterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedElementExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setSharedElementExitTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedElementReenterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setSharedElementReenterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedElementReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.view.Window) real).setSharedElementReturnTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedElementsUseOverlay(boolean arg0) {
        ((android.view.Window) real).setSharedElementsUseOverlay(arg0);
    }

    public void setSoftInputMode(int arg0) {
        ((android.view.Window) real).setSoftInputMode(arg0);
    }

    public void setStatusBarColor(int arg0) {
        ((android.view.Window) real).setStatusBarColor(arg0);
    }

    public void setStatusBarContrastEnforced(boolean arg0) {
        ((android.view.Window) real).setStatusBarContrastEnforced(arg0);
    }

    public void setSustainedPerformanceMode(boolean arg0) {
        ((android.view.Window) real).setSustainedPerformanceMode(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.view.Window) real).setTitle(arg0);
    }

    public void setTitleColor(int arg0) {
        ((android.view.Window) real).setTitleColor(arg0);
    }

    public void setTransitionBackgroundFadeDuration(long arg0) {
        ((android.view.Window) real).setTransitionBackgroundFadeDuration(arg0);
    }

    public void setTransitionManager(com.micklab.dcg.wrapper.android.transition.TransitionManager arg0) {
        ((android.view.Window) real).setTransitionManager(arg0 == null ? null : arg0.getReal());
    }

    public void setType(int arg0) {
        ((android.view.Window) real).setType(arg0);
    }

    public void setUiOptions(int arg0) {
        ((android.view.Window) real).setUiOptions(arg0);
    }

    public void setUiOptions(int arg0, int arg1) {
        ((android.view.Window) real).setUiOptions(arg0, arg1);
    }

    public void setVolumeControlStream(int arg0) {
        ((android.view.Window) real).setVolumeControlStream(arg0);
    }

    public void setWindowAnimations(int arg0) {
        ((android.view.Window) real).setWindowAnimations(arg0);
    }

    public void setWindowManager(com.micklab.dcg.wrapper.android.view.WindowManager arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1, java.lang.String arg2) {
        ((android.view.Window) real).setWindowManager(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void setWindowManager(com.micklab.dcg.wrapper.android.view.WindowManager arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1, java.lang.String arg2, boolean arg3) {
        ((android.view.Window) real).setWindowManager(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public boolean superDispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.Window) real).superDispatchGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean superDispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.Window) real).superDispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean superDispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.view.Window) real).superDispatchKeyShortcutEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean superDispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.Window) real).superDispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean superDispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.Window) real).superDispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void takeInputQueue(com.micklab.dcg.wrapper.android.view.InputQueue.Callback arg0) {
        ((android.view.Window) real).takeInputQueue(arg0 == null ? null : arg0.getReal());
    }

    public void takeKeyEvents(boolean arg0) {
        ((android.view.Window) real).takeKeyEvents(arg0);
    }

    public void takeSurface(com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback2 arg0) {
        ((android.view.Window) real).takeSurface(arg0 == null ? null : arg0.getReal());
    }

    public void togglePanel(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        ((android.view.Window) real).togglePanel(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterScrollCaptureCallback(com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg0) {
        ((android.view.Window) real).unregisterScrollCaptureCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int DECOR_CAPTION_SHADE_AUTO = android.view.Window.DECOR_CAPTION_SHADE_AUTO;
    public static final int DECOR_CAPTION_SHADE_DARK = android.view.Window.DECOR_CAPTION_SHADE_DARK;
    public static final int DECOR_CAPTION_SHADE_LIGHT = android.view.Window.DECOR_CAPTION_SHADE_LIGHT;
    public static final int FEATURE_ACTION_BAR = android.view.Window.FEATURE_ACTION_BAR;
    public static final int FEATURE_ACTION_BAR_OVERLAY = android.view.Window.FEATURE_ACTION_BAR_OVERLAY;
    public static final int FEATURE_ACTION_MODE_OVERLAY = android.view.Window.FEATURE_ACTION_MODE_OVERLAY;
    public static final int FEATURE_ACTIVITY_TRANSITIONS = android.view.Window.FEATURE_ACTIVITY_TRANSITIONS;
    public static final int FEATURE_CONTENT_TRANSITIONS = android.view.Window.FEATURE_CONTENT_TRANSITIONS;
    public static final int FEATURE_CONTEXT_MENU = android.view.Window.FEATURE_CONTEXT_MENU;
    public static final int FEATURE_CUSTOM_TITLE = android.view.Window.FEATURE_CUSTOM_TITLE;
    public static final int FEATURE_INDETERMINATE_PROGRESS = android.view.Window.FEATURE_INDETERMINATE_PROGRESS;
    public static final int FEATURE_LEFT_ICON = android.view.Window.FEATURE_LEFT_ICON;
    public static final int FEATURE_NO_TITLE = android.view.Window.FEATURE_NO_TITLE;
    public static final int FEATURE_OPTIONS_PANEL = android.view.Window.FEATURE_OPTIONS_PANEL;
    public static final int FEATURE_PROGRESS = android.view.Window.FEATURE_PROGRESS;
    public static final int FEATURE_RIGHT_ICON = android.view.Window.FEATURE_RIGHT_ICON;
    public static final int FEATURE_SWIPE_TO_DISMISS = android.view.Window.FEATURE_SWIPE_TO_DISMISS;
    public static final int ID_ANDROID_CONTENT = android.view.Window.ID_ANDROID_CONTENT;
    public static final java.lang.String NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME = android.view.Window.NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME;
    public static final int PROGRESS_END = android.view.Window.PROGRESS_END;
    public static final int PROGRESS_INDETERMINATE_OFF = android.view.Window.PROGRESS_INDETERMINATE_OFF;
    public static final int PROGRESS_INDETERMINATE_ON = android.view.Window.PROGRESS_INDETERMINATE_ON;
    public static final int PROGRESS_SECONDARY_END = android.view.Window.PROGRESS_SECONDARY_END;
    public static final int PROGRESS_SECONDARY_START = android.view.Window.PROGRESS_SECONDARY_START;
    public static final int PROGRESS_START = android.view.Window.PROGRESS_START;
    public static final int PROGRESS_VISIBILITY_OFF = android.view.Window.PROGRESS_VISIBILITY_OFF;
    public static final int PROGRESS_VISIBILITY_ON = android.view.Window.PROGRESS_VISIBILITY_ON;
    public static final java.lang.String STATUS_BAR_BACKGROUND_TRANSITION_NAME = android.view.Window.STATUS_BAR_BACKGROUND_TRANSITION_NAME;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Window.Callback wrap(android.view.Window.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.view.Window.Callback getReal() {
            return (android.view.Window.Callback) real;
        }

        public android.view.Window.Callback unwrap() {
            return getReal();
        }

        public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.Window.Callback) real).dispatchGenericMotionEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            return ((android.view.Window.Callback) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            return ((android.view.Window.Callback) real).dispatchKeyShortcutEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
            return ((android.view.Window.Callback) real).dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.Window.Callback) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.Window.Callback) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
        }

        public void onActionModeFinished(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
            ((android.view.Window.Callback) real).onActionModeFinished(arg0 == null ? null : arg0.getReal());
        }

        public void onActionModeStarted(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
            ((android.view.Window.Callback) real).onActionModeStarted(arg0 == null ? null : arg0.getReal());
        }

        public void onAttachedToWindow() {
            ((android.view.Window.Callback) real).onAttachedToWindow();
        }

        public void onContentChanged() {
            ((android.view.Window.Callback) real).onContentChanged();
        }

        public boolean onCreatePanelMenu(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return ((android.view.Window.Callback) real).onCreatePanelMenu(arg0, arg1 == null ? null : arg1.getReal());
        }

        public com.micklab.dcg.wrapper.android.view.View onCreatePanelView(int arg0) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.Window.Callback) real).onCreatePanelView(arg0));
        }

        public void onDetachedFromWindow() {
            ((android.view.Window.Callback) real).onDetachedFromWindow();
        }

        public boolean onMenuItemSelected(int arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
            return ((android.view.Window.Callback) real).onMenuItemSelected(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onMenuOpened(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return ((android.view.Window.Callback) real).onMenuOpened(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onPanelClosed(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            ((android.view.Window.Callback) real).onPanelClosed(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onPointerCaptureChanged(boolean arg0) {
            ((android.view.Window.Callback) real).onPointerCaptureChanged(arg0);
        }

        public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
            return ((android.view.Window.Callback) real).onPreparePanel(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public boolean onSearchRequested() {
            return ((android.view.Window.Callback) real).onSearchRequested();
        }

        public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
            return ((android.view.Window.Callback) real).onSearchRequested(arg0 == null ? null : arg0.getReal());
        }

        public void onWindowAttributesChanged(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
            ((android.view.Window.Callback) real).onWindowAttributesChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onWindowFocusChanged(boolean arg0) {
            ((android.view.Window.Callback) real).onWindowFocusChanged(arg0);
        }

        public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
            return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.Window.Callback) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.view.Window.Callback) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal(), arg1));
        }

    }
    public static final class OnFrameMetricsAvailableListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnFrameMetricsAvailableListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener wrap(android.view.Window.OnFrameMetricsAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.Window.OnFrameMetricsAvailableListener getReal() {
            return (android.view.Window.OnFrameMetricsAvailableListener) real;
        }

        public android.view.Window.OnFrameMetricsAvailableListener unwrap() {
            return getReal();
        }

        public void onFrameMetricsAvailable(com.micklab.dcg.wrapper.android.view.Window arg0, com.micklab.dcg.wrapper.android.view.FrameMetrics arg1, int arg2) {
            ((android.view.Window.OnFrameMetricsAvailableListener) real).onFrameMetricsAvailable(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

    }
    public static final class OnRestrictedCaptionAreaChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnRestrictedCaptionAreaChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Window.OnRestrictedCaptionAreaChangedListener wrap(android.view.Window.OnRestrictedCaptionAreaChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window.OnRestrictedCaptionAreaChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.Window.OnRestrictedCaptionAreaChangedListener getReal() {
            return (android.view.Window.OnRestrictedCaptionAreaChangedListener) real;
        }

        public android.view.Window.OnRestrictedCaptionAreaChangedListener unwrap() {
            return getReal();
        }

        public void onRestrictedCaptionAreaChanged(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            ((android.view.Window.OnRestrictedCaptionAreaChangedListener) real).onRestrictedCaptionAreaChanged(arg0 == null ? null : arg0.getReal());
        }

    }
}
