// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BitmapFactory {
    private final android.graphics.BitmapFactory real;

    public BitmapFactory(android.graphics.BitmapFactory real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapFactory wrap(android.graphics.BitmapFactory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BitmapFactory(real);
    }

    public android.graphics.BitmapFactory unwrap() {
        return real;
    }

    public BitmapFactory() {
        this(new android.graphics.BitmapFactory());
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeByteArray(byte[] arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.BitmapFactory.decodeByteArray(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeByteArray(byte[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.BitmapFactory.decodeByteArray(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.BitmapFactory#decodeFile(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeFile(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.BitmapFactory#decodeFile(java.lang.String,android.graphics.BitmapFactory$Options)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.BitmapFactory#decodeFileDescriptor(java.io.FileDescriptor)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.BitmapFactory#decodeFileDescriptor(java.io.FileDescriptor,android.graphics.Rect,android.graphics.BitmapFactory$Options)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeResource(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.BitmapFactory.decodeResource(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeResource(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.BitmapFactory.decodeResource(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeResourceStream(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1, java.io.InputStream arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.BitmapFactory.decodeResourceStream(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeStream(java.io.InputStream arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.BitmapFactory.decodeStream(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeStream(java.io.InputStream arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.BitmapFactory.decodeStream(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static final class Options {
        private final android.graphics.BitmapFactory.Options real;

        public Options(android.graphics.BitmapFactory.Options real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options wrap(android.graphics.BitmapFactory.Options real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options(real);
        }

        public android.graphics.BitmapFactory.Options unwrap() {
            return real;
        }

        public Options() {
            this(new android.graphics.BitmapFactory.Options());
        }

        public void requestCancelDecode() {
            real.requestCancelDecode();
        }


    }
}
