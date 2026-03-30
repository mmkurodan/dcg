// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GenericDocument {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GenericDocument(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument wrap(android.app.appsearch.GenericDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.GenericDocument getReal() {
        return (android.app.appsearch.GenericDocument) real;
    }

    public android.app.appsearch.GenericDocument unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.GenericDocument) real).equals(arg0);
    }

    public long getCreationTimestampMillis() {
        return ((android.app.appsearch.GenericDocument) real).getCreationTimestampMillis();
    }

    public java.lang.String getId() {
        return ((android.app.appsearch.GenericDocument) real).getId();
    }

    public static int getMaxIndexedProperties() {
        return android.app.appsearch.GenericDocument.getMaxIndexedProperties();
    }

    public java.lang.String getNamespace() {
        return ((android.app.appsearch.GenericDocument) real).getNamespace();
    }

    public java.lang.Object getProperty(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getProperty(arg0);
    }

    public boolean getPropertyBoolean(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyBoolean(arg0);
    }

    public boolean[] getPropertyBooleanArray(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyBooleanArray(arg0);
    }

    public byte[] getPropertyBytes(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyBytes(arg0);
    }

    public byte[][] getPropertyBytesArray(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyBytesArray(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument getPropertyDocument(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(((android.app.appsearch.GenericDocument) real).getPropertyDocument(arg0));
    }

    public android.app.appsearch.GenericDocument[] getPropertyDocumentArray(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyDocumentArray(arg0);
    }

    public double getPropertyDouble(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyDouble(arg0);
    }

    public double[] getPropertyDoubleArray(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyDoubleArray(arg0);
    }

    public long getPropertyLong(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyLong(arg0);
    }

    public long[] getPropertyLongArray(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyLongArray(arg0);
    }

    public java.lang.String getPropertyString(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyString(arg0);
    }

    public java.lang.String[] getPropertyStringArray(java.lang.String arg0) {
        return ((android.app.appsearch.GenericDocument) real).getPropertyStringArray(arg0);
    }

    public java.lang.String getSchemaType() {
        return ((android.app.appsearch.GenericDocument) real).getSchemaType();
    }

    public int getScore() {
        return ((android.app.appsearch.GenericDocument) real).getScore();
    }

    public long getTtlMillis() {
        return ((android.app.appsearch.GenericDocument) real).getTtlMillis();
    }

    public int hashCode() {
        return ((android.app.appsearch.GenericDocument) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.appsearch.GenericDocument) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.Builder wrap(android.app.appsearch.GenericDocument.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.GenericDocument.Builder getReal() {
            return (android.app.appsearch.GenericDocument.Builder) real;
        }

        public android.app.appsearch.GenericDocument.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg0) {
            this(new android.app.appsearch.GenericDocument.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.app.appsearch.GenericDocument.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(((android.app.appsearch.GenericDocument.Builder) real).build());
        }

    }
}
