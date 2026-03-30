// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentValues {
    private final android.content.ContentValues real;

    public ContentValues(android.content.ContentValues real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentValues wrap(android.content.ContentValues real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentValues(real);
    }

    public android.content.ContentValues unwrap() {
        return real;
    }

    public ContentValues() {
        this(new android.content.ContentValues());
    }

    public ContentValues(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
        this(new android.content.ContentValues(arg0 == null ? null : arg0.unwrap()));
    }

    public ContentValues(int arg0) {
        this(new android.content.ContentValues(arg0));
    }

    public void clear() {
        real.clear();
    }

    public boolean containsKey(java.lang.String arg0) {
        return real.containsKey(arg0);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.Object get(java.lang.String arg0) {
        return real.get(arg0);
    }

    public java.lang.Boolean getAsBoolean(java.lang.String arg0) {
        return real.getAsBoolean(arg0);
    }

    public java.lang.Byte getAsByte(java.lang.String arg0) {
        return real.getAsByte(arg0);
    }

    public byte[] getAsByteArray(java.lang.String arg0) {
        return real.getAsByteArray(arg0);
    }

    public java.lang.Double getAsDouble(java.lang.String arg0) {
        return real.getAsDouble(arg0);
    }

    public java.lang.Float getAsFloat(java.lang.String arg0) {
        return real.getAsFloat(arg0);
    }

    public java.lang.Integer getAsInteger(java.lang.String arg0) {
        return real.getAsInteger(arg0);
    }

    public java.lang.Long getAsLong(java.lang.String arg0) {
        return real.getAsLong(arg0);
    }

    public java.lang.Short getAsShort(java.lang.String arg0) {
        return real.getAsShort(arg0);
    }

    public java.lang.String getAsString(java.lang.String arg0) {
        return real.getAsString(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void put(java.lang.String arg0, java.lang.Float arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Double arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Boolean arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, byte[] arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.String arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Byte arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Short arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Integer arg1) {
        real.put(arg0, arg1);
    }

    public void put(java.lang.String arg0, java.lang.Long arg1) {
        real.put(arg0, arg1);
    }

    public void putAll(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
        real.putAll(arg0 == null ? null : arg0.unwrap());
    }

    public void putNull(java.lang.String arg0) {
        real.putNull(arg0);
    }

    public void remove(java.lang.String arg0) {
        real.remove(arg0);
    }

    public int size() {
        return real.size();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String TAG = android.content.ContentValues.TAG;

}
