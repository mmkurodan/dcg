// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class VoicemailContract {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VoicemailContract(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.VoicemailContract wrap(android.provider.VoicemailContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.VoicemailContract(real, (__DcgwBridgeToken) null);
    }

    public android.provider.VoicemailContract getReal() {
        return (android.provider.VoicemailContract) real;
    }

    public android.provider.VoicemailContract unwrap() {
        return getReal();
    }

    public static final java.lang.String ACTION_FETCH_VOICEMAIL = android.provider.VoicemailContract.ACTION_FETCH_VOICEMAIL;
    public static final java.lang.String ACTION_NEW_VOICEMAIL = android.provider.VoicemailContract.ACTION_NEW_VOICEMAIL;
    public static final java.lang.String ACTION_SYNC_VOICEMAIL = android.provider.VoicemailContract.ACTION_SYNC_VOICEMAIL;
    public static final java.lang.String AUTHORITY = android.provider.VoicemailContract.AUTHORITY;
    public static final java.lang.String EXTRA_PHONE_ACCOUNT_HANDLE = android.provider.VoicemailContract.EXTRA_PHONE_ACCOUNT_HANDLE;
    public static final java.lang.String EXTRA_SELF_CHANGE = android.provider.VoicemailContract.EXTRA_SELF_CHANGE;
    public static final java.lang.String PARAM_KEY_SOURCE_PACKAGE = android.provider.VoicemailContract.PARAM_KEY_SOURCE_PACKAGE;

    public static final class Status {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Status(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.VoicemailContract.Status wrap(android.provider.VoicemailContract.Status real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.VoicemailContract.Status(real, (__DcgwBridgeToken) null);
        }

        public android.provider.VoicemailContract.Status getReal() {
            return (android.provider.VoicemailContract.Status) real;
        }

        public android.provider.VoicemailContract.Status unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.net.Uri buildSourceUri(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.VoicemailContract.Status.buildSourceUri(arg0));
        }

        public static final java.lang.String CONFIGURATION_STATE = android.provider.VoicemailContract.Status.CONFIGURATION_STATE;
        public static final int CONFIGURATION_STATE_CAN_BE_CONFIGURED = android.provider.VoicemailContract.Status.CONFIGURATION_STATE_CAN_BE_CONFIGURED;
        public static final int CONFIGURATION_STATE_CONFIGURING = android.provider.VoicemailContract.Status.CONFIGURATION_STATE_CONFIGURING;
        public static final int CONFIGURATION_STATE_DISABLED = android.provider.VoicemailContract.Status.CONFIGURATION_STATE_DISABLED;
        public static final int CONFIGURATION_STATE_FAILED = android.provider.VoicemailContract.Status.CONFIGURATION_STATE_FAILED;
        public static final int CONFIGURATION_STATE_NOT_CONFIGURED = android.provider.VoicemailContract.Status.CONFIGURATION_STATE_NOT_CONFIGURED;
        public static final int CONFIGURATION_STATE_OK = android.provider.VoicemailContract.Status.CONFIGURATION_STATE_OK;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.VoicemailContract.Status.CONTENT_URI);
        public static final java.lang.String DATA_CHANNEL_STATE = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE;
        public static final int DATA_CHANNEL_STATE_BAD_CONFIGURATION = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE_BAD_CONFIGURATION;
        public static final int DATA_CHANNEL_STATE_COMMUNICATION_ERROR = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE_COMMUNICATION_ERROR;
        public static final int DATA_CHANNEL_STATE_NO_CONNECTION = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE_NO_CONNECTION;
        public static final int DATA_CHANNEL_STATE_NO_CONNECTION_CELLULAR_REQUIRED = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE_NO_CONNECTION_CELLULAR_REQUIRED;
        public static final int DATA_CHANNEL_STATE_OK = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE_OK;
        public static final int DATA_CHANNEL_STATE_SERVER_CONNECTION_ERROR = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE_SERVER_CONNECTION_ERROR;
        public static final int DATA_CHANNEL_STATE_SERVER_ERROR = android.provider.VoicemailContract.Status.DATA_CHANNEL_STATE_SERVER_ERROR;
        public static final java.lang.String DIR_TYPE = android.provider.VoicemailContract.Status.DIR_TYPE;
        public static final java.lang.String ITEM_TYPE = android.provider.VoicemailContract.Status.ITEM_TYPE;
        public static final java.lang.String NOTIFICATION_CHANNEL_STATE = android.provider.VoicemailContract.Status.NOTIFICATION_CHANNEL_STATE;
        public static final int NOTIFICATION_CHANNEL_STATE_MESSAGE_WAITING = android.provider.VoicemailContract.Status.NOTIFICATION_CHANNEL_STATE_MESSAGE_WAITING;
        public static final int NOTIFICATION_CHANNEL_STATE_NO_CONNECTION = android.provider.VoicemailContract.Status.NOTIFICATION_CHANNEL_STATE_NO_CONNECTION;
        public static final int NOTIFICATION_CHANNEL_STATE_OK = android.provider.VoicemailContract.Status.NOTIFICATION_CHANNEL_STATE_OK;
        public static final java.lang.String PHONE_ACCOUNT_COMPONENT_NAME = android.provider.VoicemailContract.Status.PHONE_ACCOUNT_COMPONENT_NAME;
        public static final java.lang.String PHONE_ACCOUNT_ID = android.provider.VoicemailContract.Status.PHONE_ACCOUNT_ID;
        public static final java.lang.String QUOTA_OCCUPIED = android.provider.VoicemailContract.Status.QUOTA_OCCUPIED;
        public static final java.lang.String QUOTA_TOTAL = android.provider.VoicemailContract.Status.QUOTA_TOTAL;
        public static final int QUOTA_UNAVAILABLE = android.provider.VoicemailContract.Status.QUOTA_UNAVAILABLE;
        public static final java.lang.String SETTINGS_URI = android.provider.VoicemailContract.Status.SETTINGS_URI;
        public static final java.lang.String SOURCE_PACKAGE = android.provider.VoicemailContract.Status.SOURCE_PACKAGE;
        public static final java.lang.String SOURCE_TYPE = android.provider.VoicemailContract.Status.SOURCE_TYPE;
        public static final java.lang.String VOICEMAIL_ACCESS_URI = android.provider.VoicemailContract.Status.VOICEMAIL_ACCESS_URI;

    }
    public static final class Voicemails {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Voicemails(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.VoicemailContract.Voicemails wrap(android.provider.VoicemailContract.Voicemails real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.VoicemailContract.Voicemails(real, (__DcgwBridgeToken) null);
        }

        public android.provider.VoicemailContract.Voicemails getReal() {
            return (android.provider.VoicemailContract.Voicemails) real;
        }

        public android.provider.VoicemailContract.Voicemails unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.net.Uri buildSourceUri(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.VoicemailContract.Voicemails.buildSourceUri(arg0));
        }

        public static final java.lang.String ARCHIVED = android.provider.VoicemailContract.Voicemails.ARCHIVED;
        public static final java.lang.String BACKED_UP = android.provider.VoicemailContract.Voicemails.BACKED_UP;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.VoicemailContract.Voicemails.CONTENT_URI);
        public static final java.lang.String DATE = android.provider.VoicemailContract.Voicemails.DATE;
        public static final java.lang.String DELETED = android.provider.VoicemailContract.Voicemails.DELETED;
        public static final java.lang.String DIRTY = android.provider.VoicemailContract.Voicemails.DIRTY;
        public static final int DIRTY_RETAIN = android.provider.VoicemailContract.Voicemails.DIRTY_RETAIN;
        public static final java.lang.String DIR_TYPE = android.provider.VoicemailContract.Voicemails.DIR_TYPE;
        public static final java.lang.String DURATION = android.provider.VoicemailContract.Voicemails.DURATION;
        public static final java.lang.String HAS_CONTENT = android.provider.VoicemailContract.Voicemails.HAS_CONTENT;
        public static final java.lang.String IS_OMTP_VOICEMAIL = android.provider.VoicemailContract.Voicemails.IS_OMTP_VOICEMAIL;
        public static final java.lang.String IS_READ = android.provider.VoicemailContract.Voicemails.IS_READ;
        public static final java.lang.String ITEM_TYPE = android.provider.VoicemailContract.Voicemails.ITEM_TYPE;
        public static final java.lang.String LAST_MODIFIED = android.provider.VoicemailContract.Voicemails.LAST_MODIFIED;
        public static final java.lang.String MIME_TYPE = android.provider.VoicemailContract.Voicemails.MIME_TYPE;
        public static final java.lang.String NEW = android.provider.VoicemailContract.Voicemails.NEW;
        public static final java.lang.String NUMBER = android.provider.VoicemailContract.Voicemails.NUMBER;
        public static final java.lang.String PHONE_ACCOUNT_COMPONENT_NAME = android.provider.VoicemailContract.Voicemails.PHONE_ACCOUNT_COMPONENT_NAME;
        public static final java.lang.String PHONE_ACCOUNT_ID = android.provider.VoicemailContract.Voicemails.PHONE_ACCOUNT_ID;
        public static final java.lang.String RESTORED = android.provider.VoicemailContract.Voicemails.RESTORED;
        public static final java.lang.String SOURCE_DATA = android.provider.VoicemailContract.Voicemails.SOURCE_DATA;
        public static final java.lang.String SOURCE_PACKAGE = android.provider.VoicemailContract.Voicemails.SOURCE_PACKAGE;
        public static final java.lang.String TRANSCRIPTION = android.provider.VoicemailContract.Voicemails.TRANSCRIPTION;

    }
}
