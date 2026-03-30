// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class SegmentFinder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SegmentFinder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.SegmentFinder wrap(android.text.SegmentFinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.SegmentFinder(real, (__DcgwBridgeToken) null);
    }

    public android.text.SegmentFinder getReal() {
        return (android.text.SegmentFinder) real;
    }

    public android.text.SegmentFinder unwrap() {
        return getReal();
    }

    public int nextEndBoundary(int arg0) {
        return ((android.text.SegmentFinder) real).nextEndBoundary(arg0);
    }

    public int nextStartBoundary(int arg0) {
        return ((android.text.SegmentFinder) real).nextStartBoundary(arg0);
    }

    public int previousEndBoundary(int arg0) {
        return ((android.text.SegmentFinder) real).previousEndBoundary(arg0);
    }

    public int previousStartBoundary(int arg0) {
        return ((android.text.SegmentFinder) real).previousStartBoundary(arg0);
    }

    public static final int DONE = android.text.SegmentFinder.DONE;

    public static final class PrescribedSegmentFinder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PrescribedSegmentFinder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.SegmentFinder.PrescribedSegmentFinder wrap(android.text.SegmentFinder.PrescribedSegmentFinder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.SegmentFinder.PrescribedSegmentFinder(real, (__DcgwBridgeToken) null);
        }

        public android.text.SegmentFinder.PrescribedSegmentFinder getReal() {
            return (android.text.SegmentFinder.PrescribedSegmentFinder) real;
        }

        public android.text.SegmentFinder.PrescribedSegmentFinder unwrap() {
            return getReal();
        }

        public PrescribedSegmentFinder(int[] arg0) {
            this(new android.text.SegmentFinder.PrescribedSegmentFinder(arg0), (__DcgwBridgeToken) null);
        }

        public int nextEndBoundary(int arg0) {
            return ((android.text.SegmentFinder.PrescribedSegmentFinder) real).nextEndBoundary(arg0);
        }

        public int nextStartBoundary(int arg0) {
            return ((android.text.SegmentFinder.PrescribedSegmentFinder) real).nextStartBoundary(arg0);
        }

        public int previousEndBoundary(int arg0) {
            return ((android.text.SegmentFinder.PrescribedSegmentFinder) real).previousEndBoundary(arg0);
        }

        public int previousStartBoundary(int arg0) {
            return ((android.text.SegmentFinder.PrescribedSegmentFinder) real).previousStartBoundary(arg0);
        }

    }
}
