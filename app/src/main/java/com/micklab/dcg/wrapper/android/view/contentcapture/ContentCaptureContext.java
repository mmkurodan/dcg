// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureContext {
    private final android.view.contentcapture.ContentCaptureContext real;

    public ContentCaptureContext(android.view.contentcapture.ContentCaptureContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext wrap(android.view.contentcapture.ContentCaptureContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext(real);
    }

    public android.view.contentcapture.ContentCaptureContext unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext forLocusId(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.wrap(android.view.contentcapture.ContentCaptureContext.forLocusId(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(real.getLocusId());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.contentcapture.ContentCaptureContext.Builder real;

        public Builder(android.view.contentcapture.ContentCaptureContext.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder wrap(android.view.contentcapture.ContentCaptureContext.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder(real);
        }

        public android.view.contentcapture.ContentCaptureContext.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.LocusId arg0) {
            this(new android.view.contentcapture.ContentCaptureContext.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext build() {
            return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
