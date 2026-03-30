// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class ListPreference {
    private final android.preference.ListPreference real;

    public ListPreference(android.preference.ListPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.ListPreference wrap(android.preference.ListPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.ListPreference(real);
    }

    public android.preference.ListPreference unwrap() {
        return real;
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.unwrap()));
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public int findIndexOfValue(java.lang.String arg0) {
        return real.findIndexOfValue(arg0);
    }

    public java.lang.CharSequence[] getEntries() {
        return real.getEntries();
    }

    public java.lang.CharSequence getEntry() {
        return real.getEntry();
    }

    public java.lang.CharSequence[] getEntryValues() {
        return real.getEntryValues();
    }

    public java.lang.CharSequence getSummary() {
        return real.getSummary();
    }

    public java.lang.String getValue() {
        return real.getValue();
    }

    public void setEntries(int arg0) {
        real.setEntries(arg0);
    }

    public void setEntries(java.lang.CharSequence[] arg0) {
        real.setEntries(arg0);
    }

    public void setEntryValues(int arg0) {
        real.setEntryValues(arg0);
    }

    public void setEntryValues(java.lang.CharSequence[] arg0) {
        real.setEntryValues(arg0);
    }

    public void setSummary(java.lang.CharSequence arg0) {
        real.setSummary(arg0);
    }

    public void setValue(java.lang.String arg0) {
        real.setValue(arg0);
    }

    public void setValueIndex(int arg0) {
        real.setValueIndex(arg0);
    }

}
