// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class TwoStatePreference {
    private final android.preference.TwoStatePreference real;

    public TwoStatePreference(android.preference.TwoStatePreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.TwoStatePreference wrap(android.preference.TwoStatePreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.TwoStatePreference(real);
    }

    public android.preference.TwoStatePreference unwrap() {
        return real;
    }

    public boolean getDisableDependentsState() {
        return real.getDisableDependentsState();
    }

    public java.lang.CharSequence getSummaryOff() {
        return real.getSummaryOff();
    }

    public java.lang.CharSequence getSummaryOn() {
        return real.getSummaryOn();
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setDisableDependentsState(boolean arg0) {
        real.setDisableDependentsState(arg0);
    }

    public void setSummaryOff(int arg0) {
        real.setSummaryOff(arg0);
    }

    public void setSummaryOff(java.lang.CharSequence arg0) {
        real.setSummaryOff(arg0);
    }

    public void setSummaryOn(int arg0) {
        real.setSummaryOn(arg0);
    }

    public void setSummaryOn(java.lang.CharSequence arg0) {
        real.setSummaryOn(arg0);
    }

    public boolean shouldDisableDependents() {
        return real.shouldDisableDependents();
    }

}
