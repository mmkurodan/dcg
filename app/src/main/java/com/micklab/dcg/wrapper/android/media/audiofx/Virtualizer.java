// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class Virtualizer {
    private final android.media.audiofx.Virtualizer real;

    public Virtualizer(android.media.audiofx.Virtualizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer wrap(android.media.audiofx.Virtualizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer(real);
    }

    public android.media.audiofx.Virtualizer unwrap() {
        return real;
    }

    public Virtualizer(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.Virtualizer(arg0, arg1));
    }

    public boolean canVirtualize(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.canVirtualize(arg0, arg1);
    }

    public boolean forceVirtualizationMode(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.forceVirtualizationMode(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings.wrap(real.getProperties());
    }

    public short getRoundedStrength() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getRoundedStrength();
    }

    public boolean getSpeakerAngles(int arg0, int arg1, int[] arg2) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getSpeakerAngles(arg0, arg1, arg2);
    }

    public boolean getStrengthSupported() {
        return real.getStrengthSupported();
    }

    public int getVirtualizationMode() throws java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getVirtualizationMode();
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.OnParameterChangeListener arg0) {
        real.setParameterListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setProperties(arg0 == null ? null : arg0.unwrap());
    }

    public void setStrength(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setStrength(arg0);
    }

    public static final int PARAM_STRENGTH = android.media.audiofx.Virtualizer.PARAM_STRENGTH;
    public static final int PARAM_STRENGTH_SUPPORTED = android.media.audiofx.Virtualizer.PARAM_STRENGTH_SUPPORTED;
    public static final int VIRTUALIZATION_MODE_AUTO = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_AUTO;
    public static final int VIRTUALIZATION_MODE_BINAURAL = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_BINAURAL;
    public static final int VIRTUALIZATION_MODE_OFF = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_OFF;
    public static final int VIRTUALIZATION_MODE_TRANSAURAL = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_TRANSAURAL;

    public static final class OnParameterChangeListener {
        private final android.media.audiofx.Virtualizer.OnParameterChangeListener real;

        public OnParameterChangeListener(android.media.audiofx.Virtualizer.OnParameterChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.OnParameterChangeListener wrap(android.media.audiofx.Virtualizer.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.OnParameterChangeListener(real);
        }

        public android.media.audiofx.Virtualizer.OnParameterChangeListener unwrap() {
            return real;
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer arg0, int arg1, int arg2, short arg3) {
            real.onParameterChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private final android.media.audiofx.Virtualizer.Settings real;

        public Settings(android.media.audiofx.Virtualizer.Settings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings wrap(android.media.audiofx.Virtualizer.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings(real);
        }

        public android.media.audiofx.Virtualizer.Settings unwrap() {
            return real;
        }

        public Settings() {
            this(new android.media.audiofx.Virtualizer.Settings());
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.Virtualizer.Settings(arg0));
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
}
