// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DevicePolicyResourcesManager {
    private final android.app.admin.DevicePolicyResourcesManager real;

    public DevicePolicyResourcesManager(android.app.admin.DevicePolicyResourcesManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResourcesManager wrap(android.app.admin.DevicePolicyResourcesManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResourcesManager(real);
    }

    public android.app.admin.DevicePolicyResourcesManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getDrawableAsIcon(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getDrawableAsIcon(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getDrawableAsIcon(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg3) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getDrawableAsIcon(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

}
