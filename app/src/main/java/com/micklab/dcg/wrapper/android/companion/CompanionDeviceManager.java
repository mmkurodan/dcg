// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class CompanionDeviceManager {
    private final android.companion.CompanionDeviceManager real;

    public CompanionDeviceManager(android.companion.CompanionDeviceManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager wrap(android.companion.CompanionDeviceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager(real);
    }

    public android.companion.CompanionDeviceManager unwrap() {
        return real;
    }

    public void associate(com.micklab.dcg.wrapper.android.companion.AssociationRequest arg0, com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        real.associate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void associate(com.micklab.dcg.wrapper.android.companion.AssociationRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback arg2) {
        real.associate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void attachSystemDataTransport(int arg0, java.io.InputStream arg1, java.io.OutputStream arg2) throws android.companion.DeviceNotAssociatedException {
        real.attachSystemDataTransport(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender buildAssociationCancellationIntent() {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(real.buildAssociationCancellationIntent());
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender buildPermissionTransferUserConsentIntent(int arg0) throws android.companion.DeviceNotAssociatedException {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(real.buildPermissionTransferUserConsentIntent(arg0));
    }

    public void detachSystemDataTransport(int arg0) throws android.companion.DeviceNotAssociatedException {
        real.detachSystemDataTransport(arg0);
    }

    public void disableSystemDataSyncForTypes(int arg0, int arg1) {
        real.disableSystemDataSyncForTypes(arg0, arg1);
    }

    public void disassociate(int arg0) {
        real.disassociate(arg0);
    }

    public void disassociate(java.lang.String arg0) {
        real.disassociate(arg0);
    }

    public void enableSystemDataSyncForTypes(int arg0, int arg1) {
        real.enableSystemDataSyncForTypes(arg0, arg1);
    }

    public boolean hasNotificationAccess(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.hasNotificationAccess(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isPermissionTransferUserConsented(int arg0) {
        return real.isPermissionTransferUserConsented(arg0);
    }

    public void requestNotificationAccess(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.requestNotificationAccess(arg0 == null ? null : arg0.unwrap());
    }

    public void startObservingDevicePresence(java.lang.String arg0) throws android.companion.DeviceNotAssociatedException {
        real.startObservingDevicePresence(arg0);
    }

    public void stopObservingDevicePresence(java.lang.String arg0) throws android.companion.DeviceNotAssociatedException {
        real.stopObservingDevicePresence(arg0);
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
        private final android.companion.CompanionDeviceManager.Callback real;

        public Callback(android.companion.CompanionDeviceManager.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback wrap(android.companion.CompanionDeviceManager.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.CompanionDeviceManager.Callback(real);
        }

        public android.companion.CompanionDeviceManager.Callback unwrap() {
            return real;
        }

        public void onAssociationCreated(com.micklab.dcg.wrapper.android.companion.AssociationInfo arg0) {
            real.onAssociationCreated(arg0 == null ? null : arg0.unwrap());
        }

        public void onAssociationPending(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
            real.onAssociationPending(arg0 == null ? null : arg0.unwrap());
        }

        public void onDeviceFound(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
            real.onDeviceFound(arg0 == null ? null : arg0.unwrap());
        }

        public void onFailure(java.lang.CharSequence arg0) {
            real.onFailure(arg0);
        }

    }
}
