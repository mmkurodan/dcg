// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class PixelCopy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PixelCopy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.PixelCopy wrap(android.view.PixelCopy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.PixelCopy(real, (__DcgwBridgeToken) null);
    }

    public android.view.PixelCopy getReal() {
        return (android.view.PixelCopy) real;
    }

    public android.view.PixelCopy unwrap() {
        return getReal();
    }

    public static void request(com.micklab.dcg.wrapper.android.view.SurfaceView arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        android.view.PixelCopy.request(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public static void request(com.micklab.dcg.wrapper.android.view.Window arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        android.view.PixelCopy.request(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public static void request(com.micklab.dcg.wrapper.android.view.Surface arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        android.view.PixelCopy.request(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public static void request(com.micklab.dcg.wrapper.android.view.SurfaceView arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap arg2, com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        android.view.PixelCopy.request(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public static void request(com.micklab.dcg.wrapper.android.view.Window arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap arg2, com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        android.view.PixelCopy.request(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public static void request(com.micklab.dcg.wrapper.android.view.Surface arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap arg2, com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        android.view.PixelCopy.request(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public static final int ERROR_DESTINATION_INVALID = android.view.PixelCopy.ERROR_DESTINATION_INVALID;
    public static final int ERROR_SOURCE_INVALID = android.view.PixelCopy.ERROR_SOURCE_INVALID;
    public static final int ERROR_SOURCE_NO_DATA = android.view.PixelCopy.ERROR_SOURCE_NO_DATA;
    public static final int ERROR_TIMEOUT = android.view.PixelCopy.ERROR_TIMEOUT;
    public static final int ERROR_UNKNOWN = android.view.PixelCopy.ERROR_UNKNOWN;
    public static final int SUCCESS = android.view.PixelCopy.SUCCESS;

    public static final class OnPixelCopyFinishedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPixelCopyFinishedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener wrap(android.view.PixelCopy.OnPixelCopyFinishedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.PixelCopy.OnPixelCopyFinishedListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.PixelCopy.OnPixelCopyFinishedListener getReal() {
            return (android.view.PixelCopy.OnPixelCopyFinishedListener) real;
        }

        public android.view.PixelCopy.OnPixelCopyFinishedListener unwrap() {
            return getReal();
        }

        public void onPixelCopyFinished(int arg0) {
            ((android.view.PixelCopy.OnPixelCopyFinishedListener) real).onPixelCopyFinished(arg0);
        }

    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.PixelCopy.Request wrap(android.view.PixelCopy.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.PixelCopy.Request(real, (__DcgwBridgeToken) null);
        }

        public android.view.PixelCopy.Request getReal() {
            return (android.view.PixelCopy.Request) real;
        }

        public android.view.PixelCopy.Request unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getDestinationBitmap() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.view.PixelCopy.Request) real).getDestinationBitmap());
        }

        public com.micklab.dcg.wrapper.android.graphics.Rect getSourceRect() {
            return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.PixelCopy.Request) real).getSourceRect());
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder wrap(android.view.PixelCopy.Request.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.PixelCopy.Request.Builder getReal() {
                return (android.view.PixelCopy.Request.Builder) real;
            }

            public android.view.PixelCopy.Request.Builder unwrap() {
                return getReal();
            }

            public com.micklab.dcg.wrapper.android.view.PixelCopy.Request build() {
                return com.micklab.dcg.wrapper.android.view.PixelCopy.Request.wrap(((android.view.PixelCopy.Request.Builder) real).build());
            }

            public static com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder ofSurface(com.micklab.dcg.wrapper.android.view.SurfaceView arg0) {
                return com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder.wrap(android.view.PixelCopy.Request.Builder.ofSurface(arg0 == null ? null : arg0.getReal()));
            }

            public static com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder ofSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
                return com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder.wrap(android.view.PixelCopy.Request.Builder.ofSurface(arg0 == null ? null : arg0.getReal()));
            }

            public static com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder ofWindow(com.micklab.dcg.wrapper.android.view.Window arg0) {
                return com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder.wrap(android.view.PixelCopy.Request.Builder.ofWindow(arg0 == null ? null : arg0.getReal()));
            }

            public static com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder ofWindow(com.micklab.dcg.wrapper.android.view.View arg0) {
                return com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder.wrap(android.view.PixelCopy.Request.Builder.ofWindow(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder setDestinationBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
                return com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder.wrap(((android.view.PixelCopy.Request.Builder) real).setDestinationBitmap(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder setSourceRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
                return com.micklab.dcg.wrapper.android.view.PixelCopy.Request.Builder.wrap(((android.view.PixelCopy.Request.Builder) real).setSourceRect(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
    public static final class Result {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Result(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.PixelCopy.Result wrap(android.view.PixelCopy.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.PixelCopy.Result(real, (__DcgwBridgeToken) null);
        }

        public android.view.PixelCopy.Result getReal() {
            return (android.view.PixelCopy.Result) real;
        }

        public android.view.PixelCopy.Result unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap() {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.view.PixelCopy.Result) real).getBitmap());
        }

        public int getStatus() {
            return ((android.view.PixelCopy.Result) real).getStatus();
        }

    }
}
