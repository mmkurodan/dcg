// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class CookieManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CookieManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieManager wrap(android.webkit.CookieManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.CookieManager(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.CookieManager getReal() {
        return (android.webkit.CookieManager) real;
    }

    public android.webkit.CookieManager unwrap() {
        return getReal();
    }

    public boolean acceptCookie() {
        return ((android.webkit.CookieManager) real).acceptCookie();
    }

    public boolean acceptThirdPartyCookies(com.micklab.dcg.wrapper.android.webkit.WebView arg0) {
        return ((android.webkit.CookieManager) real).acceptThirdPartyCookies(arg0 == null ? null : arg0.getReal());
    }

    public static boolean allowFileSchemeCookies() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.CookieManager#allowFileSchemeCookies()");
    }

    public void flush() {
        ((android.webkit.CookieManager) real).flush();
    }

    public java.lang.String getCookie(java.lang.String arg0) {
        return ((android.webkit.CookieManager) real).getCookie(arg0);
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieManager getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.CookieManager.wrap(android.webkit.CookieManager.getInstance());
    }

    public boolean hasCookies() {
        return ((android.webkit.CookieManager) real).hasCookies();
    }

    public void removeAllCookie() {
        ((android.webkit.CookieManager) real).removeAllCookie();
    }

    public void removeExpiredCookie() {
        ((android.webkit.CookieManager) real).removeExpiredCookie();
    }

    public void removeSessionCookie() {
        ((android.webkit.CookieManager) real).removeSessionCookie();
    }

    public void setAcceptCookie(boolean arg0) {
        ((android.webkit.CookieManager) real).setAcceptCookie(arg0);
    }

    public static void setAcceptFileSchemeCookies(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.CookieManager#setAcceptFileSchemeCookies(boolean)");
    }

    public void setAcceptThirdPartyCookies(com.micklab.dcg.wrapper.android.webkit.WebView arg0, boolean arg1) {
        ((android.webkit.CookieManager) real).setAcceptThirdPartyCookies(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setCookie(java.lang.String arg0, java.lang.String arg1) {
        ((android.webkit.CookieManager) real).setCookie(arg0, arg1);
    }

}
