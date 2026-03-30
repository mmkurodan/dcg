// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LruCache {
    private final android.util.LruCache real;

    public LruCache(android.util.LruCache real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LruCache wrap(android.util.LruCache real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LruCache(real);
    }

    public android.util.LruCache unwrap() {
        return real;
    }

    public LruCache(int arg0) {
        this(new android.util.LruCache(arg0));
    }

    public int createCount() {
        return real.createCount();
    }

    public void evictAll() {
        real.evictAll();
    }

    public int evictionCount() {
        return real.evictionCount();
    }

    public java.lang.Object get(java.lang.Object arg0) {
        return real.get(arg0);
    }

    public int hitCount() {
        return real.hitCount();
    }

    public int maxSize() {
        return real.maxSize();
    }

    public int missCount() {
        return real.missCount();
    }

    public java.lang.Object put(java.lang.Object arg0, java.lang.Object arg1) {
        return real.put(arg0, arg1);
    }

    public int putCount() {
        return real.putCount();
    }

    public java.lang.Object remove(java.lang.Object arg0) {
        return real.remove(arg0);
    }

    public void resize(int arg0) {
        real.resize(arg0);
    }

    public int size() {
        return real.size();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void trimToSize(int arg0) {
        real.trimToSize(arg0);
    }

}
