// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebIconDatabase {
    private final android.webkit.WebIconDatabase real;

    public WebIconDatabase(android.webkit.WebIconDatabase real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebIconDatabase wrap(android.webkit.WebIconDatabase real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebIconDatabase(real);
    }

    public android.webkit.WebIconDatabase unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebIconDatabase getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.wrap(android.webkit.WebIconDatabase.getInstance());
    }

    public void open(java.lang.String arg0) {
        real.open(arg0);
    }

    public void releaseIconForPageUrl(java.lang.String arg0) {
        real.releaseIconForPageUrl(arg0);
    }

    public void removeAllIcons() {
        real.removeAllIcons();
    }

    public void requestIconForPageUrl(java.lang.String arg0, com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.IconListener arg1) {
        real.requestIconForPageUrl(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void retainIconForPageUrl(java.lang.String arg0) {
        real.retainIconForPageUrl(arg0);
    }

    public static final class IconListener {
        private final android.webkit.WebIconDatabase.IconListener real;

        public IconListener(android.webkit.WebIconDatabase.IconListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.IconListener wrap(android.webkit.WebIconDatabase.IconListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebIconDatabase.IconListener(real);
        }

        public android.webkit.WebIconDatabase.IconListener unwrap() {
            return real;
        }

        public void onReceivedIcon(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
            real.onReceivedIcon(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
}
