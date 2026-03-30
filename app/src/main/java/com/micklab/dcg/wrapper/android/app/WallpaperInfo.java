// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class WallpaperInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WallpaperInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperInfo wrap(android.app.WallpaperInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.WallpaperInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.WallpaperInfo getReal() {
        return (android.app.WallpaperInfo) real;
    }

    public android.app.WallpaperInfo unwrap() {
        return getReal();
    }

    public WallpaperInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ResolveInfo arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        this(new android.app.WallpaperInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.WallpaperInfo) real).describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        ((android.app.WallpaperInfo) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.WallpaperInfo) real).getComponent());
    }

    public java.lang.String getPackageName() {
        return ((android.app.WallpaperInfo) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(((android.app.WallpaperInfo) real).getServiceInfo());
    }

    public java.lang.String getServiceName() {
        return ((android.app.WallpaperInfo) real).getServiceName();
    }

    public java.lang.String getSettingsActivity() {
        return ((android.app.WallpaperInfo) real).getSettingsActivity();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSettingsSliceUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.WallpaperInfo) real).getSettingsSliceUri());
    }

    public boolean getShowMetadataInPreview() {
        return ((android.app.WallpaperInfo) real).getShowMetadataInPreview();
    }

    public java.lang.CharSequence loadAuthor(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.app.WallpaperInfo) real).loadAuthor(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence loadContextDescription(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.app.WallpaperInfo) real).loadContextDescription(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri loadContextUri(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.WallpaperInfo) real).loadContextUri(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence loadDescription(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return ((android.app.WallpaperInfo) real).loadDescription(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperInfo) real).loadIcon(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return ((android.app.WallpaperInfo) real).loadLabel(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadThumbnail(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperInfo) real).loadThumbnail(arg0 == null ? null : arg0.getReal()));
    }

    public boolean shouldUseDefaultUnfoldTransition() {
        return ((android.app.WallpaperInfo) real).shouldUseDefaultUnfoldTransition();
    }

    public boolean supportsMultipleDisplays() {
        return ((android.app.WallpaperInfo) real).supportsMultipleDisplays();
    }

    public java.lang.String toString() {
        return ((android.app.WallpaperInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.WallpaperInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
