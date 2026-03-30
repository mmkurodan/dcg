// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class Editable {
    private final android.text.Editable real;

    public Editable(android.text.Editable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.Editable wrap(android.text.Editable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.Editable(real);
    }

    public android.text.Editable unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.text.Editable append(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.Editable append(char arg0) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.append(arg0));
    }

    public com.micklab.dcg.wrapper.android.text.Editable append(java.lang.CharSequence arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.append(arg0, arg1, arg2));
    }

    public void clear() {
        real.clear();
    }

    public void clearSpans() {
        real.clearSpans();
    }

    public com.micklab.dcg.wrapper.android.text.Editable delete(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.delete(arg0, arg1));
    }

    public android.text.InputFilter[] getFilters() {
        return real.getFilters();
    }

    public com.micklab.dcg.wrapper.android.text.Editable insert(int arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.insert(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.text.Editable insert(int arg0, java.lang.CharSequence arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.insert(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.text.Editable replace(int arg0, int arg1, java.lang.CharSequence arg2) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.replace(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.text.Editable replace(int arg0, int arg1, java.lang.CharSequence arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.replace(arg0, arg1, arg2, arg3, arg4));
    }

    public void setFilters(android.text.InputFilter[] arg0) {
        real.setFilters(arg0);
    }

    public static final class Factory {
        private final android.text.Editable.Factory real;

        public Factory(android.text.Editable.Factory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.Editable.Factory wrap(android.text.Editable.Factory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.Editable.Factory(real);
        }

        public android.text.Editable.Factory unwrap() {
            return real;
        }

        public Factory() {
            this(new android.text.Editable.Factory());
        }

        public static com.micklab.dcg.wrapper.android.text.Editable.Factory getInstance() {
            return com.micklab.dcg.wrapper.android.text.Editable.Factory.wrap(android.text.Editable.Factory.getInstance());
        }

        public com.micklab.dcg.wrapper.android.text.Editable newEditable(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.text.Editable.wrap(real.newEditable(arg0));
        }

    }
}
