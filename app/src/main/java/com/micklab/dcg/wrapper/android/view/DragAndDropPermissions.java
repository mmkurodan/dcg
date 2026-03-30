// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DragAndDropPermissions {
    private final android.view.DragAndDropPermissions real;

    public DragAndDropPermissions(android.view.DragAndDropPermissions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DragAndDropPermissions wrap(android.view.DragAndDropPermissions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DragAndDropPermissions(real);
    }

    public android.view.DragAndDropPermissions unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void release() {
        real.release();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
