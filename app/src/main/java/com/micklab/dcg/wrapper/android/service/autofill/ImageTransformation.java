// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class ImageTransformation {
    private final android.service.autofill.ImageTransformation real;

    public ImageTransformation(android.service.autofill.ImageTransformation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation wrap(android.service.autofill.ImageTransformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation(real);
    }

    public android.service.autofill.ImageTransformation unwrap() {
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
        private final android.service.autofill.ImageTransformation.Builder real;

        public Builder(android.service.autofill.ImageTransformation.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder wrap(android.service.autofill.ImageTransformation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder(real);
        }

        public android.service.autofill.ImageTransformation.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, int arg2) {
            this(new android.service.autofill.ImageTransformation.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, int arg2, java.lang.CharSequence arg3) {
            this(new android.service.autofill.ImageTransformation.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder.wrap(real.addOption(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern arg0, int arg1, java.lang.CharSequence arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder.wrap(real.addOption(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation build() {
            return com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.wrap(real.build());
        }

    }
}
