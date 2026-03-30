// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseIntArray {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SparseIntArray(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseIntArray wrap(android.util.SparseIntArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseIntArray(real, (__DcgwBridgeToken) null);
    }

    public android.util.SparseIntArray getReal() {
        return (android.util.SparseIntArray) real;
    }

    public android.util.SparseIntArray unwrap() {
        return getReal();
    }

    public SparseIntArray() {
        this(new android.util.SparseIntArray(), (__DcgwBridgeToken) null);
    }

    public SparseIntArray(int arg0) {
        this(new android.util.SparseIntArray(arg0), (__DcgwBridgeToken) null);
    }

    public void append(int arg0, int arg1) {
        ((android.util.SparseIntArray) real).append(arg0, arg1);
    }

    public void clear() {
        ((android.util.SparseIntArray) real).clear();
    }

    public com.micklab.dcg.wrapper.android.util.SparseIntArray clone() {
        return com.micklab.dcg.wrapper.android.util.SparseIntArray.wrap(((android.util.SparseIntArray) real).clone());
    }

    public void delete(int arg0) {
        ((android.util.SparseIntArray) real).delete(arg0);
    }

    public int get(int arg0) {
        return ((android.util.SparseIntArray) real).get(arg0);
    }

    public int get(int arg0, int arg1) {
        return ((android.util.SparseIntArray) real).get(arg0, arg1);
    }

    public int indexOfKey(int arg0) {
        return ((android.util.SparseIntArray) real).indexOfKey(arg0);
    }

    public int indexOfValue(int arg0) {
        return ((android.util.SparseIntArray) real).indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return ((android.util.SparseIntArray) real).keyAt(arg0);
    }

    public void put(int arg0, int arg1) {
        ((android.util.SparseIntArray) real).put(arg0, arg1);
    }

    public void removeAt(int arg0) {
        ((android.util.SparseIntArray) real).removeAt(arg0);
    }

    public void setValueAt(int arg0, int arg1) {
        ((android.util.SparseIntArray) real).setValueAt(arg0, arg1);
    }

    public int size() {
        return ((android.util.SparseIntArray) real).size();
    }

    public java.lang.String toString() {
        return ((android.util.SparseIntArray) real).toString();
    }

    public int valueAt(int arg0) {
        return ((android.util.SparseIntArray) real).valueAt(arg0);
    }

}
