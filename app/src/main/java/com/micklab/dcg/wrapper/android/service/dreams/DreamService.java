// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.dreams;

public final class DreamService {
    private final android.service.dreams.DreamService real;

    public DreamService(android.service.dreams.DreamService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.dreams.DreamService wrap(android.service.dreams.DreamService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.dreams.DreamService(real);
    }

    public android.service.dreams.DreamService unwrap() {
        return real;
    }

    public DreamService() {
        this(new android.service.dreams.DreamService());
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addContentView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
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

    public void finish() {
        real.finish();
    }

    public com.micklab.dcg.wrapper.android.view.Window getWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(real.getWindow());
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager getWindowManager() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.wrap(real.getWindowManager());
    }

    public boolean isFullscreen() {
        return real.isFullscreen();
    }

    public boolean isInteractive() {
        return real.isInteractive();
    }

    public boolean isScreenBright() {
        return real.isScreenBright();
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

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onContentChanged() {
        real.onContentChanged();
    }

    public void onCreate() {
        real.onCreate();
    }

    public boolean onCreatePanelMenu(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return real.onCreatePanelMenu(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreatePanelView(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreatePanelView(arg0));
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onDetachedFromWindow() {
        real.onDetachedFromWindow();
    }

    public void onDreamingStarted() {
        real.onDreamingStarted();
    }

    public void onDreamingStopped() {
        real.onDreamingStopped();
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

    public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
        return real.onPreparePanel(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean onSearchRequested() {
        return real.onSearchRequested();
    }

    public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
        return real.onSearchRequested(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public void onWakeUp() {
        real.onWakeUp();
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

    public void setContentView(int arg0) {
        real.setContentView(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setContentView(arg0 == null ? null : arg0.unwrap());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.setContentView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setFullscreen(boolean arg0) {
        real.setFullscreen(arg0);
    }

    public void setInteractive(boolean arg0) {
        real.setInteractive(arg0);
    }

    public void setScreenBright(boolean arg0) {
        real.setScreenBright(arg0);
    }

    public void wakeUp() {
        real.wakeUp();
    }

    public static final java.lang.String DREAM_META_DATA = android.service.dreams.DreamService.DREAM_META_DATA;
    public static final java.lang.String SERVICE_INTERFACE = android.service.dreams.DreamService.SERVICE_INTERFACE;

}
