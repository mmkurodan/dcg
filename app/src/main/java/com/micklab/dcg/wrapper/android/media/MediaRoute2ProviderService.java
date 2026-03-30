// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRoute2ProviderService {
    private final android.media.MediaRoute2ProviderService real;

    public MediaRoute2ProviderService(android.media.MediaRoute2ProviderService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRoute2ProviderService wrap(android.media.MediaRoute2ProviderService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRoute2ProviderService(real);
    }

    public android.media.MediaRoute2ProviderService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo getSessionInfo(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.wrap(real.getSessionInfo(arg0));
    }

    public void notifyRequestFailed(long arg0, int arg1) {
        real.notifyRequestFailed(arg0, arg1);
    }

    public void notifySessionCreated(long arg0, com.micklab.dcg.wrapper.android.media.RoutingSessionInfo arg1) {
        real.notifySessionCreated(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void notifySessionReleased(java.lang.String arg0) {
        real.notifySessionReleased(arg0);
    }

    public void notifySessionUpdated(com.micklab.dcg.wrapper.android.media.RoutingSessionInfo arg0) {
        real.notifySessionUpdated(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCreateSession(long arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        real.onCreateSession(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void onDeselectRoute(long arg0, java.lang.String arg1, java.lang.String arg2) {
        real.onDeselectRoute(arg0, arg1, arg2);
    }

    public void onDiscoveryPreferenceChanged(com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference arg0) {
        real.onDiscoveryPreferenceChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onReleaseSession(long arg0, java.lang.String arg1) {
        real.onReleaseSession(arg0, arg1);
    }

    public void onSelectRoute(long arg0, java.lang.String arg1, java.lang.String arg2) {
        real.onSelectRoute(arg0, arg1, arg2);
    }

    public void onSetRouteVolume(long arg0, java.lang.String arg1, int arg2) {
        real.onSetRouteVolume(arg0, arg1, arg2);
    }

    public void onSetSessionVolume(long arg0, java.lang.String arg1, int arg2) {
        real.onSetSessionVolume(arg0, arg1, arg2);
    }

    public void onTransferToRoute(long arg0, java.lang.String arg1, java.lang.String arg2) {
        real.onTransferToRoute(arg0, arg1, arg2);
    }

    public static final int REASON_INVALID_COMMAND = android.media.MediaRoute2ProviderService.REASON_INVALID_COMMAND;
    public static final int REASON_REJECTED = android.media.MediaRoute2ProviderService.REASON_REJECTED;
    public static final int REASON_ROUTE_NOT_AVAILABLE = android.media.MediaRoute2ProviderService.REASON_ROUTE_NOT_AVAILABLE;
    public static final int REASON_UNKNOWN_ERROR = android.media.MediaRoute2ProviderService.REASON_UNKNOWN_ERROR;
    public static final long REQUEST_ID_NONE = android.media.MediaRoute2ProviderService.REQUEST_ID_NONE;
    public static final java.lang.String SERVICE_INTERFACE = android.media.MediaRoute2ProviderService.SERVICE_INTERFACE;

}
