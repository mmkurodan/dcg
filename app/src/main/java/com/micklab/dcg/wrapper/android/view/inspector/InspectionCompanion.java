// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class InspectionCompanion {
    private final android.view.inspector.InspectionCompanion real;

    public InspectionCompanion(android.view.inspector.InspectionCompanion real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion wrap(android.view.inspector.InspectionCompanion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion(real);
    }

    public android.view.inspector.InspectionCompanion unwrap() {
        return real;
    }

    public void mapProperties(com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper arg0) {
        real.mapProperties(arg0 == null ? null : arg0.unwrap());
    }

    public void readProperties(java.lang.Object arg0, com.micklab.dcg.wrapper.android.view.inspector.PropertyReader arg1) {
        real.readProperties(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final class UninitializedPropertyMapException {
        private final android.view.inspector.InspectionCompanion.UninitializedPropertyMapException real;

        public UninitializedPropertyMapException(android.view.inspector.InspectionCompanion.UninitializedPropertyMapException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion.UninitializedPropertyMapException wrap(android.view.inspector.InspectionCompanion.UninitializedPropertyMapException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion.UninitializedPropertyMapException(real);
        }

        public android.view.inspector.InspectionCompanion.UninitializedPropertyMapException unwrap() {
            return real;
        }

        public UninitializedPropertyMapException() {
            this(new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException());
        }

    }
}
