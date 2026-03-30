// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaRouter2 {
    private final android.media.MediaRouter2 real;

    public MediaRouter2(android.media.MediaRouter2 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter2 wrap(android.media.MediaRouter2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2(real);
    }

    public android.media.MediaRouter2 unwrap() {
        return real;
    }

    public void cancelScanRequest(com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken arg0) {
        real.cancelScanRequest(arg0 == null ? null : arg0.unwrap());
    }

    public android.media.MediaRouter2.RoutingController getController(java.lang.String arg0) {
        return real.getController(arg0);
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter2 getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.wrap(android.media.MediaRouter2.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaRouter2 getInstance(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, java.util.concurrent.Executor arg2, java.lang.Runnable arg3) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.wrap(android.media.MediaRouter2.getInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.media.RouteListingPreference getRouteListingPreference() {
        return com.micklab.dcg.wrapper.android.media.RouteListingPreference.wrap(real.getRouteListingPreference());
    }

    public android.media.MediaRouter2.RoutingController getSystemController() {
        return real.getSystemController();
    }

    public void registerControllerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback arg1) {
        real.registerControllerCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void registerRouteCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback arg1, com.micklab.dcg.wrapper.android.media.RouteDiscoveryPreference arg2) {
        real.registerRouteCallback(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void registerTransferCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback arg1) {
        real.registerTransferCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken requestScan(com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken.wrap(real.requestScan(arg0 == null ? null : arg0.unwrap()));
    }

    public void setOnGetControllerHintsListener(com.micklab.dcg.wrapper.android.media.MediaRouter2.OnGetControllerHintsListener arg0) {
        real.setOnGetControllerHintsListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setRouteListingPreference(com.micklab.dcg.wrapper.android.media.RouteListingPreference arg0) {
        real.setRouteListingPreference(arg0 == null ? null : arg0.unwrap());
    }

    public void setRouteVolume(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0, int arg1) {
        real.setRouteVolume(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean showSystemOutputSwitcher() {
        return real.showSystemOutputSwitcher();
    }

    public void stop() {
        real.stop();
    }

    public void transferTo(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
        real.transferTo(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterControllerCallback(com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback arg0) {
        real.unregisterControllerCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterRouteCallback(com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback arg0) {
        real.unregisterRouteCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterTransferCallback(com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback arg0) {
        real.unregisterTransferCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class ControllerCallback {
        private final android.media.MediaRouter2.ControllerCallback real;

        public ControllerCallback(android.media.MediaRouter2.ControllerCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback wrap(android.media.MediaRouter2.ControllerCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ControllerCallback(real);
        }

        public android.media.MediaRouter2.ControllerCallback unwrap() {
            return real;
        }

        public void onControllerUpdated(android.media.MediaRouter2.RoutingController arg0) {
            real.onControllerUpdated(arg0);
        }

    }
    public static final class OnGetControllerHintsListener {
        private final android.media.MediaRouter2.OnGetControllerHintsListener real;

        public OnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.OnGetControllerHintsListener wrap(android.media.MediaRouter2.OnGetControllerHintsListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.OnGetControllerHintsListener(real);
        }

        public android.media.MediaRouter2.OnGetControllerHintsListener unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.os.Bundle onGetControllerHints(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.onGetControllerHints(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class RouteCallback {
        private final android.media.MediaRouter2.RouteCallback real;

        public RouteCallback(android.media.MediaRouter2.RouteCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback wrap(android.media.MediaRouter2.RouteCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.RouteCallback(real);
        }

        public android.media.MediaRouter2.RouteCallback unwrap() {
            return real;
        }

    }
    public static final class ScanRequest {
        private final android.media.MediaRouter2.ScanRequest real;

        public ScanRequest(android.media.MediaRouter2.ScanRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest wrap(android.media.MediaRouter2.ScanRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest(real);
        }

        public android.media.MediaRouter2.ScanRequest unwrap() {
            return real;
        }

        public boolean isScreenOffScan() {
            return real.isScreenOffScan();
        }

        public static final class Builder {
            private final android.media.MediaRouter2.ScanRequest.Builder real;

            public Builder(android.media.MediaRouter2.ScanRequest.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder wrap(android.media.MediaRouter2.ScanRequest.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder(real);
            }

            public android.media.MediaRouter2.ScanRequest.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.media.MediaRouter2.ScanRequest.Builder());
            }

            public com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest build() {
                return com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder setScreenOffScan(boolean arg0) {
                return com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanRequest.Builder.wrap(real.setScreenOffScan(arg0));
            }

        }
    }
    public static final class ScanToken {
        private final android.media.MediaRouter2.ScanToken real;

        public ScanToken(android.media.MediaRouter2.ScanToken real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken wrap(android.media.MediaRouter2.ScanToken real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.ScanToken(real);
        }

        public android.media.MediaRouter2.ScanToken unwrap() {
            return real;
        }

    }
    public static final class TransferCallback {
        private final android.media.MediaRouter2.TransferCallback real;

        public TransferCallback(android.media.MediaRouter2.TransferCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback wrap(android.media.MediaRouter2.TransferCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaRouter2.TransferCallback(real);
        }

        public android.media.MediaRouter2.TransferCallback unwrap() {
            return real;
        }

        public void onStop(android.media.MediaRouter2.RoutingController arg0) {
            real.onStop(arg0);
        }

        public void onTransfer(android.media.MediaRouter2.RoutingController arg0, android.media.MediaRouter2.RoutingController arg1) {
            real.onTransfer(arg0, arg1);
        }

        public void onTransferFailure(com.micklab.dcg.wrapper.android.media.MediaRoute2Info arg0) {
            real.onTransferFailure(arg0 == null ? null : arg0.unwrap());
        }

    }
}
