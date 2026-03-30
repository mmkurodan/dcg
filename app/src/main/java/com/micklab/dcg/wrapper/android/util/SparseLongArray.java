// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseLongArray {
    private final android.util.SparseLongArray real;

    public SparseLongArray(android.util.SparseLongArray real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseLongArray wrap(android.util.SparseLongArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseLongArray(real);
    }

    public android.util.SparseLongArray unwrap() {
        return real;
    }

    public SparseLongArray() {
        this(new android.util.SparseLongArray());
    }

    public SparseLongArray(int arg0) {
        this(new android.util.SparseLongArray(arg0));
    }

    public void append(int arg0, long arg1) {
        real.append(arg0, arg1);
    }

    public void clear() {
        real.clear();
    }

    public com.micklab.dcg.wrapper.android.util.SparseLongArray clone() {
        return com.micklab.dcg.wrapper.android.util.SparseLongArray.wrap(real.clone());
    }

    public void delete(int arg0) {
        real.delete(arg0);
    }

    public long get(int arg0) {
        return real.get(arg0);
    }

    public long get(int arg0, long arg1) {
        return real.get(arg0, arg1);
    }

    public int indexOfKey(int arg0) {
        return real.indexOfKey(arg0);
    }

    public int indexOfValue(long arg0) {
        return real.indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return real.keyAt(arg0);
    }

    public void put(int arg0, long arg1) {
        real.put(arg0, arg1);
    }

    public void removeAt(int arg0) {
        real.removeAt(arg0);
    }

    public int size() {
        return real.size();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public long valueAt(int arg0) {
        return real.valueAt(arg0);
    }

}
