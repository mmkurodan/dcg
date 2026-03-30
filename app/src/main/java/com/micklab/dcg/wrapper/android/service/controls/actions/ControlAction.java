// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class ControlAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ControlAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.ControlAction wrap(android.service.controls.actions.ControlAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.ControlAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.actions.ControlAction getReal() {
        return (android.service.controls.actions.ControlAction) real;
    }

    public android.service.controls.actions.ControlAction unwrap() {
        return getReal();
    }

    public int getActionType() {
        return ((android.service.controls.actions.ControlAction) real).getActionType();
    }

    public java.lang.String getChallengeValue() {
        return ((android.service.controls.actions.ControlAction) real).getChallengeValue();
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.ControlAction getErrorAction() {
        return com.micklab.dcg.wrapper.android.service.controls.actions.ControlAction.wrap(android.service.controls.actions.ControlAction.getErrorAction());
    }

    public java.lang.String getTemplateId() {
        return ((android.service.controls.actions.ControlAction) real).getTemplateId();
    }

    public static boolean isValidResponse(int arg0) {
        return android.service.controls.actions.ControlAction.isValidResponse(arg0);
    }

    public static final int RESPONSE_CHALLENGE_ACK = android.service.controls.actions.ControlAction.RESPONSE_CHALLENGE_ACK;
    public static final int RESPONSE_CHALLENGE_PASSPHRASE = android.service.controls.actions.ControlAction.RESPONSE_CHALLENGE_PASSPHRASE;
    public static final int RESPONSE_CHALLENGE_PIN = android.service.controls.actions.ControlAction.RESPONSE_CHALLENGE_PIN;
    public static final int RESPONSE_FAIL = android.service.controls.actions.ControlAction.RESPONSE_FAIL;
    public static final int RESPONSE_OK = android.service.controls.actions.ControlAction.RESPONSE_OK;
    public static final int RESPONSE_UNKNOWN = android.service.controls.actions.ControlAction.RESPONSE_UNKNOWN;
    public static final int TYPE_BOOLEAN = android.service.controls.actions.ControlAction.TYPE_BOOLEAN;
    public static final int TYPE_COMMAND = android.service.controls.actions.ControlAction.TYPE_COMMAND;
    public static final int TYPE_ERROR = android.service.controls.actions.ControlAction.TYPE_ERROR;
    public static final int TYPE_FLOAT = android.service.controls.actions.ControlAction.TYPE_FLOAT;
    public static final int TYPE_MODE = android.service.controls.actions.ControlAction.TYPE_MODE;

}
