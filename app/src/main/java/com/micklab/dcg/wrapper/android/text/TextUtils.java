// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class TextUtils {
    private final android.text.TextUtils real;

    public TextUtils(android.text.TextUtils real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.TextUtils wrap(android.text.TextUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextUtils(real);
    }

    public android.text.TextUtils unwrap() {
        return real;
    }

    public static java.lang.CharSequence commaEllipsize(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, float arg2, java.lang.String arg3, java.lang.String arg4) {
        return android.text.TextUtils.commaEllipsize(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
    }

    public static java.lang.CharSequence concat(java.lang.CharSequence... arg0) {
        return android.text.TextUtils.concat(arg0);
    }

    public static void dumpSpans(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.util.Printer arg1, java.lang.String arg2) {
        android.text.TextUtils.dumpSpans(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static java.lang.CharSequence ellipsize(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, float arg2, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg3) {
        return android.text.TextUtils.ellipsize(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public static java.lang.CharSequence ellipsize(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.text.TextPaint arg1, float arg2, com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt arg3, boolean arg4, com.micklab.dcg.wrapper.android.text.TextUtils.EllipsizeCallback arg5) {
        return android.text.TextUtils.ellipsize(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public static boolean equals(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return android.text.TextUtils.equals(arg0, arg1);
    }

    public static java.lang.CharSequence expandTemplate(java.lang.CharSequence arg0, java.lang.CharSequence... arg1) {
        return android.text.TextUtils.expandTemplate(arg0, arg1);
    }

    public static int getCapsMode(java.lang.CharSequence arg0, int arg1, int arg2) {
        return android.text.TextUtils.getCapsMode(arg0, arg1, arg2);
    }

    public static void getChars(java.lang.CharSequence arg0, int arg1, int arg2, char[] arg3, int arg4) {
        android.text.TextUtils.getChars(arg0, arg1, arg2, arg3, arg4);
    }

    public static int getLayoutDirectionFromLocale(java.util.Locale arg0) {
        return android.text.TextUtils.getLayoutDirectionFromLocale(arg0);
    }

    public static int getOffsetAfter(java.lang.CharSequence arg0, int arg1) {
        return android.text.TextUtils.getOffsetAfter(arg0, arg1);
    }

    public static int getOffsetBefore(java.lang.CharSequence arg0, int arg1) {
        return android.text.TextUtils.getOffsetBefore(arg0, arg1);
    }

    public static java.lang.CharSequence getReverse(java.lang.CharSequence arg0, int arg1, int arg2) {
        return android.text.TextUtils.getReverse(arg0, arg1, arg2);
    }

    public static int getTrimmedLength(java.lang.CharSequence arg0) {
        return android.text.TextUtils.getTrimmedLength(arg0);
    }

    public static java.lang.String htmlEncode(java.lang.String arg0) {
        return android.text.TextUtils.htmlEncode(arg0);
    }

    public static int indexOf(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return android.text.TextUtils.indexOf(arg0, arg1);
    }

    public static int indexOf(java.lang.CharSequence arg0, char arg1) {
        return android.text.TextUtils.indexOf(arg0, arg1);
    }

    public static int indexOf(java.lang.CharSequence arg0, java.lang.CharSequence arg1, int arg2) {
        return android.text.TextUtils.indexOf(arg0, arg1, arg2);
    }

    public static int indexOf(java.lang.CharSequence arg0, char arg1, int arg2) {
        return android.text.TextUtils.indexOf(arg0, arg1, arg2);
    }

    public static int indexOf(java.lang.CharSequence arg0, java.lang.CharSequence arg1, int arg2, int arg3) {
        return android.text.TextUtils.indexOf(arg0, arg1, arg2, arg3);
    }

    public static int indexOf(java.lang.CharSequence arg0, char arg1, int arg2, int arg3) {
        return android.text.TextUtils.indexOf(arg0, arg1, arg2, arg3);
    }

    public static boolean isDigitsOnly(java.lang.CharSequence arg0) {
        return android.text.TextUtils.isDigitsOnly(arg0);
    }

    public static boolean isEmpty(java.lang.CharSequence arg0) {
        return android.text.TextUtils.isEmpty(arg0);
    }

    public static boolean isGraphic(char arg0) {
        return android.text.TextUtils.isGraphic(arg0);
    }

    public static boolean isGraphic(java.lang.CharSequence arg0) {
        return android.text.TextUtils.isGraphic(arg0);
    }

    public static java.lang.String join(java.lang.CharSequence arg0, java.lang.Object[] arg1) {
        return android.text.TextUtils.join(arg0, arg1);
    }

    public static int lastIndexOf(java.lang.CharSequence arg0, char arg1) {
        return android.text.TextUtils.lastIndexOf(arg0, arg1);
    }

    public static int lastIndexOf(java.lang.CharSequence arg0, char arg1, int arg2) {
        return android.text.TextUtils.lastIndexOf(arg0, arg1, arg2);
    }

    public static int lastIndexOf(java.lang.CharSequence arg0, char arg1, int arg2, int arg3) {
        return android.text.TextUtils.lastIndexOf(arg0, arg1, arg2, arg3);
    }

    public static java.lang.CharSequence makeSafeForPresentation(java.lang.String arg0, int arg1, float arg2, int arg3) {
        return android.text.TextUtils.makeSafeForPresentation(arg0, arg1, arg2, arg3);
    }

    public static boolean regionMatches(java.lang.CharSequence arg0, int arg1, java.lang.CharSequence arg2, int arg3, int arg4) {
        return android.text.TextUtils.regionMatches(arg0, arg1, arg2, arg3, arg4);
    }

    public static java.lang.CharSequence replace(java.lang.CharSequence arg0, java.lang.String[] arg1, java.lang.CharSequence[] arg2) {
        return android.text.TextUtils.replace(arg0, arg1, arg2);
    }

    public static java.lang.String[] split(java.lang.String arg0, java.lang.String arg1) {
        return android.text.TextUtils.split(arg0, arg1);
    }

    public static java.lang.String[] split(java.lang.String arg0, java.util.regex.Pattern arg1) {
        return android.text.TextUtils.split(arg0, arg1);
    }

    public static java.lang.CharSequence stringOrSpannedString(java.lang.CharSequence arg0) {
        return android.text.TextUtils.stringOrSpannedString(arg0);
    }

    public static java.lang.String substring(java.lang.CharSequence arg0, int arg1, int arg2) {
        return android.text.TextUtils.substring(arg0, arg1, arg2);
    }

    public static void writeToParcel(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1, int arg2) {
        android.text.TextUtils.writeToParcel(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final int CAP_MODE_CHARACTERS = android.text.TextUtils.CAP_MODE_CHARACTERS;
    public static final int CAP_MODE_SENTENCES = android.text.TextUtils.CAP_MODE_SENTENCES;
    public static final int CAP_MODE_WORDS = android.text.TextUtils.CAP_MODE_WORDS;
    public static final int SAFE_STRING_FLAG_FIRST_LINE = android.text.TextUtils.SAFE_STRING_FLAG_FIRST_LINE;
    public static final int SAFE_STRING_FLAG_SINGLE_LINE = android.text.TextUtils.SAFE_STRING_FLAG_SINGLE_LINE;
    public static final int SAFE_STRING_FLAG_TRIM = android.text.TextUtils.SAFE_STRING_FLAG_TRIM;

    public static final class EllipsizeCallback {
        private final android.text.TextUtils.EllipsizeCallback real;

        public EllipsizeCallback(android.text.TextUtils.EllipsizeCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.TextUtils.EllipsizeCallback wrap(android.text.TextUtils.EllipsizeCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextUtils.EllipsizeCallback(real);
        }

        public android.text.TextUtils.EllipsizeCallback unwrap() {
            return real;
        }

        public void ellipsized(int arg0, int arg1) {
            real.ellipsized(arg0, arg1);
        }

    }
    public static final class SimpleStringSplitter {
        private final android.text.TextUtils.SimpleStringSplitter real;

        public SimpleStringSplitter(android.text.TextUtils.SimpleStringSplitter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.TextUtils.SimpleStringSplitter wrap(android.text.TextUtils.SimpleStringSplitter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextUtils.SimpleStringSplitter(real);
        }

        public android.text.TextUtils.SimpleStringSplitter unwrap() {
            return real;
        }

        public SimpleStringSplitter(char arg0) {
            this(new android.text.TextUtils.SimpleStringSplitter(arg0));
        }

        public boolean hasNext() {
            return real.hasNext();
        }

        public java.lang.String next() {
            return real.next();
        }

        public void remove() {
            real.remove();
        }

        public void setString(java.lang.String arg0) {
            real.setString(arg0);
        }

    }
    public static final class StringSplitter {
        private final android.text.TextUtils.StringSplitter real;

        public StringSplitter(android.text.TextUtils.StringSplitter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.TextUtils.StringSplitter wrap(android.text.TextUtils.StringSplitter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextUtils.StringSplitter(real);
        }

        public android.text.TextUtils.StringSplitter unwrap() {
            return real;
        }

        public void setString(java.lang.String arg0) {
            real.setString(arg0);
        }

    }
    public static final class TruncateAt {
        private final android.text.TextUtils.TruncateAt real;

        public TruncateAt(android.text.TextUtils.TruncateAt real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt wrap(android.text.TextUtils.TruncateAt real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt(real);
        }

        public android.text.TextUtils.TruncateAt unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(android.text.TextUtils.TruncateAt.valueOf(arg0));
        }

        public static android.text.TextUtils.TruncateAt[] values() {
            return android.text.TextUtils.TruncateAt.values();
        }

        public static final com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt END = com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(android.text.TextUtils.TruncateAt.END);
        public static final com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt MARQUEE = com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(android.text.TextUtils.TruncateAt.MARQUEE);
        public static final com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt MIDDLE = com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(android.text.TextUtils.TruncateAt.MIDDLE);
        public static final com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt START = com.micklab.dcg.wrapper.android.text.TextUtils.TruncateAt.wrap(android.text.TextUtils.TruncateAt.START);

    }
}
