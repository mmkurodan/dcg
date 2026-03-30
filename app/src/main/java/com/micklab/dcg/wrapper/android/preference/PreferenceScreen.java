// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceScreen {
    private final android.preference.PreferenceScreen real;

    public PreferenceScreen(android.preference.PreferenceScreen real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceScreen wrap(android.preference.PreferenceScreen real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceScreen(real);
    }

    public android.preference.PreferenceScreen unwrap() {
        return real;
    }

    public void bind(com.micklab.dcg.wrapper.android.widget.ListView arg0) {
        real.bind(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getDialog() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(real.getDialog());
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getRootAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getRootAdapter());
    }

    public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        real.onDismiss(arg0 == null ? null : arg0.unwrap());
    }

}
