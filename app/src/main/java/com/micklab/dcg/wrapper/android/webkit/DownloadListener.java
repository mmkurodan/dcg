// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class DownloadListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DownloadListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.DownloadListener wrap(android.webkit.DownloadListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.DownloadListener(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.DownloadListener getReal() {
        return (android.webkit.DownloadListener) real;
    }

    public android.webkit.DownloadListener unwrap() {
        return getReal();
    }

    public void onDownloadStart(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, long arg4) {
        ((android.webkit.DownloadListener) real).onDownloadStart(arg0, arg1, arg2, arg3, arg4);
    }

}
