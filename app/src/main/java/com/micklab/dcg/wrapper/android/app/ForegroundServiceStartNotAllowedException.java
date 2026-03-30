// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ForegroundServiceStartNotAllowedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ForegroundServiceStartNotAllowedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ForegroundServiceStartNotAllowedException wrap(android.app.ForegroundServiceStartNotAllowedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ForegroundServiceStartNotAllowedException(real, (__DcgwBridgeToken) null);
    }

    public android.app.ForegroundServiceStartNotAllowedException getReal() {
        return (android.app.ForegroundServiceStartNotAllowedException) real;
    }

    public android.app.ForegroundServiceStartNotAllowedException unwrap() {
        return getReal();
    }

    public ForegroundServiceStartNotAllowedException(java.lang.String arg0) {
        this(new android.app.ForegroundServiceStartNotAllowedException(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.ForegroundServiceStartNotAllowedException) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.ForegroundServiceStartNotAllowedException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
