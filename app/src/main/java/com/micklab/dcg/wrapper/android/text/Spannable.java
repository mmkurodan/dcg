// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Spannable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Spannable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Spannable wrap(android.text.Spannable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Spannable(real, (__DcgwBridgeToken) null);
    }

    public android.text.Spannable getReal() {
        return (android.text.Spannable) real;
    }

    public android.text.Spannable unwrap() {
        return getReal();
    }

    public void removeSpan(java.lang.Object arg0) {
        ((android.text.Spannable) real).removeSpan(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        ((android.text.Spannable) real).setSpan(arg0, arg1, arg2, arg3);
    }

    public static final class Factory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Factory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Spannable.Factory wrap(android.text.Spannable.Factory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Spannable.Factory(real, (__DcgwBridgeToken) null);
        }

        public android.text.Spannable.Factory getReal() {
            return (android.text.Spannable.Factory) real;
        }

        public android.text.Spannable.Factory unwrap() {
            return getReal();
        }

        public Factory() {
            this(new android.text.Spannable.Factory(), (__DcgwBridgeToken) null);
        }

        public static com.micklab.dcg.wrapper.android.text.Spannable.Factory getInstance() {
            return com.micklab.dcg.wrapper.android.text.Spannable.Factory.wrap(android.text.Spannable.Factory.getInstance());
        }

        public com.micklab.dcg.wrapper.android.text.Spannable newSpannable(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.text.Spannable.wrap(((android.text.Spannable.Factory) real).newSpannable(arg0));
        }

    }
}
