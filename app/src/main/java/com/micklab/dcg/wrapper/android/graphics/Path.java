// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Path {
    private final android.graphics.Path real;

    public Path(android.graphics.Path real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Path wrap(android.graphics.Path real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path(real);
    }

    public android.graphics.Path unwrap() {
        return real;
    }

    public Path() {
        this(new android.graphics.Path());
    }

    public Path(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        this(new android.graphics.Path(arg0 == null ? null : arg0.unwrap()));
    }

    public void addArc(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2) {
        real.addArc(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void addArc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        real.addArc(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void addCircle(float arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg3) {
        real.addCircle(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void addOval(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg1) {
        real.addOval(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addOval(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg4) {
        real.addOval(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void addPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        real.addPath(arg0 == null ? null : arg0.unwrap());
    }

    public void addPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1) {
        real.addPath(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, float arg2) {
        real.addPath(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void addRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg1) {
        real.addRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addRect(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg4) {
        real.addRect(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void addRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg2) {
        real.addRoundRect(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void addRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg3) {
        real.addRoundRect(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void addRoundRect(float arg0, float arg1, float arg2, float arg3, float[] arg4, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg5) {
        real.addRoundRect(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void addRoundRect(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg6) {
        real.addRoundRect(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public float[] approximate(float arg0) {
        return real.approximate(arg0);
    }

    public void arcTo(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2) {
        real.arcTo(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void arcTo(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, boolean arg3) {
        real.arcTo(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void arcTo(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, boolean arg6) {
        real.arcTo(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public void close() {
        real.close();
    }

    public void computeBounds(com.micklab.dcg.wrapper.android.graphics.RectF arg0, boolean arg1) {
        real.computeBounds(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void conicTo(float arg0, float arg1, float arg2, float arg3, float arg4) {
        real.conicTo(arg0, arg1, arg2, arg3, arg4);
    }

    public void cubicTo(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        real.cubicTo(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public com.micklab.dcg.wrapper.android.graphics.Path.FillType getFillType() {
        return com.micklab.dcg.wrapper.android.graphics.Path.FillType.wrap(real.getFillType());
    }

    public int getGenerationId() {
        return real.getGenerationId();
    }

    public com.micklab.dcg.wrapper.android.graphics.PathIterator getPathIterator() {
        return com.micklab.dcg.wrapper.android.graphics.PathIterator.wrap(real.getPathIterator());
    }

    public void incReserve(int arg0) {
        real.incReserve(arg0);
    }

    public boolean interpolate(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        return real.interpolate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean isConvex() {
        return real.isConvex();
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public boolean isInterpolatable(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return real.isInterpolatable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isInverseFillType() {
        return real.isInverseFillType();
    }

    public boolean isRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return real.isRect(arg0 == null ? null : arg0.unwrap());
    }

    public void lineTo(float arg0, float arg1) {
        real.lineTo(arg0, arg1);
    }

    public void moveTo(float arg0, float arg1) {
        real.moveTo(arg0, arg1);
    }

    public void offset(float arg0, float arg1) {
        real.offset(arg0, arg1);
    }

    public void offset(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        real.offset(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Path.Op arg1) {
        return real.op(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, com.micklab.dcg.wrapper.android.graphics.Path.Op arg2) {
        return real.op(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void quadTo(float arg0, float arg1, float arg2, float arg3) {
        real.quadTo(arg0, arg1, arg2, arg3);
    }

    public void rConicTo(float arg0, float arg1, float arg2, float arg3, float arg4) {
        real.rConicTo(arg0, arg1, arg2, arg3, arg4);
    }

    public void rCubicTo(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        real.rCubicTo(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void rLineTo(float arg0, float arg1) {
        real.rLineTo(arg0, arg1);
    }

    public void rMoveTo(float arg0, float arg1) {
        real.rMoveTo(arg0, arg1);
    }

    public void rQuadTo(float arg0, float arg1, float arg2, float arg3) {
        real.rQuadTo(arg0, arg1, arg2, arg3);
    }

    public void reset() {
        real.reset();
    }

    public void rewind() {
        real.rewind();
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void setFillType(com.micklab.dcg.wrapper.android.graphics.Path.FillType arg0) {
        real.setFillType(arg0 == null ? null : arg0.unwrap());
    }

    public void setLastPoint(float arg0, float arg1) {
        real.setLastPoint(arg0, arg1);
    }

    public void toggleInverseFillType() {
        real.toggleInverseFillType();
    }

    public void transform(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.transform(arg0 == null ? null : arg0.unwrap());
    }

    public void transform(com.micklab.dcg.wrapper.android.graphics.Matrix arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1) {
        real.transform(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class Direction {
        private final android.graphics.Path.Direction real;

        public Direction(android.graphics.Path.Direction real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.Direction wrap(android.graphics.Path.Direction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path.Direction(real);
        }

        public android.graphics.Path.Direction unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.Direction valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Path.Direction.wrap(android.graphics.Path.Direction.valueOf(arg0));
        }

        public static android.graphics.Path.Direction[] values() {
            return android.graphics.Path.Direction.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Path.Direction CCW = com.micklab.dcg.wrapper.android.graphics.Path.Direction.wrap(android.graphics.Path.Direction.CCW);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.Direction CW = com.micklab.dcg.wrapper.android.graphics.Path.Direction.wrap(android.graphics.Path.Direction.CW);

    }
    public static final class FillType {
        private final android.graphics.Path.FillType real;

        public FillType(android.graphics.Path.FillType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.FillType wrap(android.graphics.Path.FillType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path.FillType(real);
        }

        public android.graphics.Path.FillType unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.FillType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Path.FillType.wrap(android.graphics.Path.FillType.valueOf(arg0));
        }

        public static android.graphics.Path.FillType[] values() {
            return android.graphics.Path.FillType.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Path.FillType EVEN_ODD = com.micklab.dcg.wrapper.android.graphics.Path.FillType.wrap(android.graphics.Path.FillType.EVEN_ODD);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.FillType INVERSE_EVEN_ODD = com.micklab.dcg.wrapper.android.graphics.Path.FillType.wrap(android.graphics.Path.FillType.INVERSE_EVEN_ODD);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.FillType INVERSE_WINDING = com.micklab.dcg.wrapper.android.graphics.Path.FillType.wrap(android.graphics.Path.FillType.INVERSE_WINDING);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.FillType WINDING = com.micklab.dcg.wrapper.android.graphics.Path.FillType.wrap(android.graphics.Path.FillType.WINDING);

    }
    public static final class Op {
        private final android.graphics.Path.Op real;

        public Op(android.graphics.Path.Op real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.Op wrap(android.graphics.Path.Op real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path.Op(real);
        }

        public android.graphics.Path.Op unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.Op valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Path.Op.wrap(android.graphics.Path.Op.valueOf(arg0));
        }

        public static android.graphics.Path.Op[] values() {
            return android.graphics.Path.Op.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Path.Op DIFFERENCE = com.micklab.dcg.wrapper.android.graphics.Path.Op.wrap(android.graphics.Path.Op.DIFFERENCE);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.Op INTERSECT = com.micklab.dcg.wrapper.android.graphics.Path.Op.wrap(android.graphics.Path.Op.INTERSECT);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.Op REVERSE_DIFFERENCE = com.micklab.dcg.wrapper.android.graphics.Path.Op.wrap(android.graphics.Path.Op.REVERSE_DIFFERENCE);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.Op UNION = com.micklab.dcg.wrapper.android.graphics.Path.Op.wrap(android.graphics.Path.Op.UNION);
        public static final com.micklab.dcg.wrapper.android.graphics.Path.Op XOR = com.micklab.dcg.wrapper.android.graphics.Path.Op.wrap(android.graphics.Path.Op.XOR);

    }
}
