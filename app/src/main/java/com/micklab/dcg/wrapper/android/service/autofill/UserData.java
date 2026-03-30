// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class UserData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UserData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.UserData wrap(android.service.autofill.UserData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.UserData(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.UserData getReal() {
        return (android.service.autofill.UserData) real;
    }

    public android.service.autofill.UserData unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.UserData) real).describeContents();
    }

    public java.lang.String getFieldClassificationAlgorithm() {
        return ((android.service.autofill.UserData) real).getFieldClassificationAlgorithm();
    }

    public java.lang.String getFieldClassificationAlgorithmForCategory(java.lang.String arg0) {
        return ((android.service.autofill.UserData) real).getFieldClassificationAlgorithmForCategory(arg0);
    }

    public java.lang.String getId() {
        return ((android.service.autofill.UserData) real).getId();
    }

    public static int getMaxCategoryCount() {
        return android.service.autofill.UserData.getMaxCategoryCount();
    }

    public static int getMaxFieldClassificationIdsSize() {
        return android.service.autofill.UserData.getMaxFieldClassificationIdsSize();
    }

    public static int getMaxUserDataSize() {
        return android.service.autofill.UserData.getMaxUserDataSize();
    }

    public static int getMaxValueLength() {
        return android.service.autofill.UserData.getMaxValueLength();
    }

    public static int getMinValueLength() {
        return android.service.autofill.UserData.getMinValueLength();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.UserData) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.UserData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder wrap(android.service.autofill.UserData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.UserData.Builder getReal() {
            return (android.service.autofill.UserData.Builder) real;
        }

        public android.service.autofill.UserData.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.service.autofill.UserData.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder add(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder.wrap(((android.service.autofill.UserData.Builder) real).add(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.UserData build() {
            return com.micklab.dcg.wrapper.android.service.autofill.UserData.wrap(((android.service.autofill.UserData.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder setFieldClassificationAlgorithm(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder.wrap(((android.service.autofill.UserData.Builder) real).setFieldClassificationAlgorithm(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder setFieldClassificationAlgorithmForCategory(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            return com.micklab.dcg.wrapper.android.service.autofill.UserData.Builder.wrap(((android.service.autofill.UserData.Builder) real).setFieldClassificationAlgorithmForCategory(arg0, arg1, arg2 == null ? null : arg2.getReal()));
        }

    }
}
