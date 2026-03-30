// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class MissingForegroundServiceTypeException {
    private final android.app.MissingForegroundServiceTypeException real;

    public MissingForegroundServiceTypeException(android.app.MissingForegroundServiceTypeException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.MissingForegroundServiceTypeException wrap(android.app.MissingForegroundServiceTypeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.MissingForegroundServiceTypeException(real);
    }

    public android.app.MissingForegroundServiceTypeException unwrap() {
        return real;
    }

    public MissingForegroundServiceTypeException(java.lang.String arg0) {
        this(new android.app.MissingForegroundServiceTypeException(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
