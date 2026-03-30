// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class BackgroundServiceStartNotAllowedException {
    private final android.app.BackgroundServiceStartNotAllowedException real;

    public BackgroundServiceStartNotAllowedException(android.app.BackgroundServiceStartNotAllowedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.BackgroundServiceStartNotAllowedException wrap(android.app.BackgroundServiceStartNotAllowedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.BackgroundServiceStartNotAllowedException(real);
    }

    public android.app.BackgroundServiceStartNotAllowedException unwrap() {
        return real;
    }

    public BackgroundServiceStartNotAllowedException(java.lang.String arg0) {
        this(new android.app.BackgroundServiceStartNotAllowedException(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
