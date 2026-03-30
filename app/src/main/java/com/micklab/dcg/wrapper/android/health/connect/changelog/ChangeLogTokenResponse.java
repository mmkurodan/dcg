// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogTokenResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeLogTokenResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenResponse wrap(android.health.connect.changelog.ChangeLogTokenResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenResponse(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.changelog.ChangeLogTokenResponse getReal() {
        return (android.health.connect.changelog.ChangeLogTokenResponse) real;
    }

    public android.health.connect.changelog.ChangeLogTokenResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.changelog.ChangeLogTokenResponse) real).describeContents();
    }

    public java.lang.String getToken() {
        return ((android.health.connect.changelog.ChangeLogTokenResponse) real).getToken();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.changelog.ChangeLogTokenResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
