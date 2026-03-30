// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class RequestSurfacePackageException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RequestSurfacePackageException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.RequestSurfacePackageException wrap(android.app.sdksandbox.RequestSurfacePackageException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.RequestSurfacePackageException(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.RequestSurfacePackageException getReal() {
        return (android.app.sdksandbox.RequestSurfacePackageException) real;
    }

    public android.app.sdksandbox.RequestSurfacePackageException unwrap() {
        return getReal();
    }

    public RequestSurfacePackageException(int arg0, java.lang.String arg1) {
        this(new android.app.sdksandbox.RequestSurfacePackageException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public RequestSurfacePackageException(int arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.app.sdksandbox.RequestSurfacePackageException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public RequestSurfacePackageException(int arg0, java.lang.String arg1, java.lang.Throwable arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        this(new android.app.sdksandbox.RequestSurfacePackageException(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtraErrorInformation() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.sdksandbox.RequestSurfacePackageException) real).getExtraErrorInformation());
    }

    public int getRequestSurfacePackageErrorCode() {
        return ((android.app.sdksandbox.RequestSurfacePackageException) real).getRequestSurfacePackageErrorCode();
    }

}
