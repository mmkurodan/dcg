// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class WordSegmentFinder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WordSegmentFinder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.WordSegmentFinder wrap(android.text.WordSegmentFinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.WordSegmentFinder(real, (__DcgwBridgeToken) null);
    }

    public android.text.WordSegmentFinder getReal() {
        return (android.text.WordSegmentFinder) real;
    }

    public android.text.WordSegmentFinder unwrap() {
        return getReal();
    }

    public WordSegmentFinder(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.text.WordSegmentFinder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int nextEndBoundary(int arg0) {
        return ((android.text.WordSegmentFinder) real).nextEndBoundary(arg0);
    }

    public int nextStartBoundary(int arg0) {
        return ((android.text.WordSegmentFinder) real).nextStartBoundary(arg0);
    }

    public int previousEndBoundary(int arg0) {
        return ((android.text.WordSegmentFinder) real).previousEndBoundary(arg0);
    }

    public int previousStartBoundary(int arg0) {
        return ((android.text.WordSegmentFinder) real).previousStartBoundary(arg0);
    }

}
