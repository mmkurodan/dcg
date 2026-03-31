// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appfunctions;

public final class ExecuteAppFunctionResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExecuteAppFunctionResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionResponse wrap(android.app.appfunctions.ExecuteAppFunctionResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appfunctions.ExecuteAppFunctionResponse(real, (__DcgwBridgeToken) null);
    }

    public android.app.appfunctions.ExecuteAppFunctionResponse getReal() {
        return (android.app.appfunctions.ExecuteAppFunctionResponse) real;
    }

    public android.app.appfunctions.ExecuteAppFunctionResponse unwrap() {
        return getReal();
    }

    public ExecuteAppFunctionResponse(com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg0) {
        this(new android.app.appfunctions.ExecuteAppFunctionResponse(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ExecuteAppFunctionResponse(com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.app.appfunctions.ExecuteAppFunctionResponse(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.appfunctions.ExecuteAppFunctionResponse) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.appfunctions.ExecuteAppFunctionResponse) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument getResultDocument() {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(((android.app.appfunctions.ExecuteAppFunctionResponse) real).getResultDocument());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appfunctions.ExecuteAppFunctionResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String PROPERTY_RETURN_VALUE = android.app.appfunctions.ExecuteAppFunctionResponse.PROPERTY_RETURN_VALUE;

}
