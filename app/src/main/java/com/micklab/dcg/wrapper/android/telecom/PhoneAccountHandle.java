// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class PhoneAccountHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PhoneAccountHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle wrap(android.telecom.PhoneAccountHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.PhoneAccountHandle(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.PhoneAccountHandle getReal() {
        return (android.telecom.PhoneAccountHandle) real;
    }

    public android.telecom.PhoneAccountHandle unwrap() {
        return getReal();
    }

    public PhoneAccountHandle(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        this(new android.telecom.PhoneAccountHandle(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public PhoneAccountHandle(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) {
        this(new android.telecom.PhoneAccountHandle(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.PhoneAccountHandle) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.telecom.PhoneAccountHandle) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.telecom.PhoneAccountHandle) real).getComponentName());
    }

    public java.lang.String getId() {
        return ((android.telecom.PhoneAccountHandle) real).getId();
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUserHandle() {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(((android.telecom.PhoneAccountHandle) real).getUserHandle());
    }

    public int hashCode() {
        return ((android.telecom.PhoneAccountHandle) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.telecom.PhoneAccountHandle) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.PhoneAccountHandle) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
