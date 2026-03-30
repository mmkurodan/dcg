// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceCategory {
    private final android.preference.PreferenceCategory real;

    public PreferenceCategory(android.preference.PreferenceCategory real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceCategory wrap(android.preference.PreferenceCategory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceCategory(real);
    }

    public android.preference.PreferenceCategory unwrap() {
        return real;
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.unwrap()));
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean shouldDisableDependents() {
        return real.shouldDisableDependents();
    }

}
