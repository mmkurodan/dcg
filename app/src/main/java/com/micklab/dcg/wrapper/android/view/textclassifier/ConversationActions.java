// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class ConversationActions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConversationActions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions wrap(android.view.textclassifier.ConversationActions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.ConversationActions getReal() {
        return (android.view.textclassifier.ConversationActions) real;
    }

    public android.view.textclassifier.ConversationActions unwrap() {
        return getReal();
    }

    public ConversationActions(java.util.List arg0, java.lang.String arg1) {
        this(new android.view.textclassifier.ConversationActions(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.textclassifier.ConversationActions) real).describeContents();
    }

    public java.lang.String getId() {
        return ((android.view.textclassifier.ConversationActions) real).getId();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.ConversationActions) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Message {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Message(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message wrap(android.view.textclassifier.ConversationActions.Message real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.ConversationActions.Message getReal() {
            return (android.view.textclassifier.ConversationActions.Message) real;
        }

        public android.view.textclassifier.ConversationActions.Message unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.ConversationActions.Message) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.app.Person getAuthor() {
            return com.micklab.dcg.wrapper.android.app.Person.wrap(((android.view.textclassifier.ConversationActions.Message) real).getAuthor());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.ConversationActions.Message) real).getExtras());
        }

        public java.time.ZonedDateTime getReferenceTime() {
            return ((android.view.textclassifier.ConversationActions.Message) real).getReferenceTime();
        }

        public java.lang.CharSequence getText() {
            return ((android.view.textclassifier.ConversationActions.Message) real).getText();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.ConversationActions.Message) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final com.micklab.dcg.wrapper.android.app.Person PERSON_USER_OTHERS = com.micklab.dcg.wrapper.android.app.Person.wrap(android.view.textclassifier.ConversationActions.Message.PERSON_USER_OTHERS);
        public static final com.micklab.dcg.wrapper.android.app.Person PERSON_USER_SELF = com.micklab.dcg.wrapper.android.app.Person.wrap(android.view.textclassifier.ConversationActions.Message.PERSON_USER_SELF);

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder wrap(android.view.textclassifier.ConversationActions.Message.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textclassifier.ConversationActions.Message.Builder getReal() {
                return (android.view.textclassifier.ConversationActions.Message.Builder) real;
            }

            public android.view.textclassifier.ConversationActions.Message.Builder unwrap() {
                return getReal();
            }

            public Builder(com.micklab.dcg.wrapper.android.app.Person arg0) {
                this(new android.view.textclassifier.ConversationActions.Message.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.wrap(((android.view.textclassifier.ConversationActions.Message.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder.wrap(((android.view.textclassifier.ConversationActions.Message.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder setReferenceTime(java.time.ZonedDateTime arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder.wrap(((android.view.textclassifier.ConversationActions.Message.Builder) real).setReferenceTime(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder setText(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Message.Builder.wrap(((android.view.textclassifier.ConversationActions.Message.Builder) real).setText(arg0));
            }

        }
    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request wrap(android.view.textclassifier.ConversationActions.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.ConversationActions.Request getReal() {
            return (android.view.textclassifier.ConversationActions.Request) real;
        }

        public android.view.textclassifier.ConversationActions.Request unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.textclassifier.ConversationActions.Request) real).describeContents();
        }

        public java.lang.String getCallingPackageName() {
            return ((android.view.textclassifier.ConversationActions.Request) real).getCallingPackageName();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textclassifier.ConversationActions.Request) real).getExtras());
        }

        public int getMaxSuggestions() {
            return ((android.view.textclassifier.ConversationActions.Request) real).getMaxSuggestions();
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig getTypeConfig() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig.wrap(((android.view.textclassifier.ConversationActions.Request) real).getTypeConfig());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.textclassifier.ConversationActions.Request) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final java.lang.String HINT_FOR_IN_APP = android.view.textclassifier.ConversationActions.Request.HINT_FOR_IN_APP;
        public static final java.lang.String HINT_FOR_NOTIFICATION = android.view.textclassifier.ConversationActions.Request.HINT_FOR_NOTIFICATION;

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder wrap(android.view.textclassifier.ConversationActions.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textclassifier.ConversationActions.Request.Builder getReal() {
                return (android.view.textclassifier.ConversationActions.Request.Builder) real;
            }

            public android.view.textclassifier.ConversationActions.Request.Builder unwrap() {
                return getReal();
            }

            public Builder(java.util.List arg0) {
                this(new android.view.textclassifier.ConversationActions.Request.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request build() {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.wrap(((android.view.textclassifier.ConversationActions.Request.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder.wrap(((android.view.textclassifier.ConversationActions.Request.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder setMaxSuggestions(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder.wrap(((android.view.textclassifier.ConversationActions.Request.Builder) real).setMaxSuggestions(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder setTypeConfig(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.EntityConfig arg0) {
                return com.micklab.dcg.wrapper.android.view.textclassifier.ConversationActions.Request.Builder.wrap(((android.view.textclassifier.ConversationActions.Request.Builder) real).setTypeConfig(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
}
