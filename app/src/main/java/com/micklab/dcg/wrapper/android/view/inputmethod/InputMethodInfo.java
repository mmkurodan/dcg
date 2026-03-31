// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputMethodInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo wrap(android.view.inputmethod.InputMethodInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputMethodInfo getReal() {
        return (android.view.inputmethod.InputMethodInfo) real;
    }

    public android.view.inputmethod.InputMethodInfo unwrap() {
        return getReal();
    }

    public InputMethodInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ResolveInfo arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        this(new android.view.inputmethod.InputMethodInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public InputMethodInfo(java.lang.String arg0, java.lang.String arg1, java.lang.CharSequence arg2, java.lang.String arg3) {
        this(new android.view.inputmethod.InputMethodInfo(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.content.Intent createImeLanguageSettingsActivityIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.view.inputmethod.InputMethodInfo) real).createImeLanguageSettingsActivityIntent());
    }

    public com.micklab.dcg.wrapper.android.content.Intent createStylusHandwritingSettingsActivityIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.view.inputmethod.InputMethodInfo) real).createStylusHandwritingSettingsActivityIntent());
    }

    public int describeContents() {
        return ((android.view.inputmethod.InputMethodInfo) real).describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        ((android.view.inputmethod.InputMethodInfo) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InputMethodInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.view.inputmethod.InputMethodInfo) real).getComponent());
    }

    public int getConfigChanges() {
        return ((android.view.inputmethod.InputMethodInfo) real).getConfigChanges();
    }

    public java.lang.String getId() {
        return ((android.view.inputmethod.InputMethodInfo) real).getId();
    }

    public int getIsDefaultResourceId() {
        return ((android.view.inputmethod.InputMethodInfo) real).getIsDefaultResourceId();
    }

    public java.lang.String getPackageName() {
        return ((android.view.inputmethod.InputMethodInfo) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(((android.view.inputmethod.InputMethodInfo) real).getServiceInfo());
    }

    public java.lang.String getServiceName() {
        return ((android.view.inputmethod.InputMethodInfo) real).getServiceName();
    }

    public java.lang.String getSettingsActivity() {
        return ((android.view.inputmethod.InputMethodInfo) real).getSettingsActivity();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype getSubtypeAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(((android.view.inputmethod.InputMethodInfo) real).getSubtypeAt(arg0));
    }

    public int getSubtypeCount() {
        return ((android.view.inputmethod.InputMethodInfo) real).getSubtypeCount();
    }

    public int hashCode() {
        return ((android.view.inputmethod.InputMethodInfo) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.inputmethod.InputMethodInfo) real).loadIcon(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return ((android.view.inputmethod.InputMethodInfo) real).loadLabel(arg0 == null ? null : arg0.getReal());
    }

    public boolean shouldShowInInputMethodPicker() {
        return ((android.view.inputmethod.InputMethodInfo) real).shouldShowInInputMethodPicker();
    }

    public boolean supportsConnectionlessStylusHandwriting() {
        return ((android.view.inputmethod.InputMethodInfo) real).supportsConnectionlessStylusHandwriting();
    }

    public boolean supportsStylusHandwriting() {
        return ((android.view.inputmethod.InputMethodInfo) real).supportsStylusHandwriting();
    }

    public boolean suppressesSpellChecker() {
        return ((android.view.inputmethod.InputMethodInfo) real).suppressesSpellChecker();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.InputMethodInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InputMethodInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String ACTION_IME_LANGUAGE_SETTINGS = android.view.inputmethod.InputMethodInfo.ACTION_IME_LANGUAGE_SETTINGS;
    public static final java.lang.String ACTION_STYLUS_HANDWRITING_SETTINGS = android.view.inputmethod.InputMethodInfo.ACTION_STYLUS_HANDWRITING_SETTINGS;

}
