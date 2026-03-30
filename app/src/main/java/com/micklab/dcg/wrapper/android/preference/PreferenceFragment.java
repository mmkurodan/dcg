// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceFragment {
    private final android.preference.PreferenceFragment real;

    public PreferenceFragment(android.preference.PreferenceFragment real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceFragment wrap(android.preference.PreferenceFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceFragment(real);
    }

    public android.preference.PreferenceFragment unwrap() {
        return real;
    }

    public void addPreferencesFromIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.addPreferencesFromIntent(arg0 == null ? null : arg0.unwrap());
    }

    public void addPreferencesFromResource(int arg0) {
        real.addPreferencesFromResource(arg0);
    }

    public com.micklab.dcg.wrapper.android.preference.Preference findPreference(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(real.findPreference(arg0));
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceManager getPreferenceManager() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceManager.wrap(real.getPreferenceManager());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceScreen getPreferenceScreen() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceScreen.wrap(real.getPreferenceScreen());
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onActivityCreated(arg0 == null ? null : arg0.unwrap());
    }

    public void onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        real.onActivityResult(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onCreate(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onDestroyView() {
        real.onDestroyView();
    }

    public boolean onPreferenceTreeClick(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
        return real.onPreferenceTreeClick(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onSaveInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public void onStart() {
        real.onStart();
    }

    public void onStop() {
        real.onStop();
    }

    public void onViewCreated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onViewCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setPreferenceScreen(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0) {
        real.setPreferenceScreen(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnPreferenceStartFragmentCallback {
        private final android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback real;

        public OnPreferenceStartFragmentCallback(android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback wrap(android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback(real);
        }

        public android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback unwrap() {
            return real;
        }

        public boolean onPreferenceStartFragment(com.micklab.dcg.wrapper.android.preference.PreferenceFragment arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
            return real.onPreferenceStartFragment(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
