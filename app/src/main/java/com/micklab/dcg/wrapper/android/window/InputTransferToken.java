// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class InputTransferToken {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputTransferToken(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.InputTransferToken wrap(android.window.InputTransferToken real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.InputTransferToken(real, (__DcgwBridgeToken) null);
    }

    public android.window.InputTransferToken getReal() {
        return (android.window.InputTransferToken) real;
    }

    public android.window.InputTransferToken unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.window.InputTransferToken) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.window.InputTransferToken) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.window.InputTransferToken) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.window.InputTransferToken) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
