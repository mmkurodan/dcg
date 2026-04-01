// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Activity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Activity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Activity wrap(android.app.Activity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Activity(real, (__DcgwBridgeToken) null);
    }

    public android.app.Activity getReal() {
        return (android.app.Activity) real;
    }

    public android.app.Activity unwrap() {
        return getReal();
    }

    public Activity() {
        this(new android.app.Activity(), (__DcgwBridgeToken) null);
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.app.Activity) real).addContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void clearOverrideActivityTransition(int arg0) {
        ((android.app.Activity) real).clearOverrideActivityTransition(arg0);
    }

    public void closeContextMenu() {
        ((android.app.Activity) real).closeContextMenu();
    }

    public void closeOptionsMenu() {
        ((android.app.Activity) real).closeOptionsMenu();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent createPendingResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.app.Activity) real).createPendingResult(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public void dismissDialog(int arg0) {
        ((android.app.Activity) real).dismissDialog(arg0);
    }

    public void dismissKeyboardShortcutsHelper() {
        ((android.app.Activity) real).dismissKeyboardShortcutsHelper();
    }

    public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Activity) real).dispatchGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.app.Activity) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyShortcutEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.app.Activity) real).dispatchKeyShortcutEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchPopulateAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        return ((android.app.Activity) real).dispatchPopulateAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Activity) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Activity) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.app.Activity) real).dump(arg0, arg1, arg2, arg3);
    }

    public void enterPictureInPictureMode() {
        ((android.app.Activity) real).enterPictureInPictureMode();
    }

    public boolean enterPictureInPictureMode(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
        return ((android.app.Activity) real).enterPictureInPictureMode(arg0 == null ? null : arg0.getReal());
    }

    public void finish() {
        ((android.app.Activity) real).finish();
    }

    public void finishActivity(int arg0) {
        ((android.app.Activity) real).finishActivity(arg0);
    }

    public void finishActivityFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1) {
        ((android.app.Activity) real).finishActivityFromChild(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void finishAffinity() {
        ((android.app.Activity) real).finishAffinity();
    }

    public void finishAfterTransition() {
        ((android.app.Activity) real).finishAfterTransition();
    }

    public void finishAndRemoveTask() {
        ((android.app.Activity) real).finishAndRemoveTask();
    }

    public void finishFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Activity) real).finishFromChild(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar getActionBar() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.wrap(((android.app.Activity) real).getActionBar());
    }

    public com.micklab.dcg.wrapper.android.app.Application getApplication() {
        return com.micklab.dcg.wrapper.android.app.Application.wrap(((android.app.Activity) real).getApplication());
    }

    public com.micklab.dcg.wrapper.android.app.ComponentCaller getCaller() {
        return com.micklab.dcg.wrapper.android.app.ComponentCaller.wrap(((android.app.Activity) real).getCaller());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getCallingActivity() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.Activity) real).getCallingActivity());
    }

    public java.lang.String getCallingPackage() {
        return ((android.app.Activity) real).getCallingPackage();
    }

    public int getChangingConfigurations() {
        return ((android.app.Activity) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.Activity) real).getComponentName());
    }

    public com.micklab.dcg.wrapper.android.transition.Scene getContentScene() {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(((android.app.Activity) real).getContentScene());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionManager getContentTransitionManager() {
        return com.micklab.dcg.wrapper.android.transition.TransitionManager.wrap(((android.app.Activity) real).getContentTransitionManager());
    }

    public com.micklab.dcg.wrapper.android.app.ComponentCaller getCurrentCaller() {
        return com.micklab.dcg.wrapper.android.app.ComponentCaller.wrap(((android.app.Activity) real).getCurrentCaller());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Activity) real).getCurrentFocus());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(((android.app.Activity) real).getFragmentManager());
    }

    public com.micklab.dcg.wrapper.android.app.ComponentCaller getInitialCaller() {
        return com.micklab.dcg.wrapper.android.app.ComponentCaller.wrap(((android.app.Activity) real).getInitialCaller());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.Activity) real).getIntent());
    }

    public java.lang.Object getLastNonConfigurationInstance() {
        return ((android.app.Activity) real).getLastNonConfigurationInstance();
    }

    public java.lang.String getLaunchedFromPackage() {
        return ((android.app.Activity) real).getLaunchedFromPackage();
    }

    public int getLaunchedFromUid() {
        return ((android.app.Activity) real).getLaunchedFromUid();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.app.Activity) real).getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.app.LoaderManager getLoaderManager() {
        return com.micklab.dcg.wrapper.android.app.LoaderManager.wrap(((android.app.Activity) real).getLoaderManager());
    }

    public java.lang.String getLocalClassName() {
        return ((android.app.Activity) real).getLocalClassName();
    }

    public int getMaxNumPictureInPictureActions() {
        return ((android.app.Activity) real).getMaxNumPictureInPictureActions();
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController getMediaController() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.wrap(((android.app.Activity) real).getMediaController());
    }

    public com.micklab.dcg.wrapper.android.view.MenuInflater getMenuInflater() {
        return com.micklab.dcg.wrapper.android.view.MenuInflater.wrap(((android.app.Activity) real).getMenuInflater());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(((android.app.Activity) real).getOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.app.Activity getParent() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Activity) real).getParent());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getParentActivityIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.Activity) real).getParentActivityIntent());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getPreferences(int arg0) {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(((android.app.Activity) real).getPreferences(arg0));
    }

    public com.micklab.dcg.wrapper.android.net.Uri getReferrer() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.Activity) real).getReferrer());
    }

    public int getRequestedOrientation() {
        return ((android.app.Activity) real).getRequestedOrientation();
    }

    public com.micklab.dcg.wrapper.android.view.SearchEvent getSearchEvent() {
        return com.micklab.dcg.wrapper.android.view.SearchEvent.wrap(((android.app.Activity) real).getSearchEvent());
    }

    public com.micklab.dcg.wrapper.android.window.SplashScreen getSplashScreen() {
        return com.micklab.dcg.wrapper.android.window.SplashScreen.wrap(((android.app.Activity) real).getSplashScreen());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return ((android.app.Activity) real).getSystemService(arg0);
    }

    public int getTaskId() {
        return ((android.app.Activity) real).getTaskId();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.app.Activity) real).getTitle();
    }

    public int getTitleColor() {
        return ((android.app.Activity) real).getTitleColor();
    }

    public com.micklab.dcg.wrapper.android.app.VoiceInteractor getVoiceInteractor() {
        return com.micklab.dcg.wrapper.android.app.VoiceInteractor.wrap(((android.app.Activity) real).getVoiceInteractor());
    }

    public int getVolumeControlStream() {
        return ((android.app.Activity) real).getVolumeControlStream();
    }

    public com.micklab.dcg.wrapper.android.view.Window getWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(((android.app.Activity) real).getWindow());
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager getWindowManager() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.wrap(((android.app.Activity) real).getWindowManager());
    }

    public boolean hasWindowFocus() {
        return ((android.app.Activity) real).hasWindowFocus();
    }

    public void invalidateOptionsMenu() {
        ((android.app.Activity) real).invalidateOptionsMenu();
    }

    public boolean isActivityTransitionRunning() {
        return ((android.app.Activity) real).isActivityTransitionRunning();
    }

    public boolean isChangingConfigurations() {
        return ((android.app.Activity) real).isChangingConfigurations();
    }

    public boolean isChild() {
        return ((android.app.Activity) real).isChild();
    }

    public boolean isDestroyed() {
        return ((android.app.Activity) real).isDestroyed();
    }

    public boolean isFinishing() {
        return ((android.app.Activity) real).isFinishing();
    }

    public boolean isImmersive() {
        return ((android.app.Activity) real).isImmersive();
    }

    public boolean isInMultiWindowMode() {
        return ((android.app.Activity) real).isInMultiWindowMode();
    }

    public boolean isInPictureInPictureMode() {
        return ((android.app.Activity) real).isInPictureInPictureMode();
    }

    public boolean isLaunchedFromBubble() {
        return ((android.app.Activity) real).isLaunchedFromBubble();
    }

    public boolean isLocalVoiceInteractionSupported() {
        return ((android.app.Activity) real).isLocalVoiceInteractionSupported();
    }

    public boolean isTaskRoot() {
        return ((android.app.Activity) real).isTaskRoot();
    }

    public boolean isVoiceInteraction() {
        return ((android.app.Activity) real).isVoiceInteraction();
    }

    public boolean isVoiceInteractionRoot() {
        return ((android.app.Activity) real).isVoiceInteractionRoot();
    }

    public com.micklab.dcg.wrapper.android.database.Cursor managedQuery(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.app.Activity) real).managedQuery(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public boolean moveTaskToBack(boolean arg0) {
        return ((android.app.Activity) real).moveTaskToBack(arg0);
    }

    public boolean navigateUpTo(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.app.Activity) real).navigateUpTo(arg0 == null ? null : arg0.getReal());
    }

    public boolean navigateUpToFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return ((android.app.Activity) real).navigateUpToFromChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onActionModeFinished(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        ((android.app.Activity) real).onActionModeFinished(arg0 == null ? null : arg0.getReal());
    }

    public void onActionModeStarted(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        ((android.app.Activity) real).onActionModeStarted(arg0 == null ? null : arg0.getReal());
    }

    public void onActivityReenter(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.Activity) real).onActivityReenter(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.app.ComponentCaller arg3) {
        ((android.app.Activity) real).onActivityResult(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void onAttachFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        ((android.app.Activity) real).onAttachFragment(arg0 == null ? null : arg0.getReal());
    }

    public void onAttachedToWindow() {
        ((android.app.Activity) real).onAttachedToWindow();
    }

    public void onBackPressed() {
        ((android.app.Activity) real).onBackPressed();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.app.Activity) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onContentChanged() {
        ((android.app.Activity) real).onContentChanged();
    }

    public boolean onContextItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.Activity) real).onContextItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void onContextMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        ((android.app.Activity) real).onContextMenuClosed(arg0 == null ? null : arg0.getReal());
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        ((android.app.Activity) real).onCreate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        ((android.app.Activity) real).onCreateContextMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public java.lang.CharSequence onCreateDescription() {
        return ((android.app.Activity) real).onCreateDescription();
    }

    public void onCreateNavigateUpTaskStack(com.micklab.dcg.wrapper.android.app.TaskStackBuilder arg0) {
        ((android.app.Activity) real).onCreateNavigateUpTaskStack(arg0 == null ? null : arg0.getReal());
    }

    public boolean onCreateOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return ((android.app.Activity) real).onCreateOptionsMenu(arg0 == null ? null : arg0.getReal());
    }

    public boolean onCreatePanelMenu(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return ((android.app.Activity) real).onCreatePanelMenu(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreatePanelView(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Activity) real).onCreatePanelView(arg0));
    }

    public boolean onCreateThumbnail(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Canvas arg1) {
        return ((android.app.Activity) real).onCreateThumbnail(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Activity) real).onCreateView(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Activity) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public void onDetachedFromWindow() {
        ((android.app.Activity) real).onDetachedFromWindow();
    }

    public void onEnterAnimationComplete() {
        ((android.app.Activity) real).onEnterAnimationComplete();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Activity) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Activity) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Activity) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.app.Activity) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyShortcut(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Activity) real).onKeyShortcut(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.app.Activity) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onLocalVoiceInteractionStarted() {
        ((android.app.Activity) real).onLocalVoiceInteractionStarted();
    }

    public void onLocalVoiceInteractionStopped() {
        ((android.app.Activity) real).onLocalVoiceInteractionStopped();
    }

    public void onLowMemory() {
        ((android.app.Activity) real).onLowMemory();
    }

    public boolean onMenuItemSelected(int arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
        return ((android.app.Activity) real).onMenuItemSelected(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onMenuOpened(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return ((android.app.Activity) real).onMenuOpened(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onMultiWindowModeChanged(boolean arg0) {
        ((android.app.Activity) real).onMultiWindowModeChanged(arg0);
    }

    public void onMultiWindowModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        ((android.app.Activity) real).onMultiWindowModeChanged(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onNavigateUp() {
        return ((android.app.Activity) real).onNavigateUp();
    }

    public boolean onNavigateUpFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return ((android.app.Activity) real).onNavigateUpFromChild(arg0 == null ? null : arg0.getReal());
    }

    public void onNewIntent(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.app.ComponentCaller arg1) {
        ((android.app.Activity) real).onNewIntent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.Activity) real).onOptionsItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void onOptionsMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        ((android.app.Activity) real).onOptionsMenuClosed(arg0 == null ? null : arg0.getReal());
    }

    public void onPanelClosed(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        ((android.app.Activity) real).onPanelClosed(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onPictureInPictureModeChanged(boolean arg0) {
        ((android.app.Activity) real).onPictureInPictureModeChanged(arg0);
    }

    public void onPictureInPictureModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        ((android.app.Activity) real).onPictureInPictureModeChanged(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onPictureInPictureRequested() {
        return ((android.app.Activity) real).onPictureInPictureRequested();
    }

    public void onPictureInPictureUiStateChanged(com.micklab.dcg.wrapper.android.app.PictureInPictureUiState arg0) {
        ((android.app.Activity) real).onPictureInPictureUiStateChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onPostCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        ((android.app.Activity) real).onPostCreate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onPrepareNavigateUpTaskStack(com.micklab.dcg.wrapper.android.app.TaskStackBuilder arg0) {
        ((android.app.Activity) real).onPrepareNavigateUpTaskStack(arg0 == null ? null : arg0.getReal());
    }

    public boolean onPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return ((android.app.Activity) real).onPrepareOptionsMenu(arg0 == null ? null : arg0.getReal());
    }

    public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
        return ((android.app.Activity) real).onPreparePanel(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onProvideAssistContent(com.micklab.dcg.wrapper.android.app.assist.AssistContent arg0) {
        ((android.app.Activity) real).onProvideAssistContent(arg0 == null ? null : arg0.getReal());
    }

    public void onProvideAssistData(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Activity) real).onProvideAssistData(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri onProvideReferrer() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.Activity) real).onProvideReferrer());
    }

    public void onRequestPermissionsResult(int arg0, java.lang.String[] arg1, int[] arg2) {
        ((android.app.Activity) real).onRequestPermissionsResult(arg0, arg1, arg2);
    }

    public void onRequestPermissionsResult(int arg0, java.lang.String[] arg1, int[] arg2, int arg3) {
        ((android.app.Activity) real).onRequestPermissionsResult(arg0, arg1, arg2, arg3);
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        ((android.app.Activity) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public java.lang.Object onRetainNonConfigurationInstance() {
        return ((android.app.Activity) real).onRetainNonConfigurationInstance();
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        ((android.app.Activity) real).onSaveInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onSearchRequested() {
        return ((android.app.Activity) real).onSearchRequested();
    }

    public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
        return ((android.app.Activity) real).onSearchRequested(arg0 == null ? null : arg0.getReal());
    }

    public void onStateNotSaved() {
        ((android.app.Activity) real).onStateNotSaved();
    }

    public void onTopResumedActivityChanged(boolean arg0) {
        ((android.app.Activity) real).onTopResumedActivityChanged(arg0);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Activity) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.app.Activity) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onTrimMemory(int arg0) {
        ((android.app.Activity) real).onTrimMemory(arg0);
    }

    public void onUserInteraction() {
        ((android.app.Activity) real).onUserInteraction();
    }

    public void onVisibleBehindCanceled() {
        ((android.app.Activity) real).onVisibleBehindCanceled();
    }

    public void onWindowAttributesChanged(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
        ((android.app.Activity) real).onWindowAttributesChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.app.Activity) real).onWindowFocusChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.app.Activity) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode onWindowStartingActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.app.Activity) real).onWindowStartingActionMode(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void openContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Activity) real).openContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public void openOptionsMenu() {
        ((android.app.Activity) real).openOptionsMenu();
    }

    public void overrideActivityTransition(int arg0, int arg1, int arg2) {
        ((android.app.Activity) real).overrideActivityTransition(arg0, arg1, arg2);
    }

    public void overrideActivityTransition(int arg0, int arg1, int arg2, int arg3) {
        ((android.app.Activity) real).overrideActivityTransition(arg0, arg1, arg2, arg3);
    }

    public void overridePendingTransition(int arg0, int arg1) {
        ((android.app.Activity) real).overridePendingTransition(arg0, arg1);
    }

    public void overridePendingTransition(int arg0, int arg1, int arg2) {
        ((android.app.Activity) real).overridePendingTransition(arg0, arg1, arg2);
    }

    public void postponeEnterTransition() {
        ((android.app.Activity) real).postponeEnterTransition();
    }

    public void recreate() {
        ((android.app.Activity) real).recreate();
    }

    public void registerActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        ((android.app.Activity) real).registerActivityLifecycleCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.app.Activity) real).registerComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void registerForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Activity) real).registerForContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public void registerScreenCaptureCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback arg1) {
        ((android.app.Activity) real).registerScreenCaptureCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean releaseInstance() {
        return ((android.app.Activity) real).releaseInstance();
    }

    public void removeDialog(int arg0) {
        ((android.app.Activity) real).removeDialog(arg0);
    }

    public void reportFullyDrawn() {
        ((android.app.Activity) real).reportFullyDrawn();
    }

    public com.micklab.dcg.wrapper.android.view.DragAndDropPermissions requestDragAndDropPermissions(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return com.micklab.dcg.wrapper.android.view.DragAndDropPermissions.wrap(((android.app.Activity) real).requestDragAndDropPermissions(arg0 == null ? null : arg0.getReal()));
    }

    public void requestOpenInBrowserEducation() {
        ((android.app.Activity) real).requestOpenInBrowserEducation();
    }

    public void requestPermissions(java.lang.String[] arg0, int arg1) {
        ((android.app.Activity) real).requestPermissions(arg0, arg1);
    }

    public void requestPermissions(java.lang.String[] arg0, int arg1, int arg2) {
        ((android.app.Activity) real).requestPermissions(arg0, arg1, arg2);
    }

    public void requestShowKeyboardShortcuts() {
        ((android.app.Activity) real).requestShowKeyboardShortcuts();
    }

    public boolean requestVisibleBehind(boolean arg0) {
        return ((android.app.Activity) real).requestVisibleBehind(arg0);
    }

    public boolean requestWindowFeature(int arg0) {
        return ((android.app.Activity) real).requestWindowFeature(arg0);
    }

    public void runOnUiThread(java.lang.Runnable arg0) {
        ((android.app.Activity) real).runOnUiThread(arg0);
    }

    public void setActionBar(com.micklab.dcg.wrapper.android.widget.Toolbar arg0) {
        ((android.app.Activity) real).setActionBar(arg0 == null ? null : arg0.getReal());
    }

    public void setAllowCrossUidActivitySwitchFromBelow(boolean arg0) {
        ((android.app.Activity) real).setAllowCrossUidActivitySwitchFromBelow(arg0);
    }

    public void setContentTransitionManager(com.micklab.dcg.wrapper.android.transition.TransitionManager arg0) {
        ((android.app.Activity) real).setContentTransitionManager(arg0 == null ? null : arg0.getReal());
    }

    public void setContentView(int arg0) {
        ((android.app.Activity) real).setContentView(arg0);
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Activity) real).setContentView(arg0 == null ? null : arg0.getReal());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.app.Activity) real).setContentView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setDefaultKeyMode(int arg0) {
        ((android.app.Activity) real).setDefaultKeyMode(arg0);
    }

    public void setEnterSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        ((android.app.Activity) real).setEnterSharedElementCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setExitSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        ((android.app.Activity) real).setExitSharedElementCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setFeatureDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        ((android.app.Activity) real).setFeatureDrawable(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setFeatureDrawableAlpha(int arg0, int arg1) {
        ((android.app.Activity) real).setFeatureDrawableAlpha(arg0, arg1);
    }

    public void setFeatureDrawableResource(int arg0, int arg1) {
        ((android.app.Activity) real).setFeatureDrawableResource(arg0, arg1);
    }

    public void setFeatureDrawableUri(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.app.Activity) real).setFeatureDrawableUri(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setFinishOnTouchOutside(boolean arg0) {
        ((android.app.Activity) real).setFinishOnTouchOutside(arg0);
    }

    public void setImmersive(boolean arg0) {
        ((android.app.Activity) real).setImmersive(arg0);
    }

    public void setInheritShowWhenLocked(boolean arg0) {
        ((android.app.Activity) real).setInheritShowWhenLocked(arg0);
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.app.Activity) real).setIntent(arg0 == null ? null : arg0.getReal());
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.app.ComponentCaller arg1) {
        ((android.app.Activity) real).setIntent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setLocusContext(com.micklab.dcg.wrapper.android.content.LocusId arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Activity) real).setLocusContext(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setMediaController(com.micklab.dcg.wrapper.android.media.session.MediaController arg0) {
        ((android.app.Activity) real).setMediaController(arg0 == null ? null : arg0.getReal());
    }

    public void setPictureInPictureParams(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
        ((android.app.Activity) real).setPictureInPictureParams(arg0 == null ? null : arg0.getReal());
    }

    public void setProgress(int arg0) {
        ((android.app.Activity) real).setProgress(arg0);
    }

    public void setProgressBarIndeterminate(boolean arg0) {
        ((android.app.Activity) real).setProgressBarIndeterminate(arg0);
    }

    public void setProgressBarIndeterminateVisibility(boolean arg0) {
        ((android.app.Activity) real).setProgressBarIndeterminateVisibility(arg0);
    }

    public void setProgressBarVisibility(boolean arg0) {
        ((android.app.Activity) real).setProgressBarVisibility(arg0);
    }

    public void setRecentsScreenshotEnabled(boolean arg0) {
        ((android.app.Activity) real).setRecentsScreenshotEnabled(arg0);
    }

    public void setRequestedOrientation(int arg0) {
        ((android.app.Activity) real).setRequestedOrientation(arg0);
    }

    public void setResult(int arg0) {
        ((android.app.Activity) real).setResult(arg0);
    }

    public void setResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.Activity) real).setResult(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setSecondaryProgress(int arg0) {
        ((android.app.Activity) real).setSecondaryProgress(arg0);
    }

    public void setShouldDockBigOverlays(boolean arg0) {
        ((android.app.Activity) real).setShouldDockBigOverlays(arg0);
    }

    public void setShowWhenLocked(boolean arg0) {
        ((android.app.Activity) real).setShowWhenLocked(arg0);
    }

    public void setTaskDescription(com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription arg0) {
        ((android.app.Activity) real).setTaskDescription(arg0 == null ? null : arg0.getReal());
    }

    public void setTheme(int arg0) {
        ((android.app.Activity) real).setTheme(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.app.Activity) real).setTitle(arg0);
    }

    public void setTitle(int arg0) {
        ((android.app.Activity) real).setTitle(arg0);
    }

    public void setTitleColor(int arg0) {
        ((android.app.Activity) real).setTitleColor(arg0);
    }

    public boolean setTranslucent(boolean arg0) {
        return ((android.app.Activity) real).setTranslucent(arg0);
    }

    public void setTurnScreenOn(boolean arg0) {
        ((android.app.Activity) real).setTurnScreenOn(arg0);
    }

    public void setVisible(boolean arg0) {
        ((android.app.Activity) real).setVisible(arg0);
    }

    public void setVolumeControlStream(int arg0) {
        ((android.app.Activity) real).setVolumeControlStream(arg0);
    }

    public void setVrModeEnabled(boolean arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        ((android.app.Activity) real).setVrModeEnabled(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean shouldDockBigOverlays() {
        return ((android.app.Activity) real).shouldDockBigOverlays();
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String arg0) {
        return ((android.app.Activity) real).shouldShowRequestPermissionRationale(arg0);
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String arg0, int arg1) {
        return ((android.app.Activity) real).shouldShowRequestPermissionRationale(arg0, arg1);
    }

    public boolean shouldUpRecreateTask(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.app.Activity) real).shouldUpRecreateTask(arg0 == null ? null : arg0.getReal());
    }

    public boolean showAssist(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return ((android.app.Activity) real).showAssist(arg0 == null ? null : arg0.getReal());
    }

    public void showDialog(int arg0) {
        ((android.app.Activity) real).showDialog(arg0);
    }

    public boolean showDialog(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.app.Activity) real).showDialog(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void showLockTaskEscapeMessage() {
        ((android.app.Activity) real).showLockTaskEscapeMessage();
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.app.Activity) real).startActionMode(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(((android.app.Activity) real).startActionMode(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void startActivities(android.content.Intent[] arg0) {
        ((android.app.Activity) real).startActivities(arg0);
    }

    public void startActivities(android.content.Intent[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Activity) real).startActivities(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.app.Activity) real).startActivity(arg0 == null ? null : arg0.getReal());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Activity) real).startActivity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        ((android.app.Activity) real).startActivityForResult(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.app.Activity) real).startActivityForResult(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void startActivityFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        ((android.app.Activity) real).startActivityFromChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void startActivityFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        ((android.app.Activity) real).startActivityFromChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void startActivityFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        ((android.app.Activity) real).startActivityFromFragment(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void startActivityFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        ((android.app.Activity) real).startActivityFromFragment(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean startActivityIfNeeded(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        return ((android.app.Activity) real).startActivityIfNeeded(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean startActivityIfNeeded(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.app.Activity) real).startActivityIfNeeded(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4) throws android.content.IntentSender.SendIntentException {
        ((android.app.Activity) real).startIntentSender(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4);
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) throws android.content.IntentSender.SendIntentException {
        ((android.app.Activity) real).startIntentSender(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void startIntentSenderForResult(com.micklab.dcg.wrapper.android.content.IntentSender arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3, int arg4, int arg5) throws android.content.IntentSender.SendIntentException {
        ((android.app.Activity) real).startIntentSenderForResult(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5);
    }

    public void startIntentSenderForResult(com.micklab.dcg.wrapper.android.content.IntentSender arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) throws android.content.IntentSender.SendIntentException {
        ((android.app.Activity) real).startIntentSenderForResult(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void startIntentSenderFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, int arg2, com.micklab.dcg.wrapper.android.content.Intent arg3, int arg4, int arg5, int arg6) throws android.content.IntentSender.SendIntentException {
        ((android.app.Activity) real).startIntentSenderFromChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6);
    }

    public void startIntentSenderFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, int arg2, com.micklab.dcg.wrapper.android.content.Intent arg3, int arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) throws android.content.IntentSender.SendIntentException {
        ((android.app.Activity) real).startIntentSenderFromChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void startLocalVoiceInteraction(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Activity) real).startLocalVoiceInteraction(arg0 == null ? null : arg0.getReal());
    }

    public void startLockTask() {
        ((android.app.Activity) real).startLockTask();
    }

    public void startManagingCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.app.Activity) real).startManagingCursor(arg0 == null ? null : arg0.getReal());
    }

    public boolean startNextMatchingActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.app.Activity) real).startNextMatchingActivity(arg0 == null ? null : arg0.getReal());
    }

    public boolean startNextMatchingActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.app.Activity) real).startNextMatchingActivity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void startPostponedEnterTransition() {
        ((android.app.Activity) real).startPostponedEnterTransition();
    }

    public void startSearch(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, boolean arg3) {
        ((android.app.Activity) real).startSearch(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void stopLocalVoiceInteraction() {
        ((android.app.Activity) real).stopLocalVoiceInteraction();
    }

    public void stopLockTask() {
        ((android.app.Activity) real).stopLockTask();
    }

    public void stopManagingCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        ((android.app.Activity) real).stopManagingCursor(arg0 == null ? null : arg0.getReal());
    }

    public void takeKeyEvents(boolean arg0) {
        ((android.app.Activity) real).takeKeyEvents(arg0);
    }

    public void triggerSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Activity) real).triggerSearch(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        ((android.app.Activity) real).unregisterActivityLifecycleCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.app.Activity) real).unregisterComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Activity) real).unregisterForContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterScreenCaptureCallback(com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback arg0) {
        ((android.app.Activity) real).unregisterScreenCaptureCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int DEFAULT_KEYS_DIALER = android.app.Activity.DEFAULT_KEYS_DIALER;
    public static final int DEFAULT_KEYS_DISABLE = android.app.Activity.DEFAULT_KEYS_DISABLE;
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL = android.app.Activity.DEFAULT_KEYS_SEARCH_GLOBAL;
    public static final int DEFAULT_KEYS_SEARCH_LOCAL = android.app.Activity.DEFAULT_KEYS_SEARCH_LOCAL;
    public static final int DEFAULT_KEYS_SHORTCUT = android.app.Activity.DEFAULT_KEYS_SHORTCUT;
    public static final int FULLSCREEN_MODE_REQUEST_ENTER = android.app.Activity.FULLSCREEN_MODE_REQUEST_ENTER;
    public static final int FULLSCREEN_MODE_REQUEST_EXIT = android.app.Activity.FULLSCREEN_MODE_REQUEST_EXIT;
    public static final int OVERRIDE_TRANSITION_CLOSE = android.app.Activity.OVERRIDE_TRANSITION_CLOSE;
    public static final int OVERRIDE_TRANSITION_OPEN = android.app.Activity.OVERRIDE_TRANSITION_OPEN;
    public static final int RESULT_CANCELED = android.app.Activity.RESULT_CANCELED;
    public static final int RESULT_FIRST_USER = android.app.Activity.RESULT_FIRST_USER;
    public static final int RESULT_OK = android.app.Activity.RESULT_OK;

    public static final class ScreenCaptureCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ScreenCaptureCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback wrap(android.app.Activity.ScreenCaptureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback(real, (__DcgwBridgeToken) null);
        }

        public android.app.Activity.ScreenCaptureCallback getReal() {
            return (android.app.Activity.ScreenCaptureCallback) real;
        }

        public android.app.Activity.ScreenCaptureCallback unwrap() {
            return getReal();
        }

        public void onScreenCaptured() {
            ((android.app.Activity.ScreenCaptureCallback) real).onScreenCaptured();
        }

    }
}
