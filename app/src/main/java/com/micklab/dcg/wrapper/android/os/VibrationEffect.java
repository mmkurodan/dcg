// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class VibrationEffect {
    private final android.os.VibrationEffect real;

    public VibrationEffect(android.os.VibrationEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.VibrationEffect wrap(android.os.VibrationEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.VibrationEffect(real);
    }

    public android.os.VibrationEffect unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.os.VibrationEffect createOneShot(long arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect#createOneShot(long,int)");
    }

    public static com.micklab.dcg.wrapper.android.os.VibrationEffect createPredefined(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect#createPredefined(int)");
    }

    public static com.micklab.dcg.wrapper.android.os.VibrationEffect createWaveform(long[] arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect#createWaveform([J,int)");
    }

    public static com.micklab.dcg.wrapper.android.os.VibrationEffect createWaveform(long[] arg0, int[] arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect#createWaveform([J,[I,int)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect#describeContents()");
    }

    public static com.micklab.dcg.wrapper.android.os.VibrationEffect.Composition startComposition() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect#startComposition()");
    }


    public static final class Composition {
        private final android.os.VibrationEffect.Composition real;

        public Composition(android.os.VibrationEffect.Composition real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.VibrationEffect.Composition wrap(android.os.VibrationEffect.Composition real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.VibrationEffect.Composition(real);
        }

        public android.os.VibrationEffect.Composition unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.os.VibrationEffect.Composition addPrimitive(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect$Composition#addPrimitive(int)");
        }

        public com.micklab.dcg.wrapper.android.os.VibrationEffect.Composition addPrimitive(int arg0, float arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect$Composition#addPrimitive(int,float)");
        }

        public com.micklab.dcg.wrapper.android.os.VibrationEffect.Composition addPrimitive(int arg0, float arg1, int arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect$Composition#addPrimitive(int,float,int)");
        }

        public com.micklab.dcg.wrapper.android.os.VibrationEffect compose() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibrationEffect$Composition#compose()");
        }


    }
}
