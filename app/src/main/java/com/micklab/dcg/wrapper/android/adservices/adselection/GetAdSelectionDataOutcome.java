// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class GetAdSelectionDataOutcome {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetAdSelectionDataOutcome(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataOutcome wrap(android.adservices.adselection.GetAdSelectionDataOutcome real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataOutcome(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.GetAdSelectionDataOutcome getReal() {
        return (android.adservices.adselection.GetAdSelectionDataOutcome) real;
    }

    public android.adservices.adselection.GetAdSelectionDataOutcome unwrap() {
        return getReal();
    }

    public byte[] getAdSelectionData() {
        return ((android.adservices.adselection.GetAdSelectionDataOutcome) real).getAdSelectionData();
    }

    public long getAdSelectionDataId() {
        return ((android.adservices.adselection.GetAdSelectionDataOutcome) real).getAdSelectionDataId();
    }

    public long getAdSelectionId() {
        return ((android.adservices.adselection.GetAdSelectionDataOutcome) real).getAdSelectionId();
    }

}
