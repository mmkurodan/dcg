// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewFragment {
    private final android.webkit.WebViewFragment real;

    public WebViewFragment(android.webkit.WebViewFragment real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewFragment wrap(android.webkit.WebViewFragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewFragment(real);
    }

    public android.webkit.WebViewFragment unwrap() {
        return real;
    }

    public WebViewFragment() {
        this(new android.webkit.WebViewFragment());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebView getWebView() {
        return com.micklab.dcg.wrapper.android.webkit.WebView.wrap(real.getWebView());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onDestroyView() {
        real.onDestroyView();
    }

    public void onPause() {
        real.onPause();
    }

    public void onResume() {
        real.onResume();
    }

}
