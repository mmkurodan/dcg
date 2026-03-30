// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ApplicationMediaCapabilities {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ApplicationMediaCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities wrap(android.media.ApplicationMediaCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities(real, (__DcgwBridgeToken) null);
    }

    public android.media.ApplicationMediaCapabilities getReal() {
        return (android.media.ApplicationMediaCapabilities) real;
    }

    public android.media.ApplicationMediaCapabilities unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities createFromXml(org.xmlpull.v1.XmlPullParser arg0) {
        return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.wrap(android.media.ApplicationMediaCapabilities.createFromXml(arg0));
    }

    public int describeContents() {
        return ((android.media.ApplicationMediaCapabilities) real).describeContents();
    }

    public boolean isFormatSpecified(java.lang.String arg0) {
        return ((android.media.ApplicationMediaCapabilities) real).isFormatSpecified(arg0);
    }

    public boolean isHdrTypeSupported(java.lang.String arg0) {
        return ((android.media.ApplicationMediaCapabilities) real).isHdrTypeSupported(arg0);
    }

    public boolean isVideoMimeTypeSupported(java.lang.String arg0) {
        return ((android.media.ApplicationMediaCapabilities) real).isVideoMimeTypeSupported(arg0);
    }

    public java.lang.String toString() {
        return ((android.media.ApplicationMediaCapabilities) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.ApplicationMediaCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder wrap(android.media.ApplicationMediaCapabilities.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.ApplicationMediaCapabilities.Builder getReal() {
            return (android.media.ApplicationMediaCapabilities.Builder) real;
        }

        public android.media.ApplicationMediaCapabilities.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.ApplicationMediaCapabilities.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addSupportedHdrType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(((android.media.ApplicationMediaCapabilities.Builder) real).addSupportedHdrType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addSupportedVideoMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(((android.media.ApplicationMediaCapabilities.Builder) real).addSupportedVideoMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addUnsupportedHdrType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(((android.media.ApplicationMediaCapabilities.Builder) real).addUnsupportedHdrType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addUnsupportedVideoMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(((android.media.ApplicationMediaCapabilities.Builder) real).addUnsupportedVideoMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities build() {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.wrap(((android.media.ApplicationMediaCapabilities.Builder) real).build());
        }

    }
}
