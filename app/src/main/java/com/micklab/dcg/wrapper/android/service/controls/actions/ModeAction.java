// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class ModeAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ModeAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.ModeAction wrap(android.service.controls.actions.ModeAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.ModeAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.actions.ModeAction getReal() {
        return (android.service.controls.actions.ModeAction) real;
    }

    public android.service.controls.actions.ModeAction unwrap() {
        return getReal();
    }

    public ModeAction(java.lang.String arg0, int arg1) {
        this(new android.service.controls.actions.ModeAction(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public ModeAction(java.lang.String arg0, int arg1, java.lang.String arg2) {
        this(new android.service.controls.actions.ModeAction(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int getActionType() {
        return ((android.service.controls.actions.ModeAction) real).getActionType();
    }

    public int getNewMode() {
        return ((android.service.controls.actions.ModeAction) real).getNewMode();
    }

}
