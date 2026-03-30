// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SaveRequest {
    private final android.service.autofill.SaveRequest real;

    public SaveRequest(android.service.autofill.SaveRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SaveRequest wrap(android.service.autofill.SaveRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SaveRequest(real);
    }

    public android.service.autofill.SaveRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getClientState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getClientState());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
