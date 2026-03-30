// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchResult {
    private final android.app.appsearch.SearchResult real;

    public SearchResult(android.app.appsearch.SearchResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult wrap(android.app.appsearch.SearchResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult(real);
    }

    public android.app.appsearch.SearchResult unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getDatabaseName() {
        return real.getDatabaseName();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument getGenericDocument() {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(real.getGenericDocument());
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public double getRankingSignal() {
        return real.getRankingSignal();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.SearchResult.Builder real;

        public Builder(android.app.appsearch.SearchResult.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder wrap(android.app.appsearch.SearchResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder(real);
        }

        public android.app.appsearch.SearchResult.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.app.appsearch.SearchResult.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder addJoinedResult(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(real.addJoinedResult(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder addMatchInfo(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(real.addMatchInfo(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder setGenericDocument(com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(real.setGenericDocument(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder setRankingSignal(double arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(real.setRankingSignal(arg0));
        }

    }
    public static final class MatchInfo {
        private final android.app.appsearch.SearchResult.MatchInfo real;

        public MatchInfo(android.app.appsearch.SearchResult.MatchInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo wrap(android.app.appsearch.SearchResult.MatchInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo(real);
        }

        public android.app.appsearch.SearchResult.MatchInfo unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.CharSequence getExactMatch() {
            return real.getExactMatch();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange getExactMatchRange() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange.wrap(real.getExactMatchRange());
        }

        public java.lang.String getFullText() {
            return real.getFullText();
        }

        public java.lang.String getPropertyPath() {
            return real.getPropertyPath();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath getPropertyPathObject() {
            return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.wrap(real.getPropertyPathObject());
        }

        public java.lang.CharSequence getSnippet() {
            return real.getSnippet();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange getSnippetRange() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange.wrap(real.getSnippetRange());
        }

        public java.lang.CharSequence getSubmatch() {
            return real.getSubmatch();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange getSubmatchRange() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange.wrap(real.getSubmatchRange());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


        public static final class Builder {
            private final android.app.appsearch.SearchResult.MatchInfo.Builder real;

            public Builder(android.app.appsearch.SearchResult.MatchInfo.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder wrap(android.app.appsearch.SearchResult.MatchInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder(real);
            }

            public android.app.appsearch.SearchResult.MatchInfo.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.appsearch.SearchResult.MatchInfo.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo build() {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder setExactMatchRange(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange arg0) {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder.wrap(real.setExactMatchRange(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder setSnippetRange(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange arg0) {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder.wrap(real.setSnippetRange(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder setSubmatchRange(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange arg0) {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder.wrap(real.setSubmatchRange(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
    public static final class MatchRange {
        private final android.app.appsearch.SearchResult.MatchRange real;

        public MatchRange(android.app.appsearch.SearchResult.MatchRange real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange wrap(android.app.appsearch.SearchResult.MatchRange real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange(real);
        }

        public android.app.appsearch.SearchResult.MatchRange unwrap() {
            return real;
        }

        public MatchRange(int arg0, int arg1) {
            this(new android.app.appsearch.SearchResult.MatchRange(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getEnd() {
            return real.getEnd();
        }

        public int getStart() {
            return real.getStart();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
