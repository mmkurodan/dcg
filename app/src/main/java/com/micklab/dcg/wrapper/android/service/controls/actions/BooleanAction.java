// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class BooleanAction {
    private final android.service.controls.actions.BooleanAction real;

    public BooleanAction(android.service.controls.actions.BooleanAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.BooleanAction wrap(android.service.controls.actions.BooleanAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.BooleanAction(real);
    }

    public android.service.controls.actions.BooleanAction unwrap() {
        return real;
    }

    public BooleanAction(java.lang.String arg0, boolean arg1) {
        this(new android.service.controls.actions.BooleanAction(arg0, arg1));
    }

    public BooleanAction(java.lang.String arg0, boolean arg1, java.lang.String arg2) {
        this(new android.service.controls.actions.BooleanAction(arg0, arg1, arg2));
    }

    public int getActionType() {
        return real.getActionType();
    }

    public boolean getNewState() {
        return real.getNewState();
    }

}
