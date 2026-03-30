// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class CookieManager {
    private final android.webkit.CookieManager real;

    public CookieManager(android.webkit.CookieManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieManager wrap(android.webkit.CookieManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.CookieManager(real);
    }

    public android.webkit.CookieManager unwrap() {
        return real;
    }

    public boolean acceptCookie() {
        return real.acceptCookie();
    }

    public boolean acceptThirdPartyCookies(com.micklab.dcg.wrapper.android.webkit.WebView arg0) {
        return real.acceptThirdPartyCookies(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean allowFileSchemeCookies() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.CookieManager#allowFileSchemeCookies()");
    }

    public void flush() {
        real.flush();
    }

    public java.lang.String getCookie(java.lang.String arg0) {
        return real.getCookie(arg0);
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieManager getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.CookieManager.wrap(android.webkit.CookieManager.getInstance());
    }

    public boolean hasCookies() {
        return real.hasCookies();
    }

    public void removeAllCookie() {
        real.removeAllCookie();
    }

    public void removeExpiredCookie() {
        real.removeExpiredCookie();
    }

    public void removeSessionCookie() {
        real.removeSessionCookie();
    }

    public void setAcceptCookie(boolean arg0) {
        real.setAcceptCookie(arg0);
    }

    public static void setAcceptFileSchemeCookies(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.CookieManager#setAcceptFileSchemeCookies(boolean)");
    }

    public void setAcceptThirdPartyCookies(com.micklab.dcg.wrapper.android.webkit.WebView arg0, boolean arg1) {
        real.setAcceptThirdPartyCookies(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setCookie(java.lang.String arg0, java.lang.String arg1) {
        real.setCookie(arg0, arg1);
    }

}
