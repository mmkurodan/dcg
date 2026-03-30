// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class MultiSelectListPreference {
    private final android.preference.MultiSelectListPreference real;

    public MultiSelectListPreference(android.preference.MultiSelectListPreference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.MultiSelectListPreference wrap(android.preference.MultiSelectListPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.MultiSelectListPreference(real);
    }

    public android.preference.MultiSelectListPreference unwrap() {
        return real;
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.unwrap()));
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public MultiSelectListPreference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.MultiSelectListPreference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public int findIndexOfValue(java.lang.String arg0) {
        return real.findIndexOfValue(arg0);
    }

    public java.lang.CharSequence[] getEntries() {
        return real.getEntries();
    }

    public java.lang.CharSequence[] getEntryValues() {
        return real.getEntryValues();
    }

    public void setEntries(java.lang.CharSequence[] arg0) {
        real.setEntries(arg0);
    }

    public void setEntries(int arg0) {
        real.setEntries(arg0);
    }

    public void setEntryValues(int arg0) {
        real.setEntryValues(arg0);
    }

    public void setEntryValues(java.lang.CharSequence[] arg0) {
        real.setEntryValues(arg0);
    }

}
