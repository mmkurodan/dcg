// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class JsonWriter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JsonWriter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.JsonWriter wrap(android.util.JsonWriter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.JsonWriter(real, (__DcgwBridgeToken) null);
    }

    public android.util.JsonWriter getReal() {
        return (android.util.JsonWriter) real;
    }

    public android.util.JsonWriter unwrap() {
        return getReal();
    }

    public JsonWriter(java.io.Writer arg0) {
        this(new android.util.JsonWriter(arg0), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter beginArray() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).beginArray());
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter beginObject() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).beginObject());
    }

    public void close() throws java.io.IOException {
        ((android.util.JsonWriter) real).close();
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter endArray() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).endArray());
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter endObject() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).endObject());
    }

    public void flush() throws java.io.IOException {
        ((android.util.JsonWriter) real).flush();
    }

    public boolean isLenient() {
        return ((android.util.JsonWriter) real).isLenient();
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter name(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).name(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter nullValue() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).nullValue());
    }

    public void setIndent(java.lang.String arg0) {
        ((android.util.JsonWriter) real).setIndent(arg0);
    }

    public void setLenient(boolean arg0) {
        ((android.util.JsonWriter) real).setLenient(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(boolean arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(double arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(long arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).value(arg0));
    }

    public com.micklab.dcg.wrapper.android.util.JsonWriter value(java.lang.Number arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.util.JsonWriter.wrap(((android.util.JsonWriter) real).value(arg0));
    }

}
