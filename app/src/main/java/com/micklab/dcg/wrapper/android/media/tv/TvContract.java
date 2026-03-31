// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvContract {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvContract(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvContract wrap(android.media.tv.TvContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TvContract getReal() {
        return (android.media.tv.TvContract) real;
    }

    public android.media.tv.TvContract unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildChannelLogoUri(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildChannelLogoUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildChannelLogoUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildChannelLogoUri(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildChannelUri(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildChannelUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildChannelUriForPassthroughInput(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildChannelUriForPassthroughInput(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildChannelsUriForInput(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildChannelsUriForInput(arg0));
    }

    public static java.lang.String buildInputId(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return android.media.tv.TvContract.buildInputId(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildPreviewProgramUri(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildPreviewProgramUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildPreviewProgramsUriForChannel(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildPreviewProgramsUriForChannel(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildPreviewProgramsUriForChannel(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildPreviewProgramsUriForChannel(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildProgramUri(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildProgramUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildProgramsUriForChannel(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildProgramsUriForChannel(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildProgramsUriForChannel(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildProgramsUriForChannel(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildProgramsUriForChannel(long arg0, long arg1, long arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildProgramsUriForChannel(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildProgramsUriForChannel(com.micklab.dcg.wrapper.android.net.Uri arg0, long arg1, long arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildProgramsUriForChannel(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildRecordedProgramUri(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildRecordedProgramUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildWatchNextProgramUri(long arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.buildWatchNextProgramUri(arg0));
    }

    public static boolean isChannelUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.tv.TvContract.isChannelUri(arg0 == null ? null : arg0.getReal());
    }

    public static boolean isChannelUriForPassthroughInput(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.tv.TvContract.isChannelUriForPassthroughInput(arg0 == null ? null : arg0.getReal());
    }

    public static boolean isChannelUriForTunerInput(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.tv.TvContract.isChannelUriForTunerInput(arg0 == null ? null : arg0.getReal());
    }

    public static boolean isProgramUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.tv.TvContract.isProgramUri(arg0 == null ? null : arg0.getReal());
    }

    public static boolean isRecordedProgramUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.media.tv.TvContract.isRecordedProgramUri(arg0 == null ? null : arg0.getReal());
    }

    public static void requestChannelBrowsable(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1) {
        android.media.tv.TvContract.requestChannelBrowsable(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String ACTION_INITIALIZE_PROGRAMS = android.media.tv.TvContract.ACTION_INITIALIZE_PROGRAMS;
    public static final java.lang.String ACTION_PREVIEW_PROGRAM_ADDED_TO_WATCH_NEXT = android.media.tv.TvContract.ACTION_PREVIEW_PROGRAM_ADDED_TO_WATCH_NEXT;
    public static final java.lang.String ACTION_PREVIEW_PROGRAM_BROWSABLE_DISABLED = android.media.tv.TvContract.ACTION_PREVIEW_PROGRAM_BROWSABLE_DISABLED;
    public static final java.lang.String ACTION_REQUEST_CHANNEL_BROWSABLE = android.media.tv.TvContract.ACTION_REQUEST_CHANNEL_BROWSABLE;
    public static final java.lang.String ACTION_WATCH_NEXT_PROGRAM_BROWSABLE_DISABLED = android.media.tv.TvContract.ACTION_WATCH_NEXT_PROGRAM_BROWSABLE_DISABLED;
    public static final java.lang.String AUTHORITY = android.media.tv.TvContract.AUTHORITY;
    public static final java.lang.String EXTRA_CHANNEL_ID = android.media.tv.TvContract.EXTRA_CHANNEL_ID;
    public static final java.lang.String EXTRA_PREVIEW_PROGRAM_ID = android.media.tv.TvContract.EXTRA_PREVIEW_PROGRAM_ID;
    public static final java.lang.String EXTRA_WATCH_NEXT_PROGRAM_ID = android.media.tv.TvContract.EXTRA_WATCH_NEXT_PROGRAM_ID;

    public static final class BaseTvColumns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BaseTvColumns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvContract.BaseTvColumns wrap(android.media.tv.TvContract.BaseTvColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.BaseTvColumns(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvContract.BaseTvColumns getReal() {
            return (android.media.tv.TvContract.BaseTvColumns) real;
        }

        public android.media.tv.TvContract.BaseTvColumns unwrap() {
            return getReal();
        }

        public static final java.lang.String COLUMN_PACKAGE_NAME = android.media.tv.TvContract.BaseTvColumns.COLUMN_PACKAGE_NAME;

    }
    public static final class Channels {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Channels(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvContract.Channels wrap(android.media.tv.TvContract.Channels real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.Channels(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvContract.Channels getReal() {
            return (android.media.tv.TvContract.Channels) real;
        }

        public android.media.tv.TvContract.Channels unwrap() {
            return getReal();
        }

        public static java.lang.String getVideoResolution(java.lang.String arg0) {
            return android.media.tv.TvContract.Channels.getVideoResolution(arg0);
        }

        public static final int BROADCAST_VISIBILITY_TYPE_INVISIBLE = android.media.tv.TvContract.Channels.BROADCAST_VISIBILITY_TYPE_INVISIBLE;
        public static final int BROADCAST_VISIBILITY_TYPE_NUMERIC_SELECTABLE_ONLY = android.media.tv.TvContract.Channels.BROADCAST_VISIBILITY_TYPE_NUMERIC_SELECTABLE_ONLY;
        public static final int BROADCAST_VISIBILITY_TYPE_VISIBLE = android.media.tv.TvContract.Channels.BROADCAST_VISIBILITY_TYPE_VISIBLE;
        public static final java.lang.String COLUMN_APP_LINK_COLOR = android.media.tv.TvContract.Channels.COLUMN_APP_LINK_COLOR;
        public static final java.lang.String COLUMN_APP_LINK_ICON_URI = android.media.tv.TvContract.Channels.COLUMN_APP_LINK_ICON_URI;
        public static final java.lang.String COLUMN_APP_LINK_INTENT_URI = android.media.tv.TvContract.Channels.COLUMN_APP_LINK_INTENT_URI;
        public static final java.lang.String COLUMN_APP_LINK_POSTER_ART_URI = android.media.tv.TvContract.Channels.COLUMN_APP_LINK_POSTER_ART_URI;
        public static final java.lang.String COLUMN_APP_LINK_TEXT = android.media.tv.TvContract.Channels.COLUMN_APP_LINK_TEXT;
        public static final java.lang.String COLUMN_BROADCAST_GENRE = android.media.tv.TvContract.Channels.COLUMN_BROADCAST_GENRE;
        public static final java.lang.String COLUMN_BROADCAST_VISIBILITY_TYPE = android.media.tv.TvContract.Channels.COLUMN_BROADCAST_VISIBILITY_TYPE;
        public static final java.lang.String COLUMN_BROWSABLE = android.media.tv.TvContract.Channels.COLUMN_BROWSABLE;
        public static final java.lang.String COLUMN_CHANNEL_LIST_ID = android.media.tv.TvContract.Channels.COLUMN_CHANNEL_LIST_ID;
        public static final java.lang.String COLUMN_DESCRIPTION = android.media.tv.TvContract.Channels.COLUMN_DESCRIPTION;
        public static final java.lang.String COLUMN_DISPLAY_NAME = android.media.tv.TvContract.Channels.COLUMN_DISPLAY_NAME;
        public static final java.lang.String COLUMN_DISPLAY_NUMBER = android.media.tv.TvContract.Channels.COLUMN_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_GLOBAL_CONTENT_ID = android.media.tv.TvContract.Channels.COLUMN_GLOBAL_CONTENT_ID;
        public static final java.lang.String COLUMN_INPUT_ID = android.media.tv.TvContract.Channels.COLUMN_INPUT_ID;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = android.media.tv.TvContract.Channels.COLUMN_INTERNAL_PROVIDER_DATA;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = android.media.tv.TvContract.Channels.COLUMN_INTERNAL_PROVIDER_FLAG1;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = android.media.tv.TvContract.Channels.COLUMN_INTERNAL_PROVIDER_FLAG2;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = android.media.tv.TvContract.Channels.COLUMN_INTERNAL_PROVIDER_FLAG3;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = android.media.tv.TvContract.Channels.COLUMN_INTERNAL_PROVIDER_FLAG4;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = android.media.tv.TvContract.Channels.COLUMN_INTERNAL_PROVIDER_ID;
        public static final java.lang.String COLUMN_LOCKED = android.media.tv.TvContract.Channels.COLUMN_LOCKED;
        public static final java.lang.String COLUMN_REMOTE_CONTROL_KEY_PRESET_NUMBER = android.media.tv.TvContract.Channels.COLUMN_REMOTE_CONTROL_KEY_PRESET_NUMBER;
        public static final java.lang.String COLUMN_SCRAMBLED = android.media.tv.TvContract.Channels.COLUMN_SCRAMBLED;
        public static final java.lang.String COLUMN_SEARCHABLE = android.media.tv.TvContract.Channels.COLUMN_SEARCHABLE;
        public static final java.lang.String COLUMN_SERVICE_ID = android.media.tv.TvContract.Channels.COLUMN_SERVICE_ID;
        public static final java.lang.String COLUMN_SERVICE_TYPE = android.media.tv.TvContract.Channels.COLUMN_SERVICE_TYPE;
        public static final java.lang.String COLUMN_TRANSIENT = android.media.tv.TvContract.Channels.COLUMN_TRANSIENT;
        public static final java.lang.String COLUMN_TRANSPORT_STREAM_ID = android.media.tv.TvContract.Channels.COLUMN_TRANSPORT_STREAM_ID;
        public static final java.lang.String COLUMN_TYPE = android.media.tv.TvContract.Channels.COLUMN_TYPE;
        public static final java.lang.String COLUMN_VERSION_NUMBER = android.media.tv.TvContract.Channels.COLUMN_VERSION_NUMBER;
        public static final java.lang.String COLUMN_VIDEO_FORMAT = android.media.tv.TvContract.Channels.COLUMN_VIDEO_FORMAT;
        public static final java.lang.String COLUMN_VIDEO_RESOLUTION = android.media.tv.TvContract.Channels.COLUMN_VIDEO_RESOLUTION;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.media.tv.TvContract.Channels.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.media.tv.TvContract.Channels.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.Channels.CONTENT_URI);
        public static final java.lang.String SERVICE_TYPE_AUDIO = android.media.tv.TvContract.Channels.SERVICE_TYPE_AUDIO;
        public static final java.lang.String SERVICE_TYPE_AUDIO_VIDEO = android.media.tv.TvContract.Channels.SERVICE_TYPE_AUDIO_VIDEO;
        public static final java.lang.String SERVICE_TYPE_OTHER = android.media.tv.TvContract.Channels.SERVICE_TYPE_OTHER;
        public static final java.lang.String TYPE_1SEG = android.media.tv.TvContract.Channels.TYPE_1SEG;
        public static final java.lang.String TYPE_ATSC3_T = android.media.tv.TvContract.Channels.TYPE_ATSC3_T;
        public static final java.lang.String TYPE_ATSC_C = android.media.tv.TvContract.Channels.TYPE_ATSC_C;
        public static final java.lang.String TYPE_ATSC_M_H = android.media.tv.TvContract.Channels.TYPE_ATSC_M_H;
        public static final java.lang.String TYPE_ATSC_T = android.media.tv.TvContract.Channels.TYPE_ATSC_T;
        public static final java.lang.String TYPE_CMMB = android.media.tv.TvContract.Channels.TYPE_CMMB;
        public static final java.lang.String TYPE_DTMB = android.media.tv.TvContract.Channels.TYPE_DTMB;
        public static final java.lang.String TYPE_DVB_C = android.media.tv.TvContract.Channels.TYPE_DVB_C;
        public static final java.lang.String TYPE_DVB_C2 = android.media.tv.TvContract.Channels.TYPE_DVB_C2;
        public static final java.lang.String TYPE_DVB_H = android.media.tv.TvContract.Channels.TYPE_DVB_H;
        public static final java.lang.String TYPE_DVB_S = android.media.tv.TvContract.Channels.TYPE_DVB_S;
        public static final java.lang.String TYPE_DVB_S2 = android.media.tv.TvContract.Channels.TYPE_DVB_S2;
        public static final java.lang.String TYPE_DVB_SH = android.media.tv.TvContract.Channels.TYPE_DVB_SH;
        public static final java.lang.String TYPE_DVB_T = android.media.tv.TvContract.Channels.TYPE_DVB_T;
        public static final java.lang.String TYPE_DVB_T2 = android.media.tv.TvContract.Channels.TYPE_DVB_T2;
        public static final java.lang.String TYPE_ISDB_C = android.media.tv.TvContract.Channels.TYPE_ISDB_C;
        public static final java.lang.String TYPE_ISDB_S = android.media.tv.TvContract.Channels.TYPE_ISDB_S;
        public static final java.lang.String TYPE_ISDB_S3 = android.media.tv.TvContract.Channels.TYPE_ISDB_S3;
        public static final java.lang.String TYPE_ISDB_T = android.media.tv.TvContract.Channels.TYPE_ISDB_T;
        public static final java.lang.String TYPE_ISDB_TB = android.media.tv.TvContract.Channels.TYPE_ISDB_TB;
        public static final java.lang.String TYPE_NTSC = android.media.tv.TvContract.Channels.TYPE_NTSC;
        public static final java.lang.String TYPE_OTHER = android.media.tv.TvContract.Channels.TYPE_OTHER;
        public static final java.lang.String TYPE_PAL = android.media.tv.TvContract.Channels.TYPE_PAL;
        public static final java.lang.String TYPE_PREVIEW = android.media.tv.TvContract.Channels.TYPE_PREVIEW;
        public static final java.lang.String TYPE_SECAM = android.media.tv.TvContract.Channels.TYPE_SECAM;
        public static final java.lang.String TYPE_S_DMB = android.media.tv.TvContract.Channels.TYPE_S_DMB;
        public static final java.lang.String TYPE_T_DMB = android.media.tv.TvContract.Channels.TYPE_T_DMB;
        public static final java.lang.String VIDEO_FORMAT_1080I = android.media.tv.TvContract.Channels.VIDEO_FORMAT_1080I;
        public static final java.lang.String VIDEO_FORMAT_1080P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_1080P;
        public static final java.lang.String VIDEO_FORMAT_2160P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_2160P;
        public static final java.lang.String VIDEO_FORMAT_240P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_240P;
        public static final java.lang.String VIDEO_FORMAT_360P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_360P;
        public static final java.lang.String VIDEO_FORMAT_4320P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_4320P;
        public static final java.lang.String VIDEO_FORMAT_480I = android.media.tv.TvContract.Channels.VIDEO_FORMAT_480I;
        public static final java.lang.String VIDEO_FORMAT_480P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_480P;
        public static final java.lang.String VIDEO_FORMAT_576I = android.media.tv.TvContract.Channels.VIDEO_FORMAT_576I;
        public static final java.lang.String VIDEO_FORMAT_576P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_576P;
        public static final java.lang.String VIDEO_FORMAT_720P = android.media.tv.TvContract.Channels.VIDEO_FORMAT_720P;
        public static final java.lang.String VIDEO_RESOLUTION_ED = android.media.tv.TvContract.Channels.VIDEO_RESOLUTION_ED;
        public static final java.lang.String VIDEO_RESOLUTION_FHD = android.media.tv.TvContract.Channels.VIDEO_RESOLUTION_FHD;
        public static final java.lang.String VIDEO_RESOLUTION_HD = android.media.tv.TvContract.Channels.VIDEO_RESOLUTION_HD;
        public static final java.lang.String VIDEO_RESOLUTION_SD = android.media.tv.TvContract.Channels.VIDEO_RESOLUTION_SD;
        public static final java.lang.String VIDEO_RESOLUTION_UHD = android.media.tv.TvContract.Channels.VIDEO_RESOLUTION_UHD;

        public static final class Logo {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Logo(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.tv.TvContract.Channels.Logo wrap(android.media.tv.TvContract.Channels.Logo real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.Channels.Logo(real, (__DcgwBridgeToken) null);
            }

            public android.media.tv.TvContract.Channels.Logo getReal() {
                return (android.media.tv.TvContract.Channels.Logo) real;
            }

            public android.media.tv.TvContract.Channels.Logo unwrap() {
                return getReal();
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.media.tv.TvContract.Channels.Logo.CONTENT_DIRECTORY;

        }
    }
    public static final class PreviewPrograms {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PreviewPrograms(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvContract.PreviewPrograms wrap(android.media.tv.TvContract.PreviewPrograms real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.PreviewPrograms(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvContract.PreviewPrograms getReal() {
            return (android.media.tv.TvContract.PreviewPrograms) real;
        }

        public android.media.tv.TvContract.PreviewPrograms unwrap() {
            return getReal();
        }

        public static final int ASPECT_RATIO_16_9 = android.media.tv.TvContract.PreviewPrograms.ASPECT_RATIO_16_9;
        public static final int ASPECT_RATIO_1_1 = android.media.tv.TvContract.PreviewPrograms.ASPECT_RATIO_1_1;
        public static final int ASPECT_RATIO_2_3 = android.media.tv.TvContract.PreviewPrograms.ASPECT_RATIO_2_3;
        public static final int ASPECT_RATIO_3_2 = android.media.tv.TvContract.PreviewPrograms.ASPECT_RATIO_3_2;
        public static final int ASPECT_RATIO_4_3 = android.media.tv.TvContract.PreviewPrograms.ASPECT_RATIO_4_3;
        public static final int AVAILABILITY_AVAILABLE = android.media.tv.TvContract.PreviewPrograms.AVAILABILITY_AVAILABLE;
        public static final int AVAILABILITY_FREE_WITH_SUBSCRIPTION = android.media.tv.TvContract.PreviewPrograms.AVAILABILITY_FREE_WITH_SUBSCRIPTION;
        public static final int AVAILABILITY_PAID_CONTENT = android.media.tv.TvContract.PreviewPrograms.AVAILABILITY_PAID_CONTENT;
        public static final java.lang.String COLUMN_AUDIO_LANGUAGE = android.media.tv.TvContract.PreviewPrograms.COLUMN_AUDIO_LANGUAGE;
        public static final java.lang.String COLUMN_AUTHOR = android.media.tv.TvContract.PreviewPrograms.COLUMN_AUTHOR;
        public static final java.lang.String COLUMN_AVAILABILITY = android.media.tv.TvContract.PreviewPrograms.COLUMN_AVAILABILITY;
        public static final java.lang.String COLUMN_BROWSABLE = android.media.tv.TvContract.PreviewPrograms.COLUMN_BROWSABLE;
        public static final java.lang.String COLUMN_CANONICAL_GENRE = android.media.tv.TvContract.PreviewPrograms.COLUMN_CANONICAL_GENRE;
        public static final java.lang.String COLUMN_CHANNEL_ID = android.media.tv.TvContract.PreviewPrograms.COLUMN_CHANNEL_ID;
        public static final java.lang.String COLUMN_CONTENT_ID = android.media.tv.TvContract.PreviewPrograms.COLUMN_CONTENT_ID;
        public static final java.lang.String COLUMN_CONTENT_RATING = android.media.tv.TvContract.PreviewPrograms.COLUMN_CONTENT_RATING;
        public static final java.lang.String COLUMN_DURATION_MILLIS = android.media.tv.TvContract.PreviewPrograms.COLUMN_DURATION_MILLIS;
        public static final java.lang.String COLUMN_END_TIME_UTC_MILLIS = android.media.tv.TvContract.PreviewPrograms.COLUMN_END_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = android.media.tv.TvContract.PreviewPrograms.COLUMN_EPISODE_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_EPISODE_TITLE = android.media.tv.TvContract.PreviewPrograms.COLUMN_EPISODE_TITLE;
        public static final java.lang.String COLUMN_INTENT_URI = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTENT_URI;
        public static final java.lang.String COLUMN_INTERACTION_COUNT = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERACTION_COUNT;
        public static final java.lang.String COLUMN_INTERACTION_TYPE = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERACTION_TYPE;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERNAL_PROVIDER_DATA;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERNAL_PROVIDER_FLAG1;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERNAL_PROVIDER_FLAG2;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERNAL_PROVIDER_FLAG3;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERNAL_PROVIDER_FLAG4;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = android.media.tv.TvContract.PreviewPrograms.COLUMN_INTERNAL_PROVIDER_ID;
        public static final java.lang.String COLUMN_ITEM_COUNT = android.media.tv.TvContract.PreviewPrograms.COLUMN_ITEM_COUNT;
        public static final java.lang.String COLUMN_LAST_PLAYBACK_POSITION_MILLIS = android.media.tv.TvContract.PreviewPrograms.COLUMN_LAST_PLAYBACK_POSITION_MILLIS;
        public static final java.lang.String COLUMN_LIVE = android.media.tv.TvContract.PreviewPrograms.COLUMN_LIVE;
        public static final java.lang.String COLUMN_LOGO_URI = android.media.tv.TvContract.PreviewPrograms.COLUMN_LOGO_URI;
        public static final java.lang.String COLUMN_LONG_DESCRIPTION = android.media.tv.TvContract.PreviewPrograms.COLUMN_LONG_DESCRIPTION;
        public static final java.lang.String COLUMN_OFFER_PRICE = android.media.tv.TvContract.PreviewPrograms.COLUMN_OFFER_PRICE;
        public static final java.lang.String COLUMN_POSTER_ART_ASPECT_RATIO = android.media.tv.TvContract.PreviewPrograms.COLUMN_POSTER_ART_ASPECT_RATIO;
        public static final java.lang.String COLUMN_POSTER_ART_URI = android.media.tv.TvContract.PreviewPrograms.COLUMN_POSTER_ART_URI;
        public static final java.lang.String COLUMN_PREVIEW_VIDEO_URI = android.media.tv.TvContract.PreviewPrograms.COLUMN_PREVIEW_VIDEO_URI;
        public static final java.lang.String COLUMN_RELEASE_DATE = android.media.tv.TvContract.PreviewPrograms.COLUMN_RELEASE_DATE;
        public static final java.lang.String COLUMN_REVIEW_RATING = android.media.tv.TvContract.PreviewPrograms.COLUMN_REVIEW_RATING;
        public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = android.media.tv.TvContract.PreviewPrograms.COLUMN_REVIEW_RATING_STYLE;
        public static final java.lang.String COLUMN_SEARCHABLE = android.media.tv.TvContract.PreviewPrograms.COLUMN_SEARCHABLE;
        public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = android.media.tv.TvContract.PreviewPrograms.COLUMN_SEASON_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_SEASON_TITLE = android.media.tv.TvContract.PreviewPrograms.COLUMN_SEASON_TITLE;
        public static final java.lang.String COLUMN_SERIES_ID = android.media.tv.TvContract.PreviewPrograms.COLUMN_SERIES_ID;
        public static final java.lang.String COLUMN_SHORT_DESCRIPTION = android.media.tv.TvContract.PreviewPrograms.COLUMN_SHORT_DESCRIPTION;
        public static final java.lang.String COLUMN_SPLIT_ID = android.media.tv.TvContract.PreviewPrograms.COLUMN_SPLIT_ID;
        public static final java.lang.String COLUMN_STARTING_PRICE = android.media.tv.TvContract.PreviewPrograms.COLUMN_STARTING_PRICE;
        public static final java.lang.String COLUMN_START_TIME_UTC_MILLIS = android.media.tv.TvContract.PreviewPrograms.COLUMN_START_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_THUMBNAIL_ASPECT_RATIO = android.media.tv.TvContract.PreviewPrograms.COLUMN_THUMBNAIL_ASPECT_RATIO;
        public static final java.lang.String COLUMN_THUMBNAIL_URI = android.media.tv.TvContract.PreviewPrograms.COLUMN_THUMBNAIL_URI;
        public static final java.lang.String COLUMN_TITLE = android.media.tv.TvContract.PreviewPrograms.COLUMN_TITLE;
        public static final java.lang.String COLUMN_TRANSIENT = android.media.tv.TvContract.PreviewPrograms.COLUMN_TRANSIENT;
        public static final java.lang.String COLUMN_TYPE = android.media.tv.TvContract.PreviewPrograms.COLUMN_TYPE;
        public static final java.lang.String COLUMN_VERSION_NUMBER = android.media.tv.TvContract.PreviewPrograms.COLUMN_VERSION_NUMBER;
        public static final java.lang.String COLUMN_VIDEO_HEIGHT = android.media.tv.TvContract.PreviewPrograms.COLUMN_VIDEO_HEIGHT;
        public static final java.lang.String COLUMN_VIDEO_WIDTH = android.media.tv.TvContract.PreviewPrograms.COLUMN_VIDEO_WIDTH;
        public static final java.lang.String COLUMN_WEIGHT = android.media.tv.TvContract.PreviewPrograms.COLUMN_WEIGHT;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.media.tv.TvContract.PreviewPrograms.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.media.tv.TvContract.PreviewPrograms.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.PreviewPrograms.CONTENT_URI);
        public static final int INTERACTION_TYPE_FANS = android.media.tv.TvContract.PreviewPrograms.INTERACTION_TYPE_FANS;
        public static final int INTERACTION_TYPE_FOLLOWERS = android.media.tv.TvContract.PreviewPrograms.INTERACTION_TYPE_FOLLOWERS;
        public static final int INTERACTION_TYPE_LIKES = android.media.tv.TvContract.PreviewPrograms.INTERACTION_TYPE_LIKES;
        public static final int INTERACTION_TYPE_LISTENS = android.media.tv.TvContract.PreviewPrograms.INTERACTION_TYPE_LISTENS;
        public static final int INTERACTION_TYPE_THUMBS = android.media.tv.TvContract.PreviewPrograms.INTERACTION_TYPE_THUMBS;
        public static final int INTERACTION_TYPE_VIEWERS = android.media.tv.TvContract.PreviewPrograms.INTERACTION_TYPE_VIEWERS;
        public static final int INTERACTION_TYPE_VIEWS = android.media.tv.TvContract.PreviewPrograms.INTERACTION_TYPE_VIEWS;
        public static final int REVIEW_RATING_STYLE_PERCENTAGE = android.media.tv.TvContract.PreviewPrograms.REVIEW_RATING_STYLE_PERCENTAGE;
        public static final int REVIEW_RATING_STYLE_STARS = android.media.tv.TvContract.PreviewPrograms.REVIEW_RATING_STYLE_STARS;
        public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = android.media.tv.TvContract.PreviewPrograms.REVIEW_RATING_STYLE_THUMBS_UP_DOWN;
        public static final int TYPE_ALBUM = android.media.tv.TvContract.PreviewPrograms.TYPE_ALBUM;
        public static final int TYPE_ARTIST = android.media.tv.TvContract.PreviewPrograms.TYPE_ARTIST;
        public static final int TYPE_CHANNEL = android.media.tv.TvContract.PreviewPrograms.TYPE_CHANNEL;
        public static final int TYPE_CLIP = android.media.tv.TvContract.PreviewPrograms.TYPE_CLIP;
        public static final int TYPE_EVENT = android.media.tv.TvContract.PreviewPrograms.TYPE_EVENT;
        public static final int TYPE_MOVIE = android.media.tv.TvContract.PreviewPrograms.TYPE_MOVIE;
        public static final int TYPE_PLAYLIST = android.media.tv.TvContract.PreviewPrograms.TYPE_PLAYLIST;
        public static final int TYPE_STATION = android.media.tv.TvContract.PreviewPrograms.TYPE_STATION;
        public static final int TYPE_TRACK = android.media.tv.TvContract.PreviewPrograms.TYPE_TRACK;
        public static final int TYPE_TV_EPISODE = android.media.tv.TvContract.PreviewPrograms.TYPE_TV_EPISODE;
        public static final int TYPE_TV_SEASON = android.media.tv.TvContract.PreviewPrograms.TYPE_TV_SEASON;
        public static final int TYPE_TV_SERIES = android.media.tv.TvContract.PreviewPrograms.TYPE_TV_SERIES;

    }
    public static final class Programs {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Programs(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvContract.Programs wrap(android.media.tv.TvContract.Programs real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.Programs(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvContract.Programs getReal() {
            return (android.media.tv.TvContract.Programs) real;
        }

        public android.media.tv.TvContract.Programs unwrap() {
            return getReal();
        }

        public static final java.lang.String COLUMN_AUDIO_LANGUAGE = android.media.tv.TvContract.Programs.COLUMN_AUDIO_LANGUAGE;
        public static final java.lang.String COLUMN_BROADCAST_GENRE = android.media.tv.TvContract.Programs.COLUMN_BROADCAST_GENRE;
        public static final java.lang.String COLUMN_CANONICAL_GENRE = android.media.tv.TvContract.Programs.COLUMN_CANONICAL_GENRE;
        public static final java.lang.String COLUMN_CHANNEL_ID = android.media.tv.TvContract.Programs.COLUMN_CHANNEL_ID;
        public static final java.lang.String COLUMN_CONTENT_RATING = android.media.tv.TvContract.Programs.COLUMN_CONTENT_RATING;
        public static final java.lang.String COLUMN_END_TIME_UTC_MILLIS = android.media.tv.TvContract.Programs.COLUMN_END_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = android.media.tv.TvContract.Programs.COLUMN_EPISODE_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_EPISODE_NUMBER = android.media.tv.TvContract.Programs.COLUMN_EPISODE_NUMBER;
        public static final java.lang.String COLUMN_EPISODE_TITLE = android.media.tv.TvContract.Programs.COLUMN_EPISODE_TITLE;
        public static final java.lang.String COLUMN_EVENT_ID = android.media.tv.TvContract.Programs.COLUMN_EVENT_ID;
        public static final java.lang.String COLUMN_GLOBAL_CONTENT_ID = android.media.tv.TvContract.Programs.COLUMN_GLOBAL_CONTENT_ID;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = android.media.tv.TvContract.Programs.COLUMN_INTERNAL_PROVIDER_DATA;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = android.media.tv.TvContract.Programs.COLUMN_INTERNAL_PROVIDER_FLAG1;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = android.media.tv.TvContract.Programs.COLUMN_INTERNAL_PROVIDER_FLAG2;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = android.media.tv.TvContract.Programs.COLUMN_INTERNAL_PROVIDER_FLAG3;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = android.media.tv.TvContract.Programs.COLUMN_INTERNAL_PROVIDER_FLAG4;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = android.media.tv.TvContract.Programs.COLUMN_INTERNAL_PROVIDER_ID;
        public static final java.lang.String COLUMN_LONG_DESCRIPTION = android.media.tv.TvContract.Programs.COLUMN_LONG_DESCRIPTION;
        public static final java.lang.String COLUMN_MULTI_SERIES_ID = android.media.tv.TvContract.Programs.COLUMN_MULTI_SERIES_ID;
        public static final java.lang.String COLUMN_POSTER_ART_URI = android.media.tv.TvContract.Programs.COLUMN_POSTER_ART_URI;
        public static final java.lang.String COLUMN_RECORDING_PROHIBITED = android.media.tv.TvContract.Programs.COLUMN_RECORDING_PROHIBITED;
        public static final java.lang.String COLUMN_REVIEW_RATING = android.media.tv.TvContract.Programs.COLUMN_REVIEW_RATING;
        public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = android.media.tv.TvContract.Programs.COLUMN_REVIEW_RATING_STYLE;
        public static final java.lang.String COLUMN_SCRAMBLED = android.media.tv.TvContract.Programs.COLUMN_SCRAMBLED;
        public static final java.lang.String COLUMN_SEARCHABLE = android.media.tv.TvContract.Programs.COLUMN_SEARCHABLE;
        public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = android.media.tv.TvContract.Programs.COLUMN_SEASON_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_SEASON_NUMBER = android.media.tv.TvContract.Programs.COLUMN_SEASON_NUMBER;
        public static final java.lang.String COLUMN_SEASON_TITLE = android.media.tv.TvContract.Programs.COLUMN_SEASON_TITLE;
        public static final java.lang.String COLUMN_SERIES_ID = android.media.tv.TvContract.Programs.COLUMN_SERIES_ID;
        public static final java.lang.String COLUMN_SHORT_DESCRIPTION = android.media.tv.TvContract.Programs.COLUMN_SHORT_DESCRIPTION;
        public static final java.lang.String COLUMN_SPLIT_ID = android.media.tv.TvContract.Programs.COLUMN_SPLIT_ID;
        public static final java.lang.String COLUMN_START_TIME_UTC_MILLIS = android.media.tv.TvContract.Programs.COLUMN_START_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_THUMBNAIL_URI = android.media.tv.TvContract.Programs.COLUMN_THUMBNAIL_URI;
        public static final java.lang.String COLUMN_TITLE = android.media.tv.TvContract.Programs.COLUMN_TITLE;
        public static final java.lang.String COLUMN_VERSION_NUMBER = android.media.tv.TvContract.Programs.COLUMN_VERSION_NUMBER;
        public static final java.lang.String COLUMN_VIDEO_HEIGHT = android.media.tv.TvContract.Programs.COLUMN_VIDEO_HEIGHT;
        public static final java.lang.String COLUMN_VIDEO_WIDTH = android.media.tv.TvContract.Programs.COLUMN_VIDEO_WIDTH;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.media.tv.TvContract.Programs.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.media.tv.TvContract.Programs.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.Programs.CONTENT_URI);
        public static final int REVIEW_RATING_STYLE_PERCENTAGE = android.media.tv.TvContract.Programs.REVIEW_RATING_STYLE_PERCENTAGE;
        public static final int REVIEW_RATING_STYLE_STARS = android.media.tv.TvContract.Programs.REVIEW_RATING_STYLE_STARS;
        public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = android.media.tv.TvContract.Programs.REVIEW_RATING_STYLE_THUMBS_UP_DOWN;

        public static final class Genres {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Genres(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.tv.TvContract.Programs.Genres wrap(android.media.tv.TvContract.Programs.Genres real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.Programs.Genres(real, (__DcgwBridgeToken) null);
            }

            public android.media.tv.TvContract.Programs.Genres getReal() {
                return (android.media.tv.TvContract.Programs.Genres) real;
            }

            public android.media.tv.TvContract.Programs.Genres unwrap() {
                return getReal();
            }

            public static java.lang.String[] decode(java.lang.String arg0) {
                return android.media.tv.TvContract.Programs.Genres.decode(arg0);
            }

            public static java.lang.String encode(java.lang.String... arg0) {
                return android.media.tv.TvContract.Programs.Genres.encode(arg0);
            }

            public static boolean isCanonical(java.lang.String arg0) {
                return android.media.tv.TvContract.Programs.Genres.isCanonical(arg0);
            }

            public static final java.lang.String ANIMAL_WILDLIFE = android.media.tv.TvContract.Programs.Genres.ANIMAL_WILDLIFE;
            public static final java.lang.String ARTS = android.media.tv.TvContract.Programs.Genres.ARTS;
            public static final java.lang.String COMEDY = android.media.tv.TvContract.Programs.Genres.COMEDY;
            public static final java.lang.String DRAMA = android.media.tv.TvContract.Programs.Genres.DRAMA;
            public static final java.lang.String EDUCATION = android.media.tv.TvContract.Programs.Genres.EDUCATION;
            public static final java.lang.String ENTERTAINMENT = android.media.tv.TvContract.Programs.Genres.ENTERTAINMENT;
            public static final java.lang.String FAMILY_KIDS = android.media.tv.TvContract.Programs.Genres.FAMILY_KIDS;
            public static final java.lang.String GAMING = android.media.tv.TvContract.Programs.Genres.GAMING;
            public static final java.lang.String LIFE_STYLE = android.media.tv.TvContract.Programs.Genres.LIFE_STYLE;
            public static final java.lang.String MOVIES = android.media.tv.TvContract.Programs.Genres.MOVIES;
            public static final java.lang.String MUSIC = android.media.tv.TvContract.Programs.Genres.MUSIC;
            public static final java.lang.String NEWS = android.media.tv.TvContract.Programs.Genres.NEWS;
            public static final java.lang.String PREMIER = android.media.tv.TvContract.Programs.Genres.PREMIER;
            public static final java.lang.String SHOPPING = android.media.tv.TvContract.Programs.Genres.SHOPPING;
            public static final java.lang.String SPORTS = android.media.tv.TvContract.Programs.Genres.SPORTS;
            public static final java.lang.String TECH_SCIENCE = android.media.tv.TvContract.Programs.Genres.TECH_SCIENCE;
            public static final java.lang.String TRAVEL = android.media.tv.TvContract.Programs.Genres.TRAVEL;

        }
    }
    public static final class RecordedPrograms {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RecordedPrograms(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvContract.RecordedPrograms wrap(android.media.tv.TvContract.RecordedPrograms real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.RecordedPrograms(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvContract.RecordedPrograms getReal() {
            return (android.media.tv.TvContract.RecordedPrograms) real;
        }

        public android.media.tv.TvContract.RecordedPrograms unwrap() {
            return getReal();
        }

        public static final java.lang.String COLUMN_AUDIO_LANGUAGE = android.media.tv.TvContract.RecordedPrograms.COLUMN_AUDIO_LANGUAGE;
        public static final java.lang.String COLUMN_BROADCAST_GENRE = android.media.tv.TvContract.RecordedPrograms.COLUMN_BROADCAST_GENRE;
        public static final java.lang.String COLUMN_CANONICAL_GENRE = android.media.tv.TvContract.RecordedPrograms.COLUMN_CANONICAL_GENRE;
        public static final java.lang.String COLUMN_CHANNEL_ID = android.media.tv.TvContract.RecordedPrograms.COLUMN_CHANNEL_ID;
        public static final java.lang.String COLUMN_CONTENT_RATING = android.media.tv.TvContract.RecordedPrograms.COLUMN_CONTENT_RATING;
        public static final java.lang.String COLUMN_END_TIME_UTC_MILLIS = android.media.tv.TvContract.RecordedPrograms.COLUMN_END_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = android.media.tv.TvContract.RecordedPrograms.COLUMN_EPISODE_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_EPISODE_TITLE = android.media.tv.TvContract.RecordedPrograms.COLUMN_EPISODE_TITLE;
        public static final java.lang.String COLUMN_INPUT_ID = android.media.tv.TvContract.RecordedPrograms.COLUMN_INPUT_ID;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = android.media.tv.TvContract.RecordedPrograms.COLUMN_INTERNAL_PROVIDER_DATA;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = android.media.tv.TvContract.RecordedPrograms.COLUMN_INTERNAL_PROVIDER_FLAG1;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = android.media.tv.TvContract.RecordedPrograms.COLUMN_INTERNAL_PROVIDER_FLAG2;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = android.media.tv.TvContract.RecordedPrograms.COLUMN_INTERNAL_PROVIDER_FLAG3;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = android.media.tv.TvContract.RecordedPrograms.COLUMN_INTERNAL_PROVIDER_FLAG4;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = android.media.tv.TvContract.RecordedPrograms.COLUMN_INTERNAL_PROVIDER_ID;
        public static final java.lang.String COLUMN_LONG_DESCRIPTION = android.media.tv.TvContract.RecordedPrograms.COLUMN_LONG_DESCRIPTION;
        public static final java.lang.String COLUMN_MULTI_SERIES_ID = android.media.tv.TvContract.RecordedPrograms.COLUMN_MULTI_SERIES_ID;
        public static final java.lang.String COLUMN_POSTER_ART_URI = android.media.tv.TvContract.RecordedPrograms.COLUMN_POSTER_ART_URI;
        public static final java.lang.String COLUMN_RECORDING_DATA_BYTES = android.media.tv.TvContract.RecordedPrograms.COLUMN_RECORDING_DATA_BYTES;
        public static final java.lang.String COLUMN_RECORDING_DATA_URI = android.media.tv.TvContract.RecordedPrograms.COLUMN_RECORDING_DATA_URI;
        public static final java.lang.String COLUMN_RECORDING_DURATION_MILLIS = android.media.tv.TvContract.RecordedPrograms.COLUMN_RECORDING_DURATION_MILLIS;
        public static final java.lang.String COLUMN_RECORDING_EXPIRE_TIME_UTC_MILLIS = android.media.tv.TvContract.RecordedPrograms.COLUMN_RECORDING_EXPIRE_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_REVIEW_RATING = android.media.tv.TvContract.RecordedPrograms.COLUMN_REVIEW_RATING;
        public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = android.media.tv.TvContract.RecordedPrograms.COLUMN_REVIEW_RATING_STYLE;
        public static final java.lang.String COLUMN_SEARCHABLE = android.media.tv.TvContract.RecordedPrograms.COLUMN_SEARCHABLE;
        public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = android.media.tv.TvContract.RecordedPrograms.COLUMN_SEASON_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_SEASON_TITLE = android.media.tv.TvContract.RecordedPrograms.COLUMN_SEASON_TITLE;
        public static final java.lang.String COLUMN_SERIES_ID = android.media.tv.TvContract.RecordedPrograms.COLUMN_SERIES_ID;
        public static final java.lang.String COLUMN_SHORT_DESCRIPTION = android.media.tv.TvContract.RecordedPrograms.COLUMN_SHORT_DESCRIPTION;
        public static final java.lang.String COLUMN_SPLIT_ID = android.media.tv.TvContract.RecordedPrograms.COLUMN_SPLIT_ID;
        public static final java.lang.String COLUMN_START_TIME_UTC_MILLIS = android.media.tv.TvContract.RecordedPrograms.COLUMN_START_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_THUMBNAIL_URI = android.media.tv.TvContract.RecordedPrograms.COLUMN_THUMBNAIL_URI;
        public static final java.lang.String COLUMN_TITLE = android.media.tv.TvContract.RecordedPrograms.COLUMN_TITLE;
        public static final java.lang.String COLUMN_VERSION_NUMBER = android.media.tv.TvContract.RecordedPrograms.COLUMN_VERSION_NUMBER;
        public static final java.lang.String COLUMN_VIDEO_HEIGHT = android.media.tv.TvContract.RecordedPrograms.COLUMN_VIDEO_HEIGHT;
        public static final java.lang.String COLUMN_VIDEO_WIDTH = android.media.tv.TvContract.RecordedPrograms.COLUMN_VIDEO_WIDTH;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.media.tv.TvContract.RecordedPrograms.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.media.tv.TvContract.RecordedPrograms.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.RecordedPrograms.CONTENT_URI);
        public static final int REVIEW_RATING_STYLE_PERCENTAGE = android.media.tv.TvContract.RecordedPrograms.REVIEW_RATING_STYLE_PERCENTAGE;
        public static final int REVIEW_RATING_STYLE_STARS = android.media.tv.TvContract.RecordedPrograms.REVIEW_RATING_STYLE_STARS;
        public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = android.media.tv.TvContract.RecordedPrograms.REVIEW_RATING_STYLE_THUMBS_UP_DOWN;

    }
    public static final class WatchNextPrograms {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WatchNextPrograms(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvContract.WatchNextPrograms wrap(android.media.tv.TvContract.WatchNextPrograms real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvContract.WatchNextPrograms(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvContract.WatchNextPrograms getReal() {
            return (android.media.tv.TvContract.WatchNextPrograms) real;
        }

        public android.media.tv.TvContract.WatchNextPrograms unwrap() {
            return getReal();
        }

        public static final int ASPECT_RATIO_16_9 = android.media.tv.TvContract.WatchNextPrograms.ASPECT_RATIO_16_9;
        public static final int ASPECT_RATIO_1_1 = android.media.tv.TvContract.WatchNextPrograms.ASPECT_RATIO_1_1;
        public static final int ASPECT_RATIO_2_3 = android.media.tv.TvContract.WatchNextPrograms.ASPECT_RATIO_2_3;
        public static final int ASPECT_RATIO_3_2 = android.media.tv.TvContract.WatchNextPrograms.ASPECT_RATIO_3_2;
        public static final int ASPECT_RATIO_4_3 = android.media.tv.TvContract.WatchNextPrograms.ASPECT_RATIO_4_3;
        public static final int AVAILABILITY_AVAILABLE = android.media.tv.TvContract.WatchNextPrograms.AVAILABILITY_AVAILABLE;
        public static final int AVAILABILITY_FREE_WITH_SUBSCRIPTION = android.media.tv.TvContract.WatchNextPrograms.AVAILABILITY_FREE_WITH_SUBSCRIPTION;
        public static final int AVAILABILITY_PAID_CONTENT = android.media.tv.TvContract.WatchNextPrograms.AVAILABILITY_PAID_CONTENT;
        public static final java.lang.String COLUMN_AUDIO_LANGUAGE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_AUDIO_LANGUAGE;
        public static final java.lang.String COLUMN_AUTHOR = android.media.tv.TvContract.WatchNextPrograms.COLUMN_AUTHOR;
        public static final java.lang.String COLUMN_AVAILABILITY = android.media.tv.TvContract.WatchNextPrograms.COLUMN_AVAILABILITY;
        public static final java.lang.String COLUMN_BROWSABLE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_BROWSABLE;
        public static final java.lang.String COLUMN_CANONICAL_GENRE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_CANONICAL_GENRE;
        public static final java.lang.String COLUMN_CONTENT_ID = android.media.tv.TvContract.WatchNextPrograms.COLUMN_CONTENT_ID;
        public static final java.lang.String COLUMN_CONTENT_RATING = android.media.tv.TvContract.WatchNextPrograms.COLUMN_CONTENT_RATING;
        public static final java.lang.String COLUMN_DURATION_MILLIS = android.media.tv.TvContract.WatchNextPrograms.COLUMN_DURATION_MILLIS;
        public static final java.lang.String COLUMN_END_TIME_UTC_MILLIS = android.media.tv.TvContract.WatchNextPrograms.COLUMN_END_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_EPISODE_DISPLAY_NUMBER = android.media.tv.TvContract.WatchNextPrograms.COLUMN_EPISODE_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_EPISODE_TITLE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_EPISODE_TITLE;
        public static final java.lang.String COLUMN_INTENT_URI = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTENT_URI;
        public static final java.lang.String COLUMN_INTERACTION_COUNT = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERACTION_COUNT;
        public static final java.lang.String COLUMN_INTERACTION_TYPE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERACTION_TYPE;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_DATA = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERNAL_PROVIDER_DATA;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG1 = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERNAL_PROVIDER_FLAG1;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG2 = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERNAL_PROVIDER_FLAG2;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG3 = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERNAL_PROVIDER_FLAG3;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_FLAG4 = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERNAL_PROVIDER_FLAG4;
        public static final java.lang.String COLUMN_INTERNAL_PROVIDER_ID = android.media.tv.TvContract.WatchNextPrograms.COLUMN_INTERNAL_PROVIDER_ID;
        public static final java.lang.String COLUMN_ITEM_COUNT = android.media.tv.TvContract.WatchNextPrograms.COLUMN_ITEM_COUNT;
        public static final java.lang.String COLUMN_LAST_ENGAGEMENT_TIME_UTC_MILLIS = android.media.tv.TvContract.WatchNextPrograms.COLUMN_LAST_ENGAGEMENT_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_LAST_PLAYBACK_POSITION_MILLIS = android.media.tv.TvContract.WatchNextPrograms.COLUMN_LAST_PLAYBACK_POSITION_MILLIS;
        public static final java.lang.String COLUMN_LIVE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_LIVE;
        public static final java.lang.String COLUMN_LOGO_URI = android.media.tv.TvContract.WatchNextPrograms.COLUMN_LOGO_URI;
        public static final java.lang.String COLUMN_LONG_DESCRIPTION = android.media.tv.TvContract.WatchNextPrograms.COLUMN_LONG_DESCRIPTION;
        public static final java.lang.String COLUMN_OFFER_PRICE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_OFFER_PRICE;
        public static final java.lang.String COLUMN_POSTER_ART_ASPECT_RATIO = android.media.tv.TvContract.WatchNextPrograms.COLUMN_POSTER_ART_ASPECT_RATIO;
        public static final java.lang.String COLUMN_POSTER_ART_URI = android.media.tv.TvContract.WatchNextPrograms.COLUMN_POSTER_ART_URI;
        public static final java.lang.String COLUMN_PREVIEW_VIDEO_URI = android.media.tv.TvContract.WatchNextPrograms.COLUMN_PREVIEW_VIDEO_URI;
        public static final java.lang.String COLUMN_RELEASE_DATE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_RELEASE_DATE;
        public static final java.lang.String COLUMN_REVIEW_RATING = android.media.tv.TvContract.WatchNextPrograms.COLUMN_REVIEW_RATING;
        public static final java.lang.String COLUMN_REVIEW_RATING_STYLE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_REVIEW_RATING_STYLE;
        public static final java.lang.String COLUMN_SEARCHABLE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_SEARCHABLE;
        public static final java.lang.String COLUMN_SEASON_DISPLAY_NUMBER = android.media.tv.TvContract.WatchNextPrograms.COLUMN_SEASON_DISPLAY_NUMBER;
        public static final java.lang.String COLUMN_SEASON_TITLE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_SEASON_TITLE;
        public static final java.lang.String COLUMN_SERIES_ID = android.media.tv.TvContract.WatchNextPrograms.COLUMN_SERIES_ID;
        public static final java.lang.String COLUMN_SHORT_DESCRIPTION = android.media.tv.TvContract.WatchNextPrograms.COLUMN_SHORT_DESCRIPTION;
        public static final java.lang.String COLUMN_SPLIT_ID = android.media.tv.TvContract.WatchNextPrograms.COLUMN_SPLIT_ID;
        public static final java.lang.String COLUMN_STARTING_PRICE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_STARTING_PRICE;
        public static final java.lang.String COLUMN_START_TIME_UTC_MILLIS = android.media.tv.TvContract.WatchNextPrograms.COLUMN_START_TIME_UTC_MILLIS;
        public static final java.lang.String COLUMN_THUMBNAIL_ASPECT_RATIO = android.media.tv.TvContract.WatchNextPrograms.COLUMN_THUMBNAIL_ASPECT_RATIO;
        public static final java.lang.String COLUMN_THUMBNAIL_URI = android.media.tv.TvContract.WatchNextPrograms.COLUMN_THUMBNAIL_URI;
        public static final java.lang.String COLUMN_TITLE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_TITLE;
        public static final java.lang.String COLUMN_TRANSIENT = android.media.tv.TvContract.WatchNextPrograms.COLUMN_TRANSIENT;
        public static final java.lang.String COLUMN_TYPE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_TYPE;
        public static final java.lang.String COLUMN_VERSION_NUMBER = android.media.tv.TvContract.WatchNextPrograms.COLUMN_VERSION_NUMBER;
        public static final java.lang.String COLUMN_VIDEO_HEIGHT = android.media.tv.TvContract.WatchNextPrograms.COLUMN_VIDEO_HEIGHT;
        public static final java.lang.String COLUMN_VIDEO_WIDTH = android.media.tv.TvContract.WatchNextPrograms.COLUMN_VIDEO_WIDTH;
        public static final java.lang.String COLUMN_WATCH_NEXT_TYPE = android.media.tv.TvContract.WatchNextPrograms.COLUMN_WATCH_NEXT_TYPE;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.media.tv.TvContract.WatchNextPrograms.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.media.tv.TvContract.WatchNextPrograms.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.media.tv.TvContract.WatchNextPrograms.CONTENT_URI);
        public static final int INTERACTION_TYPE_FANS = android.media.tv.TvContract.WatchNextPrograms.INTERACTION_TYPE_FANS;
        public static final int INTERACTION_TYPE_FOLLOWERS = android.media.tv.TvContract.WatchNextPrograms.INTERACTION_TYPE_FOLLOWERS;
        public static final int INTERACTION_TYPE_LIKES = android.media.tv.TvContract.WatchNextPrograms.INTERACTION_TYPE_LIKES;
        public static final int INTERACTION_TYPE_LISTENS = android.media.tv.TvContract.WatchNextPrograms.INTERACTION_TYPE_LISTENS;
        public static final int INTERACTION_TYPE_THUMBS = android.media.tv.TvContract.WatchNextPrograms.INTERACTION_TYPE_THUMBS;
        public static final int INTERACTION_TYPE_VIEWERS = android.media.tv.TvContract.WatchNextPrograms.INTERACTION_TYPE_VIEWERS;
        public static final int INTERACTION_TYPE_VIEWS = android.media.tv.TvContract.WatchNextPrograms.INTERACTION_TYPE_VIEWS;
        public static final int REVIEW_RATING_STYLE_PERCENTAGE = android.media.tv.TvContract.WatchNextPrograms.REVIEW_RATING_STYLE_PERCENTAGE;
        public static final int REVIEW_RATING_STYLE_STARS = android.media.tv.TvContract.WatchNextPrograms.REVIEW_RATING_STYLE_STARS;
        public static final int REVIEW_RATING_STYLE_THUMBS_UP_DOWN = android.media.tv.TvContract.WatchNextPrograms.REVIEW_RATING_STYLE_THUMBS_UP_DOWN;
        public static final int TYPE_ALBUM = android.media.tv.TvContract.WatchNextPrograms.TYPE_ALBUM;
        public static final int TYPE_ARTIST = android.media.tv.TvContract.WatchNextPrograms.TYPE_ARTIST;
        public static final int TYPE_CHANNEL = android.media.tv.TvContract.WatchNextPrograms.TYPE_CHANNEL;
        public static final int TYPE_CLIP = android.media.tv.TvContract.WatchNextPrograms.TYPE_CLIP;
        public static final int TYPE_EVENT = android.media.tv.TvContract.WatchNextPrograms.TYPE_EVENT;
        public static final int TYPE_MOVIE = android.media.tv.TvContract.WatchNextPrograms.TYPE_MOVIE;
        public static final int TYPE_PLAYLIST = android.media.tv.TvContract.WatchNextPrograms.TYPE_PLAYLIST;
        public static final int TYPE_STATION = android.media.tv.TvContract.WatchNextPrograms.TYPE_STATION;
        public static final int TYPE_TRACK = android.media.tv.TvContract.WatchNextPrograms.TYPE_TRACK;
        public static final int TYPE_TV_EPISODE = android.media.tv.TvContract.WatchNextPrograms.TYPE_TV_EPISODE;
        public static final int TYPE_TV_SEASON = android.media.tv.TvContract.WatchNextPrograms.TYPE_TV_SEASON;
        public static final int TYPE_TV_SERIES = android.media.tv.TvContract.WatchNextPrograms.TYPE_TV_SERIES;
        public static final int WATCH_NEXT_TYPE_CONTINUE = android.media.tv.TvContract.WatchNextPrograms.WATCH_NEXT_TYPE_CONTINUE;
        public static final int WATCH_NEXT_TYPE_NEW = android.media.tv.TvContract.WatchNextPrograms.WATCH_NEXT_TYPE_NEW;
        public static final int WATCH_NEXT_TYPE_NEXT = android.media.tv.TvContract.WatchNextPrograms.WATCH_NEXT_TYPE_NEXT;
        public static final int WATCH_NEXT_TYPE_WATCHLIST = android.media.tv.TvContract.WatchNextPrograms.WATCH_NEXT_TYPE_WATCHLIST;

    }
}
