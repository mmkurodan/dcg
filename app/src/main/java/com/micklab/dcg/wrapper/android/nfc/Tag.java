// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class Tag {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Tag(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.Tag wrap(android.nfc.Tag real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.Tag(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.Tag getReal() {
        return (android.nfc.Tag) real;
    }

    public android.nfc.Tag unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.nfc.Tag) real).describeContents();
    }

    public byte[] getId() {
        return ((android.nfc.Tag) real).getId();
    }

    public java.lang.String[] getTechList() {
        return ((android.nfc.Tag) real).getTechList();
    }

    public java.lang.String toString() {
        return ((android.nfc.Tag) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.nfc.Tag) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
