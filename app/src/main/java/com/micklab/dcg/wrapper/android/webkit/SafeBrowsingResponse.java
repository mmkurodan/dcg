// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class SafeBrowsingResponse {
    private final android.webkit.SafeBrowsingResponse real;

    public SafeBrowsingResponse(android.webkit.SafeBrowsingResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.SafeBrowsingResponse wrap(android.webkit.SafeBrowsingResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.SafeBrowsingResponse(real);
    }

    public android.webkit.SafeBrowsingResponse unwrap() {
        return real;
    }

    public void backToSafety(boolean arg0) {
        real.backToSafety(arg0);
    }

    public void proceed(boolean arg0) {
        real.proceed(arg0);
    }

    public void showInterstitial(boolean arg0) {
        real.showInterstitial(arg0);
    }

}
