// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class JoinSpec {
    private final android.app.appsearch.JoinSpec real;

    public JoinSpec(android.app.appsearch.JoinSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec wrap(android.app.appsearch.JoinSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec(real);
    }

    public android.app.appsearch.JoinSpec unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAggregationScoringStrategy() {
        return real.getAggregationScoringStrategy();
    }

    public java.lang.String getChildPropertyExpression() {
        return real.getChildPropertyExpression();
    }

    public int getMaxJoinedResultCount() {
        return real.getMaxJoinedResultCount();
    }

    public java.lang.String getNestedQuery() {
        return real.getNestedQuery();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec getNestedSearchSpec() {
        return com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec.wrap(real.getNestedSearchSpec());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int AGGREGATION_SCORING_AVG_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_AVG_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_MAX_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_MAX_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_MIN_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_MIN_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_OUTER_RESULT_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_OUTER_RESULT_RANKING_SIGNAL;
    public static final int AGGREGATION_SCORING_RESULT_COUNT = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_RESULT_COUNT;
    public static final int AGGREGATION_SCORING_SUM_RANKING_SIGNAL = android.app.appsearch.JoinSpec.AGGREGATION_SCORING_SUM_RANKING_SIGNAL;

    public static final class Builder {
        private final android.app.appsearch.JoinSpec.Builder real;

        public Builder(android.app.appsearch.JoinSpec.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder wrap(android.app.appsearch.JoinSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder(real);
        }

        public android.app.appsearch.JoinSpec.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.app.appsearch.JoinSpec.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder setAggregationScoringStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder.wrap(real.setAggregationScoringStrategy(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder setMaxJoinedResultCount(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder.wrap(real.setMaxJoinedResultCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder setNestedSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.appsearch.SearchSpec arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.JoinSpec.Builder.wrap(real.setNestedSearch(arg0, arg1 == null ? null : arg1.unwrap()));
        }

    }
}
