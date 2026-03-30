// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseArray {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SparseArray(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseArray wrap(android.util.SparseArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseArray(real, (__DcgwBridgeToken) null);
    }

    public android.util.SparseArray getReal() {
        return (android.util.SparseArray) real;
    }

    public android.util.SparseArray unwrap() {
        return getReal();
    }

    public SparseArray() {
        this(new android.util.SparseArray(), (__DcgwBridgeToken) null);
    }

    public SparseArray(int arg0) {
        this(new android.util.SparseArray(arg0), (__DcgwBridgeToken) null);
    }

    public void append(int arg0, java.lang.Object arg1) {
        ((android.util.SparseArray) real).append(arg0, arg1);
    }

    public void clear() {
        ((android.util.SparseArray) real).clear();
    }

    public boolean contains(int arg0) {
        return ((android.util.SparseArray) real).contains(arg0);
    }

    public int contentHashCode() {
        return ((android.util.SparseArray) real).contentHashCode();
    }

    public void delete(int arg0) {
        ((android.util.SparseArray) real).delete(arg0);
    }

    public java.lang.Object get(int arg0) {
        return ((android.util.SparseArray) real).get(arg0);
    }

    public java.lang.Object get(int arg0, java.lang.Object arg1) {
        return ((android.util.SparseArray) real).get(arg0, arg1);
    }

    public int indexOfKey(int arg0) {
        return ((android.util.SparseArray) real).indexOfKey(arg0);
    }

    public int indexOfValue(java.lang.Object arg0) {
        return ((android.util.SparseArray) real).indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return ((android.util.SparseArray) real).keyAt(arg0);
    }

    public void put(int arg0, java.lang.Object arg1) {
        ((android.util.SparseArray) real).put(arg0, arg1);
    }

    public void remove(int arg0) {
        ((android.util.SparseArray) real).remove(arg0);
    }

    public void removeAt(int arg0) {
        ((android.util.SparseArray) real).removeAt(arg0);
    }

    public void removeAtRange(int arg0, int arg1) {
        ((android.util.SparseArray) real).removeAtRange(arg0, arg1);
    }

    public void set(int arg0, java.lang.Object arg1) {
        ((android.util.SparseArray) real).set(arg0, arg1);
    }

    public void setValueAt(int arg0, java.lang.Object arg1) {
        ((android.util.SparseArray) real).setValueAt(arg0, arg1);
    }

    public int size() {
        return ((android.util.SparseArray) real).size();
    }

    public java.lang.String toString() {
        return ((android.util.SparseArray) real).toString();
    }

    public java.lang.Object valueAt(int arg0) {
        return ((android.util.SparseArray) real).valueAt(arg0);
    }

}
