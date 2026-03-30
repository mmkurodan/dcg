// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PostProcessor {
    private final android.graphics.PostProcessor real;

    public PostProcessor(android.graphics.PostProcessor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PostProcessor wrap(android.graphics.PostProcessor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PostProcessor(real);
    }

    public android.graphics.PostProcessor unwrap() {
        return real;
    }

    public int onPostProcess(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return real.onPostProcess(arg0 == null ? null : arg0.unwrap());
    }

}
