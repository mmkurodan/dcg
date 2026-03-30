// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewDatabase {
    private final android.webkit.WebViewDatabase real;

    public WebViewDatabase(android.webkit.WebViewDatabase real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewDatabase wrap(android.webkit.WebViewDatabase real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewDatabase(real);
    }

    public android.webkit.WebViewDatabase unwrap() {
        return real;
    }

    public void clearFormData() {
        real.clearFormData();
    }

    public void clearHttpAuthUsernamePassword() {
        real.clearHttpAuthUsernamePassword();
    }

    public void clearUsernamePassword() {
        real.clearUsernamePassword();
    }

    public java.lang.String[] getHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1) {
        return real.getHttpAuthUsernamePassword(arg0, arg1);
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewDatabase getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebViewDatabase.wrap(android.webkit.WebViewDatabase.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean hasFormData() {
        return real.hasFormData();
    }

    public boolean hasHttpAuthUsernamePassword() {
        return real.hasHttpAuthUsernamePassword();
    }

    public boolean hasUsernamePassword() {
        return real.hasUsernamePassword();
    }

    public void setHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        real.setHttpAuthUsernamePassword(arg0, arg1, arg2, arg3);
    }

}
