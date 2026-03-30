// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebBackForwardList {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebBackForwardList(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebBackForwardList wrap(android.webkit.WebBackForwardList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebBackForwardList(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebBackForwardList getReal() {
        return (android.webkit.WebBackForwardList) real;
    }

    public android.webkit.WebBackForwardList unwrap() {
        return getReal();
    }

    public int getCurrentIndex() {
        return ((android.webkit.WebBackForwardList) real).getCurrentIndex();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebHistoryItem getCurrentItem() {
        return com.micklab.dcg.wrapper.android.webkit.WebHistoryItem.wrap(((android.webkit.WebBackForwardList) real).getCurrentItem());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebHistoryItem getItemAtIndex(int arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebHistoryItem.wrap(((android.webkit.WebBackForwardList) real).getItemAtIndex(arg0));
    }

    public int getSize() {
        return ((android.webkit.WebBackForwardList) real).getSize();
    }

}
