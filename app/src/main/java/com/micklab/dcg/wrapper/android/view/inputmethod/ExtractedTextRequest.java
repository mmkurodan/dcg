// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class ExtractedTextRequest {
    private final android.view.inputmethod.ExtractedTextRequest real;

    public ExtractedTextRequest(android.view.inputmethod.ExtractedTextRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest wrap(android.view.inputmethod.ExtractedTextRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest(real);
    }

    public android.view.inputmethod.ExtractedTextRequest unwrap() {
        return real;
    }

    public ExtractedTextRequest() {
        this(new android.view.inputmethod.ExtractedTextRequest());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
