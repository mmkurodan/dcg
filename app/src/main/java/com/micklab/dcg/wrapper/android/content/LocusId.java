// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class LocusId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocusId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.LocusId wrap(android.content.LocusId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.LocusId(real, (__DcgwBridgeToken) null);
    }

    public android.content.LocusId getReal() {
        return (android.content.LocusId) real;
    }

    public android.content.LocusId unwrap() {
        return getReal();
    }

    public LocusId(java.lang.String arg0) {
        this(new android.content.LocusId(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.content.LocusId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.LocusId) real).equals(arg0);
    }

    public java.lang.String getId() {
        return ((android.content.LocusId) real).getId();
    }

    public int hashCode() {
        return ((android.content.LocusId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.content.LocusId) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.LocusId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
