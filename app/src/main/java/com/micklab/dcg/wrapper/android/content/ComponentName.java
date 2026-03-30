// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ComponentName {
    private final android.content.ComponentName real;

    public ComponentName(android.content.ComponentName real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName wrap(android.content.ComponentName real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ComponentName(real);
    }

    public android.content.ComponentName unwrap() {
        return real;
    }

    public ComponentName(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.ComponentName(arg0 == null ? null : arg0.unwrap()));
    }

    public ComponentName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.Class arg1) {
        this(new android.content.ComponentName(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ComponentName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        this(new android.content.ComponentName(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public ComponentName(java.lang.String arg0, java.lang.String arg1) {
        this(new android.content.ComponentName(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName clone() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.clone());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName createRelative(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.createRelative(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName createRelative(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.createRelative(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String flattenToShortString() {
        return real.flattenToShortString();
    }

    public java.lang.String flattenToString() {
        return real.flattenToString();
    }

    public java.lang.String getClassName() {
        return real.getClassName();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public java.lang.String getShortClassName() {
        return real.getShortClassName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.readFromParcel(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String toShortString() {
        return real.toShortString();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName unflattenFromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.unflattenFromString(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static void writeToParcel(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1) {
        android.content.ComponentName.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }


}
