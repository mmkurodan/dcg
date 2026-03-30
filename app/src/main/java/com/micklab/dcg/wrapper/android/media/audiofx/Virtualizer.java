// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class Virtualizer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Virtualizer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer wrap(android.media.audiofx.Virtualizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.Virtualizer getReal() {
        return (android.media.audiofx.Virtualizer) real;
    }

    public android.media.audiofx.Virtualizer unwrap() {
        return getReal();
    }

    public Virtualizer(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.Virtualizer(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean canVirtualize(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.Virtualizer) real).canVirtualize(arg0, arg1);
    }

    public boolean forceVirtualizationMode(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.Virtualizer) real).forceVirtualizationMode(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings.wrap(((android.media.audiofx.Virtualizer) real).getProperties());
    }

    public short getRoundedStrength() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.Virtualizer) real).getRoundedStrength();
    }

    public boolean getSpeakerAngles(int arg0, int arg1, int[] arg2) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.Virtualizer) real).getSpeakerAngles(arg0, arg1, arg2);
    }

    public boolean getStrengthSupported() {
        return ((android.media.audiofx.Virtualizer) real).getStrengthSupported();
    }

    public int getVirtualizationMode() throws java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.Virtualizer) real).getVirtualizationMode();
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.OnParameterChangeListener arg0) {
        ((android.media.audiofx.Virtualizer) real).setParameterListener(arg0 == null ? null : arg0.getReal());
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.Virtualizer) real).setProperties(arg0 == null ? null : arg0.getReal());
    }

    public void setStrength(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.Virtualizer) real).setStrength(arg0);
    }

    public static final int PARAM_STRENGTH = android.media.audiofx.Virtualizer.PARAM_STRENGTH;
    public static final int PARAM_STRENGTH_SUPPORTED = android.media.audiofx.Virtualizer.PARAM_STRENGTH_SUPPORTED;
    public static final int VIRTUALIZATION_MODE_AUTO = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_AUTO;
    public static final int VIRTUALIZATION_MODE_BINAURAL = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_BINAURAL;
    public static final int VIRTUALIZATION_MODE_OFF = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_OFF;
    public static final int VIRTUALIZATION_MODE_TRANSAURAL = android.media.audiofx.Virtualizer.VIRTUALIZATION_MODE_TRANSAURAL;

    public static final class OnParameterChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnParameterChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.OnParameterChangeListener wrap(android.media.audiofx.Virtualizer.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.OnParameterChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.Virtualizer.OnParameterChangeListener getReal() {
            return (android.media.audiofx.Virtualizer.OnParameterChangeListener) real;
        }

        public android.media.audiofx.Virtualizer.OnParameterChangeListener unwrap() {
            return getReal();
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer arg0, int arg1, int arg2, short arg3) {
            ((android.media.audiofx.Virtualizer.OnParameterChangeListener) real).onParameterChange(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Settings(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings wrap(android.media.audiofx.Virtualizer.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Virtualizer.Settings(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.Virtualizer.Settings getReal() {
            return (android.media.audiofx.Virtualizer.Settings) real;
        }

        public android.media.audiofx.Virtualizer.Settings unwrap() {
            return getReal();
        }

        public Settings() {
            this(new android.media.audiofx.Virtualizer.Settings(), (__DcgwBridgeToken) null);
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.Virtualizer.Settings(arg0), (__DcgwBridgeToken) null);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.Virtualizer.Settings) real).toString();
        }


    }
}
