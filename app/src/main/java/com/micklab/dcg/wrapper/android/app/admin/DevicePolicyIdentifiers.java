// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DevicePolicyIdentifiers {
    private final android.app.admin.DevicePolicyIdentifiers real;

    public DevicePolicyIdentifiers(android.app.admin.DevicePolicyIdentifiers real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DevicePolicyIdentifiers wrap(android.app.admin.DevicePolicyIdentifiers real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DevicePolicyIdentifiers(real);
    }

    public android.app.admin.DevicePolicyIdentifiers unwrap() {
        return real;
    }

    public static java.lang.String getIdentifierForUserRestriction(java.lang.String arg0) {
        return android.app.admin.DevicePolicyIdentifiers.getIdentifierForUserRestriction(arg0);
    }

    public static final java.lang.String ACCOUNT_MANAGEMENT_DISABLED_POLICY = android.app.admin.DevicePolicyIdentifiers.ACCOUNT_MANAGEMENT_DISABLED_POLICY;
    public static final java.lang.String APPLICATION_HIDDEN_POLICY = android.app.admin.DevicePolicyIdentifiers.APPLICATION_HIDDEN_POLICY;
    public static final java.lang.String APPLICATION_RESTRICTIONS_POLICY = android.app.admin.DevicePolicyIdentifiers.APPLICATION_RESTRICTIONS_POLICY;
    public static final java.lang.String AUTO_TIMEZONE_POLICY = android.app.admin.DevicePolicyIdentifiers.AUTO_TIMEZONE_POLICY;
    public static final java.lang.String AUTO_TIME_POLICY = android.app.admin.DevicePolicyIdentifiers.AUTO_TIME_POLICY;
    public static final java.lang.String BACKUP_SERVICE_POLICY = android.app.admin.DevicePolicyIdentifiers.BACKUP_SERVICE_POLICY;
    public static final java.lang.String CAMERA_DISABLED_POLICY = android.app.admin.DevicePolicyIdentifiers.CAMERA_DISABLED_POLICY;
    public static final java.lang.String CONTENT_PROTECTION_POLICY = android.app.admin.DevicePolicyIdentifiers.CONTENT_PROTECTION_POLICY;
    public static final java.lang.String KEYGUARD_DISABLED_FEATURES_POLICY = android.app.admin.DevicePolicyIdentifiers.KEYGUARD_DISABLED_FEATURES_POLICY;
    public static final java.lang.String LOCK_TASK_POLICY = android.app.admin.DevicePolicyIdentifiers.LOCK_TASK_POLICY;
    public static final java.lang.String PACKAGES_SUSPENDED_POLICY = android.app.admin.DevicePolicyIdentifiers.PACKAGES_SUSPENDED_POLICY;
    public static final java.lang.String PACKAGE_UNINSTALL_BLOCKED_POLICY = android.app.admin.DevicePolicyIdentifiers.PACKAGE_UNINSTALL_BLOCKED_POLICY;
    public static final java.lang.String PASSWORD_COMPLEXITY_POLICY = android.app.admin.DevicePolicyIdentifiers.PASSWORD_COMPLEXITY_POLICY;
    public static final java.lang.String PERMISSION_GRANT_POLICY = android.app.admin.DevicePolicyIdentifiers.PERMISSION_GRANT_POLICY;
    public static final java.lang.String PERSISTENT_PREFERRED_ACTIVITY_POLICY = android.app.admin.DevicePolicyIdentifiers.PERSISTENT_PREFERRED_ACTIVITY_POLICY;
    public static final java.lang.String RESET_PASSWORD_TOKEN_POLICY = android.app.admin.DevicePolicyIdentifiers.RESET_PASSWORD_TOKEN_POLICY;
    public static final java.lang.String SECURITY_LOGGING_POLICY = android.app.admin.DevicePolicyIdentifiers.SECURITY_LOGGING_POLICY;
    public static final java.lang.String STATUS_BAR_DISABLED_POLICY = android.app.admin.DevicePolicyIdentifiers.STATUS_BAR_DISABLED_POLICY;
    public static final java.lang.String USB_DATA_SIGNALING_POLICY = android.app.admin.DevicePolicyIdentifiers.USB_DATA_SIGNALING_POLICY;
    public static final java.lang.String USER_CONTROL_DISABLED_PACKAGES_POLICY = android.app.admin.DevicePolicyIdentifiers.USER_CONTROL_DISABLED_PACKAGES_POLICY;

}
