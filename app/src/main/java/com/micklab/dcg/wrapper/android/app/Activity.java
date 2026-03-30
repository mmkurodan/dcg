// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Activity {
    private final android.app.Activity real;

    public Activity(android.app.Activity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Activity wrap(android.app.Activity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Activity(real);
    }

    public android.app.Activity unwrap() {
        return real;
    }

    public Activity() {
        this(new android.app.Activity());
    }

    public void addContentView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addContentView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void clearOverrideActivityTransition(int arg0) {
        real.clearOverrideActivityTransition(arg0);
    }

    public void closeContextMenu() {
        real.closeContextMenu();
    }

    public void closeOptionsMenu() {
        real.closeOptionsMenu();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent createPendingResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.createPendingResult(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public void dismissDialog(int arg0) {
        real.dismissDialog(arg0);
    }

    public void dismissKeyboardShortcutsHelper() {
        real.dismissKeyboardShortcutsHelper();
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

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public void enterPictureInPictureMode() {
        real.enterPictureInPictureMode();
    }

    public boolean enterPictureInPictureMode(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
        return real.enterPictureInPictureMode(arg0 == null ? null : arg0.unwrap());
    }

    public void finish() {
        real.finish();
    }

    public void finishActivity(int arg0) {
        real.finishActivity(arg0);
    }

    public void finishActivityFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1) {
        real.finishActivityFromChild(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void finishAffinity() {
        real.finishAffinity();
    }

    public void finishAfterTransition() {
        real.finishAfterTransition();
    }

    public void finishAndRemoveTask() {
        real.finishAndRemoveTask();
    }

    public void finishFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.finishFromChild(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.ActionBar getActionBar() {
        return com.micklab.dcg.wrapper.android.app.ActionBar.wrap(real.getActionBar());
    }

    public com.micklab.dcg.wrapper.android.app.Application getApplication() {
        return com.micklab.dcg.wrapper.android.app.Application.wrap(real.getApplication());
    }

    public com.micklab.dcg.wrapper.android.app.ComponentCaller getCaller() {
        return com.micklab.dcg.wrapper.android.app.ComponentCaller.wrap(real.getCaller());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getCallingActivity() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getCallingActivity());
    }

    public java.lang.String getCallingPackage() {
        return real.getCallingPackage();
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponentName());
    }

    public com.micklab.dcg.wrapper.android.transition.Scene getContentScene() {
        return com.micklab.dcg.wrapper.android.transition.Scene.wrap(real.getContentScene());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionManager getContentTransitionManager() {
        return com.micklab.dcg.wrapper.android.transition.TransitionManager.wrap(real.getContentTransitionManager());
    }

    public com.micklab.dcg.wrapper.android.app.ComponentCaller getCurrentCaller() {
        return com.micklab.dcg.wrapper.android.app.ComponentCaller.wrap(real.getCurrentCaller());
    }

    public com.micklab.dcg.wrapper.android.view.View getCurrentFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getCurrentFocus());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(real.getFragmentManager());
    }

    public com.micklab.dcg.wrapper.android.app.ComponentCaller getInitialCaller() {
        return com.micklab.dcg.wrapper.android.app.ComponentCaller.wrap(real.getInitialCaller());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
    }

    public java.lang.Object getLastNonConfigurationInstance() {
        return real.getLastNonConfigurationInstance();
    }

    public java.lang.String getLaunchedFromPackage() {
        return real.getLaunchedFromPackage();
    }

    public int getLaunchedFromUid() {
        return real.getLaunchedFromUid();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.app.LoaderManager getLoaderManager() {
        return com.micklab.dcg.wrapper.android.app.LoaderManager.wrap(real.getLoaderManager());
    }

    public java.lang.String getLocalClassName() {
        return real.getLocalClassName();
    }

    public int getMaxNumPictureInPictureActions() {
        return real.getMaxNumPictureInPictureActions();
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController getMediaController() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.wrap(real.getMediaController());
    }

    public com.micklab.dcg.wrapper.android.view.MenuInflater getMenuInflater() {
        return com.micklab.dcg.wrapper.android.view.MenuInflater.wrap(real.getMenuInflater());
    }

    public com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher.wrap(real.getOnBackInvokedDispatcher());
    }

    public com.micklab.dcg.wrapper.android.app.Activity getParent() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getParent());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getParentActivityIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getParentActivityIntent());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getPreferences(int arg0) {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(real.getPreferences(arg0));
    }

    public com.micklab.dcg.wrapper.android.net.Uri getReferrer() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getReferrer());
    }

    public int getRequestedOrientation() {
        return real.getRequestedOrientation();
    }

    public com.micklab.dcg.wrapper.android.view.SearchEvent getSearchEvent() {
        return com.micklab.dcg.wrapper.android.view.SearchEvent.wrap(real.getSearchEvent());
    }

    public com.micklab.dcg.wrapper.android.window.SplashScreen getSplashScreen() {
        return com.micklab.dcg.wrapper.android.window.SplashScreen.wrap(real.getSplashScreen());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return real.getSystemService(arg0);
    }

    public int getTaskId() {
        return real.getTaskId();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public int getTitleColor() {
        return real.getTitleColor();
    }

    public com.micklab.dcg.wrapper.android.app.VoiceInteractor getVoiceInteractor() {
        return com.micklab.dcg.wrapper.android.app.VoiceInteractor.wrap(real.getVoiceInteractor());
    }

    public int getVolumeControlStream() {
        return real.getVolumeControlStream();
    }

    public com.micklab.dcg.wrapper.android.view.Window getWindow() {
        return com.micklab.dcg.wrapper.android.view.Window.wrap(real.getWindow());
    }

    public com.micklab.dcg.wrapper.android.view.WindowManager getWindowManager() {
        return com.micklab.dcg.wrapper.android.view.WindowManager.wrap(real.getWindowManager());
    }

    public boolean hasWindowFocus() {
        return real.hasWindowFocus();
    }

    public void invalidateOptionsMenu() {
        real.invalidateOptionsMenu();
    }

    public boolean isActivityTransitionRunning() {
        return real.isActivityTransitionRunning();
    }

    public boolean isChangingConfigurations() {
        return real.isChangingConfigurations();
    }

    public boolean isChild() {
        return real.isChild();
    }

    public boolean isDestroyed() {
        return real.isDestroyed();
    }

    public boolean isFinishing() {
        return real.isFinishing();
    }

    public boolean isImmersive() {
        return real.isImmersive();
    }

    public boolean isInMultiWindowMode() {
        return real.isInMultiWindowMode();
    }

    public boolean isInPictureInPictureMode() {
        return real.isInPictureInPictureMode();
    }

    public boolean isLaunchedFromBubble() {
        return real.isLaunchedFromBubble();
    }

    public boolean isLocalVoiceInteractionSupported() {
        return real.isLocalVoiceInteractionSupported();
    }

    public boolean isTaskRoot() {
        return real.isTaskRoot();
    }

    public boolean isVoiceInteraction() {
        return real.isVoiceInteraction();
    }

    public boolean isVoiceInteractionRoot() {
        return real.isVoiceInteractionRoot();
    }

    public com.micklab.dcg.wrapper.android.database.Cursor managedQuery(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.managedQuery(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public boolean moveTaskToBack(boolean arg0) {
        return real.moveTaskToBack(arg0);
    }

    public boolean navigateUpTo(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.navigateUpTo(arg0 == null ? null : arg0.unwrap());
    }

    public boolean navigateUpToFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return real.navigateUpToFromChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onActionModeFinished(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        real.onActionModeFinished(arg0 == null ? null : arg0.unwrap());
    }

    public void onActionModeStarted(com.micklab.dcg.wrapper.android.view.ActionMode arg0) {
        real.onActionModeStarted(arg0 == null ? null : arg0.unwrap());
    }

    public void onActivityReenter(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onActivityReenter(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, com.micklab.dcg.wrapper.android.app.ComponentCaller arg3) {
        real.onActivityResult(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void onAttachFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        real.onAttachFragment(arg0 == null ? null : arg0.unwrap());
    }

    public void onAttachedToWindow() {
        real.onAttachedToWindow();
    }

    public void onBackPressed() {
        real.onBackPressed();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
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

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        real.onCreate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        real.onCreateContextMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.CharSequence onCreateDescription() {
        return real.onCreateDescription();
    }

    public void onCreateNavigateUpTaskStack(com.micklab.dcg.wrapper.android.app.TaskStackBuilder arg0) {
        real.onCreateNavigateUpTaskStack(arg0 == null ? null : arg0.unwrap());
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

    public boolean onCreateThumbnail(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Canvas arg1) {
        return real.onCreateThumbnail(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.Context arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public void onDetachedFromWindow() {
        real.onDetachedFromWindow();
    }

    public void onEnterAnimationComplete() {
        real.onEnterAnimationComplete();
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

    public void onLocalVoiceInteractionStarted() {
        real.onLocalVoiceInteractionStarted();
    }

    public void onLocalVoiceInteractionStopped() {
        real.onLocalVoiceInteractionStopped();
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public boolean onMenuItemSelected(int arg0, com.micklab.dcg.wrapper.android.view.MenuItem arg1) {
        return real.onMenuItemSelected(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onMenuOpened(int arg0, com.micklab.dcg.wrapper.android.view.Menu arg1) {
        return real.onMenuOpened(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onMultiWindowModeChanged(boolean arg0) {
        real.onMultiWindowModeChanged(arg0);
    }

    public void onMultiWindowModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        real.onMultiWindowModeChanged(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onNavigateUp() {
        return real.onNavigateUp();
    }

    public boolean onNavigateUpFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return real.onNavigateUpFromChild(arg0 == null ? null : arg0.unwrap());
    }

    public void onNewIntent(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.app.ComponentCaller arg1) {
        real.onNewIntent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
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

    public void onPictureInPictureModeChanged(boolean arg0) {
        real.onPictureInPictureModeChanged(arg0);
    }

    public void onPictureInPictureModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        real.onPictureInPictureModeChanged(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onPictureInPictureRequested() {
        return real.onPictureInPictureRequested();
    }

    public void onPictureInPictureUiStateChanged(com.micklab.dcg.wrapper.android.app.PictureInPictureUiState arg0) {
        real.onPictureInPictureUiStateChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onPostCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        real.onPostCreate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onPrepareNavigateUpTaskStack(com.micklab.dcg.wrapper.android.app.TaskStackBuilder arg0) {
        real.onPrepareNavigateUpTaskStack(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return real.onPrepareOptionsMenu(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onPreparePanel(int arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.Menu arg2) {
        return real.onPreparePanel(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onProvideAssistContent(com.micklab.dcg.wrapper.android.app.assist.AssistContent arg0) {
        real.onProvideAssistContent(arg0 == null ? null : arg0.unwrap());
    }

    public void onProvideAssistData(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onProvideAssistData(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri onProvideReferrer() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.onProvideReferrer());
    }

    public void onRequestPermissionsResult(int arg0, java.lang.String[] arg1, int[] arg2) {
        real.onRequestPermissionsResult(arg0, arg1, arg2);
    }

    public void onRequestPermissionsResult(int arg0, java.lang.String[] arg1, int[] arg2, int arg3) {
        real.onRequestPermissionsResult(arg0, arg1, arg2, arg3);
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.Object onRetainNonConfigurationInstance() {
        return real.onRetainNonConfigurationInstance();
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        real.onSaveInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean onSearchRequested() {
        return real.onSearchRequested();
    }

    public boolean onSearchRequested(com.micklab.dcg.wrapper.android.view.SearchEvent arg0) {
        return real.onSearchRequested(arg0 == null ? null : arg0.unwrap());
    }

    public void onStateNotSaved() {
        real.onStateNotSaved();
    }

    public void onTopResumedActivityChanged(boolean arg0) {
        real.onTopResumedActivityChanged(arg0);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

    public void onUserInteraction() {
        real.onUserInteraction();
    }

    public void onVisibleBehindCanceled() {
        real.onVisibleBehindCanceled();
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

    public void overrideActivityTransition(int arg0, int arg1, int arg2) {
        real.overrideActivityTransition(arg0, arg1, arg2);
    }

    public void overrideActivityTransition(int arg0, int arg1, int arg2, int arg3) {
        real.overrideActivityTransition(arg0, arg1, arg2, arg3);
    }

    public void overridePendingTransition(int arg0, int arg1) {
        real.overridePendingTransition(arg0, arg1);
    }

    public void overridePendingTransition(int arg0, int arg1, int arg2) {
        real.overridePendingTransition(arg0, arg1, arg2);
    }

    public void postponeEnterTransition() {
        real.postponeEnterTransition();
    }

    public void recreate() {
        real.recreate();
    }

    public void registerActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        real.registerActivityLifecycleCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.registerComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void registerForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.registerForContextMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void registerScreenCaptureCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback arg1) {
        real.registerScreenCaptureCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean releaseInstance() {
        return real.releaseInstance();
    }

    public void removeDialog(int arg0) {
        real.removeDialog(arg0);
    }

    public void reportFullyDrawn() {
        real.reportFullyDrawn();
    }

    public com.micklab.dcg.wrapper.android.view.DragAndDropPermissions requestDragAndDropPermissions(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return com.micklab.dcg.wrapper.android.view.DragAndDropPermissions.wrap(real.requestDragAndDropPermissions(arg0 == null ? null : arg0.unwrap()));
    }

    public void requestPermissions(java.lang.String[] arg0, int arg1) {
        real.requestPermissions(arg0, arg1);
    }

    public void requestPermissions(java.lang.String[] arg0, int arg1, int arg2) {
        real.requestPermissions(arg0, arg1, arg2);
    }

    public void requestShowKeyboardShortcuts() {
        real.requestShowKeyboardShortcuts();
    }

    public boolean requestVisibleBehind(boolean arg0) {
        return real.requestVisibleBehind(arg0);
    }

    public boolean requestWindowFeature(int arg0) {
        return real.requestWindowFeature(arg0);
    }

    public void runOnUiThread(java.lang.Runnable arg0) {
        real.runOnUiThread(arg0);
    }

    public void setActionBar(com.micklab.dcg.wrapper.android.widget.Toolbar arg0) {
        real.setActionBar(arg0 == null ? null : arg0.unwrap());
    }

    public void setAllowCrossUidActivitySwitchFromBelow(boolean arg0) {
        real.setAllowCrossUidActivitySwitchFromBelow(arg0);
    }

    public void setContentTransitionManager(com.micklab.dcg.wrapper.android.transition.TransitionManager arg0) {
        real.setContentTransitionManager(arg0 == null ? null : arg0.unwrap());
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

    public void setDefaultKeyMode(int arg0) {
        real.setDefaultKeyMode(arg0);
    }

    public void setEnterSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        real.setEnterSharedElementCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setExitSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        real.setExitSharedElementCallback(arg0 == null ? null : arg0.unwrap());
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

    public void setFinishOnTouchOutside(boolean arg0) {
        real.setFinishOnTouchOutside(arg0);
    }

    public void setImmersive(boolean arg0) {
        real.setImmersive(arg0);
    }

    public void setInheritShowWhenLocked(boolean arg0) {
        real.setInheritShowWhenLocked(arg0);
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setIntent(arg0 == null ? null : arg0.unwrap());
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.app.ComponentCaller arg1) {
        real.setIntent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setLocusContext(com.micklab.dcg.wrapper.android.content.LocusId arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.setLocusContext(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setMediaController(com.micklab.dcg.wrapper.android.media.session.MediaController arg0) {
        real.setMediaController(arg0 == null ? null : arg0.unwrap());
    }

    public void setPictureInPictureParams(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
        real.setPictureInPictureParams(arg0 == null ? null : arg0.unwrap());
    }

    public void setProgress(int arg0) {
        real.setProgress(arg0);
    }

    public void setProgressBarIndeterminate(boolean arg0) {
        real.setProgressBarIndeterminate(arg0);
    }

    public void setProgressBarIndeterminateVisibility(boolean arg0) {
        real.setProgressBarIndeterminateVisibility(arg0);
    }

    public void setProgressBarVisibility(boolean arg0) {
        real.setProgressBarVisibility(arg0);
    }

    public void setRecentsScreenshotEnabled(boolean arg0) {
        real.setRecentsScreenshotEnabled(arg0);
    }

    public void setRequestedOrientation(int arg0) {
        real.setRequestedOrientation(arg0);
    }

    public void setResult(int arg0) {
        real.setResult(arg0);
    }

    public void setResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.setResult(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setSecondaryProgress(int arg0) {
        real.setSecondaryProgress(arg0);
    }

    public void setShouldDockBigOverlays(boolean arg0) {
        real.setShouldDockBigOverlays(arg0);
    }

    public void setShowWhenLocked(boolean arg0) {
        real.setShowWhenLocked(arg0);
    }

    public void setTaskDescription(com.micklab.dcg.wrapper.android.app.ActivityManager.TaskDescription arg0) {
        real.setTaskDescription(arg0 == null ? null : arg0.unwrap());
    }

    public void setTheme(int arg0) {
        real.setTheme(arg0);
    }

    public void setTitle(int arg0) {
        real.setTitle(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setTitleColor(int arg0) {
        real.setTitleColor(arg0);
    }

    public boolean setTranslucent(boolean arg0) {
        return real.setTranslucent(arg0);
    }

    public void setTurnScreenOn(boolean arg0) {
        real.setTurnScreenOn(arg0);
    }

    public void setVisible(boolean arg0) {
        real.setVisible(arg0);
    }

    public void setVolumeControlStream(int arg0) {
        real.setVolumeControlStream(arg0);
    }

    public void setVrModeEnabled(boolean arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        real.setVrModeEnabled(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean shouldDockBigOverlays() {
        return real.shouldDockBigOverlays();
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String arg0) {
        return real.shouldShowRequestPermissionRationale(arg0);
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String arg0, int arg1) {
        return real.shouldShowRequestPermissionRationale(arg0, arg1);
    }

    public boolean shouldUpRecreateTask(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.shouldUpRecreateTask(arg0 == null ? null : arg0.unwrap());
    }

    public boolean showAssist(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return real.showAssist(arg0 == null ? null : arg0.unwrap());
    }

    public void showDialog(int arg0) {
        real.showDialog(arg0);
    }

    public boolean showDialog(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.showDialog(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void showLockTaskEscapeMessage() {
        real.showLockTaskEscapeMessage();
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.startActionMode(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ActionMode startActionMode(com.micklab.dcg.wrapper.android.view.ActionMode.Callback arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.ActionMode.wrap(real.startActionMode(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void startActivities(android.content.Intent[] arg0) {
        real.startActivities(arg0);
    }

    public void startActivities(android.content.Intent[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.startActivities(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.startActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.startActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        real.startActivityForResult(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.startActivityForResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void startActivityFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        real.startActivityFromChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void startActivityFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        real.startActivityFromChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void startActivityFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        real.startActivityFromFragment(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void startActivityFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        real.startActivityFromFragment(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean startActivityIfNeeded(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        return real.startActivityIfNeeded(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean startActivityIfNeeded(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.startActivityIfNeeded(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4) throws android.content.IntentSender.SendIntentException {
        real.startIntentSender(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) throws android.content.IntentSender.SendIntentException {
        real.startIntentSender(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void startIntentSenderForResult(com.micklab.dcg.wrapper.android.content.IntentSender arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3, int arg4, int arg5) throws android.content.IntentSender.SendIntentException {
        real.startIntentSenderForResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5);
    }

    public void startIntentSenderForResult(com.micklab.dcg.wrapper.android.content.IntentSender arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) throws android.content.IntentSender.SendIntentException {
        real.startIntentSenderForResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void startIntentSenderFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, int arg2, com.micklab.dcg.wrapper.android.content.Intent arg3, int arg4, int arg5, int arg6) throws android.content.IntentSender.SendIntentException {
        real.startIntentSenderFromChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6);
    }

    public void startIntentSenderFromChild(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, int arg2, com.micklab.dcg.wrapper.android.content.Intent arg3, int arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) throws android.content.IntentSender.SendIntentException {
        real.startIntentSenderFromChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public void startLocalVoiceInteraction(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.startLocalVoiceInteraction(arg0 == null ? null : arg0.unwrap());
    }

    public void startLockTask() {
        real.startLockTask();
    }

    public void startManagingCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.startManagingCursor(arg0 == null ? null : arg0.unwrap());
    }

    public boolean startNextMatchingActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.startNextMatchingActivity(arg0 == null ? null : arg0.unwrap());
    }

    public boolean startNextMatchingActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.startNextMatchingActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void startPostponedEnterTransition() {
        real.startPostponedEnterTransition();
    }

    public void startSearch(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, boolean arg3) {
        real.startSearch(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void stopLocalVoiceInteraction() {
        real.stopLocalVoiceInteraction();
    }

    public void stopLockTask() {
        real.stopLockTask();
    }

    public void stopManagingCursor(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
        real.stopManagingCursor(arg0 == null ? null : arg0.unwrap());
    }

    public void takeKeyEvents(boolean arg0) {
        real.takeKeyEvents(arg0);
    }

    public void triggerSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.triggerSearch(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        real.unregisterActivityLifecycleCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.unregisterComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.unregisterForContextMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterScreenCaptureCallback(com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback arg0) {
        real.unregisterScreenCaptureCallback(arg0 == null ? null : arg0.unwrap());
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
        private final android.app.Activity.ScreenCaptureCallback real;

        public ScreenCaptureCallback(android.app.Activity.ScreenCaptureCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback wrap(android.app.Activity.ScreenCaptureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Activity.ScreenCaptureCallback(real);
        }

        public android.app.Activity.ScreenCaptureCallback unwrap() {
            return real;
        }

        public void onScreenCaptured() {
            real.onScreenCaptured();
        }

    }
}
