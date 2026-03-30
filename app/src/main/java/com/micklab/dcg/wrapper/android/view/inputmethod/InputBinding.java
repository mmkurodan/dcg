// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputBinding {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputBinding(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding wrap(android.view.inputmethod.InputBinding real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputBinding getReal() {
        return (android.view.inputmethod.InputBinding) real;
    }

    public android.view.inputmethod.InputBinding unwrap() {
        return getReal();
    }

    public InputBinding(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding arg1) {
        this(new android.view.inputmethod.InputBinding(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public InputBinding(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1, int arg2, int arg3) {
        this(new android.view.inputmethod.InputBinding(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.inputmethod.InputBinding) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection getConnection() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(((android.view.inputmethod.InputBinding) real).getConnection());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getConnectionToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.view.inputmethod.InputBinding) real).getConnectionToken());
    }

    public int getPid() {
        return ((android.view.inputmethod.InputBinding) real).getPid();
    }

    public int getUid() {
        return ((android.view.inputmethod.InputBinding) real).getUid();
    }

    public java.lang.String toString() {
        return ((android.view.inputmethod.InputBinding) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InputBinding) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
