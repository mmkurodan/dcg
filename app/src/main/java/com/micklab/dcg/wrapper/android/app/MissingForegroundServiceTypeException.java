// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class MissingForegroundServiceTypeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MissingForegroundServiceTypeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.MissingForegroundServiceTypeException wrap(android.app.MissingForegroundServiceTypeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.MissingForegroundServiceTypeException(real, (__DcgwBridgeToken) null);
    }

    public android.app.MissingForegroundServiceTypeException getReal() {
        return (android.app.MissingForegroundServiceTypeException) real;
    }

    public android.app.MissingForegroundServiceTypeException unwrap() {
        return getReal();
    }

    public MissingForegroundServiceTypeException(java.lang.String arg0) {
        this(new android.app.MissingForegroundServiceTypeException(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.MissingForegroundServiceTypeException) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.MissingForegroundServiceTypeException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
