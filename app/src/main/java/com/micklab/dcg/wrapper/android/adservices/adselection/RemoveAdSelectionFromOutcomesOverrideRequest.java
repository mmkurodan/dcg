// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class RemoveAdSelectionFromOutcomesOverrideRequest {
    private final android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest real;

    public RemoveAdSelectionFromOutcomesOverrideRequest(android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest wrap(android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest(real);
    }

    public android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest unwrap() {
        return real;
    }

    public RemoveAdSelectionFromOutcomesOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig arg0) {
        this(new android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig getAdSelectionFromOutcomesConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.wrap(real.getAdSelectionFromOutcomesConfig());
    }

}
