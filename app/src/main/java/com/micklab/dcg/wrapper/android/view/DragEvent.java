// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class DragEvent {
    private final android.view.DragEvent real;

    public DragEvent(android.view.DragEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.DragEvent wrap(android.view.DragEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.DragEvent(real);
    }

    public android.view.DragEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAction() {
        return real.getAction();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClipData() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(real.getClipData());
    }

    public com.micklab.dcg.wrapper.android.content.ClipDescription getClipDescription() {
        return com.micklab.dcg.wrapper.android.content.ClipDescription.wrap(real.getClipDescription());
    }

    public java.lang.Object getLocalState() {
        return real.getLocalState();
    }

    public boolean getResult() {
        return real.getResult();
    }

    public float getX() {
        return real.getX();
    }

    public float getY() {
        return real.getY();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ACTION_DRAG_ENDED = android.view.DragEvent.ACTION_DRAG_ENDED;
    public static final int ACTION_DRAG_ENTERED = android.view.DragEvent.ACTION_DRAG_ENTERED;
    public static final int ACTION_DRAG_EXITED = android.view.DragEvent.ACTION_DRAG_EXITED;
    public static final int ACTION_DRAG_LOCATION = android.view.DragEvent.ACTION_DRAG_LOCATION;
    public static final int ACTION_DRAG_STARTED = android.view.DragEvent.ACTION_DRAG_STARTED;
    public static final int ACTION_DROP = android.view.DragEvent.ACTION_DROP;

}
