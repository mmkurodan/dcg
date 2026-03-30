// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.browse;

public final class MediaBrowser {
    private final android.media.browse.MediaBrowser real;

    public MediaBrowser(android.media.browse.MediaBrowser real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser wrap(android.media.browse.MediaBrowser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser(real);
    }

    public android.media.browse.MediaBrowser unwrap() {
        return real;
    }

    public MediaBrowser(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ConnectionCallback arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        this(new android.media.browse.MediaBrowser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public void connect() {
        real.connect();
    }

    public void disconnect() {
        real.disconnect();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public void getItem(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ItemCallback arg1) {
        real.getItem(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String getRoot() {
        return real.getRoot();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getServiceComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getServiceComponent());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(real.getSessionToken());
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public void subscribe(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback arg1) {
        real.subscribe(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void subscribe(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback arg2) {
        real.subscribe(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void unsubscribe(java.lang.String arg0) {
        real.unsubscribe(arg0);
    }

    public void unsubscribe(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback arg1) {
        real.unsubscribe(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final java.lang.String EXTRA_PAGE = android.media.browse.MediaBrowser.EXTRA_PAGE;
    public static final java.lang.String EXTRA_PAGE_SIZE = android.media.browse.MediaBrowser.EXTRA_PAGE_SIZE;

    public static final class ConnectionCallback {
        private final android.media.browse.MediaBrowser.ConnectionCallback real;

        public ConnectionCallback(android.media.browse.MediaBrowser.ConnectionCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ConnectionCallback wrap(android.media.browse.MediaBrowser.ConnectionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ConnectionCallback(real);
        }

        public android.media.browse.MediaBrowser.ConnectionCallback unwrap() {
            return real;
        }

        public ConnectionCallback() {
            this(new android.media.browse.MediaBrowser.ConnectionCallback());
        }

        public void onConnected() {
            real.onConnected();
        }

        public void onConnectionFailed() {
            real.onConnectionFailed();
        }

        public void onConnectionSuspended() {
            real.onConnectionSuspended();
        }

    }
    public static final class ItemCallback {
        private final android.media.browse.MediaBrowser.ItemCallback real;

        public ItemCallback(android.media.browse.MediaBrowser.ItemCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ItemCallback wrap(android.media.browse.MediaBrowser.ItemCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.ItemCallback(real);
        }

        public android.media.browse.MediaBrowser.ItemCallback unwrap() {
            return real;
        }

        public void onError(java.lang.String arg0) {
            real.onError(arg0);
        }

        public void onItemLoaded(com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.MediaItem arg0) {
            real.onItemLoaded(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class MediaItem {
        private final android.media.browse.MediaBrowser.MediaItem real;

        public MediaItem(android.media.browse.MediaBrowser.MediaItem real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.MediaItem wrap(android.media.browse.MediaBrowser.MediaItem real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.MediaItem(real);
        }

        public android.media.browse.MediaBrowser.MediaItem unwrap() {
            return real;
        }

        public MediaItem(com.micklab.dcg.wrapper.android.media.MediaDescription arg0, int arg1) {
            this(new android.media.browse.MediaBrowser.MediaItem(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription getDescription() {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.wrap(real.getDescription());
        }

        public int getFlags() {
            return real.getFlags();
        }

        public java.lang.String getMediaId() {
            return real.getMediaId();
        }

        public boolean isBrowsable() {
            return real.isBrowsable();
        }

        public boolean isPlayable() {
            return real.isPlayable();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int FLAG_BROWSABLE = android.media.browse.MediaBrowser.MediaItem.FLAG_BROWSABLE;
        public static final int FLAG_PLAYABLE = android.media.browse.MediaBrowser.MediaItem.FLAG_PLAYABLE;

    }
    public static final class SubscriptionCallback {
        private final android.media.browse.MediaBrowser.SubscriptionCallback real;

        public SubscriptionCallback(android.media.browse.MediaBrowser.SubscriptionCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback wrap(android.media.browse.MediaBrowser.SubscriptionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.browse.MediaBrowser.SubscriptionCallback(real);
        }

        public android.media.browse.MediaBrowser.SubscriptionCallback unwrap() {
            return real;
        }

        public void onError(java.lang.String arg0) {
            real.onError(arg0);
        }

        public void onError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onError(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
}
