// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Html {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Html(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Html wrap(android.text.Html real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Html(real, (__DcgwBridgeToken) null);
    }

    public android.text.Html getReal() {
        return (android.text.Html) real;
    }

    public android.text.Html unwrap() {
        return getReal();
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
        return com.micklab.dcg.wrapper.android.text.Spanned.wrap(android.text.Html.fromHtml(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.text.Spanned fromHtml(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.text.Html.ImageGetter arg2, com.micklab.dcg.wrapper.android.text.Html.TagHandler arg3) {
        return com.micklab.dcg.wrapper.android.text.Spanned.wrap(android.text.Html.fromHtml(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public static java.lang.String toHtml(com.micklab.dcg.wrapper.android.text.Spanned arg0) {
        return android.text.Html.toHtml(arg0 == null ? null : arg0.getReal());
    }

    public static java.lang.String toHtml(com.micklab.dcg.wrapper.android.text.Spanned arg0, int arg1) {
        return android.text.Html.toHtml(arg0 == null ? null : arg0.getReal(), arg1);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ImageGetter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Html.ImageGetter wrap(android.text.Html.ImageGetter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Html.ImageGetter(real, (__DcgwBridgeToken) null);
        }

        public android.text.Html.ImageGetter getReal() {
            return (android.text.Html.ImageGetter) real;
        }

        public android.text.Html.ImageGetter unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.text.Html.ImageGetter) real).getDrawable(arg0));
        }

    }
    public static final class TagHandler {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TagHandler(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Html.TagHandler wrap(android.text.Html.TagHandler real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Html.TagHandler(real, (__DcgwBridgeToken) null);
        }

        public android.text.Html.TagHandler getReal() {
            return (android.text.Html.TagHandler) real;
        }

        public android.text.Html.TagHandler unwrap() {
            return getReal();
        }

        public void handleTag(boolean arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.text.Editable arg2, org.xml.sax.XMLReader arg3) {
            ((android.text.Html.TagHandler) real).handleTag(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
        }

    }
}
