// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class ModeAction {
    private final android.service.controls.actions.ModeAction real;

    public ModeAction(android.service.controls.actions.ModeAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.ModeAction wrap(android.service.controls.actions.ModeAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.ModeAction(real);
    }

    public android.service.controls.actions.ModeAction unwrap() {
        return real;
    }

    public ModeAction(java.lang.String arg0, int arg1) {
        this(new android.service.controls.actions.ModeAction(arg0, arg1));
    }

    public ModeAction(java.lang.String arg0, int arg1, java.lang.String arg2) {
        this(new android.service.controls.actions.ModeAction(arg0, arg1, arg2));
    }

    public int getActionType() {
        return real.getActionType();
    }

    public int getNewMode() {
        return real.getNewMode();
    }

}
