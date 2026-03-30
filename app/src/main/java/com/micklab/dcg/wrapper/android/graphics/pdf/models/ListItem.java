// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class ListItem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListItem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.ListItem wrap(android.graphics.pdf.models.ListItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.ListItem(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.models.ListItem getReal() {
        return (android.graphics.pdf.models.ListItem) real;
    }

    public android.graphics.pdf.models.ListItem unwrap() {
        return getReal();
    }

    public ListItem(java.lang.String arg0, boolean arg1) {
        this(new android.graphics.pdf.models.ListItem(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.models.ListItem) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.pdf.models.ListItem) real).equals(arg0);
    }

    public java.lang.String getLabel() {
        return ((android.graphics.pdf.models.ListItem) real).getLabel();
    }

    public int hashCode() {
        return ((android.graphics.pdf.models.ListItem) real).hashCode();
    }

    public boolean isSelected() {
        return ((android.graphics.pdf.models.ListItem) real).isSelected();
    }

    public java.lang.String toString() {
        return ((android.graphics.pdf.models.ListItem) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.models.ListItem) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
