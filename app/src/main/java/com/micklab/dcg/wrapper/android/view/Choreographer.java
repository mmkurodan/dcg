// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Choreographer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Choreographer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Choreographer wrap(android.view.Choreographer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer(real, (__DcgwBridgeToken) null);
    }

    public android.view.Choreographer getReal() {
        return (android.view.Choreographer) real;
    }

    public android.view.Choreographer unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.view.Choreographer getInstance() {
        return com.micklab.dcg.wrapper.android.view.Choreographer.wrap(android.view.Choreographer.getInstance());
    }

    public void postFrameCallback(com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback arg0) {
        ((android.view.Choreographer) real).postFrameCallback(arg0 == null ? null : arg0.getReal());
    }

    public void postFrameCallbackDelayed(com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback arg0, long arg1) {
        ((android.view.Choreographer) real).postFrameCallbackDelayed(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void postVsyncCallback(com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback arg0) {
        ((android.view.Choreographer) real).postVsyncCallback(arg0 == null ? null : arg0.getReal());
    }

    public void removeFrameCallback(com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback arg0) {
        ((android.view.Choreographer) real).removeFrameCallback(arg0 == null ? null : arg0.getReal());
    }

    public void removeVsyncCallback(com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback arg0) {
        ((android.view.Choreographer) real).removeVsyncCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class FrameCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FrameCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback wrap(android.view.Choreographer.FrameCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback(real, (__DcgwBridgeToken) null);
        }

        public android.view.Choreographer.FrameCallback getReal() {
            return (android.view.Choreographer.FrameCallback) real;
        }

        public android.view.Choreographer.FrameCallback unwrap() {
            return getReal();
        }

        public void doFrame(long arg0) {
            ((android.view.Choreographer.FrameCallback) real).doFrame(arg0);
        }

    }
    public static final class FrameData {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FrameData(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.FrameData wrap(android.view.Choreographer.FrameData real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.FrameData(real, (__DcgwBridgeToken) null);
        }

        public android.view.Choreographer.FrameData getReal() {
            return (android.view.Choreographer.FrameData) real;
        }

        public android.view.Choreographer.FrameData unwrap() {
            return getReal();
        }

        public long getFrameTimeNanos() {
            return ((android.view.Choreographer.FrameData) real).getFrameTimeNanos();
        }

        public android.view.Choreographer.FrameTimeline[] getFrameTimelines() {
            return ((android.view.Choreographer.FrameData) real).getFrameTimelines();
        }

        public com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline getPreferredFrameTimeline() {
            return com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline.wrap(((android.view.Choreographer.FrameData) real).getPreferredFrameTimeline());
        }

    }
    public static final class FrameTimeline {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FrameTimeline(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline wrap(android.view.Choreographer.FrameTimeline real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline(real, (__DcgwBridgeToken) null);
        }

        public android.view.Choreographer.FrameTimeline getReal() {
            return (android.view.Choreographer.FrameTimeline) real;
        }

        public android.view.Choreographer.FrameTimeline unwrap() {
            return getReal();
        }

        public long getDeadlineNanos() {
            return ((android.view.Choreographer.FrameTimeline) real).getDeadlineNanos();
        }

        public long getExpectedPresentationTimeNanos() {
            return ((android.view.Choreographer.FrameTimeline) real).getExpectedPresentationTimeNanos();
        }

        public long getVsyncId() {
            return ((android.view.Choreographer.FrameTimeline) real).getVsyncId();
        }

    }
    public static final class VsyncCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VsyncCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback wrap(android.view.Choreographer.VsyncCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback(real, (__DcgwBridgeToken) null);
        }

        public android.view.Choreographer.VsyncCallback getReal() {
            return (android.view.Choreographer.VsyncCallback) real;
        }

        public android.view.Choreographer.VsyncCallback unwrap() {
            return getReal();
        }

        public void onVsync(com.micklab.dcg.wrapper.android.view.Choreographer.FrameData arg0) {
            ((android.view.Choreographer.VsyncCallback) real).onVsync(arg0 == null ? null : arg0.getReal());
        }

    }
}
