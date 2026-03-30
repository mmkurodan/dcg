// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class GetAdSelectionDataOutcome {
    private final android.adservices.adselection.GetAdSelectionDataOutcome real;

    public GetAdSelectionDataOutcome(android.adservices.adselection.GetAdSelectionDataOutcome real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataOutcome wrap(android.adservices.adselection.GetAdSelectionDataOutcome real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.GetAdSelectionDataOutcome(real);
    }

    public android.adservices.adselection.GetAdSelectionDataOutcome unwrap() {
        return real;
    }

    public byte[] getAdSelectionData() {
        return real.getAdSelectionData();
    }

    public long getAdSelectionDataId() {
        return real.getAdSelectionDataId();
    }

    public long getAdSelectionId() {
        return real.getAdSelectionId();
    }

}
