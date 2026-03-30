// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class MediaStore {
    private final android.provider.MediaStore real;

    public MediaStore(android.provider.MediaStore real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.MediaStore wrap(android.provider.MediaStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore(real);
    }

    public android.provider.MediaStore unwrap() {
        return real;
    }

    public MediaStore() {
        this(new android.provider.MediaStore());
    }

    public static boolean canManageMedia(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.provider.MediaStore.canManageMedia(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getDocumentUri(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.getDocumentUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static long getGeneration(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return android.provider.MediaStore.getGeneration(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getMediaScannerUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.getMediaScannerUri());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getMediaUri(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.getMediaUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getOriginalMediaFormatFileDescriptor(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.MediaStore#getOriginalMediaFormatFileDescriptor(android.content.Context,android.os.ParcelFileDescriptor)");
    }

    public static int getPickImagesMaxLimit() {
        return android.provider.MediaStore.getPickImagesMaxLimit();
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getRedactedUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.getRedactedUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static boolean getRequireOriginal(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.provider.MediaStore.getRequireOriginal(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getVersion(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.provider.MediaStore.getVersion(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getVersion(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return android.provider.MediaStore.getVersion(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static java.lang.String getVolumeName(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.provider.MediaStore.getVolumeName(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean isCurrentCloudMediaProviderAuthority(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) {
        return android.provider.MediaStore.isCurrentCloudMediaProviderAuthority(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static boolean isCurrentSystemGallery(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, int arg1, java.lang.String arg2) {
        return android.provider.MediaStore.isCurrentSystemGallery(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static boolean isSupportedCloudMediaProviderAuthority(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) {
        return android.provider.MediaStore.isSupportedCloudMediaProviderAuthority(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static void notifyCloudMediaChangedEvent(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, java.lang.String arg2) throws java.lang.SecurityException {
        android.provider.MediaStore.notifyCloudMediaChangedEvent(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static com.micklab.dcg.wrapper.android.net.Uri setIncludePending(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.setIncludePending(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri setRequireOriginal(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.setRequireOriginal(arg0 == null ? null : arg0.unwrap()));
    }

    public static final java.lang.String ACCESS_MEDIA_OWNER_PACKAGE_NAME_PERMISSION = android.provider.MediaStore.ACCESS_MEDIA_OWNER_PACKAGE_NAME_PERMISSION;
    public static final java.lang.String ACTION_IMAGE_CAPTURE = android.provider.MediaStore.ACTION_IMAGE_CAPTURE;
    public static final java.lang.String ACTION_IMAGE_CAPTURE_SECURE = android.provider.MediaStore.ACTION_IMAGE_CAPTURE_SECURE;
    public static final java.lang.String ACTION_PICK_IMAGES = android.provider.MediaStore.ACTION_PICK_IMAGES;
    public static final java.lang.String ACTION_PICK_IMAGES_SETTINGS = android.provider.MediaStore.ACTION_PICK_IMAGES_SETTINGS;
    public static final java.lang.String ACTION_REVIEW = android.provider.MediaStore.ACTION_REVIEW;
    public static final java.lang.String ACTION_REVIEW_SECURE = android.provider.MediaStore.ACTION_REVIEW_SECURE;
    public static final java.lang.String ACTION_VIDEO_CAPTURE = android.provider.MediaStore.ACTION_VIDEO_CAPTURE;
    public static final java.lang.String AUTHORITY = android.provider.MediaStore.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri AUTHORITY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.AUTHORITY_URI);
    public static final java.lang.String EXTRA_ACCEPT_ORIGINAL_MEDIA_FORMAT = android.provider.MediaStore.EXTRA_ACCEPT_ORIGINAL_MEDIA_FORMAT;
    public static final java.lang.String EXTRA_BRIGHTNESS = android.provider.MediaStore.EXTRA_BRIGHTNESS;
    public static final java.lang.String EXTRA_DURATION_LIMIT = android.provider.MediaStore.EXTRA_DURATION_LIMIT;
    public static final java.lang.String EXTRA_FINISH_ON_COMPLETION = android.provider.MediaStore.EXTRA_FINISH_ON_COMPLETION;
    public static final java.lang.String EXTRA_FULL_SCREEN = android.provider.MediaStore.EXTRA_FULL_SCREEN;
    public static final java.lang.String EXTRA_MEDIA_ALBUM = android.provider.MediaStore.EXTRA_MEDIA_ALBUM;
    public static final java.lang.String EXTRA_MEDIA_ARTIST = android.provider.MediaStore.EXTRA_MEDIA_ARTIST;
    public static final java.lang.String EXTRA_MEDIA_CAPABILITIES = android.provider.MediaStore.EXTRA_MEDIA_CAPABILITIES;
    public static final java.lang.String EXTRA_MEDIA_CAPABILITIES_UID = android.provider.MediaStore.EXTRA_MEDIA_CAPABILITIES_UID;
    public static final java.lang.String EXTRA_MEDIA_FOCUS = android.provider.MediaStore.EXTRA_MEDIA_FOCUS;
    public static final java.lang.String EXTRA_MEDIA_GENRE = android.provider.MediaStore.EXTRA_MEDIA_GENRE;
    public static final java.lang.String EXTRA_MEDIA_PLAYLIST = android.provider.MediaStore.EXTRA_MEDIA_PLAYLIST;
    public static final java.lang.String EXTRA_MEDIA_RADIO_CHANNEL = android.provider.MediaStore.EXTRA_MEDIA_RADIO_CHANNEL;
    public static final java.lang.String EXTRA_MEDIA_TITLE = android.provider.MediaStore.EXTRA_MEDIA_TITLE;
    public static final java.lang.String EXTRA_OUTPUT = android.provider.MediaStore.EXTRA_OUTPUT;
    public static final java.lang.String EXTRA_PICK_IMAGES_ACCENT_COLOR = android.provider.MediaStore.EXTRA_PICK_IMAGES_ACCENT_COLOR;
    public static final java.lang.String EXTRA_PICK_IMAGES_IN_ORDER = android.provider.MediaStore.EXTRA_PICK_IMAGES_IN_ORDER;
    public static final java.lang.String EXTRA_PICK_IMAGES_LAUNCH_TAB = android.provider.MediaStore.EXTRA_PICK_IMAGES_LAUNCH_TAB;
    public static final java.lang.String EXTRA_PICK_IMAGES_MAX = android.provider.MediaStore.EXTRA_PICK_IMAGES_MAX;
    public static final java.lang.String EXTRA_SCREEN_ORIENTATION = android.provider.MediaStore.EXTRA_SCREEN_ORIENTATION;
    public static final java.lang.String EXTRA_SHOW_ACTION_ICONS = android.provider.MediaStore.EXTRA_SHOW_ACTION_ICONS;
    public static final java.lang.String EXTRA_SIZE_LIMIT = android.provider.MediaStore.EXTRA_SIZE_LIMIT;
    public static final java.lang.String EXTRA_VIDEO_QUALITY = android.provider.MediaStore.EXTRA_VIDEO_QUALITY;
    public static final java.lang.String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = android.provider.MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH;
    public static final java.lang.String INTENT_ACTION_MEDIA_SEARCH = android.provider.MediaStore.INTENT_ACTION_MEDIA_SEARCH;
    public static final java.lang.String INTENT_ACTION_MUSIC_PLAYER = android.provider.MediaStore.INTENT_ACTION_MUSIC_PLAYER;
    public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA = android.provider.MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA;
    public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA_SECURE = android.provider.MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA_SECURE;
    public static final java.lang.String INTENT_ACTION_TEXT_OPEN_FROM_SEARCH = android.provider.MediaStore.INTENT_ACTION_TEXT_OPEN_FROM_SEARCH;
    public static final java.lang.String INTENT_ACTION_VIDEO_CAMERA = android.provider.MediaStore.INTENT_ACTION_VIDEO_CAMERA;
    public static final java.lang.String INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH = android.provider.MediaStore.INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH;
    public static final int MATCH_DEFAULT = android.provider.MediaStore.MATCH_DEFAULT;
    public static final int MATCH_EXCLUDE = android.provider.MediaStore.MATCH_EXCLUDE;
    public static final int MATCH_INCLUDE = android.provider.MediaStore.MATCH_INCLUDE;
    public static final int MATCH_ONLY = android.provider.MediaStore.MATCH_ONLY;
    public static final java.lang.String MEDIA_SCANNER_VOLUME = android.provider.MediaStore.MEDIA_SCANNER_VOLUME;
    public static final java.lang.String META_DATA_REVIEW_GALLERY_PREWARM_SERVICE = android.provider.MediaStore.META_DATA_REVIEW_GALLERY_PREWARM_SERVICE;
    public static final java.lang.String META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE = android.provider.MediaStore.META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE;
    public static final int PICK_IMAGES_TAB_ALBUMS = android.provider.MediaStore.PICK_IMAGES_TAB_ALBUMS;
    public static final int PICK_IMAGES_TAB_IMAGES = android.provider.MediaStore.PICK_IMAGES_TAB_IMAGES;
    public static final java.lang.String QUERY_ARG_INCLUDE_RECENTLY_UNMOUNTED_VOLUMES = android.provider.MediaStore.QUERY_ARG_INCLUDE_RECENTLY_UNMOUNTED_VOLUMES;
    public static final java.lang.String QUERY_ARG_LATEST_SELECTION_ONLY = android.provider.MediaStore.QUERY_ARG_LATEST_SELECTION_ONLY;
    public static final java.lang.String QUERY_ARG_MATCH_FAVORITE = android.provider.MediaStore.QUERY_ARG_MATCH_FAVORITE;
    public static final java.lang.String QUERY_ARG_MATCH_PENDING = android.provider.MediaStore.QUERY_ARG_MATCH_PENDING;
    public static final java.lang.String QUERY_ARG_MATCH_TRASHED = android.provider.MediaStore.QUERY_ARG_MATCH_TRASHED;
    public static final java.lang.String QUERY_ARG_RELATED_URI = android.provider.MediaStore.QUERY_ARG_RELATED_URI;
    public static final java.lang.String UNKNOWN_STRING = android.provider.MediaStore.UNKNOWN_STRING;
    public static final java.lang.String VOLUME_EXTERNAL = android.provider.MediaStore.VOLUME_EXTERNAL;
    public static final java.lang.String VOLUME_EXTERNAL_PRIMARY = android.provider.MediaStore.VOLUME_EXTERNAL_PRIMARY;
    public static final java.lang.String VOLUME_INTERNAL = android.provider.MediaStore.VOLUME_INTERNAL;

    public static final class Audio {
        private final android.provider.MediaStore.Audio real;

        public Audio(android.provider.MediaStore.Audio real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio wrap(android.provider.MediaStore.Audio real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio(real);
        }

        public android.provider.MediaStore.Audio unwrap() {
            return real;
        }

        public Audio() {
            this(new android.provider.MediaStore.Audio());
        }

        public static java.lang.String keyFor(java.lang.String arg0) {
            return android.provider.MediaStore.Audio.keyFor(arg0);
        }

        public static final class AlbumColumns {
            private final android.provider.MediaStore.Audio.AlbumColumns real;

            public AlbumColumns(android.provider.MediaStore.Audio.AlbumColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.AlbumColumns wrap(android.provider.MediaStore.Audio.AlbumColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.AlbumColumns(real);
            }

            public android.provider.MediaStore.Audio.AlbumColumns unwrap() {
                return real;
            }

            public static final java.lang.String ALBUM = android.provider.MediaStore.Audio.AlbumColumns.ALBUM;
            public static final java.lang.String ALBUM_ART = android.provider.MediaStore.Audio.AlbumColumns.ALBUM_ART;
            public static final java.lang.String ALBUM_ID = android.provider.MediaStore.Audio.AlbumColumns.ALBUM_ID;
            public static final java.lang.String ALBUM_KEY = android.provider.MediaStore.Audio.AlbumColumns.ALBUM_KEY;
            public static final java.lang.String ARTIST = android.provider.MediaStore.Audio.AlbumColumns.ARTIST;
            public static final java.lang.String ARTIST_ID = android.provider.MediaStore.Audio.AlbumColumns.ARTIST_ID;
            public static final java.lang.String ARTIST_KEY = android.provider.MediaStore.Audio.AlbumColumns.ARTIST_KEY;
            public static final java.lang.String FIRST_YEAR = android.provider.MediaStore.Audio.AlbumColumns.FIRST_YEAR;
            public static final java.lang.String LAST_YEAR = android.provider.MediaStore.Audio.AlbumColumns.LAST_YEAR;
            public static final java.lang.String NUMBER_OF_SONGS = android.provider.MediaStore.Audio.AlbumColumns.NUMBER_OF_SONGS;
            public static final java.lang.String NUMBER_OF_SONGS_FOR_ARTIST = android.provider.MediaStore.Audio.AlbumColumns.NUMBER_OF_SONGS_FOR_ARTIST;

        }
        public static final class Albums {
            private final android.provider.MediaStore.Audio.Albums real;

            public Albums(android.provider.MediaStore.Audio.Albums real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Albums wrap(android.provider.MediaStore.Audio.Albums real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Albums(real);
            }

            public android.provider.MediaStore.Audio.Albums unwrap() {
                return real;
            }

            public Albums() {
                this(new android.provider.MediaStore.Audio.Albums());
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Albums.getContentUri(arg0));
            }

            public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Audio.Albums.CONTENT_TYPE;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Audio.Albums.DEFAULT_SORT_ORDER;
            public static final java.lang.String ENTRY_CONTENT_TYPE = android.provider.MediaStore.Audio.Albums.ENTRY_CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Albums.INTERNAL_CONTENT_URI);

        }
        public static final class ArtistColumns {
            private final android.provider.MediaStore.Audio.ArtistColumns real;

            public ArtistColumns(android.provider.MediaStore.Audio.ArtistColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.ArtistColumns wrap(android.provider.MediaStore.Audio.ArtistColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.ArtistColumns(real);
            }

            public android.provider.MediaStore.Audio.ArtistColumns unwrap() {
                return real;
            }

            public static final java.lang.String ARTIST = android.provider.MediaStore.Audio.ArtistColumns.ARTIST;
            public static final java.lang.String ARTIST_KEY = android.provider.MediaStore.Audio.ArtistColumns.ARTIST_KEY;
            public static final java.lang.String NUMBER_OF_ALBUMS = android.provider.MediaStore.Audio.ArtistColumns.NUMBER_OF_ALBUMS;
            public static final java.lang.String NUMBER_OF_TRACKS = android.provider.MediaStore.Audio.ArtistColumns.NUMBER_OF_TRACKS;

        }
        public static final class Artists {
            private final android.provider.MediaStore.Audio.Artists real;

            public Artists(android.provider.MediaStore.Audio.Artists real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Artists wrap(android.provider.MediaStore.Audio.Artists real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Artists(real);
            }

            public android.provider.MediaStore.Audio.Artists unwrap() {
                return real;
            }

            public Artists() {
                this(new android.provider.MediaStore.Audio.Artists());
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Artists.getContentUri(arg0));
            }

            public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Audio.Artists.CONTENT_TYPE;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Audio.Artists.DEFAULT_SORT_ORDER;
            public static final java.lang.String ENTRY_CONTENT_TYPE = android.provider.MediaStore.Audio.Artists.ENTRY_CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Artists.INTERNAL_CONTENT_URI);

            public static final class Albums {
                private final android.provider.MediaStore.Audio.Artists.Albums real;

                public Albums(android.provider.MediaStore.Audio.Artists.Albums real) {
                    this.real = real;
                }

                public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Artists.Albums wrap(android.provider.MediaStore.Audio.Artists.Albums real) {
                    return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Artists.Albums(real);
                }

                public android.provider.MediaStore.Audio.Artists.Albums unwrap() {
                    return real;
                }

                public Albums() {
                    this(new android.provider.MediaStore.Audio.Artists.Albums());
                }

                public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
                    return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Artists.Albums.getContentUri(arg0, arg1));
                }

            }
        }
        public static final class AudioColumns {
            private final android.provider.MediaStore.Audio.AudioColumns real;

            public AudioColumns(android.provider.MediaStore.Audio.AudioColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.AudioColumns wrap(android.provider.MediaStore.Audio.AudioColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.AudioColumns(real);
            }

            public android.provider.MediaStore.Audio.AudioColumns unwrap() {
                return real;
            }

            public static final java.lang.String ALBUM_ID = android.provider.MediaStore.Audio.AudioColumns.ALBUM_ID;
            public static final java.lang.String ALBUM_KEY = android.provider.MediaStore.Audio.AudioColumns.ALBUM_KEY;
            public static final java.lang.String ARTIST_ID = android.provider.MediaStore.Audio.AudioColumns.ARTIST_ID;
            public static final java.lang.String ARTIST_KEY = android.provider.MediaStore.Audio.AudioColumns.ARTIST_KEY;
            public static final java.lang.String BOOKMARK = android.provider.MediaStore.Audio.AudioColumns.BOOKMARK;
            public static final java.lang.String GENRE = android.provider.MediaStore.Audio.AudioColumns.GENRE;
            public static final java.lang.String GENRE_ID = android.provider.MediaStore.Audio.AudioColumns.GENRE_ID;
            public static final java.lang.String GENRE_KEY = android.provider.MediaStore.Audio.AudioColumns.GENRE_KEY;
            public static final java.lang.String IS_ALARM = android.provider.MediaStore.Audio.AudioColumns.IS_ALARM;
            public static final java.lang.String IS_AUDIOBOOK = android.provider.MediaStore.Audio.AudioColumns.IS_AUDIOBOOK;
            public static final java.lang.String IS_MUSIC = android.provider.MediaStore.Audio.AudioColumns.IS_MUSIC;
            public static final java.lang.String IS_NOTIFICATION = android.provider.MediaStore.Audio.AudioColumns.IS_NOTIFICATION;
            public static final java.lang.String IS_PODCAST = android.provider.MediaStore.Audio.AudioColumns.IS_PODCAST;
            public static final java.lang.String IS_RECORDING = android.provider.MediaStore.Audio.AudioColumns.IS_RECORDING;
            public static final java.lang.String IS_RINGTONE = android.provider.MediaStore.Audio.AudioColumns.IS_RINGTONE;
            public static final java.lang.String TITLE_KEY = android.provider.MediaStore.Audio.AudioColumns.TITLE_KEY;
            public static final java.lang.String TITLE_RESOURCE_URI = android.provider.MediaStore.Audio.AudioColumns.TITLE_RESOURCE_URI;
            public static final java.lang.String TRACK = android.provider.MediaStore.Audio.AudioColumns.TRACK;
            public static final java.lang.String YEAR = android.provider.MediaStore.Audio.AudioColumns.YEAR;

        }
        public static final class Genres {
            private final android.provider.MediaStore.Audio.Genres real;

            public Genres(android.provider.MediaStore.Audio.Genres real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Genres wrap(android.provider.MediaStore.Audio.Genres real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Genres(real);
            }

            public android.provider.MediaStore.Audio.Genres unwrap() {
                return real;
            }

            public Genres() {
                this(new android.provider.MediaStore.Audio.Genres());
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Genres.getContentUri(arg0));
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUriForAudioId(java.lang.String arg0, int arg1) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Genres.getContentUriForAudioId(arg0, arg1));
            }

            public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Audio.Genres.CONTENT_TYPE;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Audio.Genres.DEFAULT_SORT_ORDER;
            public static final java.lang.String ENTRY_CONTENT_TYPE = android.provider.MediaStore.Audio.Genres.ENTRY_CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Genres.INTERNAL_CONTENT_URI);

            public static final class Members {
                private final android.provider.MediaStore.Audio.Genres.Members real;

                public Members(android.provider.MediaStore.Audio.Genres.Members real) {
                    this.real = real;
                }

                public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Genres.Members wrap(android.provider.MediaStore.Audio.Genres.Members real) {
                    return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Genres.Members(real);
                }

                public android.provider.MediaStore.Audio.Genres.Members unwrap() {
                    return real;
                }

                public Members() {
                    this(new android.provider.MediaStore.Audio.Genres.Members());
                }

                public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
                    return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Genres.Members.getContentUri(arg0, arg1));
                }

                public static final java.lang.String AUDIO_ID = android.provider.MediaStore.Audio.Genres.Members.AUDIO_ID;
                public static final java.lang.String CONTENT_DIRECTORY = android.provider.MediaStore.Audio.Genres.Members.CONTENT_DIRECTORY;
                public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Audio.Genres.Members.DEFAULT_SORT_ORDER;
                public static final java.lang.String GENRE_ID = android.provider.MediaStore.Audio.Genres.Members.GENRE_ID;

            }
        }
        public static final class GenresColumns {
            private final android.provider.MediaStore.Audio.GenresColumns real;

            public GenresColumns(android.provider.MediaStore.Audio.GenresColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.GenresColumns wrap(android.provider.MediaStore.Audio.GenresColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.GenresColumns(real);
            }

            public android.provider.MediaStore.Audio.GenresColumns unwrap() {
                return real;
            }

            public static final java.lang.String NAME = android.provider.MediaStore.Audio.GenresColumns.NAME;

        }
        public static final class Media {
            private final android.provider.MediaStore.Audio.Media real;

            public Media(android.provider.MediaStore.Audio.Media real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Media wrap(android.provider.MediaStore.Audio.Media real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Media(real);
            }

            public android.provider.MediaStore.Audio.Media unwrap() {
                return real;
            }

            public Media() {
                this(new android.provider.MediaStore.Audio.Media());
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Media.getContentUri(arg0));
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Media.getContentUri(arg0, arg1));
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUriForPath(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Media.getContentUriForPath(arg0));
            }

            public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Audio.Media.CONTENT_TYPE;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Audio.Media.DEFAULT_SORT_ORDER;
            public static final java.lang.String ENTRY_CONTENT_TYPE = android.provider.MediaStore.Audio.Media.ENTRY_CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
            public static final java.lang.String EXTRA_MAX_BYTES = android.provider.MediaStore.Audio.Media.EXTRA_MAX_BYTES;
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Media.INTERNAL_CONTENT_URI);
            public static final java.lang.String RECORD_SOUND_ACTION = android.provider.MediaStore.Audio.Media.RECORD_SOUND_ACTION;

        }
        public static final class Playlists {
            private final android.provider.MediaStore.Audio.Playlists real;

            public Playlists(android.provider.MediaStore.Audio.Playlists real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Playlists wrap(android.provider.MediaStore.Audio.Playlists real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Playlists(real);
            }

            public android.provider.MediaStore.Audio.Playlists unwrap() {
                return real;
            }

            public Playlists() {
                this(new android.provider.MediaStore.Audio.Playlists());
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Playlists.getContentUri(arg0));
            }

            public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Audio.Playlists.CONTENT_TYPE;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Audio.Playlists.DEFAULT_SORT_ORDER;
            public static final java.lang.String ENTRY_CONTENT_TYPE = android.provider.MediaStore.Audio.Playlists.ENTRY_CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Playlists.INTERNAL_CONTENT_URI);

            public static final class Members {
                private final android.provider.MediaStore.Audio.Playlists.Members real;

                public Members(android.provider.MediaStore.Audio.Playlists.Members real) {
                    this.real = real;
                }

                public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Playlists.Members wrap(android.provider.MediaStore.Audio.Playlists.Members real) {
                    return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Playlists.Members(real);
                }

                public android.provider.MediaStore.Audio.Playlists.Members unwrap() {
                    return real;
                }

                public Members() {
                    this(new android.provider.MediaStore.Audio.Playlists.Members());
                }

                public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
                    return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Audio.Playlists.Members.getContentUri(arg0, arg1));
                }

                public static boolean moveItem(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, int arg2, int arg3) {
                    return android.provider.MediaStore.Audio.Playlists.Members.moveItem(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
                }

                public static final java.lang.String AUDIO_ID = android.provider.MediaStore.Audio.Playlists.Members.AUDIO_ID;
                public static final java.lang.String CONTENT_DIRECTORY = android.provider.MediaStore.Audio.Playlists.Members.CONTENT_DIRECTORY;
                public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Audio.Playlists.Members.DEFAULT_SORT_ORDER;
                public static final java.lang.String PLAYLIST_ID = android.provider.MediaStore.Audio.Playlists.Members.PLAYLIST_ID;
                public static final java.lang.String PLAY_ORDER = android.provider.MediaStore.Audio.Playlists.Members.PLAY_ORDER;
                public static final java.lang.String _ID = android.provider.MediaStore.Audio.Playlists.Members._ID;

            }
        }
        public static final class PlaylistsColumns {
            private final android.provider.MediaStore.Audio.PlaylistsColumns real;

            public PlaylistsColumns(android.provider.MediaStore.Audio.PlaylistsColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.PlaylistsColumns wrap(android.provider.MediaStore.Audio.PlaylistsColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.PlaylistsColumns(real);
            }

            public android.provider.MediaStore.Audio.PlaylistsColumns unwrap() {
                return real;
            }

            public static final java.lang.String DATA = android.provider.MediaStore.Audio.PlaylistsColumns.DATA;
            public static final java.lang.String DATE_ADDED = android.provider.MediaStore.Audio.PlaylistsColumns.DATE_ADDED;
            public static final java.lang.String DATE_MODIFIED = android.provider.MediaStore.Audio.PlaylistsColumns.DATE_MODIFIED;
            public static final java.lang.String NAME = android.provider.MediaStore.Audio.PlaylistsColumns.NAME;

        }
        public static final class Radio {
            private final android.provider.MediaStore.Audio.Radio real;

            public Radio(android.provider.MediaStore.Audio.Radio real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Radio wrap(android.provider.MediaStore.Audio.Radio real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Audio.Radio(real);
            }

            public android.provider.MediaStore.Audio.Radio unwrap() {
                return real;
            }

            public static final java.lang.String ENTRY_CONTENT_TYPE = android.provider.MediaStore.Audio.Radio.ENTRY_CONTENT_TYPE;

        }
    }
    public static final class DownloadColumns {
        private final android.provider.MediaStore.DownloadColumns real;

        public DownloadColumns(android.provider.MediaStore.DownloadColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.DownloadColumns wrap(android.provider.MediaStore.DownloadColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.DownloadColumns(real);
        }

        public android.provider.MediaStore.DownloadColumns unwrap() {
            return real;
        }

        public static final java.lang.String DOWNLOAD_URI = android.provider.MediaStore.DownloadColumns.DOWNLOAD_URI;
        public static final java.lang.String REFERER_URI = android.provider.MediaStore.DownloadColumns.REFERER_URI;

    }
    public static final class Downloads {
        private final android.provider.MediaStore.Downloads real;

        public Downloads(android.provider.MediaStore.Downloads real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.Downloads wrap(android.provider.MediaStore.Downloads real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Downloads(real);
        }

        public android.provider.MediaStore.Downloads unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Downloads.getContentUri(arg0));
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Downloads.getContentUri(arg0, arg1));
        }

        public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Downloads.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Downloads.INTERNAL_CONTENT_URI);

    }
    public static final class Files {
        private final android.provider.MediaStore.Files real;

        public Files(android.provider.MediaStore.Files real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.Files wrap(android.provider.MediaStore.Files real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Files(real);
        }

        public android.provider.MediaStore.Files unwrap() {
            return real;
        }

        public Files() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.MediaStore$Files#android.provider.MediaStore$Files()");
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Files.getContentUri(arg0));
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Files.getContentUri(arg0, arg1));
        }

        public static final class FileColumns {
            private final android.provider.MediaStore.Files.FileColumns real;

            public FileColumns(android.provider.MediaStore.Files.FileColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Files.FileColumns wrap(android.provider.MediaStore.Files.FileColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Files.FileColumns(real);
            }

            public android.provider.MediaStore.Files.FileColumns unwrap() {
                return real;
            }

            public static final java.lang.String MEDIA_TYPE = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE;
            public static final int MEDIA_TYPE_AUDIO = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_AUDIO;
            public static final int MEDIA_TYPE_DOCUMENT = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_DOCUMENT;
            public static final int MEDIA_TYPE_IMAGE = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE;
            public static final int MEDIA_TYPE_NONE = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_NONE;
            public static final int MEDIA_TYPE_PLAYLIST = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_PLAYLIST;
            public static final int MEDIA_TYPE_SUBTITLE = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_SUBTITLE;
            public static final int MEDIA_TYPE_VIDEO = android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO;
            public static final java.lang.String MIME_TYPE = android.provider.MediaStore.Files.FileColumns.MIME_TYPE;
            public static final java.lang.String PARENT = android.provider.MediaStore.Files.FileColumns.PARENT;

        }
    }
    public static final class Images {
        private final android.provider.MediaStore.Images real;

        public Images(android.provider.MediaStore.Images real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.Images wrap(android.provider.MediaStore.Images real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Images(real);
        }

        public android.provider.MediaStore.Images unwrap() {
            return real;
        }

        public Images() {
            this(new android.provider.MediaStore.Images());
        }

        public static final class ImageColumns {
            private final android.provider.MediaStore.Images.ImageColumns real;

            public ImageColumns(android.provider.MediaStore.Images.ImageColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Images.ImageColumns wrap(android.provider.MediaStore.Images.ImageColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Images.ImageColumns(real);
            }

            public android.provider.MediaStore.Images.ImageColumns unwrap() {
                return real;
            }

            public static final java.lang.String DESCRIPTION = android.provider.MediaStore.Images.ImageColumns.DESCRIPTION;
            public static final java.lang.String EXPOSURE_TIME = android.provider.MediaStore.Images.ImageColumns.EXPOSURE_TIME;
            public static final java.lang.String F_NUMBER = android.provider.MediaStore.Images.ImageColumns.F_NUMBER;
            public static final java.lang.String ISO = android.provider.MediaStore.Images.ImageColumns.ISO;
            public static final java.lang.String IS_PRIVATE = android.provider.MediaStore.Images.ImageColumns.IS_PRIVATE;
            public static final java.lang.String LATITUDE = android.provider.MediaStore.Images.ImageColumns.LATITUDE;
            public static final java.lang.String LONGITUDE = android.provider.MediaStore.Images.ImageColumns.LONGITUDE;
            public static final java.lang.String MINI_THUMB_MAGIC = android.provider.MediaStore.Images.ImageColumns.MINI_THUMB_MAGIC;
            public static final java.lang.String PICASA_ID = android.provider.MediaStore.Images.ImageColumns.PICASA_ID;
            public static final java.lang.String SCENE_CAPTURE_TYPE = android.provider.MediaStore.Images.ImageColumns.SCENE_CAPTURE_TYPE;

        }
        public static final class Media {
            private final android.provider.MediaStore.Images.Media real;

            public Media(android.provider.MediaStore.Images.Media real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Images.Media wrap(android.provider.MediaStore.Images.Media real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Images.Media(real);
            }

            public android.provider.MediaStore.Images.Media unwrap() {
                return real;
            }

            public Media() {
                this(new android.provider.MediaStore.Images.Media());
            }

            public static com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.FileNotFoundException, java.io.IOException {
                return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.provider.MediaStore.Images.Media.getBitmap(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Images.Media.getContentUri(arg0));
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Images.Media.getContentUri(arg0, arg1));
            }

            public static java.lang.String insertImage(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.FileNotFoundException {
                return android.provider.MediaStore.Images.Media.insertImage(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
            }

            public static java.lang.String insertImage(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, java.lang.String arg2, java.lang.String arg3) {
                return android.provider.MediaStore.Images.Media.insertImage(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
            }

            public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String[] arg2) {
                return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.MediaStore.Images.Media.query(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
            }

            public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String arg4) {
                return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.MediaStore.Images.Media.query(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
            }

            public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String[] arg4, java.lang.String arg5) {
                return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.MediaStore.Images.Media.query(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5));
            }

            public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Images.Media.CONTENT_TYPE;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Images.Media.DEFAULT_SORT_ORDER;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);

        }
        public static final class Thumbnails {
            private final android.provider.MediaStore.Images.Thumbnails real;

            public Thumbnails(android.provider.MediaStore.Images.Thumbnails real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Images.Thumbnails wrap(android.provider.MediaStore.Images.Thumbnails real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Images.Thumbnails(real);
            }

            public android.provider.MediaStore.Images.Thumbnails unwrap() {
                return real;
            }

            public Thumbnails() {
                this(new android.provider.MediaStore.Images.Thumbnails());
            }

            public static void cancelThumbnailRequest(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1) {
                android.provider.MediaStore.Images.Thumbnails.cancelThumbnailRequest(arg0 == null ? null : arg0.unwrap(), arg1);
            }

            public static void cancelThumbnailRequest(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, long arg2) {
                android.provider.MediaStore.Images.Thumbnails.cancelThumbnailRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Images.Thumbnails.getContentUri(arg0));
            }

            public static com.micklab.dcg.wrapper.android.util.Size getKindSize(int arg0) {
                return com.micklab.dcg.wrapper.android.util.Size.wrap(android.provider.MediaStore.Images.Thumbnails.getKindSize(arg0));
            }

            public static com.micklab.dcg.wrapper.android.graphics.Bitmap getThumbnail(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg3) {
                return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.provider.MediaStore.Images.Thumbnails.getThumbnail(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
            }

            public static com.micklab.dcg.wrapper.android.graphics.Bitmap getThumbnail(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, long arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg4) {
                return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.provider.MediaStore.Images.Thumbnails.getThumbnail(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap()));
            }

            public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String[] arg2) {
                return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.MediaStore.Images.Thumbnails.query(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
            }

            public static com.micklab.dcg.wrapper.android.database.Cursor queryMiniThumbnail(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, int arg2, java.lang.String[] arg3) {
                return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
            }

            public static com.micklab.dcg.wrapper.android.database.Cursor queryMiniThumbnails(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2, java.lang.String[] arg3) {
                return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnails(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
            }

            public static final java.lang.String DATA = android.provider.MediaStore.Images.Thumbnails.DATA;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Images.Thumbnails.DEFAULT_SORT_ORDER;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI);
            public static final int FULL_SCREEN_KIND = android.provider.MediaStore.Images.Thumbnails.FULL_SCREEN_KIND;
            public static final java.lang.String HEIGHT = android.provider.MediaStore.Images.Thumbnails.HEIGHT;
            public static final java.lang.String IMAGE_ID = android.provider.MediaStore.Images.Thumbnails.IMAGE_ID;
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Images.Thumbnails.INTERNAL_CONTENT_URI);
            public static final java.lang.String KIND = android.provider.MediaStore.Images.Thumbnails.KIND;
            public static final int MICRO_KIND = android.provider.MediaStore.Images.Thumbnails.MICRO_KIND;
            public static final int MINI_KIND = android.provider.MediaStore.Images.Thumbnails.MINI_KIND;
            public static final java.lang.String THUMB_DATA = android.provider.MediaStore.Images.Thumbnails.THUMB_DATA;
            public static final java.lang.String WIDTH = android.provider.MediaStore.Images.Thumbnails.WIDTH;

        }
    }
    public static final class MediaColumns {
        private final android.provider.MediaStore.MediaColumns real;

        public MediaColumns(android.provider.MediaStore.MediaColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.MediaColumns wrap(android.provider.MediaStore.MediaColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.MediaColumns(real);
        }

        public android.provider.MediaStore.MediaColumns unwrap() {
            return real;
        }

        public static final java.lang.String ALBUM = android.provider.MediaStore.MediaColumns.ALBUM;
        public static final java.lang.String ALBUM_ARTIST = android.provider.MediaStore.MediaColumns.ALBUM_ARTIST;
        public static final java.lang.String ARTIST = android.provider.MediaStore.MediaColumns.ARTIST;
        public static final java.lang.String AUTHOR = android.provider.MediaStore.MediaColumns.AUTHOR;
        public static final java.lang.String BITRATE = android.provider.MediaStore.MediaColumns.BITRATE;
        public static final java.lang.String BUCKET_DISPLAY_NAME = android.provider.MediaStore.MediaColumns.BUCKET_DISPLAY_NAME;
        public static final java.lang.String BUCKET_ID = android.provider.MediaStore.MediaColumns.BUCKET_ID;
        public static final java.lang.String CAPTURE_FRAMERATE = android.provider.MediaStore.MediaColumns.CAPTURE_FRAMERATE;
        public static final java.lang.String CD_TRACK_NUMBER = android.provider.MediaStore.MediaColumns.CD_TRACK_NUMBER;
        public static final java.lang.String COMPILATION = android.provider.MediaStore.MediaColumns.COMPILATION;
        public static final java.lang.String COMPOSER = android.provider.MediaStore.MediaColumns.COMPOSER;
        public static final java.lang.String DATA = android.provider.MediaStore.MediaColumns.DATA;
        public static final java.lang.String DATE_ADDED = android.provider.MediaStore.MediaColumns.DATE_ADDED;
        public static final java.lang.String DATE_EXPIRES = android.provider.MediaStore.MediaColumns.DATE_EXPIRES;
        public static final java.lang.String DATE_MODIFIED = android.provider.MediaStore.MediaColumns.DATE_MODIFIED;
        public static final java.lang.String DATE_TAKEN = android.provider.MediaStore.MediaColumns.DATE_TAKEN;
        public static final java.lang.String DISC_NUMBER = android.provider.MediaStore.MediaColumns.DISC_NUMBER;
        public static final java.lang.String DISPLAY_NAME = android.provider.MediaStore.MediaColumns.DISPLAY_NAME;
        public static final java.lang.String DOCUMENT_ID = android.provider.MediaStore.MediaColumns.DOCUMENT_ID;
        public static final java.lang.String DURATION = android.provider.MediaStore.MediaColumns.DURATION;
        public static final java.lang.String GENERATION_ADDED = android.provider.MediaStore.MediaColumns.GENERATION_ADDED;
        public static final java.lang.String GENERATION_MODIFIED = android.provider.MediaStore.MediaColumns.GENERATION_MODIFIED;
        public static final java.lang.String GENRE = android.provider.MediaStore.MediaColumns.GENRE;
        public static final java.lang.String HEIGHT = android.provider.MediaStore.MediaColumns.HEIGHT;
        public static final java.lang.String INSTANCE_ID = android.provider.MediaStore.MediaColumns.INSTANCE_ID;
        public static final java.lang.String IS_DOWNLOAD = android.provider.MediaStore.MediaColumns.IS_DOWNLOAD;
        public static final java.lang.String IS_DRM = android.provider.MediaStore.MediaColumns.IS_DRM;
        public static final java.lang.String IS_FAVORITE = android.provider.MediaStore.MediaColumns.IS_FAVORITE;
        public static final java.lang.String IS_PENDING = android.provider.MediaStore.MediaColumns.IS_PENDING;
        public static final java.lang.String IS_TRASHED = android.provider.MediaStore.MediaColumns.IS_TRASHED;
        public static final java.lang.String MIME_TYPE = android.provider.MediaStore.MediaColumns.MIME_TYPE;
        public static final java.lang.String NUM_TRACKS = android.provider.MediaStore.MediaColumns.NUM_TRACKS;
        public static final java.lang.String ORIENTATION = android.provider.MediaStore.MediaColumns.ORIENTATION;
        public static final java.lang.String ORIGINAL_DOCUMENT_ID = android.provider.MediaStore.MediaColumns.ORIGINAL_DOCUMENT_ID;
        public static final java.lang.String OWNER_PACKAGE_NAME = android.provider.MediaStore.MediaColumns.OWNER_PACKAGE_NAME;
        public static final java.lang.String RELATIVE_PATH = android.provider.MediaStore.MediaColumns.RELATIVE_PATH;
        public static final java.lang.String RESOLUTION = android.provider.MediaStore.MediaColumns.RESOLUTION;
        public static final java.lang.String SIZE = android.provider.MediaStore.MediaColumns.SIZE;
        public static final java.lang.String TITLE = android.provider.MediaStore.MediaColumns.TITLE;
        public static final java.lang.String VOLUME_NAME = android.provider.MediaStore.MediaColumns.VOLUME_NAME;
        public static final java.lang.String WIDTH = android.provider.MediaStore.MediaColumns.WIDTH;
        public static final java.lang.String WRITER = android.provider.MediaStore.MediaColumns.WRITER;
        public static final java.lang.String XMP = android.provider.MediaStore.MediaColumns.XMP;
        public static final java.lang.String YEAR = android.provider.MediaStore.MediaColumns.YEAR;

    }
    public static final class PickerMediaColumns {
        private final android.provider.MediaStore.PickerMediaColumns real;

        public PickerMediaColumns(android.provider.MediaStore.PickerMediaColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.PickerMediaColumns wrap(android.provider.MediaStore.PickerMediaColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.PickerMediaColumns(real);
        }

        public android.provider.MediaStore.PickerMediaColumns unwrap() {
            return real;
        }

        public static final java.lang.String DATA = android.provider.MediaStore.PickerMediaColumns.DATA;
        public static final java.lang.String DATE_TAKEN = android.provider.MediaStore.PickerMediaColumns.DATE_TAKEN;
        public static final java.lang.String DISPLAY_NAME = android.provider.MediaStore.PickerMediaColumns.DISPLAY_NAME;
        public static final java.lang.String DURATION_MILLIS = android.provider.MediaStore.PickerMediaColumns.DURATION_MILLIS;
        public static final java.lang.String HEIGHT = android.provider.MediaStore.PickerMediaColumns.HEIGHT;
        public static final java.lang.String MIME_TYPE = android.provider.MediaStore.PickerMediaColumns.MIME_TYPE;
        public static final java.lang.String ORIENTATION = android.provider.MediaStore.PickerMediaColumns.ORIENTATION;
        public static final java.lang.String SIZE = android.provider.MediaStore.PickerMediaColumns.SIZE;
        public static final java.lang.String WIDTH = android.provider.MediaStore.PickerMediaColumns.WIDTH;

    }
    public static final class Video {
        private final android.provider.MediaStore.Video real;

        public Video(android.provider.MediaStore.Video real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.MediaStore.Video wrap(android.provider.MediaStore.Video real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Video(real);
        }

        public android.provider.MediaStore.Video unwrap() {
            return real;
        }

        public Video() {
            this(new android.provider.MediaStore.Video());
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String[] arg2) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.MediaStore.Video.query(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Video.DEFAULT_SORT_ORDER;

        public static final class Media {
            private final android.provider.MediaStore.Video.Media real;

            public Media(android.provider.MediaStore.Video.Media real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Video.Media wrap(android.provider.MediaStore.Video.Media real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Video.Media(real);
            }

            public android.provider.MediaStore.Video.Media unwrap() {
                return real;
            }

            public Media() {
                this(new android.provider.MediaStore.Video.Media());
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Video.Media.getContentUri(arg0));
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0, long arg1) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Video.Media.getContentUri(arg0, arg1));
            }

            public static final java.lang.String CONTENT_TYPE = android.provider.MediaStore.Video.Media.CONTENT_TYPE;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Video.Media.DEFAULT_SORT_ORDER;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Video.Media.INTERNAL_CONTENT_URI);

        }
        public static final class Thumbnails {
            private final android.provider.MediaStore.Video.Thumbnails real;

            public Thumbnails(android.provider.MediaStore.Video.Thumbnails real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Video.Thumbnails wrap(android.provider.MediaStore.Video.Thumbnails real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Video.Thumbnails(real);
            }

            public android.provider.MediaStore.Video.Thumbnails unwrap() {
                return real;
            }

            public Thumbnails() {
                this(new android.provider.MediaStore.Video.Thumbnails());
            }

            public static void cancelThumbnailRequest(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1) {
                android.provider.MediaStore.Video.Thumbnails.cancelThumbnailRequest(arg0 == null ? null : arg0.unwrap(), arg1);
            }

            public static void cancelThumbnailRequest(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, long arg2) {
                android.provider.MediaStore.Video.Thumbnails.cancelThumbnailRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Video.Thumbnails.getContentUri(arg0));
            }

            public static com.micklab.dcg.wrapper.android.util.Size getKindSize(int arg0) {
                return com.micklab.dcg.wrapper.android.util.Size.wrap(android.provider.MediaStore.Video.Thumbnails.getKindSize(arg0));
            }

            public static com.micklab.dcg.wrapper.android.graphics.Bitmap getThumbnail(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg3) {
                return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.provider.MediaStore.Video.Thumbnails.getThumbnail(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
            }

            public static com.micklab.dcg.wrapper.android.graphics.Bitmap getThumbnail(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, long arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg4) {
                return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.provider.MediaStore.Video.Thumbnails.getThumbnail(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap()));
            }

            public static final java.lang.String DATA = android.provider.MediaStore.Video.Thumbnails.DATA;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.MediaStore.Video.Thumbnails.DEFAULT_SORT_ORDER;
            public static final com.micklab.dcg.wrapper.android.net.Uri EXTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI);
            public static final int FULL_SCREEN_KIND = android.provider.MediaStore.Video.Thumbnails.FULL_SCREEN_KIND;
            public static final java.lang.String HEIGHT = android.provider.MediaStore.Video.Thumbnails.HEIGHT;
            public static final com.micklab.dcg.wrapper.android.net.Uri INTERNAL_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.MediaStore.Video.Thumbnails.INTERNAL_CONTENT_URI);
            public static final java.lang.String KIND = android.provider.MediaStore.Video.Thumbnails.KIND;
            public static final int MICRO_KIND = android.provider.MediaStore.Video.Thumbnails.MICRO_KIND;
            public static final int MINI_KIND = android.provider.MediaStore.Video.Thumbnails.MINI_KIND;
            public static final java.lang.String VIDEO_ID = android.provider.MediaStore.Video.Thumbnails.VIDEO_ID;
            public static final java.lang.String WIDTH = android.provider.MediaStore.Video.Thumbnails.WIDTH;

        }
        public static final class VideoColumns {
            private final android.provider.MediaStore.Video.VideoColumns real;

            public VideoColumns(android.provider.MediaStore.Video.VideoColumns real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.MediaStore.Video.VideoColumns wrap(android.provider.MediaStore.Video.VideoColumns real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.MediaStore.Video.VideoColumns(real);
            }

            public android.provider.MediaStore.Video.VideoColumns unwrap() {
                return real;
            }

            public static final java.lang.String BOOKMARK = android.provider.MediaStore.Video.VideoColumns.BOOKMARK;
            public static final java.lang.String CATEGORY = android.provider.MediaStore.Video.VideoColumns.CATEGORY;
            public static final java.lang.String COLOR_RANGE = android.provider.MediaStore.Video.VideoColumns.COLOR_RANGE;
            public static final java.lang.String COLOR_STANDARD = android.provider.MediaStore.Video.VideoColumns.COLOR_STANDARD;
            public static final java.lang.String COLOR_TRANSFER = android.provider.MediaStore.Video.VideoColumns.COLOR_TRANSFER;
            public static final java.lang.String DESCRIPTION = android.provider.MediaStore.Video.VideoColumns.DESCRIPTION;
            public static final java.lang.String IS_PRIVATE = android.provider.MediaStore.Video.VideoColumns.IS_PRIVATE;
            public static final java.lang.String LANGUAGE = android.provider.MediaStore.Video.VideoColumns.LANGUAGE;
            public static final java.lang.String LATITUDE = android.provider.MediaStore.Video.VideoColumns.LATITUDE;
            public static final java.lang.String LONGITUDE = android.provider.MediaStore.Video.VideoColumns.LONGITUDE;
            public static final java.lang.String MINI_THUMB_MAGIC = android.provider.MediaStore.Video.VideoColumns.MINI_THUMB_MAGIC;
            public static final java.lang.String TAGS = android.provider.MediaStore.Video.VideoColumns.TAGS;

        }
    }
}
