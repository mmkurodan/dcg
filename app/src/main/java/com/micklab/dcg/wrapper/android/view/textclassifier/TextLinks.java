// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextLinks {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextLinks(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks wrap(android.view.textclassifier.TextLinks real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextLinks getReal() {
        return (android.view.textclassifier.TextLinks) real;
    }

    public android.view.textclassifier.TextLinks unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textclassifier.TextLinks) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextLinks) real).getExtras());
    }

    public java.lang.CharSequence getText() {
        return ((android.view.textclassifier.TextLinks) real).getText();
    }

    public java.lang.String toString() {
        return ((android.view.textclassifier.TextLinks) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.TextLinks) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int APPLY_STRATEGY_IGNORE = android.view.textclassifier.TextLinks.APPLY_STRATEGY_IGNORE;
    public static final int APPLY_STRATEGY_REPLACE = android.view.textclassifier.TextLinks.APPLY_STRATEGY_REPLACE;
    public static final int STATUS_DIFFERENT_TEXT = android.view.textclassifier.TextLinks.STATUS_DIFFERENT_TEXT;
    public static final int STATUS_LINKS_APPLIED = android.view.textclassifier.TextLinks.STATUS_LINKS_APPLIED;
    public static final int STATUS_NO_LINKS_APPLIED = android.view.textclassifier.TextLinks.STATUS_NO_LINKS_APPLIED;
    public static final int STATUS_NO_LINKS_FOUND = android.view.textclassifier.TextLinks.STATUS_NO_LINKS_FOUND;
    public static final int STATUS_UNSUPPORTED_CHARACTER = android.view.textclassifier.TextLinks.STATUS_UNSUPPORTED_CHARACTER;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder wrap(android.view.textclassifier.TextLinks.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextLinks.Builder getReal() {
            return (android.view.textclassifier.TextLinks.Builder) real;
        }

        public android.view.textclassifier.TextLinks.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.view.textclassifier.TextLinks.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.wrap(((android.view.textclassifier.TextLinks.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder clearTextLinks() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder.wrap(((android.view.textclassifier.TextLinks.Builder) real).clearTextLinks());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder.wrap(((android.view.textclassifier.TextLinks.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request wrap(android.view.textclassifier.TextLinks.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextLinks.Request getReal() {
            return (android.view.textclassifier.TextLinks.Request) real;
        }

        public android.view.textclassifier.TextLinks.Request unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.TextLinks.Request) real).describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return ((android.view.textclassifier.TextLinks.Request) real).getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.LocaleList getDefaultLocales() {
            return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.view.textclassifier.TextLinks.Request) real).getDefaultLocales());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig getEntityConfig() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.wrap(((android.view.textclassifier.TextLinks.Request) real).getEntityConfig());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextLinks.Request) real).getExtras());
        }

        public java.time.ZonedDateTime getReferenceTime() {
            return ((android.view.textclassifier.TextLinks.Request) real).getReferenceTime();
        }

        public java.lang.CharSequence getText() {
            return ((android.view.textclassifier.TextLinks.Request) real).getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.TextLinks.Request) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder wrap(android.view.textclassifier.TextLinks.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textclassifier.TextLinks.Request.Builder getReal() {
                return (android.view.textclassifier.TextLinks.Request.Builder) real;
            }

            public android.view.textclassifier.TextLinks.Request.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.CharSequence arg0) {
                this(new android.view.textclassifier.TextLinks.Request.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.wrap(((android.view.textclassifier.TextLinks.Request.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setDefaultLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(((android.view.textclassifier.TextLinks.Request.Builder) real).setDefaultLocales(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setEntityConfig(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(((android.view.textclassifier.TextLinks.Request.Builder) real).setEntityConfig(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(((android.view.textclassifier.TextLinks.Request.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setReferenceTime(java.time.ZonedDateTime arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(((android.view.textclassifier.TextLinks.Request.Builder) real).setReferenceTime(arg0));
            }

        }
    }
    public static final class TextLink {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TextLink(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink wrap(android.view.textclassifier.TextLinks.TextLink real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextLinks.TextLink getReal() {
            return (android.view.textclassifier.TextLinks.TextLink) real;
        }

        public android.view.textclassifier.TextLinks.TextLink unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.TextLinks.TextLink) real).describeContents();
        }

        public float getConfidenceScore(java.lang.String arg0) {
            return ((android.view.textclassifier.TextLinks.TextLink) real).getConfidenceScore(arg0);
        }

        public int getEnd() {
            return ((android.view.textclassifier.TextLinks.TextLink) real).getEnd();
        }

        public java.lang.String getEntity(int arg0) {
            return ((android.view.textclassifier.TextLinks.TextLink) real).getEntity(arg0);
        }

        public int getEntityCount() {
            return ((android.view.textclassifier.TextLinks.TextLink) real).getEntityCount();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextLinks.TextLink) real).getExtras());
        }

        public int getStart() {
            return ((android.view.textclassifier.TextLinks.TextLink) real).getStart();
        }

        public java.lang.String toString() {
            return ((android.view.textclassifier.TextLinks.TextLink) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.TextLinks.TextLink) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class TextLinkSpan {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TextLinkSpan(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLinkSpan wrap(android.view.textclassifier.TextLinks.TextLinkSpan real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLinkSpan(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextLinks.TextLinkSpan getReal() {
            return (android.view.textclassifier.TextLinks.TextLinkSpan) real;
        }

        public android.view.textclassifier.TextLinks.TextLinkSpan unwrap() {
            return getReal();
        }

        public TextLinkSpan(com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink arg0) {
            this(new android.view.textclassifier.TextLinks.TextLinkSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink getTextLink() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink.wrap(((android.view.textclassifier.TextLinks.TextLinkSpan) real).getTextLink());
        }

        public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            ((android.view.textclassifier.TextLinks.TextLinkSpan) real).onClick(arg0 == null ? null : arg0.getReal());
        }

    }
}
