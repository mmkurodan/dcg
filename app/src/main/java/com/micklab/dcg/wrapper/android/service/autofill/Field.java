// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Field {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Field(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Field wrap(android.service.autofill.Field real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Field(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.Field getReal() {
        return (android.service.autofill.Field) real;
    }

    public android.service.autofill.Field unwrap() {
        return getReal();
    }

    public java.util.regex.Pattern getFilter() {
        return ((android.service.autofill.Field) real).getFilter();
    }

    public com.micklab.dcg.wrapper.android.service.autofill.Presentations getPresentations() {
        return com.micklab.dcg.wrapper.android.service.autofill.Presentations.wrap(((android.service.autofill.Field) real).getPresentations());
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.service.autofill.Field) real).getValue());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.Field.Builder wrap(android.service.autofill.Field.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Field.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.Field.Builder getReal() {
            return (android.service.autofill.Field.Builder) real;
        }

        public android.service.autofill.Field.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.autofill.Field.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field build() {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.wrap(((android.service.autofill.Field.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field.Builder setFilter(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.Builder.wrap(((android.service.autofill.Field.Builder) real).setFilter(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field.Builder setPresentations(com.micklab.dcg.wrapper.android.service.autofill.Presentations arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.Builder.wrap(((android.service.autofill.Field.Builder) real).setPresentations(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.Builder.wrap(((android.service.autofill.Field.Builder) real).setValue(arg0 == null ? null : arg0.getReal()));
        }

    }
}
