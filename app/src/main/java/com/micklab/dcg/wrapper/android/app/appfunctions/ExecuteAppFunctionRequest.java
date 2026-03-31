// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appfunctions;

public final class ExecuteAppFunctionRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExecuteAppFunctionRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest wrap(android.app.appfunctions.ExecuteAppFunctionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appfunctions.ExecuteAppFunctionRequest getReal() {
        return (android.app.appfunctions.ExecuteAppFunctionRequest) real;
    }

    public android.app.appfunctions.ExecuteAppFunctionRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appfunctions.ExecuteAppFunctionRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.appfunctions.ExecuteAppFunctionRequest) real).getExtras());
    }

    public java.lang.String getFunctionIdentifier() {
        return ((android.app.appfunctions.ExecuteAppFunctionRequest) real).getFunctionIdentifier();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument getParameters() {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(((android.app.appfunctions.ExecuteAppFunctionRequest) real).getParameters());
    }

    public java.lang.String getTargetPackageName() {
        return ((android.app.appfunctions.ExecuteAppFunctionRequest) real).getTargetPackageName();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appfunctions.ExecuteAppFunctionRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest.Builder wrap(android.app.appfunctions.ExecuteAppFunctionRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder getReal() {
            return (android.app.appfunctions.ExecuteAppFunctionRequest.Builder) real;
        }

        public android.app.appfunctions.ExecuteAppFunctionRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.app.appfunctions.ExecuteAppFunctionRequest.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest build() {
            return com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest.wrap(((android.app.appfunctions.ExecuteAppFunctionRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest.Builder.wrap(((android.app.appfunctions.ExecuteAppFunctionRequest.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest.Builder setParameters(com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg0) {
            return com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionRequest.Builder.wrap(((android.app.appfunctions.ExecuteAppFunctionRequest.Builder) real).setParameters(arg0 == null ? null : arg0.getReal()));
        }

    }
}
