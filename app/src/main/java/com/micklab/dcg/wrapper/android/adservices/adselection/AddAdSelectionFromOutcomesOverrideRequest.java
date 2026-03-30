// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AddAdSelectionFromOutcomesOverrideRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AddAdSelectionFromOutcomesOverrideRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest wrap(android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest getReal() {
        return (android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest) real;
    }

    public android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest unwrap() {
        return getReal();
    }

    public AddAdSelectionFromOutcomesOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg2) {
        this(new android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig getAdSelectionFromOutcomesConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.wrap(((android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest) real).getAdSelectionFromOutcomesConfig());
    }

    public java.lang.String getOutcomeSelectionLogicJs() {
        return ((android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest) real).getOutcomeSelectionLogicJs();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getOutcomeSelectionTrustedSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest) real).getOutcomeSelectionTrustedSignals());
    }

}
