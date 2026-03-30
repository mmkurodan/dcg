// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class TwoStatePreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TwoStatePreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.TwoStatePreference wrap(android.preference.TwoStatePreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.TwoStatePreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.TwoStatePreference getReal() {
        return (android.preference.TwoStatePreference) real;
    }

    public android.preference.TwoStatePreference unwrap() {
        return getReal();
    }

    public boolean getDisableDependentsState() {
        return ((android.preference.TwoStatePreference) real).getDisableDependentsState();
    }

    public java.lang.CharSequence getSummaryOff() {
        return ((android.preference.TwoStatePreference) real).getSummaryOff();
    }

    public java.lang.CharSequence getSummaryOn() {
        return ((android.preference.TwoStatePreference) real).getSummaryOn();
    }

    public boolean isChecked() {
        return ((android.preference.TwoStatePreference) real).isChecked();
    }

    public void setChecked(boolean arg0) {
        ((android.preference.TwoStatePreference) real).setChecked(arg0);
    }

    public void setDisableDependentsState(boolean arg0) {
        ((android.preference.TwoStatePreference) real).setDisableDependentsState(arg0);
    }

    public void setSummaryOff(int arg0) {
        ((android.preference.TwoStatePreference) real).setSummaryOff(arg0);
    }

    public void setSummaryOff(java.lang.CharSequence arg0) {
        ((android.preference.TwoStatePreference) real).setSummaryOff(arg0);
    }

    public void setSummaryOn(int arg0) {
        ((android.preference.TwoStatePreference) real).setSummaryOn(arg0);
    }

    public void setSummaryOn(java.lang.CharSequence arg0) {
        ((android.preference.TwoStatePreference) real).setSummaryOn(arg0);
    }

    public boolean shouldDisableDependents() {
        return ((android.preference.TwoStatePreference) real).shouldDisableDependents();
    }

}
