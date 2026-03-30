// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class PluginStub {
    private final android.webkit.PluginStub real;

    public PluginStub(android.webkit.PluginStub real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.PluginStub wrap(android.webkit.PluginStub real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.PluginStub(real);
    }

    public android.webkit.PluginStub unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.View getEmbeddedView(int arg0, com.micklab.dcg.wrapper.android.content.Context arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getEmbeddedView(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View getFullScreenView(int arg0, com.micklab.dcg.wrapper.android.content.Context arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getFullScreenView(arg0, arg1 == null ? null : arg1.unwrap()));
    }

}
