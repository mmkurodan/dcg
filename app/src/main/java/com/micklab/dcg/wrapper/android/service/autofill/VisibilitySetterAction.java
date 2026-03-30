// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class VisibilitySetterAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VisibilitySetterAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction wrap(android.service.autofill.VisibilitySetterAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.VisibilitySetterAction getReal() {
        return (android.service.autofill.VisibilitySetterAction) real;
    }

    public android.service.autofill.VisibilitySetterAction unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.VisibilitySetterAction) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.VisibilitySetterAction) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.VisibilitySetterAction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder wrap(android.service.autofill.VisibilitySetterAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.VisibilitySetterAction.Builder getReal() {
            return (android.service.autofill.VisibilitySetterAction.Builder) real;
        }

        public android.service.autofill.VisibilitySetterAction.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1) {
            this(new android.service.autofill.VisibilitySetterAction.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction build() {
            return com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.wrap(((android.service.autofill.VisibilitySetterAction.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder setVisibility(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder.wrap(((android.service.autofill.VisibilitySetterAction.Builder) real).setVisibility(arg0, arg1));
        }

    }
}
