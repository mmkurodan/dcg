// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseArray {
    private final android.util.SparseArray real;

    public SparseArray(android.util.SparseArray real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseArray wrap(android.util.SparseArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseArray(real);
    }

    public android.util.SparseArray unwrap() {
        return real;
    }

    public SparseArray() {
        this(new android.util.SparseArray());
    }

    public SparseArray(int arg0) {
        this(new android.util.SparseArray(arg0));
    }

    public void append(int arg0, java.lang.Object arg1) {
        real.append(arg0, arg1);
    }

    public void clear() {
        real.clear();
    }

    public boolean contains(int arg0) {
        return real.contains(arg0);
    }

    public int contentHashCode() {
        return real.contentHashCode();
    }

    public void delete(int arg0) {
        real.delete(arg0);
    }

    public java.lang.Object get(int arg0) {
        return real.get(arg0);
    }

    public java.lang.Object get(int arg0, java.lang.Object arg1) {
        return real.get(arg0, arg1);
    }

    public int indexOfKey(int arg0) {
        return real.indexOfKey(arg0);
    }

    public int indexOfValue(java.lang.Object arg0) {
        return real.indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return real.keyAt(arg0);
    }

    public void put(int arg0, java.lang.Object arg1) {
        real.put(arg0, arg1);
    }

    public void remove(int arg0) {
        real.remove(arg0);
    }

    public void removeAt(int arg0) {
        real.removeAt(arg0);
    }

    public void removeAtRange(int arg0, int arg1) {
        real.removeAtRange(arg0, arg1);
    }

    public void set(int arg0, java.lang.Object arg1) {
        real.set(arg0, arg1);
    }

    public void setValueAt(int arg0, java.lang.Object arg1) {
        real.setValueAt(arg0, arg1);
    }

    public int size() {
        return real.size();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public java.lang.Object valueAt(int arg0) {
        return real.valueAt(arg0);
    }

}
