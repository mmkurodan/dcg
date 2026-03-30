// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SaveRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SaveRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SaveRequest wrap(android.service.autofill.SaveRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SaveRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.SaveRequest getReal() {
        return (android.service.autofill.SaveRequest) real;
    }

    public android.service.autofill.SaveRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.SaveRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getClientState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.autofill.SaveRequest) real).getClientState());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.SaveRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
