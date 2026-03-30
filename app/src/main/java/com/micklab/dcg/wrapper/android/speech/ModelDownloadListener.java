// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class ModelDownloadListener {
    private final android.speech.ModelDownloadListener real;

    public ModelDownloadListener(android.speech.ModelDownloadListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.ModelDownloadListener wrap(android.speech.ModelDownloadListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.ModelDownloadListener(real);
    }

    public android.speech.ModelDownloadListener unwrap() {
        return real;
    }

    public void onError(int arg0) {
        real.onError(arg0);
    }

    public void onProgress(int arg0) {
        real.onProgress(arg0);
    }

    public void onScheduled() {
        real.onScheduled();
    }

    public void onSuccess() {
        real.onSuccess();
    }

}
