// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class BackEvent {
    private final android.window.BackEvent real;

    public BackEvent(android.window.BackEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.BackEvent wrap(android.window.BackEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.BackEvent(real);
    }

    public android.window.BackEvent unwrap() {
        return real;
    }

    public BackEvent(float arg0, float arg1, float arg2, int arg3) {
        this(new android.window.BackEvent(arg0, arg1, arg2, arg3));
    }

    public float getProgress() {
        return real.getProgress();
    }

    public int getSwipeEdge() {
        return real.getSwipeEdge();
    }

    public float getTouchX() {
        return real.getTouchX();
    }

    public float getTouchY() {
        return real.getTouchY();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int EDGE_LEFT = android.window.BackEvent.EDGE_LEFT;
    public static final int EDGE_RIGHT = android.window.BackEvent.EDGE_RIGHT;

}
