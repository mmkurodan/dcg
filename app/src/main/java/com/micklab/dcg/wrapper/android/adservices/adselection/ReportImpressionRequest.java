// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class ReportImpressionRequest {
    private final android.adservices.adselection.ReportImpressionRequest real;

    public ReportImpressionRequest(android.adservices.adselection.ReportImpressionRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.ReportImpressionRequest wrap(android.adservices.adselection.ReportImpressionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.ReportImpressionRequest(real);
    }

    public android.adservices.adselection.ReportImpressionRequest unwrap() {
        return real;
    }

    public ReportImpressionRequest(long arg0) {
        this(new android.adservices.adselection.ReportImpressionRequest(arg0));
    }

    public ReportImpressionRequest(long arg0, com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg1) {
        this(new android.adservices.adselection.ReportImpressionRequest(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig getAdSelectionConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(real.getAdSelectionConfig());
    }

    public long getAdSelectionId() {
        return real.getAdSelectionId();
    }

}
