// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class CheckBoxPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CheckBoxPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.CheckBoxPreference wrap(android.preference.CheckBoxPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.CheckBoxPreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.CheckBoxPreference getReal() {
        return (android.preference.CheckBoxPreference) real;
    }

    public android.preference.CheckBoxPreference unwrap() {
        return getReal();
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public CheckBoxPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.CheckBoxPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

}
