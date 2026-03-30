// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseBooleanArray {
    private final android.util.SparseBooleanArray real;

    public SparseBooleanArray(android.util.SparseBooleanArray real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseBooleanArray wrap(android.util.SparseBooleanArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseBooleanArray(real);
    }

    public android.util.SparseBooleanArray unwrap() {
        return real;
    }

    public SparseBooleanArray() {
        this(new android.util.SparseBooleanArray());
    }

    public SparseBooleanArray(int arg0) {
        this(new android.util.SparseBooleanArray(arg0));
    }

    public void append(int arg0, boolean arg1) {
        real.append(arg0, arg1);
    }

    public void clear() {
        real.clear();
    }

    public com.micklab.dcg.wrapper.android.util.SparseBooleanArray clone() {
        return com.micklab.dcg.wrapper.android.util.SparseBooleanArray.wrap(real.clone());
    }

    public void delete(int arg0) {
        real.delete(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean get(int arg0) {
        return real.get(arg0);
    }

    public boolean get(int arg0, boolean arg1) {
        return real.get(arg0, arg1);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int indexOfKey(int arg0) {
        return real.indexOfKey(arg0);
    }

    public int indexOfValue(boolean arg0) {
        return real.indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return real.keyAt(arg0);
    }

    public void put(int arg0, boolean arg1) {
        real.put(arg0, arg1);
    }

    public void removeAt(int arg0) {
        real.removeAt(arg0);
    }

    public void setValueAt(int arg0, boolean arg1) {
        real.setValueAt(arg0, arg1);
    }

    public int size() {
        return real.size();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public boolean valueAt(int arg0) {
        return real.valueAt(arg0);
    }

}
