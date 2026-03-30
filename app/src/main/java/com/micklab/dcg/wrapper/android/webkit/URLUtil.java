// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class URLUtil {
    private final android.webkit.URLUtil real;

    public URLUtil(android.webkit.URLUtil real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.URLUtil wrap(android.webkit.URLUtil real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.URLUtil(real);
    }

    public android.webkit.URLUtil unwrap() {
        return real;
    }

    public URLUtil() {
        this(new android.webkit.URLUtil());
    }

    public static java.lang.String composeSearchUrl(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return android.webkit.URLUtil.composeSearchUrl(arg0, arg1, arg2);
    }

    public static byte[] decode(byte[] arg0) throws java.lang.IllegalArgumentException {
        return android.webkit.URLUtil.decode(arg0);
    }

    public static java.lang.String guessFileName(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.URLUtil#guessFileName(java.lang.String,java.lang.String,java.lang.String)");
    }

    public static java.lang.String guessUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.guessUrl(arg0);
    }

    public static boolean isAboutUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isAboutUrl(arg0);
    }

    public static boolean isAssetUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isAssetUrl(arg0);
    }

    public static boolean isContentUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isContentUrl(arg0);
    }

    public static boolean isCookielessProxyUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isCookielessProxyUrl(arg0);
    }

    public static boolean isDataUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isDataUrl(arg0);
    }

    public static boolean isFileUrl(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.URLUtil#isFileUrl(java.lang.String)");
    }

    public static boolean isHttpUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isHttpUrl(arg0);
    }

    public static boolean isHttpsUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isHttpsUrl(arg0);
    }

    public static boolean isJavaScriptUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isJavaScriptUrl(arg0);
    }

    public static boolean isNetworkUrl(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.URLUtil#isNetworkUrl(java.lang.String)");
    }

    public static boolean isValidUrl(java.lang.String arg0) {
        return android.webkit.URLUtil.isValidUrl(arg0);
    }

    public static java.lang.String stripAnchor(java.lang.String arg0) {
        return android.webkit.URLUtil.stripAnchor(arg0);
    }

}
