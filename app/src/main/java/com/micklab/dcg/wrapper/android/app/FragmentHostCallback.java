// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentHostCallback {
    private final android.app.FragmentHostCallback real;

    public FragmentHostCallback(android.app.FragmentHostCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentHostCallback wrap(android.app.FragmentHostCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentHostCallback(real);
    }

    public android.app.FragmentHostCallback unwrap() {
        return real;
    }

    public void onAttachFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        real.onAttachFragment(arg0 == null ? null : arg0.unwrap());
    }

    public void onDump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.onDump(arg0, arg1, arg2, arg3);
    }

    public java.lang.Object onGetHost() {
        return real.onGetHost();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater onGetLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.onGetLayoutInflater());
    }

    public int onGetWindowAnimations() {
        return real.onGetWindowAnimations();
    }

    public boolean onHasView() {
        return real.onHasView();
    }

    public boolean onHasWindowAnimations() {
        return real.onHasWindowAnimations();
    }

    public void onInvalidateOptionsMenu() {
        real.onInvalidateOptionsMenu();
    }

    public void onRequestPermissionsFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, java.lang.String[] arg1, int arg2) {
        real.onRequestPermissionsFromFragment(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean onShouldSaveFragmentState(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return real.onShouldSaveFragmentState(arg0 == null ? null : arg0.unwrap());
    }

    public void onStartActivityFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        real.onStartActivityFromFragment(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void onStartIntentSenderFromFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, com.micklab.dcg.wrapper.android.content.IntentSender arg1, int arg2, com.micklab.dcg.wrapper.android.content.Intent arg3, int arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) throws android.content.IntentSender.SendIntentException {
        real.onStartIntentSenderFromFragment(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public boolean onUseFragmentManagerInflaterFactory() {
        return real.onUseFragmentManagerInflaterFactory();
    }

}
