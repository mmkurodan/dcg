// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Html {
    private final android.text.Html real;

    public Html(android.text.Html real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Html wrap(android.text.Html real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Html(real);
    }

    public android.text.Html unwrap() {
        return real;
    }

    public static java.lang.String escapeHtml(java.lang.CharSequence arg0) {
        return android.text.Html.escapeHtml(arg0);
    }

    public static com.micklab.dcg.wrapper.android.text.Spanned fromHtml(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.text.Spanned.wrap(android.text.Html.fromHtml(arg0));
    }

    public static com.micklab.dcg.wrapper.android.text.Spanned fromHtml(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.text.Spanned.wrap(android.text.Html.fromHtml(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.text.Spanned fromHtml(java.lang.String arg0, com.micklab.dcg.wrapper.android.text.Html.ImageGetter arg1, com.micklab.dcg.wrapper.android.text.Html.TagHandler arg2) {
        return com.micklab.dcg.wrapper.android.text.Spanned.wrap(android.text.Html.fromHtml(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.text.Spanned fromHtml(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.text.Html.ImageGetter arg2, com.micklab.dcg.wrapper.android.text.Html.TagHandler arg3) {
        return com.micklab.dcg.wrapper.android.text.Spanned.wrap(android.text.Html.fromHtml(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public static java.lang.String toHtml(com.micklab.dcg.wrapper.android.text.Spanned arg0) {
        return android.text.Html.toHtml(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String toHtml(com.micklab.dcg.wrapper.android.text.Spanned arg0, int arg1) {
        return android.text.Html.toHtml(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FROM_HTML_MODE_COMPACT = android.text.Html.FROM_HTML_MODE_COMPACT;
    public static final int FROM_HTML_MODE_LEGACY = android.text.Html.FROM_HTML_MODE_LEGACY;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = android.text.Html.FROM_HTML_OPTION_USE_CSS_COLORS;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = android.text.Html.FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = android.text.Html.FROM_HTML_SEPARATOR_LINE_BREAK_DIV;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = android.text.Html.FROM_HTML_SEPARATOR_LINE_BREAK_HEADING;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = android.text.Html.FROM_HTML_SEPARATOR_LINE_BREAK_LIST;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = android.text.Html.FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = android.text.Html.FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = android.text.Html.TO_HTML_PARAGRAPH_LINES_CONSECUTIVE;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = android.text.Html.TO_HTML_PARAGRAPH_LINES_INDIVIDUAL;

    public static final class ImageGetter {
        private final android.text.Html.ImageGetter real;

        public ImageGetter(android.text.Html.ImageGetter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Html.ImageGetter wrap(android.text.Html.ImageGetter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Html.ImageGetter(real);
        }

        public android.text.Html.ImageGetter unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDrawable(arg0));
        }

    }
    public static final class TagHandler {
        private final android.text.Html.TagHandler real;

        public TagHandler(android.text.Html.TagHandler real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Html.TagHandler wrap(android.text.Html.TagHandler real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Html.TagHandler(real);
        }

        public android.text.Html.TagHandler unwrap() {
            return real;
        }

        public void handleTag(boolean arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.text.Editable arg2, org.xml.sax.XMLReader arg3) {
            real.handleTag(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
        }

    }
}
