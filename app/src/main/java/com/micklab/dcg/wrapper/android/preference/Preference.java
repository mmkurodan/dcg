// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class Preference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Preference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.Preference wrap(android.preference.Preference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference(real, (__DcgwBridgeToken) null);
    }

    public android.preference.Preference getReal() {
        return (android.preference.Preference) real;
    }

    public android.preference.Preference unwrap() {
        return getReal();
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int compareTo(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        return ((android.preference.Preference) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.preference.Preference) real).getContext());
    }

    public java.lang.String getDependency() {
        return ((android.preference.Preference) real).getDependency();
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor getEditor() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.preference.Preference) real).getEditor());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.preference.Preference) real).getExtras());
    }

    public java.lang.String getFragment() {
        return ((android.preference.Preference) real).getFragment();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.preference.Preference) real).getIcon());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.preference.Preference) real).getIntent());
    }

    public java.lang.String getKey() {
        return ((android.preference.Preference) real).getKey();
    }

    public int getLayoutResource() {
        return ((android.preference.Preference) real).getLayoutResource();
    }

    public com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener.wrap(((android.preference.Preference) real).getOnPreferenceChangeListener());
    }

    public com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() {
        return com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener.wrap(((android.preference.Preference) real).getOnPreferenceClickListener());
    }

    public int getOrder() {
        return ((android.preference.Preference) real).getOrder();
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceGroup getParent() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceGroup.wrap(((android.preference.Preference) real).getParent());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceDataStore getPreferenceDataStore() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceDataStore.wrap(((android.preference.Preference) real).getPreferenceDataStore());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceManager getPreferenceManager() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceManager.wrap(((android.preference.Preference) real).getPreferenceManager());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getSharedPreferences() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(((android.preference.Preference) real).getSharedPreferences());
    }

    public boolean getShouldDisableView() {
        return ((android.preference.Preference) real).getShouldDisableView();
    }

    public java.lang.CharSequence getSummary() {
        return ((android.preference.Preference) real).getSummary();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.preference.Preference) real).getTitle();
    }

    public int getTitleRes() {
        return ((android.preference.Preference) real).getTitleRes();
    }

    public com.micklab.dcg.wrapper.android.view.View getView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.preference.Preference) real).getView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public int getWidgetLayoutResource() {
        return ((android.preference.Preference) real).getWidgetLayoutResource();
    }

    public boolean hasKey() {
        return ((android.preference.Preference) real).hasKey();
    }

    public boolean isEnabled() {
        return ((android.preference.Preference) real).isEnabled();
    }

    public boolean isIconSpaceReserved() {
        return ((android.preference.Preference) real).isIconSpaceReserved();
    }

    public boolean isPersistent() {
        return ((android.preference.Preference) real).isPersistent();
    }

    public boolean isRecycleEnabled() {
        return ((android.preference.Preference) real).isRecycleEnabled();
    }

    public boolean isSelectable() {
        return ((android.preference.Preference) real).isSelectable();
    }

    public boolean isSingleLineTitle() {
        return ((android.preference.Preference) real).isSingleLineTitle();
    }

    public void notifyDependencyChange(boolean arg0) {
        ((android.preference.Preference) real).notifyDependencyChange(arg0);
    }

    public void onDependencyChanged(com.micklab.dcg.wrapper.android.preference.Preference arg0, boolean arg1) {
        ((android.preference.Preference) real).onDependencyChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onParentChanged(com.micklab.dcg.wrapper.android.preference.Preference arg0, boolean arg1) {
        ((android.preference.Preference) real).onParentChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle peekExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.preference.Preference) real).peekExtras());
    }

    public void restoreHierarchyState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.preference.Preference) real).restoreHierarchyState(arg0 == null ? null : arg0.getReal());
    }

    public void saveHierarchyState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.preference.Preference) real).saveHierarchyState(arg0 == null ? null : arg0.getReal());
    }

    public void setDefaultValue(java.lang.Object arg0) {
        ((android.preference.Preference) real).setDefaultValue(arg0);
    }

    public void setDependency(java.lang.String arg0) {
        ((android.preference.Preference) real).setDependency(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.preference.Preference) real).setEnabled(arg0);
    }

    public void setFragment(java.lang.String arg0) {
        ((android.preference.Preference) real).setFragment(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.preference.Preference) real).setIcon(arg0 == null ? null : arg0.getReal());
    }

    public void setIcon(int arg0) {
        ((android.preference.Preference) real).setIcon(arg0);
    }

    public void setIconSpaceReserved(boolean arg0) {
        ((android.preference.Preference) real).setIconSpaceReserved(arg0);
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.preference.Preference) real).setIntent(arg0 == null ? null : arg0.getReal());
    }

    public void setKey(java.lang.String arg0) {
        ((android.preference.Preference) real).setKey(arg0);
    }

    public void setLayoutResource(int arg0) {
        ((android.preference.Preference) real).setLayoutResource(arg0);
    }

    public void setOnPreferenceChangeListener(com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener arg0) {
        ((android.preference.Preference) real).setOnPreferenceChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnPreferenceClickListener(com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener arg0) {
        ((android.preference.Preference) real).setOnPreferenceClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOrder(int arg0) {
        ((android.preference.Preference) real).setOrder(arg0);
    }

    public void setPersistent(boolean arg0) {
        ((android.preference.Preference) real).setPersistent(arg0);
    }

    public void setPreferenceDataStore(com.micklab.dcg.wrapper.android.preference.PreferenceDataStore arg0) {
        ((android.preference.Preference) real).setPreferenceDataStore(arg0 == null ? null : arg0.getReal());
    }

    public void setRecycleEnabled(boolean arg0) {
        ((android.preference.Preference) real).setRecycleEnabled(arg0);
    }

    public void setSelectable(boolean arg0) {
        ((android.preference.Preference) real).setSelectable(arg0);
    }

    public void setShouldDisableView(boolean arg0) {
        ((android.preference.Preference) real).setShouldDisableView(arg0);
    }

    public void setSingleLineTitle(boolean arg0) {
        ((android.preference.Preference) real).setSingleLineTitle(arg0);
    }

    public void setSummary(java.lang.CharSequence arg0) {
        ((android.preference.Preference) real).setSummary(arg0);
    }

    public void setSummary(int arg0) {
        ((android.preference.Preference) real).setSummary(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        ((android.preference.Preference) real).setTitle(arg0);
    }

    public void setTitle(int arg0) {
        ((android.preference.Preference) real).setTitle(arg0);
    }

    public void setWidgetLayoutResource(int arg0) {
        ((android.preference.Preference) real).setWidgetLayoutResource(arg0);
    }

    public boolean shouldCommit() {
        return ((android.preference.Preference) real).shouldCommit();
    }

    public boolean shouldDisableDependents() {
        return ((android.preference.Preference) real).shouldDisableDependents();
    }

    public java.lang.String toString() {
        return ((android.preference.Preference) real).toString();
    }

    public static final int DEFAULT_ORDER = android.preference.Preference.DEFAULT_ORDER;

    public static final class BaseSavedState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BaseSavedState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.Preference.BaseSavedState wrap(android.preference.Preference.BaseSavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference.BaseSavedState(real, (__DcgwBridgeToken) null);
        }

        public android.preference.Preference.BaseSavedState getReal() {
            return (android.preference.Preference.BaseSavedState) real;
        }

        public android.preference.Preference.BaseSavedState unwrap() {
            return getReal();
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.preference.Preference.BaseSavedState(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
            this(new android.preference.Preference.BaseSavedState(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }


    }
    public static final class OnPreferenceChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPreferenceChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener wrap(android.preference.Preference.OnPreferenceChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.preference.Preference.OnPreferenceChangeListener getReal() {
            return (android.preference.Preference.OnPreferenceChangeListener) real;
        }

        public android.preference.Preference.OnPreferenceChangeListener unwrap() {
            return getReal();
        }

        public boolean onPreferenceChange(com.micklab.dcg.wrapper.android.preference.Preference arg0, java.lang.Object arg1) {
            return ((android.preference.Preference.OnPreferenceChangeListener) real).onPreferenceChange(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class OnPreferenceClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPreferenceClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener wrap(android.preference.Preference.OnPreferenceClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.preference.Preference.OnPreferenceClickListener getReal() {
            return (android.preference.Preference.OnPreferenceClickListener) real;
        }

        public android.preference.Preference.OnPreferenceClickListener unwrap() {
            return getReal();
        }

        public boolean onPreferenceClick(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
            return ((android.preference.Preference.OnPreferenceClickListener) real).onPreferenceClick(arg0 == null ? null : arg0.getReal());
        }

    }
}
