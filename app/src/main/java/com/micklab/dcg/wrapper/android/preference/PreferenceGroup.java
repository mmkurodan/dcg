// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceGroup {
    private final android.preference.PreferenceGroup real;

    public PreferenceGroup(android.preference.PreferenceGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceGroup wrap(android.preference.PreferenceGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceGroup(real);
    }

    public android.preference.PreferenceGroup unwrap() {
        return real;
    }

    public void addItemFromInflater(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        real.addItemFromInflater(arg0 == null ? null : arg0.unwrap());
    }

    public boolean addPreference(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        return real.addPreference(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.preference.Preference findPreference(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(real.findPreference(arg0));
    }

    public com.micklab.dcg.wrapper.android.preference.Preference getPreference(int arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(real.getPreference(arg0));
    }

    public int getPreferenceCount() {
        return real.getPreferenceCount();
    }

    public boolean isOrderingAsAdded() {
        return real.isOrderingAsAdded();
    }

    public void notifyDependencyChange(boolean arg0) {
        real.notifyDependencyChange(arg0);
    }

    public void removeAll() {
        real.removeAll();
    }

    public boolean removePreference(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        return real.removePreference(arg0 == null ? null : arg0.unwrap());
    }

    public void setOrderingAsAdded(boolean arg0) {
        real.setOrderingAsAdded(arg0);
    }

}
