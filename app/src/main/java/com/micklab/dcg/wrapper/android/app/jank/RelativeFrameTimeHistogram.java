// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.jank;

public final class RelativeFrameTimeHistogram {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RelativeFrameTimeHistogram(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.jank.RelativeFrameTimeHistogram wrap(android.app.jank.RelativeFrameTimeHistogram real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.jank.RelativeFrameTimeHistogram(real, (__DcgwBridgeToken) null);
    }

    public android.app.jank.RelativeFrameTimeHistogram getReal() {
        return (android.app.jank.RelativeFrameTimeHistogram) real;
    }

    public android.app.jank.RelativeFrameTimeHistogram unwrap() {
        return getReal();
    }

    public RelativeFrameTimeHistogram() {
        this(new android.app.jank.RelativeFrameTimeHistogram(), (__DcgwBridgeToken) null);
    }

    public void addRelativeFrameTimeMillis(int arg0) {
        ((android.app.jank.RelativeFrameTimeHistogram) real).addRelativeFrameTimeMillis(arg0);
    }

    public int[] getBucketCounters() {
        return ((android.app.jank.RelativeFrameTimeHistogram) real).getBucketCounters();
    }

    public int[] getBucketEndpointsMillis() {
        return ((android.app.jank.RelativeFrameTimeHistogram) real).getBucketEndpointsMillis();
    }

}
