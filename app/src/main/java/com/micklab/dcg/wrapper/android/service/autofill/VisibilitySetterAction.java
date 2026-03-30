// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class VisibilitySetterAction {
    private final android.service.autofill.VisibilitySetterAction real;

    public VisibilitySetterAction(android.service.autofill.VisibilitySetterAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction wrap(android.service.autofill.VisibilitySetterAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction(real);
    }

    public android.service.autofill.VisibilitySetterAction unwrap() {
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
        private final android.service.autofill.VisibilitySetterAction.Builder real;

        public Builder(android.service.autofill.VisibilitySetterAction.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder wrap(android.service.autofill.VisibilitySetterAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder(real);
        }

        public android.service.autofill.VisibilitySetterAction.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1) {
            this(new android.service.autofill.VisibilitySetterAction.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction build() {
            return com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder setVisibility(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.service.autofill.VisibilitySetterAction.Builder.wrap(real.setVisibility(arg0, arg1));
        }

    }
}
