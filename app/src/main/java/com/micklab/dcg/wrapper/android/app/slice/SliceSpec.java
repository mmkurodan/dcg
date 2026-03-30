// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SliceSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceSpec wrap(android.app.slice.SliceSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceSpec(real, (__DcgwBridgeToken) null);
    }

    public android.app.slice.SliceSpec getReal() {
        return (android.app.slice.SliceSpec) real;
    }

    public android.app.slice.SliceSpec unwrap() {
        return getReal();
    }

    public SliceSpec(java.lang.String arg0, int arg1) {
        this(new android.app.slice.SliceSpec(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean canRender(com.micklab.dcg.wrapper.android.app.slice.SliceSpec arg0) {
        return ((android.app.slice.SliceSpec) real).canRender(arg0 == null ? null : arg0.getReal());
    }

    public int describeContents() {
        return ((android.app.slice.SliceSpec) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.slice.SliceSpec) real).equals(arg0);
    }

    public int getRevision() {
        return ((android.app.slice.SliceSpec) real).getRevision();
    }

    public java.lang.String getType() {
        return ((android.app.slice.SliceSpec) real).getType();
    }

    public java.lang.String toString() {
        return ((android.app.slice.SliceSpec) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.slice.SliceSpec) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
