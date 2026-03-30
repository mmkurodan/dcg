// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class ExtractedText {
    private final android.view.inputmethod.ExtractedText real;

    public ExtractedText(android.view.inputmethod.ExtractedText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText wrap(android.view.inputmethod.ExtractedText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.ExtractedText(real);
    }

    public android.view.inputmethod.ExtractedText unwrap() {
        return real;
    }

    public ExtractedText() {
        this(new android.view.inputmethod.ExtractedText());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_SELECTING = android.view.inputmethod.ExtractedText.FLAG_SELECTING;
    public static final int FLAG_SINGLE_LINE = android.view.inputmethod.ExtractedText.FLAG_SINGLE_LINE;

}
