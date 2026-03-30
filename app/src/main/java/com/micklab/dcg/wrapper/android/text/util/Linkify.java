// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.util;

public final class Linkify {
    private final android.text.util.Linkify real;

    public Linkify(android.text.util.Linkify real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.util.Linkify wrap(android.text.util.Linkify real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.util.Linkify(real);
    }

    public android.text.util.Linkify unwrap() {
        return real;
    }

    public Linkify() {
        this(new android.text.util.Linkify());
    }

    public static boolean addLinks(com.micklab.dcg.wrapper.android.widget.TextView arg0, int arg1) {
        return android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static boolean addLinks(com.micklab.dcg.wrapper.android.text.Spannable arg0, int arg1) {
        return android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static boolean addLinks(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.util.regex.Pattern arg1, java.lang.String arg2) {
        return android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static void addLinks(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.util.regex.Pattern arg1, java.lang.String arg2) {
        android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static boolean addLinks(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.util.regex.Pattern arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter arg3, com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter arg4) {
        return android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public static void addLinks(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.util.regex.Pattern arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter arg3, com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter arg4) {
        android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public static boolean addLinks(com.micklab.dcg.wrapper.android.text.Spannable arg0, java.util.regex.Pattern arg1, java.lang.String arg2, java.lang.String[] arg3, com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter arg4, com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter arg5) {
        return android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
    }

    public static void addLinks(com.micklab.dcg.wrapper.android.widget.TextView arg0, java.util.regex.Pattern arg1, java.lang.String arg2, java.lang.String[] arg3, com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter arg4, com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter arg5) {
        android.text.util.Linkify.addLinks(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
    }

    public static final int ALL = android.text.util.Linkify.ALL;
    public static final int EMAIL_ADDRESSES = android.text.util.Linkify.EMAIL_ADDRESSES;
    public static final int MAP_ADDRESSES = android.text.util.Linkify.MAP_ADDRESSES;
    public static final int PHONE_NUMBERS = android.text.util.Linkify.PHONE_NUMBERS;
    public static final int WEB_URLS = android.text.util.Linkify.WEB_URLS;
    public static final com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter sPhoneNumberMatchFilter = com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter.wrap(android.text.util.Linkify.sPhoneNumberMatchFilter);
    public static final com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter sPhoneNumberTransformFilter = com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter.wrap(android.text.util.Linkify.sPhoneNumberTransformFilter);
    public static final com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter sUrlMatchFilter = com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter.wrap(android.text.util.Linkify.sUrlMatchFilter);

    public static final class MatchFilter {
        private final android.text.util.Linkify.MatchFilter real;

        public MatchFilter(android.text.util.Linkify.MatchFilter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter wrap(android.text.util.Linkify.MatchFilter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.util.Linkify.MatchFilter(real);
        }

        public android.text.util.Linkify.MatchFilter unwrap() {
            return real;
        }

        public boolean acceptMatch(java.lang.CharSequence arg0, int arg1, int arg2) {
            return real.acceptMatch(arg0, arg1, arg2);
        }

    }
    public static final class TransformFilter {
        private final android.text.util.Linkify.TransformFilter real;

        public TransformFilter(android.text.util.Linkify.TransformFilter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter wrap(android.text.util.Linkify.TransformFilter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.util.Linkify.TransformFilter(real);
        }

        public android.text.util.Linkify.TransformFilter unwrap() {
            return real;
        }

        public java.lang.String transformUrl(java.util.regex.Matcher arg0, java.lang.String arg1) {
            return real.transformUrl(arg0, arg1);
        }

    }
}
