// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureCondition {
    private final android.view.contentcapture.ContentCaptureCondition real;

    public ContentCaptureCondition(android.view.contentcapture.ContentCaptureCondition real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureCondition wrap(android.view.contentcapture.ContentCaptureCondition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureCondition(real);
    }

    public android.view.contentcapture.ContentCaptureCondition unwrap() {
        return real;
    }

    public ContentCaptureCondition(com.micklab.dcg.wrapper.android.content.LocusId arg0, int arg1) {
        this(new android.view.contentcapture.ContentCaptureCondition(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getFlags() {
        return real.getFlags();
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(real.getLocusId());
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

    public static final int FLAG_IS_REGEX = android.view.contentcapture.ContentCaptureCondition.FLAG_IS_REGEX;

}
