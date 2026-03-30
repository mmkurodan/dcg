// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Dialog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Dialog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Dialog wrap(android.app.Dialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Dialog(real, (__DcgwBridgeToken) null);
    }

    public android.app.Dialog getReal() {
        return (android.app.Dialog) real;
    }

    public android.app.Dialog unwrap() {
        return getReal();
    }

    public Dialog(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.Dialog(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Dialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.app.Dialog(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.app.Dialog) real).addContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void cancel() {
        ((android.app.Dialog) real).cancel();
    }

    public void closeOptionsMenu() {
        ((android.app.Dialog) real).closeOptionsMenu();
    }

    public void create() {
        ((android.app.Dialog) real).create();
    }

    public void dismiss() {
        ((android.app.Dialog) real).dismiss();
    }

    public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Dialog) real).dispatchGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.app.Dialog) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.app.Dialog) real).dispatchKeyShortcutEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        return ((android.app.Dialog) real).dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Dialog) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Dialog) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar getActionBar() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.wrap(((android.app.Dialog) real).getActionBar());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.Dialog) real).getContext());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Dialog) real).getCurrentFocus());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.app.Dialog) real).getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(((android.app.Dialog) real).getOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.app.Activity getOwnerActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Dialog) real).getOwnerActivity());
    }

    public com.micklab.dcg.wrapper.android.view.SearchEvent getSearchEvent() {
        return com.micklab.dcg.wrapper.android.view.SearchEvent.wrap(((android.app.Dialog) real).getSearchEvent());
    }

    public int getVolumeControlStream() {
        return ((android.app.Dialog) real).getVolumeControlStream();
    }

    public com.micklab.dcg.wrapper.android.view.Window getWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(((android.app.Dialog) real).getWindow());
    }

    public void hide() {
        ((android.app.Dialog) real).hide();
    }

    public void invalidateOptionsMenu() {
        ((android.app.Dialog) real).invalidateOptionsMenu();
    }

    public boolean isShowing() {
        return ((android.app.Dialog) real).isShowing();
    }

    public void onActionModeFinished(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        ((android.app.Dialog) real).onActionModeFinished(arg0 == null ? null : arg0.getReal());
    }

    public void onActionModeStarted(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        ((android.app.Dialog) real).onActionModeStarted(arg0 == null ? null : arg0.getReal());
    }

    public void onAttachedToWindow() {
        ((android.app.Dialog) real).onAttachedToWindow();
    }

    public void onBackPressed() {
        ((android.app.Dialog) real).onBackPressed();
    }

    public void onContentChanged() {
        ((android.app.Dialog) real).onContentChanged();
    }

    public boolean onContextItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.Dialog) real).onContextItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void onContextMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        ((android.app.Dialog) real).onContextMenuClosed(arg0 == null ? null : arg0.getReal());
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        ((android.app.Dialog) real).onCreateContextMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onCreateOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return ((android.app.Dialog) real).onCreateOptionsMenu(arg0 == null ? null : arg0.getReal());
    }

    public boolean onCreatePanelMenu(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return ((android.app.Dialog) real).onCreatePanelMenu(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreatePanelView(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Dialog) real).onCreatePanelView(arg0));
    }

    public void onDetachedFromWindow() {
        ((android.app.Dialog) real).onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Dialog) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Dialog) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Dialog) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.app.Dialog) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Dialog) real).onKeyShortcut(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Dialog) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onMenuItemSelected(int arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
        return ((android.app.Dialog) real).onMenuItemSelected(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onMenuOpened(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return ((android.app.Dialog) real).onMenuOpened(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.Dialog) real).onOptionsItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void onOptionsMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        ((android.app.Dialog) real).onOptionsMenuClosed(arg0 == null ? null : arg0.getReal());
    }

    public void onPanelClosed(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        ((android.app.Dialog) real).onPanelClosed(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return ((android.app.Dialog) real).onPrepareOptionsMenu(arg0 == null ? null : arg0.getReal());
    }

    public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
        return ((android.app.Dialog) real).onPreparePanel(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Dialog) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Dialog) real).onSaveInstanceState());
    }

    public boolean onSearchRequested() {
        return ((android.app.Dialog) real).onSearchRequested();
    }

    public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
        return ((android.app.Dialog) real).onSearchRequested(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Dialog) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Dialog) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onWindowAttributesChanged(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
        ((android.app.Dialog) real).onWindowAttributesChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.app.Dialog) real).onWindowFocusChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.app.Dialog) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.app.Dialog) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void openContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Dialog) real).openContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public void openOptionsMenu() {
        ((android.app.Dialog) real).openOptionsMenu();
    }

    public void registerForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Dialog) real).registerForContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public boolean requestWindowFeature(int arg0) {
        return ((android.app.Dialog) real).requestWindowFeature(arg0);
    }

    public void setCancelMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        ((android.app.Dialog) real).setCancelMessage(arg0 == null ? null : arg0.getReal());
    }

    public void setCancelable(boolean arg0) {
        ((android.app.Dialog) real).setCancelable(arg0);
    }

    public void setCanceledOnTouchOutside(boolean arg0) {
        ((android.app.Dialog) real).setCanceledOnTouchOutside(arg0);
    }

    public void setContentView(int arg0) {
        ((android.app.Dialog) real).setContentView(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Dialog) real).setContentView(arg0 == null ? null : arg0.getReal());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.app.Dialog) real).setContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setDismissMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        ((android.app.Dialog) real).setDismissMessage(arg0 == null ? null : arg0.getReal());
    }

    public void setFeatureDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        ((android.app.Dialog) real).setFeatureDrawable(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setFeatureDrawableAlpha(int arg0, int arg1) {
        ((android.app.Dialog) real).setFeatureDrawableAlpha(arg0, arg1);
    }

    public void setFeatureDrawableResource(int arg0, int arg1) {
        ((android.app.Dialog) real).setFeatureDrawableResource(arg0, arg1);
    }

    public void setFeatureDrawableUri(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.app.Dialog) real).setFeatureDrawableUri(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnCancelListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener arg0) {
        ((android.app.Dialog) real).setOnCancelListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener arg0) {
        ((android.app.Dialog) real).setOnDismissListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnKeyListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener arg0) {
        ((android.app.Dialog) real).setOnKeyListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnShowListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnShowListener arg0) {
        ((android.app.Dialog) real).setOnShowListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOwnerActivity(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Dialog) real).setOwnerActivity(arg0 == null ? null : arg0.getReal());
    }

    public void setTitle(int arg0) {
        ((android.app.Dialog) real).setTitle(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.app.Dialog) real).setTitle(arg0);
    }

    public void setVolumeControlStream(int arg0) {
        ((android.app.Dialog) real).setVolumeControlStream(arg0);
    }

    public void show() {
        ((android.app.Dialog) real).show();
    }

    public void takeKeyEvents(boolean arg0) {
        ((android.app.Dialog) real).takeKeyEvents(arg0);
    }

    public void unregisterForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Dialog) real).unregisterForContextMenu(arg0 == null ? null : arg0.getReal());
    }

}
