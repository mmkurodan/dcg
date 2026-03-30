// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RegionIterator {
    private final android.graphics.RegionIterator real;

    public RegionIterator(android.graphics.RegionIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RegionIterator wrap(android.graphics.RegionIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RegionIterator(real);
    }

    public android.graphics.RegionIterator unwrap() {
        return real;
    }

    public RegionIterator(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        this(new android.graphics.RegionIterator(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean next(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.next(arg0 == null ? null : arg0.unwrap());
    }

}
