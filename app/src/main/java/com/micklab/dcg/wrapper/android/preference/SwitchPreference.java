// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class SwitchPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SwitchPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.SwitchPreference wrap(android.preference.SwitchPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.SwitchPreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.SwitchPreference getReal() {
        return (android.preference.SwitchPreference) real;
    }

    public android.preference.SwitchPreference unwrap() {
        return getReal();
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getSwitchTextOff() {
        return ((android.preference.SwitchPreference) real).getSwitchTextOff();
    }

    public java.lang.CharSequence getSwitchTextOn() {
        return ((android.preference.SwitchPreference) real).getSwitchTextOn();
    }

    public void setSwitchTextOff(int arg0) {
        ((android.preference.SwitchPreference) real).setSwitchTextOff(arg0);
    }

    public void setSwitchTextOff(java.lang.CharSequence arg0) {
        ((android.preference.SwitchPreference) real).setSwitchTextOff(arg0);
    }

    public void setSwitchTextOn(int arg0) {
        ((android.preference.SwitchPreference) real).setSwitchTextOn(arg0);
    }

    public void setSwitchTextOn(java.lang.CharSequence arg0) {
        ((android.preference.SwitchPreference) real).setSwitchTextOn(arg0);
    }

}
