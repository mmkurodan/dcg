// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebBackForwardList {
    private final android.webkit.WebBackForwardList real;

    public WebBackForwardList(android.webkit.WebBackForwardList real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebBackForwardList wrap(android.webkit.WebBackForwardList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebBackForwardList(real);
    }

    public android.webkit.WebBackForwardList unwrap() {
        return real;
    }

    public int getCurrentIndex() {
        return real.getCurrentIndex();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebHistoryItem getCurrentItem() {
        return com.micklab.dcg.wrapper.android.webkit.WebHistoryItem.wrap(real.getCurrentItem());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebHistoryItem getItemAtIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebHistoryItem.wrap(real.getItemAtIndex(arg0));
    }

    public int getSize() {
        return real.getSize();
    }

}
