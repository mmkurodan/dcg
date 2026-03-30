// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Presentations {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Presentations(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Presentations wrap(android.service.autofill.Presentations real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Presentations(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.Presentations getReal() {
        return (android.service.autofill.Presentations) real;
    }

    public android.service.autofill.Presentations unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViews getDialogPresentation() {
        return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.service.autofill.Presentations) real).getDialogPresentation());
    }

    public com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation getInlinePresentation() {
        return com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation.wrap(((android.service.autofill.Presentations) real).getInlinePresentation());
    }

    public com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation getInlineTooltipPresentation() {
        return com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation.wrap(((android.service.autofill.Presentations) real).getInlineTooltipPresentation());
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViews getMenuPresentation() {
        return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.service.autofill.Presentations) real).getMenuPresentation());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder wrap(android.service.autofill.Presentations.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.autofill.Presentations.Builder getReal() {
            return (android.service.autofill.Presentations.Builder) real;
        }

        public android.service.autofill.Presentations.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.autofill.Presentations.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations build() {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.wrap(((android.service.autofill.Presentations.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setDialogPresentation(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(((android.service.autofill.Presentations.Builder) real).setDialogPresentation(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setInlinePresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(((android.service.autofill.Presentations.Builder) real).setInlinePresentation(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setInlineTooltipPresentation(com.micklab.dcg.wrapper.android.service.autofill.InlinePresentation arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(((android.service.autofill.Presentations.Builder) real).setInlineTooltipPresentation(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder setMenuPresentation(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
            return com.micklab.dcg.wrapper.android.service.autofill.Presentations.Builder.wrap(((android.service.autofill.Presentations.Builder) real).setMenuPresentation(arg0 == null ? null : arg0.getReal()));
        }

    }
}
