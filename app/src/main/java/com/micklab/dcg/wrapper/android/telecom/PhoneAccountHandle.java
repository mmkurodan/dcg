// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class PhoneAccountHandle {
    private final android.telecom.PhoneAccountHandle real;

    public PhoneAccountHandle(android.telecom.PhoneAccountHandle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle wrap(android.telecom.PhoneAccountHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle(real);
    }

    public android.telecom.PhoneAccountHandle unwrap() {
        return real;
    }

    public PhoneAccountHandle(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        this(new android.telecom.PhoneAccountHandle(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public PhoneAccountHandle(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        this(new android.telecom.PhoneAccountHandle(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponentName());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUserHandle() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(real.getUserHandle());
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
