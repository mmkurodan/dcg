// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentController {
    private final android.app.FragmentController real;

    public FragmentController(android.app.FragmentController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentController wrap(android.app.FragmentController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentController(real);
    }

    public android.app.FragmentController unwrap() {
        return real;
    }

    public void attachHost(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        real.attachHost(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchActivityCreated() {
        real.dispatchActivityCreated();
    }

    public void dispatchConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.dispatchConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchContextItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return real.dispatchContextItemSelected(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchCreate() {
        real.dispatchCreate();
    }

    public boolean dispatchCreateOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0, com.micklab.dcg.wrapper.android.view.MenuInflater arg1) {
        return real.dispatchCreateOptionsMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void dispatchDestroy() {
        real.dispatchDestroy();
    }

    public void dispatchDestroyView() {
        real.dispatchDestroyView();
    }

    public void dispatchLowMemory() {
        real.dispatchLowMemory();
    }

    public void dispatchMultiWindowModeChanged(boolean arg0) {
        real.dispatchMultiWindowModeChanged(arg0);
    }

    public void dispatchMultiWindowModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        real.dispatchMultiWindowModeChanged(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean dispatchOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return real.dispatchOptionsItemSelected(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchOptionsMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        real.dispatchOptionsMenuClosed(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchPause() {
        real.dispatchPause();
    }

    public void dispatchPictureInPictureModeChanged(boolean arg0) {
        real.dispatchPictureInPictureModeChanged(arg0);
    }

    public void dispatchPictureInPictureModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        real.dispatchPictureInPictureModeChanged(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean dispatchPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return real.dispatchPrepareOptionsMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchResume() {
        real.dispatchResume();
    }

    public void dispatchStart() {
        real.dispatchStart();
    }

    public void dispatchStop() {
        real.dispatchStop();
    }

    public void dispatchTrimMemory(int arg0) {
        real.dispatchTrimMemory(arg0);
    }

    public void doLoaderDestroy() {
        real.doLoaderDestroy();
    }

    public void doLoaderStart() {
        real.doLoaderStart();
    }

    public void doLoaderStop(boolean arg0) {
        real.doLoaderStop(arg0);
    }

    public void dumpLoaders(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dumpLoaders(arg0, arg1, arg2, arg3);
    }

    public boolean execPendingActions() {
        return real.execPendingActions();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment findFragmentByWho(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(real.findFragmentByWho(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(real.getFragmentManager());
    }

    public com.micklab.dcg.wrapper.android.app.LoaderManager getLoaderManager() {
        return com.micklab.dcg.wrapper.android.app.LoaderManager.wrap(real.getLoaderManager());
    }

    public void noteStateNotSaved() {
        real.noteStateNotSaved();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public void reportLoaderStart() {
        real.reportLoaderStart();
    }

    public void restoreAllState(com.micklab.dcg.wrapper.android.os.Parcelable arg0, com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig arg1) {
        real.restoreAllState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig retainNestedNonConfig() {
        return com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig.wrap(real.retainNestedNonConfig());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable saveAllState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.saveAllState());
    }

}
