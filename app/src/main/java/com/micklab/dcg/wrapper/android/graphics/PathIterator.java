// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathIterator wrap(android.graphics.PathIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathIterator(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PathIterator getReal() {
        return (android.graphics.PathIterator) real;
    }

    public android.graphics.PathIterator unwrap() {
        return getReal();
    }

    public boolean hasNext() {
        return ((android.graphics.PathIterator) real).hasNext();
    }

    public com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment next() {
        return com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment.wrap(((android.graphics.PathIterator) real).next());
    }

    public int next(float[] arg0, int arg1) {
        return ((android.graphics.PathIterator) real).next(arg0, arg1);
    }

    public int peek() {
        return ((android.graphics.PathIterator) real).peek();
    }

    public static final int VERB_CLOSE = android.graphics.PathIterator.VERB_CLOSE;
    public static final int VERB_CONIC = android.graphics.PathIterator.VERB_CONIC;
    public static final int VERB_CUBIC = android.graphics.PathIterator.VERB_CUBIC;
    public static final int VERB_DONE = android.graphics.PathIterator.VERB_DONE;
    public static final int VERB_LINE = android.graphics.PathIterator.VERB_LINE;
    public static final int VERB_MOVE = android.graphics.PathIterator.VERB_MOVE;
    public static final int VERB_QUAD = android.graphics.PathIterator.VERB_QUAD;

    public static final class Segment {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Segment(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment wrap(android.graphics.PathIterator.Segment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.PathIterator.Segment getReal() {
            return (android.graphics.PathIterator.Segment) real;
        }

        public android.graphics.PathIterator.Segment unwrap() {
            return getReal();
        }

        public float getConicWeight() {
            return ((android.graphics.PathIterator.Segment) real).getConicWeight();
        }

        public float[] getPoints() {
            return ((android.graphics.PathIterator.Segment) real).getPoints();
        }

        public int getVerb() {
            return ((android.graphics.PathIterator.Segment) real).getVerb();
        }

    }
}
