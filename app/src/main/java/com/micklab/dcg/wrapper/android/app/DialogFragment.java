// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class DialogFragment {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DialogFragment(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.DialogFragment wrap(android.app.DialogFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.DialogFragment(real, (__DcgwBridgeToken) null);
    }

    public android.app.DialogFragment getReal() {
        return (android.app.DialogFragment) real;
    }

    public android.app.DialogFragment unwrap() {
        return getReal();
    }

    public DialogFragment() {
        this(new android.app.DialogFragment(), (__DcgwBridgeToken) null);
    }

    public void dismiss() {
        ((android.app.DialogFragment) real).dismiss();
    }

    public void dismissAllowingStateLoss() {
        ((android.app.DialogFragment) real).dismissAllowingStateLoss();
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.app.DialogFragment) real).dump(arg0, arg1, arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getDialog() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(((android.app.DialogFragment) real).getDialog());
    }

    public boolean getShowsDialog() {
        return ((android.app.DialogFragment) real).getShowsDialog();
    }

    public int getTheme() {
        return ((android.app.DialogFragment) real).getTheme();
    }

    public boolean isCancelable() {
        return ((android.app.DialogFragment) real).isCancelable();
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.DialogFragment) real).onActivityCreated(arg0 == null ? null : arg0.getReal());
    }

    public void onAttach(com.micklab.dcg.wrapper.android.content.Context arg0) {
        ((android.app.DialogFragment) real).onAttach(arg0 == null ? null : arg0.getReal());
    }

    public void onCancel(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        ((android.app.DialogFragment) real).onCancel(arg0 == null ? null : arg0.getReal());
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.DialogFragment) real).onCreate(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.Dialog onCreateDialog(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(((android.app.DialogFragment) real).onCreateDialog(arg0 == null ? null : arg0.getReal()));
    }

    public void onDestroyView() {
        ((android.app.DialogFragment) real).onDestroyView();
    }

    public void onDetach() {
        ((android.app.DialogFragment) real).onDetach();
    }

    public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        ((android.app.DialogFragment) real).onDismiss(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater onGetLayoutInflater(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.app.DialogFragment) real).onGetLayoutInflater(arg0 == null ? null : arg0.getReal()));
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.DialogFragment) real).onSaveInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public void onStart() {
        ((android.app.DialogFragment) real).onStart();
    }

    public void onStop() {
        ((android.app.DialogFragment) real).onStop();
    }

    public void setCancelable(boolean arg0) {
        ((android.app.DialogFragment) real).setCancelable(arg0);
    }

    public void setShowsDialog(boolean arg0) {
        ((android.app.DialogFragment) real).setShowsDialog(arg0);
    }

    public void setStyle(int arg0, int arg1) {
        ((android.app.DialogFragment) real).setStyle(arg0, arg1);
    }

    public int show(com.micklab.dcg.wrapper.android.app.FragmentTransaction arg0, java.lang.String arg1) {
        return ((android.app.DialogFragment) real).show(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void show(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, java.lang.String arg1) {
        ((android.app.DialogFragment) real).show(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STYLE_NORMAL = android.app.DialogFragment.STYLE_NORMAL;
    public static final int STYLE_NO_FRAME = android.app.DialogFragment.STYLE_NO_FRAME;
    public static final int STYLE_NO_INPUT = android.app.DialogFragment.STYLE_NO_INPUT;
    public static final int STYLE_NO_TITLE = android.app.DialogFragment.STYLE_NO_TITLE;

}
