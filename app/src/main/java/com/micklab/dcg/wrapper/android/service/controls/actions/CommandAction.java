// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class CommandAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CommandAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.CommandAction wrap(android.service.controls.actions.CommandAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.CommandAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.actions.CommandAction getReal() {
        return (android.service.controls.actions.CommandAction) real;
    }

    public android.service.controls.actions.CommandAction unwrap() {
        return getReal();
    }

    public CommandAction(java.lang.String arg0) {
        this(new android.service.controls.actions.CommandAction(arg0), (__DcgwBridgeToken) null);
    }

    public CommandAction(java.lang.String arg0, java.lang.String arg1) {
        this(new android.service.controls.actions.CommandAction(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int getActionType() {
        return ((android.service.controls.actions.CommandAction) real).getActionType();
    }

}
