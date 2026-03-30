// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class BatchUpdates {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BatchUpdates(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates wrap(android.service.autofill.BatchUpdates real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.BatchUpdates getReal() {
        return (android.service.autofill.BatchUpdates) real;
    }

    public android.service.autofill.BatchUpdates unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.BatchUpdates) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.BatchUpdates) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.BatchUpdates) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder wrap(android.service.autofill.BatchUpdates.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.BatchUpdates.Builder getReal() {
            return (android.service.autofill.BatchUpdates.Builder) real;
        }

        public android.service.autofill.BatchUpdates.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.autofill.BatchUpdates.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates build() {
            return com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.wrap(((android.service.autofill.BatchUpdates.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder transformChild(int arg0, com.micklab.dcg.wrapper.android.service.autofill.Transformation arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder.wrap(((android.service.autofill.BatchUpdates.Builder) real).transformChild(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder updateTemplate(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder.wrap(((android.service.autofill.BatchUpdates.Builder) real).updateTemplate(arg0 == null ? null : arg0.getReal()));
        }

    }
}
