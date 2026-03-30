// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebHistoryItem {
    private final android.webkit.WebHistoryItem real;

    public WebHistoryItem(android.webkit.WebHistoryItem real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebHistoryItem wrap(android.webkit.WebHistoryItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebHistoryItem(real);
    }

    public android.webkit.WebHistoryItem unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFavicon() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getFavicon());
    }

    public java.lang.String getOriginalUrl() {
        return real.getOriginalUrl();
    }

    public java.lang.String getTitle() {
        return real.getTitle();
    }

    public java.lang.String getUrl() {
        return real.getUrl();
    }

}
