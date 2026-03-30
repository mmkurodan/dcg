// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class BidiClassifier {
    private final android.icu.text.BidiClassifier real;

    public BidiClassifier(android.icu.text.BidiClassifier real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.BidiClassifier wrap(android.icu.text.BidiClassifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.BidiClassifier(real);
    }

    public android.icu.text.BidiClassifier unwrap() {
        return real;
    }

    public BidiClassifier(java.lang.Object arg0) {
        this(new android.icu.text.BidiClassifier(arg0));
    }

    public int classify(int arg0) {
        return real.classify(arg0);
    }

    public java.lang.Object getContext() {
        return real.getContext();
    }

    public void setContext(java.lang.Object arg0) {
        real.setContext(arg0);
    }

}
