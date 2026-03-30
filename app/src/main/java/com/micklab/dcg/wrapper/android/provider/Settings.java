// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class Settings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Settings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.Settings wrap(android.provider.Settings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Settings(real, (__DcgwBridgeToken) null);
    }

    public android.provider.Settings getReal() {
        return (android.provider.Settings) real;
    }

    public android.provider.Settings unwrap() {
        return getReal();
    }

    public Settings() {
        this(new android.provider.Settings(), (__DcgwBridgeToken) null);
    }

    public static boolean canDrawOverlays(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.provider.Settings.canDrawOverlays(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_ACCESSIBILITY_SETTINGS = android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS;
    public static final java.lang.String ACTION_ADD_ACCOUNT = android.provider.Settings.ACTION_ADD_ACCOUNT;
    public static final java.lang.String ACTION_ADVANCED_MEMORY_PROTECTION_SETTINGS = android.provider.Settings.ACTION_ADVANCED_MEMORY_PROTECTION_SETTINGS;
    public static final java.lang.String ACTION_AIRPLANE_MODE_SETTINGS = android.provider.Settings.ACTION_AIRPLANE_MODE_SETTINGS;
    public static final java.lang.String ACTION_ALL_APPS_NOTIFICATION_SETTINGS = android.provider.Settings.ACTION_ALL_APPS_NOTIFICATION_SETTINGS;
    public static final java.lang.String ACTION_APN_SETTINGS = android.provider.Settings.ACTION_APN_SETTINGS;
    public static final java.lang.String ACTION_APPLICATION_DETAILS_SETTINGS = android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS;
    public static final java.lang.String ACTION_APPLICATION_DEVELOPMENT_SETTINGS = android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS;
    public static final java.lang.String ACTION_APPLICATION_SETTINGS = android.provider.Settings.ACTION_APPLICATION_SETTINGS;
    public static final java.lang.String ACTION_APP_LOCALE_SETTINGS = android.provider.Settings.ACTION_APP_LOCALE_SETTINGS;
    public static final java.lang.String ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS = android.provider.Settings.ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS;
    public static final java.lang.String ACTION_APP_NOTIFICATION_SETTINGS = android.provider.Settings.ACTION_APP_NOTIFICATION_SETTINGS;
    public static final java.lang.String ACTION_APP_OPEN_BY_DEFAULT_SETTINGS = android.provider.Settings.ACTION_APP_OPEN_BY_DEFAULT_SETTINGS;
    public static final java.lang.String ACTION_APP_SEARCH_SETTINGS = android.provider.Settings.ACTION_APP_SEARCH_SETTINGS;
    public static final java.lang.String ACTION_APP_USAGE_SETTINGS = android.provider.Settings.ACTION_APP_USAGE_SETTINGS;
    public static final java.lang.String ACTION_AUTOMATIC_ZEN_RULE_SETTINGS = android.provider.Settings.ACTION_AUTOMATIC_ZEN_RULE_SETTINGS;
    public static final java.lang.String ACTION_AUTO_ROTATE_SETTINGS = android.provider.Settings.ACTION_AUTO_ROTATE_SETTINGS;
    public static final java.lang.String ACTION_BATTERY_SAVER_SETTINGS = android.provider.Settings.ACTION_BATTERY_SAVER_SETTINGS;
    public static final java.lang.String ACTION_BIOMETRIC_ENROLL = android.provider.Settings.ACTION_BIOMETRIC_ENROLL;
    public static final java.lang.String ACTION_BLUETOOTH_SETTINGS = android.provider.Settings.ACTION_BLUETOOTH_SETTINGS;
    public static final java.lang.String ACTION_CAPTIONING_SETTINGS = android.provider.Settings.ACTION_CAPTIONING_SETTINGS;
    public static final java.lang.String ACTION_CAST_SETTINGS = android.provider.Settings.ACTION_CAST_SETTINGS;
    public static final java.lang.String ACTION_CHANNEL_NOTIFICATION_SETTINGS = android.provider.Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS;
    public static final java.lang.String ACTION_CONDITION_PROVIDER_SETTINGS = android.provider.Settings.ACTION_CONDITION_PROVIDER_SETTINGS;
    public static final java.lang.String ACTION_CREDENTIAL_PROVIDER = android.provider.Settings.ACTION_CREDENTIAL_PROVIDER;
    public static final java.lang.String ACTION_DATA_ROAMING_SETTINGS = android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS;
    public static final java.lang.String ACTION_DATA_USAGE_SETTINGS = android.provider.Settings.ACTION_DATA_USAGE_SETTINGS;
    public static final java.lang.String ACTION_DATE_SETTINGS = android.provider.Settings.ACTION_DATE_SETTINGS;
    public static final java.lang.String ACTION_DEVICE_INFO_SETTINGS = android.provider.Settings.ACTION_DEVICE_INFO_SETTINGS;
    public static final java.lang.String ACTION_DISPLAY_SETTINGS = android.provider.Settings.ACTION_DISPLAY_SETTINGS;
    public static final java.lang.String ACTION_DREAM_SETTINGS = android.provider.Settings.ACTION_DREAM_SETTINGS;
    public static final java.lang.String ACTION_FINGERPRINT_ENROLL = android.provider.Settings.ACTION_FINGERPRINT_ENROLL;
    public static final java.lang.String ACTION_HARD_KEYBOARD_SETTINGS = android.provider.Settings.ACTION_HARD_KEYBOARD_SETTINGS;
    public static final java.lang.String ACTION_HOME_SETTINGS = android.provider.Settings.ACTION_HOME_SETTINGS;
    public static final java.lang.String ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS = android.provider.Settings.ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS;
    public static final java.lang.String ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS = android.provider.Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS;
    public static final java.lang.String ACTION_INPUT_METHOD_SETTINGS = android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS;
    public static final java.lang.String ACTION_INPUT_METHOD_SUBTYPE_SETTINGS = android.provider.Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS;
    public static final java.lang.String ACTION_INTERNAL_STORAGE_SETTINGS = android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS;
    public static final java.lang.String ACTION_LOCALE_SETTINGS = android.provider.Settings.ACTION_LOCALE_SETTINGS;
    public static final java.lang.String ACTION_LOCATION_SOURCE_SETTINGS = android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS;
    public static final java.lang.String ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS = android.provider.Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS;
    public static final java.lang.String ACTION_MANAGE_APPLICATIONS_SETTINGS = android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS;
    public static final java.lang.String ACTION_MANAGE_APP_USE_FULL_SCREEN_INTENT = android.provider.Settings.ACTION_MANAGE_APP_USE_FULL_SCREEN_INTENT;
    public static final java.lang.String ACTION_MANAGE_DEFAULT_APPS_SETTINGS = android.provider.Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS;
    public static final java.lang.String ACTION_MANAGE_OVERLAY_PERMISSION = android.provider.Settings.ACTION_MANAGE_OVERLAY_PERMISSION;
    public static final java.lang.String ACTION_MANAGE_SUPERVISOR_RESTRICTED_SETTING = android.provider.Settings.ACTION_MANAGE_SUPERVISOR_RESTRICTED_SETTING;
    public static final java.lang.String ACTION_MANAGE_UNKNOWN_APP_SOURCES = android.provider.Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES;
    public static final java.lang.String ACTION_MANAGE_WRITE_SETTINGS = android.provider.Settings.ACTION_MANAGE_WRITE_SETTINGS;
    public static final java.lang.String ACTION_MEMORY_CARD_SETTINGS = android.provider.Settings.ACTION_MEMORY_CARD_SETTINGS;
    public static final java.lang.String ACTION_NFCSHARING_SETTINGS = android.provider.Settings.ACTION_NFCSHARING_SETTINGS;
    public static final java.lang.String ACTION_NFC_PAYMENT_SETTINGS = android.provider.Settings.ACTION_NFC_PAYMENT_SETTINGS;
    public static final java.lang.String ACTION_NFC_SETTINGS = android.provider.Settings.ACTION_NFC_SETTINGS;
    public static final java.lang.String ACTION_NIGHT_DISPLAY_SETTINGS = android.provider.Settings.ACTION_NIGHT_DISPLAY_SETTINGS;
    public static final java.lang.String ACTION_NOTIFICATION_ASSISTANT_SETTINGS = android.provider.Settings.ACTION_NOTIFICATION_ASSISTANT_SETTINGS;
    public static final java.lang.String ACTION_NOTIFICATION_LISTENER_DETAIL_SETTINGS = android.provider.Settings.ACTION_NOTIFICATION_LISTENER_DETAIL_SETTINGS;
    public static final java.lang.String ACTION_NOTIFICATION_LISTENER_SETTINGS = android.provider.Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS;
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS = android.provider.Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS;
    public static final java.lang.String ACTION_PRINT_SETTINGS = android.provider.Settings.ACTION_PRINT_SETTINGS;
    public static final java.lang.String ACTION_PRIVACY_SETTINGS = android.provider.Settings.ACTION_PRIVACY_SETTINGS;
    public static final java.lang.String ACTION_PROCESS_WIFI_EASY_CONNECT_URI = android.provider.Settings.ACTION_PROCESS_WIFI_EASY_CONNECT_URI;
    public static final java.lang.String ACTION_QUICK_ACCESS_WALLET_SETTINGS = android.provider.Settings.ACTION_QUICK_ACCESS_WALLET_SETTINGS;
    public static final java.lang.String ACTION_QUICK_LAUNCH_SETTINGS = android.provider.Settings.ACTION_QUICK_LAUNCH_SETTINGS;
    public static final java.lang.String ACTION_REGIONAL_PREFERENCES_SETTINGS = android.provider.Settings.ACTION_REGIONAL_PREFERENCES_SETTINGS;
    public static final java.lang.String ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = android.provider.Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS;
    public static final java.lang.String ACTION_REQUEST_MANAGE_MEDIA = android.provider.Settings.ACTION_REQUEST_MANAGE_MEDIA;
    public static final java.lang.String ACTION_REQUEST_MEDIA_ROUTING_CONTROL = android.provider.Settings.ACTION_REQUEST_MEDIA_ROUTING_CONTROL;
    public static final java.lang.String ACTION_REQUEST_SCHEDULE_EXACT_ALARM = android.provider.Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM;
    public static final java.lang.String ACTION_REQUEST_SET_AUTOFILL_SERVICE = android.provider.Settings.ACTION_REQUEST_SET_AUTOFILL_SERVICE;
    public static final java.lang.String ACTION_SATELLITE_SETTING = android.provider.Settings.ACTION_SATELLITE_SETTING;
    public static final java.lang.String ACTION_SEARCH_SETTINGS = android.provider.Settings.ACTION_SEARCH_SETTINGS;
    public static final java.lang.String ACTION_SECURITY_SETTINGS = android.provider.Settings.ACTION_SECURITY_SETTINGS;
    public static final java.lang.String ACTION_SETTINGS = android.provider.Settings.ACTION_SETTINGS;
    public static final java.lang.String ACTION_SETTINGS_EMBED_DEEP_LINK_ACTIVITY = android.provider.Settings.ACTION_SETTINGS_EMBED_DEEP_LINK_ACTIVITY;
    public static final java.lang.String ACTION_SHOW_REGULATORY_INFO = android.provider.Settings.ACTION_SHOW_REGULATORY_INFO;
    public static final java.lang.String ACTION_SHOW_WORK_POLICY_INFO = android.provider.Settings.ACTION_SHOW_WORK_POLICY_INFO;
    public static final java.lang.String ACTION_SOUND_SETTINGS = android.provider.Settings.ACTION_SOUND_SETTINGS;
    public static final java.lang.String ACTION_STORAGE_VOLUME_ACCESS_SETTINGS = android.provider.Settings.ACTION_STORAGE_VOLUME_ACCESS_SETTINGS;
    public static final java.lang.String ACTION_SYNC_SETTINGS = android.provider.Settings.ACTION_SYNC_SETTINGS;
    public static final java.lang.String ACTION_USAGE_ACCESS_SETTINGS = android.provider.Settings.ACTION_USAGE_ACCESS_SETTINGS;
    public static final java.lang.String ACTION_USER_DICTIONARY_SETTINGS = android.provider.Settings.ACTION_USER_DICTIONARY_SETTINGS;
    public static final java.lang.String ACTION_VOICE_CONTROL_AIRPLANE_MODE = android.provider.Settings.ACTION_VOICE_CONTROL_AIRPLANE_MODE;
    public static final java.lang.String ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE = android.provider.Settings.ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE;
    public static final java.lang.String ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE = android.provider.Settings.ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE;
    public static final java.lang.String ACTION_VOICE_INPUT_SETTINGS = android.provider.Settings.ACTION_VOICE_INPUT_SETTINGS;
    public static final java.lang.String ACTION_VPN_SETTINGS = android.provider.Settings.ACTION_VPN_SETTINGS;
    public static final java.lang.String ACTION_VR_LISTENER_SETTINGS = android.provider.Settings.ACTION_VR_LISTENER_SETTINGS;
    public static final java.lang.String ACTION_WEBVIEW_SETTINGS = android.provider.Settings.ACTION_WEBVIEW_SETTINGS;
    public static final java.lang.String ACTION_WIFI_IP_SETTINGS = android.provider.Settings.ACTION_WIFI_IP_SETTINGS;
    public static final java.lang.String ACTION_WIFI_SETTINGS = android.provider.Settings.ACTION_WIFI_SETTINGS;
    public static final java.lang.String ACTION_WIRELESS_SETTINGS = android.provider.Settings.ACTION_WIRELESS_SETTINGS;
    public static final java.lang.String ACTION_ZEN_MODE_PRIORITY_SETTINGS = android.provider.Settings.ACTION_ZEN_MODE_PRIORITY_SETTINGS;
    public static final int ADD_WIFI_RESULT_ADD_OR_UPDATE_FAILED = android.provider.Settings.ADD_WIFI_RESULT_ADD_OR_UPDATE_FAILED;
    public static final int ADD_WIFI_RESULT_ALREADY_EXISTS = android.provider.Settings.ADD_WIFI_RESULT_ALREADY_EXISTS;
    public static final int ADD_WIFI_RESULT_SUCCESS = android.provider.Settings.ADD_WIFI_RESULT_SUCCESS;
    public static final java.lang.String AUTHORITY = android.provider.Settings.AUTHORITY;
    public static final java.lang.String EXTRA_ACCOUNT_TYPES = android.provider.Settings.EXTRA_ACCOUNT_TYPES;
    public static final java.lang.String EXTRA_AIRPLANE_MODE_ENABLED = android.provider.Settings.EXTRA_AIRPLANE_MODE_ENABLED;
    public static final java.lang.String EXTRA_APP_PACKAGE = android.provider.Settings.EXTRA_APP_PACKAGE;
    public static final java.lang.String EXTRA_AUTHORITIES = android.provider.Settings.EXTRA_AUTHORITIES;
    public static final java.lang.String EXTRA_AUTOMATIC_ZEN_RULE_ID = android.provider.Settings.EXTRA_AUTOMATIC_ZEN_RULE_ID;
    public static final java.lang.String EXTRA_BATTERY_SAVER_MODE_ENABLED = android.provider.Settings.EXTRA_BATTERY_SAVER_MODE_ENABLED;
    public static final java.lang.String EXTRA_BIOMETRIC_AUTHENTICATORS_ALLOWED = android.provider.Settings.EXTRA_BIOMETRIC_AUTHENTICATORS_ALLOWED;
    public static final java.lang.String EXTRA_CHANNEL_FILTER_LIST = android.provider.Settings.EXTRA_CHANNEL_FILTER_LIST;
    public static final java.lang.String EXTRA_CHANNEL_ID = android.provider.Settings.EXTRA_CHANNEL_ID;
    public static final java.lang.String EXTRA_CONVERSATION_ID = android.provider.Settings.EXTRA_CONVERSATION_ID;
    public static final java.lang.String EXTRA_DO_NOT_DISTURB_MODE_ENABLED = android.provider.Settings.EXTRA_DO_NOT_DISTURB_MODE_ENABLED;
    public static final java.lang.String EXTRA_DO_NOT_DISTURB_MODE_MINUTES = android.provider.Settings.EXTRA_DO_NOT_DISTURB_MODE_MINUTES;
    public static final java.lang.String EXTRA_EASY_CONNECT_ATTEMPTED_SSID = android.provider.Settings.EXTRA_EASY_CONNECT_ATTEMPTED_SSID;
    public static final java.lang.String EXTRA_EASY_CONNECT_BAND_LIST = android.provider.Settings.EXTRA_EASY_CONNECT_BAND_LIST;
    public static final java.lang.String EXTRA_EASY_CONNECT_CHANNEL_LIST = android.provider.Settings.EXTRA_EASY_CONNECT_CHANNEL_LIST;
    public static final java.lang.String EXTRA_EASY_CONNECT_ERROR_CODE = android.provider.Settings.EXTRA_EASY_CONNECT_ERROR_CODE;
    public static final java.lang.String EXTRA_INPUT_METHOD_ID = android.provider.Settings.EXTRA_INPUT_METHOD_ID;
    public static final java.lang.String EXTRA_NOTIFICATION_LISTENER_COMPONENT_NAME = android.provider.Settings.EXTRA_NOTIFICATION_LISTENER_COMPONENT_NAME;
    public static final java.lang.String EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_HIGHLIGHT_MENU_KEY = android.provider.Settings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_HIGHLIGHT_MENU_KEY;
    public static final java.lang.String EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI = android.provider.Settings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI;
    public static final java.lang.String EXTRA_SUB_ID = android.provider.Settings.EXTRA_SUB_ID;
    public static final java.lang.String EXTRA_SUPERVISOR_RESTRICTED_SETTING_KEY = android.provider.Settings.EXTRA_SUPERVISOR_RESTRICTED_SETTING_KEY;
    public static final java.lang.String INTENT_CATEGORY_USAGE_ACCESS_CONFIG = android.provider.Settings.INTENT_CATEGORY_USAGE_ACCESS_CONFIG;
    public static final java.lang.String METADATA_USAGE_ACCESS_REASON = android.provider.Settings.METADATA_USAGE_ACCESS_REASON;
    public static final int SUPERVISOR_VERIFICATION_SETTING_BIOMETRICS = android.provider.Settings.SUPERVISOR_VERIFICATION_SETTING_BIOMETRICS;
    public static final int SUPERVISOR_VERIFICATION_SETTING_UNKNOWN = android.provider.Settings.SUPERVISOR_VERIFICATION_SETTING_UNKNOWN;

    public static final class Global {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Global(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Settings.Global wrap(android.provider.Settings.Global real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Settings.Global(real, (__DcgwBridgeToken) null);
        }

        public android.provider.Settings.Global getReal() {
            return (android.provider.Settings.Global) real;
        }

        public android.provider.Settings.Global unwrap() {
            return getReal();
        }

        public Global() {
            this(new android.provider.Settings.Global(), (__DcgwBridgeToken) null);
        }

        public static float getFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Global.getFloat(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static float getFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, float arg2) {
            return android.provider.Settings.Global.getFloat(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static int getInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Global.getInt(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static int getInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, int arg2) {
            return android.provider.Settings.Global.getInt(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static long getLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Global.getLong(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static long getLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, long arg2) {
            return android.provider.Settings.Global.getLong(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static java.lang.String getString(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) {
            return android.provider.Settings.Global.getString(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getUriFor(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.Global.getUriFor(arg0));
        }

        public static boolean putFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, float arg2) {
            return android.provider.Settings.Global.putFloat(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, int arg2) {
            return android.provider.Settings.Global.putInt(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, long arg2) {
            return android.provider.Settings.Global.putLong(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putString(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, java.lang.String arg2) {
            return android.provider.Settings.Global.putString(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static final java.lang.String ADB_ENABLED = android.provider.Settings.Global.ADB_ENABLED;
        public static final java.lang.String AIRPLANE_MODE_ON = android.provider.Settings.Global.AIRPLANE_MODE_ON;
        public static final java.lang.String AIRPLANE_MODE_RADIOS = android.provider.Settings.Global.AIRPLANE_MODE_RADIOS;
        public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = android.provider.Settings.Global.ALWAYS_FINISH_ACTIVITIES;
        public static final java.lang.String ANIMATOR_DURATION_SCALE = android.provider.Settings.Global.ANIMATOR_DURATION_SCALE;
        public static final java.lang.String APPLY_RAMPING_RINGER = android.provider.Settings.Global.APPLY_RAMPING_RINGER;
        public static final java.lang.String AUTO_TIME = android.provider.Settings.Global.AUTO_TIME;
        public static final java.lang.String AUTO_TIME_ZONE = android.provider.Settings.Global.AUTO_TIME_ZONE;
        public static final java.lang.String BLUETOOTH_ON = android.provider.Settings.Global.BLUETOOTH_ON;
        public static final java.lang.String BOOT_COUNT = android.provider.Settings.Global.BOOT_COUNT;
        public static final java.lang.String CONTACT_METADATA_SYNC_ENABLED = android.provider.Settings.Global.CONTACT_METADATA_SYNC_ENABLED;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.Global.CONTENT_URI);
        public static final java.lang.String DATA_ROAMING = android.provider.Settings.Global.DATA_ROAMING;
        public static final java.lang.String DEBUG_APP = android.provider.Settings.Global.DEBUG_APP;
        public static final java.lang.String DEVELOPMENT_SETTINGS_ENABLED = android.provider.Settings.Global.DEVELOPMENT_SETTINGS_ENABLED;
        public static final java.lang.String DEVICE_NAME = android.provider.Settings.Global.DEVICE_NAME;
        public static final java.lang.String DEVICE_PROVISIONED = android.provider.Settings.Global.DEVICE_PROVISIONED;
        public static final java.lang.String HTTP_PROXY = android.provider.Settings.Global.HTTP_PROXY;
        public static final java.lang.String INSTALL_NON_MARKET_APPS = android.provider.Settings.Global.INSTALL_NON_MARKET_APPS;
        public static final java.lang.String MODE_RINGER = android.provider.Settings.Global.MODE_RINGER;
        public static final java.lang.String RADIO_BLUETOOTH = android.provider.Settings.Global.RADIO_BLUETOOTH;
        public static final java.lang.String RADIO_CELL = android.provider.Settings.Global.RADIO_CELL;
        public static final java.lang.String RADIO_NFC = android.provider.Settings.Global.RADIO_NFC;
        public static final java.lang.String RADIO_WIFI = android.provider.Settings.Global.RADIO_WIFI;
        public static final java.lang.String SECURE_FRP_MODE = android.provider.Settings.Global.SECURE_FRP_MODE;
        public static final java.lang.String SHOW_PROCESSES = android.provider.Settings.Global.SHOW_PROCESSES;
        public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = android.provider.Settings.Global.STAY_ON_WHILE_PLUGGED_IN;
        public static final java.lang.String TRANSITION_ANIMATION_SCALE = android.provider.Settings.Global.TRANSITION_ANIMATION_SCALE;
        public static final java.lang.String USB_MASS_STORAGE_ENABLED = android.provider.Settings.Global.USB_MASS_STORAGE_ENABLED;
        public static final java.lang.String USE_GOOGLE_MAIL = android.provider.Settings.Global.USE_GOOGLE_MAIL;
        public static final java.lang.String WAIT_FOR_DEBUGGER = android.provider.Settings.Global.WAIT_FOR_DEBUGGER;
        public static final java.lang.String WIFI_DEVICE_OWNER_CONFIGS_LOCKDOWN = android.provider.Settings.Global.WIFI_DEVICE_OWNER_CONFIGS_LOCKDOWN;
        public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = android.provider.Settings.Global.WIFI_MAX_DHCP_RETRY_COUNT;
        public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = android.provider.Settings.Global.WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS;
        public static final java.lang.String WIFI_ON = android.provider.Settings.Global.WIFI_ON;
        public static final java.lang.String WIFI_SLEEP_POLICY = android.provider.Settings.Global.WIFI_SLEEP_POLICY;
        public static final int WIFI_SLEEP_POLICY_DEFAULT = android.provider.Settings.Global.WIFI_SLEEP_POLICY_DEFAULT;
        public static final int WIFI_SLEEP_POLICY_NEVER = android.provider.Settings.Global.WIFI_SLEEP_POLICY_NEVER;
        public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = android.provider.Settings.Global.WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED;
        public static final java.lang.String WIFI_WATCHDOG_ON = android.provider.Settings.Global.WIFI_WATCHDOG_ON;
        public static final java.lang.String WINDOW_ANIMATION_SCALE = android.provider.Settings.Global.WINDOW_ANIMATION_SCALE;

    }
    public static final class NameValueTable {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NameValueTable(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Settings.NameValueTable wrap(android.provider.Settings.NameValueTable real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Settings.NameValueTable(real, (__DcgwBridgeToken) null);
        }

        public android.provider.Settings.NameValueTable getReal() {
            return (android.provider.Settings.NameValueTable) real;
        }

        public android.provider.Settings.NameValueTable unwrap() {
            return getReal();
        }

        public NameValueTable() {
            this(new android.provider.Settings.NameValueTable(), (__DcgwBridgeToken) null);
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getUriFor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.NameValueTable.getUriFor(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public static final java.lang.String NAME = android.provider.Settings.NameValueTable.NAME;
        public static final java.lang.String VALUE = android.provider.Settings.NameValueTable.VALUE;

    }
    public static final class Panel {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Panel(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Settings.Panel wrap(android.provider.Settings.Panel real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Settings.Panel(real, (__DcgwBridgeToken) null);
        }

        public android.provider.Settings.Panel getReal() {
            return (android.provider.Settings.Panel) real;
        }

        public android.provider.Settings.Panel unwrap() {
            return getReal();
        }

        public static final java.lang.String ACTION_INTERNET_CONNECTIVITY = android.provider.Settings.Panel.ACTION_INTERNET_CONNECTIVITY;
        public static final java.lang.String ACTION_NFC = android.provider.Settings.Panel.ACTION_NFC;
        public static final java.lang.String ACTION_VOLUME = android.provider.Settings.Panel.ACTION_VOLUME;
        public static final java.lang.String ACTION_WIFI = android.provider.Settings.Panel.ACTION_WIFI;

    }
    public static final class Secure {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Secure(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Settings.Secure wrap(android.provider.Settings.Secure real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Settings.Secure(real, (__DcgwBridgeToken) null);
        }

        public android.provider.Settings.Secure getReal() {
            return (android.provider.Settings.Secure) real;
        }

        public android.provider.Settings.Secure unwrap() {
            return getReal();
        }

        public Secure() {
            this(new android.provider.Settings.Secure(), (__DcgwBridgeToken) null);
        }

        public static float getFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Secure.getFloat(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static float getFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, float arg2) {
            return android.provider.Settings.Secure.getFloat(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static int getInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Secure.getInt(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static int getInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, int arg2) {
            return android.provider.Settings.Secure.getInt(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static long getLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.Secure.getLong(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static long getLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, long arg2) {
            return android.provider.Settings.Secure.getLong(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static java.lang.String getString(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) {
            return android.provider.Settings.Secure.getString(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getUriFor(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.Secure.getUriFor(arg0));
        }

        public static boolean isLocationProviderEnabled(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) {
            return android.provider.Settings.Secure.isLocationProviderEnabled(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static boolean putFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, float arg2) {
            return android.provider.Settings.Secure.putFloat(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, int arg2) {
            return android.provider.Settings.Secure.putInt(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, long arg2) {
            return android.provider.Settings.Secure.putLong(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putString(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, java.lang.String arg2) {
            return android.provider.Settings.Secure.putString(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static void setLocationProviderEnabled(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, boolean arg2) {
            android.provider.Settings.Secure.setLocationProviderEnabled(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static final java.lang.String ACCESSIBILITY_DISPLAY_INVERSION_ENABLED = android.provider.Settings.Secure.ACCESSIBILITY_DISPLAY_INVERSION_ENABLED;
        public static final java.lang.String ACCESSIBILITY_ENABLED = android.provider.Settings.Secure.ACCESSIBILITY_ENABLED;
        public static final java.lang.String ACCESSIBILITY_SPEAK_PASSWORD = android.provider.Settings.Secure.ACCESSIBILITY_SPEAK_PASSWORD;
        public static final java.lang.String ADB_ENABLED = android.provider.Settings.Secure.ADB_ENABLED;
        public static final java.lang.String ALLOWED_GEOLOCATION_ORIGINS = android.provider.Settings.Secure.ALLOWED_GEOLOCATION_ORIGINS;
        public static final java.lang.String ALLOW_MOCK_LOCATION = android.provider.Settings.Secure.ALLOW_MOCK_LOCATION;
        public static final java.lang.String ANDROID_ID = android.provider.Settings.Secure.ANDROID_ID;
        public static final java.lang.String BACKGROUND_DATA = android.provider.Settings.Secure.BACKGROUND_DATA;
        public static final java.lang.String BLUETOOTH_ON = android.provider.Settings.Secure.BLUETOOTH_ON;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.Secure.CONTENT_URI);
        public static final java.lang.String DATA_ROAMING = android.provider.Settings.Secure.DATA_ROAMING;
        public static final java.lang.String DEFAULT_INPUT_METHOD = android.provider.Settings.Secure.DEFAULT_INPUT_METHOD;
        public static final java.lang.String DEVELOPMENT_SETTINGS_ENABLED = android.provider.Settings.Secure.DEVELOPMENT_SETTINGS_ENABLED;
        public static final java.lang.String DEVICE_PROVISIONED = android.provider.Settings.Secure.DEVICE_PROVISIONED;
        public static final java.lang.String ENABLED_ACCESSIBILITY_SERVICES = android.provider.Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES;
        public static final java.lang.String ENABLED_INPUT_METHODS = android.provider.Settings.Secure.ENABLED_INPUT_METHODS;
        public static final java.lang.String HTTP_PROXY = android.provider.Settings.Secure.HTTP_PROXY;
        public static final java.lang.String INPUT_METHOD_SELECTOR_VISIBILITY = android.provider.Settings.Secure.INPUT_METHOD_SELECTOR_VISIBILITY;
        public static final java.lang.String INSTALL_NON_MARKET_APPS = android.provider.Settings.Secure.INSTALL_NON_MARKET_APPS;
        public static final java.lang.String LOCATION_MODE = android.provider.Settings.Secure.LOCATION_MODE;
        public static final int LOCATION_MODE_BATTERY_SAVING = android.provider.Settings.Secure.LOCATION_MODE_BATTERY_SAVING;
        public static final int LOCATION_MODE_HIGH_ACCURACY = android.provider.Settings.Secure.LOCATION_MODE_HIGH_ACCURACY;
        public static final int LOCATION_MODE_OFF = android.provider.Settings.Secure.LOCATION_MODE_OFF;
        public static final int LOCATION_MODE_SENSORS_ONLY = android.provider.Settings.Secure.LOCATION_MODE_SENSORS_ONLY;
        public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = android.provider.Settings.Secure.LOCATION_PROVIDERS_ALLOWED;
        public static final java.lang.String LOCK_PATTERN_ENABLED = android.provider.Settings.Secure.LOCK_PATTERN_ENABLED;
        public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = android.provider.Settings.Secure.LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED;
        public static final java.lang.String LOCK_PATTERN_VISIBLE = android.provider.Settings.Secure.LOCK_PATTERN_VISIBLE;
        public static final java.lang.String LOGGING_ID = android.provider.Settings.Secure.LOGGING_ID;
        public static final java.lang.String PARENTAL_CONTROL_ENABLED = android.provider.Settings.Secure.PARENTAL_CONTROL_ENABLED;
        public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = android.provider.Settings.Secure.PARENTAL_CONTROL_LAST_UPDATE;
        public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = android.provider.Settings.Secure.PARENTAL_CONTROL_REDIRECT_URL;
        public static final java.lang.String RTT_CALLING_MODE = android.provider.Settings.Secure.RTT_CALLING_MODE;
        public static final java.lang.String SECURE_FRP_MODE = android.provider.Settings.Secure.SECURE_FRP_MODE;
        public static final java.lang.String SELECTED_INPUT_METHOD_SUBTYPE = android.provider.Settings.Secure.SELECTED_INPUT_METHOD_SUBTYPE;
        public static final java.lang.String SETTINGS_CLASSNAME = android.provider.Settings.Secure.SETTINGS_CLASSNAME;
        public static final java.lang.String SKIP_FIRST_USE_HINTS = android.provider.Settings.Secure.SKIP_FIRST_USE_HINTS;
        public static final java.lang.String TOUCH_EXPLORATION_ENABLED = android.provider.Settings.Secure.TOUCH_EXPLORATION_ENABLED;
        public static final java.lang.String TTS_DEFAULT_COUNTRY = android.provider.Settings.Secure.TTS_DEFAULT_COUNTRY;
        public static final java.lang.String TTS_DEFAULT_LANG = android.provider.Settings.Secure.TTS_DEFAULT_LANG;
        public static final java.lang.String TTS_DEFAULT_PITCH = android.provider.Settings.Secure.TTS_DEFAULT_PITCH;
        public static final java.lang.String TTS_DEFAULT_RATE = android.provider.Settings.Secure.TTS_DEFAULT_RATE;
        public static final java.lang.String TTS_DEFAULT_SYNTH = android.provider.Settings.Secure.TTS_DEFAULT_SYNTH;
        public static final java.lang.String TTS_DEFAULT_VARIANT = android.provider.Settings.Secure.TTS_DEFAULT_VARIANT;
        public static final java.lang.String TTS_ENABLED_PLUGINS = android.provider.Settings.Secure.TTS_ENABLED_PLUGINS;
        public static final java.lang.String TTS_USE_DEFAULTS = android.provider.Settings.Secure.TTS_USE_DEFAULTS;
        public static final java.lang.String USB_MASS_STORAGE_ENABLED = android.provider.Settings.Secure.USB_MASS_STORAGE_ENABLED;
        public static final java.lang.String USE_GOOGLE_MAIL = android.provider.Settings.Secure.USE_GOOGLE_MAIL;
        public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = android.provider.Settings.Secure.WIFI_MAX_DHCP_RETRY_COUNT;
        public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = android.provider.Settings.Secure.WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS;
        public static final java.lang.String WIFI_ON = android.provider.Settings.Secure.WIFI_ON;
        public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = android.provider.Settings.Secure.WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE;
        public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = android.provider.Settings.Secure.WIFI_WATCHDOG_AP_COUNT;
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = android.provider.Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS;
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = android.provider.Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED;
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = android.provider.Settings.Secure.WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS;
        public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = android.provider.Settings.Secure.WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT;
        public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = android.provider.Settings.Secure.WIFI_WATCHDOG_MAX_AP_CHECKS;
        public static final java.lang.String WIFI_WATCHDOG_ON = android.provider.Settings.Secure.WIFI_WATCHDOG_ON;
        public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = android.provider.Settings.Secure.WIFI_WATCHDOG_PING_COUNT;
        public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = android.provider.Settings.Secure.WIFI_WATCHDOG_PING_DELAY_MS;
        public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = android.provider.Settings.Secure.WIFI_WATCHDOG_PING_TIMEOUT_MS;
        public static final java.lang.String WIFI_WATCHDOG_WATCH_LIST = android.provider.Settings.Secure.WIFI_WATCHDOG_WATCH_LIST;

    }
    public static final class SettingNotFoundException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SettingNotFoundException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Settings.SettingNotFoundException wrap(android.provider.Settings.SettingNotFoundException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Settings.SettingNotFoundException(real, (__DcgwBridgeToken) null);
        }

        public android.provider.Settings.SettingNotFoundException getReal() {
            return (android.provider.Settings.SettingNotFoundException) real;
        }

        public android.provider.Settings.SettingNotFoundException unwrap() {
            return getReal();
        }

        public SettingNotFoundException(java.lang.String arg0) {
            this(new android.provider.Settings.SettingNotFoundException(arg0), (__DcgwBridgeToken) null);
        }

    }
    public static final class System {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private System(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Settings.System wrap(android.provider.Settings.System real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Settings.System(real, (__DcgwBridgeToken) null);
        }

        public android.provider.Settings.System getReal() {
            return (android.provider.Settings.System) real;
        }

        public android.provider.Settings.System unwrap() {
            return getReal();
        }

        public System() {
            this(new android.provider.Settings.System(), (__DcgwBridgeToken) null);
        }

        public static boolean canWrite(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return android.provider.Settings.System.canWrite(arg0 == null ? null : arg0.getReal());
        }

        public static void getConfiguration(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
            android.provider.Settings.System.getConfiguration(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public static float getFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.System.getFloat(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static float getFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, float arg2) {
            return android.provider.Settings.System.getFloat(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static int getInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.System.getInt(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static int getInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, int arg2) {
            return android.provider.Settings.System.getInt(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static long getLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) throws android.provider.Settings.SettingNotFoundException {
            return android.provider.Settings.System.getLong(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static long getLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, long arg2) {
            return android.provider.Settings.System.getLong(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean getShowGTalkServiceStatus(com.micklab.dcg.wrapper.android.content.ContentResolver arg0) {
            return android.provider.Settings.System.getShowGTalkServiceStatus(arg0 == null ? null : arg0.getReal());
        }

        public static java.lang.String getString(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) {
            return android.provider.Settings.System.getString(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getUriFor(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.System.getUriFor(arg0));
        }

        public static boolean putConfiguration(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
            return android.provider.Settings.System.putConfiguration(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public static boolean putFloat(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, float arg2) {
            return android.provider.Settings.System.putFloat(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putInt(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, int arg2) {
            return android.provider.Settings.System.putInt(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putLong(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, long arg2) {
            return android.provider.Settings.System.putLong(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static boolean putString(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, java.lang.String arg2) {
            return android.provider.Settings.System.putString(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public static void setShowGTalkServiceStatus(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, boolean arg1) {
            android.provider.Settings.System.setShowGTalkServiceStatus(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final java.lang.String ACCELEROMETER_ROTATION = android.provider.Settings.System.ACCELEROMETER_ROTATION;
        public static final java.lang.String ADB_ENABLED = android.provider.Settings.System.ADB_ENABLED;
        public static final java.lang.String AIRPLANE_MODE_ON = android.provider.Settings.System.AIRPLANE_MODE_ON;
        public static final java.lang.String AIRPLANE_MODE_RADIOS = android.provider.Settings.System.AIRPLANE_MODE_RADIOS;
        public static final java.lang.String ALARM_ALERT = android.provider.Settings.System.ALARM_ALERT;
        public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = android.provider.Settings.System.ALWAYS_FINISH_ACTIVITIES;
        public static final java.lang.String ANDROID_ID = android.provider.Settings.System.ANDROID_ID;
        public static final java.lang.String ANIMATOR_DURATION_SCALE = android.provider.Settings.System.ANIMATOR_DURATION_SCALE;
        public static final java.lang.String AUTO_TIME = android.provider.Settings.System.AUTO_TIME;
        public static final java.lang.String AUTO_TIME_ZONE = android.provider.Settings.System.AUTO_TIME_ZONE;
        public static final java.lang.String BLUETOOTH_DISCOVERABILITY = android.provider.Settings.System.BLUETOOTH_DISCOVERABILITY;
        public static final java.lang.String BLUETOOTH_DISCOVERABILITY_TIMEOUT = android.provider.Settings.System.BLUETOOTH_DISCOVERABILITY_TIMEOUT;
        public static final java.lang.String BLUETOOTH_ON = android.provider.Settings.System.BLUETOOTH_ON;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.System.CONTENT_URI);
        public static final java.lang.String DATA_ROAMING = android.provider.Settings.System.DATA_ROAMING;
        public static final java.lang.String DATE_FORMAT = android.provider.Settings.System.DATE_FORMAT;
        public static final java.lang.String DEBUG_APP = android.provider.Settings.System.DEBUG_APP;
        public static final com.micklab.dcg.wrapper.android.net.Uri DEFAULT_ALARM_ALERT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.System.DEFAULT_ALARM_ALERT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri DEFAULT_NOTIFICATION_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri DEFAULT_RINGTONE_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Settings.System.DEFAULT_RINGTONE_URI);
        public static final java.lang.String DEVICE_PROVISIONED = android.provider.Settings.System.DEVICE_PROVISIONED;
        public static final java.lang.String DIM_SCREEN = android.provider.Settings.System.DIM_SCREEN;
        public static final java.lang.String DTMF_TONE_TYPE_WHEN_DIALING = android.provider.Settings.System.DTMF_TONE_TYPE_WHEN_DIALING;
        public static final java.lang.String DTMF_TONE_WHEN_DIALING = android.provider.Settings.System.DTMF_TONE_WHEN_DIALING;
        public static final java.lang.String END_BUTTON_BEHAVIOR = android.provider.Settings.System.END_BUTTON_BEHAVIOR;
        public static final java.lang.String FONT_SCALE = android.provider.Settings.System.FONT_SCALE;
        public static final java.lang.String HAPTIC_FEEDBACK_ENABLED = android.provider.Settings.System.HAPTIC_FEEDBACK_ENABLED;
        public static final java.lang.String HTTP_PROXY = android.provider.Settings.System.HTTP_PROXY;
        public static final java.lang.String INSTALL_NON_MARKET_APPS = android.provider.Settings.System.INSTALL_NON_MARKET_APPS;
        public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = android.provider.Settings.System.LOCATION_PROVIDERS_ALLOWED;
        public static final java.lang.String LOCK_PATTERN_ENABLED = android.provider.Settings.System.LOCK_PATTERN_ENABLED;
        public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = android.provider.Settings.System.LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED;
        public static final java.lang.String LOCK_PATTERN_VISIBLE = android.provider.Settings.System.LOCK_PATTERN_VISIBLE;
        public static final java.lang.String LOGGING_ID = android.provider.Settings.System.LOGGING_ID;
        public static final java.lang.String MODE_RINGER = android.provider.Settings.System.MODE_RINGER;
        public static final java.lang.String MODE_RINGER_STREAMS_AFFECTED = android.provider.Settings.System.MODE_RINGER_STREAMS_AFFECTED;
        public static final java.lang.String MUTE_STREAMS_AFFECTED = android.provider.Settings.System.MUTE_STREAMS_AFFECTED;
        public static final java.lang.String NEXT_ALARM_FORMATTED = android.provider.Settings.System.NEXT_ALARM_FORMATTED;
        public static final java.lang.String NOTIFICATION_SOUND = android.provider.Settings.System.NOTIFICATION_SOUND;
        public static final java.lang.String PARENTAL_CONTROL_ENABLED = android.provider.Settings.System.PARENTAL_CONTROL_ENABLED;
        public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = android.provider.Settings.System.PARENTAL_CONTROL_LAST_UPDATE;
        public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = android.provider.Settings.System.PARENTAL_CONTROL_REDIRECT_URL;
        public static final java.lang.String RADIO_BLUETOOTH = android.provider.Settings.System.RADIO_BLUETOOTH;
        public static final java.lang.String RADIO_CELL = android.provider.Settings.System.RADIO_CELL;
        public static final java.lang.String RADIO_NFC = android.provider.Settings.System.RADIO_NFC;
        public static final java.lang.String RADIO_WIFI = android.provider.Settings.System.RADIO_WIFI;
        public static final java.lang.String RINGTONE = android.provider.Settings.System.RINGTONE;
        public static final java.lang.String SCREEN_BRIGHTNESS = android.provider.Settings.System.SCREEN_BRIGHTNESS;
        public static final java.lang.String SCREEN_BRIGHTNESS_MODE = android.provider.Settings.System.SCREEN_BRIGHTNESS_MODE;
        public static final int SCREEN_BRIGHTNESS_MODE_AUTOMATIC = android.provider.Settings.System.SCREEN_BRIGHTNESS_MODE_AUTOMATIC;
        public static final int SCREEN_BRIGHTNESS_MODE_MANUAL = android.provider.Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL;
        public static final java.lang.String SCREEN_OFF_TIMEOUT = android.provider.Settings.System.SCREEN_OFF_TIMEOUT;
        public static final java.lang.String SETTINGS_CLASSNAME = android.provider.Settings.System.SETTINGS_CLASSNAME;
        public static final java.lang.String SETUP_WIZARD_HAS_RUN = android.provider.Settings.System.SETUP_WIZARD_HAS_RUN;
        public static final java.lang.String SHOW_GTALK_SERVICE_STATUS = android.provider.Settings.System.SHOW_GTALK_SERVICE_STATUS;
        public static final java.lang.String SHOW_PROCESSES = android.provider.Settings.System.SHOW_PROCESSES;
        public static final java.lang.String SHOW_WEB_SUGGESTIONS = android.provider.Settings.System.SHOW_WEB_SUGGESTIONS;
        public static final java.lang.String SOUND_EFFECTS_ENABLED = android.provider.Settings.System.SOUND_EFFECTS_ENABLED;
        public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = android.provider.Settings.System.STAY_ON_WHILE_PLUGGED_IN;
        public static final java.lang.String TEXT_AUTO_CAPS = android.provider.Settings.System.TEXT_AUTO_CAPS;
        public static final java.lang.String TEXT_AUTO_PUNCTUATE = android.provider.Settings.System.TEXT_AUTO_PUNCTUATE;
        public static final java.lang.String TEXT_AUTO_REPLACE = android.provider.Settings.System.TEXT_AUTO_REPLACE;
        public static final java.lang.String TEXT_SHOW_PASSWORD = android.provider.Settings.System.TEXT_SHOW_PASSWORD;
        public static final java.lang.String TIME_12_24 = android.provider.Settings.System.TIME_12_24;
        public static final java.lang.String TRANSITION_ANIMATION_SCALE = android.provider.Settings.System.TRANSITION_ANIMATION_SCALE;
        public static final java.lang.String USB_MASS_STORAGE_ENABLED = android.provider.Settings.System.USB_MASS_STORAGE_ENABLED;
        public static final java.lang.String USER_ROTATION = android.provider.Settings.System.USER_ROTATION;
        public static final java.lang.String USE_GOOGLE_MAIL = android.provider.Settings.System.USE_GOOGLE_MAIL;
        public static final java.lang.String VIBRATE_ON = android.provider.Settings.System.VIBRATE_ON;
        public static final java.lang.String VIBRATE_WHEN_RINGING = android.provider.Settings.System.VIBRATE_WHEN_RINGING;
        public static final java.lang.String WAIT_FOR_DEBUGGER = android.provider.Settings.System.WAIT_FOR_DEBUGGER;
        public static final java.lang.String WALLPAPER_ACTIVITY = android.provider.Settings.System.WALLPAPER_ACTIVITY;
        public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = android.provider.Settings.System.WIFI_MAX_DHCP_RETRY_COUNT;
        public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = android.provider.Settings.System.WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS;
        public static final java.lang.String WIFI_ON = android.provider.Settings.System.WIFI_ON;
        public static final java.lang.String WIFI_SLEEP_POLICY = android.provider.Settings.System.WIFI_SLEEP_POLICY;
        public static final int WIFI_SLEEP_POLICY_DEFAULT = android.provider.Settings.System.WIFI_SLEEP_POLICY_DEFAULT;
        public static final int WIFI_SLEEP_POLICY_NEVER = android.provider.Settings.System.WIFI_SLEEP_POLICY_NEVER;
        public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = android.provider.Settings.System.WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED;
        public static final java.lang.String WIFI_STATIC_DNS1 = android.provider.Settings.System.WIFI_STATIC_DNS1;
        public static final java.lang.String WIFI_STATIC_DNS2 = android.provider.Settings.System.WIFI_STATIC_DNS2;
        public static final java.lang.String WIFI_STATIC_GATEWAY = android.provider.Settings.System.WIFI_STATIC_GATEWAY;
        public static final java.lang.String WIFI_STATIC_IP = android.provider.Settings.System.WIFI_STATIC_IP;
        public static final java.lang.String WIFI_STATIC_NETMASK = android.provider.Settings.System.WIFI_STATIC_NETMASK;
        public static final java.lang.String WIFI_USE_STATIC_IP = android.provider.Settings.System.WIFI_USE_STATIC_IP;
        public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = android.provider.Settings.System.WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE;
        public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = android.provider.Settings.System.WIFI_WATCHDOG_AP_COUNT;
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = android.provider.Settings.System.WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS;
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = android.provider.Settings.System.WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED;
        public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = android.provider.Settings.System.WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS;
        public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = android.provider.Settings.System.WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT;
        public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = android.provider.Settings.System.WIFI_WATCHDOG_MAX_AP_CHECKS;
        public static final java.lang.String WIFI_WATCHDOG_ON = android.provider.Settings.System.WIFI_WATCHDOG_ON;
        public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = android.provider.Settings.System.WIFI_WATCHDOG_PING_COUNT;
        public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = android.provider.Settings.System.WIFI_WATCHDOG_PING_DELAY_MS;
        public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = android.provider.Settings.System.WIFI_WATCHDOG_PING_TIMEOUT_MS;
        public static final java.lang.String WINDOW_ANIMATION_SCALE = android.provider.Settings.System.WINDOW_ANIMATION_SCALE;

    }
}
