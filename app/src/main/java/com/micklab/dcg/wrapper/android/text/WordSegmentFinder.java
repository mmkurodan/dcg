// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class WordSegmentFinder {
    private final android.text.WordSegmentFinder real;

    public WordSegmentFinder(android.text.WordSegmentFinder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.WordSegmentFinder wrap(android.text.WordSegmentFinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.WordSegmentFinder(real);
    }

    public android.text.WordSegmentFinder unwrap() {
        return real;
    }

    public WordSegmentFinder(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.text.WordSegmentFinder(arg0, arg1 == null ? null : arg1.unwrap()));
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
