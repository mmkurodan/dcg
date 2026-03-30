// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class DialogFragment {
    private final android.app.DialogFragment real;

    public DialogFragment(android.app.DialogFragment real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.DialogFragment wrap(android.app.DialogFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.DialogFragment(real);
    }

    public android.app.DialogFragment unwrap() {
        return real;
    }

    public DialogFragment() {
        this(new android.app.DialogFragment());
    }

    public void dismiss() {
        real.dismiss();
    }

    public void dismissAllowingStateLoss() {
        real.dismissAllowingStateLoss();
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getDialog() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(real.getDialog());
    }

    public boolean getShowsDialog() {
        return real.getShowsDialog();
    }

    public int getTheme() {
        return real.getTheme();
    }

    public boolean isCancelable() {
        return real.isCancelable();
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onActivityCreated(arg0 == null ? null : arg0.unwrap());
    }

    public void onAttach(com.micklab.dcg.wrapper.android.content.Context arg0) {
        real.onAttach(arg0 == null ? null : arg0.unwrap());
    }

    public void onCancel(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        real.onCancel(arg0 == null ? null : arg0.unwrap());
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onCreate(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.Dialog onCreateDialog(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(real.onCreateDialog(arg0 == null ? null : arg0.unwrap()));
    }

    public void onDestroyView() {
        real.onDestroyView();
    }

    public void onDetach() {
        real.onDetach();
    }

    public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        real.onDismiss(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater onGetLayoutInflater(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.onGetLayoutInflater(arg0 == null ? null : arg0.unwrap()));
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onSaveInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public void onStart() {
        real.onStart();
    }

    public void onStop() {
        real.onStop();
    }

    public void setCancelable(boolean arg0) {
        real.setCancelable(arg0);
    }

    public void setShowsDialog(boolean arg0) {
        real.setShowsDialog(arg0);
    }

    public void setStyle(int arg0, int arg1) {
        real.setStyle(arg0, arg1);
    }

    public int show(com.micklab.dcg.wrapper.android.app.FragmentTransaction arg0, java.lang.String arg1) {
        return real.show(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void show(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, java.lang.String arg1) {
        real.show(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STYLE_NORMAL = android.app.DialogFragment.STYLE_NORMAL;
    public static final int STYLE_NO_FRAME = android.app.DialogFragment.STYLE_NO_FRAME;
    public static final int STYLE_NO_INPUT = android.app.DialogFragment.STYLE_NO_INPUT;
    public static final int STYLE_NO_TITLE = android.app.DialogFragment.STYLE_NO_TITLE;

}
