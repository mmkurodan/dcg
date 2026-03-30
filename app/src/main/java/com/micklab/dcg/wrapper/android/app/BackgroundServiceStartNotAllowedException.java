// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class BackgroundServiceStartNotAllowedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackgroundServiceStartNotAllowedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.BackgroundServiceStartNotAllowedException wrap(android.app.BackgroundServiceStartNotAllowedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.BackgroundServiceStartNotAllowedException(real, (__DcgwBridgeToken) null);
    }

    public android.app.BackgroundServiceStartNotAllowedException getReal() {
        return (android.app.BackgroundServiceStartNotAllowedException) real;
    }

    public android.app.BackgroundServiceStartNotAllowedException unwrap() {
        return getReal();
    }

    public BackgroundServiceStartNotAllowedException(java.lang.String arg0) {
        this(new android.app.BackgroundServiceStartNotAllowedException(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.BackgroundServiceStartNotAllowedException) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.BackgroundServiceStartNotAllowedException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
