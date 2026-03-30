// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextClassification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification wrap(android.view.textclassifier.TextClassification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextClassification getReal() {
        return (android.view.textclassifier.TextClassification) real;
    }

    public android.view.textclassifier.TextClassification unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textclassifier.TextClassification) real).describeContents();
    }

    public float getConfidenceScore(java.lang.String arg0) {
        return ((android.view.textclassifier.TextClassification) real).getConfidenceScore(arg0);
    }

    public java.lang.String getEntity(int arg0) {
        return ((android.view.textclassifier.TextClassification) real).getEntity(arg0);
    }

    public int getEntityCount() {
        return ((android.view.textclassifier.TextClassification) real).getEntityCount();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextClassification) real).getExtras());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.view.textclassifier.TextClassification) real).getIcon());
    }

    public java.lang.String getId() {
        return ((android.view.textclassifier.TextClassification) real).getId();
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.view.textclassifier.TextClassification) real).getIntent());
    }

    public java.lang.CharSequence getLabel() {
        return ((android.view.textclassifier.TextClassification) real).getLabel();
    }

    public com.micklab.dcg.wrapper.android.view.View.OnClickListener getOnClickListener() {
        return com.micklab.dcg.wrapper.android.view.View.OnClickListener.wrap(((android.view.textclassifier.TextClassification) real).getOnClickListener());
    }

    public java.lang.String getText() {
        return ((android.view.textclassifier.TextClassification) real).getText();
    }

    public java.lang.String toString() {
        return ((android.view.textclassifier.TextClassification) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.TextClassification) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder wrap(android.view.textclassifier.TextClassification.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextClassification.Builder getReal() {
            return (android.view.textclassifier.TextClassification.Builder) real;
        }

        public android.view.textclassifier.TextClassification.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.textclassifier.TextClassification.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder addAction(com.micklab.dcg.wrapper.android.app.RemoteAction arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).addAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.wrap(((android.view.textclassifier.TextClassification.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setEntityType(java.lang.String arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setEntityType(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setIcon(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setLabel(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setLabel(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setOnClickListener(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder setText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Builder.wrap(((android.view.textclassifier.TextClassification.Builder) real).setText(arg0));
        }

    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request wrap(android.view.textclassifier.TextClassification.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextClassification.Request getReal() {
            return (android.view.textclassifier.TextClassification.Request) real;
        }

        public android.view.textclassifier.TextClassification.Request unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.TextClassification.Request) real).describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return ((android.view.textclassifier.TextClassification.Request) real).getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.LocaleList getDefaultLocales() {
            return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.view.textclassifier.TextClassification.Request) real).getDefaultLocales());
        }

        public int getEndIndex() {
            return ((android.view.textclassifier.TextClassification.Request) real).getEndIndex();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.TextClassification.Request) real).getExtras());
        }

        public java.time.ZonedDateTime getReferenceTime() {
            return ((android.view.textclassifier.TextClassification.Request) real).getReferenceTime();
        }

        public int getStartIndex() {
            return ((android.view.textclassifier.TextClassification.Request) real).getStartIndex();
        }

        public java.lang.CharSequence getText() {
            return ((android.view.textclassifier.TextClassification.Request) real).getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.TextClassification.Request) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder wrap(android.view.textclassifier.TextClassification.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textclassifier.TextClassification.Request.Builder getReal() {
                return (android.view.textclassifier.TextClassification.Request.Builder) real;
            }

            public android.view.textclassifier.TextClassification.Request.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.CharSequence arg0, int arg1, int arg2) {
                this(new android.view.textclassifier.TextClassification.Request.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.wrap(((android.view.textclassifier.TextClassification.Request.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder setDefaultLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder.wrap(((android.view.textclassifier.TextClassification.Request.Builder) real).setDefaultLocales(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder.wrap(((android.view.textclassifier.TextClassification.Request.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder setReferenceTime(java.time.ZonedDateTime arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification.Request.Builder.wrap(((android.view.textclassifier.TextClassification.Request.Builder) real).setReferenceTime(arg0));
            }

        }
    }
}
