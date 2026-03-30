// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DisplayShape {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayShape(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DisplayShape wrap(android.view.DisplayShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DisplayShape(real, (__DcgwBridgeToken) null);
    }

    public android.view.DisplayShape getReal() {
        return (android.view.DisplayShape) real;
    }

    public android.view.DisplayShape unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.DisplayShape) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.DisplayShape) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.view.DisplayShape) real).getPath());
    }

    public int hashCode() {
        return ((android.view.DisplayShape) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.DisplayShape) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.DisplayShape) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
