// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FillRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillRequest wrap(android.service.autofill.FillRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.FillRequest getReal() {
        return (android.service.autofill.FillRequest) real;
    }

    public android.service.autofill.FillRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.autofill.FillRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getClientState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.autofill.FillRequest) real).getClientState());
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender getDelayedFillIntentSender() {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(((android.service.autofill.FillRequest) real).getDelayedFillIntentSender());
    }

    public int getFlags() {
        return ((android.service.autofill.FillRequest) real).getFlags();
    }

    public int getId() {
        return ((android.service.autofill.FillRequest) real).getId();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest getInlineSuggestionsRequest() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.wrap(((android.service.autofill.FillRequest) real).getInlineSuggestionsRequest());
    }

    public java.lang.String toString() {
        return ((android.service.autofill.FillRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.autofill.FillRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_COMPATIBILITY_MODE_REQUEST = android.service.autofill.FillRequest.FLAG_COMPATIBILITY_MODE_REQUEST;
    public static final int FLAG_MANUAL_REQUEST = android.service.autofill.FillRequest.FLAG_MANUAL_REQUEST;
    public static final int FLAG_SUPPORTS_FILL_DIALOG = android.service.autofill.FillRequest.FLAG_SUPPORTS_FILL_DIALOG;

}
