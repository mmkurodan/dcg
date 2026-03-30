// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class ReportEventRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReportEventRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest wrap(android.adservices.adselection.ReportEventRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.ReportEventRequest getReal() {
        return (android.adservices.adselection.ReportEventRequest) real;
    }

    public android.adservices.adselection.ReportEventRequest unwrap() {
        return getReal();
    }

    public long getAdSelectionId() {
        return ((android.adservices.adselection.ReportEventRequest) real).getAdSelectionId();
    }

    public java.lang.String getData() {
        return ((android.adservices.adselection.ReportEventRequest) real).getData();
    }

    public com.micklab.dcg.wrapper.android.view.InputEvent getInputEvent() {
        return com.micklab.dcg.wrapper.android.view.InputEvent.wrap(((android.adservices.adselection.ReportEventRequest) real).getInputEvent());
    }

    public java.lang.String getKey() {
        return ((android.adservices.adselection.ReportEventRequest) real).getKey();
    }

    public int getReportingDestinations() {
        return ((android.adservices.adselection.ReportEventRequest) real).getReportingDestinations();
    }

    public static final int FLAG_REPORTING_DESTINATION_BUYER = android.adservices.adselection.ReportEventRequest.FLAG_REPORTING_DESTINATION_BUYER;
    public static final int FLAG_REPORTING_DESTINATION_SELLER = android.adservices.adselection.ReportEventRequest.FLAG_REPORTING_DESTINATION_SELLER;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder wrap(android.adservices.adselection.ReportEventRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.ReportEventRequest.Builder getReal() {
            return (android.adservices.adselection.ReportEventRequest.Builder) real;
        }

        public android.adservices.adselection.ReportEventRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(long arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
            this(new android.adservices.adselection.ReportEventRequest.Builder(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.wrap(((android.adservices.adselection.ReportEventRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(((android.adservices.adselection.ReportEventRequest.Builder) real).setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setData(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(((android.adservices.adselection.ReportEventRequest.Builder) real).setData(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(((android.adservices.adselection.ReportEventRequest.Builder) real).setInputEvent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(((android.adservices.adselection.ReportEventRequest.Builder) real).setKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setReportingDestinations(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(((android.adservices.adselection.ReportEventRequest.Builder) real).setReportingDestinations(arg0));
        }

    }
}
