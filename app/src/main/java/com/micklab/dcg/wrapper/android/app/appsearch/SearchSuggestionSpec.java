// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchSuggestionSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchSuggestionSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec wrap(android.app.appsearch.SearchSuggestionSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SearchSuggestionSpec getReal() {
        return (android.app.appsearch.SearchSuggestionSpec) real;
    }

    public android.app.appsearch.SearchSuggestionSpec unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.SearchSuggestionSpec) real).describeContents();
    }

    public int getMaximumResultCount() {
        return ((android.app.appsearch.SearchSuggestionSpec) real).getMaximumResultCount();
    }

    public int getRankingStrategy() {
        return ((android.app.appsearch.SearchSuggestionSpec) real).getRankingStrategy();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.SearchSuggestionSpec) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SUGGESTION_RANKING_STRATEGY_DOCUMENT_COUNT = android.app.appsearch.SearchSuggestionSpec.SUGGESTION_RANKING_STRATEGY_DOCUMENT_COUNT;
    public static final int SUGGESTION_RANKING_STRATEGY_NONE = android.app.appsearch.SearchSuggestionSpec.SUGGESTION_RANKING_STRATEGY_NONE;
    public static final int SUGGESTION_RANKING_STRATEGY_TERM_FREQUENCY = android.app.appsearch.SearchSuggestionSpec.SUGGESTION_RANKING_STRATEGY_TERM_FREQUENCY;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder wrap(android.app.appsearch.SearchSuggestionSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SearchSuggestionSpec.Builder getReal() {
            return (android.app.appsearch.SearchSuggestionSpec.Builder) real;
        }

        public android.app.appsearch.SearchSuggestionSpec.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.app.appsearch.SearchSuggestionSpec.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder addFilterDocumentIds(java.lang.String arg0, java.lang.String... arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(((android.app.appsearch.SearchSuggestionSpec.Builder) real).addFilterDocumentIds(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder addFilterNamespaces(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(((android.app.appsearch.SearchSuggestionSpec.Builder) real).addFilterNamespaces(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder addFilterSchemas(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(((android.app.appsearch.SearchSuggestionSpec.Builder) real).addFilterSchemas(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder addSearchStringParameters(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(((android.app.appsearch.SearchSuggestionSpec.Builder) real).addSearchStringParameters(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.wrap(((android.app.appsearch.SearchSuggestionSpec.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder setRankingStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(((android.app.appsearch.SearchSuggestionSpec.Builder) real).setRankingStrategy(arg0));
        }

    }
}
