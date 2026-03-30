// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceCategory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferenceCategory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceCategory wrap(android.preference.PreferenceCategory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceCategory(real, (__DcgwBridgeToken) null);
    }

    public android.preference.PreferenceCategory getReal() {
        return (android.preference.PreferenceCategory) real;
    }

    public android.preference.PreferenceCategory unwrap() {
        return getReal();
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public PreferenceCategory(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.PreferenceCategory(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public boolean isEnabled() {
        return ((android.preference.PreferenceCategory) real).isEnabled();
    }

    public boolean shouldDisableDependents() {
        return ((android.preference.PreferenceCategory) real).shouldDisableDependents();
    }

}
