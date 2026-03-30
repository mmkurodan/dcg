// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class DownloadListener {
    private final android.webkit.DownloadListener real;

    public DownloadListener(android.webkit.DownloadListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.DownloadListener wrap(android.webkit.DownloadListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.DownloadListener(real);
    }

    public android.webkit.DownloadListener unwrap() {
        return real;
    }

    public void onDownloadStart(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, long arg4) {
        real.onDownloadStart(arg0, arg1, arg2, arg3, arg4);
    }

}
