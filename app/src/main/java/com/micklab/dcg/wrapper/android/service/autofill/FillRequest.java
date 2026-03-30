// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillRequest {
    private final android.service.autofill.FillRequest real;

    public FillRequest(android.service.autofill.FillRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillRequest wrap(android.service.autofill.FillRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillRequest(real);
    }

    public android.service.autofill.FillRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getClientState() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getClientState());
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender getDelayedFillIntentSender() {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(real.getDelayedFillIntentSender());
    }

    public int getFlags() {
        return real.getFlags();
    }

    public int getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest getInlineSuggestionsRequest() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InlineSuggestionsRequest.wrap(real.getInlineSuggestionsRequest());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_COMPATIBILITY_MODE_REQUEST = android.service.autofill.FillRequest.FLAG_COMPATIBILITY_MODE_REQUEST;
    public static final int FLAG_MANUAL_REQUEST = android.service.autofill.FillRequest.FLAG_MANUAL_REQUEST;
    public static final int FLAG_SUPPORTS_FILL_DIALOG = android.service.autofill.FillRequest.FLAG_SUPPORTS_FILL_DIALOG;

}
