// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class BassBoost {
    private final android.media.audiofx.BassBoost real;

    public BassBoost(android.media.audiofx.BassBoost real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.BassBoost wrap(android.media.audiofx.BassBoost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.BassBoost(real);
    }

    public android.media.audiofx.BassBoost unwrap() {
        return real;
    }

    public BassBoost(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.BassBoost(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings.wrap(real.getProperties());
    }

    public short getRoundedStrength() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getRoundedStrength();
    }

    public boolean getStrengthSupported() {
        return real.getStrengthSupported();
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.OnParameterChangeListener arg0) {
        real.setParameterListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setProperties(arg0 == null ? null : arg0.unwrap());
    }

    public void setStrength(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setStrength(arg0);
    }

    public static final int PARAM_STRENGTH = android.media.audiofx.BassBoost.PARAM_STRENGTH;
    public static final int PARAM_STRENGTH_SUPPORTED = android.media.audiofx.BassBoost.PARAM_STRENGTH_SUPPORTED;

    public static final class OnParameterChangeListener {
        private final android.media.audiofx.BassBoost.OnParameterChangeListener real;

        public OnParameterChangeListener(android.media.audiofx.BassBoost.OnParameterChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.OnParameterChangeListener wrap(android.media.audiofx.BassBoost.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.OnParameterChangeListener(real);
        }

        public android.media.audiofx.BassBoost.OnParameterChangeListener unwrap() {
            return real;
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.BassBoost arg0, int arg1, int arg2, short arg3) {
            real.onParameterChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private final android.media.audiofx.BassBoost.Settings real;

        public Settings(android.media.audiofx.BassBoost.Settings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings wrap(android.media.audiofx.BassBoost.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.BassBoost.Settings(real);
        }

        public android.media.audiofx.BassBoost.Settings unwrap() {
            return real;
        }

        public Settings() {
            this(new android.media.audiofx.BassBoost.Settings());
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.BassBoost.Settings(arg0));
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
}
