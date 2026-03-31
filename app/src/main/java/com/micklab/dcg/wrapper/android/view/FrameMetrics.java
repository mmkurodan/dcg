// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class FrameMetrics {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FrameMetrics(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.FrameMetrics wrap(android.view.FrameMetrics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.FrameMetrics(real, (__DcgwBridgeToken) null);
    }

    public android.view.FrameMetrics getReal() {
        return (android.view.FrameMetrics) real;
    }

    public android.view.FrameMetrics unwrap() {
        return getReal();
    }

    public FrameMetrics(com.micklab.dcg.wrapper.android.view.FrameMetrics arg0) {
        this(new android.view.FrameMetrics(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public long getMetric(int arg0) {
        return ((android.view.FrameMetrics) real).getMetric(arg0);
    }

    public static final int ANIMATION_DURATION = android.view.FrameMetrics.ANIMATION_DURATION;
    public static final int COMMAND_ISSUE_DURATION = android.view.FrameMetrics.COMMAND_ISSUE_DURATION;
    public static final int DEADLINE = android.view.FrameMetrics.DEADLINE;
    public static final int DRAW_DURATION = android.view.FrameMetrics.DRAW_DURATION;
    public static final int FIRST_DRAW_FRAME = android.view.FrameMetrics.FIRST_DRAW_FRAME;
    public static final int FRAME_TIMELINE_VSYNC_ID = android.view.FrameMetrics.FRAME_TIMELINE_VSYNC_ID;
    public static final int GPU_DURATION = android.view.FrameMetrics.GPU_DURATION;
    public static final int INPUT_HANDLING_DURATION = android.view.FrameMetrics.INPUT_HANDLING_DURATION;
    public static final int INTENDED_VSYNC_TIMESTAMP = android.view.FrameMetrics.INTENDED_VSYNC_TIMESTAMP;
    public static final int LAYOUT_MEASURE_DURATION = android.view.FrameMetrics.LAYOUT_MEASURE_DURATION;
    public static final int SWAP_BUFFERS_DURATION = android.view.FrameMetrics.SWAP_BUFFERS_DURATION;
    public static final int SYNC_DURATION = android.view.FrameMetrics.SYNC_DURATION;
    public static final int TOTAL_DURATION = android.view.FrameMetrics.TOTAL_DURATION;
    public static final int UNKNOWN_DELAY_DURATION = android.view.FrameMetrics.UNKNOWN_DELAY_DURATION;
    public static final int VSYNC_TIMESTAMP = android.view.FrameMetrics.VSYNC_TIMESTAMP;

}
