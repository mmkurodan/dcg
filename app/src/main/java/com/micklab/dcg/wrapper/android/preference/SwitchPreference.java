// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class SwitchPreference {
    private final android.preference.SwitchPreference real;

    public SwitchPreference(android.preference.SwitchPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.SwitchPreference wrap(android.preference.SwitchPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.SwitchPreference(real);
    }

    public android.preference.SwitchPreference unwrap() {
        return real;
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.unwrap()));
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public SwitchPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.SwitchPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getSwitchTextOff() {
        return real.getSwitchTextOff();
    }

    public java.lang.CharSequence getSwitchTextOn() {
        return real.getSwitchTextOn();
    }

    public void setSwitchTextOff(int arg0) {
        real.setSwitchTextOff(arg0);
    }

    public void setSwitchTextOff(java.lang.CharSequence arg0) {
        real.setSwitchTextOff(arg0);
    }

    public void setSwitchTextOn(int arg0) {
        real.setSwitchTextOn(arg0);
    }

    public void setSwitchTextOn(java.lang.CharSequence arg0) {
        real.setSwitchTextOn(arg0);
    }

}
