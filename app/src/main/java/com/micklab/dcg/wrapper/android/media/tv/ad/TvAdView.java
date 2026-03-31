// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.ad;

public final class TvAdView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvAdView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView wrap(android.media.tv.ad.TvAdView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.ad.TvAdView getReal() {
        return (android.media.tv.ad.TvAdView) real;
    }

    public android.media.tv.ad.TvAdView unwrap() {
        return getReal();
    }

    public TvAdView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.tv.ad.TvAdView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TvAdView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.media.tv.ad.TvAdView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TvAdView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.media.tv.ad.TvAdView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public void clearCallback() {
        ((android.media.tv.ad.TvAdView) real).clearCallback();
    }

    public void clearOnUnhandledInputEventListener() {
        ((android.media.tv.ad.TvAdView) real).clearOnUnhandledInputEventListener();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.media.tv.ad.TvAdView) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return ((android.media.tv.ad.TvAdView) real).dispatchUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.OnUnhandledInputEventListener getOnUnhandledInputEventListener() {
        return com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.OnUnhandledInputEventListener.wrap(((android.media.tv.ad.TvAdView) real).getOnUnhandledInputEventListener());
    }

    public void notifyError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.ad.TvAdView) real).notifyError(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void notifyTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.ad.TvAdView) real).notifyTvMessage(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onAttachedToWindow() {
        ((android.media.tv.ad.TvAdView) real).onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        ((android.media.tv.ad.TvAdView) real).onDetachedFromWindow();
    }

    public void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.media.tv.ad.TvAdView) real).onLayout(arg0, arg1, arg2, arg3, arg4);
    }

    public void onMeasure(int arg0, int arg1) {
        ((android.media.tv.ad.TvAdView) real).onMeasure(arg0, arg1);
    }

    public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return ((android.media.tv.ad.TvAdView) real).onUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onVisibilityChanged(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.media.tv.ad.TvAdView) real).onVisibilityChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void prepareAdService(java.lang.String arg0, java.lang.String arg1) {
        ((android.media.tv.ad.TvAdView) real).prepareAdService(arg0, arg1);
    }

    public void reset() {
        ((android.media.tv.ad.TvAdView) real).reset();
    }

    public void resetAdService() {
        ((android.media.tv.ad.TvAdView) real).resetAdService();
    }

    public void sendCurrentChannelUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.media.tv.ad.TvAdView) real).sendCurrentChannelUri(arg0 == null ? null : arg0.getReal());
    }

    public void sendCurrentTvInputId(java.lang.String arg0) {
        ((android.media.tv.ad.TvAdView) real).sendCurrentTvInputId(arg0);
    }

    public void sendCurrentVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.media.tv.ad.TvAdView) real).sendCurrentVideoBounds(arg0 == null ? null : arg0.getReal());
    }

    public void sendSigningResult(java.lang.String arg0, byte[] arg1) {
        ((android.media.tv.ad.TvAdView) real).sendSigningResult(arg0, arg1);
    }

    public void setCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.TvAdCallback arg1) {
        ((android.media.tv.ad.TvAdView) real).setCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnUnhandledInputEventListener(com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.OnUnhandledInputEventListener arg0) {
        ((android.media.tv.ad.TvAdView) real).setOnUnhandledInputEventListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean setTvView(com.micklab.dcg.wrapper.android.media.tv.TvView arg0) {
        return ((android.media.tv.ad.TvAdView) real).setTvView(arg0 == null ? null : arg0.getReal());
    }

    public void setZOrderMediaOverlay(boolean arg0) {
        ((android.media.tv.ad.TvAdView) real).setZOrderMediaOverlay(arg0);
    }

    public void setZOrderOnTop(boolean arg0) {
        ((android.media.tv.ad.TvAdView) real).setZOrderOnTop(arg0);
    }

    public void startAdService() {
        ((android.media.tv.ad.TvAdView) real).startAdService();
    }

    public void stopAdService() {
        ((android.media.tv.ad.TvAdView) real).stopAdService();
    }

    public static final java.lang.String ERROR_KEY_ERROR_CODE = android.media.tv.ad.TvAdView.ERROR_KEY_ERROR_CODE;
    public static final java.lang.String ERROR_KEY_METHOD_NAME = android.media.tv.ad.TvAdView.ERROR_KEY_METHOD_NAME;

    public static final class OnUnhandledInputEventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnUnhandledInputEventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.OnUnhandledInputEventListener wrap(android.media.tv.ad.TvAdView.OnUnhandledInputEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.OnUnhandledInputEventListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.ad.TvAdView.OnUnhandledInputEventListener getReal() {
            return (android.media.tv.ad.TvAdView.OnUnhandledInputEventListener) real;
        }

        public android.media.tv.ad.TvAdView.OnUnhandledInputEventListener unwrap() {
            return getReal();
        }

        public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return ((android.media.tv.ad.TvAdView.OnUnhandledInputEventListener) real).onUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class TvAdCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TvAdCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.TvAdCallback wrap(android.media.tv.ad.TvAdView.TvAdCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdView.TvAdCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.ad.TvAdView.TvAdCallback getReal() {
            return (android.media.tv.ad.TvAdView.TvAdCallback) real;
        }

        public android.media.tv.ad.TvAdView.TvAdCallback unwrap() {
            return getReal();
        }

        public void onRequestCurrentChannelUri(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdView.TvAdCallback) real).onRequestCurrentChannelUri(arg0);
        }

        public void onRequestCurrentTvInputId(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdView.TvAdCallback) real).onRequestCurrentTvInputId(arg0);
        }

        public void onRequestCurrentVideoBounds(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdView.TvAdCallback) real).onRequestCurrentVideoBounds(arg0);
        }

        public void onRequestSigning(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, byte[] arg4) {
            ((android.media.tv.ad.TvAdView.TvAdCallback) real).onRequestSigning(arg0, arg1, arg2, arg3, arg4);
        }

        public void onRequestTrackInfoList(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdView.TvAdCallback) real).onRequestTrackInfoList(arg0);
        }

        public void onStateChanged(java.lang.String arg0, int arg1, int arg2) {
            ((android.media.tv.ad.TvAdView.TvAdCallback) real).onStateChanged(arg0, arg1, arg2);
        }

    }
}
