// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class InputTransferToken {
    private final android.window.InputTransferToken real;

    public InputTransferToken(android.window.InputTransferToken real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.InputTransferToken wrap(android.window.InputTransferToken real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.InputTransferToken(real);
    }

    public android.window.InputTransferToken unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
