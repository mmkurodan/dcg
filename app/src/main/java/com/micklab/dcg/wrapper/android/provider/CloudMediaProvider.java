// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class CloudMediaProvider {
    private final android.provider.CloudMediaProvider real;

    public CloudMediaProvider(android.provider.CloudMediaProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.CloudMediaProvider wrap(android.provider.CloudMediaProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProvider(real);
    }

    public android.provider.CloudMediaProvider unwrap() {
        return real;
    }

    public void attachInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ProviderInfo arg1) {
        real.attachInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.call(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri canonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.canonicalize(arg0 == null ? null : arg0.unwrap()));
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return real.delete(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.getType(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.insert(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.provider.CloudMediaProvider.CloudMediaSurfaceController onCreateCloudMediaSurfaceController(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback arg1) {
        return com.micklab.dcg.wrapper.android.provider.CloudMediaProvider.CloudMediaSurfaceController.wrap(real.onCreateCloudMediaSurfaceController(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle onGetMediaCollectionInfo(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.onGetMediaCollectionInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor onOpenMedia(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.onOpenMedia(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor onOpenPreview(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(real.onOpenPreview(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor onQueryAlbums(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.onQueryAlbums(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor onQueryDeletedMedia(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.onQueryDeletedMedia(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor onQueryMedia(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.onQueryMedia(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.CloudMediaProvider#openFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.CloudMediaProvider#openFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.CloudMediaProvider#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.CloudMediaProvider#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return real.update(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public static final class CloudMediaSurfaceController {
        private final android.provider.CloudMediaProvider.CloudMediaSurfaceController real;

        public CloudMediaSurfaceController(android.provider.CloudMediaProvider.CloudMediaSurfaceController real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProvider.CloudMediaSurfaceController wrap(android.provider.CloudMediaProvider.CloudMediaSurfaceController real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProvider.CloudMediaSurfaceController(real);
        }

        public android.provider.CloudMediaProvider.CloudMediaSurfaceController unwrap() {
            return real;
        }

        public void onConfigChange(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.onConfigChange(arg0 == null ? null : arg0.unwrap());
        }

        public void onDestroy() {
            real.onDestroy();
        }

        public void onMediaPause(int arg0) {
            real.onMediaPause(arg0);
        }

        public void onMediaPlay(int arg0) {
            real.onMediaPlay(arg0);
        }

        public void onMediaSeekTo(int arg0, long arg1) {
            real.onMediaSeekTo(arg0, arg1);
        }

        public void onPlayerCreate() {
            real.onPlayerCreate();
        }

        public void onPlayerRelease() {
            real.onPlayerRelease();
        }

        public void onSurfaceChanged(int arg0, int arg1, int arg2, int arg3) {
            real.onSurfaceChanged(arg0, arg1, arg2, arg3);
        }

        public void onSurfaceCreated(int arg0, com.micklab.dcg.wrapper.android.view.Surface arg1, java.lang.String arg2) {
            real.onSurfaceCreated(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public void onSurfaceDestroyed(int arg0) {
            real.onSurfaceDestroyed(arg0);
        }

    }
    public static final class CloudMediaSurfaceStateChangedCallback {
        private final android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback real;

        public CloudMediaSurfaceStateChangedCallback(android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback wrap(android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback(real);
        }

        public android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback unwrap() {
            return real;
        }

        public void setPlaybackState(int arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.setPlaybackState(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public static final int PLAYBACK_STATE_BUFFERING = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_BUFFERING;
        public static final int PLAYBACK_STATE_COMPLETED = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_COMPLETED;
        public static final int PLAYBACK_STATE_ERROR_PERMANENT_FAILURE = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_ERROR_PERMANENT_FAILURE;
        public static final int PLAYBACK_STATE_ERROR_RETRIABLE_FAILURE = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_ERROR_RETRIABLE_FAILURE;
        public static final int PLAYBACK_STATE_MEDIA_SIZE_CHANGED = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_MEDIA_SIZE_CHANGED;
        public static final int PLAYBACK_STATE_PAUSED = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_PAUSED;
        public static final int PLAYBACK_STATE_READY = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_READY;
        public static final int PLAYBACK_STATE_STARTED = android.provider.CloudMediaProvider.CloudMediaSurfaceStateChangedCallback.PLAYBACK_STATE_STARTED;

    }
}
