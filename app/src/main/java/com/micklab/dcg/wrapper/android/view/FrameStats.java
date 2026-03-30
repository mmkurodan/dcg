// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class FrameStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FrameStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.FrameStats wrap(android.view.FrameStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.FrameStats(real, (__DcgwBridgeToken) null);
    }

    public android.view.FrameStats getReal() {
        return (android.view.FrameStats) real;
    }

    public android.view.FrameStats unwrap() {
        return getReal();
    }

    public long getEndTimeNano() {
        return ((android.view.FrameStats) real).getEndTimeNano();
    }

    public int getFrameCount() {
        return ((android.view.FrameStats) real).getFrameCount();
    }

    public long getFramePresentedTimeNano(int arg0) {
        return ((android.view.FrameStats) real).getFramePresentedTimeNano(arg0);
    }

    public long getRefreshPeriodNano() {
        return ((android.view.FrameStats) real).getRefreshPeriodNano();
    }

    public long getStartTimeNano() {
        return ((android.view.FrameStats) real).getStartTimeNano();
    }

    public static final long UNDEFINED_TIME_NANO = android.view.FrameStats.UNDEFINED_TIME_NANO;

}
