// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LongSparseArray {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LongSparseArray(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LongSparseArray wrap(android.util.LongSparseArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LongSparseArray(real, (__DcgwBridgeToken) null);
    }

    public android.util.LongSparseArray getReal() {
        return (android.util.LongSparseArray) real;
    }

    public android.util.LongSparseArray unwrap() {
        return getReal();
    }

    public LongSparseArray() {
        this(new android.util.LongSparseArray(), (__DcgwBridgeToken) null);
    }

    public LongSparseArray(int arg0) {
        this(new android.util.LongSparseArray(arg0), (__DcgwBridgeToken) null);
    }

    public void append(long arg0, java.lang.Object arg1) {
        ((android.util.LongSparseArray) real).append(arg0, arg1);
    }

    public void clear() {
        ((android.util.LongSparseArray) real).clear();
    }

    public void delete(long arg0) {
        ((android.util.LongSparseArray) real).delete(arg0);
    }

    public java.lang.Object get(long arg0) {
        return ((android.util.LongSparseArray) real).get(arg0);
    }

    public java.lang.Object get(long arg0, java.lang.Object arg1) {
        return ((android.util.LongSparseArray) real).get(arg0, arg1);
    }

    public int indexOfKey(long arg0) {
        return ((android.util.LongSparseArray) real).indexOfKey(arg0);
    }

    public int indexOfValue(java.lang.Object arg0) {
        return ((android.util.LongSparseArray) real).indexOfValue(arg0);
    }

    public long keyAt(int arg0) {
        return ((android.util.LongSparseArray) real).keyAt(arg0);
    }

    public void put(long arg0, java.lang.Object arg1) {
        ((android.util.LongSparseArray) real).put(arg0, arg1);
    }

    public void remove(long arg0) {
        ((android.util.LongSparseArray) real).remove(arg0);
    }

    public void removeAt(int arg0) {
        ((android.util.LongSparseArray) real).removeAt(arg0);
    }

    public void setValueAt(int arg0, java.lang.Object arg1) {
        ((android.util.LongSparseArray) real).setValueAt(arg0, arg1);
    }

    public int size() {
        return ((android.util.LongSparseArray) real).size();
    }

    public java.lang.String toString() {
        return ((android.util.LongSparseArray) real).toString();
    }

    public java.lang.Object valueAt(int arg0) {
        return ((android.util.LongSparseArray) real).valueAt(arg0);
    }

}
