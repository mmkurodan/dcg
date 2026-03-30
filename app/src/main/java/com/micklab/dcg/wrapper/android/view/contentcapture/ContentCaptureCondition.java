// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureCondition {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentCaptureCondition(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureCondition wrap(android.view.contentcapture.ContentCaptureCondition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureCondition(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.ContentCaptureCondition getReal() {
        return (android.view.contentcapture.ContentCaptureCondition) real;
    }

    public android.view.contentcapture.ContentCaptureCondition unwrap() {
        return getReal();
    }

    public ContentCaptureCondition(com.micklab.dcg.wrapper.android.content.LocusId arg0, int arg1) {
        this(new android.view.contentcapture.ContentCaptureCondition(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.contentcapture.ContentCaptureCondition) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.contentcapture.ContentCaptureCondition) real).equals(arg0);
    }

    public int getFlags() {
        return ((android.view.contentcapture.ContentCaptureCondition) real).getFlags();
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(((android.view.contentcapture.ContentCaptureCondition) real).getLocusId());
    }

    public int hashCode() {
        return ((android.view.contentcapture.ContentCaptureCondition) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.contentcapture.ContentCaptureCondition) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.contentcapture.ContentCaptureCondition) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_IS_REGEX = android.view.contentcapture.ContentCaptureCondition.FLAG_IS_REGEX;

}
