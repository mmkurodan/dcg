// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Movie {
    private final android.graphics.Movie real;

    public Movie(android.graphics.Movie real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Movie wrap(android.graphics.Movie real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Movie(real);
    }

    public android.graphics.Movie unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Movie decodeByteArray(byte[] arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Movie.wrap(android.graphics.Movie.decodeByteArray(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Movie decodeFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.Movie#decodeFile(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.Movie decodeStream(java.io.InputStream arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Movie.wrap(android.graphics.Movie.decodeStream(arg0));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, float arg1, float arg2) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, float arg1, float arg2, com.micklab.dcg.wrapper.android.graphics.Paint arg3) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public int duration() {
        return real.duration();
    }

    public int height() {
        return real.height();
    }

    public boolean isOpaque() {
        return real.isOpaque();
    }

    public boolean setTime(int arg0) {
        return real.setTime(arg0);
    }

    public int width() {
        return real.width();
    }

}
