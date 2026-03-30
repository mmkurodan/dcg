// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BlurMaskFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BlurMaskFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter wrap(android.graphics.BlurMaskFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.BlurMaskFilter getReal() {
        return (android.graphics.BlurMaskFilter) real;
    }

    public android.graphics.BlurMaskFilter unwrap() {
        return getReal();
    }

    public BlurMaskFilter(float arg0, com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur arg1) {
        this(new android.graphics.BlurMaskFilter(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public static final class Blur {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Blur(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur wrap(android.graphics.BlurMaskFilter.Blur real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.BlurMaskFilter.Blur getReal() {
            return (android.graphics.BlurMaskFilter.Blur) real;
        }

        public android.graphics.BlurMaskFilter.Blur unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur.wrap(android.graphics.BlurMaskFilter.Blur.valueOf(arg0));
        }

        public static android.graphics.BlurMaskFilter.Blur[] values() {
            return android.graphics.BlurMaskFilter.Blur.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur INNER = com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur.wrap(android.graphics.BlurMaskFilter.Blur.INNER);
        public static final com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur NORMAL = com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur.wrap(android.graphics.BlurMaskFilter.Blur.NORMAL);
        public static final com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur OUTER = com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur.wrap(android.graphics.BlurMaskFilter.Blur.OUTER);
        public static final com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur SOLID = com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur.wrap(android.graphics.BlurMaskFilter.Blur.SOLID);

    }
}
