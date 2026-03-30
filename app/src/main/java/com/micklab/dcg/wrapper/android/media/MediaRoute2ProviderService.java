// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRoute2ProviderService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaRoute2ProviderService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRoute2ProviderService wrap(android.media.MediaRoute2ProviderService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRoute2ProviderService(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaRoute2ProviderService getReal() {
        return (android.media.MediaRoute2ProviderService) real;
    }

    public android.media.MediaRoute2ProviderService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo getSessionInfo(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.wrap(((android.media.MediaRoute2ProviderService) real).getSessionInfo(arg0));
    }

    public void notifyRequestFailed(long arg0, int arg1) {
        ((android.media.MediaRoute2ProviderService) real).notifyRequestFailed(arg0, arg1);
    }

    public void notifySessionCreated(long arg0, com.micklab.dcg.wrapper.android.media.RoutingSessionInfo arg1) {
        ((android.media.MediaRoute2ProviderService) real).notifySessionCreated(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void notifySessionReleased(java.lang.String arg0) {
        ((android.media.MediaRoute2ProviderService) real).notifySessionReleased(arg0);
    }

    public void notifySessionUpdated(com.micklab.dcg.wrapper.android.media.RoutingSessionInfo arg0) {
        ((android.media.MediaRoute2ProviderService) real).notifySessionUpdated(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.media.MediaRoute2ProviderService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreateSession(long arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        ((android.media.MediaRoute2ProviderService) real).onCreateSession(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onDeselectRoute(long arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.media.MediaRoute2ProviderService) real).onDeselectRoute(arg0, arg1, arg2);
    }

    public void onDiscoveryPreferenceChanged(com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference arg0) {
        ((android.media.MediaRoute2ProviderService) real).onDiscoveryPreferenceChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onReleaseSession(long arg0, java.lang.String arg1) {
        ((android.media.MediaRoute2ProviderService) real).onReleaseSession(arg0, arg1);
    }

    public void onSelectRoute(long arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.media.MediaRoute2ProviderService) real).onSelectRoute(arg0, arg1, arg2);
    }

    public void onSetRouteVolume(long arg0, java.lang.String arg1, int arg2) {
        ((android.media.MediaRoute2ProviderService) real).onSetRouteVolume(arg0, arg1, arg2);
    }

    public void onSetSessionVolume(long arg0, java.lang.String arg1, int arg2) {
        ((android.media.MediaRoute2ProviderService) real).onSetSessionVolume(arg0, arg1, arg2);
    }

    public void onTransferToRoute(long arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.media.MediaRoute2ProviderService) real).onTransferToRoute(arg0, arg1, arg2);
    }

    public static final int REASON_INVALID_COMMAND = android.media.MediaRoute2ProviderService.REASON_INVALID_COMMAND;
    public static final int REASON_REJECTED = android.media.MediaRoute2ProviderService.REASON_REJECTED;
    public static final int REASON_ROUTE_NOT_AVAILABLE = android.media.MediaRoute2ProviderService.REASON_ROUTE_NOT_AVAILABLE;
    public static final int REASON_UNKNOWN_ERROR = android.media.MediaRoute2ProviderService.REASON_UNKNOWN_ERROR;
    public static final long REQUEST_ID_NONE = android.media.MediaRoute2ProviderService.REQUEST_ID_NONE;
    public static final java.lang.String SERVICE_INTERFACE = android.media.MediaRoute2ProviderService.SERVICE_INTERFACE;

}
