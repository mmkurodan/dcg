// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class CustomDescription {
    private final android.service.autofill.CustomDescription real;

    public CustomDescription(android.service.autofill.CustomDescription real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.CustomDescription wrap(android.service.autofill.CustomDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CustomDescription(real);
    }

    public android.service.autofill.CustomDescription unwrap() {
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
        private final android.service.autofill.CustomDescription.Builder real;

        public Builder(android.service.autofill.CustomDescription.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder wrap(android.service.autofill.CustomDescription.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder(real);
        }

        public android.service.autofill.CustomDescription.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            this(new android.service.autofill.CustomDescription.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder addChild(int arg0, com.micklab.dcg.wrapper.android.service.autofill.Transformation arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder.wrap(real.addChild(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder addOnClickAction(int arg0, com.micklab.dcg.wrapper.android.service.autofill.OnClickAction arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder.wrap(real.addOnClickAction(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder batchUpdate(com.micklab.dcg.wrapper.android.service.autofill.Validator arg0, com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder.wrap(real.batchUpdate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription build() {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.wrap(real.build());
        }

    }
}
