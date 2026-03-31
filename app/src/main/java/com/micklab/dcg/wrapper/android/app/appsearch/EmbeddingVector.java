// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class EmbeddingVector {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmbeddingVector(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.EmbeddingVector wrap(android.app.appsearch.EmbeddingVector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.EmbeddingVector(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.EmbeddingVector getReal() {
        return (android.app.appsearch.EmbeddingVector) real;
    }

    public android.app.appsearch.EmbeddingVector unwrap() {
        return getReal();
    }

    public EmbeddingVector(float[] arg0, java.lang.String arg1) {
        this(new android.app.appsearch.EmbeddingVector(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.appsearch.EmbeddingVector) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.EmbeddingVector) real).equals(arg0);
    }

    public java.lang.String getModelSignature() {
        return ((android.app.appsearch.EmbeddingVector) real).getModelSignature();
    }

    public float[] getValues() {
        return ((android.app.appsearch.EmbeddingVector) real).getValues();
    }

    public int hashCode() {
        return ((android.app.appsearch.EmbeddingVector) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.EmbeddingVector) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
