// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class GenericDocument {
    private final android.app.appsearch.GenericDocument real;

    public GenericDocument(android.app.appsearch.GenericDocument real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument wrap(android.app.appsearch.GenericDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument(real);
    }

    public android.app.appsearch.GenericDocument unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getCreationTimestampMillis() {
        return real.getCreationTimestampMillis();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public static int getMaxIndexedProperties() {
        return android.app.appsearch.GenericDocument.getMaxIndexedProperties();
    }

    public java.lang.String getNamespace() {
        return real.getNamespace();
    }

    public java.lang.Object getProperty(java.lang.String arg0) {
        return real.getProperty(arg0);
    }

    public boolean getPropertyBoolean(java.lang.String arg0) {
        return real.getPropertyBoolean(arg0);
    }

    public boolean[] getPropertyBooleanArray(java.lang.String arg0) {
        return real.getPropertyBooleanArray(arg0);
    }

    public byte[] getPropertyBytes(java.lang.String arg0) {
        return real.getPropertyBytes(arg0);
    }

    public byte[][] getPropertyBytesArray(java.lang.String arg0) {
        return real.getPropertyBytesArray(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument getPropertyDocument(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(real.getPropertyDocument(arg0));
    }

    public android.app.appsearch.GenericDocument[] getPropertyDocumentArray(java.lang.String arg0) {
        return real.getPropertyDocumentArray(arg0);
    }

    public double getPropertyDouble(java.lang.String arg0) {
        return real.getPropertyDouble(arg0);
    }

    public double[] getPropertyDoubleArray(java.lang.String arg0) {
        return real.getPropertyDoubleArray(arg0);
    }

    public long getPropertyLong(java.lang.String arg0) {
        return real.getPropertyLong(arg0);
    }

    public long[] getPropertyLongArray(java.lang.String arg0) {
        return real.getPropertyLongArray(arg0);
    }

    public java.lang.String getPropertyString(java.lang.String arg0) {
        return real.getPropertyString(arg0);
    }

    public java.lang.String[] getPropertyStringArray(java.lang.String arg0) {
        return real.getPropertyStringArray(arg0);
    }

    public java.lang.String getSchemaType() {
        return real.getSchemaType();
    }

    public int getScore() {
        return real.getScore();
    }

    public long getTtlMillis() {
        return real.getTtlMillis();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Builder {
        private final android.app.appsearch.GenericDocument.Builder real;

        public Builder(android.app.appsearch.GenericDocument.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.Builder wrap(android.app.appsearch.GenericDocument.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.Builder(real);
        }

        public android.app.appsearch.GenericDocument.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument arg0) {
            this(new android.app.appsearch.GenericDocument.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
            this(new android.app.appsearch.GenericDocument.Builder(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.GenericDocument.wrap(real.build());
        }

    }
}
