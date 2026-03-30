// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DeviceAdminReceiver {
    private final android.app.admin.DeviceAdminReceiver real;

    public DeviceAdminReceiver(android.app.admin.DeviceAdminReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DeviceAdminReceiver wrap(android.app.admin.DeviceAdminReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DeviceAdminReceiver(real);
    }

    public android.app.admin.DeviceAdminReceiver unwrap() {
        return real;
    }

    public DeviceAdminReceiver() {
        this(new android.app.admin.DeviceAdminReceiver());
    }

    public com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager getManager(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.wrap(real.getManager(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getWho(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getWho(arg0 == null ? null : arg0.unwrap()));
    }

    public void onBugreportFailed(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        real.onBugreportFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onBugreportShared(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, java.lang.String arg2) {
        real.onBugreportShared(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onBugreportSharingDeclined(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onBugreportSharingDeclined(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String onChoosePrivateKeyAlias(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, java.lang.String arg4) {
        return real.onChoosePrivateKeyAlias(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4);
    }

    public void onComplianceAcknowledgementRequired(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onComplianceAcknowledgementRequired(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.CharSequence onDisableRequested(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return real.onDisableRequested(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onDisabled(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onDisabled(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onEnabled(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onEnabled(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onLockTaskModeEntering(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, java.lang.String arg2) {
        real.onLockTaskModeEntering(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onLockTaskModeExiting(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onLockTaskModeExiting(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onNetworkLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, long arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DeviceAdminReceiver#onNetworkLogsAvailable(android.content.Context,android.content.Intent,long,int)");
    }

    public void onOperationSafetyStateChanged(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, boolean arg2) {
        real.onOperationSafetyStateChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onPasswordChanged(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onPasswordChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onPasswordChanged(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onPasswordChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onPasswordExpiring(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onPasswordExpiring(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onPasswordExpiring(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onPasswordExpiring(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onPasswordFailed(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onPasswordFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onPasswordFailed(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onPasswordFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onPasswordSucceeded(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onPasswordSucceeded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onPasswordSucceeded(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onPasswordSucceeded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onProfileProvisioningComplete(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DeviceAdminReceiver#onProfileProvisioningComplete(android.content.Context,android.content.Intent)");
    }

    public void onReadyForUserInitialization(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onReadyForUserInitialization(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onReceive(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onSecurityLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onSecurityLogsAvailable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onSystemUpdatePending(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, long arg2) {
        real.onSystemUpdatePending(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onTransferAffiliatedProfileOwnershipComplete(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DeviceAdminReceiver#onTransferAffiliatedProfileOwnershipComplete(android.content.Context,android.os.UserHandle)");
    }

    public void onTransferOwnershipComplete(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        real.onTransferOwnershipComplete(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onUserAdded(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onUserAdded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onUserRemoved(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onUserRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onUserStarted(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onUserStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onUserStopped(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onUserStopped(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onUserSwitched(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        real.onUserSwitched(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static final java.lang.String ACTION_CHOOSE_PRIVATE_KEY_ALIAS = android.app.admin.DeviceAdminReceiver.ACTION_CHOOSE_PRIVATE_KEY_ALIAS;
    public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLED = android.app.admin.DeviceAdminReceiver.ACTION_DEVICE_ADMIN_DISABLED;
    public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = android.app.admin.DeviceAdminReceiver.ACTION_DEVICE_ADMIN_DISABLE_REQUESTED;
    public static final java.lang.String ACTION_DEVICE_ADMIN_ENABLED = android.app.admin.DeviceAdminReceiver.ACTION_DEVICE_ADMIN_ENABLED;
    public static final java.lang.String ACTION_LOCK_TASK_ENTERING = android.app.admin.DeviceAdminReceiver.ACTION_LOCK_TASK_ENTERING;
    public static final java.lang.String ACTION_LOCK_TASK_EXITING = android.app.admin.DeviceAdminReceiver.ACTION_LOCK_TASK_EXITING;
    public static final java.lang.String ACTION_PASSWORD_CHANGED = android.app.admin.DeviceAdminReceiver.ACTION_PASSWORD_CHANGED;
    public static final java.lang.String ACTION_PASSWORD_EXPIRING = android.app.admin.DeviceAdminReceiver.ACTION_PASSWORD_EXPIRING;
    public static final java.lang.String ACTION_PASSWORD_FAILED = android.app.admin.DeviceAdminReceiver.ACTION_PASSWORD_FAILED;
    public static final java.lang.String ACTION_PASSWORD_SUCCEEDED = android.app.admin.DeviceAdminReceiver.ACTION_PASSWORD_SUCCEEDED;
    public static final java.lang.String ACTION_SECURITY_LOGS_AVAILABLE = android.app.admin.DeviceAdminReceiver.ACTION_SECURITY_LOGS_AVAILABLE;
    public static final int BUGREPORT_FAILURE_FAILED_COMPLETING = android.app.admin.DeviceAdminReceiver.BUGREPORT_FAILURE_FAILED_COMPLETING;
    public static final java.lang.String DEVICE_ADMIN_META_DATA = android.app.admin.DeviceAdminReceiver.DEVICE_ADMIN_META_DATA;
    public static final java.lang.String EXTRA_DISABLE_WARNING = android.app.admin.DeviceAdminReceiver.EXTRA_DISABLE_WARNING;
    public static final java.lang.String EXTRA_LOCK_TASK_PACKAGE = android.app.admin.DeviceAdminReceiver.EXTRA_LOCK_TASK_PACKAGE;
    public static final java.lang.String EXTRA_TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE = android.app.admin.DeviceAdminReceiver.EXTRA_TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE;

}
