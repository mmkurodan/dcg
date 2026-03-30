// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathIterator {
    private final android.graphics.PathIterator real;

    public PathIterator(android.graphics.PathIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathIterator wrap(android.graphics.PathIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathIterator(real);
    }

    public android.graphics.PathIterator unwrap() {
        return real;
    }

    public boolean hasNext() {
        return real.hasNext();
    }

    public com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment next() {
        return com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment.wrap(real.next());
    }

    public int next(float[] arg0, int arg1) {
        return real.next(arg0, arg1);
    }

    public int peek() {
        return real.peek();
    }

    public static final int VERB_CLOSE = android.graphics.PathIterator.VERB_CLOSE;
    public static final int VERB_CONIC = android.graphics.PathIterator.VERB_CONIC;
    public static final int VERB_CUBIC = android.graphics.PathIterator.VERB_CUBIC;
    public static final int VERB_DONE = android.graphics.PathIterator.VERB_DONE;
    public static final int VERB_LINE = android.graphics.PathIterator.VERB_LINE;
    public static final int VERB_MOVE = android.graphics.PathIterator.VERB_MOVE;
    public static final int VERB_QUAD = android.graphics.PathIterator.VERB_QUAD;

    public static final class Segment {
        private final android.graphics.PathIterator.Segment real;

        public Segment(android.graphics.PathIterator.Segment real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment wrap(android.graphics.PathIterator.Segment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathIterator.Segment(real);
        }

        public android.graphics.PathIterator.Segment unwrap() {
            return real;
        }

        public float getConicWeight() {
            return real.getConicWeight();
        }

        public float[] getPoints() {
            return real.getPoints();
        }

        public int getVerb() {
            return real.getVerb();
        }

    }
}
