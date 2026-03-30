// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class GameManager {
    private final android.app.GameManager real;

    public GameManager(android.app.GameManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.GameManager wrap(android.app.GameManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.GameManager(real);
    }

    public android.app.GameManager unwrap() {
        return real;
    }

    public int getGameMode() {
        return real.getGameMode();
    }

    public void setGameState(com.micklab.dcg.wrapper.android.app.GameState arg0) {
        real.setGameState(arg0 == null ? null : arg0.unwrap());
    }

    public static final int GAME_MODE_BATTERY = android.app.GameManager.GAME_MODE_BATTERY;
    public static final int GAME_MODE_CUSTOM = android.app.GameManager.GAME_MODE_CUSTOM;
    public static final int GAME_MODE_PERFORMANCE = android.app.GameManager.GAME_MODE_PERFORMANCE;
    public static final int GAME_MODE_STANDARD = android.app.GameManager.GAME_MODE_STANDARD;
    public static final int GAME_MODE_UNSUPPORTED = android.app.GameManager.GAME_MODE_UNSUPPORTED;

}
