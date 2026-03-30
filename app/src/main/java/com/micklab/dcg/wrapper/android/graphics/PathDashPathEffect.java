// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathDashPathEffect {
    private final android.graphics.PathDashPathEffect real;

    public PathDashPathEffect(android.graphics.PathDashPathEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect wrap(android.graphics.PathDashPathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect(real);
    }

    public android.graphics.PathDashPathEffect unwrap() {
        return real;
    }

    public PathDashPathEffect(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style arg3) {
        this(new android.graphics.PathDashPathEffect(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static final class Style {
        private final android.graphics.PathDashPathEffect.Style real;

        public Style(android.graphics.PathDashPathEffect.Style real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style wrap(android.graphics.PathDashPathEffect.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathDashPathEffect.Style(real);
        }

        public android.graphics.PathDashPathEffect.Style unwrap() {
            return real;
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
