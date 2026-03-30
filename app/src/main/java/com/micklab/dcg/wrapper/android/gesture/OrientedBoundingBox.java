// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class OrientedBoundingBox {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OrientedBoundingBox(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox wrap(android.gesture.OrientedBoundingBox real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.OrientedBoundingBox getReal() {
        return (android.gesture.OrientedBoundingBox) real;
    }

    public android.gesture.OrientedBoundingBox unwrap() {
        return getReal();
    }


}
