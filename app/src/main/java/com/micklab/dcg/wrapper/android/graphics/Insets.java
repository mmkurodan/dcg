// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Insets {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Insets(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Insets wrap(android.graphics.Insets real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Insets(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Insets getReal() {
        return (android.graphics.Insets) real;
    }

    public android.graphics.Insets unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.graphics.Insets add(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(android.graphics.Insets.add(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public int describeContents() {
        return ((android.graphics.Insets) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.Insets) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.graphics.Insets) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.graphics.Insets max(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(android.graphics.Insets.max(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Insets min(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(android.graphics.Insets.min(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Insets of(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(android.graphics.Insets.of(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Insets of(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(android.graphics.Insets.of(arg0, arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Insets subtract(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(android.graphics.Insets.subtract(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public java.lang.String toString() {
        return ((android.graphics.Insets) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.Insets) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final com.micklab.dcg.wrapper.android.graphics.Insets NONE = com.micklab.dcg.wrapper.android.graphics.Insets.wrap(android.graphics.Insets.NONE);

}
