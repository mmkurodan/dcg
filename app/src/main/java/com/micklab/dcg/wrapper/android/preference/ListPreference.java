// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class ListPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.ListPreference wrap(android.preference.ListPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.ListPreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.ListPreference getReal() {
        return (android.preference.ListPreference) real;
    }

    public android.preference.ListPreference unwrap() {
        return getReal();
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.ListPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int findIndexOfValue(java.lang.String arg0) {
        return ((android.preference.ListPreference) real).findIndexOfValue(arg0);
    }

    public java.lang.CharSequence[] getEntries() {
        return ((android.preference.ListPreference) real).getEntries();
    }

    public java.lang.CharSequence getEntry() {
        return ((android.preference.ListPreference) real).getEntry();
    }

    public java.lang.CharSequence[] getEntryValues() {
        return ((android.preference.ListPreference) real).getEntryValues();
    }

    public java.lang.CharSequence getSummary() {
        return ((android.preference.ListPreference) real).getSummary();
    }

    public java.lang.String getValue() {
        return ((android.preference.ListPreference) real).getValue();
    }

    public void setEntries(java.lang.CharSequence[] arg0) {
        ((android.preference.ListPreference) real).setEntries(arg0);
    }

    public void setEntries(int arg0) {
        ((android.preference.ListPreference) real).setEntries(arg0);
    }

    public void setEntryValues(java.lang.CharSequence[] arg0) {
        ((android.preference.ListPreference) real).setEntryValues(arg0);
    }

    public void setEntryValues(int arg0) {
        ((android.preference.ListPreference) real).setEntryValues(arg0);
    }

    public void setSummary(java.lang.CharSequence arg0) {
        ((android.preference.ListPreference) real).setSummary(arg0);
    }

    public void setValue(java.lang.String arg0) {
        ((android.preference.ListPreference) real).setValue(arg0);
    }

    public void setValueIndex(int arg0) {
        ((android.preference.ListPreference) real).setValueIndex(arg0);
    }

}
