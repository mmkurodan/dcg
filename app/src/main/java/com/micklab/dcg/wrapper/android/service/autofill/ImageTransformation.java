// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class ImageTransformation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImageTransformation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation wrap(android.service.autofill.ImageTransformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.ImageTransformation getReal() {
        return (android.service.autofill.ImageTransformation) real;
    }

    public android.service.autofill.ImageTransformation unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.ImageTransformation) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.ImageTransformation) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.ImageTransformation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder wrap(android.service.autofill.ImageTransformation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.ImageTransformation.Builder getReal() {
            return (android.service.autofill.ImageTransformation.Builder) real;
        }

        public android.service.autofill.ImageTransformation.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, int arg2) {
            this(new android.service.autofill.ImageTransformation.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, java.util.regex.Pattern arg1, int arg2, java.lang.CharSequence arg3) {
            this(new android.service.autofill.ImageTransformation.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder.wrap(((android.service.autofill.ImageTransformation.Builder) real).addOption(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern arg0, int arg1, java.lang.CharSequence arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.Builder.wrap(((android.service.autofill.ImageTransformation.Builder) real).addOption(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation build() {
            return com.micklab.dcg.wrapper.android.service.autofill.ImageTransformation.wrap(((android.service.autofill.ImageTransformation.Builder) real).build());
        }

    }
}
