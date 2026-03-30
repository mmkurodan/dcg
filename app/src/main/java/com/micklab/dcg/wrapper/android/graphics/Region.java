// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Region {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Region(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Region wrap(android.graphics.Region real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Region(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Region getReal() {
        return (android.graphics.Region) real;
    }

    public android.graphics.Region unwrap() {
        return getReal();
    }

    public Region() {
        this(new android.graphics.Region(), (__DcgwBridgeToken) null);
    }

    public Region(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.graphics.Region(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Region(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        this(new android.graphics.Region(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Region(int arg0, int arg1, int arg2, int arg3) {
        this(new android.graphics.Region(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public boolean contains(int arg0, int arg1) {
        return ((android.graphics.Region) real).contains(arg0, arg1);
    }

    public int describeContents() {
        return ((android.graphics.Region) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.Region) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getBoundaryPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.graphics.Region) real).getBoundaryPath());
    }

    public boolean getBoundaryPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return ((android.graphics.Region) real).getBoundaryPath(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.Region) real).getBounds());
    }

    public boolean getBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Region) real).getBounds(arg0 == null ? null : arg0.getReal());
    }

    public boolean isComplex() {
        return ((android.graphics.Region) real).isComplex();
    }

    public boolean isEmpty() {
        return ((android.graphics.Region) real).isEmpty();
    }

    public boolean isRect() {
        return ((android.graphics.Region) real).isRect();
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Region arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return ((android.graphics.Region) real).op(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return ((android.graphics.Region) real).op(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1, com.micklab.dcg.wrapper.android.graphics.Region.Op arg2) {
        return ((android.graphics.Region) real).op(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Region arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1, com.micklab.dcg.wrapper.android.graphics.Region.Op arg2) {
        return ((android.graphics.Region) real).op(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean op(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Region.Op arg4) {
        return ((android.graphics.Region) real).op(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean quickContains(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Region) real).quickContains(arg0 == null ? null : arg0.getReal());
    }

    public boolean quickContains(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Region) real).quickContains(arg0, arg1, arg2, arg3);
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return ((android.graphics.Region) real).quickReject(arg0 == null ? null : arg0.getReal());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Region) real).quickReject(arg0 == null ? null : arg0.getReal());
    }

    public boolean quickReject(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Region) real).quickReject(arg0, arg1, arg2, arg3);
    }

    public boolean set(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return ((android.graphics.Region) real).set(arg0 == null ? null : arg0.getReal());
    }

    public boolean set(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Region) real).set(arg0 == null ? null : arg0.getReal());
    }

    public boolean set(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Region) real).set(arg0, arg1, arg2, arg3);
    }

    public void setEmpty() {
        ((android.graphics.Region) real).setEmpty();
    }

    public boolean setPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1) {
        return ((android.graphics.Region) real).setPath(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public java.lang.String toString() {
        return ((android.graphics.Region) real).toString();
    }

    public void translate(int arg0, int arg1) {
        ((android.graphics.Region) real).translate(arg0, arg1);
    }

    public void translate(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Region arg2) {
        ((android.graphics.Region) real).translate(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean union(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Region) real).union(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.Region) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Op {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Op(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Region.Op wrap(android.graphics.Region.Op real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Region.Op(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Region.Op getReal() {
            return (android.graphics.Region.Op) real;
        }

        public android.graphics.Region.Op unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Region.Op valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Region.Op.wrap(android.graphics.Region.Op.valueOf(arg0));
        }

        public static android.graphics.Region.Op[] values() {
            return android.graphics.Region.Op.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Region.Op DIFFERENCE = com.micklab.dcg.wrapper.android.graphics.Region.Op.wrap(android.graphics.Region.Op.DIFFERENCE);
        public static final com.micklab.dcg.wrapper.android.graphics.Region.Op INTERSECT = com.micklab.dcg.wrapper.android.graphics.Region.Op.wrap(android.graphics.Region.Op.INTERSECT);
        public static final com.micklab.dcg.wrapper.android.graphics.Region.Op REPLACE = com.micklab.dcg.wrapper.android.graphics.Region.Op.wrap(android.graphics.Region.Op.REPLACE);
        public static final com.micklab.dcg.wrapper.android.graphics.Region.Op REVERSE_DIFFERENCE = com.micklab.dcg.wrapper.android.graphics.Region.Op.wrap(android.graphics.Region.Op.REVERSE_DIFFERENCE);
        public static final com.micklab.dcg.wrapper.android.graphics.Region.Op UNION = com.micklab.dcg.wrapper.android.graphics.Region.Op.wrap(android.graphics.Region.Op.UNION);
        public static final com.micklab.dcg.wrapper.android.graphics.Region.Op XOR = com.micklab.dcg.wrapper.android.graphics.Region.Op.wrap(android.graphics.Region.Op.XOR);

    }
}
