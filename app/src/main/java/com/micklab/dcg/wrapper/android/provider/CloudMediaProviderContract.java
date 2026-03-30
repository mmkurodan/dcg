// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class CloudMediaProviderContract {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CloudMediaProviderContract(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract wrap(android.provider.CloudMediaProviderContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract(real, (__DcgwBridgeToken) null);
    }

    public android.provider.CloudMediaProviderContract getReal() {
        return (android.provider.CloudMediaProviderContract) real;
    }

    public android.provider.CloudMediaProviderContract unwrap() {
        return getReal();
    }

    public static final java.lang.String EXTRA_ALBUM_ID = android.provider.CloudMediaProviderContract.EXTRA_ALBUM_ID;
    public static final java.lang.String EXTRA_LOOPING_PLAYBACK_ENABLED = android.provider.CloudMediaProviderContract.EXTRA_LOOPING_PLAYBACK_ENABLED;
    public static final java.lang.String EXTRA_MEDIA_COLLECTION_ID = android.provider.CloudMediaProviderContract.EXTRA_MEDIA_COLLECTION_ID;
    public static final java.lang.String EXTRA_PAGE_SIZE = android.provider.CloudMediaProviderContract.EXTRA_PAGE_SIZE;
    public static final java.lang.String EXTRA_PAGE_TOKEN = android.provider.CloudMediaProviderContract.EXTRA_PAGE_TOKEN;
    public static final java.lang.String EXTRA_PREVIEW_THUMBNAIL = android.provider.CloudMediaProviderContract.EXTRA_PREVIEW_THUMBNAIL;
    public static final java.lang.String EXTRA_SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED = android.provider.CloudMediaProviderContract.EXTRA_SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED;
    public static final java.lang.String EXTRA_SYNC_GENERATION = android.provider.CloudMediaProviderContract.EXTRA_SYNC_GENERATION;
    public static final java.lang.String MANAGE_CLOUD_MEDIA_PROVIDERS_PERMISSION = android.provider.CloudMediaProviderContract.MANAGE_CLOUD_MEDIA_PROVIDERS_PERMISSION;
    public static final java.lang.String PROVIDER_INTERFACE = android.provider.CloudMediaProviderContract.PROVIDER_INTERFACE;

    public static final class AlbumColumns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AlbumColumns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.AlbumColumns wrap(android.provider.CloudMediaProviderContract.AlbumColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.AlbumColumns(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CloudMediaProviderContract.AlbumColumns getReal() {
            return (android.provider.CloudMediaProviderContract.AlbumColumns) real;
        }

        public android.provider.CloudMediaProviderContract.AlbumColumns unwrap() {
            return getReal();
        }

        public static final java.lang.String DATE_TAKEN_MILLIS = android.provider.CloudMediaProviderContract.AlbumColumns.DATE_TAKEN_MILLIS;
        public static final java.lang.String DISPLAY_NAME = android.provider.CloudMediaProviderContract.AlbumColumns.DISPLAY_NAME;
        public static final java.lang.String ID = android.provider.CloudMediaProviderContract.AlbumColumns.ID;
        public static final java.lang.String MEDIA_COUNT = android.provider.CloudMediaProviderContract.AlbumColumns.MEDIA_COUNT;
        public static final java.lang.String MEDIA_COVER_ID = android.provider.CloudMediaProviderContract.AlbumColumns.MEDIA_COVER_ID;

    }
    public static final class MediaCollectionInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaCollectionInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaCollectionInfo wrap(android.provider.CloudMediaProviderContract.MediaCollectionInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaCollectionInfo(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CloudMediaProviderContract.MediaCollectionInfo getReal() {
            return (android.provider.CloudMediaProviderContract.MediaCollectionInfo) real;
        }

        public android.provider.CloudMediaProviderContract.MediaCollectionInfo unwrap() {
            return getReal();
        }

        public static final java.lang.String ACCOUNT_CONFIGURATION_INTENT = android.provider.CloudMediaProviderContract.MediaCollectionInfo.ACCOUNT_CONFIGURATION_INTENT;
        public static final java.lang.String ACCOUNT_NAME = android.provider.CloudMediaProviderContract.MediaCollectionInfo.ACCOUNT_NAME;
        public static final java.lang.String LAST_MEDIA_SYNC_GENERATION = android.provider.CloudMediaProviderContract.MediaCollectionInfo.LAST_MEDIA_SYNC_GENERATION;
        public static final java.lang.String MEDIA_COLLECTION_ID = android.provider.CloudMediaProviderContract.MediaCollectionInfo.MEDIA_COLLECTION_ID;

    }
    public static final class MediaColumns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaColumns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaColumns wrap(android.provider.CloudMediaProviderContract.MediaColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaColumns(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CloudMediaProviderContract.MediaColumns getReal() {
            return (android.provider.CloudMediaProviderContract.MediaColumns) real;
        }

        public android.provider.CloudMediaProviderContract.MediaColumns unwrap() {
            return getReal();
        }

        public static final java.lang.String DATE_TAKEN_MILLIS = android.provider.CloudMediaProviderContract.MediaColumns.DATE_TAKEN_MILLIS;
        public static final java.lang.String DURATION_MILLIS = android.provider.CloudMediaProviderContract.MediaColumns.DURATION_MILLIS;
        public static final java.lang.String HEIGHT = android.provider.CloudMediaProviderContract.MediaColumns.HEIGHT;
        public static final java.lang.String ID = android.provider.CloudMediaProviderContract.MediaColumns.ID;
        public static final java.lang.String IS_FAVORITE = android.provider.CloudMediaProviderContract.MediaColumns.IS_FAVORITE;
        public static final java.lang.String MEDIA_STORE_URI = android.provider.CloudMediaProviderContract.MediaColumns.MEDIA_STORE_URI;
        public static final java.lang.String MIME_TYPE = android.provider.CloudMediaProviderContract.MediaColumns.MIME_TYPE;
        public static final java.lang.String ORIENTATION = android.provider.CloudMediaProviderContract.MediaColumns.ORIENTATION;
        public static final java.lang.String SIZE_BYTES = android.provider.CloudMediaProviderContract.MediaColumns.SIZE_BYTES;
        public static final java.lang.String STANDARD_MIME_TYPE_EXTENSION = android.provider.CloudMediaProviderContract.MediaColumns.STANDARD_MIME_TYPE_EXTENSION;
        public static final int STANDARD_MIME_TYPE_EXTENSION_ANIMATED_WEBP = android.provider.CloudMediaProviderContract.MediaColumns.STANDARD_MIME_TYPE_EXTENSION_ANIMATED_WEBP;
        public static final int STANDARD_MIME_TYPE_EXTENSION_GIF = android.provider.CloudMediaProviderContract.MediaColumns.STANDARD_MIME_TYPE_EXTENSION_GIF;
        public static final int STANDARD_MIME_TYPE_EXTENSION_MOTION_PHOTO = android.provider.CloudMediaProviderContract.MediaColumns.STANDARD_MIME_TYPE_EXTENSION_MOTION_PHOTO;
        public static final int STANDARD_MIME_TYPE_EXTENSION_NONE = android.provider.CloudMediaProviderContract.MediaColumns.STANDARD_MIME_TYPE_EXTENSION_NONE;
        public static final java.lang.String SYNC_GENERATION = android.provider.CloudMediaProviderContract.MediaColumns.SYNC_GENERATION;
        public static final java.lang.String WIDTH = android.provider.CloudMediaProviderContract.MediaColumns.WIDTH;

    }
}
