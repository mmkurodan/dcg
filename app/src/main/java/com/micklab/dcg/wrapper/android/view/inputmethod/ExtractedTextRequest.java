// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class ExtractedTextRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExtractedTextRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest wrap(android.view.inputmethod.ExtractedTextRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedTextRequest(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.ExtractedTextRequest getReal() {
        return (android.view.inputmethod.ExtractedTextRequest) real;
    }

    public android.view.inputmethod.ExtractedTextRequest unwrap() {
        return getReal();
    }

    public ExtractedTextRequest() {
        this(new android.view.inputmethod.ExtractedTextRequest(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.ExtractedTextRequest) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.ExtractedTextRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
