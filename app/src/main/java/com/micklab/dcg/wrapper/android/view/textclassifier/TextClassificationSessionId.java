// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationSessionId {
    private final android.view.textclassifier.TextClassificationSessionId real;

    public TextClassificationSessionId(android.view.textclassifier.TextClassificationSessionId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId wrap(android.view.textclassifier.TextClassificationSessionId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId(real);
    }

    public android.view.textclassifier.TextClassificationSessionId unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getValue() {
        return real.getValue();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
