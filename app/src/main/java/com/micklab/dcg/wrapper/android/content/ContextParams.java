// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContextParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContextParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContextParams wrap(android.content.ContextParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContextParams(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContextParams getReal() {
        return (android.content.ContextParams) real;
    }

    public android.content.ContextParams unwrap() {
        return getReal();
    }

    public java.lang.String getAttributionTag() {
        return ((android.content.ContextParams) real).getAttributionTag();
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getNextAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(((android.content.ContextParams) real).getNextAttributionSource());
    }

    public boolean shouldRegisterAttributionSource() {
        return ((android.content.ContextParams) real).shouldRegisterAttributionSource();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContextParams.Builder wrap(android.content.ContextParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContextParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.content.ContextParams.Builder getReal() {
            return (android.content.ContextParams.Builder) real;
        }

        public android.content.ContextParams.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.content.ContextParams.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.content.ContextParams arg0) {
            this(new android.content.ContextParams.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams build() {
            return com.micklab.dcg.wrapper.android.content.ContextParams.wrap(((android.content.ContextParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams.Builder setAttributionTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.ContextParams.Builder.wrap(((android.content.ContextParams.Builder) real).setAttributionTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams.Builder setNextAttributionSource(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
            return com.micklab.dcg.wrapper.android.content.ContextParams.Builder.wrap(((android.content.ContextParams.Builder) real).setNextAttributionSource(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams.Builder setShouldRegisterAttributionSource(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.ContextParams.Builder.wrap(((android.content.ContextParams.Builder) real).setShouldRegisterAttributionSource(arg0));
        }

    }
}
