// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class FrameStats {
    private final android.view.FrameStats real;

    public FrameStats(android.view.FrameStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.FrameStats wrap(android.view.FrameStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.FrameStats(real);
    }

    public android.view.FrameStats unwrap() {
        return real;
    }

    public long getEndTimeNano() {
        return real.getEndTimeNano();
    }

    public int getFrameCount() {
        return real.getFrameCount();
    }

    public long getFramePresentedTimeNano(int arg0) {
        return real.getFramePresentedTimeNano(arg0);
    }

    public long getRefreshPeriodNano() {
        return real.getRefreshPeriodNano();
    }

    public long getStartTimeNano() {
        return real.getStartTimeNano();
    }

    public static final long UNDEFINED_TIME_NANO = android.view.FrameStats.UNDEFINED_TIME_NANO;

}
