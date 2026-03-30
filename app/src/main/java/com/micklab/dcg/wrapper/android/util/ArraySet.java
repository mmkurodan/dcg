// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class ArraySet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ArraySet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.ArraySet wrap(android.util.ArraySet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.ArraySet(real, (__DcgwBridgeToken) null);
    }

    public android.util.ArraySet getReal() {
        return (android.util.ArraySet) real;
    }

    public android.util.ArraySet unwrap() {
        return getReal();
    }

    public ArraySet() {
        this(new android.util.ArraySet(), (__DcgwBridgeToken) null);
    }

    public ArraySet(java.lang.Object[] arg0) {
        this(new android.util.ArraySet(arg0), (__DcgwBridgeToken) null);
    }

    public ArraySet(java.util.Collection arg0) {
        this(new android.util.ArraySet(arg0), (__DcgwBridgeToken) null);
    }

    public ArraySet(com.micklab.dcg.wrapper.android.util.ArraySet arg0) {
        this(new android.util.ArraySet(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ArraySet(int arg0) {
        this(new android.util.ArraySet(arg0), (__DcgwBridgeToken) null);
    }

    public boolean add(java.lang.Object arg0) {
        return ((android.util.ArraySet) real).add(arg0);
    }

    public void clear() {
        ((android.util.ArraySet) real).clear();
    }

    public boolean contains(java.lang.Object arg0) {
        return ((android.util.ArraySet) real).contains(arg0);
    }

    public void ensureCapacity(int arg0) {
        ((android.util.ArraySet) real).ensureCapacity(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.ArraySet) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.util.ArraySet) real).hashCode();
    }

    public int indexOf(java.lang.Object arg0) {
        return ((android.util.ArraySet) real).indexOf(arg0);
    }

    public boolean isEmpty() {
        return ((android.util.ArraySet) real).isEmpty();
    }

    public boolean remove(java.lang.Object arg0) {
        return ((android.util.ArraySet) real).remove(arg0);
    }

    public java.lang.Object removeAt(int arg0) {
        return ((android.util.ArraySet) real).removeAt(arg0);
    }

    public int size() {
        return ((android.util.ArraySet) real).size();
    }

    public java.lang.Object[] toArray() {
        return ((android.util.ArraySet) real).toArray();
    }

    public java.lang.String toString() {
        return ((android.util.ArraySet) real).toString();
    }

    public java.lang.Object valueAt(int arg0) {
        return ((android.util.ArraySet) real).valueAt(arg0);
    }

}
