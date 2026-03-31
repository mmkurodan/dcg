// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SetBlobVisibilityRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SetBlobVisibilityRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest wrap(android.app.appsearch.SetBlobVisibilityRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SetBlobVisibilityRequest getReal() {
        return (android.app.appsearch.SetBlobVisibilityRequest) real;
    }

    public android.app.appsearch.SetBlobVisibilityRequest unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder wrap(android.app.appsearch.SetBlobVisibilityRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SetBlobVisibilityRequest.Builder getReal() {
            return (android.app.appsearch.SetBlobVisibilityRequest.Builder) real;
        }

        public android.app.appsearch.SetBlobVisibilityRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.SetBlobVisibilityRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder addNamespaceVisibleToConfig(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SchemaVisibilityConfig arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder.wrap(((android.app.appsearch.SetBlobVisibilityRequest.Builder) real).addNamespaceVisibleToConfig(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.wrap(((android.app.appsearch.SetBlobVisibilityRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder clearNamespaceVisibleToConfigs(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder.wrap(((android.app.appsearch.SetBlobVisibilityRequest.Builder) real).clearNamespaceVisibleToConfigs(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder setNamespaceDisplayedBySystem(java.lang.String arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SetBlobVisibilityRequest.Builder.wrap(((android.app.appsearch.SetBlobVisibilityRequest.Builder) real).setNamespaceDisplayedBySystem(arg0, arg1));
        }

    }
}
