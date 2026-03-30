// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class LruCache {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LruCache(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.LruCache wrap(android.util.LruCache real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.LruCache(real, (__DcgwBridgeToken) null);
    }

    public android.util.LruCache getReal() {
        return (android.util.LruCache) real;
    }

    public android.util.LruCache unwrap() {
        return getReal();
    }

    public LruCache(int arg0) {
        this(new android.util.LruCache(arg0), (__DcgwBridgeToken) null);
    }

    public int createCount() {
        return ((android.util.LruCache) real).createCount();
    }

    public void evictAll() {
        ((android.util.LruCache) real).evictAll();
    }

    public int evictionCount() {
        return ((android.util.LruCache) real).evictionCount();
    }

    public java.lang.Object get(java.lang.Object arg0) {
        return ((android.util.LruCache) real).get(arg0);
    }

    public int hitCount() {
        return ((android.util.LruCache) real).hitCount();
    }

    public int maxSize() {
        return ((android.util.LruCache) real).maxSize();
    }

    public int missCount() {
        return ((android.util.LruCache) real).missCount();
    }

    public java.lang.Object put(java.lang.Object arg0, java.lang.Object arg1) {
        return ((android.util.LruCache) real).put(arg0, arg1);
    }

    public int putCount() {
        return ((android.util.LruCache) real).putCount();
    }

    public java.lang.Object remove(java.lang.Object arg0) {
        return ((android.util.LruCache) real).remove(arg0);
    }

    public void resize(int arg0) {
        ((android.util.LruCache) real).resize(arg0);
    }

    public int size() {
        return ((android.util.LruCache) real).size();
    }

    public java.lang.String toString() {
        return ((android.util.LruCache) real).toString();
    }

    public void trimToSize(int arg0) {
        ((android.util.LruCache) real).trimToSize(arg0);
    }

}
