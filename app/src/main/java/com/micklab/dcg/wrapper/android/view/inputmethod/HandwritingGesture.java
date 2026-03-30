// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class HandwritingGesture {
    private final android.view.inputmethod.HandwritingGesture real;

    public HandwritingGesture(android.view.inputmethod.HandwritingGesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.HandwritingGesture wrap(android.view.inputmethod.HandwritingGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.HandwritingGesture(real);
    }

    public android.view.inputmethod.HandwritingGesture unwrap() {
        return real;
    }

    public java.lang.String getFallbackText() {
        return real.getFallbackText();
    }

    public static final int GRANULARITY_CHARACTER = android.view.inputmethod.HandwritingGesture.GRANULARITY_CHARACTER;
    public static final int GRANULARITY_WORD = android.view.inputmethod.HandwritingGesture.GRANULARITY_WORD;

}
