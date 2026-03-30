// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class CompletionInfo {
    private final android.view.inputmethod.CompletionInfo real;

    public CompletionInfo(android.view.inputmethod.CompletionInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo wrap(android.view.inputmethod.CompletionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo(real);
    }

    public android.view.inputmethod.CompletionInfo unwrap() {
        return real;
    }

    public CompletionInfo(long arg0, int arg1, java.lang.CharSequence arg2) {
        this(new android.view.inputmethod.CompletionInfo(arg0, arg1, arg2));
    }

    public CompletionInfo(long arg0, int arg1, java.lang.CharSequence arg2, java.lang.CharSequence arg3) {
        this(new android.view.inputmethod.CompletionInfo(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getId() {
        return real.getId();
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public int getPosition() {
        return real.getPosition();
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
