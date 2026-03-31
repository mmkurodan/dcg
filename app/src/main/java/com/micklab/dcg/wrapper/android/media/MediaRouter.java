// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRouter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaRouter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter wrap(android.media.MediaRouter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaRouter getReal() {
        return (android.media.MediaRouter) real;
    }

    public android.media.MediaRouter unwrap() {
        return getReal();
    }

    public void addCallback(int arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.Callback arg1) {
        ((android.media.MediaRouter) real).addCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void addCallback(int arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.Callback arg1, int arg2) {
        ((android.media.MediaRouter) real).addCallback(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void addUserRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo arg0) {
        ((android.media.MediaRouter) real).addUserRoute(arg0 == null ? null : arg0.getReal());
    }

    public void clearUserRoutes() {
        ((android.media.MediaRouter) real).clearUserRoutes();
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory createRouteCategory(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(((android.media.MediaRouter) real).createRouteCategory(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory createRouteCategory(java.lang.CharSequence arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(((android.media.MediaRouter) real).createRouteCategory(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo createUserRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo.wrap(((android.media.MediaRouter) real).createUserRoute(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory getCategoryAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(((android.media.MediaRouter) real).getCategoryAt(arg0));
    }

    public int getCategoryCount() {
        return ((android.media.MediaRouter) real).getCategoryCount();
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getDefaultRoute() {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(((android.media.MediaRouter) real).getDefaultRoute());
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getRouteAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(((android.media.MediaRouter) real).getRouteAt(arg0));
    }

    public int getRouteCount() {
        return ((android.media.MediaRouter) real).getRouteCount();
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getSelectedRoute(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(((android.media.MediaRouter) real).getSelectedRoute(arg0));
    }

    public void removeCallback(com.micklab.dcg.wrapper.android.media.MediaRouter.Callback arg0) {
        ((android.media.MediaRouter) real).removeCallback(arg0 == null ? null : arg0.getReal());
    }

    public void removeUserRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo arg0) {
        ((android.media.MediaRouter) real).removeUserRoute(arg0 == null ? null : arg0.getReal());
    }

    public void selectRoute(int arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
        ((android.media.MediaRouter) real).selectRoute(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = android.media.MediaRouter.CALLBACK_FLAG_PERFORM_ACTIVE_SCAN;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = android.media.MediaRouter.CALLBACK_FLAG_UNFILTERED_EVENTS;
    public static final int ROUTE_TYPE_LIVE_AUDIO = android.media.MediaRouter.ROUTE_TYPE_LIVE_AUDIO;
    public static final int ROUTE_TYPE_LIVE_VIDEO = android.media.MediaRouter.ROUTE_TYPE_LIVE_VIDEO;
    public static final int ROUTE_TYPE_USER = android.media.MediaRouter.ROUTE_TYPE_USER;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.Callback wrap(android.media.MediaRouter.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter.Callback getReal() {
            return (android.media.MediaRouter.Callback) real;
        }

        public android.media.MediaRouter.Callback unwrap() {
            return getReal();
        }

        public void onRouteAdded(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.Callback) real).onRouteAdded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRouteChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.Callback) real).onRouteChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRouteGrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2, int arg3) {
            ((android.media.MediaRouter.Callback) real).onRouteGrouped(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
        }

        public void onRoutePresentationDisplayChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.Callback) real).onRoutePresentationDisplayChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRouteRemoved(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.Callback) real).onRouteRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRouteSelected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            ((android.media.MediaRouter.Callback) real).onRouteSelected(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onRouteUngrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2) {
            ((android.media.MediaRouter.Callback) real).onRouteUngrouped(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onRouteUnselected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            ((android.media.MediaRouter.Callback) real).onRouteUnselected(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onRouteVolumeChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.Callback) real).onRouteVolumeChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class RouteCategory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RouteCategory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory wrap(android.media.MediaRouter.RouteCategory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter.RouteCategory getReal() {
            return (android.media.MediaRouter.RouteCategory) real;
        }

        public android.media.MediaRouter.RouteCategory unwrap() {
            return getReal();
        }

        public java.lang.CharSequence getName() {
            return ((android.media.MediaRouter.RouteCategory) real).getName();
        }

        public java.lang.CharSequence getName(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return ((android.media.MediaRouter.RouteCategory) real).getName(arg0 == null ? null : arg0.getReal());
        }

        public int getSupportedTypes() {
            return ((android.media.MediaRouter.RouteCategory) real).getSupportedTypes();
        }

        public boolean isGroupable() {
            return ((android.media.MediaRouter.RouteCategory) real).isGroupable();
        }

        public java.lang.String toString() {
            return ((android.media.MediaRouter.RouteCategory) real).toString();
        }

    }
    public static final class RouteGroup {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RouteGroup(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup wrap(android.media.MediaRouter.RouteGroup real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter.RouteGroup getReal() {
            return (android.media.MediaRouter.RouteGroup) real;
        }

        public android.media.MediaRouter.RouteGroup unwrap() {
            return getReal();
        }

        public void addRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0) {
            ((android.media.MediaRouter.RouteGroup) real).addRoute(arg0 == null ? null : arg0.getReal());
        }

        public void addRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0, int arg1) {
            ((android.media.MediaRouter.RouteGroup) real).addRoute(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getRouteAt(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(((android.media.MediaRouter.RouteGroup) real).getRouteAt(arg0));
        }

        public int getRouteCount() {
            return ((android.media.MediaRouter.RouteGroup) real).getRouteCount();
        }

        public void removeRoute(int arg0) {
            ((android.media.MediaRouter.RouteGroup) real).removeRoute(arg0);
        }

        public void removeRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0) {
            ((android.media.MediaRouter.RouteGroup) real).removeRoute(arg0 == null ? null : arg0.getReal());
        }

        public void requestSetVolume(int arg0) {
            ((android.media.MediaRouter.RouteGroup) real).requestSetVolume(arg0);
        }

        public void requestUpdateVolume(int arg0) {
            ((android.media.MediaRouter.RouteGroup) real).requestUpdateVolume(arg0);
        }

        public void setIconDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            ((android.media.MediaRouter.RouteGroup) real).setIconDrawable(arg0 == null ? null : arg0.getReal());
        }

        public void setIconResource(int arg0) {
            ((android.media.MediaRouter.RouteGroup) real).setIconResource(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.MediaRouter.RouteGroup) real).toString();
        }

    }
    public static final class RouteInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RouteInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo wrap(android.media.MediaRouter.RouteInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter.RouteInfo getReal() {
            return (android.media.MediaRouter.RouteInfo) real;
        }

        public android.media.MediaRouter.RouteInfo unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory getCategory() {
            return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(((android.media.MediaRouter.RouteInfo) real).getCategory());
        }

        public java.lang.CharSequence getDescription() {
            return ((android.media.MediaRouter.RouteInfo) real).getDescription();
        }

        public int getDeviceType() {
            return ((android.media.MediaRouter.RouteInfo) real).getDeviceType();
        }

        public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup getGroup() {
            return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup.wrap(((android.media.MediaRouter.RouteInfo) real).getGroup());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIconDrawable() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.media.MediaRouter.RouteInfo) real).getIconDrawable());
        }

        public java.lang.CharSequence getName() {
            return ((android.media.MediaRouter.RouteInfo) real).getName();
        }

        public java.lang.CharSequence getName(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return ((android.media.MediaRouter.RouteInfo) real).getName(arg0 == null ? null : arg0.getReal());
        }

        public int getPlaybackStream() {
            return ((android.media.MediaRouter.RouteInfo) real).getPlaybackStream();
        }

        public int getPlaybackType() {
            return ((android.media.MediaRouter.RouteInfo) real).getPlaybackType();
        }

        public com.micklab.dcg.wrapper.android.view.Display getPresentationDisplay() {
            return com.micklab.dcg.wrapper.android.view.Display.wrap(((android.media.MediaRouter.RouteInfo) real).getPresentationDisplay());
        }

        public java.lang.CharSequence getStatus() {
            return ((android.media.MediaRouter.RouteInfo) real).getStatus();
        }

        public int getSupportedTypes() {
            return ((android.media.MediaRouter.RouteInfo) real).getSupportedTypes();
        }

        public java.lang.Object getTag() {
            return ((android.media.MediaRouter.RouteInfo) real).getTag();
        }

        public int getVolume() {
            return ((android.media.MediaRouter.RouteInfo) real).getVolume();
        }

        public int getVolumeHandling() {
            return ((android.media.MediaRouter.RouteInfo) real).getVolumeHandling();
        }

        public int getVolumeMax() {
            return ((android.media.MediaRouter.RouteInfo) real).getVolumeMax();
        }

        public boolean isConnecting() {
            return ((android.media.MediaRouter.RouteInfo) real).isConnecting();
        }

        public boolean isEnabled() {
            return ((android.media.MediaRouter.RouteInfo) real).isEnabled();
        }

        public void requestSetVolume(int arg0) {
            ((android.media.MediaRouter.RouteInfo) real).requestSetVolume(arg0);
        }

        public void requestUpdateVolume(int arg0) {
            ((android.media.MediaRouter.RouteInfo) real).requestUpdateVolume(arg0);
        }

        public void setTag(java.lang.Object arg0) {
            ((android.media.MediaRouter.RouteInfo) real).setTag(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.MediaRouter.RouteInfo) real).toString();
        }

        public static final int DEVICE_TYPE_BLUETOOTH = android.media.MediaRouter.RouteInfo.DEVICE_TYPE_BLUETOOTH;
        public static final int DEVICE_TYPE_SPEAKER = android.media.MediaRouter.RouteInfo.DEVICE_TYPE_SPEAKER;
        public static final int DEVICE_TYPE_TV = android.media.MediaRouter.RouteInfo.DEVICE_TYPE_TV;
        public static final int DEVICE_TYPE_UNKNOWN = android.media.MediaRouter.RouteInfo.DEVICE_TYPE_UNKNOWN;
        public static final int PLAYBACK_TYPE_LOCAL = android.media.MediaRouter.RouteInfo.PLAYBACK_TYPE_LOCAL;
        public static final int PLAYBACK_TYPE_REMOTE = android.media.MediaRouter.RouteInfo.PLAYBACK_TYPE_REMOTE;
        public static final int PLAYBACK_VOLUME_FIXED = android.media.MediaRouter.RouteInfo.PLAYBACK_VOLUME_FIXED;
        public static final int PLAYBACK_VOLUME_VARIABLE = android.media.MediaRouter.RouteInfo.PLAYBACK_VOLUME_VARIABLE;

    }
    public static final class SimpleCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SimpleCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.SimpleCallback wrap(android.media.MediaRouter.SimpleCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.SimpleCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter.SimpleCallback getReal() {
            return (android.media.MediaRouter.SimpleCallback) real;
        }

        public android.media.MediaRouter.SimpleCallback unwrap() {
            return getReal();
        }

        public SimpleCallback() {
            this(new android.media.MediaRouter.SimpleCallback(), (__DcgwBridgeToken) null);
        }

        public void onRouteAdded(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteAdded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRouteChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRouteGrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2, int arg3) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteGrouped(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
        }

        public void onRouteRemoved(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRouteSelected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteSelected(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onRouteUngrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteUngrouped(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onRouteUnselected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteUnselected(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onRouteVolumeChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            ((android.media.MediaRouter.SimpleCallback) real).onRouteVolumeChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class UserRouteInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UserRouteInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo wrap(android.media.MediaRouter.UserRouteInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter.UserRouteInfo getReal() {
            return (android.media.MediaRouter.UserRouteInfo) real;
        }

        public android.media.MediaRouter.UserRouteInfo unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.media.RemoteControlClient getRemoteControlClient() {
            return com.micklab.dcg.wrapper.android.media.RemoteControlClient.wrap(((android.media.MediaRouter.UserRouteInfo) real).getRemoteControlClient());
        }

        public void requestSetVolume(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).requestSetVolume(arg0);
        }

        public void requestUpdateVolume(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).requestUpdateVolume(arg0);
        }

        public void setDescription(java.lang.CharSequence arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setDescription(arg0);
        }

        public void setIconDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setIconDrawable(arg0 == null ? null : arg0.getReal());
        }

        public void setIconResource(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setIconResource(arg0);
        }

        public void setName(java.lang.CharSequence arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setName(arg0);
        }

        public void setName(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setName(arg0);
        }

        public void setPlaybackStream(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setPlaybackStream(arg0);
        }

        public void setPlaybackType(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setPlaybackType(arg0);
        }

        public void setRemoteControlClient(com.micklab.dcg.wrapper.android.media.RemoteControlClient arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setRemoteControlClient(arg0 == null ? null : arg0.getReal());
        }

        public void setStatus(java.lang.CharSequence arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setStatus(arg0);
        }

        public void setVolume(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setVolume(arg0);
        }

        public void setVolumeCallback(com.micklab.dcg.wrapper.android.media.MediaRouter.VolumeCallback arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setVolumeCallback(arg0 == null ? null : arg0.getReal());
        }

        public void setVolumeHandling(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setVolumeHandling(arg0);
        }

        public void setVolumeMax(int arg0) {
            ((android.media.MediaRouter.UserRouteInfo) real).setVolumeMax(arg0);
        }

    }
    public static final class VolumeCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VolumeCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.VolumeCallback wrap(android.media.MediaRouter.VolumeCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.VolumeCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter.VolumeCallback getReal() {
            return (android.media.MediaRouter.VolumeCallback) real;
        }

        public android.media.MediaRouter.VolumeCallback unwrap() {
            return getReal();
        }

        public void onVolumeSetRequest(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0, int arg1) {
            ((android.media.MediaRouter.VolumeCallback) real).onVolumeSetRequest(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onVolumeUpdateRequest(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0, int arg1) {
            ((android.media.MediaRouter.VolumeCallback) real).onVolumeUpdateRequest(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
