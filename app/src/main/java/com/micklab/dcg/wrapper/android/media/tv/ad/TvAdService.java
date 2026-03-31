// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.ad;

public final class TvAdService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvAdService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdService wrap(android.media.tv.ad.TvAdService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdService(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.ad.TvAdService getReal() {
        return (android.media.tv.ad.TvAdService) real;
    }

    public android.media.tv.ad.TvAdService unwrap() {
        return getReal();
    }

    public void onAppLinkCommand(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.media.tv.ad.TvAdService) real).onAppLinkCommand(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.media.tv.ad.TvAdService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.media.tv.ad.TvAdService.Session onCreateSession(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.media.tv.ad.TvAdService.Session.wrap(((android.media.tv.ad.TvAdService) real).onCreateSession(arg0, arg1));
    }

    public static final java.lang.String SERVICE_INTERFACE = android.media.tv.ad.TvAdService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.media.tv.ad.TvAdService.SERVICE_META_DATA;

    public static final class Session {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Session(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdService.Session wrap(android.media.tv.ad.TvAdService.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdService.Session(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.ad.TvAdService.Session getReal() {
            return (android.media.tv.ad.TvAdService.Session) real;
        }

        public android.media.tv.ad.TvAdService.Session unwrap() {
            return getReal();
        }

        public boolean isMediaViewEnabled() {
            return ((android.media.tv.ad.TvAdService.Session) real).isMediaViewEnabled();
        }

        public void layoutSurface(int arg0, int arg1, int arg2, int arg3) {
            ((android.media.tv.ad.TvAdService.Session) real).layoutSurface(arg0, arg1, arg2, arg3);
        }

        public void notifySessionStateChanged(int arg0, int arg1) {
            ((android.media.tv.ad.TvAdService.Session) real).notifySessionStateChanged(arg0, arg1);
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateMediaView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.media.tv.ad.TvAdService.Session) real).onCreateMediaView());
        }

        public void onCurrentChannelUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.ad.TvAdService.Session) real).onCurrentChannelUri(arg0 == null ? null : arg0.getReal());
        }

        public void onCurrentTvInputId(java.lang.String arg0) {
            ((android.media.tv.ad.TvAdService.Session) real).onCurrentTvInputId(arg0);
        }

        public void onCurrentVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            ((android.media.tv.ad.TvAdService.Session) real).onCurrentVideoBounds(arg0 == null ? null : arg0.getReal());
        }

        public void onError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.ad.TvAdService.Session) real).onError(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.ad.TvAdService.Session) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.ad.TvAdService.Session) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.ad.TvAdService.Session) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return ((android.media.tv.ad.TvAdService.Session) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.ad.TvAdService.Session) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onMediaViewSizeChanged(int arg0, int arg1) {
            ((android.media.tv.ad.TvAdService.Session) real).onMediaViewSizeChanged(arg0, arg1);
        }

        public void onRelease() {
            ((android.media.tv.ad.TvAdService.Session) real).onRelease();
        }

        public void onResetAdService() {
            ((android.media.tv.ad.TvAdService.Session) real).onResetAdService();
        }

        public boolean onSetSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return ((android.media.tv.ad.TvAdService.Session) real).onSetSurface(arg0 == null ? null : arg0.getReal());
        }

        public void onSigningResult(java.lang.String arg0, byte[] arg1) {
            ((android.media.tv.ad.TvAdService.Session) real).onSigningResult(arg0, arg1);
        }

        public void onStartAdService() {
            ((android.media.tv.ad.TvAdService.Session) real).onStartAdService();
        }

        public void onStopAdService() {
            ((android.media.tv.ad.TvAdService.Session) real).onStopAdService();
        }

        public void onSurfaceChanged(int arg0, int arg1, int arg2) {
            ((android.media.tv.ad.TvAdService.Session) real).onSurfaceChanged(arg0, arg1, arg2);
        }

        public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.ad.TvAdService.Session) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.ad.TvAdService.Session) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
        }

        public void onTvInputSessionData(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.ad.TvAdService.Session) real).onTvInputSessionData(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.ad.TvAdService.Session) real).onTvMessage(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void requestCurrentChannelUri() {
            ((android.media.tv.ad.TvAdService.Session) real).requestCurrentChannelUri();
        }

        public void requestCurrentTvInputId() {
            ((android.media.tv.ad.TvAdService.Session) real).requestCurrentTvInputId();
        }

        public void requestCurrentVideoBounds() {
            ((android.media.tv.ad.TvAdService.Session) real).requestCurrentVideoBounds();
        }

        public void requestSigning(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte[] arg3) {
            ((android.media.tv.ad.TvAdService.Session) real).requestSigning(arg0, arg1, arg2, arg3);
        }

        public void requestTrackInfoList() {
            ((android.media.tv.ad.TvAdService.Session) real).requestTrackInfoList();
        }

        public void sendTvAdSessionData(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.ad.TvAdService.Session) real).sendTvAdSessionData(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setMediaViewEnabled(boolean arg0) {
            ((android.media.tv.ad.TvAdService.Session) real).setMediaViewEnabled(arg0);
        }

    }
}
