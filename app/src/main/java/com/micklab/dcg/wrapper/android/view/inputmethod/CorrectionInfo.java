// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class CorrectionInfo {
    private final android.view.inputmethod.CorrectionInfo real;

    public CorrectionInfo(android.view.inputmethod.CorrectionInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo wrap(android.view.inputmethod.CorrectionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.CorrectionInfo(real);
    }

    public android.view.inputmethod.CorrectionInfo unwrap() {
        return real;
    }

    public CorrectionInfo(int arg0, java.lang.CharSequence arg1, java.lang.CharSequence arg2) {
        this(new android.view.inputmethod.CorrectionInfo(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.CharSequence getNewText() {
        return real.getNewText();
    }

    public int getOffset() {
        return real.getOffset();
    }

    public java.lang.CharSequence getOldText() {
        return real.getOldText();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
