// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceActivity {
    private final android.preference.PreferenceActivity real;

    public PreferenceActivity(android.preference.PreferenceActivity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceActivity wrap(android.preference.PreferenceActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceActivity(real);
    }

    public android.preference.PreferenceActivity unwrap() {
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

    public void finishPreferencePanel(com.micklab.dcg.wrapper.android.app.Fragment arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        real.finishPreferencePanel(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceManager getPreferenceManager() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceManager.wrap(real.getPreferenceManager());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceScreen getPreferenceScreen() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceScreen.wrap(real.getPreferenceScreen());
    }

    public boolean hasHeaders() {
        return real.hasHeaders();
    }

    public void invalidateHeaders() {
        real.invalidateHeaders();
    }

    public boolean isMultiPane() {
        return real.isMultiPane();
    }

    public void onBackPressed() {
        real.onBackPressed();
    }

    public com.micklab.dcg.wrapper.android.content.Intent onBuildStartFragmentIntent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.onBuildStartFragmentIntent(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void onContentChanged() {
        real.onContentChanged();
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header onGetInitialHeader() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header.wrap(real.onGetInitialHeader());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header onGetNewHeader() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header.wrap(real.onGetNewHeader());
    }

    public void onHeaderClick(com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header arg0, int arg1) {
        real.onHeaderClick(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean onIsHidingHeaders() {
        return real.onIsHidingHeaders();
    }

    public boolean onIsMultiPane() {
        return real.onIsMultiPane();
    }

    public boolean onOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return real.onOptionsItemSelected(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onPreferenceStartFragment(com.micklab.dcg.wrapper.android.preference.PreferenceFragment arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
        return real.onPreferenceStartFragment(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean onPreferenceTreeClick(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
        return real.onPreferenceTreeClick(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setListFooter(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setListFooter(arg0 == null ? null : arg0.unwrap());
    }

    public void setParentTitle(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.view.View.OnClickListener arg2) {
        real.setParentTitle(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setPreferenceScreen(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0) {
        real.setPreferenceScreen(arg0 == null ? null : arg0.unwrap());
    }

    public void showBreadCrumbs(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        real.showBreadCrumbs(arg0, arg1);
    }

    public void startPreferenceFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, boolean arg1) {
        real.startPreferenceFragment(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void startPreferencePanel(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, int arg2, java.lang.CharSequence arg3, com.micklab.dcg.wrapper.android.app.Fragment arg4, int arg5) {
        real.startPreferencePanel(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void startWithFragment(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.app.Fragment arg2, int arg3) {
        real.startWithFragment(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void startWithFragment(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.app.Fragment arg2, int arg3, int arg4, int arg5) {
        real.startWithFragment(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5);
    }

    public void switchToHeader(com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header arg0) {
        real.switchToHeader(arg0 == null ? null : arg0.unwrap());
    }

    public void switchToHeader(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.switchToHeader(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final java.lang.String EXTRA_NO_HEADERS = android.preference.PreferenceActivity.EXTRA_NO_HEADERS;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGUMENTS = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT_ARGUMENTS;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT_SHORT_TITLE;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_TITLE = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT_TITLE;
    public static final long HEADER_ID_UNDEFINED = android.preference.PreferenceActivity.HEADER_ID_UNDEFINED;

    public static final class Header {
        private final android.preference.PreferenceActivity.Header real;

        public Header(android.preference.PreferenceActivity.Header real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header wrap(android.preference.PreferenceActivity.Header real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header(real);
        }

        public android.preference.PreferenceActivity.Header unwrap() {
            return real;
        }

        public Header() {
            this(new android.preference.PreferenceActivity.Header());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.CharSequence getBreadCrumbShortTitle(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return real.getBreadCrumbShortTitle(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.CharSequence getBreadCrumbTitle(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return real.getBreadCrumbTitle(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.CharSequence getSummary(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return real.getSummary(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.CharSequence getTitle(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return real.getTitle(arg0 == null ? null : arg0.unwrap());
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            real.readFromParcel(arg0 == null ? null : arg0.unwrap());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
