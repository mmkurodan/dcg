// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AttributionSource {
    private final android.content.AttributionSource real;

    public AttributionSource(android.content.AttributionSource real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AttributionSource wrap(android.content.AttributionSource real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AttributionSource(real);
    }

    public android.content.AttributionSource unwrap() {
        return real;
    }

    public boolean checkCallingUid() {
        return real.checkCallingUid();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void enforceCallingUid() {
        real.enforceCallingUid();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getAttributionTag() {
        return real.getAttributionTag();
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getNext() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(real.getNext());
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public int getPid() {
        return real.getPid();
    }

    public int getUid() {
        return real.getUid();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isTrusted(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return real.isTrusted(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.content.AttributionSource myAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(android.content.AttributionSource.myAttributionSource());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.content.AttributionSource.Builder real;

        public Builder(android.content.AttributionSource.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.AttributionSource.Builder wrap(android.content.AttributionSource.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.AttributionSource.Builder(real);
        }

        public android.content.AttributionSource.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.content.AttributionSource.Builder(arg0));
        }

        public Builder(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
            this(new android.content.AttributionSource.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource build() {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setAttributionTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(real.setAttributionTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setDeviceId(int arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(real.setDeviceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setNext(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(real.setNext(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setPackageName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(real.setPackageName(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.AttributionSource.Builder setPid(int arg0) {
            return com.micklab.dcg.wrapper.android.content.AttributionSource.Builder.wrap(real.setPid(arg0));
        }

    }
}
