// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class BidiClassifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BidiClassifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BidiClassifier wrap(android.icu.text.BidiClassifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.BidiClassifier(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.BidiClassifier getReal() {
        return (android.icu.text.BidiClassifier) real;
    }

    public android.icu.text.BidiClassifier unwrap() {
        return getReal();
    }

    public BidiClassifier(java.lang.Object arg0) {
        this(new android.icu.text.BidiClassifier(arg0), (__DcgwBridgeToken) null);
    }

    public int classify(int arg0) {
        return ((android.icu.text.BidiClassifier) real).classify(arg0);
    }

    public java.lang.Object getContext() {
        return ((android.icu.text.BidiClassifier) real).getContext();
    }

    public void setContext(java.lang.Object arg0) {
        ((android.icu.text.BidiClassifier) real).setContext(arg0);
    }

}
