// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class DisplayLuts {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayLuts(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.DisplayLuts wrap(android.hardware.DisplayLuts real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.DisplayLuts(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.DisplayLuts getReal() {
        return (android.hardware.DisplayLuts) real;
    }

    public android.hardware.DisplayLuts unwrap() {
        return getReal();
    }

    public DisplayLuts() {
        this(new android.hardware.DisplayLuts(), (__DcgwBridgeToken) null);
    }

    public void set(com.micklab.dcg.wrapper.android.hardware.DisplayLuts.Entry arg0) {
        ((android.hardware.DisplayLuts) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void set(com.micklab.dcg.wrapper.android.hardware.DisplayLuts.Entry arg0, com.micklab.dcg.wrapper.android.hardware.DisplayLuts.Entry arg1) {
        ((android.hardware.DisplayLuts) real).set(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public java.lang.String toString() {
        return ((android.hardware.DisplayLuts) real).toString();
    }

    public static final class Entry {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Entry(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.DisplayLuts.Entry wrap(android.hardware.DisplayLuts.Entry real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.DisplayLuts.Entry(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.DisplayLuts.Entry getReal() {
            return (android.hardware.DisplayLuts.Entry) real;
        }

        public android.hardware.DisplayLuts.Entry unwrap() {
            return getReal();
        }

        public Entry(float[] arg0, int arg1, int arg2) {
            this(new android.hardware.DisplayLuts.Entry(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public float[] getBuffer() {
            return ((android.hardware.DisplayLuts.Entry) real).getBuffer();
        }

        public int getDimension() {
            return ((android.hardware.DisplayLuts.Entry) real).getDimension();
        }

        public int getSamplingKey() {
            return ((android.hardware.DisplayLuts.Entry) real).getSamplingKey();
        }

        public java.lang.String toString() {
            return ((android.hardware.DisplayLuts.Entry) real).toString();
        }

    }
}
