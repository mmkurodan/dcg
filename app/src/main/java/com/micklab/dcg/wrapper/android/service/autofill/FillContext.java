// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FillContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillContext wrap(android.service.autofill.FillContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillContext(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.FillContext getReal() {
        return (android.service.autofill.FillContext) real;
    }

    public android.service.autofill.FillContext unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.FillContext) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getFocusedId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.service.autofill.FillContext) real).getFocusedId());
    }

    public int getRequestId() {
        return ((android.service.autofill.FillContext) real).getRequestId();
    }

    public com.micklab.dcg.wrapper.android.app.assist.AssistStructure getStructure() {
        return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.wrap(((android.service.autofill.FillContext) real).getStructure());
    }

    public java.lang.String toString() {
        return ((android.service.autofill.FillContext) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.FillContext) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
