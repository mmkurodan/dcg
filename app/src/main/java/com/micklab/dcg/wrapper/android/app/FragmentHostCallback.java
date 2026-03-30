// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentHostCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FragmentHostCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentHostCallback wrap(android.app.FragmentHostCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentHostCallback(real, (__DcgwBridgeToken) null);
    }

    public android.app.FragmentHostCallback getReal() {
        return (android.app.FragmentHostCallback) real;
    }

    public android.app.FragmentHostCallback unwrap() {
        return getReal();
    }

    public void onAttachFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        ((android.app.FragmentHostCallback) real).onAttachFragment(arg0 == null ? null : arg0.getReal());
    }

    public void onDump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.app.FragmentHostCallback) real).onDump(arg0, arg1, arg2, arg3);
    }

    public java.lang.Object onGetHost() {
        return ((android.app.FragmentHostCallback) real).onGetHost();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater onGetLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.app.FragmentHostCallback) real).onGetLayoutInflater());
    }

    public int onGetWindowAnimations() {
        return ((android.app.FragmentHostCallback) real).onGetWindowAnimations();
    }

    public boolean onHasView() {
        return ((android.app.FragmentHostCallback) real).onHasView();
    }

    public boolean onHasWindowAnimations() {
        return ((android.app.FragmentHostCallback) real).onHasWindowAnimations();
    }

    public void onInvalidateOptionsMenu() {
        ((android.app.FragmentHostCallback) real).onInvalidateOptionsMenu();
    }

    public void onRequestPermissionsFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, java.lang.String[] arg1, int arg2) {
        ((android.app.FragmentHostCallback) real).onRequestPermissionsFromFragment(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean onShouldSaveFragmentState(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return ((android.app.FragmentHostCallback) real).onShouldSaveFragmentState(arg0 == null ? null : arg0.getReal());
    }

    public void onStartActivityFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        ((android.app.FragmentHostCallback) real).onStartActivityFromFragment(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onStartIntentSenderFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, int arg2, com.micklab.dcg.wrapper.android.content.Intent arg3, int arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) throws android.content.IntentSender.SendIntentException {
        ((android.app.FragmentHostCallback) real).onStartIntentSenderFromFragment(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public boolean onUseFragmentManagerInflaterFactory() {
        return ((android.app.FragmentHostCallback) real).onUseFragmentManagerInflaterFactory();
    }

}
