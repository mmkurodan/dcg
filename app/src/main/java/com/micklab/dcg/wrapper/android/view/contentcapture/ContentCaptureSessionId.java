// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureSessionId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentCaptureSessionId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId wrap(android.view.contentcapture.ContentCaptureSessionId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.ContentCaptureSessionId getReal() {
        return (android.view.contentcapture.ContentCaptureSessionId) real;
    }

    public android.view.contentcapture.ContentCaptureSessionId unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.contentcapture.ContentCaptureSessionId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.contentcapture.ContentCaptureSessionId) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.view.contentcapture.ContentCaptureSessionId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.contentcapture.ContentCaptureSessionId) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.contentcapture.ContentCaptureSessionId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
