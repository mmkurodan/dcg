// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextLinks {
    private final android.view.textclassifier.TextLinks real;

    public TextLinks(android.view.textclassifier.TextLinks real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks wrap(android.view.textclassifier.TextLinks real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks(real);
    }

    public android.view.textclassifier.TextLinks unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int APPLY_STRATEGY_IGNORE = android.view.textclassifier.TextLinks.APPLY_STRATEGY_IGNORE;
    public static final int APPLY_STRATEGY_REPLACE = android.view.textclassifier.TextLinks.APPLY_STRATEGY_REPLACE;
    public static final int STATUS_DIFFERENT_TEXT = android.view.textclassifier.TextLinks.STATUS_DIFFERENT_TEXT;
    public static final int STATUS_LINKS_APPLIED = android.view.textclassifier.TextLinks.STATUS_LINKS_APPLIED;
    public static final int STATUS_NO_LINKS_APPLIED = android.view.textclassifier.TextLinks.STATUS_NO_LINKS_APPLIED;
    public static final int STATUS_NO_LINKS_FOUND = android.view.textclassifier.TextLinks.STATUS_NO_LINKS_FOUND;
    public static final int STATUS_UNSUPPORTED_CHARACTER = android.view.textclassifier.TextLinks.STATUS_UNSUPPORTED_CHARACTER;

    public static final class Builder {
        private final android.view.textclassifier.TextLinks.Builder real;

        public Builder(android.view.textclassifier.TextLinks.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder wrap(android.view.textclassifier.TextLinks.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder(real);
        }

        public android.view.textclassifier.TextLinks.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.view.textclassifier.TextLinks.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder clearTextLinks() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder.wrap(real.clearTextLinks());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class Request {
        private final android.view.textclassifier.TextLinks.Request real;

        public Request(android.view.textclassifier.TextLinks.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request wrap(android.view.textclassifier.TextLinks.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request(real);
        }

        public android.view.textclassifier.TextLinks.Request unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return real.getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.LocaleList getDefaultLocales() {
            return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getDefaultLocales());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig getEntityConfig() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.wrap(real.getEntityConfig());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public java.time.ZonedDateTime getReferenceTime() {
            return real.getReferenceTime();
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.view.textclassifier.TextLinks.Request.Builder real;

            public Builder(android.view.textclassifier.TextLinks.Request.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder wrap(android.view.textclassifier.TextLinks.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder(real);
            }

            public android.view.textclassifier.TextLinks.Request.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.CharSequence arg0) {
                this(new android.view.textclassifier.TextLinks.Request.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setDefaultLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(real.setDefaultLocales(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setEntityConfig(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(real.setEntityConfig(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder setReferenceTime(java.time.ZonedDateTime arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.Request.Builder.wrap(real.setReferenceTime(arg0));
            }

        }
    }
    public static final class TextLink {
        private final android.view.textclassifier.TextLinks.TextLink real;

        public TextLink(android.view.textclassifier.TextLinks.TextLink real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink wrap(android.view.textclassifier.TextLinks.TextLink real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink(real);
        }

        public android.view.textclassifier.TextLinks.TextLink unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public float getConfidenceScore(java.lang.String arg0) {
            return real.getConfidenceScore(arg0);
        }

        public int getEnd() {
            return real.getEnd();
        }

        public java.lang.String getEntity(int arg0) {
            return real.getEntity(arg0);
        }

        public int getEntityCount() {
            return real.getEntityCount();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public int getStart() {
            return real.getStart();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class TextLinkSpan {
        private final android.view.textclassifier.TextLinks.TextLinkSpan real;

        public TextLinkSpan(android.view.textclassifier.TextLinks.TextLinkSpan real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLinkSpan wrap(android.view.textclassifier.TextLinks.TextLinkSpan real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLinkSpan(real);
        }

        public android.view.textclassifier.TextLinks.TextLinkSpan unwrap() {
            return real;
        }

        public TextLinkSpan(com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink arg0) {
            this(new android.view.textclassifier.TextLinks.TextLinkSpan(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink getTextLink() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLinks.TextLink.wrap(real.getTextLink());
        }

        public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
            real.onClick(arg0 == null ? null : arg0.unwrap());
        }

    }
}
