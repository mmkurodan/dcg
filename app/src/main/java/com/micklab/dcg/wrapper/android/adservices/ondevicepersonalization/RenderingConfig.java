// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RenderingConfig {
    private final android.adservices.ondevicepersonalization.RenderingConfig real;

    public RenderingConfig(android.adservices.ondevicepersonalization.RenderingConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig wrap(android.adservices.ondevicepersonalization.RenderingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig(real);
    }

    public android.adservices.ondevicepersonalization.RenderingConfig unwrap() {
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

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.ondevicepersonalization.RenderingConfig.Builder real;

        public Builder(android.adservices.ondevicepersonalization.RenderingConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder wrap(android.adservices.ondevicepersonalization.RenderingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder(real);
        }

        public android.adservices.ondevicepersonalization.RenderingConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.RenderingConfig.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder addKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder.wrap(real.addKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.wrap(real.build());
        }

    }
}
