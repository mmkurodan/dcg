// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Field {
    private final android.service.autofill.Field real;

    public Field(android.service.autofill.Field real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Field wrap(android.service.autofill.Field real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Field(real);
    }

    public android.service.autofill.Field unwrap() {
        return real;
    }

    public java.util.regex.Pattern getFilter() {
        return real.getFilter();
    }

    public com.micklab.dcg.wrapper.android.service.autofill.Presentations getPresentations() {
        return com.micklab.dcg.wrapper.android.service.autofill.Presentations.wrap(real.getPresentations());
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getValue());
    }

    public static final class Builder {
        private final android.service.autofill.Field.Builder real;

        public Builder(android.service.autofill.Field.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.Field.Builder wrap(android.service.autofill.Field.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Field.Builder(real);
        }

        public android.service.autofill.Field.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.autofill.Field.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field build() {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field.Builder setFilter(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.Builder.wrap(real.setFilter(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field.Builder setPresentations(com.micklab.dcg.wrapper.android.service.autofill.Presentations arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.Builder.wrap(real.setPresentations(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Field.Builder setValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Field.Builder.wrap(real.setValue(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
