// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class ListItem {
    private final android.graphics.pdf.models.ListItem real;

    public ListItem(android.graphics.pdf.models.ListItem real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.ListItem wrap(android.graphics.pdf.models.ListItem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.ListItem(real);
    }

    public android.graphics.pdf.models.ListItem unwrap() {
        return real;
    }

    public ListItem(java.lang.String arg0, boolean arg1) {
        this(new android.graphics.pdf.models.ListItem(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getLabel() {
        return real.getLabel();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isSelected() {
        return real.isSelected();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
