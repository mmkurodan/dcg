// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class LoadParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LoadParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams wrap(android.graphics.pdf.LoadParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.LoadParams getReal() {
        return (android.graphics.pdf.LoadParams) real;
    }

    public android.graphics.pdf.LoadParams unwrap() {
        return getReal();
    }

    public java.lang.String getPassword() {
        return ((android.graphics.pdf.LoadParams) real).getPassword();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder wrap(android.graphics.pdf.LoadParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.LoadParams.Builder getReal() {
            return (android.graphics.pdf.LoadParams.Builder) real;
        }

        public android.graphics.pdf.LoadParams.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.graphics.pdf.LoadParams.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.wrap(((android.graphics.pdf.LoadParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder setPassword(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder.wrap(((android.graphics.pdf.LoadParams.Builder) real).setPassword(arg0));
        }

    }
}
