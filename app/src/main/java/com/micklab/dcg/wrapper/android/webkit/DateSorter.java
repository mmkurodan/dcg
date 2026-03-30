// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class DateSorter {
    private final android.webkit.DateSorter real;

    public DateSorter(android.webkit.DateSorter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.DateSorter wrap(android.webkit.DateSorter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.DateSorter(real);
    }

    public android.webkit.DateSorter unwrap() {
        return real;
    }

    public DateSorter(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.webkit.DateSorter(arg0 == null ? null : arg0.unwrap()));
    }

    public long getBoundary(int arg0) {
        return real.getBoundary(arg0);
    }

    public int getIndex(long arg0) {
        return real.getIndex(arg0);
    }

    public java.lang.String getLabel(int arg0) {
        return real.getLabel(arg0);
    }

    public static final int DAY_COUNT = android.webkit.DateSorter.DAY_COUNT;

}
