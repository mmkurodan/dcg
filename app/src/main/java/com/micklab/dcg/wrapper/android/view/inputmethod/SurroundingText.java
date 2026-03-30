// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class SurroundingText {
    private final android.view.inputmethod.SurroundingText real;

    public SurroundingText(android.view.inputmethod.SurroundingText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText wrap(android.view.inputmethod.SurroundingText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.SurroundingText(real);
    }

    public android.view.inputmethod.SurroundingText unwrap() {
        return real;
    }

    public SurroundingText(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        this(new android.view.inputmethod.SurroundingText(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getOffset() {
        return real.getOffset();
    }

    public int getSelectionEnd() {
        return real.getSelectionEnd();
    }

    public int getSelectionStart() {
        return real.getSelectionStart();
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
