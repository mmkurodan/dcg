// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextLanguage {
    private final android.view.textclassifier.TextLanguage real;

    public TextLanguage(android.view.textclassifier.TextLanguage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage wrap(android.view.textclassifier.TextLanguage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage(real);
    }

    public android.view.textclassifier.TextLanguage unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public float getConfidenceScore(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getConfidenceScore(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getLocale(arg0));
    }

    public int getLocaleHypothesisCount() {
        return real.getLocaleHypothesisCount();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.textclassifier.TextLanguage.Builder real;

        public Builder(android.view.textclassifier.TextLanguage.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder wrap(android.view.textclassifier.TextLanguage.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder(real);
        }

        public android.view.textclassifier.TextLanguage.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.textclassifier.TextLanguage.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder putLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder.wrap(real.putLocale(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Builder.wrap(real.setId(arg0));
        }

    }
    public static final class Request {
        private final android.view.textclassifier.TextLanguage.Request real;

        public Request(android.view.textclassifier.TextLanguage.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request wrap(android.view.textclassifier.TextLanguage.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request(real);
        }

        public android.view.textclassifier.TextLanguage.Request unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return real.getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.view.textclassifier.TextLanguage.Request.Builder real;

            public Builder(android.view.textclassifier.TextLanguage.Request.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder wrap(android.view.textclassifier.TextLanguage.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder(real);
            }

            public android.view.textclassifier.TextLanguage.Request.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.CharSequence arg0) {
                this(new android.view.textclassifier.TextLanguage.Request.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextLanguage.Request.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
}
