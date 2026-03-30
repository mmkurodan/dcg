// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RenderingConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderingConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig wrap(android.adservices.ondevicepersonalization.RenderingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.RenderingConfig getReal() {
        return (android.adservices.ondevicepersonalization.RenderingConfig) real;
    }

    public android.adservices.ondevicepersonalization.RenderingConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.ondevicepersonalization.RenderingConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.RenderingConfig) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.RenderingConfig) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.ondevicepersonalization.RenderingConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder wrap(android.adservices.ondevicepersonalization.RenderingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.RenderingConfig.Builder getReal() {
            return (android.adservices.ondevicepersonalization.RenderingConfig.Builder) real;
        }

        public android.adservices.ondevicepersonalization.RenderingConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.RenderingConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder addKey(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.Builder.wrap(((android.adservices.ondevicepersonalization.RenderingConfig.Builder) real).addKey(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.wrap(((android.adservices.ondevicepersonalization.RenderingConfig.Builder) real).build());
        }

    }
}
