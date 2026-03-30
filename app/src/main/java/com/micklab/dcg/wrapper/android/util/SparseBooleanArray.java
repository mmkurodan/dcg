// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class SparseBooleanArray {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SparseBooleanArray(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.SparseBooleanArray wrap(android.util.SparseBooleanArray real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.SparseBooleanArray(real, (__DcgwBridgeToken) null);
    }

    public android.util.SparseBooleanArray getReal() {
        return (android.util.SparseBooleanArray) real;
    }

    public android.util.SparseBooleanArray unwrap() {
        return getReal();
    }

    public SparseBooleanArray() {
        this(new android.util.SparseBooleanArray(), (__DcgwBridgeToken) null);
    }

    public SparseBooleanArray(int arg0) {
        this(new android.util.SparseBooleanArray(arg0), (__DcgwBridgeToken) null);
    }

    public void append(int arg0, boolean arg1) {
        ((android.util.SparseBooleanArray) real).append(arg0, arg1);
    }

    public void clear() {
        ((android.util.SparseBooleanArray) real).clear();
    }

    public com.micklab.dcg.wrapper.android.util.SparseBooleanArray clone() {
        return com.micklab.dcg.wrapper.android.util.SparseBooleanArray.wrap(((android.util.SparseBooleanArray) real).clone());
    }

    public void delete(int arg0) {
        ((android.util.SparseBooleanArray) real).delete(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.util.SparseBooleanArray) real).equals(arg0);
    }

    public boolean get(int arg0) {
        return ((android.util.SparseBooleanArray) real).get(arg0);
    }

    public boolean get(int arg0, boolean arg1) {
        return ((android.util.SparseBooleanArray) real).get(arg0, arg1);
    }

    public int hashCode() {
        return ((android.util.SparseBooleanArray) real).hashCode();
    }

    public int indexOfKey(int arg0) {
        return ((android.util.SparseBooleanArray) real).indexOfKey(arg0);
    }

    public int indexOfValue(boolean arg0) {
        return ((android.util.SparseBooleanArray) real).indexOfValue(arg0);
    }

    public int keyAt(int arg0) {
        return ((android.util.SparseBooleanArray) real).keyAt(arg0);
    }

    public void put(int arg0, boolean arg1) {
        ((android.util.SparseBooleanArray) real).put(arg0, arg1);
    }

    public void removeAt(int arg0) {
        ((android.util.SparseBooleanArray) real).removeAt(arg0);
    }

    public void setValueAt(int arg0, boolean arg1) {
        ((android.util.SparseBooleanArray) real).setValueAt(arg0, arg1);
    }

    public int size() {
        return ((android.util.SparseBooleanArray) real).size();
    }

    public java.lang.String toString() {
        return ((android.util.SparseBooleanArray) real).toString();
    }

    public boolean valueAt(int arg0) {
        return ((android.util.SparseBooleanArray) real).valueAt(arg0);
    }

}
