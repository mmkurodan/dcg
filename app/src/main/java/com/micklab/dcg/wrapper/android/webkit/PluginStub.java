// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class PluginStub {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PluginStub(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.PluginStub wrap(android.webkit.PluginStub real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.PluginStub(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.PluginStub getReal() {
        return (android.webkit.PluginStub) real;
    }

    public android.webkit.PluginStub unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.View getEmbeddedView(int arg0, com.micklab.dcg.wrapper.android.content.Context arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.webkit.PluginStub) real).getEmbeddedView(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View getFullScreenView(int arg0, com.micklab.dcg.wrapper.android.content.Context arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.webkit.PluginStub) real).getFullScreenView(arg0, arg1 == null ? null : arg1.getReal()));
    }

}
