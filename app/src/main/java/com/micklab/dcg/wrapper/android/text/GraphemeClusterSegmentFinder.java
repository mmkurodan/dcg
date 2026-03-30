// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class GraphemeClusterSegmentFinder {
    private final android.text.GraphemeClusterSegmentFinder real;

    public GraphemeClusterSegmentFinder(android.text.GraphemeClusterSegmentFinder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.GraphemeClusterSegmentFinder wrap(android.text.GraphemeClusterSegmentFinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.GraphemeClusterSegmentFinder(real);
    }

    public android.text.GraphemeClusterSegmentFinder unwrap() {
        return real;
    }

    public GraphemeClusterSegmentFinder(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1) {
        this(new android.text.GraphemeClusterSegmentFinder(arg0, arg1 == null ? null : arg1.unwrap()));
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
