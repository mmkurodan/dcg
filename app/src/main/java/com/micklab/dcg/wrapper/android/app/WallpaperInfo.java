// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class WallpaperInfo {
    private final android.app.WallpaperInfo real;

    public WallpaperInfo(android.app.WallpaperInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperInfo wrap(android.app.WallpaperInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.WallpaperInfo(real);
    }

    public android.app.WallpaperInfo unwrap() {
        return real;
    }

    public WallpaperInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ResolveInfo arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        this(new android.app.WallpaperInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponent());
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(real.getServiceInfo());
    }

    public java.lang.String getServiceName() {
        return real.getServiceName();
    }

    public java.lang.String getSettingsActivity() {
        return real.getSettingsActivity();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSettingsSliceUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getSettingsSliceUri());
    }

    public boolean getShowMetadataInPreview() {
        return real.getShowMetadataInPreview();
    }

    public java.lang.CharSequence loadAuthor(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return real.loadAuthor(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence loadContextDescription(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return real.loadContextDescription(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri loadContextUri(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.loadContextUri(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence loadDescription(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) throws android.content.res.Resources.NotFoundException {
        return real.loadDescription(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return real.loadLabel(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadThumbnail(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadThumbnail(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean shouldUseDefaultUnfoldTransition() {
        return real.shouldUseDefaultUnfoldTransition();
    }

    public boolean supportsMultipleDisplays() {
        return real.supportsMultipleDisplays();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
