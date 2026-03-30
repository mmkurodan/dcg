// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Region {
    private final android.graphics.Region real;

    public Region(android.graphics.Region real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Region wrap(android.graphics.Region real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Region(real);
    }

    public android.graphics.Region unwrap() {
        return real;
    }

    public Region() {
        this(new android.graphics.Region());
    }

    public Region(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.graphics.Region(arg0 == null ? null : arg0.unwrap()));
    }

    public Region(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        this(new android.graphics.Region(arg0 == null ? null : arg0.unwrap()));
    }

    public Region(int arg0, int arg1, int arg2, int arg3) {
        this(new android.graphics.Region(arg0, arg1, arg2, arg3));
    }

    public boolean contains(int arg0, int arg1) {
        return real.contains(arg0, arg1);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getBoundaryPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getBoundaryPath());
    }

    public boolean getBoundaryPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return real.getBoundaryPath(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBounds());
    }

    public boolean getBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getBounds(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isComplex() {
        return real.isComplex();
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public boolean isRect() {
        return real.isRect();
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Region arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return real.op(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Region.Op arg1) {
        return real.op(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1, com.micklab.dcg.wrapper.android.graphics.Region.Op arg2) {
        return real.op(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Region arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1, com.micklab.dcg.wrapper.android.graphics.Region.Op arg2) {
        return real.op(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean op(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Region.Op arg4) {
        return real.op(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public boolean quickContains(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.quickContains(arg0 == null ? null : arg0.unwrap());
    }

    public boolean quickContains(int arg0, int arg1, int arg2, int arg3) {
        return real.quickContains(arg0, arg1, arg2, arg3);
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return real.quickReject(arg0 == null ? null : arg0.unwrap());
    }

    public boolean quickReject(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.quickReject(arg0 == null ? null : arg0.unwrap());
    }

    public boolean quickReject(int arg0, int arg1, int arg2, int arg3) {
        return real.quickReject(arg0, arg1, arg2, arg3);
    }

    public boolean set(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return real.set(arg0 == null ? null : arg0.unwrap());
    }

    public boolean set(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.set(arg0 == null ? null : arg0.unwrap());
    }

    public boolean set(int arg0, int arg1, int arg2, int arg3) {
        return real.set(arg0, arg1, arg2, arg3);
    }

    public void setEmpty() {
        real.setEmpty();
    }

    public boolean setPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1) {
        return real.setPath(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void translate(int arg0, int arg1) {
        real.translate(arg0, arg1);
    }

    public void translate(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Region arg2) {
        real.translate(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean union(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.union(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Op {
        private final android.graphics.Region.Op real;

        public Op(android.graphics.Region.Op real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Region.Op wrap(android.graphics.Region.Op real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Region.Op(real);
        }

        public android.graphics.Region.Op unwrap() {
            return real;
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
