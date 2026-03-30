// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class GameState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GameState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.GameState wrap(android.app.GameState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.GameState(real, (__DcgwBridgeToken) null);
    }

    public android.app.GameState getReal() {
        return (android.app.GameState) real;
    }

    public android.app.GameState unwrap() {
        return getReal();
    }

    public GameState(boolean arg0, int arg1) {
        this(new android.app.GameState(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public GameState(boolean arg0, int arg1, int arg2, int arg3) {
        this(new android.app.GameState(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.GameState) real).describeContents();
    }

    public int getLabel() {
        return ((android.app.GameState) real).getLabel();
    }

    public int getMode() {
        return ((android.app.GameState) real).getMode();
    }

    public int getQuality() {
        return ((android.app.GameState) real).getQuality();
    }

    public boolean isLoading() {
        return ((android.app.GameState) real).isLoading();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.GameState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int MODE_CONTENT = android.app.GameState.MODE_CONTENT;
    public static final int MODE_GAMEPLAY_INTERRUPTIBLE = android.app.GameState.MODE_GAMEPLAY_INTERRUPTIBLE;
    public static final int MODE_GAMEPLAY_UNINTERRUPTIBLE = android.app.GameState.MODE_GAMEPLAY_UNINTERRUPTIBLE;
    public static final int MODE_NONE = android.app.GameState.MODE_NONE;
    public static final int MODE_UNKNOWN = android.app.GameState.MODE_UNKNOWN;

}
