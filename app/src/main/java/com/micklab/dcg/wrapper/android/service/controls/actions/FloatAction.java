// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class FloatAction {
    private final android.service.controls.actions.FloatAction real;

    public FloatAction(android.service.controls.actions.FloatAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.FloatAction wrap(android.service.controls.actions.FloatAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.FloatAction(real);
    }

    public android.service.controls.actions.FloatAction unwrap() {
        return real;
    }

    public FloatAction(java.lang.String arg0, float arg1) {
        this(new android.service.controls.actions.FloatAction(arg0, arg1));
    }

    public FloatAction(java.lang.String arg0, float arg1, java.lang.String arg2) {
        this(new android.service.controls.actions.FloatAction(arg0, arg1, arg2));
    }

    public int getActionType() {
        return real.getActionType();
    }

    public float getNewValue() {
        return real.getNewValue();
    }

}
