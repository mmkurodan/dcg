// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class DataShareRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataShareRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.DataShareRequest wrap(android.view.contentcapture.DataShareRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataShareRequest(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.DataShareRequest getReal() {
        return (android.view.contentcapture.DataShareRequest) real;
    }

    public android.view.contentcapture.DataShareRequest unwrap() {
        return getReal();
    }

    public DataShareRequest(com.micklab.dcg.wrapper.android.content.LocusId arg0, java.lang.String arg1) {
        this(new android.view.contentcapture.DataShareRequest(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.contentcapture.DataShareRequest) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.contentcapture.DataShareRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(((android.view.contentcapture.DataShareRequest) real).getLocusId());
    }

    public java.lang.String getMimeType() {
        return ((android.view.contentcapture.DataShareRequest) real).getMimeType();
    }

    public java.lang.String getPackageName() {
        return ((android.view.contentcapture.DataShareRequest) real).getPackageName();
    }

    public int hashCode() {
        return ((android.view.contentcapture.DataShareRequest) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.contentcapture.DataShareRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.contentcapture.DataShareRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
