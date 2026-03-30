// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class SearchManager {
    private final android.app.SearchManager real;

    public SearchManager(android.app.SearchManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.SearchManager wrap(android.app.SearchManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.SearchManager(real);
    }

    public android.app.SearchManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getGlobalSearchActivity() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getGlobalSearchActivity());
    }

    public com.micklab.dcg.wrapper.android.app.SearchableInfo getSearchableInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.app.SearchableInfo.wrap(real.getSearchableInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCancel(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        real.onCancel(arg0 == null ? null : arg0.unwrap());
    }

    public void onDismiss(com.micklab.dcg.wrapper.android.content.DialogInterface arg0) {
        real.onDismiss(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnCancelListener(com.micklab.dcg.wrapper.android.app.SearchManager.OnCancelListener arg0) {
        real.setOnCancelListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.app.SearchManager.OnDismissListener arg0) {
        real.setOnDismissListener(arg0 == null ? null : arg0.unwrap());
    }

    public void startSearch(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.content.ComponentName arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3, boolean arg4) {
        real.startSearch(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4);
    }

    public void stopSearch() {
        real.stopSearch();
    }

    public void triggerSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.triggerSearch(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static final java.lang.String ACTION_KEY = android.app.SearchManager.ACTION_KEY;
    public static final java.lang.String ACTION_MSG = android.app.SearchManager.ACTION_MSG;
    public static final java.lang.String APP_DATA = android.app.SearchManager.APP_DATA;
    public static final java.lang.String CURSOR_EXTRA_KEY_IN_PROGRESS = android.app.SearchManager.CURSOR_EXTRA_KEY_IN_PROGRESS;
    public static final java.lang.String EXTRA_DATA_KEY = android.app.SearchManager.EXTRA_DATA_KEY;
    public static final java.lang.String EXTRA_NEW_SEARCH = android.app.SearchManager.EXTRA_NEW_SEARCH;
    public static final java.lang.String EXTRA_SELECT_QUERY = android.app.SearchManager.EXTRA_SELECT_QUERY;
    public static final java.lang.String EXTRA_WEB_SEARCH_PENDINGINTENT = android.app.SearchManager.EXTRA_WEB_SEARCH_PENDINGINTENT;
    public static final int FLAG_QUERY_REFINEMENT = android.app.SearchManager.FLAG_QUERY_REFINEMENT;
    public static final java.lang.String INTENT_ACTION_GLOBAL_SEARCH = android.app.SearchManager.INTENT_ACTION_GLOBAL_SEARCH;
    public static final java.lang.String INTENT_ACTION_SEARCHABLES_CHANGED = android.app.SearchManager.INTENT_ACTION_SEARCHABLES_CHANGED;
    public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS = android.app.SearchManager.INTENT_ACTION_SEARCH_SETTINGS;
    public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS_CHANGED = android.app.SearchManager.INTENT_ACTION_SEARCH_SETTINGS_CHANGED;
    public static final java.lang.String INTENT_ACTION_WEB_SEARCH_SETTINGS = android.app.SearchManager.INTENT_ACTION_WEB_SEARCH_SETTINGS;
    public static final java.lang.String INTENT_GLOBAL_SEARCH_ACTIVITY_CHANGED = android.app.SearchManager.INTENT_GLOBAL_SEARCH_ACTIVITY_CHANGED;
    public static final char MENU_KEY = android.app.SearchManager.MENU_KEY;
    public static final int MENU_KEYCODE = android.app.SearchManager.MENU_KEYCODE;
    public static final java.lang.String QUERY = android.app.SearchManager.QUERY;
    public static final java.lang.String SHORTCUT_MIME_TYPE = android.app.SearchManager.SHORTCUT_MIME_TYPE;
    public static final java.lang.String SUGGEST_COLUMN_AUDIO_CHANNEL_CONFIG = android.app.SearchManager.SUGGEST_COLUMN_AUDIO_CHANNEL_CONFIG;
    public static final java.lang.String SUGGEST_COLUMN_CONTENT_TYPE = android.app.SearchManager.SUGGEST_COLUMN_CONTENT_TYPE;
    public static final java.lang.String SUGGEST_COLUMN_DURATION = android.app.SearchManager.SUGGEST_COLUMN_DURATION;
    public static final java.lang.String SUGGEST_COLUMN_FLAGS = android.app.SearchManager.SUGGEST_COLUMN_FLAGS;
    public static final java.lang.String SUGGEST_COLUMN_FORMAT = android.app.SearchManager.SUGGEST_COLUMN_FORMAT;
    public static final java.lang.String SUGGEST_COLUMN_ICON_1 = android.app.SearchManager.SUGGEST_COLUMN_ICON_1;
    public static final java.lang.String SUGGEST_COLUMN_ICON_2 = android.app.SearchManager.SUGGEST_COLUMN_ICON_2;
    public static final java.lang.String SUGGEST_COLUMN_INTENT_ACTION = android.app.SearchManager.SUGGEST_COLUMN_INTENT_ACTION;
    public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA = android.app.SearchManager.SUGGEST_COLUMN_INTENT_DATA;
    public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA_ID = android.app.SearchManager.SUGGEST_COLUMN_INTENT_DATA_ID;
    public static final java.lang.String SUGGEST_COLUMN_INTENT_EXTRA_DATA = android.app.SearchManager.SUGGEST_COLUMN_INTENT_EXTRA_DATA;
    public static final java.lang.String SUGGEST_COLUMN_IS_LIVE = android.app.SearchManager.SUGGEST_COLUMN_IS_LIVE;
    public static final java.lang.String SUGGEST_COLUMN_LAST_ACCESS_HINT = android.app.SearchManager.SUGGEST_COLUMN_LAST_ACCESS_HINT;
    public static final java.lang.String SUGGEST_COLUMN_PRODUCTION_YEAR = android.app.SearchManager.SUGGEST_COLUMN_PRODUCTION_YEAR;
    public static final java.lang.String SUGGEST_COLUMN_PURCHASE_PRICE = android.app.SearchManager.SUGGEST_COLUMN_PURCHASE_PRICE;
    public static final java.lang.String SUGGEST_COLUMN_QUERY = android.app.SearchManager.SUGGEST_COLUMN_QUERY;
    public static final java.lang.String SUGGEST_COLUMN_RATING_SCORE = android.app.SearchManager.SUGGEST_COLUMN_RATING_SCORE;
    public static final java.lang.String SUGGEST_COLUMN_RATING_STYLE = android.app.SearchManager.SUGGEST_COLUMN_RATING_STYLE;
    public static final java.lang.String SUGGEST_COLUMN_RENTAL_PRICE = android.app.SearchManager.SUGGEST_COLUMN_RENTAL_PRICE;
    public static final java.lang.String SUGGEST_COLUMN_RESULT_CARD_IMAGE = android.app.SearchManager.SUGGEST_COLUMN_RESULT_CARD_IMAGE;
    public static final java.lang.String SUGGEST_COLUMN_SHORTCUT_ID = android.app.SearchManager.SUGGEST_COLUMN_SHORTCUT_ID;
    public static final java.lang.String SUGGEST_COLUMN_SPINNER_WHILE_REFRESHING = android.app.SearchManager.SUGGEST_COLUMN_SPINNER_WHILE_REFRESHING;
    public static final java.lang.String SUGGEST_COLUMN_TEXT_1 = android.app.SearchManager.SUGGEST_COLUMN_TEXT_1;
    public static final java.lang.String SUGGEST_COLUMN_TEXT_2 = android.app.SearchManager.SUGGEST_COLUMN_TEXT_2;
    public static final java.lang.String SUGGEST_COLUMN_TEXT_2_URL = android.app.SearchManager.SUGGEST_COLUMN_TEXT_2_URL;
    public static final java.lang.String SUGGEST_COLUMN_VIDEO_HEIGHT = android.app.SearchManager.SUGGEST_COLUMN_VIDEO_HEIGHT;
    public static final java.lang.String SUGGEST_COLUMN_VIDEO_WIDTH = android.app.SearchManager.SUGGEST_COLUMN_VIDEO_WIDTH;
    public static final java.lang.String SUGGEST_MIME_TYPE = android.app.SearchManager.SUGGEST_MIME_TYPE;
    public static final java.lang.String SUGGEST_NEVER_MAKE_SHORTCUT = android.app.SearchManager.SUGGEST_NEVER_MAKE_SHORTCUT;
    public static final java.lang.String SUGGEST_PARAMETER_LIMIT = android.app.SearchManager.SUGGEST_PARAMETER_LIMIT;
    public static final java.lang.String SUGGEST_URI_PATH_QUERY = android.app.SearchManager.SUGGEST_URI_PATH_QUERY;
    public static final java.lang.String SUGGEST_URI_PATH_SHORTCUT = android.app.SearchManager.SUGGEST_URI_PATH_SHORTCUT;
    public static final java.lang.String USER_QUERY = android.app.SearchManager.USER_QUERY;

    public static final class OnCancelListener {
        private final android.app.SearchManager.OnCancelListener real;

        public OnCancelListener(android.app.SearchManager.OnCancelListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.SearchManager.OnCancelListener wrap(android.app.SearchManager.OnCancelListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.SearchManager.OnCancelListener(real);
        }

        public android.app.SearchManager.OnCancelListener unwrap() {
            return real;
        }

        public void onCancel() {
            real.onCancel();
        }

    }
    public static final class OnDismissListener {
        private final android.app.SearchManager.OnDismissListener real;

        public OnDismissListener(android.app.SearchManager.OnDismissListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.SearchManager.OnDismissListener wrap(android.app.SearchManager.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.SearchManager.OnDismissListener(real);
        }

        public android.app.SearchManager.OnDismissListener unwrap() {
            return real;
        }

        public void onDismiss() {
            real.onDismiss();
        }

    }
}
