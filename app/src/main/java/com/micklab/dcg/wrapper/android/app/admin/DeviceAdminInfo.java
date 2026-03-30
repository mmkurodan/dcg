// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DeviceAdminInfo {
    private final android.app.admin.DeviceAdminInfo real;

    public DeviceAdminInfo(android.app.admin.DeviceAdminInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DeviceAdminInfo wrap(android.app.admin.DeviceAdminInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DeviceAdminInfo(real);
    }

    public android.app.admin.DeviceAdminInfo unwrap() {
        return real;
    }

    public DeviceAdminInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ResolveInfo arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        this(new android.app.admin.DeviceAdminInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.pm.ActivityInfo getActivityInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ActivityInfo.wrap(real.getActivityInfo());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponent());
    }

    public int getHeadlessDeviceOwnerMode() {
        return real.getHeadlessDeviceOwnerMode();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public java.lang.String getReceiverName() {
        return real.getReceiverName();
    }

    public java.lang.String getTagForPolicy(int arg0) {
        return real.getTagForPolicy(arg0);
    }

    public boolean isVisible() {
        return real.isVisible();
    }

    public java.lang.CharSequence loadDescription(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return real.loadDescription(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return real.loadLabel(arg0 == null ? null : arg0.unwrap());
    }

    public boolean supportsTransferOwnership() {
        return real.supportsTransferOwnership();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public boolean usesPolicy(int arg0) {
        return real.usesPolicy(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int HEADLESS_DEVICE_OWNER_MODE_AFFILIATED = android.app.admin.DeviceAdminInfo.HEADLESS_DEVICE_OWNER_MODE_AFFILIATED;
    public static final int HEADLESS_DEVICE_OWNER_MODE_SINGLE_USER = android.app.admin.DeviceAdminInfo.HEADLESS_DEVICE_OWNER_MODE_SINGLE_USER;
    public static final int HEADLESS_DEVICE_OWNER_MODE_UNSUPPORTED = android.app.admin.DeviceAdminInfo.HEADLESS_DEVICE_OWNER_MODE_UNSUPPORTED;
    public static final int USES_ENCRYPTED_STORAGE = android.app.admin.DeviceAdminInfo.USES_ENCRYPTED_STORAGE;
    public static final int USES_POLICY_DISABLE_CAMERA = android.app.admin.DeviceAdminInfo.USES_POLICY_DISABLE_CAMERA;
    public static final int USES_POLICY_DISABLE_KEYGUARD_FEATURES = android.app.admin.DeviceAdminInfo.USES_POLICY_DISABLE_KEYGUARD_FEATURES;
    public static final int USES_POLICY_EXPIRE_PASSWORD = android.app.admin.DeviceAdminInfo.USES_POLICY_EXPIRE_PASSWORD;
    public static final int USES_POLICY_FORCE_LOCK = android.app.admin.DeviceAdminInfo.USES_POLICY_FORCE_LOCK;
    public static final int USES_POLICY_LIMIT_PASSWORD = android.app.admin.DeviceAdminInfo.USES_POLICY_LIMIT_PASSWORD;
    public static final int USES_POLICY_RESET_PASSWORD = android.app.admin.DeviceAdminInfo.USES_POLICY_RESET_PASSWORD;
    public static final int USES_POLICY_WATCH_LOGIN = android.app.admin.DeviceAdminInfo.USES_POLICY_WATCH_LOGIN;
    public static final int USES_POLICY_WIPE_DATA = android.app.admin.DeviceAdminInfo.USES_POLICY_WIPE_DATA;

}
