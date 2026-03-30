// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class RenderOutput {
    private final android.adservices.ondevicepersonalization.RenderOutput real;

    public RenderOutput(android.adservices.ondevicepersonalization.RenderOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput wrap(android.adservices.ondevicepersonalization.RenderOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput(real);
    }

    public android.adservices.ondevicepersonalization.RenderOutput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getContent() {
        return real.getContent();
    }

    public java.lang.String getTemplateId() {
        return real.getTemplateId();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getTemplateParams() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getTemplateParams());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.RenderOutput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.RenderOutput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder wrap(android.adservices.ondevicepersonalization.RenderOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.RenderOutput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.RenderOutput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder setContent(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder.wrap(real.setContent(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder setTemplateId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder.wrap(real.setTemplateId(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder setTemplateParams(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderOutput.Builder.wrap(real.setTemplateParams(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
