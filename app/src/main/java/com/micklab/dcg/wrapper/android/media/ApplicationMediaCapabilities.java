// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ApplicationMediaCapabilities {
    private final android.media.ApplicationMediaCapabilities real;

    public ApplicationMediaCapabilities(android.media.ApplicationMediaCapabilities real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities wrap(android.media.ApplicationMediaCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities(real);
    }

    public android.media.ApplicationMediaCapabilities unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities createFromXml(org.xmlpull.v1.XmlPullParser arg0) {
        return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.wrap(android.media.ApplicationMediaCapabilities.createFromXml(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean isFormatSpecified(java.lang.String arg0) {
        return real.isFormatSpecified(arg0);
    }

    public boolean isHdrTypeSupported(java.lang.String arg0) {
        return real.isHdrTypeSupported(arg0);
    }

    public boolean isVideoMimeTypeSupported(java.lang.String arg0) {
        return real.isVideoMimeTypeSupported(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.media.ApplicationMediaCapabilities.Builder real;

        public Builder(android.media.ApplicationMediaCapabilities.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder wrap(android.media.ApplicationMediaCapabilities.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder(real);
        }

        public android.media.ApplicationMediaCapabilities.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.ApplicationMediaCapabilities.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addSupportedHdrType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(real.addSupportedHdrType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addSupportedVideoMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(real.addSupportedVideoMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addUnsupportedHdrType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(real.addUnsupportedHdrType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder addUnsupportedVideoMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.Builder.wrap(real.addUnsupportedVideoMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities build() {
            return com.micklab.dcg.wrapper.android.media.ApplicationMediaCapabilities.wrap(real.build());
        }

    }
}
