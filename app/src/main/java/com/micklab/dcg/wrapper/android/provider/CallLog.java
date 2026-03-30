// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class CallLog {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallLog(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.CallLog wrap(android.provider.CallLog real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CallLog(real, (__DcgwBridgeToken) null);
    }

    public android.provider.CallLog getReal() {
        return (android.provider.CallLog) real;
    }

    public android.provider.CallLog unwrap() {
        return getReal();
    }

    public CallLog() {
        this(new android.provider.CallLog(), (__DcgwBridgeToken) null);
    }

    public static final java.lang.String AUTHORITY = android.provider.CallLog.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CallLog.CONTENT_URI);

    public static final class Calls {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Calls(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CallLog.Calls wrap(android.provider.CallLog.Calls real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CallLog.Calls(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CallLog.Calls getReal() {
            return (android.provider.CallLog.Calls) real;
        }

        public android.provider.CallLog.Calls unwrap() {
            return getReal();
        }

        public Calls() {
            this(new android.provider.CallLog.Calls(), (__DcgwBridgeToken) null);
        }

        public static java.lang.String getLastOutgoingCall(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return android.provider.CallLog.Calls.getLastOutgoingCall(arg0 == null ? null : arg0.getReal());
        }

        public static final int ANSWERED_EXTERNALLY_TYPE = android.provider.CallLog.Calls.ANSWERED_EXTERNALLY_TYPE;
        public static final java.lang.String ASSERTED_DISPLAY_NAME = android.provider.CallLog.Calls.ASSERTED_DISPLAY_NAME;
        public static final long AUTO_MISSED_EMERGENCY_CALL = android.provider.CallLog.Calls.AUTO_MISSED_EMERGENCY_CALL;
        public static final long AUTO_MISSED_MAXIMUM_DIALING = android.provider.CallLog.Calls.AUTO_MISSED_MAXIMUM_DIALING;
        public static final long AUTO_MISSED_MAXIMUM_RINGING = android.provider.CallLog.Calls.AUTO_MISSED_MAXIMUM_RINGING;
        public static final int BLOCKED_TYPE = android.provider.CallLog.Calls.BLOCKED_TYPE;
        public static final java.lang.String BLOCK_REASON = android.provider.CallLog.Calls.BLOCK_REASON;
        public static final int BLOCK_REASON_BLOCKED_NUMBER = android.provider.CallLog.Calls.BLOCK_REASON_BLOCKED_NUMBER;
        public static final int BLOCK_REASON_CALL_SCREENING_SERVICE = android.provider.CallLog.Calls.BLOCK_REASON_CALL_SCREENING_SERVICE;
        public static final int BLOCK_REASON_DIRECT_TO_VOICEMAIL = android.provider.CallLog.Calls.BLOCK_REASON_DIRECT_TO_VOICEMAIL;
        public static final int BLOCK_REASON_NOT_BLOCKED = android.provider.CallLog.Calls.BLOCK_REASON_NOT_BLOCKED;
        public static final int BLOCK_REASON_NOT_IN_CONTACTS = android.provider.CallLog.Calls.BLOCK_REASON_NOT_IN_CONTACTS;
        public static final int BLOCK_REASON_PAY_PHONE = android.provider.CallLog.Calls.BLOCK_REASON_PAY_PHONE;
        public static final int BLOCK_REASON_RESTRICTED_NUMBER = android.provider.CallLog.Calls.BLOCK_REASON_RESTRICTED_NUMBER;
        public static final int BLOCK_REASON_UNKNOWN_NUMBER = android.provider.CallLog.Calls.BLOCK_REASON_UNKNOWN_NUMBER;
        public static final java.lang.String CACHED_FORMATTED_NUMBER = android.provider.CallLog.Calls.CACHED_FORMATTED_NUMBER;
        public static final java.lang.String CACHED_LOOKUP_URI = android.provider.CallLog.Calls.CACHED_LOOKUP_URI;
        public static final java.lang.String CACHED_MATCHED_NUMBER = android.provider.CallLog.Calls.CACHED_MATCHED_NUMBER;
        public static final java.lang.String CACHED_NAME = android.provider.CallLog.Calls.CACHED_NAME;
        public static final java.lang.String CACHED_NORMALIZED_NUMBER = android.provider.CallLog.Calls.CACHED_NORMALIZED_NUMBER;
        public static final java.lang.String CACHED_NUMBER_LABEL = android.provider.CallLog.Calls.CACHED_NUMBER_LABEL;
        public static final java.lang.String CACHED_NUMBER_TYPE = android.provider.CallLog.Calls.CACHED_NUMBER_TYPE;
        public static final java.lang.String CACHED_PHOTO_ID = android.provider.CallLog.Calls.CACHED_PHOTO_ID;
        public static final java.lang.String CACHED_PHOTO_URI = android.provider.CallLog.Calls.CACHED_PHOTO_URI;
        public static final java.lang.String CALL_SCREENING_APP_NAME = android.provider.CallLog.Calls.CALL_SCREENING_APP_NAME;
        public static final java.lang.String CALL_SCREENING_COMPONENT_NAME = android.provider.CallLog.Calls.CALL_SCREENING_COMPONENT_NAME;
        public static final java.lang.String COMPOSER_PHOTO_URI = android.provider.CallLog.Calls.COMPOSER_PHOTO_URI;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CallLog.Calls.CONTENT_FILTER_URI);
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.CallLog.Calls.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.CallLog.Calls.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CallLog.Calls.CONTENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI_WITH_VOICEMAIL = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL);
        public static final java.lang.String COUNTRY_ISO = android.provider.CallLog.Calls.COUNTRY_ISO;
        public static final java.lang.String DATA_USAGE = android.provider.CallLog.Calls.DATA_USAGE;
        public static final java.lang.String DATE = android.provider.CallLog.Calls.DATE;
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.CallLog.Calls.DEFAULT_SORT_ORDER;
        public static final java.lang.String DURATION = android.provider.CallLog.Calls.DURATION;
        public static final java.lang.String EXTRA_CALL_TYPE_FILTER = android.provider.CallLog.Calls.EXTRA_CALL_TYPE_FILTER;
        public static final java.lang.String FEATURES = android.provider.CallLog.Calls.FEATURES;
        public static final int FEATURES_ASSISTED_DIALING_USED = android.provider.CallLog.Calls.FEATURES_ASSISTED_DIALING_USED;
        public static final int FEATURES_HD_CALL = android.provider.CallLog.Calls.FEATURES_HD_CALL;
        public static final int FEATURES_PULLED_EXTERNALLY = android.provider.CallLog.Calls.FEATURES_PULLED_EXTERNALLY;
        public static final int FEATURES_RTT = android.provider.CallLog.Calls.FEATURES_RTT;
        public static final int FEATURES_VIDEO = android.provider.CallLog.Calls.FEATURES_VIDEO;
        public static final int FEATURES_VOLTE = android.provider.CallLog.Calls.FEATURES_VOLTE;
        public static final int FEATURES_WIFI = android.provider.CallLog.Calls.FEATURES_WIFI;
        public static final java.lang.String GEOCODED_LOCATION = android.provider.CallLog.Calls.GEOCODED_LOCATION;
        public static final int INCOMING_TYPE = android.provider.CallLog.Calls.INCOMING_TYPE;
        public static final java.lang.String IS_BUSINESS_CALL = android.provider.CallLog.Calls.IS_BUSINESS_CALL;
        public static final java.lang.String IS_READ = android.provider.CallLog.Calls.IS_READ;
        public static final java.lang.String LAST_MODIFIED = android.provider.CallLog.Calls.LAST_MODIFIED;
        public static final java.lang.String LIMIT_PARAM_KEY = android.provider.CallLog.Calls.LIMIT_PARAM_KEY;
        public static final java.lang.String LOCATION = android.provider.CallLog.Calls.LOCATION;
        public static final java.lang.String MISSED_REASON = android.provider.CallLog.Calls.MISSED_REASON;
        public static final long MISSED_REASON_NOT_MISSED = android.provider.CallLog.Calls.MISSED_REASON_NOT_MISSED;
        public static final int MISSED_TYPE = android.provider.CallLog.Calls.MISSED_TYPE;
        public static final java.lang.String NEW = android.provider.CallLog.Calls.NEW;
        public static final java.lang.String NUMBER = android.provider.CallLog.Calls.NUMBER;
        public static final java.lang.String NUMBER_PRESENTATION = android.provider.CallLog.Calls.NUMBER_PRESENTATION;
        public static final java.lang.String OFFSET_PARAM_KEY = android.provider.CallLog.Calls.OFFSET_PARAM_KEY;
        public static final int OUTGOING_TYPE = android.provider.CallLog.Calls.OUTGOING_TYPE;
        public static final java.lang.String PHONE_ACCOUNT_COMPONENT_NAME = android.provider.CallLog.Calls.PHONE_ACCOUNT_COMPONENT_NAME;
        public static final java.lang.String PHONE_ACCOUNT_ID = android.provider.CallLog.Calls.PHONE_ACCOUNT_ID;
        public static final java.lang.String POST_DIAL_DIGITS = android.provider.CallLog.Calls.POST_DIAL_DIGITS;
        public static final int PRESENTATION_ALLOWED = android.provider.CallLog.Calls.PRESENTATION_ALLOWED;
        public static final int PRESENTATION_PAYPHONE = android.provider.CallLog.Calls.PRESENTATION_PAYPHONE;
        public static final int PRESENTATION_RESTRICTED = android.provider.CallLog.Calls.PRESENTATION_RESTRICTED;
        public static final int PRESENTATION_UNAVAILABLE = android.provider.CallLog.Calls.PRESENTATION_UNAVAILABLE;
        public static final int PRESENTATION_UNKNOWN = android.provider.CallLog.Calls.PRESENTATION_UNKNOWN;
        public static final java.lang.String PRIORITY = android.provider.CallLog.Calls.PRIORITY;
        public static final int PRIORITY_NORMAL = android.provider.CallLog.Calls.PRIORITY_NORMAL;
        public static final int PRIORITY_URGENT = android.provider.CallLog.Calls.PRIORITY_URGENT;
        public static final int REJECTED_TYPE = android.provider.CallLog.Calls.REJECTED_TYPE;
        public static final java.lang.String SUBJECT = android.provider.CallLog.Calls.SUBJECT;
        public static final java.lang.String TRANSCRIPTION = android.provider.CallLog.Calls.TRANSCRIPTION;
        public static final java.lang.String TYPE = android.provider.CallLog.Calls.TYPE;
        public static final long USER_MISSED_CALL_FILTERS_TIMEOUT = android.provider.CallLog.Calls.USER_MISSED_CALL_FILTERS_TIMEOUT;
        public static final long USER_MISSED_CALL_SCREENING_SERVICE_SILENCED = android.provider.CallLog.Calls.USER_MISSED_CALL_SCREENING_SERVICE_SILENCED;
        public static final long USER_MISSED_DND_MODE = android.provider.CallLog.Calls.USER_MISSED_DND_MODE;
        public static final long USER_MISSED_LOW_RING_VOLUME = android.provider.CallLog.Calls.USER_MISSED_LOW_RING_VOLUME;
        public static final long USER_MISSED_NO_ANSWER = android.provider.CallLog.Calls.USER_MISSED_NO_ANSWER;
        public static final long USER_MISSED_NO_VIBRATE = android.provider.CallLog.Calls.USER_MISSED_NO_VIBRATE;
        public static final long USER_MISSED_SHORT_RING = android.provider.CallLog.Calls.USER_MISSED_SHORT_RING;
        public static final java.lang.String VIA_NUMBER = android.provider.CallLog.Calls.VIA_NUMBER;
        public static final int VOICEMAIL_TYPE = android.provider.CallLog.Calls.VOICEMAIL_TYPE;
        public static final java.lang.String VOICEMAIL_URI = android.provider.CallLog.Calls.VOICEMAIL_URI;

    }
    public static final class Locations {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Locations(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.CallLog.Locations wrap(android.provider.CallLog.Locations real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.CallLog.Locations(real, (__DcgwBridgeToken) null);
        }

        public android.provider.CallLog.Locations getReal() {
            return (android.provider.CallLog.Locations) real;
        }

        public android.provider.CallLog.Locations unwrap() {
            return getReal();
        }

        public static final java.lang.String AUTHORITY = android.provider.CallLog.Locations.AUTHORITY;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.CallLog.Locations.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.CallLog.Locations.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.CallLog.Locations.CONTENT_URI);
        public static final java.lang.String LATITUDE = android.provider.CallLog.Locations.LATITUDE;
        public static final java.lang.String LONGITUDE = android.provider.CallLog.Locations.LONGITUDE;

    }
}
