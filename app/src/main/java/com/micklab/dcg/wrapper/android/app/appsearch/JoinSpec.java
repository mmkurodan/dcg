// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class JoinSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JoinSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec wrap(android.app.appsearch.JoinSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.JoinSpec getReal() {
        return (android.app.appsearch.JoinSpec) real;
    }

    public android.app.appsearch.JoinSpec unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.JoinSpec) real).describeContents();
    }

    public int getAggregationScoringStrategy() {
        return ((android.app.appsearch.JoinSpec) real).getAggregationScoringStrategy();
    }

    public java.lang.String getChildPropertyExpression() {
        return ((android.app.appsearch.JoinSpec) real).getChildPropertyExpression();
    }

    public int getMaxJoinedResultCount() {
        return ((android.app.appsearch.JoinSpec) real).getMaxJoinedResultCount();
    }

    public java.lang.String getNestedQuery() {
        return ((android.app.appsearch.JoinSpec) real).getNestedQuery();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec getNestedSearchSpec() {
        return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.wrap(((android.app.appsearch.JoinSpec) real).getNestedSearchSpec());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.JoinSpec) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int AGGREGATION_SCORING_AVG_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_AVG_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_MAX_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_MAX_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_MIN_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_MIN_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_OUTER_RESULT_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_OUTER_RESULT_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_RESULT_COUNT = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_RESULT_COUNT;
    public static final int AGGREGATION_SCORING_SUM_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_SUM_RANKING_SIGNAL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder wrap(android.app.appsearch.JoinSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.JoinSpec.Builder getReal() {
            return (android.app.appsearch.JoinSpec.Builder) real;
        }

        public android.app.appsearch.JoinSpec.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.appsearch.JoinSpec.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.wrap(((android.app.appsearch.JoinSpec.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder setAggregationScoringStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder.wrap(((android.app.appsearch.JoinSpec.Builder) real).setAggregationScoringStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder setMaxJoinedResultCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder.wrap(((android.app.appsearch.JoinSpec.Builder) real).setMaxJoinedResultCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder setNestedSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder.wrap(((android.app.appsearch.JoinSpec.Builder) real).setNestedSearch(arg0, arg1 == null ? null : arg1.getReal()));
        }

    }
}
