// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class Resources {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Resources(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.Resources wrap(android.content.res.Resources real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.Resources(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.Resources getReal() {
        return (android.content.res.Resources) real;
    }

    public android.content.res.Resources unwrap() {
        return getReal();
    }

    public Resources(com.micklab.dcg.wrapper.android.content.res.AssetManager arg0, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg1, com.micklab.dcg.wrapper.android.content.res.Configuration arg2) {
        this(new android.content.res.Resources(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public void addLoaders(android.content.res.loader.ResourcesLoader... arg0) {
        ((android.content.res.Resources) real).addLoaders(arg0);
    }

    public void finishPreloading() {
        ((android.content.res.Resources) real).finishPreloading();
    }

    public void flushLayoutCache() {
        ((android.content.res.Resources) real).flushLayoutCache();
    }

    public com.micklab.dcg.wrapper.android.content.res.XmlResourceParser getAnimation(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.XmlResourceParser.wrap(((android.content.res.Resources) real).getAnimation(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetManager getAssets() {
        return com.micklab.dcg.wrapper.android.content.res.AssetManager.wrap(((android.content.res.Resources) real).getAssets());
    }

    public static int getAttributeSetSourceResId(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return android.content.res.Resources.getAttributeSetSourceResId(arg0 == null ? null : arg0.getReal());
    }

    public boolean getBoolean(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getBoolean(arg0);
    }

    public int getColor(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getColor(arg0);
    }

    public int getColor(int arg0, android.content.res.Resources.Theme arg1) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getColor(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColorStateList(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.content.res.Resources) real).getColorStateList(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColorStateList(int arg0, android.content.res.Resources.Theme arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.content.res.Resources) real).getColorStateList(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.res.Configuration getConfiguration() {
        return com.micklab.dcg.wrapper.android.content.res.Configuration.wrap(((android.content.res.Resources) real).getConfiguration());
    }

    public float getDimension(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getDimension(arg0);
    }

    public int getDimensionPixelOffset(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getDimensionPixelOffset(arg0);
    }

    public int getDimensionPixelSize(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getDimensionPixelSize(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.DisplayMetrics getDisplayMetrics() {
        return com.micklab.dcg.wrapper.android.util.DisplayMetrics.wrap(((android.content.res.Resources) real).getDisplayMetrics());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.res.Resources) real).getDrawable(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0, android.content.res.Resources.Theme arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.res.Resources) real).getDrawable(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawableForDensity(int arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.res.Resources) real).getDrawableForDensity(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawableForDensity(int arg0, int arg1, android.content.res.Resources.Theme arg2) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.res.Resources) real).getDrawableForDensity(arg0, arg1, arg2));
    }

    public float getFloat(int arg0) {
        return ((android.content.res.Resources) real).getFloat(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Typeface getFont(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.graphics.Typeface.wrap(((android.content.res.Resources) real).getFont(arg0));
    }

    public float getFraction(int arg0, int arg1, int arg2) {
        return ((android.content.res.Resources) real).getFraction(arg0, arg1, arg2);
    }

    public int getIdentifier(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return ((android.content.res.Resources) real).getIdentifier(arg0, arg1, arg2);
    }

    public int[] getIntArray(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getIntArray(arg0);
    }

    public int getInteger(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getInteger(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.res.XmlResourceParser getLayout(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.XmlResourceParser.wrap(((android.content.res.Resources) real).getLayout(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Movie getMovie(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.graphics.Movie.wrap(((android.content.res.Resources) real).getMovie(arg0));
    }

    public java.lang.String getQuantityString(int arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getQuantityString(arg0, arg1);
    }

    public java.lang.String getQuantityString(int arg0, int arg1, java.lang.Object... arg2) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getQuantityString(arg0, arg1, arg2);
    }

    public java.lang.CharSequence getQuantityText(int arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getQuantityText(arg0, arg1);
    }

    public java.lang.String getResourceEntryName(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getResourceEntryName(arg0);
    }

    public java.lang.String getResourceName(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getResourceName(arg0);
    }

    public java.lang.String getResourcePackageName(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getResourcePackageName(arg0);
    }

    public java.lang.String getResourceTypeName(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getResourceTypeName(arg0);
    }

    public java.lang.String getString(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getString(arg0);
    }

    public java.lang.String getString(int arg0, java.lang.Object... arg1) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getString(arg0, arg1);
    }

    public java.lang.String[] getStringArray(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getStringArray(arg0);
    }

    public static com.micklab.dcg.wrapper.android.content.res.Resources getSystem() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(android.content.res.Resources.getSystem());
    }

    public java.lang.CharSequence getText(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getText(arg0);
    }

    public java.lang.CharSequence getText(int arg0, java.lang.CharSequence arg1) {
        return ((android.content.res.Resources) real).getText(arg0, arg1);
    }

    public java.lang.CharSequence[] getTextArray(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).getTextArray(arg0);
    }

    public void getValue(java.lang.String arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1, boolean arg2) throws android.content.res.Resources.NotFoundException {
        ((android.content.res.Resources) real).getValue(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void getValue(int arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1, boolean arg2) throws android.content.res.Resources.NotFoundException {
        ((android.content.res.Resources) real).getValue(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void getValueForDensity(int arg0, int arg1, com.micklab.dcg.wrapper.android.util.TypedValue arg2, boolean arg3) throws android.content.res.Resources.NotFoundException {
        ((android.content.res.Resources) real).getValueForDensity(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public com.micklab.dcg.wrapper.android.content.res.XmlResourceParser getXml(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.XmlResourceParser.wrap(((android.content.res.Resources) real).getXml(arg0));
    }

    public android.content.res.Resources.Theme newTheme() {
        return ((android.content.res.Resources) real).newTheme();
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray obtainAttributes(com.micklab.dcg.wrapper.android.util.AttributeSet arg0, int[] arg1) {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(((android.content.res.Resources) real).obtainAttributes(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray obtainTypedArray(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(((android.content.res.Resources) real).obtainTypedArray(arg0));
    }

    public java.io.InputStream openRawResource(int arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).openRawResource(arg0);
    }

    public java.io.InputStream openRawResource(int arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1) throws android.content.res.Resources.NotFoundException {
        return ((android.content.res.Resources) real).openRawResource(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openRawResourceFd(int arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(((android.content.res.Resources) real).openRawResourceFd(arg0));
    }

    public void parseBundleExtra(java.lang.String arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws org.xmlpull.v1.XmlPullParserException {
        ((android.content.res.Resources) real).parseBundleExtra(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void parseBundleExtras(com.micklab.dcg.wrapper.android.content.res.XmlResourceParser arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.content.res.Resources) real).parseBundleExtras(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static void registerResourcePaths(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg1) {
        android.content.res.Resources.registerResourcePaths(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void removeLoaders(android.content.res.loader.ResourcesLoader... arg0) {
        ((android.content.res.Resources) real).removeLoaders(arg0);
    }

    public void updateConfiguration(com.micklab.dcg.wrapper.android.content.res.Configuration arg0, com.micklab.dcg.wrapper.android.util.DisplayMetrics arg1) {
        ((android.content.res.Resources) real).updateConfiguration(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final int ID_NULL = android.content.res.Resources.ID_NULL;

    public static final class NotFoundException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NotFoundException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.res.Resources.NotFoundException wrap(android.content.res.Resources.NotFoundException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.Resources.NotFoundException(real, (__DcgwBridgeToken) null);
        }

        public android.content.res.Resources.NotFoundException getReal() {
            return (android.content.res.Resources.NotFoundException) real;
        }

        public android.content.res.Resources.NotFoundException unwrap() {
            return getReal();
        }

        public NotFoundException() {
            this(new android.content.res.Resources.NotFoundException(), (__DcgwBridgeToken) null);
        }

        public NotFoundException(java.lang.String arg0) {
            this(new android.content.res.Resources.NotFoundException(arg0), (__DcgwBridgeToken) null);
        }

        public NotFoundException(java.lang.String arg0, java.lang.Exception arg1) {
            this(new android.content.res.Resources.NotFoundException(arg0, arg1), (__DcgwBridgeToken) null);
        }

    }
}
