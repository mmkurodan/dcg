// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class ArrayMap {
    private final android.util.ArrayMap real;

    public ArrayMap(android.util.ArrayMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.ArrayMap wrap(android.util.ArrayMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.ArrayMap(real);
    }

    public android.util.ArrayMap unwrap() {
        return real;
    }

    public ArrayMap() {
        this(new android.util.ArrayMap());
    }

    public ArrayMap(com.micklab.dcg.wrapper.android.util.ArrayMap arg0) {
        this(new android.util.ArrayMap(arg0 == null ? null : arg0.unwrap()));
    }

    public ArrayMap(int arg0) {
        this(new android.util.ArrayMap(arg0));
    }

    public void clear() {
        real.clear();
    }

    public boolean containsKey(java.lang.Object arg0) {
        return real.containsKey(arg0);
    }

    public boolean containsValue(java.lang.Object arg0) {
        return real.containsValue(arg0);
    }

    public void ensureCapacity(int arg0) {
        real.ensureCapacity(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.Object get(java.lang.Object arg0) {
        return real.get(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int indexOfKey(java.lang.Object arg0) {
        return real.indexOfKey(arg0);
    }

    public int indexOfValue(java.lang.Object arg0) {
        return real.indexOfValue(arg0);
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public java.lang.Object keyAt(int arg0) {
        return real.keyAt(arg0);
    }

    public java.lang.Object put(java.lang.Object arg0, java.lang.Object arg1) {
        return real.put(arg0, arg1);
    }

    public java.lang.Object remove(java.lang.Object arg0) {
        return real.remove(arg0);
    }

    public java.lang.Object removeAt(int arg0) {
        return real.removeAt(arg0);
    }

    public java.lang.Object setValueAt(int arg0, java.lang.Object arg1) {
        return real.setValueAt(arg0, arg1);
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
