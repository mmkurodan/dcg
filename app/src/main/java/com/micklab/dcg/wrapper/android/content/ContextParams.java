// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContextParams {
    private final android.content.ContextParams real;

    public ContextParams(android.content.ContextParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContextParams wrap(android.content.ContextParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContextParams(real);
    }

    public android.content.ContextParams unwrap() {
        return real;
    }

    public java.lang.String getAttributionTag() {
        return real.getAttributionTag();
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getNextAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(real.getNextAttributionSource());
    }

    public boolean shouldRegisterAttributionSource() {
        return real.shouldRegisterAttributionSource();
    }

    public static final class Builder {
        private final android.content.ContextParams.Builder real;

        public Builder(android.content.ContextParams.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContextParams.Builder wrap(android.content.ContextParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContextParams.Builder(real);
        }

        public android.content.ContextParams.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.content.ContextParams.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.content.ContextParams arg0) {
            this(new android.content.ContextParams.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams build() {
            return com.micklab.dcg.wrapper.android.content.ContextParams.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams.Builder setAttributionTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.ContextParams.Builder.wrap(real.setAttributionTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams.Builder setNextAttributionSource(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
            return com.micklab.dcg.wrapper.android.content.ContextParams.Builder.wrap(real.setNextAttributionSource(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.ContextParams.Builder setShouldRegisterAttributionSource(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.ContextParams.Builder.wrap(real.setShouldRegisterAttributionSource(arg0));
        }

    }
}
