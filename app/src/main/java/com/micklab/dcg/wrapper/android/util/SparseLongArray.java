// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseLongArray {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SparseLongArray(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseLongArray wrap(android.util.SparseLongArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseLongArray(real, (__DcgwBridgeToken) null);
    }

    public android.util.SparseLongArray getReal() {
        return (android.util.SparseLongArray) real;
    }

    public android.util.SparseLongArray unwrap() {
        return getReal();
    }

    public SparseLongArray() {
        this(new android.util.SparseLongArray(), (__DcgwBridgeToken) null);
    }

    public SparseLongArray(int arg0) {
        this(new android.util.SparseLongArray(arg0), (__DcgwBridgeToken) null);
    }

    public void append(int arg0, long arg1) {
        ((android.util.SparseLongArray) real).append(arg0, arg1);
    }

    public void clear() {
        ((android.util.SparseLongArray) real).clear();
    }

    public com.micklab.dcg.wrapper.android.util.SparseLongArray clone() {
        return com.micklab.dcg.wrapper.android.util.SparseLongArray.wrap(((android.util.SparseLongArray) real).clone());
    }

    public void delete(int arg0) {
        ((android.util.SparseLongArray) real).delete(arg0);
    }

    public long get(int arg0) {
        return ((android.util.SparseLongArray) real).get(arg0);
    }

    public long get(int arg0, long arg1) {
        return ((android.util.SparseLongArray) real).get(arg0, arg1);
    }

    public int indexOfKey(int arg0) {
        return ((android.util.SparseLongArray) real).indexOfKey(arg0);
    }

    public int indexOfValue(long arg0) {
        return ((android.util.SparseLongArray) real).indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return ((android.util.SparseLongArray) real).keyAt(arg0);
    }

    public void put(int arg0, long arg1) {
        ((android.util.SparseLongArray) real).put(arg0, arg1);
    }

    public void removeAt(int arg0) {
        ((android.util.SparseLongArray) real).removeAt(arg0);
    }

    public int size() {
        return ((android.util.SparseLongArray) real).size();
    }

    public java.lang.String toString() {
        return ((android.util.SparseLongArray) real).toString();
    }

    public long valueAt(int arg0) {
        return ((android.util.SparseLongArray) real).valueAt(arg0);
    }

}
