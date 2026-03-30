// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LongSparseArray {
    private final android.util.LongSparseArray real;

    public LongSparseArray(android.util.LongSparseArray real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LongSparseArray wrap(android.util.LongSparseArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LongSparseArray(real);
    }

    public android.util.LongSparseArray unwrap() {
        return real;
    }

    public LongSparseArray() {
        this(new android.util.LongSparseArray());
    }

    public LongSparseArray(int arg0) {
        this(new android.util.LongSparseArray(arg0));
    }

    public void append(long arg0, java.lang.Object arg1) {
        real.append(arg0, arg1);
    }

    public void clear() {
        real.clear();
    }

    public void delete(long arg0) {
        real.delete(arg0);
    }

    public java.lang.Object get(long arg0) {
        return real.get(arg0);
    }

    public java.lang.Object get(long arg0, java.lang.Object arg1) {
        return real.get(arg0, arg1);
    }

    public int indexOfKey(long arg0) {
        return real.indexOfKey(arg0);
    }

    public int indexOfValue(java.lang.Object arg0) {
        return real.indexOfValue(arg0);
    }

    public long keyAt(int arg0) {
        return real.keyAt(arg0);
    }

    public void put(long arg0, java.lang.Object arg1) {
        real.put(arg0, arg1);
    }

    public void remove(long arg0) {
        real.remove(arg0);
    }

    public void removeAt(int arg0) {
        real.removeAt(arg0);
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
