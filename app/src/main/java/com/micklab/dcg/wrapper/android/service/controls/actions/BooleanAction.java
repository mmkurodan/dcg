// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.controls.actions;

public final class BooleanAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BooleanAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.controls.actions.BooleanAction wrap(android.service.controls.actions.BooleanAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.controls.actions.BooleanAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.controls.actions.BooleanAction getReal() {
        return (android.service.controls.actions.BooleanAction) real;
    }

    public android.service.controls.actions.BooleanAction unwrap() {
        return getReal();
    }

    public BooleanAction(java.lang.String arg0, boolean arg1) {
        this(new android.service.controls.actions.BooleanAction(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public BooleanAction(java.lang.String arg0, boolean arg1, java.lang.String arg2) {
        this(new android.service.controls.actions.BooleanAction(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int getActionType() {
        return ((android.service.controls.actions.BooleanAction) real).getActionType();
    }

    public boolean getNewState() {
        return ((android.service.controls.actions.BooleanAction) real).getNewState();
    }

}
