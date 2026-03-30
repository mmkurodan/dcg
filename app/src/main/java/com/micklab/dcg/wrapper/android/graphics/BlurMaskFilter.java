// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BlurMaskFilter {
    private final android.graphics.BlurMaskFilter real;

    public BlurMaskFilter(android.graphics.BlurMaskFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter wrap(android.graphics.BlurMaskFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter(real);
    }

    public android.graphics.BlurMaskFilter unwrap() {
        return real;
    }

    public BlurMaskFilter(float arg0, com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur arg1) {
        this(new android.graphics.BlurMaskFilter(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static final class Blur {
        private final android.graphics.BlurMaskFilter.Blur real;

        public Blur(android.graphics.BlurMaskFilter.Blur real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur wrap(android.graphics.BlurMaskFilter.Blur real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BlurMaskFilter.Blur(real);
        }

        public android.graphics.BlurMaskFilter.Blur unwrap() {
            return real;
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
