// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.input;

public final class HostUsiVersion {
    private final android.hardware.input.HostUsiVersion real;

    public HostUsiVersion(android.hardware.input.HostUsiVersion real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion wrap(android.hardware.input.HostUsiVersion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion(real);
    }

    public android.hardware.input.HostUsiVersion unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getMajorVersion() {
        return real.getMajorVersion();
    }

    public int getMinorVersion() {
        return real.getMinorVersion();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
