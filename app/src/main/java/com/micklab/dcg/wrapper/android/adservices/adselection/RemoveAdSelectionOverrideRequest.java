// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class RemoveAdSelectionOverrideRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoveAdSelectionOverrideRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionOverrideRequest wrap(android.adservices.adselection.RemoveAdSelectionOverrideRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.RemoveAdSelectionOverrideRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.RemoveAdSelectionOverrideRequest getReal() {
        return (android.adservices.adselection.RemoveAdSelectionOverrideRequest) real;
    }

    public android.adservices.adselection.RemoveAdSelectionOverrideRequest unwrap() {
        return getReal();
    }

    public RemoveAdSelectionOverrideRequest(com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg0) {
        this(new android.adservices.adselection.RemoveAdSelectionOverrideRequest(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig getAdSelectionConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(((android.adservices.adselection.RemoveAdSelectionOverrideRequest) real).getAdSelectionConfig());
    }

}
