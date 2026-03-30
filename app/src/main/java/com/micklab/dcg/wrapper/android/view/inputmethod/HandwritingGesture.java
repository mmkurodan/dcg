// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class HandwritingGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HandwritingGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.HandwritingGesture wrap(android.view.inputmethod.HandwritingGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.HandwritingGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.HandwritingGesture getReal() {
        return (android.view.inputmethod.HandwritingGesture) real;
    }

    public android.view.inputmethod.HandwritingGesture unwrap() {
        return getReal();
    }

    public java.lang.String getFallbackText() {
        return ((android.view.inputmethod.HandwritingGesture) real).getFallbackText();
    }

    public static final int GRANULARITY_CHARACTER = android.view.inputmethod.HandwritingGesture.GRANULARITY_CHARACTER;
    public static final int GRANULARITY_WORD = android.view.inputmethod.HandwritingGesture.GRANULARITY_WORD;

}
