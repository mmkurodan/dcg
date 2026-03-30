// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class CaptioningManager {
    private final android.view.accessibility.CaptioningManager real;

    public CaptioningManager(android.view.accessibility.CaptioningManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager wrap(android.view.accessibility.CaptioningManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager(real);
    }

    public android.view.accessibility.CaptioningManager unwrap() {
        return real;
    }

    public void addCaptioningChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener arg0) {
        real.addCaptioningChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public float getFontScale() {
        return real.getFontScale();
    }

    public java.util.Locale getLocale() {
        return real.getLocale();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle getUserStyle() {
        return com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle.wrap(real.getUserStyle());
    }

    public boolean isCallCaptioningEnabled() {
        return real.isCallCaptioningEnabled();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isSystemAudioCaptioningEnabled() {
        return real.isSystemAudioCaptioningEnabled();
    }

    public boolean isSystemAudioCaptioningUiEnabled() {
        return real.isSystemAudioCaptioningUiEnabled();
    }

    public void removeCaptioningChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener arg0) {
        real.removeCaptioningChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class CaptionStyle {
        private final android.view.accessibility.CaptioningManager.CaptionStyle real;

        public CaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle wrap(android.view.accessibility.CaptioningManager.CaptionStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle(real);
        }

        public android.view.accessibility.CaptioningManager.CaptionStyle unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(real.getTypeface());
        }

        public boolean hasBackgroundColor() {
            return real.hasBackgroundColor();
        }

        public boolean hasEdgeColor() {
            return real.hasEdgeColor();
        }

        public boolean hasEdgeType() {
            return real.hasEdgeType();
        }

        public boolean hasForegroundColor() {
            return real.hasForegroundColor();
        }

        public boolean hasWindowColor() {
            return real.hasWindowColor();
        }

        public static final int EDGE_TYPE_DEPRESSED = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_DEPRESSED;
        public static final int EDGE_TYPE_DROP_SHADOW = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_DROP_SHADOW;
        public static final int EDGE_TYPE_NONE = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_NONE;
        public static final int EDGE_TYPE_OUTLINE = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_OUTLINE;
        public static final int EDGE_TYPE_RAISED = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_RAISED;
        public static final int EDGE_TYPE_UNSPECIFIED = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_UNSPECIFIED;

    }
    public static final class CaptioningChangeListener {
        private final android.view.accessibility.CaptioningManager.CaptioningChangeListener real;

        public CaptioningChangeListener(android.view.accessibility.CaptioningManager.CaptioningChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener wrap(android.view.accessibility.CaptioningManager.CaptioningChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener(real);
        }

        public android.view.accessibility.CaptioningManager.CaptioningChangeListener unwrap() {
            return real;
        }

        public void onEnabledChanged(boolean arg0) {
            real.onEnabledChanged(arg0);
        }

        public void onFontScaleChanged(float arg0) {
            real.onFontScaleChanged(arg0);
        }

        public void onLocaleChanged(java.util.Locale arg0) {
            real.onLocaleChanged(arg0);
        }

        public void onSystemAudioCaptioningChanged(boolean arg0) {
            real.onSystemAudioCaptioningChanged(arg0);
        }

        public void onSystemAudioCaptioningUiChanged(boolean arg0) {
            real.onSystemAudioCaptioningUiChanged(arg0);
        }

        public void onUserStyleChanged(com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle arg0) {
            real.onUserStyleChanged(arg0 == null ? null : arg0.unwrap());
        }

    }
}
