// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class CaptioningManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CaptioningManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager wrap(android.view.accessibility.CaptioningManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.accessibility.CaptioningManager getReal() {
        return (android.view.accessibility.CaptioningManager) real;
    }

    public android.view.accessibility.CaptioningManager unwrap() {
        return getReal();
    }

    public void addCaptioningChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener arg0) {
        ((android.view.accessibility.CaptioningManager) real).addCaptioningChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public float getFontScale() {
        return ((android.view.accessibility.CaptioningManager) real).getFontScale();
    }

    public java.util.Locale getLocale() {
        return ((android.view.accessibility.CaptioningManager) real).getLocale();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle getUserStyle() {
        return com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle.wrap(((android.view.accessibility.CaptioningManager) real).getUserStyle());
    }

    public boolean isCallCaptioningEnabled() {
        return ((android.view.accessibility.CaptioningManager) real).isCallCaptioningEnabled();
    }

    public boolean isEnabled() {
        return ((android.view.accessibility.CaptioningManager) real).isEnabled();
    }

    public boolean isSystemAudioCaptioningEnabled() {
        return ((android.view.accessibility.CaptioningManager) real).isSystemAudioCaptioningEnabled();
    }

    public boolean isSystemAudioCaptioningUiEnabled() {
        return ((android.view.accessibility.CaptioningManager) real).isSystemAudioCaptioningUiEnabled();
    }

    public void removeCaptioningChangeListener(com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener arg0) {
        ((android.view.accessibility.CaptioningManager) real).removeCaptioningChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class CaptionStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CaptionStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle wrap(android.view.accessibility.CaptioningManager.CaptionStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.CaptioningManager.CaptionStyle getReal() {
            return (android.view.accessibility.CaptioningManager.CaptionStyle) real;
        }

        public android.view.accessibility.CaptioningManager.CaptionStyle unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.Typeface getTypeface() {
            return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.view.accessibility.CaptioningManager.CaptionStyle) real).getTypeface());
        }

        public boolean hasBackgroundColor() {
            return ((android.view.accessibility.CaptioningManager.CaptionStyle) real).hasBackgroundColor();
        }

        public boolean hasEdgeColor() {
            return ((android.view.accessibility.CaptioningManager.CaptionStyle) real).hasEdgeColor();
        }

        public boolean hasEdgeType() {
            return ((android.view.accessibility.CaptioningManager.CaptionStyle) real).hasEdgeType();
        }

        public boolean hasForegroundColor() {
            return ((android.view.accessibility.CaptioningManager.CaptionStyle) real).hasForegroundColor();
        }

        public boolean hasWindowColor() {
            return ((android.view.accessibility.CaptioningManager.CaptionStyle) real).hasWindowColor();
        }

        public static final int EDGE_TYPE_DEPRESSED = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_DEPRESSED;
        public static final int EDGE_TYPE_DROP_SHADOW = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_DROP_SHADOW;
        public static final int EDGE_TYPE_NONE = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_NONE;
        public static final int EDGE_TYPE_OUTLINE = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_OUTLINE;
        public static final int EDGE_TYPE_RAISED = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_RAISED;
        public static final int EDGE_TYPE_UNSPECIFIED = android.view.accessibility.CaptioningManager.CaptionStyle.EDGE_TYPE_UNSPECIFIED;

    }
    public static final class CaptioningChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CaptioningChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener wrap(android.view.accessibility.CaptioningManager.CaptioningChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptioningChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.accessibility.CaptioningManager.CaptioningChangeListener getReal() {
            return (android.view.accessibility.CaptioningManager.CaptioningChangeListener) real;
        }

        public android.view.accessibility.CaptioningManager.CaptioningChangeListener unwrap() {
            return getReal();
        }

        public void onEnabledChanged(boolean arg0) {
            ((android.view.accessibility.CaptioningManager.CaptioningChangeListener) real).onEnabledChanged(arg0);
        }

        public void onFontScaleChanged(float arg0) {
            ((android.view.accessibility.CaptioningManager.CaptioningChangeListener) real).onFontScaleChanged(arg0);
        }

        public void onLocaleChanged(java.util.Locale arg0) {
            ((android.view.accessibility.CaptioningManager.CaptioningChangeListener) real).onLocaleChanged(arg0);
        }

        public void onSystemAudioCaptioningChanged(boolean arg0) {
            ((android.view.accessibility.CaptioningManager.CaptioningChangeListener) real).onSystemAudioCaptioningChanged(arg0);
        }

        public void onSystemAudioCaptioningUiChanged(boolean arg0) {
            ((android.view.accessibility.CaptioningManager.CaptioningChangeListener) real).onSystemAudioCaptioningUiChanged(arg0);
        }

        public void onUserStyleChanged(com.micklab.dcg.wrapper.android.view.accessibility.CaptioningManager.CaptionStyle arg0) {
            ((android.view.accessibility.CaptioningManager.CaptioningChangeListener) real).onUserStyleChanged(arg0 == null ? null : arg0.getReal());
        }

    }
}
