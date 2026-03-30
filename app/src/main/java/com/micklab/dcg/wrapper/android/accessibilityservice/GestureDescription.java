// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class GestureDescription {
    private final android.accessibilityservice.GestureDescription real;

    public GestureDescription(android.accessibilityservice.GestureDescription real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription wrap(android.accessibilityservice.GestureDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription(real);
    }

    public android.accessibilityservice.GestureDescription unwrap() {
        return real;
    }

    public int getDisplayId() {
        return real.getDisplayId();
    }

    public static long getMaxGestureDuration() {
        return android.accessibilityservice.GestureDescription.getMaxGestureDuration();
    }

    public static int getMaxStrokeCount() {
        return android.accessibilityservice.GestureDescription.getMaxStrokeCount();
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription getStroke(int arg0) {
        return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription.wrap(real.getStroke(arg0));
    }

    public int getStrokeCount() {
        return real.getStrokeCount();
    }

    public static final class Builder {
        private final android.accessibilityservice.GestureDescription.Builder real;

        public Builder(android.accessibilityservice.GestureDescription.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder wrap(android.accessibilityservice.GestureDescription.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder(real);
        }

        public android.accessibilityservice.GestureDescription.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.accessibilityservice.GestureDescription.Builder());
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder addStroke(com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder.wrap(real.addStroke(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription build() {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder setDisplayId(int arg0) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.Builder.wrap(real.setDisplayId(arg0));
        }

    }
    public static final class StrokeDescription {
        private final android.accessibilityservice.GestureDescription.StrokeDescription real;

        public StrokeDescription(android.accessibilityservice.GestureDescription.StrokeDescription real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription wrap(android.accessibilityservice.GestureDescription.StrokeDescription real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription(real);
        }

        public android.accessibilityservice.GestureDescription.StrokeDescription unwrap() {
            return real;
        }

        public StrokeDescription(com.micklab.dcg.wrapper.android.graphics.Path arg0, long arg1, long arg2) {
            this(new android.accessibilityservice.GestureDescription.StrokeDescription(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public StrokeDescription(com.micklab.dcg.wrapper.android.graphics.Path arg0, long arg1, long arg2, boolean arg3) {
            this(new android.accessibilityservice.GestureDescription.StrokeDescription(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription continueStroke(com.micklab.dcg.wrapper.android.graphics.Path arg0, long arg1, long arg2, boolean arg3) {
            return com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription.StrokeDescription.wrap(real.continueStroke(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public long getDuration() {
            return real.getDuration();
        }

        public com.micklab.dcg.wrapper.android.graphics.Path getPath() {
            return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getPath());
        }

        public long getStartTime() {
            return real.getStartTime();
        }

        public boolean willContinue() {
            return real.willContinue();
        }

    }
}
