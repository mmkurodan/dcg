// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class Attribution {
    private final android.content.pm.Attribution real;

    public Attribution(android.content.pm.Attribution real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.Attribution wrap(android.content.pm.Attribution real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.Attribution(real);
    }

    public android.content.pm.Attribution unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Attribution#describeContents()");
    }

    public int getLabel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Attribution#getLabel()");
    }

    public java.lang.String getTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Attribution#getTag()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.Attribution#writeToParcel(android.os.Parcel,int)");
    }


}
