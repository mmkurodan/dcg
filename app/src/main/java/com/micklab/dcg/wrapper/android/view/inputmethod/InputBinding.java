// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputBinding {
    private final android.view.inputmethod.InputBinding real;

    public InputBinding(android.view.inputmethod.InputBinding real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding wrap(android.view.inputmethod.InputBinding real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding(real);
    }

    public android.view.inputmethod.InputBinding unwrap() {
        return real;
    }

    public InputBinding(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.view.inputmethod.InputBinding arg1) {
        this(new android.view.inputmethod.InputBinding(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public InputBinding(com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection arg0, com.micklab.dcg.wrapper.android.os.IBinder arg1, int arg2, int arg3) {
        this(new android.view.inputmethod.InputBinding(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection getConnection() {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(real.getConnection());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getConnectionToken() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getConnectionToken());
    }

    public int getPid() {
        return real.getPid();
    }

    public int getUid() {
        return real.getUid();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
