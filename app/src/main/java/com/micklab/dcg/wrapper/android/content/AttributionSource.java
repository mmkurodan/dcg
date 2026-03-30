// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AttributionSource {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AttributionSource(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AttributionSource wrap(android.content.AttributionSource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AttributionSource(real, (__DcgwBridgeToken) null);
    }

    public android.content.AttributionSource getReal() {
        return (android.content.AttributionSource) real;
    }

    public android.content.AttributionSource unwrap() {
        return getReal();
    }

    public boolean checkCallingUid() {
        return ((android.content.AttributionSource) real).checkCallingUid();
    }

    public int describeContents() {
        return ((android.content.AttributionSource) real).describeContents();
    }

    public void enforceCallingUid() {
        ((android.content.AttributionSource) real).enforceCallingUid();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.AttributionSource) real).equals(arg0);
    }

    public java.lang.String getAttributionTag() {
        return ((android.content.AttributionSource) real).getAttributionTag();
    }

    public int getDeviceId() {
        return ((android.content.AttributionSource) real).getDeviceId();
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getNext() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(((android.content.AttributionSource) real).getNext());
    }

    public java.lang.String getPackageName() {
        return ((android.content.AttributionSource) real).getPackageName();
    }

    public int getPid() {
        return ((android.content.AttributionSource) real).getPid();
    }

    public int getUid() {
        return ((android.content.AttributionSource) real).getUid();
    }

    public int hashCode() {
        return ((android.content.AttributionSource) real).hashCode();
    }

    public boolean isTrusted(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return ((android.content.AttributionSource) real).isTrusted(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.content.AttributionSource myAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(android.content.AttributionSource.myAttributionSource());
    }

    public java.lang.String toString() {
        return ((android.content.AttributionSource) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.AttributionSource) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.AttributionSource.Builder wrap(android.content.AttributionSource.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.AttributionSource.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.content.AttributionSource.Builder getReal() {
            return (android.content.AttributionSource.Builder) real;
        }

        public android.content.AttributionSource.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.content.AttributionSource.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
            this(new android.content.AttributionSource.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource build() {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(((android.content.AttributionSource.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setAttributionTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(((android.content.AttributionSource.Builder) real).setAttributionTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setDeviceId(int arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(((android.content.AttributionSource.Builder) real).setDeviceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setNext(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(((android.content.AttributionSource.Builder) real).setNext(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setPackageName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(((android.content.AttributionSource.Builder) real).setPackageName(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setPid(int arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(((android.content.AttributionSource.Builder) real).setPid(arg0));
        }

    }
}
