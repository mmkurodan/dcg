// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class RenderProcessGoneDetail {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderProcessGoneDetail(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.RenderProcessGoneDetail wrap(android.webkit.RenderProcessGoneDetail real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.RenderProcessGoneDetail(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.RenderProcessGoneDetail getReal() {
        return (android.webkit.RenderProcessGoneDetail) real;
    }

    public android.webkit.RenderProcessGoneDetail unwrap() {
        return getReal();
    }

    public boolean didCrash() {
        return ((android.webkit.RenderProcessGoneDetail) real).didCrash();
    }

    public int rendererPriorityAtExit() {
        return ((android.webkit.RenderProcessGoneDetail) real).rendererPriorityAtExit();
    }

}
