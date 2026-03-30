// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DragEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DragEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DragEvent wrap(android.view.DragEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DragEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.DragEvent getReal() {
        return (android.view.DragEvent) real;
    }

    public android.view.DragEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.DragEvent) real).describeContents();
    }

    public int getAction() {
        return ((android.view.DragEvent) real).getAction();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClipData() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(((android.view.DragEvent) real).getClipData());
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getClipDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(((android.view.DragEvent) real).getClipDescription());
    }

    public java.lang.Object getLocalState() {
        return ((android.view.DragEvent) real).getLocalState();
    }

    public boolean getResult() {
        return ((android.view.DragEvent) real).getResult();
    }

    public float getX() {
        return ((android.view.DragEvent) real).getX();
    }

    public float getY() {
        return ((android.view.DragEvent) real).getY();
    }

    public java.lang.String toString() {
        return ((android.view.DragEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.DragEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ACTION_DRAG_ENDED = android.view.DragEvent.ACTION_DRAG_ENDED;
    public static final int ACTION_DRAG_ENTERED = android.view.DragEvent.ACTION_DRAG_ENTERED;
    public static final int ACTION_DRAG_EXITED = android.view.DragEvent.ACTION_DRAG_EXITED;
    public static final int ACTION_DRAG_LOCATION = android.view.DragEvent.ACTION_DRAG_LOCATION;
    public static final int ACTION_DRAG_STARTED = android.view.DragEvent.ACTION_DRAG_STARTED;
    public static final int ACTION_DROP = android.view.DragEvent.ACTION_DROP;

}
