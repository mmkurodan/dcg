// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SpellCheckerSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpellCheckerSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession wrap(android.view.textservice.SpellCheckerSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession(real, (__DcgwBridgeToken) null);
    }

    public android.view.textservice.SpellCheckerSession getReal() {
        return (android.view.textservice.SpellCheckerSession) real;
    }

    public android.view.textservice.SpellCheckerSession unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.view.textservice.SpellCheckerSession) real).cancel();
    }

    public void close() {
        ((android.view.textservice.SpellCheckerSession) real).close();
    }

    public void getSentenceSuggestions(android.view.textservice.TextInfo[] arg0, int arg1) {
        ((android.view.textservice.SpellCheckerSession) real).getSentenceSuggestions(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo getSpellChecker() {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo.wrap(((android.view.textservice.SpellCheckerSession) real).getSpellChecker());
    }

    public void getSuggestions(com.micklab.dcg.wrapper.android.view.textservice.TextInfo arg0, int arg1) {
        ((android.view.textservice.SpellCheckerSession) real).getSuggestions(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void getSuggestions(android.view.textservice.TextInfo[] arg0, int arg1, boolean arg2) {
        ((android.view.textservice.SpellCheckerSession) real).getSuggestions(arg0, arg1, arg2);
    }

    public boolean isSessionDisconnected() {
        return ((android.view.textservice.SpellCheckerSession) real).isSessionDisconnected();
    }

    public static final java.lang.String SERVICE_META_DATA = android.view.textservice.SpellCheckerSession.SERVICE_META_DATA;

    public static final class SpellCheckerSessionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SpellCheckerSessionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener wrap(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener getReal() {
            return (android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener) real;
        }

        public android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener unwrap() {
            return getReal();
        }

        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] arg0) {
            ((android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener) real).onGetSentenceSuggestions(arg0);
        }

        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] arg0) {
            ((android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener) real).onGetSuggestions(arg0);
        }

    }
    public static final class SpellCheckerSessionParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SpellCheckerSessionParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams wrap(android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams(real, (__DcgwBridgeToken) null);
        }

        public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams getReal() {
            return (android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams) real;
        }

        public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams) real).getExtras());
        }

        public java.util.Locale getLocale() {
            return ((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams) real).getLocale();
        }

        public int getSupportedAttributes() {
            return ((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams) real).getSupportedAttributes();
        }

        public boolean shouldReferToSpellCheckerLanguageSettings() {
            return ((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams) real).shouldReferToSpellCheckerLanguageSettings();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder wrap(android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder getReal() {
                return (android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder) real;
            }

            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder unwrap() {
                return getReal();
            }

            public Builder() {
                this(new android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder(), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams build() {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.wrap(((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setLocale(java.util.Locale arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder) real).setLocale(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setShouldReferToSpellCheckerLanguageSettings(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder) real).setShouldReferToSpellCheckerLanguageSettings(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setSupportedAttributes(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(((android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder) real).setSupportedAttributes(arg0));
            }

        }
    }
}
