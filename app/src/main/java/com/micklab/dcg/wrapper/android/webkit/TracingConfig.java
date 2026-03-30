// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class TracingConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TracingConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.TracingConfig wrap(android.webkit.TracingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.TracingConfig(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.TracingConfig getReal() {
        return (android.webkit.TracingConfig) real;
    }

    public android.webkit.TracingConfig unwrap() {
        return getReal();
    }

    public int getPredefinedCategories() {
        return ((android.webkit.TracingConfig) real).getPredefinedCategories();
    }

    public int getTracingMode() {
        return ((android.webkit.TracingConfig) real).getTracingMode();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder wrap(android.webkit.TracingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.TracingConfig.Builder getReal() {
            return (android.webkit.TracingConfig.Builder) real;
        }

        public android.webkit.TracingConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.webkit.TracingConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder addCategories(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder.wrap(((android.webkit.TracingConfig.Builder) real).addCategories(arg0));
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder addCategories(int... arg0) {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder.wrap(((android.webkit.TracingConfig.Builder) real).addCategories(arg0));
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig build() {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.wrap(((android.webkit.TracingConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder setTracingMode(int arg0) {
            return com.micklab.dcg.wrapper.android.webkit.TracingConfig.Builder.wrap(((android.webkit.TracingConfig.Builder) real).setTracingMode(arg0));
        }

    }
}
