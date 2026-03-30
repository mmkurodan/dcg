// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ForegroundServiceStartNotAllowedException {
    private final android.app.ForegroundServiceStartNotAllowedException real;

    public ForegroundServiceStartNotAllowedException(android.app.ForegroundServiceStartNotAllowedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ForegroundServiceStartNotAllowedException wrap(android.app.ForegroundServiceStartNotAllowedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ForegroundServiceStartNotAllowedException(real);
    }

    public android.app.ForegroundServiceStartNotAllowedException unwrap() {
        return real;
    }

    public ForegroundServiceStartNotAllowedException(java.lang.String arg0) {
        this(new android.app.ForegroundServiceStartNotAllowedException(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
