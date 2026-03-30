// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathDashPathEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathDashPathEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect wrap(android.graphics.PathDashPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PathDashPathEffect getReal() {
        return (android.graphics.PathDashPathEffect) real;
    }

    public android.graphics.PathDashPathEffect unwrap() {
        return getReal();
    }

    public PathDashPathEffect(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style arg3) {
        this(new android.graphics.PathDashPathEffect(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public static final class Style {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Style(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style wrap(android.graphics.PathDashPathEffect.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.PathDashPathEffect.Style getReal() {
            return (android.graphics.PathDashPathEffect.Style) real;
        }

        public android.graphics.PathDashPathEffect.Style unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style.wrap(android.graphics.PathDashPathEffect.Style.valueOf(arg0));
        }

        public static android.graphics.PathDashPathEffect.Style[] values() {
            return android.graphics.PathDashPathEffect.Style.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style MORPH = com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style.wrap(android.graphics.PathDashPathEffect.Style.MORPH);
        public static final com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style ROTATE = com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style.wrap(android.graphics.PathDashPathEffect.Style.ROTATE);
        public static final com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style TRANSLATE = com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style.wrap(android.graphics.PathDashPathEffect.Style.TRANSLATE);

    }
}
