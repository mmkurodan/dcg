// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class ConnectionlessHandwritingCallback {
    private final android.view.inputmethod.ConnectionlessHandwritingCallback real;

    public ConnectionlessHandwritingCallback(android.view.inputmethod.ConnectionlessHandwritingCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback wrap(android.view.inputmethod.ConnectionlessHandwritingCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.ConnectionlessHandwritingCallback(real);
    }

    public android.view.inputmethod.ConnectionlessHandwritingCallback unwrap() {
        return real;
    }

    public void onError(int arg0) {
        real.onError(arg0);
    }

    public void onResult(java.lang.CharSequence arg0) {
        real.onResult(arg0);
    }

    public static final int CONNECTIONLESS_HANDWRITING_ERROR_NO_TEXT_RECOGNIZED = android.view.inputmethod.ConnectionlessHandwritingCallback.CONNECTIONLESS_HANDWRITING_ERROR_NO_TEXT_RECOGNIZED;
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_OTHER = android.view.inputmethod.ConnectionlessHandwritingCallback.CONNECTIONLESS_HANDWRITING_ERROR_OTHER;
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_UNSUPPORTED = android.view.inputmethod.ConnectionlessHandwritingCallback.CONNECTIONLESS_HANDWRITING_ERROR_UNSUPPORTED;

}
