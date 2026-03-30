// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationSessionId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextClassificationSessionId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId wrap(android.view.textclassifier.TextClassificationSessionId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextClassificationSessionId getReal() {
        return (android.view.textclassifier.TextClassificationSessionId) real;
    }

    public android.view.textclassifier.TextClassificationSessionId unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textclassifier.TextClassificationSessionId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.textclassifier.TextClassificationSessionId) real).equals(arg0);
    }

    public java.lang.String getValue() {
        return ((android.view.textclassifier.TextClassificationSessionId) real).getValue();
    }

    public int hashCode() {
        return ((android.view.textclassifier.TextClassificationSessionId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.textclassifier.TextClassificationSessionId) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.TextClassificationSessionId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
