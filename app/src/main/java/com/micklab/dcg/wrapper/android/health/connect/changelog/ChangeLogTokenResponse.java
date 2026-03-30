// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogTokenResponse {
    private final android.health.connect.changelog.ChangeLogTokenResponse real;

    public ChangeLogTokenResponse(android.health.connect.changelog.ChangeLogTokenResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenResponse wrap(android.health.connect.changelog.ChangeLogTokenResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenResponse(real);
    }

    public android.health.connect.changelog.ChangeLogTokenResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getToken() {
        return real.getToken();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
