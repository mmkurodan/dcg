// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class Intent {
    private final android.content.Intent real;

    public Intent(android.content.Intent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.Intent wrap(android.content.Intent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.Intent(real);
    }

    public android.content.Intent unwrap() {
        return real;
    }

    public Intent() {
        this(new android.content.Intent());
    }

    public Intent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        this(new android.content.Intent(arg0 == null ? null : arg0.unwrap()));
    }

    public Intent(java.lang.String arg0) {
        this(new android.content.Intent(arg0));
    }

    public Intent(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.Class arg1) {
        this(new android.content.Intent(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public Intent(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        this(new android.content.Intent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public Intent(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.content.Context arg2, java.lang.Class arg3) {
        this(new android.content.Intent(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public com.micklab.dcg.wrapper.android.content.Intent addCategory(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.addCategory(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Intent addFlags(int arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.addFlags(arg0));
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.content.Intent cloneFilter() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.cloneFilter());
    }

    public static com.micklab.dcg.wrapper.android.content.Intent createChooser(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.createChooser(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.Intent createChooser(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.content.IntentSender arg2) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.createChooser(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int fillIn(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        return real.fillIn(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean filterEquals(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.filterEquals(arg0 == null ? null : arg0.unwrap());
    }

    public int filterHashCode() {
        return real.filterHashCode();
    }

    public java.lang.String getAction() {
        return real.getAction();
    }

    public boolean[] getBooleanArrayExtra(java.lang.String arg0) {
        return real.getBooleanArrayExtra(arg0);
    }

    public boolean getBooleanExtra(java.lang.String arg0, boolean arg1) {
        return real.getBooleanExtra(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getBundleExtra(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getBundleExtra(arg0));
    }

    public byte[] getByteArrayExtra(java.lang.String arg0) {
        return real.getByteArrayExtra(arg0);
    }

    public byte getByteExtra(java.lang.String arg0, byte arg1) {
        return real.getByteExtra(arg0, arg1);
    }

    public char[] getCharArrayExtra(java.lang.String arg0) {
        return real.getCharArrayExtra(arg0);
    }

    public char getCharExtra(java.lang.String arg0, char arg1) {
        return real.getCharExtra(arg0, arg1);
    }

    public java.lang.CharSequence[] getCharSequenceArrayExtra(java.lang.String arg0) {
        return real.getCharSequenceArrayExtra(arg0);
    }

    public java.lang.CharSequence getCharSequenceExtra(java.lang.String arg0) {
        return real.getCharSequenceExtra(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClipData() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(real.getClipData());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponent());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getData() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getData());
    }

    public java.lang.String getDataString() {
        return real.getDataString();
    }

    public double[] getDoubleArrayExtra(java.lang.String arg0) {
        return real.getDoubleArrayExtra(arg0);
    }

    public double getDoubleExtra(java.lang.String arg0, double arg1) {
        return real.getDoubleExtra(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public int getFlags() {
        return real.getFlags();
    }

    public float[] getFloatArrayExtra(java.lang.String arg0) {
        return real.getFloatArrayExtra(arg0);
    }

    public float getFloatExtra(java.lang.String arg0, float arg1) {
        return real.getFloatExtra(arg0, arg1);
    }

    public java.lang.String getIdentifier() {
        return real.getIdentifier();
    }

    public int[] getIntArrayExtra(java.lang.String arg0) {
        return real.getIntArrayExtra(arg0);
    }

    public int getIntExtra(java.lang.String arg0, int arg1) {
        return real.getIntExtra(arg0, arg1);
    }

    public static com.micklab.dcg.wrapper.android.content.Intent getIntent(java.lang.String arg0) throws java.net.URISyntaxException {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.getIntent(arg0));
    }

    public static com.micklab.dcg.wrapper.android.content.Intent getIntentOld(java.lang.String arg0) throws java.net.URISyntaxException {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.getIntentOld(arg0));
    }

    public long[] getLongArrayExtra(java.lang.String arg0) {
        return real.getLongArrayExtra(arg0);
    }

    public long getLongExtra(java.lang.String arg0, long arg1) {
        return real.getLongExtra(arg0, arg1);
    }

    public java.lang.String getPackage() {
        return real.getPackage();
    }

    public android.os.Parcelable[] getParcelableArrayExtra(java.lang.String arg0) {
        return real.getParcelableArrayExtra(arg0);
    }

    public java.lang.String getScheme() {
        return real.getScheme();
    }

    public com.micklab.dcg.wrapper.android.content.Intent getSelector() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getSelector());
    }

    public java.io.Serializable getSerializableExtra(java.lang.String arg0) {
        return real.getSerializableExtra(arg0);
    }

    public short[] getShortArrayExtra(java.lang.String arg0) {
        return real.getShortArrayExtra(arg0);
    }

    public short getShortExtra(java.lang.String arg0, short arg1) {
        return real.getShortExtra(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getSourceBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getSourceBounds());
    }

    public java.lang.String[] getStringArrayExtra(java.lang.String arg0) {
        return real.getStringArrayExtra(arg0);
    }

    public java.lang.String getStringExtra(java.lang.String arg0) {
        return real.getStringExtra(arg0);
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public boolean hasCategory(java.lang.String arg0) {
        return real.hasCategory(arg0);
    }

    public boolean hasExtra(java.lang.String arg0) {
        return real.hasExtra(arg0);
    }

    public boolean hasFileDescriptors() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Intent#hasFileDescriptors()");
    }

    public boolean isMismatchingFilter() {
        return real.isMismatchingFilter();
    }

    public static com.micklab.dcg.wrapper.android.content.Intent makeMainActivity(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.makeMainActivity(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.Intent makeMainSelectorActivity(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.makeMainSelectorActivity(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.Intent makeRestartActivityTask(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.makeRestartActivityTask(arg0 == null ? null : arg0.unwrap()));
    }

    public static java.lang.String normalizeMimeType(java.lang.String arg0) {
        return android.content.Intent.normalizeMimeType(arg0);
    }

    public static com.micklab.dcg.wrapper.android.content.Intent parseIntent(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.parseIntent(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.Intent parseUri(java.lang.String arg0, int arg1) throws java.net.URISyntaxException {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(android.content.Intent.parseUri(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, java.io.Serializable arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, boolean[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, short[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, byte[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, android.os.Parcelable[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Parcelable arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, java.lang.CharSequence arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, double[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, java.lang.String[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, java.lang.CharSequence[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, float[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, long[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, char[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, char arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, short arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, byte arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, int[] arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, double arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtra(java.lang.String arg0, float arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtra(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtras(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtras(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent putExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.putExtras(arg0 == null ? null : arg0.unwrap()));
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void removeCategory(java.lang.String arg0) {
        real.removeCategory(arg0);
    }

    public void removeExtra(java.lang.String arg0) {
        real.removeExtra(arg0);
    }

    public void removeFlags(int arg0) {
        real.removeFlags(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.Intent replaceExtras(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.replaceExtras(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent replaceExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.replaceExtras(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName resolveActivity(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.resolveActivity(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.pm.ActivityInfo resolveActivityInfo(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.pm.ActivityInfo.wrap(real.resolveActivityInfo(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public java.lang.String resolveType(com.micklab.dcg.wrapper.android.content.ContentResolver arg0) {
        return real.resolveType(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String resolveType(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return real.resolveType(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String resolveTypeIfNeeded(com.micklab.dcg.wrapper.android.content.ContentResolver arg0) {
        return real.resolveTypeIfNeeded(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.Intent setAction(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setAction(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setClassName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setClassName(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setClassName(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setClassName(arg0, arg1));
    }

    public void setClipData(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
        real.setClipData(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.Intent setComponent(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setComponent(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setData(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setData(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setDataAndNormalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setDataAndNormalize(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setDataAndType(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setDataAndType(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setDataAndTypeAndNormalize(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setDataAndTypeAndNormalize(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void setExtrasClassLoader(java.lang.ClassLoader arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Intent#setExtrasClassLoader(java.lang.ClassLoader)");
    }

    public com.micklab.dcg.wrapper.android.content.Intent setFlags(int arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setFlags(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setIdentifier(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setIdentifier(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setPackage(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setPackage(arg0));
    }

    public void setSelector(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.setSelector(arg0 == null ? null : arg0.unwrap());
    }

    public void setSourceBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setSourceBounds(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.Intent setType(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setType(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Intent setTypeAndNormalize(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.setTypeAndNormalize(arg0));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public java.lang.String toURI() {
        return real.toURI();
    }

    public java.lang.String toUri(int arg0) {
        return real.toUri(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String ACTION_AIRPLANE_MODE_CHANGED = android.content.Intent.ACTION_AIRPLANE_MODE_CHANGED;
    public static final java.lang.String ACTION_ALL_APPS = android.content.Intent.ACTION_ALL_APPS;
    public static final java.lang.String ACTION_ANSWER = android.content.Intent.ACTION_ANSWER;
    public static final java.lang.String ACTION_APPLICATION_LOCALE_CHANGED = android.content.Intent.ACTION_APPLICATION_LOCALE_CHANGED;
    public static final java.lang.String ACTION_APPLICATION_PREFERENCES = android.content.Intent.ACTION_APPLICATION_PREFERENCES;
    public static final java.lang.String ACTION_APPLICATION_RESTRICTIONS_CHANGED = android.content.Intent.ACTION_APPLICATION_RESTRICTIONS_CHANGED;
    public static final java.lang.String ACTION_APP_ERROR = android.content.Intent.ACTION_APP_ERROR;
    public static final java.lang.String ACTION_ASSIST = android.content.Intent.ACTION_ASSIST;
    public static final java.lang.String ACTION_ATTACH_DATA = android.content.Intent.ACTION_ATTACH_DATA;
    public static final java.lang.String ACTION_AUTO_REVOKE_PERMISSIONS = android.content.Intent.ACTION_AUTO_REVOKE_PERMISSIONS;
    public static final java.lang.String ACTION_BATTERY_CHANGED = android.content.Intent.ACTION_BATTERY_CHANGED;
    public static final java.lang.String ACTION_BATTERY_LOW = android.content.Intent.ACTION_BATTERY_LOW;
    public static final java.lang.String ACTION_BATTERY_OKAY = android.content.Intent.ACTION_BATTERY_OKAY;
    public static final java.lang.String ACTION_BOOT_COMPLETED = android.content.Intent.ACTION_BOOT_COMPLETED;
    public static final java.lang.String ACTION_BUG_REPORT = android.content.Intent.ACTION_BUG_REPORT;
    public static final java.lang.String ACTION_CALL = android.content.Intent.ACTION_CALL;
    public static final java.lang.String ACTION_CALL_BUTTON = android.content.Intent.ACTION_CALL_BUTTON;
    public static final java.lang.String ACTION_CAMERA_BUTTON = android.content.Intent.ACTION_CAMERA_BUTTON;
    public static final java.lang.String ACTION_CARRIER_SETUP = android.content.Intent.ACTION_CARRIER_SETUP;
    public static final java.lang.String ACTION_CHOOSER = android.content.Intent.ACTION_CHOOSER;
    public static final java.lang.String ACTION_CLOSE_SYSTEM_DIALOGS = android.content.Intent.ACTION_CLOSE_SYSTEM_DIALOGS;
    public static final java.lang.String ACTION_CONFIGURATION_CHANGED = android.content.Intent.ACTION_CONFIGURATION_CHANGED;
    public static final java.lang.String ACTION_CREATE_DOCUMENT = android.content.Intent.ACTION_CREATE_DOCUMENT;
    public static final java.lang.String ACTION_CREATE_NOTE = android.content.Intent.ACTION_CREATE_NOTE;
    public static final java.lang.String ACTION_CREATE_REMINDER = android.content.Intent.ACTION_CREATE_REMINDER;
    public static final java.lang.String ACTION_CREATE_SHORTCUT = android.content.Intent.ACTION_CREATE_SHORTCUT;
    public static final java.lang.String ACTION_DATE_CHANGED = android.content.Intent.ACTION_DATE_CHANGED;
    public static final java.lang.String ACTION_DEFAULT = android.content.Intent.ACTION_DEFAULT;
    public static final java.lang.String ACTION_DEFINE = android.content.Intent.ACTION_DEFINE;
    public static final java.lang.String ACTION_DELETE = android.content.Intent.ACTION_DELETE;
    public static final java.lang.String ACTION_DEVICE_STORAGE_LOW = android.content.Intent.ACTION_DEVICE_STORAGE_LOW;
    public static final java.lang.String ACTION_DEVICE_STORAGE_OK = android.content.Intent.ACTION_DEVICE_STORAGE_OK;
    public static final java.lang.String ACTION_DIAL = android.content.Intent.ACTION_DIAL;
    public static final java.lang.String ACTION_DOCK_EVENT = android.content.Intent.ACTION_DOCK_EVENT;
    public static final java.lang.String ACTION_DREAMING_STARTED = android.content.Intent.ACTION_DREAMING_STARTED;
    public static final java.lang.String ACTION_DREAMING_STOPPED = android.content.Intent.ACTION_DREAMING_STOPPED;
    public static final java.lang.String ACTION_EDIT = android.content.Intent.ACTION_EDIT;
    public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = android.content.Intent.ACTION_EXTERNAL_APPLICATIONS_AVAILABLE;
    public static final java.lang.String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = android.content.Intent.ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE;
    public static final java.lang.String ACTION_FACTORY_TEST = android.content.Intent.ACTION_FACTORY_TEST;
    public static final java.lang.String ACTION_GET_CONTENT = android.content.Intent.ACTION_GET_CONTENT;
    public static final java.lang.String ACTION_GET_RESTRICTION_ENTRIES = android.content.Intent.ACTION_GET_RESTRICTION_ENTRIES;
    public static final java.lang.String ACTION_GTALK_SERVICE_CONNECTED = android.content.Intent.ACTION_GTALK_SERVICE_CONNECTED;
    public static final java.lang.String ACTION_GTALK_SERVICE_DISCONNECTED = android.content.Intent.ACTION_GTALK_SERVICE_DISCONNECTED;
    public static final java.lang.String ACTION_HEADSET_PLUG = android.content.Intent.ACTION_HEADSET_PLUG;
    public static final java.lang.String ACTION_INPUT_METHOD_CHANGED = android.content.Intent.ACTION_INPUT_METHOD_CHANGED;
    public static final java.lang.String ACTION_INSERT = android.content.Intent.ACTION_INSERT;
    public static final java.lang.String ACTION_INSERT_OR_EDIT = android.content.Intent.ACTION_INSERT_OR_EDIT;
    public static final java.lang.String ACTION_INSTALL_FAILURE = android.content.Intent.ACTION_INSTALL_FAILURE;
    public static final java.lang.String ACTION_INSTALL_PACKAGE = android.content.Intent.ACTION_INSTALL_PACKAGE;
    public static final java.lang.String ACTION_LAUNCH_CAPTURE_CONTENT_ACTIVITY_FOR_NOTE = android.content.Intent.ACTION_LAUNCH_CAPTURE_CONTENT_ACTIVITY_FOR_NOTE;
    public static final java.lang.String ACTION_LOCALE_CHANGED = android.content.Intent.ACTION_LOCALE_CHANGED;
    public static final java.lang.String ACTION_LOCKED_BOOT_COMPLETED = android.content.Intent.ACTION_LOCKED_BOOT_COMPLETED;
    public static final java.lang.String ACTION_MAIN = android.content.Intent.ACTION_MAIN;
    public static final java.lang.String ACTION_MANAGE_PACKAGE_STORAGE = android.content.Intent.ACTION_MANAGE_PACKAGE_STORAGE;
    public static final java.lang.String ACTION_MANAGE_UNUSED_APPS = android.content.Intent.ACTION_MANAGE_UNUSED_APPS;
    public static final java.lang.String ACTION_MEDIA_BAD_REMOVAL = android.content.Intent.ACTION_MEDIA_BAD_REMOVAL;
    public static final java.lang.String ACTION_MEDIA_BUTTON = android.content.Intent.ACTION_MEDIA_BUTTON;
    public static final java.lang.String ACTION_MEDIA_CHECKING = android.content.Intent.ACTION_MEDIA_CHECKING;
    public static final java.lang.String ACTION_MEDIA_EJECT = android.content.Intent.ACTION_MEDIA_EJECT;
    public static final java.lang.String ACTION_MEDIA_MOUNTED = android.content.Intent.ACTION_MEDIA_MOUNTED;
    public static final java.lang.String ACTION_MEDIA_NOFS = android.content.Intent.ACTION_MEDIA_NOFS;
    public static final java.lang.String ACTION_MEDIA_REMOVED = android.content.Intent.ACTION_MEDIA_REMOVED;
    public static final java.lang.String ACTION_MEDIA_SCANNER_FINISHED = android.content.Intent.ACTION_MEDIA_SCANNER_FINISHED;
    public static final java.lang.String ACTION_MEDIA_SCANNER_STARTED = android.content.Intent.ACTION_MEDIA_SCANNER_STARTED;
    public static final java.lang.String ACTION_MEDIA_SHARED = android.content.Intent.ACTION_MEDIA_SHARED;
    public static final java.lang.String ACTION_MEDIA_UNMOUNTABLE = android.content.Intent.ACTION_MEDIA_UNMOUNTABLE;
    public static final java.lang.String ACTION_MEDIA_UNMOUNTED = android.content.Intent.ACTION_MEDIA_UNMOUNTED;
    public static final java.lang.String ACTION_MY_PACKAGE_REPLACED = android.content.Intent.ACTION_MY_PACKAGE_REPLACED;
    public static final java.lang.String ACTION_MY_PACKAGE_SUSPENDED = android.content.Intent.ACTION_MY_PACKAGE_SUSPENDED;
    public static final java.lang.String ACTION_MY_PACKAGE_UNSUSPENDED = android.content.Intent.ACTION_MY_PACKAGE_UNSUSPENDED;
    public static final java.lang.String ACTION_NEW_OUTGOING_CALL = android.content.Intent.ACTION_NEW_OUTGOING_CALL;
    public static final java.lang.String ACTION_OPEN_DOCUMENT = android.content.Intent.ACTION_OPEN_DOCUMENT;
    public static final java.lang.String ACTION_OPEN_DOCUMENT_TREE = android.content.Intent.ACTION_OPEN_DOCUMENT_TREE;
    public static final java.lang.String ACTION_PACKAGES_SUSPENDED = android.content.Intent.ACTION_PACKAGES_SUSPENDED;
    public static final java.lang.String ACTION_PACKAGES_UNSUSPENDED = android.content.Intent.ACTION_PACKAGES_UNSUSPENDED;
    public static final java.lang.String ACTION_PACKAGE_ADDED = android.content.Intent.ACTION_PACKAGE_ADDED;
    public static final java.lang.String ACTION_PACKAGE_CHANGED = android.content.Intent.ACTION_PACKAGE_CHANGED;
    public static final java.lang.String ACTION_PACKAGE_DATA_CLEARED = android.content.Intent.ACTION_PACKAGE_DATA_CLEARED;
    public static final java.lang.String ACTION_PACKAGE_FIRST_LAUNCH = android.content.Intent.ACTION_PACKAGE_FIRST_LAUNCH;
    public static final java.lang.String ACTION_PACKAGE_FULLY_REMOVED = android.content.Intent.ACTION_PACKAGE_FULLY_REMOVED;
    public static final java.lang.String ACTION_PACKAGE_INSTALL = android.content.Intent.ACTION_PACKAGE_INSTALL;
    public static final java.lang.String ACTION_PACKAGE_NEEDS_VERIFICATION = android.content.Intent.ACTION_PACKAGE_NEEDS_VERIFICATION;
    public static final java.lang.String ACTION_PACKAGE_REMOVED = android.content.Intent.ACTION_PACKAGE_REMOVED;
    public static final java.lang.String ACTION_PACKAGE_REPLACED = android.content.Intent.ACTION_PACKAGE_REPLACED;
    public static final java.lang.String ACTION_PACKAGE_RESTARTED = android.content.Intent.ACTION_PACKAGE_RESTARTED;
    public static final java.lang.String ACTION_PACKAGE_UNSTOPPED = android.content.Intent.ACTION_PACKAGE_UNSTOPPED;
    public static final java.lang.String ACTION_PACKAGE_VERIFIED = android.content.Intent.ACTION_PACKAGE_VERIFIED;
    public static final java.lang.String ACTION_PASTE = android.content.Intent.ACTION_PASTE;
    public static final java.lang.String ACTION_PICK = android.content.Intent.ACTION_PICK;
    public static final java.lang.String ACTION_PICK_ACTIVITY = android.content.Intent.ACTION_PICK_ACTIVITY;
    public static final java.lang.String ACTION_POWER_CONNECTED = android.content.Intent.ACTION_POWER_CONNECTED;
    public static final java.lang.String ACTION_POWER_DISCONNECTED = android.content.Intent.ACTION_POWER_DISCONNECTED;
    public static final java.lang.String ACTION_POWER_USAGE_SUMMARY = android.content.Intent.ACTION_POWER_USAGE_SUMMARY;
    public static final java.lang.String ACTION_PROCESS_TEXT = android.content.Intent.ACTION_PROCESS_TEXT;
    public static final java.lang.String ACTION_PROVIDER_CHANGED = android.content.Intent.ACTION_PROVIDER_CHANGED;
    public static final java.lang.String ACTION_QUICK_CLOCK = android.content.Intent.ACTION_QUICK_CLOCK;
    public static final java.lang.String ACTION_QUICK_VIEW = android.content.Intent.ACTION_QUICK_VIEW;
    public static final java.lang.String ACTION_REBOOT = android.content.Intent.ACTION_REBOOT;
    public static final java.lang.String ACTION_RUN = android.content.Intent.ACTION_RUN;
    public static final java.lang.String ACTION_SAFETY_CENTER = android.content.Intent.ACTION_SAFETY_CENTER;
    public static final java.lang.String ACTION_SCREEN_OFF = android.content.Intent.ACTION_SCREEN_OFF;
    public static final java.lang.String ACTION_SCREEN_ON = android.content.Intent.ACTION_SCREEN_ON;
    public static final java.lang.String ACTION_SEARCH = android.content.Intent.ACTION_SEARCH;
    public static final java.lang.String ACTION_SEARCH_LONG_PRESS = android.content.Intent.ACTION_SEARCH_LONG_PRESS;
    public static final java.lang.String ACTION_SEND = android.content.Intent.ACTION_SEND;
    public static final java.lang.String ACTION_SENDTO = android.content.Intent.ACTION_SENDTO;
    public static final java.lang.String ACTION_SEND_MULTIPLE = android.content.Intent.ACTION_SEND_MULTIPLE;
    public static final java.lang.String ACTION_SET_WALLPAPER = android.content.Intent.ACTION_SET_WALLPAPER;
    public static final java.lang.String ACTION_SHOW_APP_INFO = android.content.Intent.ACTION_SHOW_APP_INFO;
    public static final java.lang.String ACTION_SHOW_WORK_APPS = android.content.Intent.ACTION_SHOW_WORK_APPS;
    public static final java.lang.String ACTION_SHUTDOWN = android.content.Intent.ACTION_SHUTDOWN;
    public static final java.lang.String ACTION_SYNC = android.content.Intent.ACTION_SYNC;
    public static final java.lang.String ACTION_SYSTEM_TUTORIAL = android.content.Intent.ACTION_SYSTEM_TUTORIAL;
    public static final java.lang.String ACTION_TIMEZONE_CHANGED = android.content.Intent.ACTION_TIMEZONE_CHANGED;
    public static final java.lang.String ACTION_TIME_CHANGED = android.content.Intent.ACTION_TIME_CHANGED;
    public static final java.lang.String ACTION_TIME_TICK = android.content.Intent.ACTION_TIME_TICK;
    public static final java.lang.String ACTION_TRANSLATE = android.content.Intent.ACTION_TRANSLATE;
    public static final java.lang.String ACTION_UID_REMOVED = android.content.Intent.ACTION_UID_REMOVED;
    public static final java.lang.String ACTION_UMS_CONNECTED = android.content.Intent.ACTION_UMS_CONNECTED;
    public static final java.lang.String ACTION_UMS_DISCONNECTED = android.content.Intent.ACTION_UMS_DISCONNECTED;
    public static final java.lang.String ACTION_UNARCHIVE_PACKAGE = android.content.Intent.ACTION_UNARCHIVE_PACKAGE;
    public static final java.lang.String ACTION_UNINSTALL_PACKAGE = android.content.Intent.ACTION_UNINSTALL_PACKAGE;
    public static final java.lang.String ACTION_USER_BACKGROUND = android.content.Intent.ACTION_USER_BACKGROUND;
    public static final java.lang.String ACTION_USER_FOREGROUND = android.content.Intent.ACTION_USER_FOREGROUND;
    public static final java.lang.String ACTION_USER_INITIALIZE = android.content.Intent.ACTION_USER_INITIALIZE;
    public static final java.lang.String ACTION_USER_PRESENT = android.content.Intent.ACTION_USER_PRESENT;
    public static final java.lang.String ACTION_USER_UNLOCKED = android.content.Intent.ACTION_USER_UNLOCKED;
    public static final java.lang.String ACTION_VIEW = android.content.Intent.ACTION_VIEW;
    public static final java.lang.String ACTION_VIEW_LOCUS = android.content.Intent.ACTION_VIEW_LOCUS;
    public static final java.lang.String ACTION_VIEW_PERMISSION_USAGE = android.content.Intent.ACTION_VIEW_PERMISSION_USAGE;
    public static final java.lang.String ACTION_VIEW_PERMISSION_USAGE_FOR_PERIOD = android.content.Intent.ACTION_VIEW_PERMISSION_USAGE_FOR_PERIOD;
    public static final java.lang.String ACTION_VOICE_COMMAND = android.content.Intent.ACTION_VOICE_COMMAND;
    public static final java.lang.String ACTION_WALLPAPER_CHANGED = android.content.Intent.ACTION_WALLPAPER_CHANGED;
    public static final java.lang.String ACTION_WEB_SEARCH = android.content.Intent.ACTION_WEB_SEARCH;
    public static final int CAPTURE_CONTENT_FOR_NOTE_BLOCKED_BY_ADMIN = android.content.Intent.CAPTURE_CONTENT_FOR_NOTE_BLOCKED_BY_ADMIN;
    public static final int CAPTURE_CONTENT_FOR_NOTE_FAILED = android.content.Intent.CAPTURE_CONTENT_FOR_NOTE_FAILED;
    public static final int CAPTURE_CONTENT_FOR_NOTE_SUCCESS = android.content.Intent.CAPTURE_CONTENT_FOR_NOTE_SUCCESS;
    public static final int CAPTURE_CONTENT_FOR_NOTE_USER_CANCELED = android.content.Intent.CAPTURE_CONTENT_FOR_NOTE_USER_CANCELED;
    public static final int CAPTURE_CONTENT_FOR_NOTE_WINDOW_MODE_UNSUPPORTED = android.content.Intent.CAPTURE_CONTENT_FOR_NOTE_WINDOW_MODE_UNSUPPORTED;
    public static final java.lang.String CATEGORY_ACCESSIBILITY_SHORTCUT_TARGET = android.content.Intent.CATEGORY_ACCESSIBILITY_SHORTCUT_TARGET;
    public static final java.lang.String CATEGORY_ALTERNATIVE = android.content.Intent.CATEGORY_ALTERNATIVE;
    public static final java.lang.String CATEGORY_APP_BROWSER = android.content.Intent.CATEGORY_APP_BROWSER;
    public static final java.lang.String CATEGORY_APP_CALCULATOR = android.content.Intent.CATEGORY_APP_CALCULATOR;
    public static final java.lang.String CATEGORY_APP_CALENDAR = android.content.Intent.CATEGORY_APP_CALENDAR;
    public static final java.lang.String CATEGORY_APP_CONTACTS = android.content.Intent.CATEGORY_APP_CONTACTS;
    public static final java.lang.String CATEGORY_APP_EMAIL = android.content.Intent.CATEGORY_APP_EMAIL;
    public static final java.lang.String CATEGORY_APP_FITNESS = android.content.Intent.CATEGORY_APP_FITNESS;
    public static final java.lang.String CATEGORY_APP_GALLERY = android.content.Intent.CATEGORY_APP_GALLERY;
    public static final java.lang.String CATEGORY_APP_MAPS = android.content.Intent.CATEGORY_APP_MAPS;
    public static final java.lang.String CATEGORY_APP_MARKET = android.content.Intent.CATEGORY_APP_MARKET;
    public static final java.lang.String CATEGORY_APP_MESSAGING = android.content.Intent.CATEGORY_APP_MESSAGING;
    public static final java.lang.String CATEGORY_APP_MUSIC = android.content.Intent.CATEGORY_APP_MUSIC;
    public static final java.lang.String CATEGORY_APP_WEATHER = android.content.Intent.CATEGORY_APP_WEATHER;
    public static final java.lang.String CATEGORY_BROWSABLE = android.content.Intent.CATEGORY_BROWSABLE;
    public static final java.lang.String CATEGORY_CAR_DOCK = android.content.Intent.CATEGORY_CAR_DOCK;
    public static final java.lang.String CATEGORY_CAR_MODE = android.content.Intent.CATEGORY_CAR_MODE;
    public static final java.lang.String CATEGORY_DEFAULT = android.content.Intent.CATEGORY_DEFAULT;
    public static final java.lang.String CATEGORY_DESK_DOCK = android.content.Intent.CATEGORY_DESK_DOCK;
    public static final java.lang.String CATEGORY_DEVELOPMENT_PREFERENCE = android.content.Intent.CATEGORY_DEVELOPMENT_PREFERENCE;
    public static final java.lang.String CATEGORY_EMBED = android.content.Intent.CATEGORY_EMBED;
    public static final java.lang.String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = android.content.Intent.CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST;
    public static final java.lang.String CATEGORY_HE_DESK_DOCK = android.content.Intent.CATEGORY_HE_DESK_DOCK;
    public static final java.lang.String CATEGORY_HOME = android.content.Intent.CATEGORY_HOME;
    public static final java.lang.String CATEGORY_INFO = android.content.Intent.CATEGORY_INFO;
    public static final java.lang.String CATEGORY_LAUNCHER = android.content.Intent.CATEGORY_LAUNCHER;
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = android.content.Intent.CATEGORY_LEANBACK_LAUNCHER;
    public static final java.lang.String CATEGORY_LE_DESK_DOCK = android.content.Intent.CATEGORY_LE_DESK_DOCK;
    public static final java.lang.String CATEGORY_MONKEY = android.content.Intent.CATEGORY_MONKEY;
    public static final java.lang.String CATEGORY_OPENABLE = android.content.Intent.CATEGORY_OPENABLE;
    public static final java.lang.String CATEGORY_PREFERENCE = android.content.Intent.CATEGORY_PREFERENCE;
    public static final java.lang.String CATEGORY_SAMPLE_CODE = android.content.Intent.CATEGORY_SAMPLE_CODE;
    public static final java.lang.String CATEGORY_SECONDARY_HOME = android.content.Intent.CATEGORY_SECONDARY_HOME;
    public static final java.lang.String CATEGORY_SELECTED_ALTERNATIVE = android.content.Intent.CATEGORY_SELECTED_ALTERNATIVE;
    public static final java.lang.String CATEGORY_TAB = android.content.Intent.CATEGORY_TAB;
    public static final java.lang.String CATEGORY_TEST = android.content.Intent.CATEGORY_TEST;
    public static final java.lang.String CATEGORY_TYPED_OPENABLE = android.content.Intent.CATEGORY_TYPED_OPENABLE;
    public static final java.lang.String CATEGORY_UNIT_TEST = android.content.Intent.CATEGORY_UNIT_TEST;
    public static final java.lang.String CATEGORY_VOICE = android.content.Intent.CATEGORY_VOICE;
    public static final java.lang.String CATEGORY_VR_HOME = android.content.Intent.CATEGORY_VR_HOME;
    public static final int CHOOSER_CONTENT_TYPE_ALBUM = android.content.Intent.CHOOSER_CONTENT_TYPE_ALBUM;
    public static final java.lang.String EXTRA_ALARM_COUNT = android.content.Intent.EXTRA_ALARM_COUNT;
    public static final java.lang.String EXTRA_ALLOW_MULTIPLE = android.content.Intent.EXTRA_ALLOW_MULTIPLE;
    public static final java.lang.String EXTRA_ALLOW_REPLACE = android.content.Intent.EXTRA_ALLOW_REPLACE;
    public static final java.lang.String EXTRA_ALTERNATE_INTENTS = android.content.Intent.EXTRA_ALTERNATE_INTENTS;
    public static final java.lang.String EXTRA_ARCHIVAL = android.content.Intent.EXTRA_ARCHIVAL;
    public static final java.lang.String EXTRA_ASSIST_CONTEXT = android.content.Intent.EXTRA_ASSIST_CONTEXT;
    public static final java.lang.String EXTRA_ASSIST_INPUT_DEVICE_ID = android.content.Intent.EXTRA_ASSIST_INPUT_DEVICE_ID;
    public static final java.lang.String EXTRA_ASSIST_INPUT_HINT_KEYBOARD = android.content.Intent.EXTRA_ASSIST_INPUT_HINT_KEYBOARD;
    public static final java.lang.String EXTRA_ASSIST_PACKAGE = android.content.Intent.EXTRA_ASSIST_PACKAGE;
    public static final java.lang.String EXTRA_ASSIST_UID = android.content.Intent.EXTRA_ASSIST_UID;
    public static final java.lang.String EXTRA_ATTRIBUTION_TAGS = android.content.Intent.EXTRA_ATTRIBUTION_TAGS;
    public static final java.lang.String EXTRA_AUTO_LAUNCH_SINGLE_CHOICE = android.content.Intent.EXTRA_AUTO_LAUNCH_SINGLE_CHOICE;
    public static final java.lang.String EXTRA_BCC = android.content.Intent.EXTRA_BCC;
    public static final java.lang.String EXTRA_BUG_REPORT = android.content.Intent.EXTRA_BUG_REPORT;
    public static final java.lang.String EXTRA_CAPTURE_CONTENT_FOR_NOTE_STATUS_CODE = android.content.Intent.EXTRA_CAPTURE_CONTENT_FOR_NOTE_STATUS_CODE;
    public static final java.lang.String EXTRA_CC = android.content.Intent.EXTRA_CC;
    public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME = android.content.Intent.EXTRA_CHANGED_COMPONENT_NAME;
    public static final java.lang.String EXTRA_CHANGED_COMPONENT_NAME_LIST = android.content.Intent.EXTRA_CHANGED_COMPONENT_NAME_LIST;
    public static final java.lang.String EXTRA_CHANGED_PACKAGE_LIST = android.content.Intent.EXTRA_CHANGED_PACKAGE_LIST;
    public static final java.lang.String EXTRA_CHANGED_UID_LIST = android.content.Intent.EXTRA_CHANGED_UID_LIST;
    public static final java.lang.String EXTRA_CHOOSER_ADDITIONAL_CONTENT_URI = android.content.Intent.EXTRA_CHOOSER_ADDITIONAL_CONTENT_URI;
    public static final java.lang.String EXTRA_CHOOSER_CONTENT_TYPE_HINT = android.content.Intent.EXTRA_CHOOSER_CONTENT_TYPE_HINT;
    public static final java.lang.String EXTRA_CHOOSER_CUSTOM_ACTIONS = android.content.Intent.EXTRA_CHOOSER_CUSTOM_ACTIONS;
    public static final java.lang.String EXTRA_CHOOSER_FOCUSED_ITEM_POSITION = android.content.Intent.EXTRA_CHOOSER_FOCUSED_ITEM_POSITION;
    public static final java.lang.String EXTRA_CHOOSER_MODIFY_SHARE_ACTION = android.content.Intent.EXTRA_CHOOSER_MODIFY_SHARE_ACTION;
    public static final java.lang.String EXTRA_CHOOSER_REFINEMENT_INTENT_SENDER = android.content.Intent.EXTRA_CHOOSER_REFINEMENT_INTENT_SENDER;
    public static final java.lang.String EXTRA_CHOOSER_RESULT = android.content.Intent.EXTRA_CHOOSER_RESULT;
    public static final java.lang.String EXTRA_CHOOSER_RESULT_INTENT_SENDER = android.content.Intent.EXTRA_CHOOSER_RESULT_INTENT_SENDER;
    public static final java.lang.String EXTRA_CHOOSER_TARGETS = android.content.Intent.EXTRA_CHOOSER_TARGETS;
    public static final java.lang.String EXTRA_CHOSEN_COMPONENT = android.content.Intent.EXTRA_CHOSEN_COMPONENT;
    public static final java.lang.String EXTRA_CHOSEN_COMPONENT_INTENT_SENDER = android.content.Intent.EXTRA_CHOSEN_COMPONENT_INTENT_SENDER;
    public static final java.lang.String EXTRA_COMPONENT_NAME = android.content.Intent.EXTRA_COMPONENT_NAME;
    public static final java.lang.String EXTRA_CONTENT_ANNOTATIONS = android.content.Intent.EXTRA_CONTENT_ANNOTATIONS;
    public static final java.lang.String EXTRA_CONTENT_QUERY = android.content.Intent.EXTRA_CONTENT_QUERY;
    public static final java.lang.String EXTRA_DATA_REMOVED = android.content.Intent.EXTRA_DATA_REMOVED;
    public static final java.lang.String EXTRA_DOCK_STATE = android.content.Intent.EXTRA_DOCK_STATE;
    public static final int EXTRA_DOCK_STATE_CAR = android.content.Intent.EXTRA_DOCK_STATE_CAR;
    public static final int EXTRA_DOCK_STATE_DESK = android.content.Intent.EXTRA_DOCK_STATE_DESK;
    public static final int EXTRA_DOCK_STATE_HE_DESK = android.content.Intent.EXTRA_DOCK_STATE_HE_DESK;
    public static final int EXTRA_DOCK_STATE_LE_DESK = android.content.Intent.EXTRA_DOCK_STATE_LE_DESK;
    public static final int EXTRA_DOCK_STATE_UNDOCKED = android.content.Intent.EXTRA_DOCK_STATE_UNDOCKED;
    public static final java.lang.String EXTRA_DONT_KILL_APP = android.content.Intent.EXTRA_DONT_KILL_APP;
    public static final java.lang.String EXTRA_DURATION_MILLIS = android.content.Intent.EXTRA_DURATION_MILLIS;
    public static final java.lang.String EXTRA_EMAIL = android.content.Intent.EXTRA_EMAIL;
    public static final java.lang.String EXTRA_END_TIME = android.content.Intent.EXTRA_END_TIME;
    public static final java.lang.String EXTRA_EXCLUDE_COMPONENTS = android.content.Intent.EXTRA_EXCLUDE_COMPONENTS;
    public static final java.lang.String EXTRA_FROM_STORAGE = android.content.Intent.EXTRA_FROM_STORAGE;
    public static final java.lang.String EXTRA_HTML_TEXT = android.content.Intent.EXTRA_HTML_TEXT;
    public static final java.lang.String EXTRA_INDEX = android.content.Intent.EXTRA_INDEX;
    public static final java.lang.String EXTRA_INITIAL_INTENTS = android.content.Intent.EXTRA_INITIAL_INTENTS;
    public static final java.lang.String EXTRA_INSTALLER_PACKAGE_NAME = android.content.Intent.EXTRA_INSTALLER_PACKAGE_NAME;
    public static final java.lang.String EXTRA_INTENT = android.content.Intent.EXTRA_INTENT;
    public static final java.lang.String EXTRA_KEY_EVENT = android.content.Intent.EXTRA_KEY_EVENT;
    public static final java.lang.String EXTRA_LOCALE_LIST = android.content.Intent.EXTRA_LOCALE_LIST;
    public static final java.lang.String EXTRA_LOCAL_ONLY = android.content.Intent.EXTRA_LOCAL_ONLY;
    public static final java.lang.String EXTRA_LOCUS_ID = android.content.Intent.EXTRA_LOCUS_ID;
    public static final java.lang.String EXTRA_METADATA_TEXT = android.content.Intent.EXTRA_METADATA_TEXT;
    public static final java.lang.String EXTRA_MIME_TYPES = android.content.Intent.EXTRA_MIME_TYPES;
    public static final java.lang.String EXTRA_NOT_UNKNOWN_SOURCE = android.content.Intent.EXTRA_NOT_UNKNOWN_SOURCE;
    public static final java.lang.String EXTRA_ORIGINATING_URI = android.content.Intent.EXTRA_ORIGINATING_URI;
    public static final java.lang.String EXTRA_PACKAGES = android.content.Intent.EXTRA_PACKAGES;
    public static final java.lang.String EXTRA_PACKAGE_NAME = android.content.Intent.EXTRA_PACKAGE_NAME;
    public static final java.lang.String EXTRA_PERMISSION_GROUP_NAME = android.content.Intent.EXTRA_PERMISSION_GROUP_NAME;
    public static final java.lang.String EXTRA_PHONE_NUMBER = android.content.Intent.EXTRA_PHONE_NUMBER;
    public static final java.lang.String EXTRA_PROCESS_TEXT = android.content.Intent.EXTRA_PROCESS_TEXT;
    public static final java.lang.String EXTRA_PROCESS_TEXT_READONLY = android.content.Intent.EXTRA_PROCESS_TEXT_READONLY;
    public static final java.lang.String EXTRA_QUICK_VIEW_FEATURES = android.content.Intent.EXTRA_QUICK_VIEW_FEATURES;
    public static final java.lang.String EXTRA_QUIET_MODE = android.content.Intent.EXTRA_QUIET_MODE;
    public static final java.lang.String EXTRA_REFERRER = android.content.Intent.EXTRA_REFERRER;
    public static final java.lang.String EXTRA_REFERRER_NAME = android.content.Intent.EXTRA_REFERRER_NAME;
    public static final java.lang.String EXTRA_REMOTE_INTENT_TOKEN = android.content.Intent.EXTRA_REMOTE_INTENT_TOKEN;
    public static final java.lang.String EXTRA_REPLACEMENT_EXTRAS = android.content.Intent.EXTRA_REPLACEMENT_EXTRAS;
    public static final java.lang.String EXTRA_REPLACING = android.content.Intent.EXTRA_REPLACING;
    public static final java.lang.String EXTRA_RESTRICTIONS_BUNDLE = android.content.Intent.EXTRA_RESTRICTIONS_BUNDLE;
    public static final java.lang.String EXTRA_RESTRICTIONS_INTENT = android.content.Intent.EXTRA_RESTRICTIONS_INTENT;
    public static final java.lang.String EXTRA_RESTRICTIONS_LIST = android.content.Intent.EXTRA_RESTRICTIONS_LIST;
    public static final java.lang.String EXTRA_RESULT_RECEIVER = android.content.Intent.EXTRA_RESULT_RECEIVER;
    public static final java.lang.String EXTRA_RETURN_RESULT = android.content.Intent.EXTRA_RETURN_RESULT;
    public static final java.lang.String EXTRA_SHORTCUT_ICON = android.content.Intent.EXTRA_SHORTCUT_ICON;
    public static final java.lang.String EXTRA_SHORTCUT_ICON_RESOURCE = android.content.Intent.EXTRA_SHORTCUT_ICON_RESOURCE;
    public static final java.lang.String EXTRA_SHORTCUT_ID = android.content.Intent.EXTRA_SHORTCUT_ID;
    public static final java.lang.String EXTRA_SHORTCUT_INTENT = android.content.Intent.EXTRA_SHORTCUT_INTENT;
    public static final java.lang.String EXTRA_SHORTCUT_NAME = android.content.Intent.EXTRA_SHORTCUT_NAME;
    public static final java.lang.String EXTRA_SHUTDOWN_USERSPACE_ONLY = android.content.Intent.EXTRA_SHUTDOWN_USERSPACE_ONLY;
    public static final java.lang.String EXTRA_SPLIT_NAME = android.content.Intent.EXTRA_SPLIT_NAME;
    public static final java.lang.String EXTRA_START_TIME = android.content.Intent.EXTRA_START_TIME;
    public static final java.lang.String EXTRA_STREAM = android.content.Intent.EXTRA_STREAM;
    public static final java.lang.String EXTRA_SUBJECT = android.content.Intent.EXTRA_SUBJECT;
    public static final java.lang.String EXTRA_SUSPENDED_PACKAGE_EXTRAS = android.content.Intent.EXTRA_SUSPENDED_PACKAGE_EXTRAS;
    public static final java.lang.String EXTRA_TEMPLATE = android.content.Intent.EXTRA_TEMPLATE;
    public static final java.lang.String EXTRA_TEXT = android.content.Intent.EXTRA_TEXT;
    public static final java.lang.String EXTRA_TIME = android.content.Intent.EXTRA_TIME;
    public static final java.lang.String EXTRA_TIMEZONE = android.content.Intent.EXTRA_TIMEZONE;
    public static final java.lang.String EXTRA_TITLE = android.content.Intent.EXTRA_TITLE;
    public static final java.lang.String EXTRA_UID = android.content.Intent.EXTRA_UID;
    public static final java.lang.String EXTRA_USER = android.content.Intent.EXTRA_USER;
    public static final java.lang.String EXTRA_USER_INITIATED = android.content.Intent.EXTRA_USER_INITIATED;
    public static final java.lang.String EXTRA_USE_STYLUS_MODE = android.content.Intent.EXTRA_USE_STYLUS_MODE;
    public static final int FILL_IN_ACTION = android.content.Intent.FILL_IN_ACTION;
    public static final int FILL_IN_CATEGORIES = android.content.Intent.FILL_IN_CATEGORIES;
    public static final int FILL_IN_CLIP_DATA = android.content.Intent.FILL_IN_CLIP_DATA;
    public static final int FILL_IN_COMPONENT = android.content.Intent.FILL_IN_COMPONENT;
    public static final int FILL_IN_DATA = android.content.Intent.FILL_IN_DATA;
    public static final int FILL_IN_IDENTIFIER = android.content.Intent.FILL_IN_IDENTIFIER;
    public static final int FILL_IN_PACKAGE = android.content.Intent.FILL_IN_PACKAGE;
    public static final int FILL_IN_SELECTOR = android.content.Intent.FILL_IN_SELECTOR;
    public static final int FILL_IN_SOURCE_BOUNDS = android.content.Intent.FILL_IN_SOURCE_BOUNDS;
    public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = android.content.Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT;
    public static final int FLAG_ACTIVITY_CLEAR_TASK = android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK;
    public static final int FLAG_ACTIVITY_CLEAR_TOP = android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;
    public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = android.content.Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
    public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = android.content.Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS;
    public static final int FLAG_ACTIVITY_FORWARD_RESULT = android.content.Intent.FLAG_ACTIVITY_FORWARD_RESULT;
    public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = android.content.Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY;
    public static final int FLAG_ACTIVITY_LAUNCH_ADJACENT = android.content.Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT;
    public static final int FLAG_ACTIVITY_MATCH_EXTERNAL = android.content.Intent.FLAG_ACTIVITY_MATCH_EXTERNAL;
    public static final int FLAG_ACTIVITY_MULTIPLE_TASK = android.content.Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
    public static final int FLAG_ACTIVITY_NEW_DOCUMENT = android.content.Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
    public static final int FLAG_ACTIVITY_NEW_TASK = android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
    public static final int FLAG_ACTIVITY_NO_ANIMATION = android.content.Intent.FLAG_ACTIVITY_NO_ANIMATION;
    public static final int FLAG_ACTIVITY_NO_HISTORY = android.content.Intent.FLAG_ACTIVITY_NO_HISTORY;
    public static final int FLAG_ACTIVITY_NO_USER_ACTION = android.content.Intent.FLAG_ACTIVITY_NO_USER_ACTION;
    public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = android.content.Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP;
    public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = android.content.Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;
    public static final int FLAG_ACTIVITY_REQUIRE_DEFAULT = android.content.Intent.FLAG_ACTIVITY_REQUIRE_DEFAULT;
    public static final int FLAG_ACTIVITY_REQUIRE_NON_BROWSER = android.content.Intent.FLAG_ACTIVITY_REQUIRE_NON_BROWSER;
    public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = android.content.Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED;
    public static final int FLAG_ACTIVITY_RETAIN_IN_RECENTS = android.content.Intent.FLAG_ACTIVITY_RETAIN_IN_RECENTS;
    public static final int FLAG_ACTIVITY_SINGLE_TOP = android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP;
    public static final int FLAG_ACTIVITY_TASK_ON_HOME = android.content.Intent.FLAG_ACTIVITY_TASK_ON_HOME;
    public static final int FLAG_DEBUG_LOG_RESOLUTION = android.content.Intent.FLAG_DEBUG_LOG_RESOLUTION;
    public static final int FLAG_DIRECT_BOOT_AUTO = android.content.Intent.FLAG_DIRECT_BOOT_AUTO;
    public static final int FLAG_EXCLUDE_STOPPED_PACKAGES = android.content.Intent.FLAG_EXCLUDE_STOPPED_PACKAGES;
    public static final int FLAG_FROM_BACKGROUND = android.content.Intent.FLAG_FROM_BACKGROUND;
    public static final int FLAG_GRANT_PERSISTABLE_URI_PERMISSION = android.content.Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION;
    public static final int FLAG_GRANT_PREFIX_URI_PERMISSION = android.content.Intent.FLAG_GRANT_PREFIX_URI_PERMISSION;
    public static final int FLAG_GRANT_READ_URI_PERMISSION = android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION;
    public static final int FLAG_GRANT_WRITE_URI_PERMISSION = android.content.Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
    public static final int FLAG_INCLUDE_STOPPED_PACKAGES = android.content.Intent.FLAG_INCLUDE_STOPPED_PACKAGES;
    public static final int FLAG_RECEIVER_FOREGROUND = android.content.Intent.FLAG_RECEIVER_FOREGROUND;
    public static final int FLAG_RECEIVER_NO_ABORT = android.content.Intent.FLAG_RECEIVER_NO_ABORT;
    public static final int FLAG_RECEIVER_REGISTERED_ONLY = android.content.Intent.FLAG_RECEIVER_REGISTERED_ONLY;
    public static final int FLAG_RECEIVER_REPLACE_PENDING = android.content.Intent.FLAG_RECEIVER_REPLACE_PENDING;
    public static final int FLAG_RECEIVER_VISIBLE_TO_INSTANT_APPS = android.content.Intent.FLAG_RECEIVER_VISIBLE_TO_INSTANT_APPS;
    public static final java.lang.String METADATA_DOCK_HOME = android.content.Intent.METADATA_DOCK_HOME;
    public static final int URI_ALLOW_UNSAFE = android.content.Intent.URI_ALLOW_UNSAFE;
    public static final int URI_ANDROID_APP_SCHEME = android.content.Intent.URI_ANDROID_APP_SCHEME;
    public static final int URI_INTENT_SCHEME = android.content.Intent.URI_INTENT_SCHEME;

    public static final class FilterComparison {
        private final android.content.Intent.FilterComparison real;

        public FilterComparison(android.content.Intent.FilterComparison real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Intent.FilterComparison wrap(android.content.Intent.FilterComparison real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Intent.FilterComparison(real);
        }

        public android.content.Intent.FilterComparison unwrap() {
            return real;
        }

        public FilterComparison(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            this(new android.content.Intent.FilterComparison(arg0 == null ? null : arg0.unwrap()));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
            return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getIntent());
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class ShortcutIconResource {
        private final android.content.Intent.ShortcutIconResource real;

        public ShortcutIconResource(android.content.Intent.ShortcutIconResource real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Intent.ShortcutIconResource wrap(android.content.Intent.ShortcutIconResource real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Intent.ShortcutIconResource(real);
        }

        public android.content.Intent.ShortcutIconResource unwrap() {
            return real;
        }

        public ShortcutIconResource() {
            this(new android.content.Intent.ShortcutIconResource());
        }

        public int describeContents() {
            return real.describeContents();
        }

        public static com.micklab.dcg.wrapper.android.content.Intent.ShortcutIconResource fromContext(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.Intent.ShortcutIconResource.wrap(android.content.Intent.ShortcutIconResource.fromContext(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
