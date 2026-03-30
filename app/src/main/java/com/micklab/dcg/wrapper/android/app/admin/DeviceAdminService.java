// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DeviceAdminService {
    private final android.app.admin.DeviceAdminService real;

    public DeviceAdminService(android.app.admin.DeviceAdminService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DeviceAdminService wrap(android.app.admin.DeviceAdminService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DeviceAdminService(real);
    }

    public android.app.admin.DeviceAdminService unwrap() {
        return real;
    }

    public DeviceAdminService() {
        this(new android.app.admin.DeviceAdminService());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

}
