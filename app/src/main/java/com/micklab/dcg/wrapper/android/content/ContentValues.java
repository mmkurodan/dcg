// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentValues {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentValues(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentValues wrap(android.content.ContentValues real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentValues(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContentValues getReal() {
        return (android.content.ContentValues) real;
    }

    public android.content.ContentValues unwrap() {
        return getReal();
    }

    public ContentValues() {
        this(new android.content.ContentValues(), (__DcgwBridgeToken) null);
    }

    public ContentValues(int arg0) {
        this(new android.content.ContentValues(arg0), (__DcgwBridgeToken) null);
    }

    public ContentValues(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
        this(new android.content.ContentValues(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void clear() {
        ((android.content.ContentValues) real).clear();
    }

    public boolean containsKey(java.lang.String arg0) {
        return ((android.content.ContentValues) real).containsKey(arg0);
    }

    public int describeContents() {
        return ((android.content.ContentValues) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.ContentValues) real).equals(arg0);
    }

    public java.lang.Object get(java.lang.String arg0) {
        return ((android.content.ContentValues) real).get(arg0);
    }

    public java.lang.Boolean getAsBoolean(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsBoolean(arg0);
    }

    public java.lang.Byte getAsByte(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsByte(arg0);
    }

    public byte[] getAsByteArray(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsByteArray(arg0);
    }

    public java.lang.Double getAsDouble(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsDouble(arg0);
    }

    public java.lang.Float getAsFloat(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsFloat(arg0);
    }

    public java.lang.Integer getAsInteger(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsInteger(arg0);
    }

    public java.lang.Long getAsLong(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsLong(arg0);
    }

    public java.lang.Short getAsShort(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsShort(arg0);
    }

    public java.lang.String getAsString(java.lang.String arg0) {
        return ((android.content.ContentValues) real).getAsString(arg0);
    }

    public int hashCode() {
        return ((android.content.ContentValues) real).hashCode();
    }

    public boolean isEmpty() {
        return ((android.content.ContentValues) real).isEmpty();
    }

    public void put(java.lang.String arg0, java.lang.Integer arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Float arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Long arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Boolean arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Double arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Byte arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, byte[] arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.String arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Short arg1) {
        ((android.content.ContentValues) real).put(arg0, arg1);
    }

    public void putAll(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
        ((android.content.ContentValues) real).putAll(arg0 == null ? null : arg0.getReal());
    }

    public void putNull(java.lang.String arg0) {
        ((android.content.ContentValues) real).putNull(arg0);
    }

    public void remove(java.lang.String arg0) {
        ((android.content.ContentValues) real).remove(arg0);
    }

    public int size() {
        return ((android.content.ContentValues) real).size();
    }

    public java.lang.String toString() {
        return ((android.content.ContentValues) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.ContentValues) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String TAG = android.content.ContentValues.TAG;

}
