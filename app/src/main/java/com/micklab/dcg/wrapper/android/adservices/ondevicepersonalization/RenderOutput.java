// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RenderOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput wrap(android.adservices.ondevicepersonalization.RenderOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.RenderOutput getReal() {
        return (android.adservices.ondevicepersonalization.RenderOutput) real;
    }

    public android.adservices.ondevicepersonalization.RenderOutput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.RenderOutput) real).equals(arg0);
    }

    public java.lang.String getContent() {
        return ((android.adservices.ondevicepersonalization.RenderOutput) real).getContent();
    }

    public java.lang.String getTemplateId() {
        return ((android.adservices.ondevicepersonalization.RenderOutput) real).getTemplateId();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getTemplateParams() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.adservices.ondevicepersonalization.RenderOutput) real).getTemplateParams());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.RenderOutput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder wrap(android.adservices.ondevicepersonalization.RenderOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.RenderOutput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.RenderOutput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.RenderOutput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.RenderOutput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.wrap(((android.adservices.ondevicepersonalization.RenderOutput.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder setContent(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder.wrap(((android.adservices.ondevicepersonalization.RenderOutput.Builder) real).setContent(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder setTemplateId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder.wrap(((android.adservices.ondevicepersonalization.RenderOutput.Builder) real).setTemplateId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder setTemplateParams(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder.wrap(((android.adservices.ondevicepersonalization.RenderOutput.Builder) real).setTemplateParams(arg0 == null ? null : arg0.getReal()));
        }

    }
}
