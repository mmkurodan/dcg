// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebIconDatabase {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebIconDatabase(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebIconDatabase wrap(android.webkit.WebIconDatabase real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebIconDatabase(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebIconDatabase getReal() {
        return (android.webkit.WebIconDatabase) real;
    }

    public android.webkit.WebIconDatabase unwrap() {
        return getReal();
    }

    public void close() {
        ((android.webkit.WebIconDatabase) real).close();
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebIconDatabase getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.wrap(android.webkit.WebIconDatabase.getInstance());
    }

    public void open(java.lang.String arg0) {
        ((android.webkit.WebIconDatabase) real).open(arg0);
    }

    public void releaseIconForPageUrl(java.lang.String arg0) {
        ((android.webkit.WebIconDatabase) real).releaseIconForPageUrl(arg0);
    }

    public void removeAllIcons() {
        ((android.webkit.WebIconDatabase) real).removeAllIcons();
    }

    public void requestIconForPageUrl(java.lang.String arg0, com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.IconListener arg1) {
        ((android.webkit.WebIconDatabase) real).requestIconForPageUrl(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void retainIconForPageUrl(java.lang.String arg0) {
        ((android.webkit.WebIconDatabase) real).retainIconForPageUrl(arg0);
    }

    public static final class IconListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private IconListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.IconListener wrap(android.webkit.WebIconDatabase.IconListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.IconListener(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebIconDatabase.IconListener getReal() {
            return (android.webkit.WebIconDatabase.IconListener) real;
        }

        public android.webkit.WebIconDatabase.IconListener unwrap() {
            return getReal();
        }

        public void onReceivedIcon(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
            ((android.webkit.WebIconDatabase.IconListener) real).onReceivedIcon(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
}
