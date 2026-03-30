// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceMetrics {
    private final android.app.slice.SliceMetrics real;

    public SliceMetrics(android.app.slice.SliceMetrics real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceMetrics wrap(android.app.slice.SliceMetrics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceMetrics(real);
    }

    public android.app.slice.SliceMetrics unwrap() {
        return real;
    }

    public SliceMetrics(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        this(new android.app.slice.SliceMetrics(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void logHidden() {
        real.logHidden();
    }

    public void logTouch(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.logTouch(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void logVisible() {
        real.logVisible();
    }

}
