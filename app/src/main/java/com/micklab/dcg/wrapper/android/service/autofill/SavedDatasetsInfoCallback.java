// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SavedDatasetsInfoCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SavedDatasetsInfoCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfoCallback wrap(android.service.autofill.SavedDatasetsInfoCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfoCallback(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.SavedDatasetsInfoCallback getReal() {
        return (android.service.autofill.SavedDatasetsInfoCallback) real;
    }

    public android.service.autofill.SavedDatasetsInfoCallback unwrap() {
        return getReal();
    }

    public void onError(int arg0) {
        ((android.service.autofill.SavedDatasetsInfoCallback) real).onError(arg0);
    }

    public static final int ERROR_NEEDS_USER_ACTION = android.service.autofill.SavedDatasetsInfoCallback.ERROR_NEEDS_USER_ACTION;
    public static final int ERROR_OTHER = android.service.autofill.SavedDatasetsInfoCallback.ERROR_OTHER;
    public static final int ERROR_UNSUPPORTED = android.service.autofill.SavedDatasetsInfoCallback.ERROR_UNSUPPORTED;

}
