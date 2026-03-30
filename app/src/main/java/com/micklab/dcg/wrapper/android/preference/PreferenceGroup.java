// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferenceGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceGroup wrap(android.preference.PreferenceGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceGroup(real, (__DcgwBridgeToken) null);
    }

    public android.preference.PreferenceGroup getReal() {
        return (android.preference.PreferenceGroup) real;
    }

    public android.preference.PreferenceGroup unwrap() {
        return getReal();
    }

    public void addItemFromInflater(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        ((android.preference.PreferenceGroup) real).addItemFromInflater(arg0 == null ? null : arg0.getReal());
    }

    public boolean addPreference(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        return ((android.preference.PreferenceGroup) real).addPreference(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.preference.Preference findPreference(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(((android.preference.PreferenceGroup) real).findPreference(arg0));
    }

    public com.micklab.dcg.wrapper.android.preference.Preference getPreference(int arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(((android.preference.PreferenceGroup) real).getPreference(arg0));
    }

    public int getPreferenceCount() {
        return ((android.preference.PreferenceGroup) real).getPreferenceCount();
    }

    public boolean isOrderingAsAdded() {
        return ((android.preference.PreferenceGroup) real).isOrderingAsAdded();
    }

    public void notifyDependencyChange(boolean arg0) {
        ((android.preference.PreferenceGroup) real).notifyDependencyChange(arg0);
    }

    public void removeAll() {
        ((android.preference.PreferenceGroup) real).removeAll();
    }

    public boolean removePreference(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        return ((android.preference.PreferenceGroup) real).removePreference(arg0 == null ? null : arg0.getReal());
    }

    public void setOrderingAsAdded(boolean arg0) {
        ((android.preference.PreferenceGroup) real).setOrderingAsAdded(arg0);
    }

}
