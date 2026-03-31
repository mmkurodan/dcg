// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class CardEmulation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CardEmulation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation wrap(android.nfc.cardemulation.CardEmulation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.cardemulation.CardEmulation getReal() {
        return (android.nfc.cardemulation.CardEmulation) real;
    }

    public android.nfc.cardemulation.CardEmulation unwrap() {
        return getReal();
    }

    public boolean categoryAllowsForegroundPreference(java.lang.String arg0) {
        return ((android.nfc.cardemulation.CardEmulation) real).categoryAllowsForegroundPreference(arg0);
    }

    public int getDefaultNfcSubscriptionId() {
        return ((android.nfc.cardemulation.CardEmulation) real).getDefaultNfcSubscriptionId();
    }

    public java.lang.CharSequence getDescriptionForPreferredPaymentService() {
        return ((android.nfc.cardemulation.CardEmulation) real).getDescriptionForPreferredPaymentService();
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation getInstance(com.micklab.dcg.wrapper.android.nfc.NfcAdapter arg0) {
        return com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation.wrap(android.nfc.cardemulation.CardEmulation.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String getRouteDestinationForPreferredPaymentService() {
        return ((android.nfc.cardemulation.CardEmulation) real).getRouteDestinationForPreferredPaymentService();
    }

    public int getSelectionModeForCategory(java.lang.String arg0) {
        return ((android.nfc.cardemulation.CardEmulation) real).getSelectionModeForCategory(arg0);
    }

    public boolean isDefaultServiceForAid(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).isDefaultServiceForAid(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean isDefaultServiceForCategory(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).isDefaultServiceForCategory(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean isEuiccSupported() {
        return ((android.nfc.cardemulation.CardEmulation) real).isEuiccSupported();
    }

    public void registerNfcEventCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation.NfcEventCallback arg1) {
        ((android.nfc.cardemulation.CardEmulation) real).registerNfcEventCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean registerPollingLoopFilterForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, boolean arg2) {
        return ((android.nfc.cardemulation.CardEmulation) real).registerPollingLoopFilterForService(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean registerPollingLoopPatternFilterForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, boolean arg2) {
        return ((android.nfc.cardemulation.CardEmulation) real).registerPollingLoopPatternFilterForService(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean removeAidsForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).removeAidsForService(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean removePollingLoopFilterForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).removePollingLoopFilterForService(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean removePollingLoopPatternFilterForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).removePollingLoopPatternFilterForService(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean setOffHostForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).setOffHostForService(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean setPreferredService(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).setPreferredService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean setShouldDefaultToObserveModeForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        return ((android.nfc.cardemulation.CardEmulation) real).setShouldDefaultToObserveModeForService(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean supportsAidPrefixRegistration() {
        return ((android.nfc.cardemulation.CardEmulation) real).supportsAidPrefixRegistration();
    }

    public void unregisterNfcEventCallback(com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation.NfcEventCallback arg0) {
        ((android.nfc.cardemulation.CardEmulation) real).unregisterNfcEventCallback(arg0 == null ? null : arg0.getReal());
    }

    public boolean unsetOffHostForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return ((android.nfc.cardemulation.CardEmulation) real).unsetOffHostForService(arg0 == null ? null : arg0.getReal());
    }

    public boolean unsetPreferredService(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return ((android.nfc.cardemulation.CardEmulation) real).unsetPreferredService(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_CHANGE_DEFAULT = android.nfc.cardemulation.CardEmulation.ACTION_CHANGE_DEFAULT;
    public static final java.lang.String CATEGORY_OTHER = android.nfc.cardemulation.CardEmulation.CATEGORY_OTHER;
    public static final java.lang.String CATEGORY_PAYMENT = android.nfc.cardemulation.CardEmulation.CATEGORY_PAYMENT;
    public static final java.lang.String EXTRA_CATEGORY = android.nfc.cardemulation.CardEmulation.EXTRA_CATEGORY;
    public static final java.lang.String EXTRA_SERVICE_COMPONENT = android.nfc.cardemulation.CardEmulation.EXTRA_SERVICE_COMPONENT;
    public static final int NFC_INTERNAL_ERROR_COMMAND_TIMEOUT = android.nfc.cardemulation.CardEmulation.NFC_INTERNAL_ERROR_COMMAND_TIMEOUT;
    public static final int NFC_INTERNAL_ERROR_NFC_CRASH_RESTART = android.nfc.cardemulation.CardEmulation.NFC_INTERNAL_ERROR_NFC_CRASH_RESTART;
    public static final int NFC_INTERNAL_ERROR_NFC_HARDWARE_ERROR = android.nfc.cardemulation.CardEmulation.NFC_INTERNAL_ERROR_NFC_HARDWARE_ERROR;
    public static final int NFC_INTERNAL_ERROR_UNKNOWN = android.nfc.cardemulation.CardEmulation.NFC_INTERNAL_ERROR_UNKNOWN;
    public static final java.lang.String PROPERTY_ALLOW_SHARED_ROLE_PRIORITY = android.nfc.cardemulation.CardEmulation.PROPERTY_ALLOW_SHARED_ROLE_PRIORITY;
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_DEFAULT = android.nfc.cardemulation.CardEmulation.PROTOCOL_AND_TECHNOLOGY_ROUTE_DEFAULT;
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_DH = android.nfc.cardemulation.CardEmulation.PROTOCOL_AND_TECHNOLOGY_ROUTE_DH;
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_ESE = android.nfc.cardemulation.CardEmulation.PROTOCOL_AND_TECHNOLOGY_ROUTE_ESE;
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_UICC = android.nfc.cardemulation.CardEmulation.PROTOCOL_AND_TECHNOLOGY_ROUTE_UICC;
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_UNSET = android.nfc.cardemulation.CardEmulation.PROTOCOL_AND_TECHNOLOGY_ROUTE_UNSET;
    public static final int SELECTION_MODE_ALWAYS_ASK = android.nfc.cardemulation.CardEmulation.SELECTION_MODE_ALWAYS_ASK;
    public static final int SELECTION_MODE_ASK_IF_CONFLICT = android.nfc.cardemulation.CardEmulation.SELECTION_MODE_ASK_IF_CONFLICT;
    public static final int SELECTION_MODE_PREFER_DEFAULT = android.nfc.cardemulation.CardEmulation.SELECTION_MODE_PREFER_DEFAULT;

    public static final class NfcEventCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NfcEventCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation.NfcEventCallback wrap(android.nfc.cardemulation.CardEmulation.NfcEventCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.CardEmulation.NfcEventCallback(real, (__DcgwBridgeToken) null);
        }

        public android.nfc.cardemulation.CardEmulation.NfcEventCallback getReal() {
            return (android.nfc.cardemulation.CardEmulation.NfcEventCallback) real;
        }

        public android.nfc.cardemulation.CardEmulation.NfcEventCallback unwrap() {
            return getReal();
        }

        public void onAidConflictOccurred(java.lang.String arg0) {
            ((android.nfc.cardemulation.CardEmulation.NfcEventCallback) real).onAidConflictOccurred(arg0);
        }

        public void onAidNotRouted(java.lang.String arg0) {
            ((android.nfc.cardemulation.CardEmulation.NfcEventCallback) real).onAidNotRouted(arg0);
        }

        public void onInternalErrorReported(int arg0) {
            ((android.nfc.cardemulation.CardEmulation.NfcEventCallback) real).onInternalErrorReported(arg0);
        }

        public void onNfcStateChanged(int arg0) {
            ((android.nfc.cardemulation.CardEmulation.NfcEventCallback) real).onNfcStateChanged(arg0);
        }

        public void onObserveModeStateChanged(boolean arg0) {
            ((android.nfc.cardemulation.CardEmulation.NfcEventCallback) real).onObserveModeStateChanged(arg0);
        }

        public void onPreferredServiceChanged(boolean arg0) {
            ((android.nfc.cardemulation.CardEmulation.NfcEventCallback) real).onPreferredServiceChanged(arg0);
        }

        public void onRemoteFieldChanged(boolean arg0) {
            ((android.nfc.cardemulation.CardEmulation.NfcEventCallback) real).onRemoteFieldChanged(arg0);
        }

    }
}
