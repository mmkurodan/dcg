// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DeviceAdminReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceAdminReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DeviceAdminReceiver wrap(android.app.admin.DeviceAdminReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DeviceAdminReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.DeviceAdminReceiver getReal() {
        return (android.app.admin.DeviceAdminReceiver) real;
    }

    public android.app.admin.DeviceAdminReceiver unwrap() {
        return getReal();
    }

    public DeviceAdminReceiver() {
        this(new android.app.admin.DeviceAdminReceiver(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager getManager(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.wrap(((android.app.admin.DeviceAdminReceiver) real).getManager(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getWho(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.admin.DeviceAdminReceiver) real).getWho(arg0 == null ? null : arg0.getReal()));
    }

    public void onBugreportFailed(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onBugreportFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onBugreportShared(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, java.lang.String arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onBugreportShared(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onBugreportSharingDeclined(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onBugreportSharingDeclined(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public java.lang.String onChoosePrivateKeyAlias(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, java.lang.String arg4) {
        return ((android.app.admin.DeviceAdminReceiver) real).onChoosePrivateKeyAlias(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4);
    }

    public void onComplianceAcknowledgementRequired(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onComplianceAcknowledgementRequired(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public java.lang.CharSequence onDisableRequested(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return ((android.app.admin.DeviceAdminReceiver) real).onDisableRequested(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onDisabled(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onDisabled(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onEnabled(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onEnabled(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onLockTaskModeEntering(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, java.lang.String arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onLockTaskModeEntering(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onLockTaskModeExiting(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onLockTaskModeExiting(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onNetworkLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, long arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DeviceAdminReceiver#onNetworkLogsAvailable(android.content.Context,android.content.Intent,long,int)");
    }

    public void onOperationSafetyStateChanged(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, boolean arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onOperationSafetyStateChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onPasswordChanged(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onPasswordChanged(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onPasswordExpiring(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordExpiring(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onPasswordExpiring(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordExpiring(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onPasswordFailed(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onPasswordFailed(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onPasswordSucceeded(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordSucceeded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onPasswordSucceeded(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onPasswordSucceeded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onProfileProvisioningComplete(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DeviceAdminReceiver#onProfileProvisioningComplete(android.content.Context,android.content.Intent)");
    }

    public void onReadyForUserInitialization(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onReadyForUserInitialization(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onReceive(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onSecurityLogsAvailable(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onSecurityLogsAvailable(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onSystemUpdatePending(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, long arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onSystemUpdatePending(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onTransferAffiliatedProfileOwnershipComplete(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DeviceAdminReceiver#onTransferAffiliatedProfileOwnershipComplete(android.content.Context,android.os.UserHandle)");
    }

    public void onTransferOwnershipComplete(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        ((android.app.admin.DeviceAdminReceiver) real).onTransferOwnershipComplete(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onUserAdded(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onUserAdded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onUserRemoved(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onUserRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onUserStarted(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onUserStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onUserStopped(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onUserStopped(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onUserSwitched(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        ((android.app.admin.DeviceAdminReceiver) real).onUserSwitched(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
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
