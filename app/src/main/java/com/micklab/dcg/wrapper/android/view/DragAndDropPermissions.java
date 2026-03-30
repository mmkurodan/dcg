// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DragAndDropPermissions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DragAndDropPermissions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DragAndDropPermissions wrap(android.view.DragAndDropPermissions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DragAndDropPermissions(real, (__DcgwBridgeToken) null);
    }

    public android.view.DragAndDropPermissions getReal() {
        return (android.view.DragAndDropPermissions) real;
    }

    public android.view.DragAndDropPermissions unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.DragAndDropPermissions) real).describeContents();
    }

    public void release() {
        ((android.view.DragAndDropPermissions) real).release();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.DragAndDropPermissions) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
