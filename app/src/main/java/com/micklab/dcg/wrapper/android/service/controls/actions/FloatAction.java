// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class FloatAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FloatAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.FloatAction wrap(android.service.controls.actions.FloatAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.FloatAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.actions.FloatAction getReal() {
        return (android.service.controls.actions.FloatAction) real;
    }

    public android.service.controls.actions.FloatAction unwrap() {
        return getReal();
    }

    public FloatAction(java.lang.String arg0, float arg1) {
        this(new android.service.controls.actions.FloatAction(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public FloatAction(java.lang.String arg0, float arg1, java.lang.String arg2) {
        this(new android.service.controls.actions.FloatAction(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int getActionType() {
        return ((android.service.controls.actions.FloatAction) real).getActionType();
    }

    public float getNewValue() {
        return ((android.service.controls.actions.FloatAction) real).getNewValue();
    }

}
