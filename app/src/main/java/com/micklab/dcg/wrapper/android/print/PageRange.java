// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PageRange {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PageRange(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PageRange wrap(android.print.PageRange real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PageRange(real, (__DcgwBridgeToken) null);
    }

    public android.print.PageRange getReal() {
        return (android.print.PageRange) real;
    }

    public android.print.PageRange unwrap() {
        return getReal();
    }

    public PageRange(int arg0, int arg1) {
        this(new android.print.PageRange(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.print.PageRange) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PageRange) real).equals(arg0);
    }

    public int getEnd() {
        return ((android.print.PageRange) real).getEnd();
    }

    public int getStart() {
        return ((android.print.PageRange) real).getStart();
    }

    public int hashCode() {
        return ((android.print.PageRange) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.print.PageRange) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PageRange) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.print.PageRange ALL_PAGES = com.micklab.dcg.wrapper.android.print.PageRange.wrap(android.print.PageRange.ALL_PAGES);

}
