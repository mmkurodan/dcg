// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult wrap(android.app.appsearch.SearchResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SearchResult getReal() {
        return (android.app.appsearch.SearchResult) real;
    }

    public android.app.appsearch.SearchResult unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.SearchResult) real).describeContents();
    }

    public java.lang.String getDatabaseName() {
        return ((android.app.appsearch.SearchResult) real).getDatabaseName();
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument getGenericDocument() {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(((android.app.appsearch.SearchResult) real).getGenericDocument());
    }

    public java.lang.String getPackageName() {
        return ((android.app.appsearch.SearchResult) real).getPackageName();
    }

    public double getRankingSignal() {
        return ((android.app.appsearch.SearchResult) real).getRankingSignal();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.SearchResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder wrap(android.app.appsearch.SearchResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SearchResult.Builder getReal() {
            return (android.app.appsearch.SearchResult.Builder) real;
        }

        public android.app.appsearch.SearchResult.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.app.appsearch.SearchResult.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder addInformationalRankingSignal(double arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(((android.app.appsearch.SearchResult.Builder) real).addInformationalRankingSignal(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder addJoinedResult(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(((android.app.appsearch.SearchResult.Builder) real).addJoinedResult(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder addMatchInfo(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(((android.app.appsearch.SearchResult.Builder) real).addMatchInfo(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.wrap(((android.app.appsearch.SearchResult.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder setGenericDocument(com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(((android.app.appsearch.SearchResult.Builder) real).setGenericDocument(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder setRankingSignal(double arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.Builder.wrap(((android.app.appsearch.SearchResult.Builder) real).setRankingSignal(arg0));
        }

    }
    public static final class MatchInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MatchInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo wrap(android.app.appsearch.SearchResult.MatchInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SearchResult.MatchInfo getReal() {
            return (android.app.appsearch.SearchResult.MatchInfo) real;
        }

        public android.app.appsearch.SearchResult.MatchInfo unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.app.appsearch.SearchResult.MatchInfo) real).describeContents();
        }

        public java.lang.CharSequence getExactMatch() {
            return ((android.app.appsearch.SearchResult.MatchInfo) real).getExactMatch();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange getExactMatchRange() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange.wrap(((android.app.appsearch.SearchResult.MatchInfo) real).getExactMatchRange());
        }

        public java.lang.String getFullText() {
            return ((android.app.appsearch.SearchResult.MatchInfo) real).getFullText();
        }

        public java.lang.String getPropertyPath() {
            return ((android.app.appsearch.SearchResult.MatchInfo) real).getPropertyPath();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath getPropertyPathObject() {
            return com.micklab.dcg.wrapper.android.app.appsearch.PropertyPath.wrap(((android.app.appsearch.SearchResult.MatchInfo) real).getPropertyPathObject());
        }

        public java.lang.CharSequence getSnippet() {
            return ((android.app.appsearch.SearchResult.MatchInfo) real).getSnippet();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange getSnippetRange() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange.wrap(((android.app.appsearch.SearchResult.MatchInfo) real).getSnippetRange());
        }

        public java.lang.CharSequence getSubmatch() {
            return ((android.app.appsearch.SearchResult.MatchInfo) real).getSubmatch();
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange getSubmatchRange() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange.wrap(((android.app.appsearch.SearchResult.MatchInfo) real).getSubmatchRange());
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.appsearch.SearchResult.MatchInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder wrap(android.app.appsearch.SearchResult.MatchInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.app.appsearch.SearchResult.MatchInfo.Builder getReal() {
                return (android.app.appsearch.SearchResult.MatchInfo.Builder) real;
            }

            public android.app.appsearch.SearchResult.MatchInfo.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.appsearch.SearchResult.MatchInfo.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo build() {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.wrap(((android.app.appsearch.SearchResult.MatchInfo.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder setExactMatchRange(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange arg0) {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder.wrap(((android.app.appsearch.SearchResult.MatchInfo.Builder) real).setExactMatchRange(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder setSnippetRange(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange arg0) {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder.wrap(((android.app.appsearch.SearchResult.MatchInfo.Builder) real).setSnippetRange(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder setSubmatchRange(com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange arg0) {
                return com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchInfo.Builder.wrap(((android.app.appsearch.SearchResult.MatchInfo.Builder) real).setSubmatchRange(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
    public static final class MatchRange {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MatchRange(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange wrap(android.app.appsearch.SearchResult.MatchRange real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchResult.MatchRange(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SearchResult.MatchRange getReal() {
            return (android.app.appsearch.SearchResult.MatchRange) real;
        }

        public android.app.appsearch.SearchResult.MatchRange unwrap() {
            return getReal();
        }

        public MatchRange(int arg0, int arg1) {
            this(new android.app.appsearch.SearchResult.MatchRange(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.app.appsearch.SearchResult.MatchRange) real).equals(arg0);
        }

        public int getEnd() {
            return ((android.app.appsearch.SearchResult.MatchRange) real).getEnd();
        }

        public int getStart() {
            return ((android.app.appsearch.SearchResult.MatchRange) real).getStart();
        }

        public int hashCode() {
            return ((android.app.appsearch.SearchResult.MatchRange) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.app.appsearch.SearchResult.MatchRange) real).toString();
        }

    }
}
