// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PageRange {
    private final android.print.PageRange real;

    public PageRange(android.print.PageRange real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PageRange wrap(android.print.PageRange real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PageRange(real);
    }

    public android.print.PageRange unwrap() {
        return real;
    }

    public PageRange(int arg0, int arg1) {
        this(new android.print.PageRange(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getEnd() {
        return real.getEnd();
    }

    public int getStart() {
        return real.getStart();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.print.PageRange ALL_PAGES = com.micklab.dcg.wrapper.android.print.PageRange.wrap(android.print.PageRange.ALL_PAGES);

}
