// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceScreen {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferenceScreen(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceScreen wrap(android.preference.PreferenceScreen real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceScreen(real, (__DcgwBridgeToken) null);
    }

    public android.preference.PreferenceScreen getReal() {
        return (android.preference.PreferenceScreen) real;
    }

    public android.preference.PreferenceScreen unwrap() {
        return getReal();
    }

    public void bind(com.micklab.dcg.wrapper.android.widget.ListView arg0) {
        ((android.preference.PreferenceScreen) real).bind(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getDialog() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(((android.preference.PreferenceScreen) real).getDialog());
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getRootAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.preference.PreferenceScreen) real).getRootAdapter());
    }

    public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        ((android.preference.PreferenceScreen) real).onDismiss(arg0 == null ? null : arg0.getReal());
    }

}
