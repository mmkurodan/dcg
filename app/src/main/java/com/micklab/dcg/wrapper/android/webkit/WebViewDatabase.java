// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewDatabase {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebViewDatabase(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewDatabase wrap(android.webkit.WebViewDatabase real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewDatabase(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebViewDatabase getReal() {
        return (android.webkit.WebViewDatabase) real;
    }

    public android.webkit.WebViewDatabase unwrap() {
        return getReal();
    }

    public void clearFormData() {
        ((android.webkit.WebViewDatabase) real).clearFormData();
    }

    public void clearHttpAuthUsernamePassword() {
        ((android.webkit.WebViewDatabase) real).clearHttpAuthUsernamePassword();
    }

    public void clearUsernamePassword() {
        ((android.webkit.WebViewDatabase) real).clearUsernamePassword();
    }

    public java.lang.String[] getHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1) {
        return ((android.webkit.WebViewDatabase) real).getHttpAuthUsernamePassword(arg0, arg1);
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewDatabase getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebViewDatabase.wrap(android.webkit.WebViewDatabase.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public boolean hasFormData() {
        return ((android.webkit.WebViewDatabase) real).hasFormData();
    }

    public boolean hasHttpAuthUsernamePassword() {
        return ((android.webkit.WebViewDatabase) real).hasHttpAuthUsernamePassword();
    }

    public boolean hasUsernamePassword() {
        return ((android.webkit.WebViewDatabase) real).hasUsernamePassword();
    }

    public void setHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        ((android.webkit.WebViewDatabase) real).setHttpAuthUsernamePassword(arg0, arg1, arg2, arg3);
    }

}
