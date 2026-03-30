// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class GraphemeClusterSegmentFinder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GraphemeClusterSegmentFinder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.GraphemeClusterSegmentFinder wrap(android.text.GraphemeClusterSegmentFinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.GraphemeClusterSegmentFinder(real, (__DcgwBridgeToken) null);
    }

    public android.text.GraphemeClusterSegmentFinder getReal() {
        return (android.text.GraphemeClusterSegmentFinder) real;
    }

    public android.text.GraphemeClusterSegmentFinder unwrap() {
        return getReal();
    }

    public GraphemeClusterSegmentFinder(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1) {
        this(new android.text.GraphemeClusterSegmentFinder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int nextEndBoundary(int arg0) {
        return ((android.text.GraphemeClusterSegmentFinder) real).nextEndBoundary(arg0);
    }

    public int nextStartBoundary(int arg0) {
        return ((android.text.GraphemeClusterSegmentFinder) real).nextStartBoundary(arg0);
    }

    public int previousEndBoundary(int arg0) {
        return ((android.text.GraphemeClusterSegmentFinder) real).previousEndBoundary(arg0);
    }

    public int previousStartBoundary(int arg0) {
        return ((android.text.GraphemeClusterSegmentFinder) real).previousStartBoundary(arg0);
    }

}
