// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class RemoveAdSelectionOverrideRequest {
    private final android.adservices.adselection.RemoveAdSelectionOverrideRequest real;

    public RemoveAdSelectionOverrideRequest(android.adservices.adselection.RemoveAdSelectionOverrideRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionOverrideRequest wrap(android.adservices.adselection.RemoveAdSelectionOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionOverrideRequest(real);
    }

    public android.adservices.adselection.RemoveAdSelectionOverrideRequest unwrap() {
        return real;
    }

    public RemoveAdSelectionOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg0) {
        this(new android.adservices.adselection.RemoveAdSelectionOverrideRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig getAdSelectionConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(real.getAdSelectionConfig());
    }

}
