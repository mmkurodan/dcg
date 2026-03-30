// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.dreams;

public final class DreamService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DreamService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.dreams.DreamService wrap(android.service.dreams.DreamService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.dreams.DreamService(real, (__DcgwBridgeToken) null);
    }

    public android.service.dreams.DreamService getReal() {
        return (android.service.dreams.DreamService) real;
    }

    public android.service.dreams.DreamService unwrap() {
        return getReal();
    }

    public DreamService() {
        this(new android.service.dreams.DreamService(), (__DcgwBridgeToken) null);
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.service.dreams.DreamService) real).addContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.service.dreams.DreamService) real).dispatchGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.service.dreams.DreamService) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.service.dreams.DreamService) real).dispatchKeyShortcutEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        return ((android.service.dreams.DreamService) real).dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.service.dreams.DreamService) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.service.dreams.DreamService) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void finish() {
        ((android.service.dreams.DreamService) real).finish();
    }

    public com.micklab.dcg.wrapper.android.view.Window getWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(((android.service.dreams.DreamService) real).getWindow());
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager getWindowManager() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.wrap(((android.service.dreams.DreamService) real).getWindowManager());
    }

    public boolean isFullscreen() {
        return ((android.service.dreams.DreamService) real).isFullscreen();
    }

    public boolean isInteractive() {
        return ((android.service.dreams.DreamService) real).isInteractive();
    }

    public boolean isScreenBright() {
        return ((android.service.dreams.DreamService) real).isScreenBright();
    }

    public void onActionModeFinished(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        ((android.service.dreams.DreamService) real).onActionModeFinished(arg0 == null ? null : arg0.getReal());
    }

    public void onActionModeStarted(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        ((android.service.dreams.DreamService) real).onActionModeStarted(arg0 == null ? null : arg0.getReal());
    }

    public void onAttachedToWindow() {
        ((android.service.dreams.DreamService) real).onAttachedToWindow();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.dreams.DreamService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onContentChanged() {
        ((android.service.dreams.DreamService) real).onContentChanged();
    }

    public void onCreate() {
        ((android.service.dreams.DreamService) real).onCreate();
    }

    public boolean onCreatePanelMenu(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return ((android.service.dreams.DreamService) real).onCreatePanelMenu(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreatePanelView(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.service.dreams.DreamService) real).onCreatePanelView(arg0));
    }

    public void onDestroy() {
        ((android.service.dreams.DreamService) real).onDestroy();
    }

    public void onDetachedFromWindow() {
        ((android.service.dreams.DreamService) real).onDetachedFromWindow();
    }

    public void onDreamingStarted() {
        ((android.service.dreams.DreamService) real).onDreamingStarted();
    }

    public void onDreamingStopped() {
        ((android.service.dreams.DreamService) real).onDreamingStopped();
    }

    public boolean onMenuItemSelected(int arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
        return ((android.service.dreams.DreamService) real).onMenuItemSelected(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onMenuOpened(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return ((android.service.dreams.DreamService) real).onMenuOpened(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onPanelClosed(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        ((android.service.dreams.DreamService) real).onPanelClosed(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
        return ((android.service.dreams.DreamService) real).onPreparePanel(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onSearchRequested() {
        return ((android.service.dreams.DreamService) real).onSearchRequested();
    }

    public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
        return ((android.service.dreams.DreamService) real).onSearchRequested(arg0 == null ? null : arg0.getReal());
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.service.dreams.DreamService) real).onUnbind(arg0 == null ? null : arg0.getReal());
    }

    public void onWakeUp() {
        ((android.service.dreams.DreamService) real).onWakeUp();
    }

    public void onWindowAttributesChanged(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
        ((android.service.dreams.DreamService) real).onWindowAttributesChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.service.dreams.DreamService) real).onWindowFocusChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.service.dreams.DreamService) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.service.dreams.DreamService) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void setContentView(int arg0) {
        ((android.service.dreams.DreamService) real).setContentView(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.service.dreams.DreamService) real).setContentView(arg0 == null ? null : arg0.getReal());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.service.dreams.DreamService) real).setContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setFullscreen(boolean arg0) {
        ((android.service.dreams.DreamService) real).setFullscreen(arg0);
    }

    public void setInteractive(boolean arg0) {
        ((android.service.dreams.DreamService) real).setInteractive(arg0);
    }

    public void setScreenBright(boolean arg0) {
        ((android.service.dreams.DreamService) real).setScreenBright(arg0);
    }

    public void wakeUp() {
        ((android.service.dreams.DreamService) real).wakeUp();
    }

    public static final java.lang.String DREAM_META_DATA = android.service.dreams.DreamService.DREAM_META_DATA;
    public static final java.lang.String SERVICE_INTERFACE = android.service.dreams.DreamService.SERVICE_INTERFACE;

}
