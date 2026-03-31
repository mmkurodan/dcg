// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRouter2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaRouter2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter2 wrap(android.media.MediaRouter2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaRouter2 getReal() {
        return (android.media.MediaRouter2) real;
    }

    public android.media.MediaRouter2 unwrap() {
        return getReal();
    }

    public void cancelScanRequest(com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken arg0) {
        ((android.media.MediaRouter2) real).cancelScanRequest(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController getController(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController.wrap(((android.media.MediaRouter2) real).getController(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter2 getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.wrap(android.media.MediaRouter2.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter2 getInstance(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, java.util.concurrent.Executor arg2, java.lang.Runnable arg3) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.wrap(android.media.MediaRouter2.getInstance(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.media.RouteListingPreference getRouteListingPreference() {
        return com.micklab.dcg.wrapper.android.media.RouteListingPreference.wrap(((android.media.MediaRouter2) real).getRouteListingPreference());
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController getSystemController() {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController.wrap(((android.media.MediaRouter2) real).getSystemController());
    }

    public void registerControllerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback arg1) {
        ((android.media.MediaRouter2) real).registerControllerCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void registerRouteCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback arg1, com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference arg2) {
        ((android.media.MediaRouter2) real).registerRouteCallback(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void registerTransferCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback arg1) {
        ((android.media.MediaRouter2) real).registerTransferCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken requestScan(com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken.wrap(((android.media.MediaRouter2) real).requestScan(arg0 == null ? null : arg0.getReal()));
    }

    public void setOnGetControllerHintsListener(com.micklab.dcg.wrapper.android.media.MediaRouter2.OnGetControllerHintsListener arg0) {
        ((android.media.MediaRouter2) real).setOnGetControllerHintsListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRouteListingPreference(com.micklab.dcg.wrapper.android.media.RouteListingPreference arg0) {
        ((android.media.MediaRouter2) real).setRouteListingPreference(arg0 == null ? null : arg0.getReal());
    }

    public void setRouteVolume(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0, int arg1) {
        ((android.media.MediaRouter2) real).setRouteVolume(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean showSystemOutputSwitcher() {
        return ((android.media.MediaRouter2) real).showSystemOutputSwitcher();
    }

    public void stop() {
        ((android.media.MediaRouter2) real).stop();
    }

    public void transferTo(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
        ((android.media.MediaRouter2) real).transferTo(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterControllerCallback(com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback arg0) {
        ((android.media.MediaRouter2) real).unregisterControllerCallback(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterRouteCallback(com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback arg0) {
        ((android.media.MediaRouter2) real).unregisterRouteCallback(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterTransferCallback(com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback arg0) {
        ((android.media.MediaRouter2) real).unregisterTransferCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class ControllerCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ControllerCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback wrap(android.media.MediaRouter2.ControllerCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter2.ControllerCallback getReal() {
            return (android.media.MediaRouter2.ControllerCallback) real;
        }

        public android.media.MediaRouter2.ControllerCallback unwrap() {
            return getReal();
        }

        public void onControllerUpdated(com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController arg0) {
            ((android.media.MediaRouter2.ControllerCallback) real).onControllerUpdated(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnGetControllerHintsListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGetControllerHintsListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.OnGetControllerHintsListener wrap(android.media.MediaRouter2.OnGetControllerHintsListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.OnGetControllerHintsListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter2.OnGetControllerHintsListener getReal() {
            return (android.media.MediaRouter2.OnGetControllerHintsListener) real;
        }

        public android.media.MediaRouter2.OnGetControllerHintsListener unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle onGetControllerHints(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.MediaRouter2.OnGetControllerHintsListener) real).onGetControllerHints(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class RouteCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RouteCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback wrap(android.media.MediaRouter2.RouteCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter2.RouteCallback getReal() {
            return (android.media.MediaRouter2.RouteCallback) real;
        }

        public android.media.MediaRouter2.RouteCallback unwrap() {
            return getReal();
        }

    }
    public static final class RoutingController {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RoutingController(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController wrap(android.media.MediaRouter2.RoutingController real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter2.RoutingController getReal() {
            return (android.media.MediaRouter2.RoutingController) real;
        }

        public android.media.MediaRouter2.RoutingController unwrap() {
            return getReal();
        }

        public void deselectRoute(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
            ((android.media.MediaRouter2.RoutingController) real).deselectRoute(arg0 == null ? null : arg0.getReal());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getControlHints() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.MediaRouter2.RoutingController) real).getControlHints());
        }

        public java.lang.String getId() {
            return ((android.media.MediaRouter2.RoutingController) real).getId();
        }

        public com.micklab.dcg.wrapper.android.media.RoutingSessionInfo getRoutingSessionInfo() {
            return com.micklab.dcg.wrapper.android.media.RoutingSessionInfo.wrap(((android.media.MediaRouter2.RoutingController) real).getRoutingSessionInfo());
        }

        public int getVolume() {
            return ((android.media.MediaRouter2.RoutingController) real).getVolume();
        }

        public int getVolumeHandling() {
            return ((android.media.MediaRouter2.RoutingController) real).getVolumeHandling();
        }

        public int getVolumeMax() {
            return ((android.media.MediaRouter2.RoutingController) real).getVolumeMax();
        }

        public boolean isReleased() {
            return ((android.media.MediaRouter2.RoutingController) real).isReleased();
        }

        public void release() {
            ((android.media.MediaRouter2.RoutingController) real).release();
        }

        public void selectRoute(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
            ((android.media.MediaRouter2.RoutingController) real).selectRoute(arg0 == null ? null : arg0.getReal());
        }

        public void setVolume(int arg0) {
            ((android.media.MediaRouter2.RoutingController) real).setVolume(arg0);
        }

        public java.lang.String toString() {
            return ((android.media.MediaRouter2.RoutingController) real).toString();
        }

        public boolean wasTransferInitiatedBySelf() {
            return ((android.media.MediaRouter2.RoutingController) real).wasTransferInitiatedBySelf();
        }


    }
    public static final class ScanRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ScanRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest wrap(android.media.MediaRouter2.ScanRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter2.ScanRequest getReal() {
            return (android.media.MediaRouter2.ScanRequest) real;
        }

        public android.media.MediaRouter2.ScanRequest unwrap() {
            return getReal();
        }

        public boolean isScreenOffScan() {
            return ((android.media.MediaRouter2.ScanRequest) real).isScreenOffScan();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder wrap(android.media.MediaRouter2.ScanRequest.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.media.MediaRouter2.ScanRequest.Builder getReal() {
                return (android.media.MediaRouter2.ScanRequest.Builder) real;
            }

            public android.media.MediaRouter2.ScanRequest.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.media.MediaRouter2.ScanRequest.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest build() {
                return com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.wrap(((android.media.MediaRouter2.ScanRequest.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder setScreenOffScan(boolean arg0) {
                return com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder.wrap(((android.media.MediaRouter2.ScanRequest.Builder) real).setScreenOffScan(arg0));
            }

        }
    }
    public static final class ScanToken {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ScanToken(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken wrap(android.media.MediaRouter2.ScanToken real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter2.ScanToken getReal() {
            return (android.media.MediaRouter2.ScanToken) real;
        }

        public android.media.MediaRouter2.ScanToken unwrap() {
            return getReal();
        }

    }
    public static final class TransferCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TransferCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback wrap(android.media.MediaRouter2.TransferCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaRouter2.TransferCallback getReal() {
            return (android.media.MediaRouter2.TransferCallback) real;
        }

        public android.media.MediaRouter2.TransferCallback unwrap() {
            return getReal();
        }

        public void onStop(com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController arg0) {
            ((android.media.MediaRouter2.TransferCallback) real).onStop(arg0 == null ? null : arg0.getReal());
        }

        public void onTransfer(com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController arg0, com.micklab.dcg.wrapper.android.media.MediaRouter2.RoutingController arg1) {
            ((android.media.MediaRouter2.TransferCallback) real).onTransfer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onTransferFailure(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
            ((android.media.MediaRouter2.TransferCallback) real).onTransferFailure(arg0 == null ? null : arg0.getReal());
        }

    }
}
