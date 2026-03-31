// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ComponentName {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ComponentName(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName wrap(android.content.ComponentName real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ComponentName(real, (__DcgwBridgeToken) null);
    }

    public android.content.ComponentName getReal() {
        return (android.content.ComponentName) real;
    }

    public android.content.ComponentName unwrap() {
        return getReal();
    }

    public ComponentName(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.ComponentName(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ComponentName(java.lang.String arg0, java.lang.String arg1) {
        this(new android.content.ComponentName(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public ComponentName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        this(new android.content.ComponentName(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public ComponentName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.Class arg1) {
        this(new android.content.ComponentName(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName clone() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.content.ComponentName) real).clone());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return ((android.content.ComponentName) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName createRelative(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.createRelative(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName createRelative(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.createRelative(arg0, arg1));
    }

    public int describeContents() {
        return ((android.content.ComponentName) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.ComponentName) real).equals(arg0);
    }

    public java.lang.String flattenToShortString() {
        return ((android.content.ComponentName) real).flattenToShortString();
    }

    public java.lang.String flattenToString() {
        return ((android.content.ComponentName) real).flattenToString();
    }

    public java.lang.String getClassName() {
        return ((android.content.ComponentName) real).getClassName();
    }

    public java.lang.String getPackageName() {
        return ((android.content.ComponentName) real).getPackageName();
    }

    public java.lang.String getShortClassName() {
        return ((android.content.ComponentName) real).getShortClassName();
    }

    public int hashCode() {
        return ((android.content.ComponentName) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.readFromParcel(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String toShortString() {
        return ((android.content.ComponentName) real).toShortString();
    }

    public java.lang.String toString() {
        return ((android.content.ComponentName) real).toString();
    }

    public static com.micklab.dcg.wrapper.android.content.ComponentName unflattenFromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(android.content.ComponentName.unflattenFromString(arg0));
    }

    public static void writeToParcel(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1) {
        android.content.ComponentName.writeToParcel(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.ComponentName) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
