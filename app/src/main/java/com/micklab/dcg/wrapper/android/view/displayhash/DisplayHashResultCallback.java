// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.displayhash;

public final class DisplayHashResultCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayHashResultCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashResultCallback wrap(android.view.displayhash.DisplayHashResultCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.displayhash.DisplayHashResultCallback(real, (__DcgwBridgeToken) null);
    }

    public android.view.displayhash.DisplayHashResultCallback getReal() {
        return (android.view.displayhash.DisplayHashResultCallback) real;
    }

    public android.view.displayhash.DisplayHashResultCallback unwrap() {
        return getReal();
    }

    public void onDisplayHashError(int arg0) {
        ((android.view.displayhash.DisplayHashResultCallback) real).onDisplayHashError(arg0);
    }

    public void onDisplayHashResult(com.micklab.dcg.wrapper.android.view.displayhash.DisplayHash arg0) {
        ((android.view.displayhash.DisplayHashResultCallback) real).onDisplayHashResult(arg0 == null ? null : arg0.getReal());
    }

    public static final int DISPLAY_HASH_ERROR_INVALID_BOUNDS = android.view.displayhash.DisplayHashResultCallback.DISPLAY_HASH_ERROR_INVALID_BOUNDS;
    public static final int DISPLAY_HASH_ERROR_INVALID_HASH_ALGORITHM = android.view.displayhash.DisplayHashResultCallback.DISPLAY_HASH_ERROR_INVALID_HASH_ALGORITHM;
    public static final int DISPLAY_HASH_ERROR_MISSING_WINDOW = android.view.displayhash.DisplayHashResultCallback.DISPLAY_HASH_ERROR_MISSING_WINDOW;
    public static final int DISPLAY_HASH_ERROR_NOT_VISIBLE_ON_SCREEN = android.view.displayhash.DisplayHashResultCallback.DISPLAY_HASH_ERROR_NOT_VISIBLE_ON_SCREEN;
    public static final int DISPLAY_HASH_ERROR_TOO_MANY_REQUESTS = android.view.displayhash.DisplayHashResultCallback.DISPLAY_HASH_ERROR_TOO_MANY_REQUESTS;
    public static final int DISPLAY_HASH_ERROR_UNKNOWN = android.view.displayhash.DisplayHashResultCallback.DISPLAY_HASH_ERROR_UNKNOWN;

}
