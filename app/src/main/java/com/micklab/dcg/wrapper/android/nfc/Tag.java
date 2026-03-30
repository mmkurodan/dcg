// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class Tag {
    private final android.nfc.Tag real;

    public Tag(android.nfc.Tag real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.Tag wrap(android.nfc.Tag real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.Tag(real);
    }

    public android.nfc.Tag unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public byte[] getId() {
        return real.getId();
    }

    public java.lang.String[] getTechList() {
        return real.getTechList();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
