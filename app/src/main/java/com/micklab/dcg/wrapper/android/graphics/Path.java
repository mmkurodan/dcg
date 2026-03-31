// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Path {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Path(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Path wrap(android.graphics.Path real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Path getReal() {
        return (android.graphics.Path) real;
    }

    public android.graphics.Path unwrap() {
        return getReal();
    }

    public Path() {
        this(new android.graphics.Path(), (__DcgwBridgeToken) null);
    }

    public Path(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        this(new android.graphics.Path(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void addArc(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2) {
        ((android.graphics.Path) real).addArc(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void addArc(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ((android.graphics.Path) real).addArc(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void addCircle(float arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg3) {
        ((android.graphics.Path) real).addCircle(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void addOval(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg1) {
        ((android.graphics.Path) real).addOval(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addOval(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg4) {
        ((android.graphics.Path) real).addOval(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void addPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        ((android.graphics.Path) real).addPath(arg0 == null ? null : arg0.getReal());
    }

    public void addPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1) {
        ((android.graphics.Path) real).addPath(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, float arg2) {
        ((android.graphics.Path) real).addPath(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void addRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg1) {
        ((android.graphics.Path) real).addRect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addRect(float arg0, float arg1, float arg2, float arg3, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg4) {
        ((android.graphics.Path) real).addRect(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void addRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg2) {
        ((android.graphics.Path) real).addRoundRect(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void addRoundRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg3) {
        ((android.graphics.Path) real).addRoundRect(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void addRoundRect(float arg0, float arg1, float arg2, float arg3, float[] arg4, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg5) {
        ((android.graphics.Path) real).addRoundRect(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void addRoundRect(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, com.micklab.dcg.wrapper.android.graphics.Path.Direction arg6) {
        ((android.graphics.Path) real).addRoundRect(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public float[] approximate(float arg0) {
        return ((android.graphics.Path) real).approximate(arg0);
    }

    public void arcTo(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2) {
        ((android.graphics.Path) real).arcTo(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void arcTo(com.micklab.dcg.wrapper.android.graphics.RectF arg0, float arg1, float arg2, boolean arg3) {
        ((android.graphics.Path) real).arcTo(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void arcTo(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, boolean arg6) {
        ((android.graphics.Path) real).arcTo(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public void close() {
        ((android.graphics.Path) real).close();
    }

    public void computeBounds(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        ((android.graphics.Path) real).computeBounds(arg0 == null ? null : arg0.getReal());
    }

    public void computeBounds(com.micklab.dcg.wrapper.android.graphics.RectF arg0, boolean arg1) {
        ((android.graphics.Path) real).computeBounds(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void conicTo(float arg0, float arg1, float arg2, float arg3, float arg4) {
        ((android.graphics.Path) real).conicTo(arg0, arg1, arg2, arg3, arg4);
    }

    public void cubicTo(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ((android.graphics.Path) real).cubicTo(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public com.micklab.dcg.wrapper.android.graphics.Path.FillType getFillType() {
        return com.micklab.dcg.wrapper.android.graphics.Path.FillType.wrap(((android.graphics.Path) real).getFillType());
    }

    public int getGenerationId() {
        return ((android.graphics.Path) real).getGenerationId();
    }

    public com.micklab.dcg.wrapper.android.graphics.PathIterator getPathIterator() {
        return com.micklab.dcg.wrapper.android.graphics.PathIterator.wrap(((android.graphics.Path) real).getPathIterator());
    }

    public void incReserve(int arg0) {
        ((android.graphics.Path) real).incReserve(arg0);
    }

    public boolean interpolate(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        return ((android.graphics.Path) real).interpolate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean isConvex() {
        return ((android.graphics.Path) real).isConvex();
    }

    public boolean isEmpty() {
        return ((android.graphics.Path) real).isEmpty();
    }

    public boolean isInterpolatable(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return ((android.graphics.Path) real).isInterpolatable(arg0 == null ? null : arg0.getReal());
    }

    public boolean isInverseFillType() {
        return ((android.graphics.Path) real).isInverseFillType();
    }

    public boolean isRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return ((android.graphics.Path) real).isRect(arg0 == null ? null : arg0.getReal());
    }

    public void lineTo(float arg0, float arg1) {
        ((android.graphics.Path) real).lineTo(arg0, arg1);
    }

    public void moveTo(float arg0, float arg1) {
        ((android.graphics.Path) real).moveTo(arg0, arg1);
    }

    public void offset(float arg0, float arg1) {
        ((android.graphics.Path) real).offset(arg0, arg1);
    }

    public void offset(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2) {
        ((android.graphics.Path) real).offset(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Path.Op arg1) {
        return ((android.graphics.Path) real).op(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean op(com.micklab.dcg.wrapper.android.graphics.Path arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1, com.micklab.dcg.wrapper.android.graphics.Path.Op arg2) {
        return ((android.graphics.Path) real).op(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void quadTo(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.Path) real).quadTo(arg0, arg1, arg2, arg3);
    }

    public void rConicTo(float arg0, float arg1, float arg2, float arg3, float arg4) {
        ((android.graphics.Path) real).rConicTo(arg0, arg1, arg2, arg3, arg4);
    }

    public void rCubicTo(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ((android.graphics.Path) real).rCubicTo(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void rLineTo(float arg0, float arg1) {
        ((android.graphics.Path) real).rLineTo(arg0, arg1);
    }

    public void rMoveTo(float arg0, float arg1) {
        ((android.graphics.Path) real).rMoveTo(arg0, arg1);
    }

    public void rQuadTo(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.Path) real).rQuadTo(arg0, arg1, arg2, arg3);
    }

    public void reset() {
        ((android.graphics.Path) real).reset();
    }

    public void rewind() {
        ((android.graphics.Path) real).rewind();
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        ((android.graphics.Path) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void setFillType(com.micklab.dcg.wrapper.android.graphics.Path.FillType arg0) {
        ((android.graphics.Path) real).setFillType(arg0 == null ? null : arg0.getReal());
    }

    public void setLastPoint(float arg0, float arg1) {
        ((android.graphics.Path) real).setLastPoint(arg0, arg1);
    }

    public void toggleInverseFillType() {
        ((android.graphics.Path) real).toggleInverseFillType();
    }

    public void transform(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.Path) real).transform(arg0 == null ? null : arg0.getReal());
    }

    public void transform(com.micklab.dcg.wrapper.android.graphics.Matrix arg0, com.micklab.dcg.wrapper.android.graphics.Path arg1) {
        ((android.graphics.Path) real).transform(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class Direction {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Direction(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.Direction wrap(android.graphics.Path.Direction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path.Direction(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Path.Direction getReal() {
            return (android.graphics.Path.Direction) real;
        }

        public android.graphics.Path.Direction unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FillType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.FillType wrap(android.graphics.Path.FillType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path.FillType(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Path.FillType getReal() {
            return (android.graphics.Path.FillType) real;
        }

        public android.graphics.Path.FillType unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Op(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Path.Op wrap(android.graphics.Path.Op real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Path.Op(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Path.Op getReal() {
            return (android.graphics.Path.Op) real;
        }

        public android.graphics.Path.Op unwrap() {
            return getReal();
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
