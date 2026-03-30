// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SavedDatasetsInfoCallback {
    private final android.service.autofill.SavedDatasetsInfoCallback real;

    public SavedDatasetsInfoCallback(android.service.autofill.SavedDatasetsInfoCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfoCallback wrap(android.service.autofill.SavedDatasetsInfoCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SavedDatasetsInfoCallback(real);
    }

    public android.service.autofill.SavedDatasetsInfoCallback unwrap() {
        return real;
    }

    public void onError(int arg0) {
        real.onError(arg0);
    }

    public static final int ERROR_NEEDS_USER_ACTION = android.service.autofill.SavedDatasetsInfoCallback.ERROR_NEEDS_USER_ACTION;
    public static final int ERROR_OTHER = android.service.autofill.SavedDatasetsInfoCallback.ERROR_OTHER;
    public static final int ERROR_UNSUPPORTED = android.service.autofill.SavedDatasetsInfoCallback.ERROR_UNSUPPORTED;

}
