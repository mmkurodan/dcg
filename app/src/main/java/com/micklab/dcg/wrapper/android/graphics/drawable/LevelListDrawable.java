// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class LevelListDrawable {
    private final android.graphics.drawable.LevelListDrawable real;

    public LevelListDrawable(android.graphics.drawable.LevelListDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.LevelListDrawable wrap(android.graphics.drawable.LevelListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.LevelListDrawable(real);
    }

    public android.graphics.drawable.LevelListDrawable unwrap() {
        return real;
    }

    public LevelListDrawable() {
        this(new android.graphics.drawable.LevelListDrawable());
    }

    public void addLevel(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2) {
        real.addLevel(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

}
