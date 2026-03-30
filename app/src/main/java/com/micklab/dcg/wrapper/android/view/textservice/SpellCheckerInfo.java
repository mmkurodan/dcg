// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SpellCheckerInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpellCheckerInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo wrap(android.view.textservice.SpellCheckerInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.textservice.SpellCheckerInfo getReal() {
        return (android.view.textservice.SpellCheckerInfo) real;
    }

    public android.view.textservice.SpellCheckerInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textservice.SpellCheckerInfo) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.view.textservice.SpellCheckerInfo) real).getComponent());
    }

    public java.lang.String getId() {
        return ((android.view.textservice.SpellCheckerInfo) real).getId();
    }

    public java.lang.String getPackageName() {
        return ((android.view.textservice.SpellCheckerInfo) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(((android.view.textservice.SpellCheckerInfo) real).getServiceInfo());
    }

    public java.lang.String getSettingsActivity() {
        return ((android.view.textservice.SpellCheckerInfo) real).getSettingsActivity();
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype getSubtypeAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype.wrap(((android.view.textservice.SpellCheckerInfo) real).getSubtypeAt(arg0));
    }

    public int getSubtypeCount() {
        return ((android.view.textservice.SpellCheckerInfo) real).getSubtypeCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.textservice.SpellCheckerInfo) real).loadIcon(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return ((android.view.textservice.SpellCheckerInfo) real).loadLabel(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textservice.SpellCheckerInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
