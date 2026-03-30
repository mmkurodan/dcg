// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class ModelDownloadListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ModelDownloadListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.ModelDownloadListener wrap(android.speech.ModelDownloadListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.ModelDownloadListener(real, (__DcgwBridgeToken) null);
    }

    public android.speech.ModelDownloadListener getReal() {
        return (android.speech.ModelDownloadListener) real;
    }

    public android.speech.ModelDownloadListener unwrap() {
        return getReal();
    }

    public void onError(int arg0) {
        ((android.speech.ModelDownloadListener) real).onError(arg0);
    }

    public void onProgress(int arg0) {
        ((android.speech.ModelDownloadListener) real).onProgress(arg0);
    }

    public void onScheduled() {
        ((android.speech.ModelDownloadListener) real).onScheduled();
    }

    public void onSuccess() {
        ((android.speech.ModelDownloadListener) real).onSuccess();
    }

}
