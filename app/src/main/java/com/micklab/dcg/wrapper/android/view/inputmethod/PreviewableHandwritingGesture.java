// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class PreviewableHandwritingGesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreviewableHandwritingGesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.PreviewableHandwritingGesture wrap(android.view.inputmethod.PreviewableHandwritingGesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.PreviewableHandwritingGesture(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.PreviewableHandwritingGesture getReal() {
        return (android.view.inputmethod.PreviewableHandwritingGesture) real;
    }

    public android.view.inputmethod.PreviewableHandwritingGesture unwrap() {
        return getReal();
    }

}
