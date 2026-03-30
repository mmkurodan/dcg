// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class AppInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.AppInfo wrap(android.health.connect.datatypes.AppInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.AppInfo(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.AppInfo getReal() {
        return (android.health.connect.datatypes.AppInfo) real;
    }

    public android.health.connect.datatypes.AppInfo unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.health.connect.datatypes.AppInfo) real).getIcon());
    }

    public java.lang.String getName() {
        return ((android.health.connect.datatypes.AppInfo) real).getName();
    }

    public java.lang.String getPackageName() {
        return ((android.health.connect.datatypes.AppInfo) real).getPackageName();
    }

}
