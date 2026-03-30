// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class BassBoost {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BassBoost(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.BassBoost wrap(android.media.audiofx.BassBoost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.BassBoost(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.BassBoost getReal() {
        return (android.media.audiofx.BassBoost) real;
    }

    public android.media.audiofx.BassBoost unwrap() {
        return getReal();
    }

    public BassBoost(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.BassBoost(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings.wrap(((android.media.audiofx.BassBoost) real).getProperties());
    }

    public short getRoundedStrength() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.BassBoost) real).getRoundedStrength();
    }

    public boolean getStrengthSupported() {
        return ((android.media.audiofx.BassBoost) real).getStrengthSupported();
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.OnParameterChangeListener arg0) {
        ((android.media.audiofx.BassBoost) real).setParameterListener(arg0 == null ? null : arg0.getReal());
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.BassBoost) real).setProperties(arg0 == null ? null : arg0.getReal());
    }

    public void setStrength(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.BassBoost) real).setStrength(arg0);
    }

    public static final int PARAM_STRENGTH = android.media.audiofx.BassBoost.PARAM_STRENGTH;
    public static final int PARAM_STRENGTH_SUPPORTED = android.media.audiofx.BassBoost.PARAM_STRENGTH_SUPPORTED;

    public static final class OnParameterChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnParameterChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.OnParameterChangeListener wrap(android.media.audiofx.BassBoost.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.OnParameterChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.BassBoost.OnParameterChangeListener getReal() {
            return (android.media.audiofx.BassBoost.OnParameterChangeListener) real;
        }

        public android.media.audiofx.BassBoost.OnParameterChangeListener unwrap() {
            return getReal();
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.BassBoost arg0, int arg1, int arg2, short arg3) {
            ((android.media.audiofx.BassBoost.OnParameterChangeListener) real).onParameterChange(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Settings(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings wrap(android.media.audiofx.BassBoost.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.BassBoost.Settings getReal() {
            return (android.media.audiofx.BassBoost.Settings) real;
        }

        public android.media.audiofx.BassBoost.Settings unwrap() {
            return getReal();
        }

        public Settings() {
            this(new android.media.audiofx.BassBoost.Settings(), (__DcgwBridgeToken) null);
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.BassBoost.Settings(arg0), (__DcgwBridgeToken) null);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.BassBoost.Settings) real).toString();
        }


    }
}
