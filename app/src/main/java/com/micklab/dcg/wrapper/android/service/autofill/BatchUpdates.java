// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class BatchUpdates {
    private final android.service.autofill.BatchUpdates real;

    public BatchUpdates(android.service.autofill.BatchUpdates real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates wrap(android.service.autofill.BatchUpdates real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates(real);
    }

    public android.service.autofill.BatchUpdates unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.service.autofill.BatchUpdates.Builder real;

        public Builder(android.service.autofill.BatchUpdates.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder wrap(android.service.autofill.BatchUpdates.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder(real);
        }

        public android.service.autofill.BatchUpdates.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.autofill.BatchUpdates.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates build() {
            return com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder transformChild(int arg0, com.micklab.dcg.wrapper.android.service.autofill.Transformation arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder.wrap(real.transformChild(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder updateTemplate(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates.Builder.wrap(real.updateTemplate(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
