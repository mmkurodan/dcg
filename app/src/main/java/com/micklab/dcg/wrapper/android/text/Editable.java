// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Editable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Editable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Editable wrap(android.text.Editable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Editable(real, (__DcgwBridgeToken) null);
    }

    public android.text.Editable getReal() {
        return (android.text.Editable) real;
    }

    public android.text.Editable unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.text.Editable append(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.Editable append(char arg0) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.Editable append(java.lang.CharSequence arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).append(arg0, arg1, arg2));
    }

    public void clear() {
        ((android.text.Editable) real).clear();
    }

    public void clearSpans() {
        ((android.text.Editable) real).clearSpans();
    }

    public com.micklab.dcg.wrapper.android.text.Editable delete(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).delete(arg0, arg1));
    }

    public android.text.InputFilter[] getFilters() {
        return ((android.text.Editable) real).getFilters();
    }

    public com.micklab.dcg.wrapper.android.text.Editable insert(int arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).insert(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.text.Editable insert(int arg0, java.lang.CharSequence arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).insert(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.text.Editable replace(int arg0, int arg1, java.lang.CharSequence arg2) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).replace(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.text.Editable replace(int arg0, int arg1, java.lang.CharSequence arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable) real).replace(arg0, arg1, arg2, arg3, arg4));
    }

    public void setFilters(android.text.InputFilter[] arg0) {
        ((android.text.Editable) real).setFilters(arg0);
    }

    public static final class Factory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Factory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Editable.Factory wrap(android.text.Editable.Factory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Editable.Factory(real, (__DcgwBridgeToken) null);
        }

        public android.text.Editable.Factory getReal() {
            return (android.text.Editable.Factory) real;
        }

        public android.text.Editable.Factory unwrap() {
            return getReal();
        }

        public Factory() {
            this(new android.text.Editable.Factory(), (__DcgwBridgeToken) null);
        }

        public static com.micklab.dcg.wrapper.android.text.Editable.Factory getInstance() {
            return com.micklab.dcg.wrapper.android.text.Editable.Factory.wrap(android.text.Editable.Factory.getInstance());
        }

        public com.micklab.dcg.wrapper.android.text.Editable newEditable(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.text.Editable.wrap(((android.text.Editable.Factory) real).newEditable(arg0));
        }

    }
}
