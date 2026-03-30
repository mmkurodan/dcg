// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewFragment {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebViewFragment(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewFragment wrap(android.webkit.WebViewFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewFragment(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebViewFragment getReal() {
        return (android.webkit.WebViewFragment) real;
    }

    public android.webkit.WebViewFragment unwrap() {
        return getReal();
    }

    public WebViewFragment() {
        this(new android.webkit.WebViewFragment(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.webkit.WebView getWebView() {
        return com.micklab.dcg.wrapper.android.webkit.WebView.wrap(((android.webkit.WebViewFragment) real).getWebView());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.webkit.WebViewFragment) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void onDestroy() {
        ((android.webkit.WebViewFragment) real).onDestroy();
    }

    public void onDestroyView() {
        ((android.webkit.WebViewFragment) real).onDestroyView();
    }

    public void onPause() {
        ((android.webkit.WebViewFragment) real).onPause();
    }

    public void onResume() {
        ((android.webkit.WebViewFragment) real).onResume();
    }

}
