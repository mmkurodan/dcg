// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRouter {
    private final android.media.MediaRouter real;

    public MediaRouter(android.media.MediaRouter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter wrap(android.media.MediaRouter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter(real);
    }

    public android.media.MediaRouter unwrap() {
        return real;
    }

    public void addCallback(int arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.Callback arg1) {
        real.addCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addCallback(int arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.Callback arg1, int arg2) {
        real.addCallback(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void addUserRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo arg0) {
        real.addUserRoute(arg0 == null ? null : arg0.unwrap());
    }

    public void clearUserRoutes() {
        real.clearUserRoutes();
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory createRouteCategory(java.lang.CharSequence arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(real.createRouteCategory(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory createRouteCategory(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(real.createRouteCategory(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo createUserRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo.wrap(real.createUserRoute(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory getCategoryAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(real.getCategoryAt(arg0));
    }

    public int getCategoryCount() {
        return real.getCategoryCount();
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getDefaultRoute() {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(real.getDefaultRoute());
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getRouteAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(real.getRouteAt(arg0));
    }

    public int getRouteCount() {
        return real.getRouteCount();
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getSelectedRoute(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(real.getSelectedRoute(arg0));
    }

    public void removeCallback(com.micklab.dcg.wrapper.android.media.MediaRouter.Callback arg0) {
        real.removeCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void removeUserRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo arg0) {
        real.removeUserRoute(arg0 == null ? null : arg0.unwrap());
    }

    public void selectRoute(int arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
        real.selectRoute(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = android.media.MediaRouter.CALLBACK_FLAG_PERFORM_ACTIVE_SCAN;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = android.media.MediaRouter.CALLBACK_FLAG_UNFILTERED_EVENTS;
    public static final int ROUTE_TYPE_LIVE_AUDIO = android.media.MediaRouter.ROUTE_TYPE_LIVE_AUDIO;
    public static final int ROUTE_TYPE_LIVE_VIDEO = android.media.MediaRouter.ROUTE_TYPE_LIVE_VIDEO;
    public static final int ROUTE_TYPE_USER = android.media.MediaRouter.ROUTE_TYPE_USER;

    public static final class Callback {
        private final android.media.MediaRouter.Callback real;

        public Callback(android.media.MediaRouter.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.Callback wrap(android.media.MediaRouter.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.Callback(real);
        }

        public android.media.MediaRouter.Callback unwrap() {
            return real;
        }

        public void onRouteAdded(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteAdded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRouteChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRouteGrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2, int arg3) {
            real.onRouteGrouped(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
        }

        public void onRoutePresentationDisplayChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRoutePresentationDisplayChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRouteRemoved(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRouteSelected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            real.onRouteSelected(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onRouteUngrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2) {
            real.onRouteUngrouped(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onRouteUnselected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            real.onRouteUnselected(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onRouteVolumeChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteVolumeChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class RouteCategory {
        private final android.media.MediaRouter.RouteCategory real;

        public RouteCategory(android.media.MediaRouter.RouteCategory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory wrap(android.media.MediaRouter.RouteCategory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory(real);
        }

        public android.media.MediaRouter.RouteCategory unwrap() {
            return real;
        }

        public java.lang.CharSequence getName() {
            return real.getName();
        }

        public java.lang.CharSequence getName(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return real.getName(arg0 == null ? null : arg0.unwrap());
        }

        public int getSupportedTypes() {
            return real.getSupportedTypes();
        }

        public boolean isGroupable() {
            return real.isGroupable();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class RouteGroup {
        private final android.media.MediaRouter.RouteGroup real;

        public RouteGroup(android.media.MediaRouter.RouteGroup real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup wrap(android.media.MediaRouter.RouteGroup real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup(real);
        }

        public android.media.MediaRouter.RouteGroup unwrap() {
            return real;
        }

        public void addRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0) {
            real.addRoute(arg0 == null ? null : arg0.unwrap());
        }

        public void addRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0, int arg1) {
            real.addRoute(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo getRouteAt(int arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo.wrap(real.getRouteAt(arg0));
        }

        public int getRouteCount() {
            return real.getRouteCount();
        }

        public void removeRoute(int arg0) {
            real.removeRoute(arg0);
        }

        public void removeRoute(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0) {
            real.removeRoute(arg0 == null ? null : arg0.unwrap());
        }

        public void requestSetVolume(int arg0) {
            real.requestSetVolume(arg0);
        }

        public void requestUpdateVolume(int arg0) {
            real.requestUpdateVolume(arg0);
        }

        public void setIconDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            real.setIconDrawable(arg0 == null ? null : arg0.unwrap());
        }

        public void setIconResource(int arg0) {
            real.setIconResource(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class RouteInfo {
        private final android.media.MediaRouter.RouteInfo real;

        public RouteInfo(android.media.MediaRouter.RouteInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo wrap(android.media.MediaRouter.RouteInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo(real);
        }

        public android.media.MediaRouter.RouteInfo unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory getCategory() {
            return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteCategory.wrap(real.getCategory());
        }

        public java.lang.CharSequence getDescription() {
            return real.getDescription();
        }

        public int getDeviceType() {
            return real.getDeviceType();
        }

        public com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup getGroup() {
            return com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup.wrap(real.getGroup());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIconDrawable() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getIconDrawable());
        }

        public java.lang.CharSequence getName() {
            return real.getName();
        }

        public java.lang.CharSequence getName(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return real.getName(arg0 == null ? null : arg0.unwrap());
        }

        public int getPlaybackStream() {
            return real.getPlaybackStream();
        }

        public int getPlaybackType() {
            return real.getPlaybackType();
        }

        public com.micklab.dcg.wrapper.android.view.Display getPresentationDisplay() {
            return com.micklab.dcg.wrapper.android.view.Display.wrap(real.getPresentationDisplay());
        }

        public java.lang.CharSequence getStatus() {
            return real.getStatus();
        }

        public int getSupportedTypes() {
            return real.getSupportedTypes();
        }

        public java.lang.Object getTag() {
            return real.getTag();
        }

        public int getVolume() {
            return real.getVolume();
        }

        public int getVolumeHandling() {
            return real.getVolumeHandling();
        }

        public int getVolumeMax() {
            return real.getVolumeMax();
        }

        public boolean isConnecting() {
            return real.isConnecting();
        }

        public boolean isEnabled() {
            return real.isEnabled();
        }

        public void requestSetVolume(int arg0) {
            real.requestSetVolume(arg0);
        }

        public void requestUpdateVolume(int arg0) {
            real.requestUpdateVolume(arg0);
        }

        public void setTag(java.lang.Object arg0) {
            real.setTag(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
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
        private final android.media.MediaRouter.SimpleCallback real;

        public SimpleCallback(android.media.MediaRouter.SimpleCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.SimpleCallback wrap(android.media.MediaRouter.SimpleCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.SimpleCallback(real);
        }

        public android.media.MediaRouter.SimpleCallback unwrap() {
            return real;
        }

        public SimpleCallback() {
            this(new android.media.MediaRouter.SimpleCallback());
        }

        public void onRouteAdded(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteAdded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRouteChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRouteGrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2, int arg3) {
            real.onRouteGrouped(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
        }

        public void onRouteRemoved(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteRemoved(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRouteSelected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            real.onRouteSelected(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onRouteUngrouped(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteGroup arg2) {
            real.onRouteUngrouped(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onRouteUnselected(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, int arg1, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg2) {
            real.onRouteUnselected(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onRouteVolumeChanged(com.micklab.dcg.wrapper.android.media.MediaRouter arg0, com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg1) {
            real.onRouteVolumeChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class UserRouteInfo {
        private final android.media.MediaRouter.UserRouteInfo real;

        public UserRouteInfo(android.media.MediaRouter.UserRouteInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo wrap(android.media.MediaRouter.UserRouteInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.UserRouteInfo(real);
        }

        public android.media.MediaRouter.UserRouteInfo unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.media.RemoteControlClient getRemoteControlClient() {
            return com.micklab.dcg.wrapper.android.media.RemoteControlClient.wrap(real.getRemoteControlClient());
        }

        public void requestSetVolume(int arg0) {
            real.requestSetVolume(arg0);
        }

        public void requestUpdateVolume(int arg0) {
            real.requestUpdateVolume(arg0);
        }

        public void setDescription(java.lang.CharSequence arg0) {
            real.setDescription(arg0);
        }

        public void setIconDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            real.setIconDrawable(arg0 == null ? null : arg0.unwrap());
        }

        public void setIconResource(int arg0) {
            real.setIconResource(arg0);
        }

        public void setName(int arg0) {
            real.setName(arg0);
        }

        public void setName(java.lang.CharSequence arg0) {
            real.setName(arg0);
        }

        public void setPlaybackStream(int arg0) {
            real.setPlaybackStream(arg0);
        }

        public void setPlaybackType(int arg0) {
            real.setPlaybackType(arg0);
        }

        public void setRemoteControlClient(com.micklab.dcg.wrapper.android.media.RemoteControlClient arg0) {
            real.setRemoteControlClient(arg0 == null ? null : arg0.unwrap());
        }

        public void setStatus(java.lang.CharSequence arg0) {
            real.setStatus(arg0);
        }

        public void setVolume(int arg0) {
            real.setVolume(arg0);
        }

        public void setVolumeCallback(com.micklab.dcg.wrapper.android.media.MediaRouter.VolumeCallback arg0) {
            real.setVolumeCallback(arg0 == null ? null : arg0.unwrap());
        }

        public void setVolumeHandling(int arg0) {
            real.setVolumeHandling(arg0);
        }

        public void setVolumeMax(int arg0) {
            real.setVolumeMax(arg0);
        }

    }
    public static final class VolumeCallback {
        private final android.media.MediaRouter.VolumeCallback real;

        public VolumeCallback(android.media.MediaRouter.VolumeCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter.VolumeCallback wrap(android.media.MediaRouter.VolumeCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter.VolumeCallback(real);
        }

        public android.media.MediaRouter.VolumeCallback unwrap() {
            return real;
        }

        public void onVolumeSetRequest(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0, int arg1) {
            real.onVolumeSetRequest(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onVolumeUpdateRequest(com.micklab.dcg.wrapper.android.media.MediaRouter.RouteInfo arg0, int arg1) {
            real.onVolumeUpdateRequest(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
