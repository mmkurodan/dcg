// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class InspectionCompanionProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InspectionCompanionProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanionProvider wrap(android.view.inspector.InspectionCompanionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanionProvider(real, (__DcgwBridgeToken) null);
    }

    public android.view.inspector.InspectionCompanionProvider getReal() {
        return (android.view.inspector.InspectionCompanionProvider) real;
    }

    public android.view.inspector.InspectionCompanionProvider unwrap() {
        return getReal();
    }

}
