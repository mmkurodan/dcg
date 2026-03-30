// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class OnReceiveContentListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnReceiveContentListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.OnReceiveContentListener wrap(android.view.OnReceiveContentListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.OnReceiveContentListener(real, (__DcgwBridgeToken) null);
    }

    public android.view.OnReceiveContentListener getReal() {
        return (android.view.OnReceiveContentListener) real;
    }

    public android.view.OnReceiveContentListener unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo onReceiveContent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ContentInfo arg1) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(((android.view.OnReceiveContentListener) real).onReceiveContent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

}
