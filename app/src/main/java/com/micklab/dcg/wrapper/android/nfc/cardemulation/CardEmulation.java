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
    public static final int SELECTION_MODE_ALWAYS_ASK = android.nfc.cardemulation.CardEmulation.SELECTION_MODE_ALWAYS_ASK;
    public static final int SELECTION_MODE_ASK_IF_CONFLICT = android.nfc.cardemulation.CardEmulation.SELECTION_MODE_ASK_IF_CONFLICT;
    public static final int SELECTION_MODE_PREFER_DEFAULT = android.nfc.cardemulation.CardEmulation.SELECTION_MODE_PREFER_DEFAULT;

}
