// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebViewClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewClient wrap(android.webkit.WebViewClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewClient(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebViewClient getReal() {
        return (android.webkit.WebViewClient) real;
    }

    public android.webkit.WebViewClient unwrap() {
        return getReal();
    }

    public WebViewClient() {
        this(new android.webkit.WebViewClient(), (__DcgwBridgeToken) null);
    }

    public void doUpdateVisitedHistory(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, boolean arg2) {
        ((android.webkit.WebViewClient) real).doUpdateVisitedHistory(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onFormResubmission(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.os.Message arg1, com.micklab.dcg.wrapper.android.os.Message arg2) {
        ((android.webkit.WebViewClient) real).onFormResubmission(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onLoadResource(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1) {
        ((android.webkit.WebViewClient) real).onLoadResource(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onPageCommitVisible(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1) {
        ((android.webkit.WebViewClient) real).onPageCommitVisible(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onPageFinished(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1) {
        ((android.webkit.WebViewClient) real).onPageFinished(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onPageStarted(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap arg2) {
        ((android.webkit.WebViewClient) real).onPageStarted(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onReceivedClientCertRequest(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.ClientCertRequest arg1) {
        ((android.webkit.WebViewClient) real).onReceivedClientCertRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onReceivedError(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebResourceRequest arg1, com.micklab.dcg.wrapper.android.webkit.WebResourceError arg2) {
        ((android.webkit.WebViewClient) real).onReceivedError(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onReceivedError(com.micklab.dcg.wrapper.android.webkit.WebView arg0, int arg1, java.lang.String arg2, java.lang.String arg3) {
        ((android.webkit.WebViewClient) real).onReceivedError(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onReceivedHttpAuthRequest(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.HttpAuthHandler arg1, java.lang.String arg2, java.lang.String arg3) {
        ((android.webkit.WebViewClient) real).onReceivedHttpAuthRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void onReceivedHttpError(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebResourceRequest arg1, com.micklab.dcg.wrapper.android.webkit.WebResourceResponse arg2) {
        ((android.webkit.WebViewClient) real).onReceivedHttpError(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onReceivedLoginRequest(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        ((android.webkit.WebViewClient) real).onReceivedLoginRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onReceivedSslError(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.SslErrorHandler arg1, com.micklab.dcg.wrapper.android.net.http.SslError arg2) {
        ((android.webkit.WebViewClient) real).onReceivedSslError(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean onRenderProcessGone(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.RenderProcessGoneDetail arg1) {
        return ((android.webkit.WebViewClient) real).onRenderProcessGone(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onSafeBrowsingHit(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebResourceRequest arg1, int arg2, com.micklab.dcg.wrapper.android.webkit.SafeBrowsingResponse arg3) {
        ((android.webkit.WebViewClient) real).onSafeBrowsingHit(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onScaleChanged(com.micklab.dcg.wrapper.android.webkit.WebView arg0, float arg1, float arg2) {
        ((android.webkit.WebViewClient) real).onScaleChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onTooManyRedirects(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.os.Message arg1, com.micklab.dcg.wrapper.android.os.Message arg2) {
        ((android.webkit.WebViewClient) real).onTooManyRedirects(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onUnhandledKeyEvent(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        ((android.webkit.WebViewClient) real).onUnhandledKeyEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebResourceResponse shouldInterceptRequest(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebResourceRequest arg1) {
        return com.micklab.dcg.wrapper.android.webkit.WebResourceResponse.wrap(((android.webkit.WebViewClient) real).shouldInterceptRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.webkit.WebResourceResponse shouldInterceptRequest(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.webkit.WebResourceResponse.wrap(((android.webkit.WebViewClient) real).shouldInterceptRequest(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public boolean shouldOverrideKeyEvent(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.webkit.WebViewClient) real).shouldOverrideKeyEvent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean shouldOverrideUrlLoading(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebResourceRequest arg1) {
        return ((android.webkit.WebViewClient) real).shouldOverrideUrlLoading(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean shouldOverrideUrlLoading(com.micklab.dcg.wrapper.android.webkit.WebView arg0, java.lang.String arg1) {
        return ((android.webkit.WebViewClient) real).shouldOverrideUrlLoading(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ERROR_AUTHENTICATION = android.webkit.WebViewClient.ERROR_AUTHENTICATION;
    public static final int ERROR_BAD_URL = android.webkit.WebViewClient.ERROR_BAD_URL;
    public static final int ERROR_CONNECT = android.webkit.WebViewClient.ERROR_CONNECT;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = android.webkit.WebViewClient.ERROR_FAILED_SSL_HANDSHAKE;
    public static final int ERROR_HOST_LOOKUP = android.webkit.WebViewClient.ERROR_HOST_LOOKUP;
    public static final int ERROR_IO = android.webkit.WebViewClient.ERROR_IO;
    public static final int ERROR_PROXY_AUTHENTICATION = android.webkit.WebViewClient.ERROR_PROXY_AUTHENTICATION;
    public static final int ERROR_REDIRECT_LOOP = android.webkit.WebViewClient.ERROR_REDIRECT_LOOP;
    public static final int ERROR_TIMEOUT = android.webkit.WebViewClient.ERROR_TIMEOUT;
    public static final int ERROR_TOO_MANY_REQUESTS = android.webkit.WebViewClient.ERROR_TOO_MANY_REQUESTS;
    public static final int ERROR_UNKNOWN = android.webkit.WebViewClient.ERROR_UNKNOWN;
    public static final int ERROR_UNSAFE_RESOURCE = android.webkit.WebViewClient.ERROR_UNSAFE_RESOURCE;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = android.webkit.WebViewClient.ERROR_UNSUPPORTED_AUTH_SCHEME;
    public static final int ERROR_UNSUPPORTED_SCHEME = android.webkit.WebViewClient.ERROR_UNSUPPORTED_SCHEME;
    public static final int SAFE_BROWSING_THREAT_BILLING = android.webkit.WebViewClient.SAFE_BROWSING_THREAT_BILLING;
    public static final int SAFE_BROWSING_THREAT_MALWARE = android.webkit.WebViewClient.SAFE_BROWSING_THREAT_MALWARE;
    public static final int SAFE_BROWSING_THREAT_PHISHING = android.webkit.WebViewClient.SAFE_BROWSING_THREAT_PHISHING;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = android.webkit.WebViewClient.SAFE_BROWSING_THREAT_UNKNOWN;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = android.webkit.WebViewClient.SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE;

}
