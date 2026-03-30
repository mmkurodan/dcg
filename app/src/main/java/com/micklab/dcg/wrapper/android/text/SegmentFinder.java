// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SegmentFinder {
    private final android.text.SegmentFinder real;

    public SegmentFinder(android.text.SegmentFinder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SegmentFinder wrap(android.text.SegmentFinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SegmentFinder(real);
    }

    public android.text.SegmentFinder unwrap() {
        return real;
    }

    public int nextEndBoundary(int arg0) {
        return real.nextEndBoundary(arg0);
    }

    public int nextStartBoundary(int arg0) {
        return real.nextStartBoundary(arg0);
    }

    public int previousEndBoundary(int arg0) {
        return real.previousEndBoundary(arg0);
    }

    public int previousStartBoundary(int arg0) {
        return real.previousStartBoundary(arg0);
    }

    public static final int DONE = android.text.SegmentFinder.DONE;

    public static final class PrescribedSegmentFinder {
        private final android.text.SegmentFinder.PrescribedSegmentFinder real;

        public PrescribedSegmentFinder(android.text.SegmentFinder.PrescribedSegmentFinder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.SegmentFinder.PrescribedSegmentFinder wrap(android.text.SegmentFinder.PrescribedSegmentFinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.SegmentFinder.PrescribedSegmentFinder(real);
        }

        public android.text.SegmentFinder.PrescribedSegmentFinder unwrap() {
            return real;
        }

        public PrescribedSegmentFinder(int[] arg0) {
            this(new android.text.SegmentFinder.PrescribedSegmentFinder(arg0));
        }

        public int nextEndBoundary(int arg0) {
            return real.nextEndBoundary(arg0);
        }

        public int nextStartBoundary(int arg0) {
            return real.nextStartBoundary(arg0);
        }

        public int previousEndBoundary(int arg0) {
            return real.previousEndBoundary(arg0);
        }

        public int previousStartBoundary(int arg0) {
            return real.previousStartBoundary(arg0);
        }

    }
}
