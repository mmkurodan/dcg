// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RegionIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RegionIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RegionIterator wrap(android.graphics.RegionIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RegionIterator(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.RegionIterator getReal() {
        return (android.graphics.RegionIterator) real;
    }

    public android.graphics.RegionIterator unwrap() {
        return getReal();
    }

    public RegionIterator(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        this(new android.graphics.RegionIterator(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean next(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.RegionIterator) real).next(arg0 == null ? null : arg0.getReal());
    }

}
