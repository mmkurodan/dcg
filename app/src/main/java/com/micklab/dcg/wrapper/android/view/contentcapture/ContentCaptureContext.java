// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.contentcapture;

public final class ContentCaptureContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentCaptureContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext wrap(android.view.contentcapture.ContentCaptureContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext(real, (__DcgwBridgeToken) null);
    }

    public android.view.contentcapture.ContentCaptureContext getReal() {
        return (android.view.contentcapture.ContentCaptureContext) real;
    }

    public android.view.contentcapture.ContentCaptureContext unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.contentcapture.ContentCaptureContext) real).describeContents();
    }

    public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext forLocusId(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.wrap(android.view.contentcapture.ContentCaptureContext.forLocusId(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.contentcapture.ContentCaptureContext) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.content.LocusId getLocusId() {
        return com.micklab.dcg.wrapper.android.content.LocusId.wrap(((android.view.contentcapture.ContentCaptureContext) real).getLocusId());
    }

    public java.lang.String toString() {
        return ((android.view.contentcapture.ContentCaptureContext) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.contentcapture.ContentCaptureContext) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder wrap(android.view.contentcapture.ContentCaptureContext.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.contentcapture.ContentCaptureContext.Builder getReal() {
            return (android.view.contentcapture.ContentCaptureContext.Builder) real;
        }

        public android.view.contentcapture.ContentCaptureContext.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.LocusId arg0) {
            this(new android.view.contentcapture.ContentCaptureContext.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext build() {
            return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.wrap(((android.view.contentcapture.ContentCaptureContext.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.contentcapture.ContentCaptureContext.Builder.wrap(((android.view.contentcapture.ContentCaptureContext.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

    }
}
