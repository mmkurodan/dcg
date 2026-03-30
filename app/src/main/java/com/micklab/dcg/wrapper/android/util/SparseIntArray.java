// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseIntArray {
    private final android.util.SparseIntArray real;

    public SparseIntArray(android.util.SparseIntArray real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseIntArray wrap(android.util.SparseIntArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseIntArray(real);
    }

    public android.util.SparseIntArray unwrap() {
        return real;
    }

    public SparseIntArray() {
        this(new android.util.SparseIntArray());
    }

    public SparseIntArray(int arg0) {
        this(new android.util.SparseIntArray(arg0));
    }

    public void append(int arg0, int arg1) {
        real.append(arg0, arg1);
    }

    public void clear() {
        real.clear();
    }

    public com.micklab.dcg.wrapper.android.util.SparseIntArray clone() {
        return com.micklab.dcg.wrapper.android.util.SparseIntArray.wrap(real.clone());
    }

    public void delete(int arg0) {
        real.delete(arg0);
    }

    public int get(int arg0) {
        return real.get(arg0);
    }

    public int get(int arg0, int arg1) {
        return real.get(arg0, arg1);
    }

    public int indexOfKey(int arg0) {
        return real.indexOfKey(arg0);
    }

    public int indexOfValue(int arg0) {
        return real.indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return real.keyAt(arg0);
    }

    public void put(int arg0, int arg1) {
        real.put(arg0, arg1);
    }

    public void removeAt(int arg0) {
        real.removeAt(arg0);
    }

    public void setValueAt(int arg0, int arg1) {
        real.setValueAt(arg0, arg1);
    }

    public int size() {
        return real.size();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public int valueAt(int arg0) {
        return real.valueAt(arg0);
    }

}
