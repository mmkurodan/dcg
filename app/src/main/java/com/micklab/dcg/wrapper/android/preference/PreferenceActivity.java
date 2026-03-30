// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferenceActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceActivity wrap(android.preference.PreferenceActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceActivity(real, (__DcgwBridgeToken) null);
    }

    public android.preference.PreferenceActivity getReal() {
        return (android.preference.PreferenceActivity) real;
    }

    public android.preference.PreferenceActivity unwrap() {
        return getReal();
    }

    public void addPreferencesFromIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.preference.PreferenceActivity) real).addPreferencesFromIntent(arg0 == null ? null : arg0.getReal());
    }

    public void addPreferencesFromResource(int arg0) {
        ((android.preference.PreferenceActivity) real).addPreferencesFromResource(arg0);
    }

    public com.micklab.dcg.wrapper.android.preference.Preference findPreference(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(((android.preference.PreferenceActivity) real).findPreference(arg0));
    }

    public void finishPreferencePanel(com.micklab.dcg.wrapper.android.app.Fragment arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        ((android.preference.PreferenceActivity) real).finishPreferencePanel(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceManager getPreferenceManager() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceManager.wrap(((android.preference.PreferenceActivity) real).getPreferenceManager());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceScreen getPreferenceScreen() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceScreen.wrap(((android.preference.PreferenceActivity) real).getPreferenceScreen());
    }

    public boolean hasHeaders() {
        return ((android.preference.PreferenceActivity) real).hasHeaders();
    }

    public void invalidateHeaders() {
        ((android.preference.PreferenceActivity) real).invalidateHeaders();
    }

    public boolean isMultiPane() {
        return ((android.preference.PreferenceActivity) real).isMultiPane();
    }

    public void onBackPressed() {
        ((android.preference.PreferenceActivity) real).onBackPressed();
    }

    public com.micklab.dcg.wrapper.android.content.Intent onBuildStartFragmentIntent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.preference.PreferenceActivity) real).onBuildStartFragmentIntent(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3));
    }

    public void onContentChanged() {
        ((android.preference.PreferenceActivity) real).onContentChanged();
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header onGetInitialHeader() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header.wrap(((android.preference.PreferenceActivity) real).onGetInitialHeader());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header onGetNewHeader() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header.wrap(((android.preference.PreferenceActivity) real).onGetNewHeader());
    }

    public void onHeaderClick(com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header arg0, int arg1) {
        ((android.preference.PreferenceActivity) real).onHeaderClick(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean onIsHidingHeaders() {
        return ((android.preference.PreferenceActivity) real).onIsHidingHeaders();
    }

    public boolean onIsMultiPane() {
        return ((android.preference.PreferenceActivity) real).onIsMultiPane();
    }

    public boolean onOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.preference.PreferenceActivity) real).onOptionsItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public boolean onPreferenceStartFragment(com.micklab.dcg.wrapper.android.preference.PreferenceFragment arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
        return ((android.preference.PreferenceActivity) real).onPreferenceStartFragment(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onPreferenceTreeClick(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0, com.micklab.dcg.wrapper.android.preference.Preference arg1) {
        return ((android.preference.PreferenceActivity) real).onPreferenceTreeClick(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setListFooter(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.preference.PreferenceActivity) real).setListFooter(arg0 == null ? null : arg0.getReal());
    }

    public void setParentTitle(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.view.View.OnClickListener arg2) {
        ((android.preference.PreferenceActivity) real).setParentTitle(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setPreferenceScreen(com.micklab.dcg.wrapper.android.preference.PreferenceScreen arg0) {
        ((android.preference.PreferenceActivity) real).setPreferenceScreen(arg0 == null ? null : arg0.getReal());
    }

    public void showBreadCrumbs(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        ((android.preference.PreferenceActivity) real).showBreadCrumbs(arg0, arg1);
    }

    public void startPreferenceFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, boolean arg1) {
        ((android.preference.PreferenceActivity) real).startPreferenceFragment(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void startPreferencePanel(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, int arg2, java.lang.CharSequence arg3, com.micklab.dcg.wrapper.android.app.Fragment arg4, int arg5) {
        ((android.preference.PreferenceActivity) real).startPreferencePanel(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void startWithFragment(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.app.Fragment arg2, int arg3) {
        ((android.preference.PreferenceActivity) real).startWithFragment(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void startWithFragment(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.app.Fragment arg2, int arg3, int arg4, int arg5) {
        ((android.preference.PreferenceActivity) real).startWithFragment(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5);
    }

    public void switchToHeader(com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header arg0) {
        ((android.preference.PreferenceActivity) real).switchToHeader(arg0 == null ? null : arg0.getReal());
    }

    public void switchToHeader(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.preference.PreferenceActivity) real).switchToHeader(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final java.lang.String EXTRA_NO_HEADERS = android.preference.PreferenceActivity.EXTRA_NO_HEADERS;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGUMENTS = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT_ARGUMENTS;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT_SHORT_TITLE;
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_TITLE = android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT_TITLE;
    public static final long HEADER_ID_UNDEFINED = android.preference.PreferenceActivity.HEADER_ID_UNDEFINED;

    public static final class Header {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Header(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header wrap(android.preference.PreferenceActivity.Header real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceActivity.Header(real, (__DcgwBridgeToken) null);
        }

        public android.preference.PreferenceActivity.Header getReal() {
            return (android.preference.PreferenceActivity.Header) real;
        }

        public android.preference.PreferenceActivity.Header unwrap() {
            return getReal();
        }

        public Header() {
            this(new android.preference.PreferenceActivity.Header(), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.preference.PreferenceActivity.Header) real).describeContents();
        }

        public java.lang.CharSequence getBreadCrumbShortTitle(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return ((android.preference.PreferenceActivity.Header) real).getBreadCrumbShortTitle(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.CharSequence getBreadCrumbTitle(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return ((android.preference.PreferenceActivity.Header) real).getBreadCrumbTitle(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.CharSequence getSummary(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return ((android.preference.PreferenceActivity.Header) real).getSummary(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.CharSequence getTitle(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return ((android.preference.PreferenceActivity.Header) real).getTitle(arg0 == null ? null : arg0.getReal());
        }

        public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            ((android.preference.PreferenceActivity.Header) real).readFromParcel(arg0 == null ? null : arg0.getReal());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.preference.PreferenceActivity.Header) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
