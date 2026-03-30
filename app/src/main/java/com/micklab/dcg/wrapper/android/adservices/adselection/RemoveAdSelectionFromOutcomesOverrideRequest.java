// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class RemoveAdSelectionFromOutcomesOverrideRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoveAdSelectionFromOutcomesOverrideRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest wrap(android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest getReal() {
        return (android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest) real;
    }

    public android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest unwrap() {
        return getReal();
    }

    public RemoveAdSelectionFromOutcomesOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig arg0) {
        this(new android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig getAdSelectionFromOutcomesConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.wrap(((android.adservices.adselection.RemoveAdSelectionFromOutcomesOverrideRequest) real).getAdSelectionFromOutcomesConfig());
    }

}
