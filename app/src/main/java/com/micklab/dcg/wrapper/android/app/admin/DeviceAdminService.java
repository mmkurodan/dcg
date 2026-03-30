// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DeviceAdminService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceAdminService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DeviceAdminService wrap(android.app.admin.DeviceAdminService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DeviceAdminService(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.DeviceAdminService getReal() {
        return (android.app.admin.DeviceAdminService) real;
    }

    public android.app.admin.DeviceAdminService unwrap() {
        return getReal();
    }

    public DeviceAdminService() {
        this(new android.app.admin.DeviceAdminService(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.admin.DeviceAdminService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

}
