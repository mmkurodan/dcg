// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PostProcessor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PostProcessor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PostProcessor wrap(android.graphics.PostProcessor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PostProcessor(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PostProcessor getReal() {
        return (android.graphics.PostProcessor) real;
    }

    public android.graphics.PostProcessor unwrap() {
        return getReal();
    }

    public int onPostProcess(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return ((android.graphics.PostProcessor) real).onPostProcess(arg0 == null ? null : arg0.getReal());
    }

}
