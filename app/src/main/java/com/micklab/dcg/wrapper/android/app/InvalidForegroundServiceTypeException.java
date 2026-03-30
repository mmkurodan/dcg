// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class InvalidForegroundServiceTypeException {
    private final android.app.InvalidForegroundServiceTypeException real;

    public InvalidForegroundServiceTypeException(android.app.InvalidForegroundServiceTypeException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.InvalidForegroundServiceTypeException wrap(android.app.InvalidForegroundServiceTypeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.InvalidForegroundServiceTypeException(real);
    }

    public android.app.InvalidForegroundServiceTypeException unwrap() {
        return real;
    }

    public InvalidForegroundServiceTypeException(java.lang.String arg0) {
        this(new android.app.InvalidForegroundServiceTypeException(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
