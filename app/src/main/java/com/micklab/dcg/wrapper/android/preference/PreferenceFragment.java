// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceFragment {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferenceFragment(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceFragment wrap(android.preference.PreferenceFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceFragment(real, (__DcgwBridgeToken) null);
    }

    public android.preference.PreferenceFragment getReal() {
        return (android.preference.PreferenceFragment) real;
    }

    public android.preference.PreferenceFragment unwrap() {
        return getReal();
    }

    public void addPreferencesFromIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.preference.PreferenceFragment) real).addPreferencesFromIntent(arg0 == null ? null : arg0.getReal());
    }

    public void addPreferencesFromResource(int arg0) {
        ((android.preference.PreferenceFragment) real).addPreferencesFromResource(arg0);
    }

    public com.micklab.dcg.wrapper.android.preference.Preference findPreference(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(((android.preference.PreferenceFragment) real).findPreference(arg0));
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceManager getPreferenceManager() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceManager.wrap(((android.preference.PreferenceFragment) real).getPreferenceManager());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceScreen getPreferenceScreen() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceScreen.wrap(((android.preference.PreferenceFragment) real).getPreferenceScreen());
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.preference.PreferenceFragment) real).onActivityCreated(arg0 == null ? null : arg0.getReal());
    }

    public void onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        ((android.preference.PreferenceFragment) real).onActivityResult(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.preference.PreferenceFragment) real).onCreate(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.preference.PreferenceFragment) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void onDestroy() {
        ((android.preference.PreferenceFragment) real).onDestroy();
    }

    public void onDestroyView() {
        ((android.preference.PreferenceFragment) real).onDestroyView();
    }

    public boolean onPreferenceTreeClick(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
        return ((android.preference.PreferenceFragment) real).onPreferenceTreeClick(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.preference.PreferenceFragment) real).onSaveInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public void onStart() {
        ((android.preference.PreferenceFragment) real).onStart();
    }

    public void onStop() {
        ((android.preference.PreferenceFragment) real).onStop();
    }

    public void onViewCreated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.preference.PreferenceFragment) real).onViewCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setPreferenceScreen(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0) {
        ((android.preference.PreferenceFragment) real).setPreferenceScreen(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnPreferenceStartFragmentCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPreferenceStartFragmentCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback wrap(android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback(real, (__DcgwBridgeToken) null);
        }

        public android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback getReal() {
            return (android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback) real;
        }

        public android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback unwrap() {
            return getReal();
        }

        public boolean onPreferenceStartFragment(com.micklab.dcg.wrapper.android.preference.PreferenceFragment arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
            return ((android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback) real).onPreferenceStartFragment(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
