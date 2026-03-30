// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class AppInfo {
    private final android.health.connect.datatypes.AppInfo real;

    public AppInfo(android.health.connect.datatypes.AppInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.AppInfo wrap(android.health.connect.datatypes.AppInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.AppInfo(real);
    }

    public android.health.connect.datatypes.AppInfo unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getIcon());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

}
