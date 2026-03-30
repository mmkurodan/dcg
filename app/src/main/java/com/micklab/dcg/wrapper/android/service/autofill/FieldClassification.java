// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FieldClassification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FieldClassification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FieldClassification wrap(android.service.autofill.FieldClassification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FieldClassification(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.FieldClassification getReal() {
        return (android.service.autofill.FieldClassification) real;
    }

    public android.service.autofill.FieldClassification unwrap() {
        return getReal();
    }

    public java.lang.String toString() {
        return ((android.service.autofill.FieldClassification) real).toString();
    }

    public static final class Match {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Match(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.FieldClassification.Match wrap(android.service.autofill.FieldClassification.Match real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FieldClassification.Match(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.FieldClassification.Match getReal() {
            return (android.service.autofill.FieldClassification.Match) real;
        }

        public android.service.autofill.FieldClassification.Match unwrap() {
            return getReal();
        }

        public java.lang.String getCategoryId() {
            return ((android.service.autofill.FieldClassification.Match) real).getCategoryId();
        }

        public float getScore() {
            return ((android.service.autofill.FieldClassification.Match) real).getScore();
        }

        public java.lang.String toString() {
            return ((android.service.autofill.FieldClassification.Match) real).toString();
        }

    }
}
