// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class StaticInspectionCompanionProvider {
    private final android.view.inspector.StaticInspectionCompanionProvider real;

    public StaticInspectionCompanionProvider(android.view.inspector.StaticInspectionCompanionProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.StaticInspectionCompanionProvider wrap(android.view.inspector.StaticInspectionCompanionProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.StaticInspectionCompanionProvider(real);
    }

    public android.view.inspector.StaticInspectionCompanionProvider unwrap() {
        return real;
    }

    public StaticInspectionCompanionProvider() {
        this(new android.view.inspector.StaticInspectionCompanionProvider());
    }

}
