// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class GestureDescription {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GestureDescription(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription wrap(android.accessibilityservice.GestureDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.GestureDescription getReal() {
        return (android.accessibilityservice.GestureDescription) real;
    }

    public android.accessibilityservice.GestureDescription unwrap() {
        return getReal();
    }

    public int getDisplayId() {
        return ((android.accessibilityservice.GestureDescription) real).getDisplayId();
    }

    public static long getMaxGestureDuration() {
        return android.accessibilityservice.GestureDescription.getMaxGestureDuration();
    }

    public static int getMaxStrokeCount() {
        return android.accessibilityservice.GestureDescription.getMaxStrokeCount();
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription getStroke(int arg0) {
        return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription.wrap(((android.accessibilityservice.GestureDescription) real).getStroke(arg0));
    }

    public int getStrokeCount() {
        return ((android.accessibilityservice.GestureDescription) real).getStrokeCount();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder wrap(android.accessibilityservice.GestureDescription.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.GestureDescription.Builder getReal() {
            return (android.accessibilityservice.GestureDescription.Builder) real;
        }

        public android.accessibilityservice.GestureDescription.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.accessibilityservice.GestureDescription.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder addStroke(com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder.wrap(((android.accessibilityservice.GestureDescription.Builder) real).addStroke(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription build() {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.wrap(((android.accessibilityservice.GestureDescription.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder setDisplayId(int arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder.wrap(((android.accessibilityservice.GestureDescription.Builder) real).setDisplayId(arg0));
        }

    }
    public static final class StrokeDescription {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StrokeDescription(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription wrap(android.accessibilityservice.GestureDescription.StrokeDescription real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.GestureDescription.StrokeDescription getReal() {
            return (android.accessibilityservice.GestureDescription.StrokeDescription) real;
        }

        public android.accessibilityservice.GestureDescription.StrokeDescription unwrap() {
            return getReal();
        }

        public StrokeDescription(com.micklab.dcg.wrapper.android.graphics.Path arg0, long arg1, long arg2) {
            this(new android.accessibilityservice.GestureDescription.StrokeDescription(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public StrokeDescription(com.micklab.dcg.wrapper.android.graphics.Path arg0, long arg1, long arg2, boolean arg3) {
            this(new android.accessibilityservice.GestureDescription.StrokeDescription(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription continueStroke(com.micklab.dcg.wrapper.android.graphics.Path arg0, long arg1, long arg2, boolean arg3) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription.wrap(((android.accessibilityservice.GestureDescription.StrokeDescription) real).continueStroke(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
        }

        public long getDuration() {
            return ((android.accessibilityservice.GestureDescription.StrokeDescription) real).getDuration();
        }

        public com.micklab.dcg.wrapper.android.graphics.Path getPath() {
            return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.accessibilityservice.GestureDescription.StrokeDescription) real).getPath());
        }

        public long getStartTime() {
            return ((android.accessibilityservice.GestureDescription.StrokeDescription) real).getStartTime();
        }

        public boolean willContinue() {
            return ((android.accessibilityservice.GestureDescription.StrokeDescription) real).willContinue();
        }

    }
}
