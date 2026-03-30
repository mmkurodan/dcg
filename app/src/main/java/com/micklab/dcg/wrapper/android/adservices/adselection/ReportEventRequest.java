// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class ReportEventRequest {
    private final android.adservices.adselection.ReportEventRequest real;

    public ReportEventRequest(android.adservices.adselection.ReportEventRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest wrap(android.adservices.adselection.ReportEventRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest(real);
    }

    public android.adservices.adselection.ReportEventRequest unwrap() {
        return real;
    }

    public long getAdSelectionId() {
        return real.getAdSelectionId();
    }

    public java.lang.String getData() {
        return real.getData();
    }

    public com.micklab.dcg.wrapper.android.view.InputEvent getInputEvent() {
        return com.micklab.dcg.wrapper.android.view.InputEvent.wrap(real.getInputEvent());
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public int getReportingDestinations() {
        return real.getReportingDestinations();
    }

    public static final int FLAG_REPORTING_DESTINATION_BUYER = android.adservices.adselection.ReportEventRequest.FLAG_REPORTING_DESTINATION_BUYER;
    public static final int FLAG_REPORTING_DESTINATION_SELLER = android.adservices.adselection.ReportEventRequest.FLAG_REPORTING_DESTINATION_SELLER;

    public static final class Builder {
        private final android.adservices.adselection.ReportEventRequest.Builder real;

        public Builder(android.adservices.adselection.ReportEventRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder wrap(android.adservices.adselection.ReportEventRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder(real);
        }

        public android.adservices.adselection.ReportEventRequest.Builder unwrap() {
            return real;
        }

        public Builder(long arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
            this(new android.adservices.adselection.ReportEventRequest.Builder(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setAdSelectionId(long arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(real.setAdSelectionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setData(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(real.setData(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(real.setInputEvent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(real.setKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder setReportingDestinations(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.ReportEventRequest.Builder.wrap(real.setReportingDestinations(arg0));
        }

    }
}
