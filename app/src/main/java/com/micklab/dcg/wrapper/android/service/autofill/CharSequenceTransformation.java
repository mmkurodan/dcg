// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class CharSequenceTransformation {
    private final android.service.autofill.CharSequenceTransformation real;

    public CharSequenceTransformation(android.service.autofill.CharSequenceTransformation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation wrap(android.service.autofill.CharSequenceTransformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation(real);
    }

    public android.service.autofill.CharSequenceTransformation unwrap() {
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
        private final android.service.autofill.CharSequenceTransformation.Builder real;

        public Builder(android.service.autofill.CharSequenceTransformation.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder wrap(android.service.autofill.CharSequenceTransformation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder(real);
        }

        public android.service.autofill.CharSequenceTransformation.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, java.lang.String arg2) {
            this(new android.service.autofill.CharSequenceTransformation.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder addField(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder.wrap(real.addField(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation build() {
            return com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.wrap(real.build());
        }

    }
}
