// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class InspectionCompanion {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InspectionCompanion(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion wrap(android.view.inspector.InspectionCompanion real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion(real, (__DcgwBridgeToken) null);
    }

    public android.view.inspector.InspectionCompanion getReal() {
        return (android.view.inspector.InspectionCompanion) real;
    }

    public android.view.inspector.InspectionCompanion unwrap() {
        return getReal();
    }

    public void mapProperties(com.micklab.dcg.wrapper.android.view.inspector.PropertyMapper arg0) {
        ((android.view.inspector.InspectionCompanion) real).mapProperties(arg0 == null ? null : arg0.getReal());
    }

    public void readProperties(java.lang.Object arg0, com.micklab.dcg.wrapper.android.view.inspector.PropertyReader arg1) {
        ((android.view.inspector.InspectionCompanion) real).readProperties(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final class UninitializedPropertyMapException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UninitializedPropertyMapException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion.UninitializedPropertyMapException wrap(android.view.inspector.InspectionCompanion.UninitializedPropertyMapException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.InspectionCompanion.UninitializedPropertyMapException(real, (__DcgwBridgeToken) null);
        }

        public android.view.inspector.InspectionCompanion.UninitializedPropertyMapException getReal() {
            return (android.view.inspector.InspectionCompanion.UninitializedPropertyMapException) real;
        }

        public android.view.inspector.InspectionCompanion.UninitializedPropertyMapException unwrap() {
            return getReal();
        }

        public UninitializedPropertyMapException() {
            this(new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException(), (__DcgwBridgeToken) null);
        }

    }
}
