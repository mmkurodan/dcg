// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class RenderProcessGoneDetail {
    private final android.webkit.RenderProcessGoneDetail real;

    public RenderProcessGoneDetail(android.webkit.RenderProcessGoneDetail real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.RenderProcessGoneDetail wrap(android.webkit.RenderProcessGoneDetail real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.RenderProcessGoneDetail(real);
    }

    public android.webkit.RenderProcessGoneDetail unwrap() {
        return real;
    }

    public boolean didCrash() {
        return real.didCrash();
    }

    public int rendererPriorityAtExit() {
        return real.rendererPriorityAtExit();
    }

}
