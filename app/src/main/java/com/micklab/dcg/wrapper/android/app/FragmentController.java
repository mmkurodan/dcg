// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FragmentController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentController wrap(android.app.FragmentController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentController(real, (__DcgwBridgeToken) null);
    }

    public android.app.FragmentController getReal() {
        return (android.app.FragmentController) real;
    }

    public android.app.FragmentController unwrap() {
        return getReal();
    }

    public void attachHost(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        ((android.app.FragmentController) real).attachHost(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchActivityCreated() {
        ((android.app.FragmentController) real).dispatchActivityCreated();
    }

    public void dispatchConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.app.FragmentController) real).dispatchConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchContextItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.FragmentController) real).dispatchContextItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchCreate() {
        ((android.app.FragmentController) real).dispatchCreate();
    }

    public boolean dispatchCreateOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0, com.micklab.dcg.wrapper.android.view.MenuInflater arg1) {
        return ((android.app.FragmentController) real).dispatchCreateOptionsMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void dispatchDestroy() {
        ((android.app.FragmentController) real).dispatchDestroy();
    }

    public void dispatchDestroyView() {
        ((android.app.FragmentController) real).dispatchDestroyView();
    }

    public void dispatchLowMemory() {
        ((android.app.FragmentController) real).dispatchLowMemory();
    }

    public void dispatchMultiWindowModeChanged(boolean arg0) {
        ((android.app.FragmentController) real).dispatchMultiWindowModeChanged(arg0);
    }

    public void dispatchMultiWindowModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        ((android.app.FragmentController) real).dispatchMultiWindowModeChanged(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean dispatchOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.FragmentController) real).dispatchOptionsItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchOptionsMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        ((android.app.FragmentController) real).dispatchOptionsMenuClosed(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchPause() {
        ((android.app.FragmentController) real).dispatchPause();
    }

    public void dispatchPictureInPictureModeChanged(boolean arg0) {
        ((android.app.FragmentController) real).dispatchPictureInPictureModeChanged(arg0);
    }

    public void dispatchPictureInPictureModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        ((android.app.FragmentController) real).dispatchPictureInPictureModeChanged(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean dispatchPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        return ((android.app.FragmentController) real).dispatchPrepareOptionsMenu(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchResume() {
        ((android.app.FragmentController) real).dispatchResume();
    }

    public void dispatchStart() {
        ((android.app.FragmentController) real).dispatchStart();
    }

    public void dispatchStop() {
        ((android.app.FragmentController) real).dispatchStop();
    }

    public void dispatchTrimMemory(int arg0) {
        ((android.app.FragmentController) real).dispatchTrimMemory(arg0);
    }

    public void doLoaderDestroy() {
        ((android.app.FragmentController) real).doLoaderDestroy();
    }

    public void doLoaderStart() {
        ((android.app.FragmentController) real).doLoaderStart();
    }

    public void doLoaderStop(boolean arg0) {
        ((android.app.FragmentController) real).doLoaderStop(arg0);
    }

    public void dumpLoaders(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.app.FragmentController) real).dumpLoaders(arg0, arg1, arg2, arg3);
    }

    public boolean execPendingActions() {
        return ((android.app.FragmentController) real).execPendingActions();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment findFragmentByWho(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(((android.app.FragmentController) real).findFragmentByWho(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(((android.app.FragmentController) real).getFragmentManager());
    }

    public com.micklab.dcg.wrapper.android.app.LoaderManager getLoaderManager() {
        return com.micklab.dcg.wrapper.android.app.LoaderManager.wrap(((android.app.FragmentController) real).getLoaderManager());
    }

    public void noteStateNotSaved() {
        ((android.app.FragmentController) real).noteStateNotSaved();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2, com.micklab.dcg.wrapper.android.util.AttributeSet arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.FragmentController) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public void reportLoaderStart() {
        ((android.app.FragmentController) real).reportLoaderStart();
    }

    public void restoreAllState(com.micklab.dcg.wrapper.android.os.Parcelable arg0, com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig arg1) {
        ((android.app.FragmentController) real).restoreAllState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig retainNestedNonConfig() {
        return com.micklab.dcg.wrapper.android.app.FragmentManagerNonConfig.wrap(((android.app.FragmentController) real).retainNestedNonConfig());
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable saveAllState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.app.FragmentController) real).saveAllState());
    }

}
