// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class ArraySet {
    private final android.util.ArraySet real;

    public ArraySet(android.util.ArraySet real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.ArraySet wrap(android.util.ArraySet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.ArraySet(real);
    }

    public android.util.ArraySet unwrap() {
        return real;
    }

    public ArraySet() {
        this(new android.util.ArraySet());
    }

    public ArraySet(java.lang.Object[] arg0) {
        this(new android.util.ArraySet(arg0));
    }

    public ArraySet(java.util.Collection arg0) {
        this(new android.util.ArraySet(arg0));
    }

    public ArraySet(com.micklab.dcg.wrapper.android.util.ArraySet arg0) {
        this(new android.util.ArraySet(arg0 == null ? null : arg0.unwrap()));
    }

    public ArraySet(int arg0) {
        this(new android.util.ArraySet(arg0));
    }

    public boolean add(java.lang.Object arg0) {
        return real.add(arg0);
    }

    public void clear() {
        real.clear();
    }

    public boolean contains(java.lang.Object arg0) {
        return real.contains(arg0);
    }

    public void ensureCapacity(int arg0) {
        real.ensureCapacity(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int indexOf(java.lang.Object arg0) {
        return real.indexOf(arg0);
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public boolean remove(java.lang.Object arg0) {
        return real.remove(arg0);
    }

    public java.lang.Object removeAt(int arg0) {
        return real.removeAt(arg0);
    }

    public int size() {
        return real.size();
    }

    public java.lang.Object[] toArray() {
        return real.toArray();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public java.lang.Object valueAt(int arg0) {
        return real.valueAt(arg0);
    }

}
