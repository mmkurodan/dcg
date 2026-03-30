// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class Preference {
    private final android.preference.Preference real;

    public Preference(android.preference.Preference real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.Preference wrap(android.preference.Preference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference(real);
    }

    public android.preference.Preference unwrap() {
        return real;
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.unwrap()));
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public Preference(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.preference.Preference(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public int compareTo(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public java.lang.String getDependency() {
        return real.getDependency();
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor getEditor() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.getEditor());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.String getFragment() {
        return real.getFragment();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getIcon());
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public int getLayoutResource() {
        return real.getLayoutResource();
    }

    public com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener.wrap(real.getOnPreferenceChangeListener());
    }

    public com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() {
        return com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener.wrap(real.getOnPreferenceClickListener());
    }

    public int getOrder() {
        return real.getOrder();
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceGroup getParent() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceGroup.wrap(real.getParent());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceDataStore getPreferenceDataStore() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceDataStore.wrap(real.getPreferenceDataStore());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceManager getPreferenceManager() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceManager.wrap(real.getPreferenceManager());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getSharedPreferences() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(real.getSharedPreferences());
    }

    public boolean getShouldDisableView() {
        return real.getShouldDisableView();
    }

    public java.lang.CharSequence getSummary() {
        return real.getSummary();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public int getTitleRes() {
        return real.getTitleRes();
    }

    public com.micklab.dcg.wrapper.android.view.View getView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int getWidgetLayoutResource() {
        return real.getWidgetLayoutResource();
    }

    public boolean hasKey() {
        return real.hasKey();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isIconSpaceReserved() {
        return real.isIconSpaceReserved();
    }

    public boolean isPersistent() {
        return real.isPersistent();
    }

    public boolean isRecycleEnabled() {
        return real.isRecycleEnabled();
    }

    public boolean isSelectable() {
        return real.isSelectable();
    }

    public boolean isSingleLineTitle() {
        return real.isSingleLineTitle();
    }

    public void notifyDependencyChange(boolean arg0) {
        real.notifyDependencyChange(arg0);
    }

    public void onDependencyChanged(com.micklab.dcg.wrapper.android.preference.Preference arg0, boolean arg1) {
        real.onDependencyChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onParentChanged(com.micklab.dcg.wrapper.android.preference.Preference arg0, boolean arg1) {
        real.onParentChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle peekExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.peekExtras());
    }

    public void restoreHierarchyState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.restoreHierarchyState(arg0 == null ? null : arg0.unwrap());
    }

    public void saveHierarchyState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.saveHierarchyState(arg0 == null ? null : arg0.unwrap());
    }

    public void setDefaultValue(java.lang.Object arg0) {
        real.setDefaultValue(arg0);
    }

    public void setDependency(java.lang.String arg0) {
        real.setDependency(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setFragment(java.lang.String arg0) {
        real.setFragment(arg0);
    }

    public void setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setIcon(int arg0) {
        real.setIcon(arg0);
    }

    public void setIconSpaceReserved(boolean arg0) {
        real.setIconSpaceReserved(arg0);
    }

    public void setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setIntent(arg0 == null ? null : arg0.unwrap());
    }

    public void setKey(java.lang.String arg0) {
        real.setKey(arg0);
    }

    public void setLayoutResource(int arg0) {
        real.setLayoutResource(arg0);
    }

    public void setOnPreferenceChangeListener(com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener arg0) {
        real.setOnPreferenceChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnPreferenceClickListener(com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener arg0) {
        real.setOnPreferenceClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOrder(int arg0) {
        real.setOrder(arg0);
    }

    public void setPersistent(boolean arg0) {
        real.setPersistent(arg0);
    }

    public void setPreferenceDataStore(com.micklab.dcg.wrapper.android.preference.PreferenceDataStore arg0) {
        real.setPreferenceDataStore(arg0 == null ? null : arg0.unwrap());
    }

    public void setRecycleEnabled(boolean arg0) {
        real.setRecycleEnabled(arg0);
    }

    public void setSelectable(boolean arg0) {
        real.setSelectable(arg0);
    }

    public void setShouldDisableView(boolean arg0) {
        real.setShouldDisableView(arg0);
    }

    public void setSingleLineTitle(boolean arg0) {
        real.setSingleLineTitle(arg0);
    }

    public void setSummary(java.lang.CharSequence arg0) {
        real.setSummary(arg0);
    }

    public void setSummary(int arg0) {
        real.setSummary(arg0);
    }

    public void setTitle(java.lang.CharSequence arg0) {
        real.setTitle(arg0);
    }

    public void setTitle(int arg0) {
        real.setTitle(arg0);
    }

    public void setWidgetLayoutResource(int arg0) {
        real.setWidgetLayoutResource(arg0);
    }

    public boolean shouldCommit() {
        return real.shouldCommit();
    }

    public boolean shouldDisableDependents() {
        return real.shouldDisableDependents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int DEFAULT_ORDER = android.preference.Preference.DEFAULT_ORDER;

    public static final class BaseSavedState {
        private final android.preference.Preference.BaseSavedState real;

        public BaseSavedState(android.preference.Preference.BaseSavedState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.Preference.BaseSavedState wrap(android.preference.Preference.BaseSavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference.BaseSavedState(real);
        }

        public android.preference.Preference.BaseSavedState unwrap() {
            return real;
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.preference.Preference.BaseSavedState(arg0 == null ? null : arg0.unwrap()));
        }

        public BaseSavedState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
            this(new android.preference.Preference.BaseSavedState(arg0 == null ? null : arg0.unwrap()));
        }


    }
    public static final class OnPreferenceChangeListener {
        private final android.preference.Preference.OnPreferenceChangeListener real;

        public OnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener wrap(android.preference.Preference.OnPreferenceChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceChangeListener(real);
        }

        public android.preference.Preference.OnPreferenceChangeListener unwrap() {
            return real;
        }

        public boolean onPreferenceChange(com.micklab.dcg.wrapper.android.preference.Preference arg0, java.lang.Object arg1) {
            return real.onPreferenceChange(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class OnPreferenceClickListener {
        private final android.preference.Preference.OnPreferenceClickListener real;

        public OnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener wrap(android.preference.Preference.OnPreferenceClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.Preference.OnPreferenceClickListener(real);
        }

        public android.preference.Preference.OnPreferenceClickListener unwrap() {
            return real;
        }

        public boolean onPreferenceClick(com.micklab.dcg.wrapper.android.preference.Preference arg0) {
            return real.onPreferenceClick(arg0 == null ? null : arg0.unwrap());
        }

    }
}
