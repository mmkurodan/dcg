// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class CompanionDeviceManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CompanionDeviceManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager wrap(android.companion.CompanionDeviceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager(real, (__DcgwBridgeToken) null);
    }

    public android.companion.CompanionDeviceManager getReal() {
        return (android.companion.CompanionDeviceManager) real;
    }

    public android.companion.CompanionDeviceManager unwrap() {
        return getReal();
    }

    public void associate(com.micklab.dcg.wrapper.android.companion.AssociationRequest arg0, com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        ((android.companion.CompanionDeviceManager) real).associate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void associate(com.micklab.dcg.wrapper.android.companion.AssociationRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback arg2) {
        ((android.companion.CompanionDeviceManager) real).associate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void attachSystemDataTransport(int arg0, java.io.InputStream arg1, java.io.OutputStream arg2) throws android.companion.DeviceNotAssociatedException {
        ((android.companion.CompanionDeviceManager) real).attachSystemDataTransport(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender buildAssociationCancellationIntent() {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(((android.companion.CompanionDeviceManager) real).buildAssociationCancellationIntent());
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender buildPermissionTransferUserConsentIntent(int arg0) throws android.companion.DeviceNotAssociatedException {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(((android.companion.CompanionDeviceManager) real).buildPermissionTransferUserConsentIntent(arg0));
    }

    public void detachSystemDataTransport(int arg0) throws android.companion.DeviceNotAssociatedException {
        ((android.companion.CompanionDeviceManager) real).detachSystemDataTransport(arg0);
    }

    public void disableSystemDataSyncForTypes(int arg0, int arg1) {
        ((android.companion.CompanionDeviceManager) real).disableSystemDataSyncForTypes(arg0, arg1);
    }

    public void disassociate(int arg0) {
        ((android.companion.CompanionDeviceManager) real).disassociate(arg0);
    }

    public void disassociate(java.lang.String arg0) {
        ((android.companion.CompanionDeviceManager) real).disassociate(arg0);
    }

    public void enableSystemDataSyncForTypes(int arg0, int arg1) {
        ((android.companion.CompanionDeviceManager) real).enableSystemDataSyncForTypes(arg0, arg1);
    }

    public boolean hasNotificationAccess(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return ((android.companion.CompanionDeviceManager) real).hasNotificationAccess(arg0 == null ? null : arg0.getReal());
    }

    public boolean isPermissionTransferUserConsented(int arg0) {
        return ((android.companion.CompanionDeviceManager) real).isPermissionTransferUserConsented(arg0);
    }

    public void requestNotificationAccess(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.companion.CompanionDeviceManager) real).requestNotificationAccess(arg0 == null ? null : arg0.getReal());
    }

    public void startObservingDevicePresence(java.lang.String arg0) throws android.companion.DeviceNotAssociatedException {
        ((android.companion.CompanionDeviceManager) real).startObservingDevicePresence(arg0);
    }

    public void stopObservingDevicePresence(java.lang.String arg0) throws android.companion.DeviceNotAssociatedException {
        ((android.companion.CompanionDeviceManager) real).stopObservingDevicePresence(arg0);
    }

    public static final java.lang.String EXTRA_ASSOCIATION = android.companion.CompanionDeviceManager.EXTRA_ASSOCIATION;
    public static final java.lang.String EXTRA_DEVICE = android.companion.CompanionDeviceManager.EXTRA_DEVICE;
    public static final int FLAG_CALL_METADATA = android.companion.CompanionDeviceManager.FLAG_CALL_METADATA;
    public static final int RESULT_CANCELED = android.companion.CompanionDeviceManager.RESULT_CANCELED;
    public static final int RESULT_DISCOVERY_TIMEOUT = android.companion.CompanionDeviceManager.RESULT_DISCOVERY_TIMEOUT;
    public static final int RESULT_INTERNAL_ERROR = android.companion.CompanionDeviceManager.RESULT_INTERNAL_ERROR;
    public static final int RESULT_OK = android.companion.CompanionDeviceManager.RESULT_OK;
    public static final int RESULT_USER_REJECTED = android.companion.CompanionDeviceManager.RESULT_USER_REJECTED;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback wrap(android.companion.CompanionDeviceManager.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.companion.CompanionDeviceManager.Callback getReal() {
            return (android.companion.CompanionDeviceManager.Callback) real;
        }

        public android.companion.CompanionDeviceManager.Callback unwrap() {
            return getReal();
        }

        public void onAssociationCreated(com.micklab.dcg.wrapper.android.companion.AssociationInfo arg0) {
            ((android.companion.CompanionDeviceManager.Callback) real).onAssociationCreated(arg0 == null ? null : arg0.getReal());
        }

        public void onAssociationPending(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
            ((android.companion.CompanionDeviceManager.Callback) real).onAssociationPending(arg0 == null ? null : arg0.getReal());
        }

        public void onDeviceFound(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
            ((android.companion.CompanionDeviceManager.Callback) real).onDeviceFound(arg0 == null ? null : arg0.getReal());
        }

        public void onFailure(java.lang.CharSequence arg0) {
            ((android.companion.CompanionDeviceManager.Callback) real).onFailure(arg0);
        }

    }
}
