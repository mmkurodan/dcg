// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebHistoryItem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebHistoryItem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebHistoryItem wrap(android.webkit.WebHistoryItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebHistoryItem(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebHistoryItem getReal() {
        return (android.webkit.WebHistoryItem) real;
    }

    public android.webkit.WebHistoryItem unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFavicon() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.webkit.WebHistoryItem) real).getFavicon());
    }

    public java.lang.String getOriginalUrl() {
        return ((android.webkit.WebHistoryItem) real).getOriginalUrl();
    }

    public java.lang.String getTitle() {
        return ((android.webkit.WebHistoryItem) real).getTitle();
    }

    public java.lang.String getUrl() {
        return ((android.webkit.WebHistoryItem) real).getUrl();
    }

}
