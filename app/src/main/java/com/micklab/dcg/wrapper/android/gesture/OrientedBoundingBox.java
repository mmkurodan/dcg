// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class OrientedBoundingBox {
    private final android.gesture.OrientedBoundingBox real;

    public OrientedBoundingBox(android.gesture.OrientedBoundingBox real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox wrap(android.gesture.OrientedBoundingBox real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox(real);
    }

    public android.gesture.OrientedBoundingBox unwrap() {
        return real;
    }


}
