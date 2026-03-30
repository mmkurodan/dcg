// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class CustomDescription {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CustomDescription(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.CustomDescription wrap(android.service.autofill.CustomDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CustomDescription(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.CustomDescription getReal() {
        return (android.service.autofill.CustomDescription) real;
    }

    public android.service.autofill.CustomDescription unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.CustomDescription) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.CustomDescription) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.CustomDescription) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder wrap(android.service.autofill.CustomDescription.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.CustomDescription.Builder getReal() {
            return (android.service.autofill.CustomDescription.Builder) real;
        }

        public android.service.autofill.CustomDescription.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            this(new android.service.autofill.CustomDescription.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder addChild(int arg0, com.micklab.dcg.wrapper.android.service.autofill.Transformation arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder.wrap(((android.service.autofill.CustomDescription.Builder) real).addChild(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder addOnClickAction(int arg0, com.micklab.dcg.wrapper.android.service.autofill.OnClickAction arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder.wrap(((android.service.autofill.CustomDescription.Builder) real).addOnClickAction(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder batchUpdate(com.micklab.dcg.wrapper.android.service.autofill.Validator arg0, com.micklab.dcg.wrapper.android.service.autofill.BatchUpdates arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.Builder.wrap(((android.service.autofill.CustomDescription.Builder) real).batchUpdate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.CustomDescription build() {
            return com.micklab.dcg.wrapper.android.service.autofill.CustomDescription.wrap(((android.service.autofill.CustomDescription.Builder) real).build());
        }

    }
}
