// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Window {
    private final android.view.Window real;

    public Window(android.view.Window real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Window wrap(android.view.Window real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window(real);
    }

    public android.view.Window unwrap() {
        return real;
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addContentView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addFlags(int arg0) {
        real.addFlags(arg0);
    }

    public void addOnFrameMetricsAvailableListener(com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addOnFrameMetricsAvailableListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void clearFlags(int arg0) {
        real.clearFlags(arg0);
    }

    public void closeAllPanels() {
        real.closeAllPanels();
    }

    public void closePanel(int arg0) {
        real.closePanel(arg0);
    }

    public boolean getAllowEnterTransitionOverlap() {
        return real.getAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return real.getAllowReturnTransitionOverlap();
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams getAttributes() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams.wrap(real.getAttributes());
    }

    public com.micklab.dcg.wrapper.android.view.Window.Callback getCallback() {
        return com.micklab.dcg.wrapper.android.view.Window.Callback.wrap(real.getCallback());
    }

    public int getColorMode() {
        return real.getColorMode();
    }

    public com.micklab.dcg.wrapper.android.view.Window getContainer() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(real.getContainer());
    }

    public com.micklab.dcg.wrapper.android.transition.Scene getContentScene() {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(real.getContentScene());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCurrentFocus());
    }

    public com.micklab.dcg.wrapper.android.view.View getDecorView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getDecorView());
    }

    public static int getDefaultFeatures(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.view.Window.getDefaultFeatures(arg0 == null ? null : arg0.unwrap());
    }

    public float getDesiredHdrHeadroom() {
        return real.getDesiredHdrHeadroom();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getExitTransition());
    }

    public boolean getFrameRateBoostOnTouchEnabled() {
        return real.getFrameRateBoostOnTouchEnabled();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsetsController getInsetsController() {
        return com.micklab.dcg.wrapper.android.view.WindowInsetsController.wrap(real.getInsetsController());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController getMediaController() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.wrap(real.getMediaController());
    }

    public int getNavigationBarColor() {
        return real.getNavigationBarColor();
    }

    public int getNavigationBarDividerColor() {
        return real.getNavigationBarDividerColor();
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(real.getOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReenterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getReenterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getReturnTransition());
    }

    public com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl getRootSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.wrap(real.getRootSurfaceControl());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getSharedElementEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getSharedElementExitTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementReenterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getSharedElementReenterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getSharedElementReturnTransition());
    }

    public boolean getSharedElementsUseOverlay() {
        return real.getSharedElementsUseOverlay();
    }

    public int getStatusBarColor() {
        return real.getStatusBarColor();
    }

    public long getTransitionBackgroundFadeDuration() {
        return real.getTransitionBackgroundFadeDuration();
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionManager getTransitionManager() {
        return com.micklab.dcg.wrapper.android.transition.TransitionManager.wrap(real.getTransitionManager());
    }

    public int getVolumeControlStream() {
        return real.getVolumeControlStream();
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager getWindowManager() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.wrap(real.getWindowManager());
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray getWindowStyle() {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(real.getWindowStyle());
    }

    public boolean hasChildren() {
        return real.hasChildren();
    }

    public boolean hasFeature(int arg0) {
        return real.hasFeature(arg0);
    }

    public void injectInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        real.injectInputEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void invalidatePanelMenu(int arg0) {
        real.invalidatePanelMenu(arg0);
    }

    public boolean isActive() {
        return real.isActive();
    }

    public boolean isFloating() {
        return real.isFloating();
    }

    public boolean isFrameRatePowerSavingsBalanced() {
        return real.isFrameRatePowerSavingsBalanced();
    }

    public boolean isNavigationBarContrastEnforced() {
        return real.isNavigationBarContrastEnforced();
    }

    public boolean isShortcutKey(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.isShortcutKey(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean isStatusBarContrastEnforced() {
        return real.isStatusBarContrastEnforced();
    }

    public boolean isWideColorGamut() {
        return real.isWideColorGamut();
    }

    public void makeActive() {
        real.makeActive();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void openPanel(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        real.openPanel(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.View peekDecorView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.peekDecorView());
    }

    public boolean performContextMenuIdentifierAction(int arg0, int arg1) {
        return real.performContextMenuIdentifierAction(arg0, arg1);
    }

    public boolean performPanelIdentifierAction(int arg0, int arg1, int arg2) {
        return real.performPanelIdentifierAction(arg0, arg1, arg2);
    }

    public boolean performPanelShortcut(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2, int arg3) {
        return real.performPanelShortcut(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void registerScrollCaptureCallback(com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg0) {
        real.registerScrollCaptureCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnFrameMetricsAvailableListener(com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener arg0) {
        real.removeOnFrameMetricsAvailableListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean requestFeature(int arg0) {
        return real.requestFeature(arg0);
    }

    public void restoreHierarchyState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.restoreHierarchyState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle saveHierarchyState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.saveHierarchyState());
    }

    public void setAllowEnterTransitionOverlap(boolean arg0) {
        real.setAllowEnterTransitionOverlap(arg0);
    }

    public void setAllowReturnTransitionOverlap(boolean arg0) {
        real.setAllowReturnTransitionOverlap(arg0);
    }

    public void setAttributes(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
        real.setAttributes(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackgroundBlurRadius(int arg0) {
        real.setBackgroundBlurRadius(arg0);
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackgroundDrawableResource(int arg0) {
        real.setBackgroundDrawableResource(arg0);
    }

    public void setCallback(com.micklab.dcg.wrapper.android.view.Window.Callback arg0) {
        real.setCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setChildDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        real.setChildDrawable(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setChildInt(int arg0, int arg1) {
        real.setChildInt(arg0, arg1);
    }

    public void setClipToOutline(boolean arg0) {
        real.setClipToOutline(arg0);
    }

    public void setColorMode(int arg0) {
        real.setColorMode(arg0);
    }

    public void setContainer(com.micklab.dcg.wrapper.android.view.Window arg0) {
        real.setContainer(arg0 == null ? null : arg0.unwrap());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setContentView(arg0 == null ? null : arg0.unwrap());
    }

    public void setContentView(int arg0) {
        real.setContentView(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.setContentView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setDecorCaptionShade(int arg0) {
        real.setDecorCaptionShade(arg0);
    }

    public void setDecorFitsSystemWindows(boolean arg0) {
        real.setDecorFitsSystemWindows(arg0);
    }

    public void setDesiredHdrHeadroom(float arg0) {
        real.setDesiredHdrHeadroom(arg0);
    }

    public void setDimAmount(float arg0) {
        real.setDimAmount(arg0);
    }

    public void setElevation(float arg0) {
        real.setElevation(arg0);
    }

    public void setEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setEnterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setExitTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setFeatureDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        real.setFeatureDrawable(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setFeatureDrawableAlpha(int arg0, int arg1) {
        real.setFeatureDrawableAlpha(arg0, arg1);
    }

    public void setFeatureDrawableResource(int arg0, int arg1) {
        real.setFeatureDrawableResource(arg0, arg1);
    }

    public void setFeatureDrawableUri(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.setFeatureDrawableUri(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setFeatureInt(int arg0, int arg1) {
        real.setFeatureInt(arg0, arg1);
    }

    public void setFlags(int arg0, int arg1) {
        real.setFlags(arg0, arg1);
    }

    public void setFormat(int arg0) {
        real.setFormat(arg0);
    }

    public void setFrameRateBoostOnTouchEnabled(boolean arg0) {
        real.setFrameRateBoostOnTouchEnabled(arg0);
    }

    public void setFrameRatePowerSavingsBalanced(boolean arg0) {
        real.setFrameRatePowerSavingsBalanced(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setHideOverlayWindows(boolean arg0) {
        real.setHideOverlayWindows(arg0);
    }

    public void setIcon(int arg0) {
        real.setIcon(arg0);
    }

    public void setLayout(int arg0, int arg1) {
        real.setLayout(arg0, arg1);
    }

    public void setLocalFocus(boolean arg0, boolean arg1) {
        real.setLocalFocus(arg0, arg1);
    }

    public void setLogo(int arg0) {
        real.setLogo(arg0);
    }

    public void setMediaController(com.micklab.dcg.wrapper.android.media.session.MediaController arg0) {
        real.setMediaController(arg0 == null ? null : arg0.unwrap());
    }

    public void setNavigationBarColor(int arg0) {
        real.setNavigationBarColor(arg0);
    }

    public void setNavigationBarContrastEnforced(boolean arg0) {
        real.setNavigationBarContrastEnforced(arg0);
    }

    public void setNavigationBarDividerColor(int arg0) {
        real.setNavigationBarDividerColor(arg0);
    }

    public void setPreferMinimalPostProcessing(boolean arg0) {
        real.setPreferMinimalPostProcessing(arg0);
    }

    public void setReenterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setReenterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setResizingCaptionDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setResizingCaptionDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setRestrictedCaptionAreaListener(com.micklab.dcg.wrapper.android.view.Window.OnRestrictedCaptionAreaChangedListener arg0) {
        real.setRestrictedCaptionAreaListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setReturnTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedElementEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setSharedElementEnterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedElementExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setSharedElementExitTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedElementReenterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setSharedElementReenterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedElementReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setSharedElementReturnTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedElementsUseOverlay(boolean arg0) {
        real.setSharedElementsUseOverlay(arg0);
    }

    public void setSoftInputMode(int arg0) {
        real.setSoftInputMode(arg0);
    }

    public void setStatusBarColor(int arg0) {
        real.setStatusBarColor(arg0);
    }

    public void setStatusBarContrastEnforced(boolean arg0) {
        real.setStatusBarContrastEnforced(arg0);
    }

    public void setSustainedPerformanceMode(boolean arg0) {
        real.setSustainedPerformanceMode(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setTitleColor(int arg0) {
        real.setTitleColor(arg0);
    }

    public void setTransitionBackgroundFadeDuration(long arg0) {
        real.setTransitionBackgroundFadeDuration(arg0);
    }

    public void setTransitionManager(com.micklab.dcg.wrapper.android.transition.TransitionManager arg0) {
        real.setTransitionManager(arg0 == null ? null : arg0.unwrap());
    }

    public void setType(int arg0) {
        real.setType(arg0);
    }

    public void setUiOptions(int arg0) {
        real.setUiOptions(arg0);
    }

    public void setUiOptions(int arg0, int arg1) {
        real.setUiOptions(arg0, arg1);
    }

    public void setVolumeControlStream(int arg0) {
        real.setVolumeControlStream(arg0);
    }

    public void setWindowAnimations(int arg0) {
        real.setWindowAnimations(arg0);
    }

    public void setWindowManager(com.micklab.dcg.wrapper.android.view.WindowManager arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1, java.lang.String arg2) {
        real.setWindowManager(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void setWindowManager(com.micklab.dcg.wrapper.android.view.WindowManager arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1, java.lang.String arg2, boolean arg3) {
        real.setWindowManager(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public boolean superDispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.superDispatchGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean superDispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.superDispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean superDispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.superDispatchKeyShortcutEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean superDispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.superDispatchTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean superDispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.superDispatchTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void takeInputQueue(com.micklab.dcg.wrapper.android.view.InputQueue.Callback arg0) {
        real.takeInputQueue(arg0 == null ? null : arg0.unwrap());
    }

    public void takeKeyEvents(boolean arg0) {
        real.takeKeyEvents(arg0);
    }

    public void takeSurface(com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback2 arg0) {
        real.takeSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void togglePanel(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        real.togglePanel(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterScrollCaptureCallback(com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg0) {
        real.unregisterScrollCaptureCallback(arg0 == null ? null : arg0.unwrap());
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
        private final android.view.Window.Callback real;

        public Callback(android.view.Window.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Window.Callback wrap(android.view.Window.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window.Callback(real);
        }

        public android.view.Window.Callback unwrap() {
            return real;
        }

        public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.dispatchGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            return real.dispatchKeyShortcutEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
            return real.dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.dispatchTouchEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.dispatchTrackballEvent(arg0 == null ? null : arg0.unwrap());
        }

        public void onActionModeFinished(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
            real.onActionModeFinished(arg0 == null ? null : arg0.unwrap());
        }

        public void onActionModeStarted(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
            real.onActionModeStarted(arg0 == null ? null : arg0.unwrap());
        }

        public void onAttachedToWindow() {
            real.onAttachedToWindow();
        }

        public void onContentChanged() {
            real.onContentChanged();
        }

        public boolean onCreatePanelMenu(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return real.onCreatePanelMenu(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public com.micklab.dcg.wrapper.android.view.View onCreatePanelView(int arg0) {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreatePanelView(arg0));
        }

        public void onDetachedFromWindow() {
            real.onDetachedFromWindow();
        }

        public boolean onMenuItemSelected(int arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
            return real.onMenuItemSelected(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public boolean onMenuOpened(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            return real.onMenuOpened(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onPanelClosed(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
            real.onPanelClosed(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onPointerCaptureChanged(boolean arg0) {
            real.onPointerCaptureChanged(arg0);
        }

        public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
            return real.onPreparePanel(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public boolean onSearchRequested() {
            return real.onSearchRequested();
        }

        public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
            return real.onSearchRequested(arg0 == null ? null : arg0.unwrap());
        }

        public void onWindowAttributesChanged(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
            real.onWindowAttributesChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void onWindowFocusChanged(boolean arg0) {
            real.onWindowFocusChanged(arg0);
        }

        public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
            return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.onWindowStartingActionMode(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.onWindowStartingActionMode(arg0 == null ? null : arg0.unwrap(), arg1));
        }

    }
    public static final class OnFrameMetricsAvailableListener {
        private final android.view.Window.OnFrameMetricsAvailableListener real;

        public OnFrameMetricsAvailableListener(android.view.Window.OnFrameMetricsAvailableListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener wrap(android.view.Window.OnFrameMetricsAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window.OnFrameMetricsAvailableListener(real);
        }

        public android.view.Window.OnFrameMetricsAvailableListener unwrap() {
            return real;
        }

        public void onFrameMetricsAvailable(com.micklab.dcg.wrapper.android.view.Window arg0, com.micklab.dcg.wrapper.android.view.FrameMetrics arg1, int arg2) {
            real.onFrameMetricsAvailable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

    }
    public static final class OnRestrictedCaptionAreaChangedListener {
        private final android.view.Window.OnRestrictedCaptionAreaChangedListener real;

        public OnRestrictedCaptionAreaChangedListener(android.view.Window.OnRestrictedCaptionAreaChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Window.OnRestrictedCaptionAreaChangedListener wrap(android.view.Window.OnRestrictedCaptionAreaChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Window.OnRestrictedCaptionAreaChangedListener(real);
        }

        public android.view.Window.OnRestrictedCaptionAreaChangedListener unwrap() {
            return real;
        }

        public void onRestrictedCaptionAreaChanged(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            real.onRestrictedCaptionAreaChanged(arg0 == null ? null : arg0.unwrap());
        }

    }
}
