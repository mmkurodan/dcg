// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Spannable {
    private final android.text.Spannable real;

    public Spannable(android.text.Spannable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Spannable wrap(android.text.Spannable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Spannable(real);
    }

    public android.text.Spannable unwrap() {
        return real;
    }

    public void removeSpan(java.lang.Object arg0) {
        real.removeSpan(arg0);
    }

    public void setSpan(java.lang.Object arg0, int arg1, int arg2, int arg3) {
        real.setSpan(arg0, arg1, arg2, arg3);
    }

    public static final class Factory {
        private final android.text.Spannable.Factory real;

        public Factory(android.text.Spannable.Factory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Spannable.Factory wrap(android.text.Spannable.Factory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Spannable.Factory(real);
        }

        public android.text.Spannable.Factory unwrap() {
            return real;
        }

        public Factory() {
            this(new android.text.Spannable.Factory());
        }

        public static com.micklab.dcg.wrapper.android.text.Spannable.Factory getInstance() {
            return com.micklab.dcg.wrapper.android.text.Spannable.Factory.wrap(android.text.Spannable.Factory.getInstance());
        }

        public com.micklab.dcg.wrapper.android.text.Spannable newSpannable(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.text.Spannable.wrap(real.newSpannable(arg0));
        }

    }
}
