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
    public static final java.lang.String EXTRA_SORT_ORDER = android.provider.CloudMediaProviderContract.EXTRA_SORT_ORDER;
    public static final java.lang.String EXTRA_SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED = android.provider.CloudMediaProviderContract.EXTRA_SURFACE_CONTROLLER_AUDIO_MUTE_ENABLED;
    public static final java.lang.String EXTRA_SYNC_GENERATION = android.provider.CloudMediaProviderContract.EXTRA_SYNC_GENERATION;
    public static final java.lang.String MANAGE_CLOUD_MEDIA_PROVIDERS_PERMISSION = android.provider.CloudMediaProviderContract.MANAGE_CLOUD_MEDIA_PROVIDERS_PERMISSION;
    public static final java.lang.String MEDIA_CATEGORY_TYPE_PEOPLE_AND_PETS = android.provider.CloudMediaProviderContract.MEDIA_CATEGORY_TYPE_PEOPLE_AND_PETS;
    public static final java.lang.String PROVIDER_INTERFACE = android.provider.CloudMediaProviderContract.PROVIDER_INTERFACE;
    public static final java.lang.String SEARCH_SUGGESTION_ALBUM = android.provider.CloudMediaProviderContract.SEARCH_SUGGESTION_ALBUM;
    public static final java.lang.String SEARCH_SUGGESTION_DATE = android.provider.CloudMediaProviderContract.SEARCH_SUGGESTION_DATE;
    public static final java.lang.String SEARCH_SUGGESTION_FACE = android.provider.CloudMediaProviderContract.SEARCH_SUGGESTION_FACE;
    public static final java.lang.String SEARCH_SUGGESTION_LOCATION = android.provider.CloudMediaProviderContract.SEARCH_SUGGESTION_LOCATION;
    public static final java.lang.String SEARCH_SUGGESTION_TEXT = android.provider.CloudMediaProviderContract.SEARCH_SUGGESTION_TEXT;
    public static final int SORT_ORDER_DESC_DATE_TAKEN = android.provider.CloudMediaProviderContract.SORT_ORDER_DESC_DATE_TAKEN;

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
    public static final class Capabilities {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Capabilities(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities wrap(android.provider.CloudMediaProviderContract.Capabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CloudMediaProviderContract.Capabilities getReal() {
            return (android.provider.CloudMediaProviderContract.Capabilities) real;
        }

        public android.provider.CloudMediaProviderContract.Capabilities unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.provider.CloudMediaProviderContract.Capabilities) real).describeContents();
        }

        public boolean isMediaCategoriesEnabled() {
            return ((android.provider.CloudMediaProviderContract.Capabilities) real).isMediaCategoriesEnabled();
        }

        public boolean isSearchEnabled() {
            return ((android.provider.CloudMediaProviderContract.Capabilities) real).isSearchEnabled();
        }

        public java.lang.String toString() {
            return ((android.provider.CloudMediaProviderContract.Capabilities) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.provider.CloudMediaProviderContract.Capabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities.Builder wrap(android.provider.CloudMediaProviderContract.Capabilities.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.provider.CloudMediaProviderContract.Capabilities.Builder getReal() {
                return (android.provider.CloudMediaProviderContract.Capabilities.Builder) real;
            }

            public android.provider.CloudMediaProviderContract.Capabilities.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.provider.CloudMediaProviderContract.Capabilities.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities build() {
                return com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities.wrap(((android.provider.CloudMediaProviderContract.Capabilities.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities.Builder setMediaCategoriesEnabled(boolean arg0) {
                return com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities.Builder.wrap(((android.provider.CloudMediaProviderContract.Capabilities.Builder) real).setMediaCategoriesEnabled(arg0));
            }

            public com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities.Builder setSearchEnabled(boolean arg0) {
                return com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.Capabilities.Builder.wrap(((android.provider.CloudMediaProviderContract.Capabilities.Builder) real).setSearchEnabled(arg0));
            }

        }
    }
    public static final class MediaCategoryColumns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaCategoryColumns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaCategoryColumns wrap(android.provider.CloudMediaProviderContract.MediaCategoryColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaCategoryColumns(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CloudMediaProviderContract.MediaCategoryColumns getReal() {
            return (android.provider.CloudMediaProviderContract.MediaCategoryColumns) real;
        }

        public android.provider.CloudMediaProviderContract.MediaCategoryColumns unwrap() {
            return getReal();
        }

        public static final java.lang.String DISPLAY_NAME = android.provider.CloudMediaProviderContract.MediaCategoryColumns.DISPLAY_NAME;
        public static final java.lang.String ID = android.provider.CloudMediaProviderContract.MediaCategoryColumns.ID;
        public static final java.lang.String MEDIA_CATEGORY_TYPE = android.provider.CloudMediaProviderContract.MediaCategoryColumns.MEDIA_CATEGORY_TYPE;
        public static final java.lang.String MEDIA_COVER_ID1 = android.provider.CloudMediaProviderContract.MediaCategoryColumns.MEDIA_COVER_ID1;
        public static final java.lang.String MEDIA_COVER_ID2 = android.provider.CloudMediaProviderContract.MediaCategoryColumns.MEDIA_COVER_ID2;
        public static final java.lang.String MEDIA_COVER_ID3 = android.provider.CloudMediaProviderContract.MediaCategoryColumns.MEDIA_COVER_ID3;
        public static final java.lang.String MEDIA_COVER_ID4 = android.provider.CloudMediaProviderContract.MediaCategoryColumns.MEDIA_COVER_ID4;

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
    public static final class MediaSetColumns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaSetColumns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaSetColumns wrap(android.provider.CloudMediaProviderContract.MediaSetColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.MediaSetColumns(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CloudMediaProviderContract.MediaSetColumns getReal() {
            return (android.provider.CloudMediaProviderContract.MediaSetColumns) real;
        }

        public android.provider.CloudMediaProviderContract.MediaSetColumns unwrap() {
            return getReal();
        }

        public static final java.lang.String DISPLAY_NAME = android.provider.CloudMediaProviderContract.MediaSetColumns.DISPLAY_NAME;
        public static final java.lang.String ID = android.provider.CloudMediaProviderContract.MediaSetColumns.ID;
        public static final java.lang.String MEDIA_COUNT = android.provider.CloudMediaProviderContract.MediaSetColumns.MEDIA_COUNT;
        public static final java.lang.String MEDIA_COVER_ID = android.provider.CloudMediaProviderContract.MediaSetColumns.MEDIA_COVER_ID;

    }
    public static final class SearchSuggestionColumns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SearchSuggestionColumns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.SearchSuggestionColumns wrap(android.provider.CloudMediaProviderContract.SearchSuggestionColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CloudMediaProviderContract.SearchSuggestionColumns(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CloudMediaProviderContract.SearchSuggestionColumns getReal() {
            return (android.provider.CloudMediaProviderContract.SearchSuggestionColumns) real;
        }

        public android.provider.CloudMediaProviderContract.SearchSuggestionColumns unwrap() {
            return getReal();
        }

        public static final java.lang.String DISPLAY_TEXT = android.provider.CloudMediaProviderContract.SearchSuggestionColumns.DISPLAY_TEXT;
        public static final java.lang.String MEDIA_COVER_ID = android.provider.CloudMediaProviderContract.SearchSuggestionColumns.MEDIA_COVER_ID;
        public static final java.lang.String MEDIA_SET_ID = android.provider.CloudMediaProviderContract.SearchSuggestionColumns.MEDIA_SET_ID;
        public static final java.lang.String TYPE = android.provider.CloudMediaProviderContract.SearchSuggestionColumns.TYPE;

    }
}
