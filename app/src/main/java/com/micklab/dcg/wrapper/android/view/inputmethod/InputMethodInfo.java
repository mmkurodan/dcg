// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodInfo {
    private final android.view.inputmethod.InputMethodInfo real;

    public InputMethodInfo(android.view.inputmethod.InputMethodInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo wrap(android.view.inputmethod.InputMethodInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo(real);
    }

    public android.view.inputmethod.InputMethodInfo unwrap() {
        return real;
    }

    public InputMethodInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ResolveInfo arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        this(new android.view.inputmethod.InputMethodInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public InputMethodInfo(java.lang.String arg0, java.lang.String arg1, java.lang.CharSequence arg2, java.lang.String arg3) {
        this(new android.view.inputmethod.InputMethodInfo(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.content.Intent createStylusHandwritingSettingsActivityIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createStylusHandwritingSettingsActivityIntent());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponent());
    }

    public int getConfigChanges() {
        return real.getConfigChanges();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public int getIsDefaultResourceId() {
        return real.getIsDefaultResourceId();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(real.getServiceInfo());
    }

    public java.lang.String getServiceName() {
        return real.getServiceName();
    }

    public java.lang.String getSettingsActivity() {
        return real.getSettingsActivity();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype getSubtypeAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(real.getSubtypeAt(arg0));
    }

    public int getSubtypeCount() {
        return real.getSubtypeCount();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return real.loadLabel(arg0 == null ? null : arg0.unwrap());
    }

    public boolean shouldShowInInputMethodPicker() {
        return real.shouldShowInInputMethodPicker();
    }

    public boolean supportsConnectionlessStylusHandwriting() {
        return real.supportsConnectionlessStylusHandwriting();
    }

    public boolean supportsStylusHandwriting() {
        return real.supportsStylusHandwriting();
    }

    public boolean suppressesSpellChecker() {
        return real.suppressesSpellChecker();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String ACTION_STYLUS_HANDWRITING_SETTINGS = android.view.inputmethod.InputMethodInfo.ACTION_STYLUS_HANDWRITING_SETTINGS;

}
