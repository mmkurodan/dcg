// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class PointerIcon {
    private final android.view.PointerIcon real;

    public PointerIcon(android.view.PointerIcon real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.PointerIcon wrap(android.view.PointerIcon real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.PointerIcon(real);
    }

    public android.view.PointerIcon unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.view.PointerIcon create(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, float arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(android.view.PointerIcon.create(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.PointerIcon getSystemIcon(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(android.view.PointerIcon.getSystemIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.PointerIcon load(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(android.view.PointerIcon.load(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_ALIAS = android.view.PointerIcon.TYPE_ALIAS;
    public static final int TYPE_ALL_SCROLL = android.view.PointerIcon.TYPE_ALL_SCROLL;
    public static final int TYPE_ARROW = android.view.PointerIcon.TYPE_ARROW;
    public static final int TYPE_CELL = android.view.PointerIcon.TYPE_CELL;
    public static final int TYPE_CONTEXT_MENU = android.view.PointerIcon.TYPE_CONTEXT_MENU;
    public static final int TYPE_COPY = android.view.PointerIcon.TYPE_COPY;
    public static final int TYPE_CROSSHAIR = android.view.PointerIcon.TYPE_CROSSHAIR;
    public static final int TYPE_DEFAULT = android.view.PointerIcon.TYPE_DEFAULT;
    public static final int TYPE_GRAB = android.view.PointerIcon.TYPE_GRAB;
    public static final int TYPE_GRABBING = android.view.PointerIcon.TYPE_GRABBING;
    public static final int TYPE_HAND = android.view.PointerIcon.TYPE_HAND;
    public static final int TYPE_HANDWRITING = android.view.PointerIcon.TYPE_HANDWRITING;
    public static final int TYPE_HELP = android.view.PointerIcon.TYPE_HELP;
    public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = android.view.PointerIcon.TYPE_HORIZONTAL_DOUBLE_ARROW;
    public static final int TYPE_NO_DROP = android.view.PointerIcon.TYPE_NO_DROP;
    public static final int TYPE_NULL = android.view.PointerIcon.TYPE_NULL;
    public static final int TYPE_TEXT = android.view.PointerIcon.TYPE_TEXT;
    public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = android.view.PointerIcon.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW;
    public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = android.view.PointerIcon.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
    public static final int TYPE_VERTICAL_DOUBLE_ARROW = android.view.PointerIcon.TYPE_VERTICAL_DOUBLE_ARROW;
    public static final int TYPE_VERTICAL_TEXT = android.view.PointerIcon.TYPE_VERTICAL_TEXT;
    public static final int TYPE_WAIT = android.view.PointerIcon.TYPE_WAIT;
    public static final int TYPE_ZOOM_IN = android.view.PointerIcon.TYPE_ZOOM_IN;
    public static final int TYPE_ZOOM_OUT = android.view.PointerIcon.TYPE_ZOOM_OUT;

}
