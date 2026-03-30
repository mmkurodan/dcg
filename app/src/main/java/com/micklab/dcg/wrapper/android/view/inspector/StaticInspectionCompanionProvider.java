// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class StaticInspectionCompanionProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StaticInspectionCompanionProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.StaticInspectionCompanionProvider wrap(android.view.inspector.StaticInspectionCompanionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.StaticInspectionCompanionProvider(real, (__DcgwBridgeToken) null);
    }

    public android.view.inspector.StaticInspectionCompanionProvider getReal() {
        return (android.view.inspector.StaticInspectionCompanionProvider) real;
    }

    public android.view.inspector.StaticInspectionCompanionProvider unwrap() {
        return getReal();
    }

    public StaticInspectionCompanionProvider() {
        this(new android.view.inspector.StaticInspectionCompanionProvider(), (__DcgwBridgeToken) null);
    }

}
