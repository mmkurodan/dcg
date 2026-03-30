// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class DataShareRequest {
    private final android.view.contentcapture.DataShareRequest real;

    public DataShareRequest(android.view.contentcapture.DataShareRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.DataShareRequest wrap(android.view.contentcapture.DataShareRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.DataShareRequest(real);
    }

    public android.view.contentcapture.DataShareRequest unwrap() {
        return real;
    }

    public DataShareRequest(com.micklab.dcg.wrapper.android.content.LocusId arg0, java.lang.String arg1) {
        this(new android.view.contentcapture.DataShareRequest(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(real.getLocusId());
    }

    public java.lang.String getMimeType() {
        return real.getMimeType();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
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


}
