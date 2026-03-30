// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Dialog {
    private final android.app.Dialog real;

    public Dialog(android.app.Dialog real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Dialog wrap(android.app.Dialog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Dialog(real);
    }

    public android.app.Dialog unwrap() {
        return real;
    }

    public Dialog(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.Dialog(arg0 == null ? null : arg0.unwrap()));
    }

    public Dialog(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.app.Dialog(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addContentView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void cancel() {
        real.cancel();
    }

    public void closeOptionsMenu() {
        real.closeOptionsMenu();
    }

    public void create() {
        real.create();
    }

    public void dismiss() {
        real.dismiss();
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

    public com.micklab.dcg.wrapper.android.app.ActionBar getActionBar() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.wrap(real.getActionBar());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCurrentFocus());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(real.getOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.app.Activity getOwnerActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getOwnerActivity());
    }

    public com.micklab.dcg.wrapper.android.view.SearchEvent getSearchEvent() {
        return com.micklab.dcg.wrapper.android.view.SearchEvent.wrap(real.getSearchEvent());
    }

    public int getVolumeControlStream() {
        return real.getVolumeControlStream();
    }

    public com.micklab.dcg.wrapper.android.view.Window getWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(real.getWindow());
    }

    public void hide() {
        real.hide();
    }

    public void invalidateOptionsMenu() {
        real.invalidateOptionsMenu();
    }

    public boolean isShowing() {
        return real.isShowing();
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

    public void onBackPressed() {
        real.onBackPressed();
    }

    public void onContentChanged() {
        real.onContentChanged();
    }

    public boolean onContextItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return real.onContextItemSelected(arg0 == null ? null : arg0.unwrap());
    }

    public void onContextMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        real.onContextMenuClosed(arg0 == null ? null : arg0.unwrap());
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        real.onCreateContextMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean onCreateOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return real.onCreateOptionsMenu(arg0 == null ? null : arg0.unwrap());
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

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
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

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyShortcut(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onMenuItemSelected(int arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
        return real.onMenuItemSelected(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onMenuOpened(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return real.onMenuOpened(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return real.onOptionsItemSelected(arg0 == null ? null : arg0.unwrap());
    }

    public void onOptionsMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        real.onOptionsMenuClosed(arg0 == null ? null : arg0.unwrap());
    }

    public void onPanelClosed(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        real.onPanelClosed(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return real.onPrepareOptionsMenu(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
        return real.onPreparePanel(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.onSaveInstanceState());
    }

    public boolean onSearchRequested() {
        return real.onSearchRequested();
    }

    public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
        return real.onSearchRequested(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
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

    public void openContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.openContextMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void openOptionsMenu() {
        real.openOptionsMenu();
    }

    public void registerForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.registerForContextMenu(arg0 == null ? null : arg0.unwrap());
    }

    public boolean requestWindowFeature(int arg0) {
        return real.requestWindowFeature(arg0);
    }

    public void setCancelMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        real.setCancelMessage(arg0 == null ? null : arg0.unwrap());
    }

    public void setCancelable(boolean arg0) {
        real.setCancelable(arg0);
    }

    public void setCanceledOnTouchOutside(boolean arg0) {
        real.setCanceledOnTouchOutside(arg0);
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

    public void setDismissMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        real.setDismissMessage(arg0 == null ? null : arg0.unwrap());
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

    public void setOnCancelListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnCancelListener arg0) {
        real.setOnCancelListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnDismissListener arg0) {
        real.setOnDismissListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnKeyListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnKeyListener arg0) {
        real.setOnKeyListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnShowListener(com.micklab.dcg.wrapper.android.content.DialogInterface.OnShowListener arg0) {
        real.setOnShowListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOwnerActivity(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.setOwnerActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setTitle(int arg0) {
        real.setTitle(arg0);
    }

    public void setVolumeControlStream(int arg0) {
        real.setVolumeControlStream(arg0);
    }

    public void show() {
        real.show();
    }

    public void takeKeyEvents(boolean arg0) {
        real.takeKeyEvents(arg0);
    }

    public void unregisterForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.unregisterForContextMenu(arg0 == null ? null : arg0.unwrap());
    }

}
