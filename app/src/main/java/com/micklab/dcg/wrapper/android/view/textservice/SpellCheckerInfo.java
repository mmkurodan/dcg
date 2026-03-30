// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SpellCheckerInfo {
    private final android.view.textservice.SpellCheckerInfo real;

    public SpellCheckerInfo(android.view.textservice.SpellCheckerInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo wrap(android.view.textservice.SpellCheckerInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo(real);
    }

    public android.view.textservice.SpellCheckerInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponent());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(real.getServiceInfo());
    }

    public java.lang.String getSettingsActivity() {
        return real.getSettingsActivity();
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype getSubtypeAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSubtype.wrap(real.getSubtypeAt(arg0));
    }

    public int getSubtypeCount() {
        return real.getSubtypeCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return real.loadLabel(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
