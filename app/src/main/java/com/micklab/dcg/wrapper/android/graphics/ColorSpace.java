// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ColorSpace {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorSpace(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace wrap(android.graphics.ColorSpace real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ColorSpace getReal() {
        return (android.graphics.ColorSpace) real;
    }

    public android.graphics.ColorSpace unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace adapt(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0, float[] arg1) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(android.graphics.ColorSpace.adapt(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace adapt(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation arg2) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(android.graphics.ColorSpace.adapt(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static float[] cctToXyz(int arg0) {
        return android.graphics.ColorSpace.cctToXyz(arg0);
    }

    public static float[] chromaticAdaptation(com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation arg0, float[] arg1, float[] arg2) {
        return android.graphics.ColorSpace.chromaticAdaptation(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector connect(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector.wrap(android.graphics.ColorSpace.connect(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector connect(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector.wrap(android.graphics.ColorSpace.connect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector connect(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent arg1) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector.wrap(android.graphics.ColorSpace.connect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector connect(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1, com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent arg2) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector.wrap(android.graphics.ColorSpace.connect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.ColorSpace) real).equals(arg0);
    }

    public float[] fromXyz(float[] arg0) {
        return ((android.graphics.ColorSpace) real).fromXyz(arg0);
    }

    public float[] fromXyz(float arg0, float arg1, float arg2) {
        return ((android.graphics.ColorSpace) real).fromXyz(arg0, arg1, arg2);
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace get(com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(android.graphics.ColorSpace.get(arg0 == null ? null : arg0.getReal()));
    }

    public int getComponentCount() {
        return ((android.graphics.ColorSpace) real).getComponentCount();
    }

    public int getDataSpace() {
        return ((android.graphics.ColorSpace) real).getDataSpace();
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace getFromDataSpace(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(android.graphics.ColorSpace.getFromDataSpace(arg0));
    }

    public int getId() {
        return ((android.graphics.ColorSpace) real).getId();
    }

    public float getMaxValue(int arg0) {
        return ((android.graphics.ColorSpace) real).getMaxValue(arg0);
    }

    public float getMinValue(int arg0) {
        return ((android.graphics.ColorSpace) real).getMinValue(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model getModel() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model.wrap(((android.graphics.ColorSpace) real).getModel());
    }

    public java.lang.String getName() {
        return ((android.graphics.ColorSpace) real).getName();
    }

    public int hashCode() {
        return ((android.graphics.ColorSpace) real).hashCode();
    }

    public boolean isSrgb() {
        return ((android.graphics.ColorSpace) real).isSrgb();
    }

    public boolean isWideGamut() {
        return ((android.graphics.ColorSpace) real).isWideGamut();
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorSpace match(float[] arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb.TransferParameters arg1) {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(android.graphics.ColorSpace.match(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public java.lang.String toString() {
        return ((android.graphics.ColorSpace) real).toString();
    }

    public float[] toXyz(float[] arg0) {
        return ((android.graphics.ColorSpace) real).toXyz(arg0);
    }

    public float[] toXyz(float arg0, float arg1, float arg2) {
        return ((android.graphics.ColorSpace) real).toXyz(arg0, arg1, arg2);
    }

    public static final float[] ILLUMINANT_A = android.graphics.ColorSpace.ILLUMINANT_A;
    public static final float[] ILLUMINANT_B = android.graphics.ColorSpace.ILLUMINANT_B;
    public static final float[] ILLUMINANT_C = android.graphics.ColorSpace.ILLUMINANT_C;
    public static final float[] ILLUMINANT_D50 = android.graphics.ColorSpace.ILLUMINANT_D50;
    public static final float[] ILLUMINANT_D55 = android.graphics.ColorSpace.ILLUMINANT_D55;
    public static final float[] ILLUMINANT_D60 = android.graphics.ColorSpace.ILLUMINANT_D60;
    public static final float[] ILLUMINANT_D65 = android.graphics.ColorSpace.ILLUMINANT_D65;
    public static final float[] ILLUMINANT_D75 = android.graphics.ColorSpace.ILLUMINANT_D75;
    public static final float[] ILLUMINANT_E = android.graphics.ColorSpace.ILLUMINANT_E;
    public static final int MAX_ID = android.graphics.ColorSpace.MAX_ID;
    public static final int MIN_ID = android.graphics.ColorSpace.MIN_ID;

    public static final class Adaptation {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Adaptation(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation wrap(android.graphics.ColorSpace.Adaptation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.ColorSpace.Adaptation getReal() {
            return (android.graphics.ColorSpace.Adaptation) real;
        }

        public android.graphics.ColorSpace.Adaptation unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation.wrap(android.graphics.ColorSpace.Adaptation.valueOf(arg0));
        }

        public static android.graphics.ColorSpace.Adaptation[] values() {
            return android.graphics.ColorSpace.Adaptation.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation BRADFORD = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation.wrap(android.graphics.ColorSpace.Adaptation.BRADFORD);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation CIECAT02 = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation.wrap(android.graphics.ColorSpace.Adaptation.CIECAT02);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation VON_KRIES = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Adaptation.wrap(android.graphics.ColorSpace.Adaptation.VON_KRIES);

    }
    public static final class Connector {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Connector(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector wrap(android.graphics.ColorSpace.Connector real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace.Connector(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.ColorSpace.Connector getReal() {
            return (android.graphics.ColorSpace.Connector) real;
        }

        public android.graphics.ColorSpace.Connector unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.ColorSpace getDestination() {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.graphics.ColorSpace.Connector) real).getDestination());
        }

        public com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent getRenderIntent() {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent.wrap(((android.graphics.ColorSpace.Connector) real).getRenderIntent());
        }

        public com.micklab.dcg.wrapper.android.graphics.ColorSpace getSource() {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.graphics.ColorSpace.Connector) real).getSource());
        }

        public float[] transform(float[] arg0) {
            return ((android.graphics.ColorSpace.Connector) real).transform(arg0);
        }

        public float[] transform(float arg0, float arg1, float arg2) {
            return ((android.graphics.ColorSpace.Connector) real).transform(arg0, arg1, arg2);
        }

    }
    public static final class Model {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Model(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model wrap(android.graphics.ColorSpace.Model real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.ColorSpace.Model getReal() {
            return (android.graphics.ColorSpace.Model) real;
        }

        public android.graphics.ColorSpace.Model unwrap() {
            return getReal();
        }

        public int getComponentCount() {
            return ((android.graphics.ColorSpace.Model) real).getComponentCount();
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model.wrap(android.graphics.ColorSpace.Model.valueOf(arg0));
        }

        public static android.graphics.ColorSpace.Model[] values() {
            return android.graphics.ColorSpace.Model.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model CMYK = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model.wrap(android.graphics.ColorSpace.Model.CMYK);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model LAB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model.wrap(android.graphics.ColorSpace.Model.LAB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model RGB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model.wrap(android.graphics.ColorSpace.Model.RGB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model XYZ = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Model.wrap(android.graphics.ColorSpace.Model.XYZ);

    }
    public static final class Named {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Named(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named wrap(android.graphics.ColorSpace.Named real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.ColorSpace.Named getReal() {
            return (android.graphics.ColorSpace.Named) real;
        }

        public android.graphics.ColorSpace.Named unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.valueOf(arg0));
        }

        public static android.graphics.ColorSpace.Named[] values() {
            return android.graphics.ColorSpace.Named.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named ACES = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.ACES);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named ACESCG = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.ACESCG);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named ADOBE_RGB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.ADOBE_RGB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named BT2020 = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.BT2020);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named BT2020_HLG = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.BT2020_HLG);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named BT2020_PQ = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.BT2020_PQ);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named BT709 = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.BT709);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named CIE_LAB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.CIE_LAB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named CIE_XYZ = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.CIE_XYZ);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named DCI_P3 = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.DCI_P3);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named DISPLAY_P3 = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.DISPLAY_P3);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named EXTENDED_SRGB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.EXTENDED_SRGB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named LINEAR_EXTENDED_SRGB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named LINEAR_SRGB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.LINEAR_SRGB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named NTSC_1953 = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.NTSC_1953);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named PRO_PHOTO_RGB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named SMPTE_C = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.SMPTE_C);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named SRGB = com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named.wrap(android.graphics.ColorSpace.Named.SRGB);

    }
    public static final class RenderIntent {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RenderIntent(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent wrap(android.graphics.ColorSpace.RenderIntent real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.ColorSpace.RenderIntent getReal() {
            return (android.graphics.ColorSpace.RenderIntent) real;
        }

        public android.graphics.ColorSpace.RenderIntent unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent.wrap(android.graphics.ColorSpace.RenderIntent.valueOf(arg0));
        }

        public static android.graphics.ColorSpace.RenderIntent[] values() {
            return android.graphics.ColorSpace.RenderIntent.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent ABSOLUTE = com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent.wrap(android.graphics.ColorSpace.RenderIntent.ABSOLUTE);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent PERCEPTUAL = com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent.wrap(android.graphics.ColorSpace.RenderIntent.PERCEPTUAL);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent RELATIVE = com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent.wrap(android.graphics.ColorSpace.RenderIntent.RELATIVE);
        public static final com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent SATURATION = com.micklab.dcg.wrapper.android.graphics.ColorSpace.RenderIntent.wrap(android.graphics.ColorSpace.RenderIntent.SATURATION);

    }
    public static final class Rgb {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Rgb(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb wrap(android.graphics.ColorSpace.Rgb real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.ColorSpace.Rgb getReal() {
            return (android.graphics.ColorSpace.Rgb) real;
        }

        public android.graphics.ColorSpace.Rgb unwrap() {
            return getReal();
        }

        public Rgb(java.lang.String arg0, float[] arg1, double arg2) {
            this(new android.graphics.ColorSpace.Rgb(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public Rgb(java.lang.String arg0, float[] arg1, com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb.TransferParameters arg2) {
            this(new android.graphics.ColorSpace.Rgb(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public Rgb(java.lang.String arg0, float[] arg1, float[] arg2, double arg3) {
            this(new android.graphics.ColorSpace.Rgb(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public Rgb(java.lang.String arg0, float[] arg1, float[] arg2, com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb.TransferParameters arg3) {
            this(new android.graphics.ColorSpace.Rgb(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public Rgb(java.lang.String arg0, float[] arg1, java.util.function.DoubleUnaryOperator arg2, java.util.function.DoubleUnaryOperator arg3) {
            this(new android.graphics.ColorSpace.Rgb(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public Rgb(java.lang.String arg0, float[] arg1, float[] arg2, java.util.function.DoubleUnaryOperator arg3, java.util.function.DoubleUnaryOperator arg4, float arg5, float arg6) {
            this(new android.graphics.ColorSpace.Rgb(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).equals(arg0);
        }

        public float[] fromLinear(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).fromLinear(arg0);
        }

        public float[] fromLinear(float arg0, float arg1, float arg2) {
            return ((android.graphics.ColorSpace.Rgb) real).fromLinear(arg0, arg1, arg2);
        }

        public float[] fromXyz(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).fromXyz(arg0);
        }

        public java.util.function.DoubleUnaryOperator getEotf() {
            return ((android.graphics.ColorSpace.Rgb) real).getEotf();
        }

        public float[] getInverseTransform() {
            return ((android.graphics.ColorSpace.Rgb) real).getInverseTransform();
        }

        public float[] getInverseTransform(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).getInverseTransform(arg0);
        }

        public float getMaxValue(int arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).getMaxValue(arg0);
        }

        public float getMinValue(int arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).getMinValue(arg0);
        }

        public java.util.function.DoubleUnaryOperator getOetf() {
            return ((android.graphics.ColorSpace.Rgb) real).getOetf();
        }

        public float[] getPrimaries() {
            return ((android.graphics.ColorSpace.Rgb) real).getPrimaries();
        }

        public float[] getPrimaries(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).getPrimaries(arg0);
        }

        public com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb.TransferParameters getTransferParameters() {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb.TransferParameters.wrap(((android.graphics.ColorSpace.Rgb) real).getTransferParameters());
        }

        public float[] getTransform() {
            return ((android.graphics.ColorSpace.Rgb) real).getTransform();
        }

        public float[] getTransform(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).getTransform(arg0);
        }

        public float[] getWhitePoint() {
            return ((android.graphics.ColorSpace.Rgb) real).getWhitePoint();
        }

        public float[] getWhitePoint(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).getWhitePoint(arg0);
        }

        public int hashCode() {
            return ((android.graphics.ColorSpace.Rgb) real).hashCode();
        }

        public boolean isSrgb() {
            return ((android.graphics.ColorSpace.Rgb) real).isSrgb();
        }

        public boolean isWideGamut() {
            return ((android.graphics.ColorSpace.Rgb) real).isWideGamut();
        }

        public float[] toLinear(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).toLinear(arg0);
        }

        public float[] toLinear(float arg0, float arg1, float arg2) {
            return ((android.graphics.ColorSpace.Rgb) real).toLinear(arg0, arg1, arg2);
        }

        public float[] toXyz(float[] arg0) {
            return ((android.graphics.ColorSpace.Rgb) real).toXyz(arg0);
        }

        public static final class TransferParameters {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private TransferParameters(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb.TransferParameters wrap(android.graphics.ColorSpace.Rgb.TransferParameters real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorSpace.Rgb.TransferParameters(real, (__DcgwBridgeToken) null);
            }

            public android.graphics.ColorSpace.Rgb.TransferParameters getReal() {
                return (android.graphics.ColorSpace.Rgb.TransferParameters) real;
            }

            public android.graphics.ColorSpace.Rgb.TransferParameters unwrap() {
                return getReal();
            }

            public TransferParameters(double arg0, double arg1, double arg2, double arg3, double arg4) {
                this(new android.graphics.ColorSpace.Rgb.TransferParameters(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
            }

            public TransferParameters(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5, double arg6) {
                this(new android.graphics.ColorSpace.Rgb.TransferParameters(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
            }

            public boolean equals(java.lang.Object arg0) {
                return ((android.graphics.ColorSpace.Rgb.TransferParameters) real).equals(arg0);
            }

            public int hashCode() {
                return ((android.graphics.ColorSpace.Rgb.TransferParameters) real).hashCode();
            }


        }
    }
}
