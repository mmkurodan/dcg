// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class CombinedVibration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CombinedVibration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.CombinedVibration wrap(android.os.CombinedVibration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.CombinedVibration(real, (__DcgwBridgeToken) null);
    }

    public android.os.CombinedVibration getReal() {
        return (android.os.CombinedVibration) real;
    }

    public android.os.CombinedVibration unwrap() {
        return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ParallelCombination(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.CombinedVibration.ParallelCombination wrap(android.os.CombinedVibration.ParallelCombination real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.CombinedVibration.ParallelCombination(real, (__DcgwBridgeToken) null);
        }

        public android.os.CombinedVibration.ParallelCombination getReal() {
            return (android.os.CombinedVibration.ParallelCombination) real;
        }

        public android.os.CombinedVibration.ParallelCombination unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.os.CombinedVibration.ParallelCombination addVibrator(int arg0, com.micklab.dcg.wrapper.android.os.VibrationEffect arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CombinedVibration$ParallelCombination#addVibrator(int,android.os.VibrationEffect)");
        }

        public com.micklab.dcg.wrapper.android.os.CombinedVibration combine() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.CombinedVibration$ParallelCombination#combine()");
        }

    }
}
