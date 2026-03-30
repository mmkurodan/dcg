// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FieldClassification {
    private final android.service.autofill.FieldClassification real;

    public FieldClassification(android.service.autofill.FieldClassification real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FieldClassification wrap(android.service.autofill.FieldClassification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FieldClassification(real);
    }

    public android.service.autofill.FieldClassification unwrap() {
        return real;
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Match {
        private final android.service.autofill.FieldClassification.Match real;

        public Match(android.service.autofill.FieldClassification.Match real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.FieldClassification.Match wrap(android.service.autofill.FieldClassification.Match real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FieldClassification.Match(real);
        }

        public android.service.autofill.FieldClassification.Match unwrap() {
            return real;
        }

        public java.lang.String getCategoryId() {
            return real.getCategoryId();
        }

        public float getScore() {
            return real.getScore();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
