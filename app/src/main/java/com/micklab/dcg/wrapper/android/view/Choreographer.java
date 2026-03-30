// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Choreographer {
    private final android.view.Choreographer real;

    public Choreographer(android.view.Choreographer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Choreographer wrap(android.view.Choreographer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer(real);
    }

    public android.view.Choreographer unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.view.Choreographer getInstance() {
        return com.micklab.dcg.wrapper.android.view.Choreographer.wrap(android.view.Choreographer.getInstance());
    }

    public void postFrameCallback(com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback arg0) {
        real.postFrameCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void postFrameCallbackDelayed(com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback arg0, long arg1) {
        real.postFrameCallbackDelayed(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void postVsyncCallback(com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback arg0) {
        real.postVsyncCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void removeFrameCallback(com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback arg0) {
        real.removeFrameCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void removeVsyncCallback(com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback arg0) {
        real.removeVsyncCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class FrameCallback {
        private final android.view.Choreographer.FrameCallback real;

        public FrameCallback(android.view.Choreographer.FrameCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback wrap(android.view.Choreographer.FrameCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.FrameCallback(real);
        }

        public android.view.Choreographer.FrameCallback unwrap() {
            return real;
        }

        public void doFrame(long arg0) {
            real.doFrame(arg0);
        }

    }
    public static final class FrameData {
        private final android.view.Choreographer.FrameData real;

        public FrameData(android.view.Choreographer.FrameData real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.FrameData wrap(android.view.Choreographer.FrameData real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.FrameData(real);
        }

        public android.view.Choreographer.FrameData unwrap() {
            return real;
        }

        public long getFrameTimeNanos() {
            return real.getFrameTimeNanos();
        }

        public android.view.Choreographer.FrameTimeline[] getFrameTimelines() {
            return real.getFrameTimelines();
        }

        public com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline getPreferredFrameTimeline() {
            return com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline.wrap(real.getPreferredFrameTimeline());
        }

    }
    public static final class FrameTimeline {
        private final android.view.Choreographer.FrameTimeline real;

        public FrameTimeline(android.view.Choreographer.FrameTimeline real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline wrap(android.view.Choreographer.FrameTimeline real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.FrameTimeline(real);
        }

        public android.view.Choreographer.FrameTimeline unwrap() {
            return real;
        }

        public long getDeadlineNanos() {
            return real.getDeadlineNanos();
        }

        public long getExpectedPresentationTimeNanos() {
            return real.getExpectedPresentationTimeNanos();
        }

        public long getVsyncId() {
            return real.getVsyncId();
        }

    }
    public static final class VsyncCallback {
        private final android.view.Choreographer.VsyncCallback real;

        public VsyncCallback(android.view.Choreographer.VsyncCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback wrap(android.view.Choreographer.VsyncCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Choreographer.VsyncCallback(real);
        }

        public android.view.Choreographer.VsyncCallback unwrap() {
            return real;
        }

        public void onVsync(com.micklab.dcg.wrapper.android.view.Choreographer.FrameData arg0) {
            real.onVsync(arg0 == null ? null : arg0.unwrap());
        }

    }
}
