// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.browse;

public final class MediaBrowser {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaBrowser(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser wrap(android.media.browse.MediaBrowser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser(real, (__DcgwBridgeToken) null);
    }

    public android.media.browse.MediaBrowser getReal() {
        return (android.media.browse.MediaBrowser) real;
    }

    public android.media.browse.MediaBrowser unwrap() {
        return getReal();
    }

    public MediaBrowser(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ConnectionCallback arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        this(new android.media.browse.MediaBrowser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public void connect() {
        ((android.media.browse.MediaBrowser) real).connect();
    }

    public void disconnect() {
        ((android.media.browse.MediaBrowser) real).disconnect();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.browse.MediaBrowser) real).getExtras());
    }

    public void getItem(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ItemCallback arg1) {
        ((android.media.browse.MediaBrowser) real).getItem(arg0, arg1 == null ? null : arg1.getReal());
    }

    public java.lang.String getRoot() {
        return ((android.media.browse.MediaBrowser) real).getRoot();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getServiceComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.media.browse.MediaBrowser) real).getServiceComponent());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(((android.media.browse.MediaBrowser) real).getSessionToken());
    }

    public boolean isConnected() {
        return ((android.media.browse.MediaBrowser) real).isConnected();
    }

    public void subscribe(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback arg1) {
        ((android.media.browse.MediaBrowser) real).subscribe(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void subscribe(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback arg2) {
        ((android.media.browse.MediaBrowser) real).subscribe(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void unsubscribe(java.lang.String arg0) {
        ((android.media.browse.MediaBrowser) real).unsubscribe(arg0);
    }

    public void unsubscribe(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback arg1) {
        ((android.media.browse.MediaBrowser) real).unsubscribe(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final java.lang.String EXTRA_PAGE = android.media.browse.MediaBrowser.EXTRA_PAGE;
    public static final java.lang.String EXTRA_PAGE_SIZE = android.media.browse.MediaBrowser.EXTRA_PAGE_SIZE;

    public static final class ConnectionCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ConnectionCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ConnectionCallback wrap(android.media.browse.MediaBrowser.ConnectionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ConnectionCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.browse.MediaBrowser.ConnectionCallback getReal() {
            return (android.media.browse.MediaBrowser.ConnectionCallback) real;
        }

        public android.media.browse.MediaBrowser.ConnectionCallback unwrap() {
            return getReal();
        }

        public ConnectionCallback() {
            this(new android.media.browse.MediaBrowser.ConnectionCallback(), (__DcgwBridgeToken) null);
        }

        public void onConnected() {
            ((android.media.browse.MediaBrowser.ConnectionCallback) real).onConnected();
        }

        public void onConnectionFailed() {
            ((android.media.browse.MediaBrowser.ConnectionCallback) real).onConnectionFailed();
        }

        public void onConnectionSuspended() {
            ((android.media.browse.MediaBrowser.ConnectionCallback) real).onConnectionSuspended();
        }

    }
    public static final class ItemCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ItemCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ItemCallback wrap(android.media.browse.MediaBrowser.ItemCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ItemCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.browse.MediaBrowser.ItemCallback getReal() {
            return (android.media.browse.MediaBrowser.ItemCallback) real;
        }

        public android.media.browse.MediaBrowser.ItemCallback unwrap() {
            return getReal();
        }

        public void onError(java.lang.String arg0) {
            ((android.media.browse.MediaBrowser.ItemCallback) real).onError(arg0);
        }

        public void onItemLoaded(com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.MediaItem arg0) {
            ((android.media.browse.MediaBrowser.ItemCallback) real).onItemLoaded(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class MediaItem {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaItem(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.MediaItem wrap(android.media.browse.MediaBrowser.MediaItem real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.MediaItem(real, (__DcgwBridgeToken) null);
        }

        public android.media.browse.MediaBrowser.MediaItem getReal() {
            return (android.media.browse.MediaBrowser.MediaItem) real;
        }

        public android.media.browse.MediaBrowser.MediaItem unwrap() {
            return getReal();
        }

        public MediaItem(com.micklab.dcg.wrapper.android.media.MediaDescription arg0, int arg1) {
            this(new android.media.browse.MediaBrowser.MediaItem(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.media.browse.MediaBrowser.MediaItem) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription getDescription() {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.wrap(((android.media.browse.MediaBrowser.MediaItem) real).getDescription());
        }

        public int getFlags() {
            return ((android.media.browse.MediaBrowser.MediaItem) real).getFlags();
        }

        public java.lang.String getMediaId() {
            return ((android.media.browse.MediaBrowser.MediaItem) real).getMediaId();
        }

        public boolean isBrowsable() {
            return ((android.media.browse.MediaBrowser.MediaItem) real).isBrowsable();
        }

        public boolean isPlayable() {
            return ((android.media.browse.MediaBrowser.MediaItem) real).isPlayable();
        }

        public java.lang.String toString() {
            return ((android.media.browse.MediaBrowser.MediaItem) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.browse.MediaBrowser.MediaItem) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int FLAG_BROWSABLE = android.media.browse.MediaBrowser.MediaItem.FLAG_BROWSABLE;
        public static final int FLAG_PLAYABLE = android.media.browse.MediaBrowser.MediaItem.FLAG_PLAYABLE;

    }
    public static final class SubscriptionCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SubscriptionCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback wrap(android.media.browse.MediaBrowser.SubscriptionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.browse.MediaBrowser.SubscriptionCallback getReal() {
            return (android.media.browse.MediaBrowser.SubscriptionCallback) real;
        }

        public android.media.browse.MediaBrowser.SubscriptionCallback unwrap() {
            return getReal();
        }

        public void onError(java.lang.String arg0) {
            ((android.media.browse.MediaBrowser.SubscriptionCallback) real).onError(arg0);
        }

        public void onError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.browse.MediaBrowser.SubscriptionCallback) real).onError(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
}
