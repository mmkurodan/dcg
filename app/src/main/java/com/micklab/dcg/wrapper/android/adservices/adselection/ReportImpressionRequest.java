// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class ReportImpressionRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReportImpressionRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.ReportImpressionRequest wrap(android.adservices.adselection.ReportImpressionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.ReportImpressionRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.ReportImpressionRequest getReal() {
        return (android.adservices.adselection.ReportImpressionRequest) real;
    }

    public android.adservices.adselection.ReportImpressionRequest unwrap() {
        return getReal();
    }

    public ReportImpressionRequest(long arg0) {
        this(new android.adservices.adselection.ReportImpressionRequest(arg0), (__DcgwBridgeToken) null);
    }

    public ReportImpressionRequest(long arg0, com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig arg1) {
        this(new android.adservices.adselection.ReportImpressionRequest(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig getAdSelectionConfig() {
        return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(((android.adservices.adselection.ReportImpressionRequest) real).getAdSelectionConfig());
    }

    public long getAdSelectionId() {
        return ((android.adservices.adselection.ReportImpressionRequest) real).getAdSelectionId();
    }

}
