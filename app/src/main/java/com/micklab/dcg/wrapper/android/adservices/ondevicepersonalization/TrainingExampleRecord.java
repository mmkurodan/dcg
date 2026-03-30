// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingExampleRecord {
    private final android.adservices.ondevicepersonalization.TrainingExampleRecord real;

    public TrainingExampleRecord(android.adservices.ondevicepersonalization.TrainingExampleRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord wrap(android.adservices.ondevicepersonalization.TrainingExampleRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord(real);
    }

    public android.adservices.ondevicepersonalization.TrainingExampleRecord unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public byte[] getResumptionToken() {
        return real.getResumptionToken();
    }

    public byte[] getTrainingExample() {
        return real.getTrainingExample();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder real;

        public Builder(android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder wrap(android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder(real);
        }

        public android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder setResumptionToken(byte... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder.wrap(real.setResumptionToken(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder setTrainingExample(byte... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord.Builder.wrap(real.setTrainingExample(arg0));
        }

    }
}
