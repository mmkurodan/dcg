// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NdefRecord {
    private final android.nfc.NdefRecord real;

    public NdefRecord(android.nfc.NdefRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefRecord wrap(android.nfc.NdefRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NdefRecord(real);
    }

    public android.nfc.NdefRecord unwrap() {
        return real;
    }

    public NdefRecord(byte[] arg0) throws android.nfc.FormatException {
        this(new android.nfc.NdefRecord(arg0));
    }

    public NdefRecord(short arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        this(new android.nfc.NdefRecord(arg0, arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefRecord createApplicationRecord(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.nfc.NdefRecord.wrap(android.nfc.NdefRecord.createApplicationRecord(arg0));
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefRecord createExternal(java.lang.String arg0, java.lang.String arg1, byte[] arg2) {
        return com.micklab.dcg.wrapper.android.nfc.NdefRecord.wrap(android.nfc.NdefRecord.createExternal(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefRecord createMime(java.lang.String arg0, byte[] arg1) {
        return com.micklab.dcg.wrapper.android.nfc.NdefRecord.wrap(android.nfc.NdefRecord.createMime(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefRecord createTextRecord(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.nfc.NdefRecord.wrap(android.nfc.NdefRecord.createTextRecord(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefRecord createUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.nfc.NdefRecord.wrap(android.nfc.NdefRecord.createUri(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefRecord createUri(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.nfc.NdefRecord.wrap(android.nfc.NdefRecord.createUri(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public byte[] getId() {
        return real.getId();
    }

    public byte[] getPayload() {
        return real.getPayload();
    }

    public short getTnf() {
        return real.getTnf();
    }

    public byte[] getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public byte[] toByteArray() {
        return real.toByteArray();
    }

    public java.lang.String toMimeType() {
        return real.toMimeType();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public com.micklab.dcg.wrapper.android.net.Uri toUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.toUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final byte[] RTD_ALTERNATIVE_CARRIER = android.nfc.NdefRecord.RTD_ALTERNATIVE_CARRIER;
    public static final byte[] RTD_HANDOVER_CARRIER = android.nfc.NdefRecord.RTD_HANDOVER_CARRIER;
    public static final byte[] RTD_HANDOVER_REQUEST = android.nfc.NdefRecord.RTD_HANDOVER_REQUEST;
    public static final byte[] RTD_HANDOVER_SELECT = android.nfc.NdefRecord.RTD_HANDOVER_SELECT;
    public static final byte[] RTD_SMART_POSTER = android.nfc.NdefRecord.RTD_SMART_POSTER;
    public static final byte[] RTD_TEXT = android.nfc.NdefRecord.RTD_TEXT;
    public static final byte[] RTD_URI = android.nfc.NdefRecord.RTD_URI;
    public static final short TNF_ABSOLUTE_URI = android.nfc.NdefRecord.TNF_ABSOLUTE_URI;
    public static final short TNF_EMPTY = android.nfc.NdefRecord.TNF_EMPTY;
    public static final short TNF_EXTERNAL_TYPE = android.nfc.NdefRecord.TNF_EXTERNAL_TYPE;
    public static final short TNF_MIME_MEDIA = android.nfc.NdefRecord.TNF_MIME_MEDIA;
    public static final short TNF_UNCHANGED = android.nfc.NdefRecord.TNF_UNCHANGED;
    public static final short TNF_UNKNOWN = android.nfc.NdefRecord.TNF_UNKNOWN;
    public static final short TNF_WELL_KNOWN = android.nfc.NdefRecord.TNF_WELL_KNOWN;

}
