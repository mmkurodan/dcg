// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class BackEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.BackEvent wrap(android.window.BackEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.BackEvent(real, (__DcgwBridgeToken) null);
    }

    public android.window.BackEvent getReal() {
        return (android.window.BackEvent) real;
    }

    public android.window.BackEvent unwrap() {
        return getReal();
    }

    public BackEvent(float arg0, float arg1, float arg2, int arg3) {
        this(new android.window.BackEvent(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public BackEvent(float arg0, float arg1, float arg2, int arg3, long arg4) {
        this(new android.window.BackEvent(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.window.BackEvent) real).equals(arg0);
    }

    public long getFrameTimeMillis() {
        return ((android.window.BackEvent) real).getFrameTimeMillis();
    }

    public float getProgress() {
        return ((android.window.BackEvent) real).getProgress();
    }

    public int getSwipeEdge() {
        return ((android.window.BackEvent) real).getSwipeEdge();
    }

    public float getTouchX() {
        return ((android.window.BackEvent) real).getTouchX();
    }

    public float getTouchY() {
        return ((android.window.BackEvent) real).getTouchY();
    }

    public java.lang.String toString() {
        return ((android.window.BackEvent) real).toString();
    }

    public static final int EDGE_LEFT = android.window.BackEvent.EDGE_LEFT;
    public static final int EDGE_NONE = android.window.BackEvent.EDGE_NONE;
    public static final int EDGE_RIGHT = android.window.BackEvent.EDGE_RIGHT;

}
