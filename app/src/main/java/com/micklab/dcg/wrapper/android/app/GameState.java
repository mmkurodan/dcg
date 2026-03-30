// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class GameState {
    private final android.app.GameState real;

    public GameState(android.app.GameState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.GameState wrap(android.app.GameState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.GameState(real);
    }

    public android.app.GameState unwrap() {
        return real;
    }

    public GameState(boolean arg0, int arg1) {
        this(new android.app.GameState(arg0, arg1));
    }

    public GameState(boolean arg0, int arg1, int arg2, int arg3) {
        this(new android.app.GameState(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getLabel() {
        return real.getLabel();
    }

    public int getMode() {
        return real.getMode();
    }

    public int getQuality() {
        return real.getQuality();
    }

    public boolean isLoading() {
        return real.isLoading();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int MODE_CONTENT = android.app.GameState.MODE_CONTENT;
    public static final int MODE_GAMEPLAY_INTERRUPTIBLE = android.app.GameState.MODE_GAMEPLAY_INTERRUPTIBLE;
    public static final int MODE_GAMEPLAY_UNINTERRUPTIBLE = android.app.GameState.MODE_GAMEPLAY_UNINTERRUPTIBLE;
    public static final int MODE_NONE = android.app.GameState.MODE_NONE;
    public static final int MODE_UNKNOWN = android.app.GameState.MODE_UNKNOWN;

}
