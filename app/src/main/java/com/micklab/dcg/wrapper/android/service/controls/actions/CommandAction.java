// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class CommandAction {
    private final android.service.controls.actions.CommandAction real;

    public CommandAction(android.service.controls.actions.CommandAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.CommandAction wrap(android.service.controls.actions.CommandAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.CommandAction(real);
    }

    public android.service.controls.actions.CommandAction unwrap() {
        return real;
    }

    public CommandAction(java.lang.String arg0) {
        this(new android.service.controls.actions.CommandAction(arg0));
    }

    public CommandAction(java.lang.String arg0, java.lang.String arg1) {
        this(new android.service.controls.actions.CommandAction(arg0, arg1));
    }

    public int getActionType() {
        return real.getActionType();
    }

}
