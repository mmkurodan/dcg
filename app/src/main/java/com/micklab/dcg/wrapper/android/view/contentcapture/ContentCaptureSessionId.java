// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureSessionId {
    private final android.view.contentcapture.ContentCaptureSessionId real;

    public ContentCaptureSessionId(android.view.contentcapture.ContentCaptureSessionId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId wrap(android.view.contentcapture.ContentCaptureSessionId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureSessionId(real);
    }

    public android.view.contentcapture.ContentCaptureSessionId unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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
