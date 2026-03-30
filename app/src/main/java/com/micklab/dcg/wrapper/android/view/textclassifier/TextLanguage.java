// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextLanguage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextLanguage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage wrap(android.view.textclassifier.TextLanguage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextLanguage getReal() {
        return (android.view.textclassifier.TextLanguage) real;
    }

    public android.view.textclassifier.TextLanguage unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textclassifier.TextLanguage) real).describeContents();
    }

    public float getConfidenceScore(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return ((android.view.textclassifier.TextLanguage) real).getConfidenceScore(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextLanguage) real).getExtras());
    }

    public java.lang.String getId() {
        return ((android.view.textclassifier.TextLanguage) real).getId();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(((android.view.textclassifier.TextLanguage) real).getLocale(arg0));
    }

    public int getLocaleHypothesisCount() {
        return ((android.view.textclassifier.TextLanguage) real).getLocaleHypothesisCount();
    }

    public java.lang.String toString() {
        return ((android.view.textclassifier.TextLanguage) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.TextLanguage) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder wrap(android.view.textclassifier.TextLanguage.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextLanguage.Builder getReal() {
            return (android.view.textclassifier.TextLanguage.Builder) real;
        }

        public android.view.textclassifier.TextLanguage.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.textclassifier.TextLanguage.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.wrap(((android.view.textclassifier.TextLanguage.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder putLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder.wrap(((android.view.textclassifier.TextLanguage.Builder) real).putLocale(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder.wrap(((android.view.textclassifier.TextLanguage.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder.wrap(((android.view.textclassifier.TextLanguage.Builder) real).setId(arg0));
        }

    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request wrap(android.view.textclassifier.TextLanguage.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextLanguage.Request getReal() {
            return (android.view.textclassifier.TextLanguage.Request) real;
        }

        public android.view.textclassifier.TextLanguage.Request unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.TextLanguage.Request) real).describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return ((android.view.textclassifier.TextLanguage.Request) real).getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextLanguage.Request) real).getExtras());
        }

        public java.lang.CharSequence getText() {
            return ((android.view.textclassifier.TextLanguage.Request) real).getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.TextLanguage.Request) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder wrap(android.view.textclassifier.TextLanguage.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textclassifier.TextLanguage.Request.Builder getReal() {
                return (android.view.textclassifier.TextLanguage.Request.Builder) real;
            }

            public android.view.textclassifier.TextLanguage.Request.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.CharSequence arg0) {
                this(new android.view.textclassifier.TextLanguage.Request.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.wrap(((android.view.textclassifier.TextLanguage.Request.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder.wrap(((android.view.textclassifier.TextLanguage.Request.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
}
