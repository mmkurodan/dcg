// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class RequestSurfacePackageException {
    private final android.app.sdksandbox.RequestSurfacePackageException real;

    public RequestSurfacePackageException(android.app.sdksandbox.RequestSurfacePackageException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.RequestSurfacePackageException wrap(android.app.sdksandbox.RequestSurfacePackageException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.RequestSurfacePackageException(real);
    }

    public android.app.sdksandbox.RequestSurfacePackageException unwrap() {
        return real;
    }

    public RequestSurfacePackageException(int arg0, java.lang.String arg1) {
        this(new android.app.sdksandbox.RequestSurfacePackageException(arg0, arg1));
    }

    public RequestSurfacePackageException(int arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.app.sdksandbox.RequestSurfacePackageException(arg0, arg1, arg2));
    }

    public RequestSurfacePackageException(int arg0, java.lang.String arg1, java.lang.Throwable arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        this(new android.app.sdksandbox.RequestSurfacePackageException(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtraErrorInformation() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtraErrorInformation());
    }

    public int getRequestSurfacePackageErrorCode() {
        return real.getRequestSurfacePackageErrorCode();
    }

}
