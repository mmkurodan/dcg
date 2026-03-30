// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingExampleRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TrainingExampleRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord wrap(android.adservices.ondevicepersonalization.TrainingExampleRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.TrainingExampleRecord getReal() {
        return (android.adservices.ondevicepersonalization.TrainingExampleRecord) real;
    }

    public android.adservices.ondevicepersonalization.TrainingExampleRecord unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.ondevicepersonalization.TrainingExampleRecord) real).describeContents();
    }

    public byte[] getResumptionToken() {
        return ((android.adservices.ondevicepersonalization.TrainingExampleRecord) real).getResumptionToken();
    }

    public byte[] getTrainingExample() {
        return ((android.adservices.ondevicepersonalization.TrainingExampleRecord) real).getTrainingExample();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.ondevicepersonalization.TrainingExampleRecord) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder wrap(android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder getReal() {
            return (android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder) real;
        }

        public android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.wrap(((android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder setResumptionToken(byte... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder.wrap(((android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder) real).setResumptionToken(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder setTrainingExample(byte... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder.wrap(((android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder) real).setTrainingExample(arg0));
        }

    }
}
