// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class DateSorter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateSorter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.DateSorter wrap(android.webkit.DateSorter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.DateSorter(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.DateSorter getReal() {
        return (android.webkit.DateSorter) real;
    }

    public android.webkit.DateSorter unwrap() {
        return getReal();
    }

    public DateSorter(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.webkit.DateSorter(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public long getBoundary(int arg0) {
        return ((android.webkit.DateSorter) real).getBoundary(arg0);
    }

    public int getIndex(long arg0) {
        return ((android.webkit.DateSorter) real).getIndex(arg0);
    }

    public java.lang.String getLabel(int arg0) {
        return ((android.webkit.DateSorter) real).getLabel(arg0);
    }

    public static final int DAY_COUNT = android.webkit.DateSorter.DAY_COUNT;

}
