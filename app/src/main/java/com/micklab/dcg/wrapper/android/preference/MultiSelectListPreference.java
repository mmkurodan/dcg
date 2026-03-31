// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class MultiSelectListPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MultiSelectListPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.MultiSelectListPreference wrap(android.preference.MultiSelectListPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.MultiSelectListPreference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.MultiSelectListPreference getReal() {
        return (android.preference.MultiSelectListPreference) real;
    }

    public android.preference.MultiSelectListPreference unwrap() {
        return getReal();
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int findIndexOfValue(java.lang.String arg0) {
        return ((android.preference.MultiSelectListPreference) real).findIndexOfValue(arg0);
    }

    public java.lang.CharSequence[] getEntries() {
        return ((android.preference.MultiSelectListPreference) real).getEntries();
    }

    public java.lang.CharSequence[] getEntryValues() {
        return ((android.preference.MultiSelectListPreference) real).getEntryValues();
    }

    public void setEntries(java.lang.CharSequence[] arg0) {
        ((android.preference.MultiSelectListPreference) real).setEntries(arg0);
    }

    public void setEntries(int arg0) {
        ((android.preference.MultiSelectListPreference) real).setEntries(arg0);
    }

    public void setEntryValues(java.lang.CharSequence[] arg0) {
        ((android.preference.MultiSelectListPreference) real).setEntryValues(arg0);
    }

    public void setEntryValues(int arg0) {
        ((android.preference.MultiSelectListPreference) real).setEntryValues(arg0);
    }

}
