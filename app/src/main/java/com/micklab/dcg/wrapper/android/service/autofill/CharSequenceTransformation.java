// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class CharSequenceTransformation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CharSequenceTransformation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation wrap(android.service.autofill.CharSequenceTransformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.CharSequenceTransformation getReal() {
        return (android.service.autofill.CharSequenceTransformation) real;
    }

    public android.service.autofill.CharSequenceTransformation unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.CharSequenceTransformation) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.CharSequenceTransformation) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.CharSequenceTransformation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder wrap(android.service.autofill.CharSequenceTransformation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.CharSequenceTransformation.Builder getReal() {
            return (android.service.autofill.CharSequenceTransformation.Builder) real;
        }

        public android.service.autofill.CharSequenceTransformation.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, java.lang.String arg2) {
            this(new android.service.autofill.CharSequenceTransformation.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder addField(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.Builder.wrap(((android.service.autofill.CharSequenceTransformation.Builder) real).addField(arg0 == null ? null : arg0.getReal(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation build() {
            return com.micklab.dcg.wrapper.android.service.autofill.CharSequenceTransformation.wrap(((android.service.autofill.CharSequenceTransformation.Builder) real).build());
        }

    }
}
