// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class IntentFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntentFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.IntentFilter wrap(android.content.IntentFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentFilter(real, (__DcgwBridgeToken) null);
    }

    public android.content.IntentFilter getReal() {
        return (android.content.IntentFilter) real;
    }

    public android.content.IntentFilter unwrap() {
        return getReal();
    }

    public IntentFilter() {
        this(new android.content.IntentFilter(), (__DcgwBridgeToken) null);
    }

    public IntentFilter(com.micklab.dcg.wrapper.android.content.IntentFilter arg0) {
        this(new android.content.IntentFilter(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public IntentFilter(java.lang.String arg0) {
        this(new android.content.IntentFilter(arg0), (__DcgwBridgeToken) null);
    }

    public IntentFilter(java.lang.String arg0, java.lang.String arg1) throws android.content.IntentFilter.MalformedMimeTypeException {
        this(new android.content.IntentFilter(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public void addAction(java.lang.String arg0) {
        ((android.content.IntentFilter) real).addAction(arg0);
    }

    public void addCategory(java.lang.String arg0) {
        ((android.content.IntentFilter) real).addCategory(arg0);
    }

    public void addDataAuthority(java.lang.String arg0, java.lang.String arg1) {
        ((android.content.IntentFilter) real).addDataAuthority(arg0, arg1);
    }

    public void addDataPath(java.lang.String arg0, int arg1) {
        ((android.content.IntentFilter) real).addDataPath(arg0, arg1);
    }

    public void addDataScheme(java.lang.String arg0) {
        ((android.content.IntentFilter) real).addDataScheme(arg0);
    }

    public void addDataSchemeSpecificPart(java.lang.String arg0, int arg1) {
        ((android.content.IntentFilter) real).addDataSchemeSpecificPart(arg0, arg1);
    }

    public void addDataType(java.lang.String arg0) throws android.content.IntentFilter.MalformedMimeTypeException {
        ((android.content.IntentFilter) real).addDataType(arg0);
    }

    public void addUriRelativeFilterGroup(com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup arg0) {
        ((android.content.IntentFilter) real).addUriRelativeFilterGroup(arg0 == null ? null : arg0.getReal());
    }

    public void clearUriRelativeFilterGroups() {
        ((android.content.IntentFilter) real).clearUriRelativeFilterGroups();
    }

    public int countActions() {
        return ((android.content.IntentFilter) real).countActions();
    }

    public int countCategories() {
        return ((android.content.IntentFilter) real).countCategories();
    }

    public int countDataAuthorities() {
        return ((android.content.IntentFilter) real).countDataAuthorities();
    }

    public int countDataPaths() {
        return ((android.content.IntentFilter) real).countDataPaths();
    }

    public int countDataSchemeSpecificParts() {
        return ((android.content.IntentFilter) real).countDataSchemeSpecificParts();
    }

    public int countDataSchemes() {
        return ((android.content.IntentFilter) real).countDataSchemes();
    }

    public int countDataTypes() {
        return ((android.content.IntentFilter) real).countDataTypes();
    }

    public int countUriRelativeFilterGroups() {
        return ((android.content.IntentFilter) real).countUriRelativeFilterGroups();
    }

    public static com.micklab.dcg.wrapper.android.content.IntentFilter create(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.IntentFilter.wrap(android.content.IntentFilter.create(arg0, arg1));
    }

    public int describeContents() {
        return ((android.content.IntentFilter) real).describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        ((android.content.IntentFilter) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.String getAction(int arg0) {
        return ((android.content.IntentFilter) real).getAction(arg0);
    }

    public java.lang.String getCategory(int arg0) {
        return ((android.content.IntentFilter) real).getCategory(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry getDataAuthority(int arg0) {
        return com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry.wrap(((android.content.IntentFilter) real).getDataAuthority(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.PatternMatcher getDataPath(int arg0) {
        return com.micklab.dcg.wrapper.android.os.PatternMatcher.wrap(((android.content.IntentFilter) real).getDataPath(arg0));
    }

    public java.lang.String getDataScheme(int arg0) {
        return ((android.content.IntentFilter) real).getDataScheme(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.PatternMatcher getDataSchemeSpecificPart(int arg0) {
        return com.micklab.dcg.wrapper.android.os.PatternMatcher.wrap(((android.content.IntentFilter) real).getDataSchemeSpecificPart(arg0));
    }

    public java.lang.String getDataType(int arg0) {
        return ((android.content.IntentFilter) real).getDataType(arg0);
    }

    public int getPriority() {
        return ((android.content.IntentFilter) real).getPriority();
    }

    public com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup getUriRelativeFilterGroup(int arg0) {
        return com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup.wrap(((android.content.IntentFilter) real).getUriRelativeFilterGroup(arg0));
    }

    public boolean hasAction(java.lang.String arg0) {
        return ((android.content.IntentFilter) real).hasAction(arg0);
    }

    public boolean hasCategory(java.lang.String arg0) {
        return ((android.content.IntentFilter) real).hasCategory(arg0);
    }

    public boolean hasDataAuthority(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.IntentFilter) real).hasDataAuthority(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasDataPath(java.lang.String arg0) {
        return ((android.content.IntentFilter) real).hasDataPath(arg0);
    }

    public boolean hasDataScheme(java.lang.String arg0) {
        return ((android.content.IntentFilter) real).hasDataScheme(arg0);
    }

    public boolean hasDataSchemeSpecificPart(java.lang.String arg0) {
        return ((android.content.IntentFilter) real).hasDataSchemeSpecificPart(arg0);
    }

    public boolean hasDataType(java.lang.String arg0) {
        return ((android.content.IntentFilter) real).hasDataType(arg0);
    }

    public int match(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, boolean arg2, java.lang.String arg3) {
        return ((android.content.IntentFilter) real).match(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public boolean matchAction(java.lang.String arg0) {
        return ((android.content.IntentFilter) real).matchAction(arg0);
    }

    public int matchData(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        return ((android.content.IntentFilter) real).matchData(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public int matchDataAuthority(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.IntentFilter) real).matchDataAuthority(arg0 == null ? null : arg0.getReal());
    }

    public void readFromXml(org.xmlpull.v1.XmlPullParser arg0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.content.IntentFilter) real).readFromXml(arg0);
    }

    public void setPriority(int arg0) {
        ((android.content.IntentFilter) real).setPriority(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.IntentFilter) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void writeToXml(org.xmlpull.v1.XmlSerializer arg0) throws java.io.IOException {
        ((android.content.IntentFilter) real).writeToXml(arg0);
    }

    public static final int MATCH_ADJUSTMENT_MASK = android.content.IntentFilter.MATCH_ADJUSTMENT_MASK;
    public static final int MATCH_ADJUSTMENT_NORMAL = android.content.IntentFilter.MATCH_ADJUSTMENT_NORMAL;
    public static final int MATCH_CATEGORY_EMPTY = android.content.IntentFilter.MATCH_CATEGORY_EMPTY;
    public static final int MATCH_CATEGORY_HOST = android.content.IntentFilter.MATCH_CATEGORY_HOST;
    public static final int MATCH_CATEGORY_MASK = android.content.IntentFilter.MATCH_CATEGORY_MASK;
    public static final int MATCH_CATEGORY_PATH = android.content.IntentFilter.MATCH_CATEGORY_PATH;
    public static final int MATCH_CATEGORY_PORT = android.content.IntentFilter.MATCH_CATEGORY_PORT;
    public static final int MATCH_CATEGORY_SCHEME = android.content.IntentFilter.MATCH_CATEGORY_SCHEME;
    public static final int MATCH_CATEGORY_SCHEME_SPECIFIC_PART = android.content.IntentFilter.MATCH_CATEGORY_SCHEME_SPECIFIC_PART;
    public static final int MATCH_CATEGORY_TYPE = android.content.IntentFilter.MATCH_CATEGORY_TYPE;
    public static final int NO_MATCH_ACTION = android.content.IntentFilter.NO_MATCH_ACTION;
    public static final int NO_MATCH_CATEGORY = android.content.IntentFilter.NO_MATCH_CATEGORY;
    public static final int NO_MATCH_DATA = android.content.IntentFilter.NO_MATCH_DATA;
    public static final int NO_MATCH_TYPE = android.content.IntentFilter.NO_MATCH_TYPE;
    public static final int SYSTEM_HIGH_PRIORITY = android.content.IntentFilter.SYSTEM_HIGH_PRIORITY;
    public static final int SYSTEM_LOW_PRIORITY = android.content.IntentFilter.SYSTEM_LOW_PRIORITY;

    public static final class AuthorityEntry {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AuthorityEntry(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry wrap(android.content.IntentFilter.AuthorityEntry real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry(real, (__DcgwBridgeToken) null);
        }

        public android.content.IntentFilter.AuthorityEntry getReal() {
            return (android.content.IntentFilter.AuthorityEntry) real;
        }

        public android.content.IntentFilter.AuthorityEntry unwrap() {
            return getReal();
        }

        public AuthorityEntry(java.lang.String arg0, java.lang.String arg1) {
            this(new android.content.IntentFilter.AuthorityEntry(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.content.IntentFilter.AuthorityEntry) real).equals(arg0);
        }

        public java.lang.String getHost() {
            return ((android.content.IntentFilter.AuthorityEntry) real).getHost();
        }

        public int getPort() {
            return ((android.content.IntentFilter.AuthorityEntry) real).getPort();
        }

        public int match(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return ((android.content.IntentFilter.AuthorityEntry) real).match(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class MalformedMimeTypeException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MalformedMimeTypeException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentFilter.MalformedMimeTypeException wrap(android.content.IntentFilter.MalformedMimeTypeException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentFilter.MalformedMimeTypeException(real, (__DcgwBridgeToken) null);
        }

        public android.content.IntentFilter.MalformedMimeTypeException getReal() {
            return (android.content.IntentFilter.MalformedMimeTypeException) real;
        }

        public android.content.IntentFilter.MalformedMimeTypeException unwrap() {
            return getReal();
        }

        public MalformedMimeTypeException() {
            this(new android.content.IntentFilter.MalformedMimeTypeException(), (__DcgwBridgeToken) null);
        }

        public MalformedMimeTypeException(java.lang.String arg0) {
            this(new android.content.IntentFilter.MalformedMimeTypeException(arg0), (__DcgwBridgeToken) null);
        }

    }
}
