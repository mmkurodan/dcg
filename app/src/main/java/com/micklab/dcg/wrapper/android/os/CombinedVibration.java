// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CombinedVibration {
    private final android.os.CombinedVibration real;

    public CombinedVibration(android.os.CombinedVibration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CombinedVibration wrap(android.os.CombinedVibration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CombinedVibration(real);
    }

    public android.os.CombinedVibration unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.os.CombinedVibration createParallel(com.micklab.dcg.wrapper.android.os.VibrationEffect arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CombinedVibration#createParallel(android.os.VibrationEffect)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CombinedVibration#describeContents()");
    }

    public static com.micklab.dcg.wrapper.android.os.CombinedVibration.ParallelCombination startParallel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CombinedVibration#startParallel()");
    }


    public static final class ParallelCombination {
        private final android.os.CombinedVibration.ParallelCombination real;

        public ParallelCombination(android.os.CombinedVibration.ParallelCombination real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.CombinedVibration.ParallelCombination wrap(android.os.CombinedVibration.ParallelCombination real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.CombinedVibration.ParallelCombination(real);
        }

        public android.os.CombinedVibration.ParallelCombination unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.os.CombinedVibration.ParallelCombination addVibrator(int arg0, com.micklab.dcg.wrapper.android.os.VibrationEffect arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CombinedVibration$ParallelCombination#addVibrator(int,android.os.VibrationEffect)");
        }

        public com.micklab.dcg.wrapper.android.os.CombinedVibration combine() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CombinedVibration$ParallelCombination#combine()");
        }

    }
}
