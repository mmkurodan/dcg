// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AddAdSelectionFromOutcomesOverrideRequest {
    private final android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest real;

    public AddAdSelectionFromOutcomesOverrideRequest(android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest wrap(android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest(real);
    }

    public android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest unwrap() {
        return real;
    }

    public AddAdSelectionFromOutcomesOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg2) {
        this(new android.adservices.adselection.AddAdSelectionFromOutcomesOverrideRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig getAdSelectionFromOutcomesConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.wrap(real.getAdSelectionFromOutcomesConfig());
    }

    public java.lang.String getOutcomeSelectionLogicJs() {
        return real.getOutcomeSelectionLogicJs();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getOutcomeSelectionTrustedSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getOutcomeSelectionTrustedSignals());
    }

}
