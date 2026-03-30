// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class UserDictionary {
    private final android.provider.UserDictionary real;

    public UserDictionary(android.provider.UserDictionary real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.UserDictionary wrap(android.provider.UserDictionary real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.UserDictionary(real);
    }

    public android.provider.UserDictionary unwrap() {
        return real;
    }

    public UserDictionary() {
        this(new android.provider.UserDictionary());
    }

    public static final java.lang.String AUTHORITY = android.provider.UserDictionary.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.UserDictionary.CONTENT_URI);

    public static final class Words {
        private final android.provider.UserDictionary.Words real;

        public Words(android.provider.UserDictionary.Words real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.UserDictionary.Words wrap(android.provider.UserDictionary.Words real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.UserDictionary.Words(real);
        }

        public android.provider.UserDictionary.Words unwrap() {
            return real;
        }

        public Words() {
            this(new android.provider.UserDictionary.Words());
        }

        public static void addWord(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2, int arg3) {
            android.provider.UserDictionary.Words.addWord(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

        public static void addWord(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.util.Locale arg4) {
            android.provider.UserDictionary.Words.addWord(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
        }

        public static final java.lang.String APP_ID = android.provider.UserDictionary.Words.APP_ID;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.UserDictionary.Words.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.UserDictionary.Words.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.UserDictionary.Words.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.UserDictionary.Words.DEFAULT_SORT_ORDER;
        public static final java.lang.String FREQUENCY = android.provider.UserDictionary.Words.FREQUENCY;
        public static final java.lang.String LOCALE = android.provider.UserDictionary.Words.LOCALE;
        public static final int LOCALE_TYPE_ALL = android.provider.UserDictionary.Words.LOCALE_TYPE_ALL;
        public static final int LOCALE_TYPE_CURRENT = android.provider.UserDictionary.Words.LOCALE_TYPE_CURRENT;
        public static final java.lang.String SHORTCUT = android.provider.UserDictionary.Words.SHORTCUT;
        public static final java.lang.String WORD = android.provider.UserDictionary.Words.WORD;
        public static final java.lang.String _ID = android.provider.UserDictionary.Words._ID;

    }
}
