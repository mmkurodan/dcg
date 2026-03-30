// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DevicePolicyResourcesManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DevicePolicyResourcesManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResourcesManager wrap(android.app.admin.DevicePolicyResourcesManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResourcesManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.DevicePolicyResourcesManager getReal() {
        return (android.app.admin.DevicePolicyResourcesManager) real;
    }

    public android.app.admin.DevicePolicyResourcesManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getDrawableAsIcon(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg2) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.admin.DevicePolicyResourcesManager) real).getDrawableAsIcon(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getDrawableAsIcon(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg3) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.app.admin.DevicePolicyResourcesManager) real).getDrawableAsIcon(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

}
