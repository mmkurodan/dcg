// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class ArrayMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ArrayMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.ArrayMap wrap(android.util.ArrayMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.ArrayMap(real, (__DcgwBridgeToken) null);
    }

    public android.util.ArrayMap getReal() {
        return (android.util.ArrayMap) real;
    }

    public android.util.ArrayMap unwrap() {
        return getReal();
    }

    public ArrayMap() {
        this(new android.util.ArrayMap(), (__DcgwBridgeToken) null);
    }

    public ArrayMap(com.micklab.dcg.wrapper.android.util.ArrayMap arg0) {
        this(new android.util.ArrayMap(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ArrayMap(int arg0) {
        this(new android.util.ArrayMap(arg0), (__DcgwBridgeToken) null);
    }

    public void clear() {
        ((android.util.ArrayMap) real).clear();
    }

    public boolean containsKey(java.lang.Object arg0) {
        return ((android.util.ArrayMap) real).containsKey(arg0);
    }

    public boolean containsValue(java.lang.Object arg0) {
        return ((android.util.ArrayMap) real).containsValue(arg0);
    }

    public void ensureCapacity(int arg0) {
        ((android.util.ArrayMap) real).ensureCapacity(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.ArrayMap) real).equals(arg0);
    }

    public java.lang.Object get(java.lang.Object arg0) {
        return ((android.util.ArrayMap) real).get(arg0);
    }

    public int hashCode() {
        return ((android.util.ArrayMap) real).hashCode();
    }

    public int indexOfKey(java.lang.Object arg0) {
        return ((android.util.ArrayMap) real).indexOfKey(arg0);
    }

    public int indexOfValue(java.lang.Object arg0) {
        return ((android.util.ArrayMap) real).indexOfValue(arg0);
    }

    public boolean isEmpty() {
        return ((android.util.ArrayMap) real).isEmpty();
    }

    public java.lang.Object keyAt(int arg0) {
        return ((android.util.ArrayMap) real).keyAt(arg0);
    }

    public java.lang.Object put(java.lang.Object arg0, java.lang.Object arg1) {
        return ((android.util.ArrayMap) real).put(arg0, arg1);
    }

    public java.lang.Object remove(java.lang.Object arg0) {
        return ((android.util.ArrayMap) real).remove(arg0);
    }

    public java.lang.Object removeAt(int arg0) {
        return ((android.util.ArrayMap) real).removeAt(arg0);
    }

    public java.lang.Object setValueAt(int arg0, java.lang.Object arg1) {
        return ((android.util.ArrayMap) real).setValueAt(arg0, arg1);
    }

    public int size() {
        return ((android.util.ArrayMap) real).size();
    }

    public java.lang.String toString() {
        return ((android.util.ArrayMap) real).toString();
    }

    public java.lang.Object valueAt(int arg0) {
        return ((android.util.ArrayMap) real).valueAt(arg0);
    }

}
