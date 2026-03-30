// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.autofill;

public final class AutofillId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutofillId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillId wrap(android.view.autofill.AutofillId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.autofill.AutofillId(real, (__DcgwBridgeToken) null);
    }

    public android.view.autofill.AutofillId getReal() {
        return (android.view.autofill.AutofillId) real;
    }

    public android.view.autofill.AutofillId unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.view.autofill.AutofillId create(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(android.view.autofill.AutofillId.create(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public int describeContents() {
        return ((android.view.autofill.AutofillId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.autofill.AutofillId) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.view.autofill.AutofillId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.autofill.AutofillId) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.autofill.AutofillId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
