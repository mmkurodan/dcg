// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class OnReceiveContentListener {
    private final android.view.OnReceiveContentListener real;

    public OnReceiveContentListener(android.view.OnReceiveContentListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.OnReceiveContentListener wrap(android.view.OnReceiveContentListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.OnReceiveContentListener(real);
    }

    public android.view.OnReceiveContentListener unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.ContentInfo onReceiveContent(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ContentInfo arg1) {
        return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(real.onReceiveContent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

}
