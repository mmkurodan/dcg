// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class LoadParams {
    private final android.graphics.pdf.LoadParams real;

    public LoadParams(android.graphics.pdf.LoadParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams wrap(android.graphics.pdf.LoadParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams(real);
    }

    public android.graphics.pdf.LoadParams unwrap() {
        return real;
    }

    public java.lang.String getPassword() {
        return real.getPassword();
    }

    public static final class Builder {
        private final android.graphics.pdf.LoadParams.Builder real;

        public Builder(android.graphics.pdf.LoadParams.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder wrap(android.graphics.pdf.LoadParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder(real);
        }

        public android.graphics.pdf.LoadParams.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.graphics.pdf.LoadParams.Builder());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder setPassword(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams.Builder.wrap(real.setPassword(arg0));
        }

    }
}
