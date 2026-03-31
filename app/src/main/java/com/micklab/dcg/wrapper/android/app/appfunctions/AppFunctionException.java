// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appfunctions;

public final class AppFunctionException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppFunctionException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appfunctions.AppFunctionException wrap(android.app.appfunctions.AppFunctionException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appfunctions.AppFunctionException(real, (__DcgwBridgeToken) null);
    }

    public android.app.appfunctions.AppFunctionException getReal() {
        return (android.app.appfunctions.AppFunctionException) real;
    }

    public android.app.appfunctions.AppFunctionException unwrap() {
        return getReal();
    }

    public AppFunctionException(int arg0, java.lang.String arg1) {
        this(new android.app.appfunctions.AppFunctionException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public AppFunctionException(int arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.app.appfunctions.AppFunctionException(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.appfunctions.AppFunctionException) real).describeContents();
    }

    public int getErrorCategory() {
        return ((android.app.appfunctions.AppFunctionException) real).getErrorCategory();
    }

    public int getErrorCode() {
        return ((android.app.appfunctions.AppFunctionException) real).getErrorCode();
    }

    public java.lang.String getErrorMessage() {
        return ((android.app.appfunctions.AppFunctionException) real).getErrorMessage();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.appfunctions.AppFunctionException) real).getExtras());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appfunctions.AppFunctionException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ERROR_APP_UNKNOWN_ERROR = android.app.appfunctions.AppFunctionException.ERROR_APP_UNKNOWN_ERROR;
    public static final int ERROR_CANCELLED = android.app.appfunctions.AppFunctionException.ERROR_CANCELLED;
    public static final int ERROR_CATEGORY_APP = android.app.appfunctions.AppFunctionException.ERROR_CATEGORY_APP;
    public static final int ERROR_CATEGORY_REQUEST_ERROR = android.app.appfunctions.AppFunctionException.ERROR_CATEGORY_REQUEST_ERROR;
    public static final int ERROR_CATEGORY_SYSTEM = android.app.appfunctions.AppFunctionException.ERROR_CATEGORY_SYSTEM;
    public static final int ERROR_CATEGORY_UNKNOWN = android.app.appfunctions.AppFunctionException.ERROR_CATEGORY_UNKNOWN;
    public static final int ERROR_DENIED = android.app.appfunctions.AppFunctionException.ERROR_DENIED;
    public static final int ERROR_DISABLED = android.app.appfunctions.AppFunctionException.ERROR_DISABLED;
    public static final int ERROR_ENTERPRISE_POLICY_DISALLOWED = android.app.appfunctions.AppFunctionException.ERROR_ENTERPRISE_POLICY_DISALLOWED;
    public static final int ERROR_FUNCTION_NOT_FOUND = android.app.appfunctions.AppFunctionException.ERROR_FUNCTION_NOT_FOUND;
    public static final int ERROR_INVALID_ARGUMENT = android.app.appfunctions.AppFunctionException.ERROR_INVALID_ARGUMENT;
    public static final int ERROR_SYSTEM_ERROR = android.app.appfunctions.AppFunctionException.ERROR_SYSTEM_ERROR;

}
