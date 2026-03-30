// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class GameManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GameManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.GameManager wrap(android.app.GameManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.GameManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.GameManager getReal() {
        return (android.app.GameManager) real;
    }

    public android.app.GameManager unwrap() {
        return getReal();
    }

    public int getGameMode() {
        return ((android.app.GameManager) real).getGameMode();
    }

    public void setGameState(com.micklab.dcg.wrapper.android.app.GameState arg0) {
        ((android.app.GameManager) real).setGameState(arg0 == null ? null : arg0.getReal());
    }

    public static final int GAME_MODE_BATTERY = android.app.GameManager.GAME_MODE_BATTERY;
    public static final int GAME_MODE_CUSTOM = android.app.GameManager.GAME_MODE_CUSTOM;
    public static final int GAME_MODE_PERFORMANCE = android.app.GameManager.GAME_MODE_PERFORMANCE;
    public static final int GAME_MODE_STANDARD = android.app.GameManager.GAME_MODE_STANDARD;
    public static final int GAME_MODE_UNSUPPORTED = android.app.GameManager.GAME_MODE_UNSUPPORTED;

}
