// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Presentations {
    private final android.service.autofill.Presentations real;

    public Presentations(android.service.autofill.Presentations real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Presentations wrap(android.service.autofill.Presentations real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Presentations(real);
    }

    public android.service.autofill.Presentations unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViews getDialogPresentation() {
        return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.getDialogPresentation());
    }

    public com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation getInlinePresentation() {
        return com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation.wrap(real.getInlinePresentation());
    }

    public com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation getInlineTooltipPresentation() {
        return com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation.wrap(real.getInlineTooltipPresentation());
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViews getMenuPresentation() {
        return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.getMenuPresentation());
    }

    public static final class Builder {
        private final android.service.autofill.Presentations.Builder real;

        public Builder(android.service.autofill.Presentations.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder wrap(android.service.autofill.Presentations.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder(real);
        }

        public android.service.autofill.Presentations.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.autofill.Presentations.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations build() {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setDialogPresentation(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(real.setDialogPresentation(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setInlinePresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(real.setInlinePresentation(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setInlineTooltipPresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(real.setInlineTooltipPresentation(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setMenuPresentation(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(real.setMenuPresentation(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
