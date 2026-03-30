// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillContext {
    private final android.service.autofill.FillContext real;

    public FillContext(android.service.autofill.FillContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillContext wrap(android.service.autofill.FillContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillContext(real);
    }

    public android.service.autofill.FillContext unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getFocusedId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.getFocusedId());
    }

    public int getRequestId() {
        return real.getRequestId();
    }

    public com.micklab.dcg.wrapper.android.app.assist.AssistStructure getStructure() {
        return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.wrap(real.getStructure());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
