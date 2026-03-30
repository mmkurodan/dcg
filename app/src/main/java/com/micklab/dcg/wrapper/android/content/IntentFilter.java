// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class IntentFilter {
    private final android.content.IntentFilter real;

    public IntentFilter(android.content.IntentFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.IntentFilter wrap(android.content.IntentFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentFilter(real);
    }

    public android.content.IntentFilter unwrap() {
        return real;
    }

    public IntentFilter() {
        this(new android.content.IntentFilter());
    }

    public IntentFilter(com.micklab.dcg.wrapper.android.content.IntentFilter arg0) {
        this(new android.content.IntentFilter(arg0 == null ? null : arg0.unwrap()));
    }

    public IntentFilter(java.lang.String arg0) {
        this(new android.content.IntentFilter(arg0));
    }

    public IntentFilter(java.lang.String arg0, java.lang.String arg1) throws android.content.IntentFilter.MalformedMimeTypeException {
        this(new android.content.IntentFilter(arg0, arg1));
    }

    public void addAction(java.lang.String arg0) {
        real.addAction(arg0);
    }

    public void addCategory(java.lang.String arg0) {
        real.addCategory(arg0);
    }

    public void addDataAuthority(java.lang.String arg0, java.lang.String arg1) {
        real.addDataAuthority(arg0, arg1);
    }

    public void addDataPath(java.lang.String arg0, int arg1) {
        real.addDataPath(arg0, arg1);
    }

    public void addDataScheme(java.lang.String arg0) {
        real.addDataScheme(arg0);
    }

    public void addDataSchemeSpecificPart(java.lang.String arg0, int arg1) {
        real.addDataSchemeSpecificPart(arg0, arg1);
    }

    public void addDataType(java.lang.String arg0) throws android.content.IntentFilter.MalformedMimeTypeException {
        real.addDataType(arg0);
    }

    public void addUriRelativeFilterGroup(com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup arg0) {
        real.addUriRelativeFilterGroup(arg0 == null ? null : arg0.unwrap());
    }

    public void clearUriRelativeFilterGroups() {
        real.clearUriRelativeFilterGroups();
    }

    public int countActions() {
        return real.countActions();
    }

    public int countCategories() {
        return real.countCategories();
    }

    public int countDataAuthorities() {
        return real.countDataAuthorities();
    }

    public int countDataPaths() {
        return real.countDataPaths();
    }

    public int countDataSchemeSpecificParts() {
        return real.countDataSchemeSpecificParts();
    }

    public int countDataSchemes() {
        return real.countDataSchemes();
    }

    public int countDataTypes() {
        return real.countDataTypes();
    }

    public int countUriRelativeFilterGroups() {
        return real.countUriRelativeFilterGroups();
    }

    public static com.micklab.dcg.wrapper.android.content.IntentFilter create(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.IntentFilter.wrap(android.content.IntentFilter.create(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.lang.String getAction(int arg0) {
        return real.getAction(arg0);
    }

    public java.lang.String getCategory(int arg0) {
        return real.getCategory(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry getDataAuthority(int arg0) {
        return com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry.wrap(real.getDataAuthority(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.PatternMatcher getDataPath(int arg0) {
        return com.micklab.dcg.wrapper.android.os.PatternMatcher.wrap(real.getDataPath(arg0));
    }

    public java.lang.String getDataScheme(int arg0) {
        return real.getDataScheme(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.PatternMatcher getDataSchemeSpecificPart(int arg0) {
        return com.micklab.dcg.wrapper.android.os.PatternMatcher.wrap(real.getDataSchemeSpecificPart(arg0));
    }

    public java.lang.String getDataType(int arg0) {
        return real.getDataType(arg0);
    }

    public int getPriority() {
        return real.getPriority();
    }

    public com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup getUriRelativeFilterGroup(int arg0) {
        return com.micklab.dcg.wrapper.android.content.UriRelativeFilterGroup.wrap(real.getUriRelativeFilterGroup(arg0));
    }

    public boolean hasAction(java.lang.String arg0) {
        return real.hasAction(arg0);
    }

    public boolean hasCategory(java.lang.String arg0) {
        return real.hasCategory(arg0);
    }

    public boolean hasDataAuthority(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.hasDataAuthority(arg0 == null ? null : arg0.unwrap());
    }

    public boolean hasDataPath(java.lang.String arg0) {
        return real.hasDataPath(arg0);
    }

    public boolean hasDataScheme(java.lang.String arg0) {
        return real.hasDataScheme(arg0);
    }

    public boolean hasDataSchemeSpecificPart(java.lang.String arg0) {
        return real.hasDataSchemeSpecificPart(arg0);
    }

    public boolean hasDataType(java.lang.String arg0) {
        return real.hasDataType(arg0);
    }

    public int match(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, boolean arg2, java.lang.String arg3) {
        return real.match(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public boolean matchAction(java.lang.String arg0) {
        return real.matchAction(arg0);
    }

    public int matchData(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        return real.matchData(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public int matchDataAuthority(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.matchDataAuthority(arg0 == null ? null : arg0.unwrap());
    }

    public void readFromXml(org.xmlpull.v1.XmlPullParser arg0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.readFromXml(arg0);
    }

    public void setPriority(int arg0) {
        real.setPriority(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void writeToXml(org.xmlpull.v1.XmlSerializer arg0) throws java.io.IOException {
        real.writeToXml(arg0);
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
        private final android.content.IntentFilter.AuthorityEntry real;

        public AuthorityEntry(android.content.IntentFilter.AuthorityEntry real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry wrap(android.content.IntentFilter.AuthorityEntry real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentFilter.AuthorityEntry(real);
        }

        public android.content.IntentFilter.AuthorityEntry unwrap() {
            return real;
        }

        public AuthorityEntry(java.lang.String arg0, java.lang.String arg1) {
            this(new android.content.IntentFilter.AuthorityEntry(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getHost() {
            return real.getHost();
        }

        public int getPort() {
            return real.getPort();
        }

        public int match(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return real.match(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class MalformedMimeTypeException {
        private final android.content.IntentFilter.MalformedMimeTypeException real;

        public MalformedMimeTypeException(android.content.IntentFilter.MalformedMimeTypeException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.IntentFilter.MalformedMimeTypeException wrap(android.content.IntentFilter.MalformedMimeTypeException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.IntentFilter.MalformedMimeTypeException(real);
        }

        public android.content.IntentFilter.MalformedMimeTypeException unwrap() {
            return real;
        }

        public MalformedMimeTypeException() {
            this(new android.content.IntentFilter.MalformedMimeTypeException());
        }

        public MalformedMimeTypeException(java.lang.String arg0) {
            this(new android.content.IntentFilter.MalformedMimeTypeException(arg0));
        }

    }
}
