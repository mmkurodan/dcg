// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class TracingConfig {
    private final android.webkit.TracingConfig real;

    public TracingConfig(android.webkit.TracingConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.TracingConfig wrap(android.webkit.TracingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.TracingConfig(real);
    }

    public android.webkit.TracingConfig unwrap() {
        return real;
    }

    public int getPredefinedCategories() {
        return real.getPredefinedCategories();
    }

    public int getTracingMode() {
        return real.getTracingMode();
    }

    public static final int CATEGORIES_ALL = android.webkit.TracingConfig.CATEGORIES_ALL;
    public static final int CATEGORIES_ANDROID_WEBVIEW = android.webkit.TracingConfig.CATEGORIES_ANDROID_WEBVIEW;
    public static final int CATEGORIES_FRAME_VIEWER = android.webkit.TracingConfig.CATEGORIES_FRAME_VIEWER;
    public static final int CATEGORIES_INPUT_LATENCY = android.webkit.TracingConfig.CATEGORIES_INPUT_LATENCY;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = android.webkit.TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING;
    public static final int CATEGORIES_NONE = android.webkit.TracingConfig.CATEGORIES_NONE;
    public static final int CATEGORIES_RENDERING = android.webkit.TracingConfig.CATEGORIES_RENDERING;
    public static final int CATEGORIES_WEB_DEVELOPER = android.webkit.TracingConfig.CATEGORIES_WEB_DEVELOPER;
    public static final int RECORD_CONTINUOUSLY = android.webkit.TracingConfig.RECORD_CONTINUOUSLY;
    public static final int RECORD_UNTIL_FULL = android.webkit.TracingConfig.RECORD_UNTIL_FULL;

    public static final class Builder {
        private final android.webkit.TracingConfig.Builder real;

        public Builder(android.webkit.TracingConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder wrap(android.webkit.TracingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder(real);
        }

        public android.webkit.TracingConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.webkit.TracingConfig.Builder());
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder addCategories(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder.wrap(real.addCategories(arg0));
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder addCategories(int... arg0) {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder.wrap(real.addCategories(arg0));
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig build() {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder setTracingMode(int arg0) {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder.wrap(real.setTracingMode(arg0));
        }

    }
}
