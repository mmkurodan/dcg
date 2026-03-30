// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class SafeBrowsingResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SafeBrowsingResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.SafeBrowsingResponse wrap(android.webkit.SafeBrowsingResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.SafeBrowsingResponse(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.SafeBrowsingResponse getReal() {
        return (android.webkit.SafeBrowsingResponse) real;
    }

    public android.webkit.SafeBrowsingResponse unwrap() {
        return getReal();
    }

    public void backToSafety(boolean arg0) {
        ((android.webkit.SafeBrowsingResponse) real).backToSafety(arg0);
    }

    public void proceed(boolean arg0) {
        ((android.webkit.SafeBrowsingResponse) real).proceed(arg0);
    }

    public void showInterstitial(boolean arg0) {
        ((android.webkit.SafeBrowsingResponse) real).showInterstitial(arg0);
    }

}
