// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec wrap(android.app.appsearch.SearchSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SearchSpec getReal() {
        return (android.app.appsearch.SearchSpec) real;
    }

    public android.app.appsearch.SearchSpec unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.SearchSpec) real).describeContents();
    }

    public java.lang.String getAdvancedRankingExpression() {
        return ((android.app.appsearch.SearchSpec) real).getAdvancedRankingExpression();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec getJoinSpec() {
        return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.wrap(((android.app.appsearch.SearchSpec) real).getJoinSpec());
    }

    public int getMaxSnippetSize() {
        return ((android.app.appsearch.SearchSpec) real).getMaxSnippetSize();
    }

    public int getOrder() {
        return ((android.app.appsearch.SearchSpec) real).getOrder();
    }

    public int getRankingStrategy() {
        return ((android.app.appsearch.SearchSpec) real).getRankingStrategy();
    }

    public int getResultCountPerPage() {
        return ((android.app.appsearch.SearchSpec) real).getResultCountPerPage();
    }

    public int getResultGroupingLimit() {
        return ((android.app.appsearch.SearchSpec) real).getResultGroupingLimit();
    }

    public int getResultGroupingTypeFlags() {
        return ((android.app.appsearch.SearchSpec) real).getResultGroupingTypeFlags();
    }

    public java.lang.String getSearchSourceLogTag() {
        return ((android.app.appsearch.SearchSpec) real).getSearchSourceLogTag();
    }

    public int getSnippetCount() {
        return ((android.app.appsearch.SearchSpec) real).getSnippetCount();
    }

    public int getSnippetCountPerProperty() {
        return ((android.app.appsearch.SearchSpec) real).getSnippetCountPerProperty();
    }

    public int getTermMatch() {
        return ((android.app.appsearch.SearchSpec) real).getTermMatch();
    }

    public boolean isListFilterHasPropertyFunctionEnabled() {
        return ((android.app.appsearch.SearchSpec) real).isListFilterHasPropertyFunctionEnabled();
    }

    public boolean isListFilterQueryLanguageEnabled() {
        return ((android.app.appsearch.SearchSpec) real).isListFilterQueryLanguageEnabled();
    }

    public boolean isNumericSearchEnabled() {
        return ((android.app.appsearch.SearchSpec) real).isNumericSearchEnabled();
    }

    public boolean isVerbatimSearchEnabled() {
        return ((android.app.appsearch.SearchSpec) real).isVerbatimSearchEnabled();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.SearchSpec) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int GROUPING_TYPE_PER_NAMESPACE = android.app.appsearch.SearchSpec.GROUPING_TYPE_PER_NAMESPACE;
    public static final int GROUPING_TYPE_PER_PACKAGE = android.app.appsearch.SearchSpec.GROUPING_TYPE_PER_PACKAGE;
    public static final int GROUPING_TYPE_PER_SCHEMA = android.app.appsearch.SearchSpec.GROUPING_TYPE_PER_SCHEMA;
    public static final int ORDER_ASCENDING = android.app.appsearch.SearchSpec.ORDER_ASCENDING;
    public static final int ORDER_DESCENDING = android.app.appsearch.SearchSpec.ORDER_DESCENDING;
    public static final java.lang.String PROJECTION_SCHEMA_TYPE_WILDCARD = android.app.appsearch.SearchSpec.PROJECTION_SCHEMA_TYPE_WILDCARD;
    public static final int RANKING_STRATEGY_ADVANCED_RANKING_EXPRESSION = android.app.appsearch.SearchSpec.RANKING_STRATEGY_ADVANCED_RANKING_EXPRESSION;
    public static final int RANKING_STRATEGY_CREATION_TIMESTAMP = android.app.appsearch.SearchSpec.RANKING_STRATEGY_CREATION_TIMESTAMP;
    public static final int RANKING_STRATEGY_DOCUMENT_SCORE = android.app.appsearch.SearchSpec.RANKING_STRATEGY_DOCUMENT_SCORE;
    public static final int RANKING_STRATEGY_JOIN_AGGREGATE_SCORE = android.app.appsearch.SearchSpec.RANKING_STRATEGY_JOIN_AGGREGATE_SCORE;
    public static final int RANKING_STRATEGY_NONE = android.app.appsearch.SearchSpec.RANKING_STRATEGY_NONE;
    public static final int RANKING_STRATEGY_RELEVANCE_SCORE = android.app.appsearch.SearchSpec.RANKING_STRATEGY_RELEVANCE_SCORE;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_COUNT = android.app.appsearch.SearchSpec.RANKING_STRATEGY_SYSTEM_USAGE_COUNT;
    public static final int RANKING_STRATEGY_SYSTEM_USAGE_LAST_USED_TIMESTAMP = android.app.appsearch.SearchSpec.RANKING_STRATEGY_SYSTEM_USAGE_LAST_USED_TIMESTAMP;
    public static final int RANKING_STRATEGY_USAGE_COUNT = android.app.appsearch.SearchSpec.RANKING_STRATEGY_USAGE_COUNT;
    public static final int RANKING_STRATEGY_USAGE_LAST_USED_TIMESTAMP = android.app.appsearch.SearchSpec.RANKING_STRATEGY_USAGE_LAST_USED_TIMESTAMP;
    public static final java.lang.String SCHEMA_TYPE_WILDCARD = android.app.appsearch.SearchSpec.SCHEMA_TYPE_WILDCARD;
    public static final int TERM_MATCH_EXACT_ONLY = android.app.appsearch.SearchSpec.TERM_MATCH_EXACT_ONLY;
    public static final int TERM_MATCH_PREFIX = android.app.appsearch.SearchSpec.TERM_MATCH_PREFIX;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder wrap(android.app.appsearch.SearchSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SearchSpec.Builder getReal() {
            return (android.app.appsearch.SearchSpec.Builder) real;
        }

        public android.app.appsearch.SearchSpec.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.SearchSpec.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder addFilterNamespaces(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).addFilterNamespaces(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder addFilterPackageNames(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).addFilterPackageNames(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder addFilterSchemas(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).addFilterSchemas(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.wrap(((android.app.appsearch.SearchSpec.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setJoinSpec(com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setJoinSpec(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setListFilterHasPropertyFunctionEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setListFilterHasPropertyFunctionEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setListFilterQueryLanguageEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setListFilterQueryLanguageEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setMaxSnippetSize(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setMaxSnippetSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setNumericSearchEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setNumericSearchEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setOrder(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setOrder(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setRankingStrategy(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setRankingStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setRankingStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setRankingStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setResultCountPerPage(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setResultCountPerPage(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setResultGrouping(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setResultGrouping(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setSearchSourceLogTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setSearchSourceLogTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setSnippetCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setSnippetCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setSnippetCountPerProperty(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setSnippetCountPerProperty(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setTermMatch(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setTermMatch(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder setVerbatimSearchEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.Builder.wrap(((android.app.appsearch.SearchSpec.Builder) real).setVerbatimSearchEnabled(arg0));
        }

    }
}
