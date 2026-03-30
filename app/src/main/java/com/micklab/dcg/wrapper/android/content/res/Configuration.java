// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class Configuration {
    private final android.content.res.Configuration real;

    public Configuration(android.content.res.Configuration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.Configuration wrap(android.content.res.Configuration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.Configuration(real);
    }

    public android.content.res.Configuration unwrap() {
        return real;
    }

    public Configuration() {
        this(new android.content.res.Configuration());
    }

    public Configuration(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        this(new android.content.res.Configuration(arg0 == null ? null : arg0.unwrap()));
    }

    public int compareTo(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int diff(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        return real.diff(arg0 == null ? null : arg0.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean equals(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        return real.equals(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.content.res.Configuration generateDelta(com.micklab.dcg.wrapper.android.content.res.Configuration arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        return com.micklab.dcg.wrapper.android.content.res.Configuration.wrap(android.content.res.Configuration.generateDelta(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int getGrammaticalGender() {
        return real.getGrammaticalGender();
    }

    public int getLayoutDirection() {
        return real.getLayoutDirection();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getLocales());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isLayoutSizeAtLeast(int arg0) {
        return real.isLayoutSizeAtLeast(arg0);
    }

    public boolean isNightModeActive() {
        return real.isNightModeActive();
    }

    public boolean isScreenHdr() {
        return real.isScreenHdr();
    }

    public boolean isScreenRound() {
        return real.isScreenRound();
    }

    public boolean isScreenWideColorGamut() {
        return real.isScreenWideColorGamut();
    }

    public static boolean needNewResources(int arg0, int arg1) {
        return android.content.res.Configuration.needNewResources(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void setLayoutDirection(java.util.Locale arg0) {
        real.setLayoutDirection(arg0);
    }

    public void setLocale(java.util.Locale arg0) {
        real.setLocale(arg0);
    }

    public void setLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        real.setLocales(arg0 == null ? null : arg0.unwrap());
    }

    public void setTo(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.setTo(arg0 == null ? null : arg0.unwrap());
    }

    public void setToDefaults() {
        real.setToDefaults();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public int updateFrom(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        return real.updateFrom(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int COLOR_MODE_HDR_MASK = android.content.res.Configuration.COLOR_MODE_HDR_MASK;
    public static final int COLOR_MODE_HDR_NO = android.content.res.Configuration.COLOR_MODE_HDR_NO;
    public static final int COLOR_MODE_HDR_SHIFT = android.content.res.Configuration.COLOR_MODE_HDR_SHIFT;
    public static final int COLOR_MODE_HDR_UNDEFINED = android.content.res.Configuration.COLOR_MODE_HDR_UNDEFINED;
    public static final int COLOR_MODE_HDR_YES = android.content.res.Configuration.COLOR_MODE_HDR_YES;
    public static final int COLOR_MODE_UNDEFINED = android.content.res.Configuration.COLOR_MODE_UNDEFINED;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_MASK = android.content.res.Configuration.COLOR_MODE_WIDE_COLOR_GAMUT_MASK;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_NO = android.content.res.Configuration.COLOR_MODE_WIDE_COLOR_GAMUT_NO;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_UNDEFINED = android.content.res.Configuration.COLOR_MODE_WIDE_COLOR_GAMUT_UNDEFINED;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT_YES = android.content.res.Configuration.COLOR_MODE_WIDE_COLOR_GAMUT_YES;
    public static final int DENSITY_DPI_UNDEFINED = android.content.res.Configuration.DENSITY_DPI_UNDEFINED;
    public static final int FONT_WEIGHT_ADJUSTMENT_UNDEFINED = android.content.res.Configuration.FONT_WEIGHT_ADJUSTMENT_UNDEFINED;
    public static final int GRAMMATICAL_GENDER_FEMININE = android.content.res.Configuration.GRAMMATICAL_GENDER_FEMININE;
    public static final int GRAMMATICAL_GENDER_MASCULINE = android.content.res.Configuration.GRAMMATICAL_GENDER_MASCULINE;
    public static final int GRAMMATICAL_GENDER_NEUTRAL = android.content.res.Configuration.GRAMMATICAL_GENDER_NEUTRAL;
    public static final int GRAMMATICAL_GENDER_NOT_SPECIFIED = android.content.res.Configuration.GRAMMATICAL_GENDER_NOT_SPECIFIED;
    public static final int HARDKEYBOARDHIDDEN_NO = android.content.res.Configuration.HARDKEYBOARDHIDDEN_NO;
    public static final int HARDKEYBOARDHIDDEN_UNDEFINED = android.content.res.Configuration.HARDKEYBOARDHIDDEN_UNDEFINED;
    public static final int HARDKEYBOARDHIDDEN_YES = android.content.res.Configuration.HARDKEYBOARDHIDDEN_YES;
    public static final int KEYBOARDHIDDEN_NO = android.content.res.Configuration.KEYBOARDHIDDEN_NO;
    public static final int KEYBOARDHIDDEN_UNDEFINED = android.content.res.Configuration.KEYBOARDHIDDEN_UNDEFINED;
    public static final int KEYBOARDHIDDEN_YES = android.content.res.Configuration.KEYBOARDHIDDEN_YES;
    public static final int KEYBOARD_12KEY = android.content.res.Configuration.KEYBOARD_12KEY;
    public static final int KEYBOARD_NOKEYS = android.content.res.Configuration.KEYBOARD_NOKEYS;
    public static final int KEYBOARD_QWERTY = android.content.res.Configuration.KEYBOARD_QWERTY;
    public static final int KEYBOARD_UNDEFINED = android.content.res.Configuration.KEYBOARD_UNDEFINED;
    public static final int MNC_ZERO = android.content.res.Configuration.MNC_ZERO;
    public static final int NAVIGATIONHIDDEN_NO = android.content.res.Configuration.NAVIGATIONHIDDEN_NO;
    public static final int NAVIGATIONHIDDEN_UNDEFINED = android.content.res.Configuration.NAVIGATIONHIDDEN_UNDEFINED;
    public static final int NAVIGATIONHIDDEN_YES = android.content.res.Configuration.NAVIGATIONHIDDEN_YES;
    public static final int NAVIGATION_DPAD = android.content.res.Configuration.NAVIGATION_DPAD;
    public static final int NAVIGATION_NONAV = android.content.res.Configuration.NAVIGATION_NONAV;
    public static final int NAVIGATION_TRACKBALL = android.content.res.Configuration.NAVIGATION_TRACKBALL;
    public static final int NAVIGATION_UNDEFINED = android.content.res.Configuration.NAVIGATION_UNDEFINED;
    public static final int NAVIGATION_WHEEL = android.content.res.Configuration.NAVIGATION_WHEEL;
    public static final int ORIENTATION_LANDSCAPE = android.content.res.Configuration.ORIENTATION_LANDSCAPE;
    public static final int ORIENTATION_PORTRAIT = android.content.res.Configuration.ORIENTATION_PORTRAIT;
    public static final int ORIENTATION_SQUARE = android.content.res.Configuration.ORIENTATION_SQUARE;
    public static final int ORIENTATION_UNDEFINED = android.content.res.Configuration.ORIENTATION_UNDEFINED;
    public static final int SCREENLAYOUT_LAYOUTDIR_LTR = android.content.res.Configuration.SCREENLAYOUT_LAYOUTDIR_LTR;
    public static final int SCREENLAYOUT_LAYOUTDIR_MASK = android.content.res.Configuration.SCREENLAYOUT_LAYOUTDIR_MASK;
    public static final int SCREENLAYOUT_LAYOUTDIR_RTL = android.content.res.Configuration.SCREENLAYOUT_LAYOUTDIR_RTL;
    public static final int SCREENLAYOUT_LAYOUTDIR_SHIFT = android.content.res.Configuration.SCREENLAYOUT_LAYOUTDIR_SHIFT;
    public static final int SCREENLAYOUT_LAYOUTDIR_UNDEFINED = android.content.res.Configuration.SCREENLAYOUT_LAYOUTDIR_UNDEFINED;
    public static final int SCREENLAYOUT_LONG_MASK = android.content.res.Configuration.SCREENLAYOUT_LONG_MASK;
    public static final int SCREENLAYOUT_LONG_NO = android.content.res.Configuration.SCREENLAYOUT_LONG_NO;
    public static final int SCREENLAYOUT_LONG_UNDEFINED = android.content.res.Configuration.SCREENLAYOUT_LONG_UNDEFINED;
    public static final int SCREENLAYOUT_LONG_YES = android.content.res.Configuration.SCREENLAYOUT_LONG_YES;
    public static final int SCREENLAYOUT_ROUND_MASK = android.content.res.Configuration.SCREENLAYOUT_ROUND_MASK;
    public static final int SCREENLAYOUT_ROUND_NO = android.content.res.Configuration.SCREENLAYOUT_ROUND_NO;
    public static final int SCREENLAYOUT_ROUND_UNDEFINED = android.content.res.Configuration.SCREENLAYOUT_ROUND_UNDEFINED;
    public static final int SCREENLAYOUT_ROUND_YES = android.content.res.Configuration.SCREENLAYOUT_ROUND_YES;
    public static final int SCREENLAYOUT_SIZE_LARGE = android.content.res.Configuration.SCREENLAYOUT_SIZE_LARGE;
    public static final int SCREENLAYOUT_SIZE_MASK = android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK;
    public static final int SCREENLAYOUT_SIZE_NORMAL = android.content.res.Configuration.SCREENLAYOUT_SIZE_NORMAL;
    public static final int SCREENLAYOUT_SIZE_SMALL = android.content.res.Configuration.SCREENLAYOUT_SIZE_SMALL;
    public static final int SCREENLAYOUT_SIZE_UNDEFINED = android.content.res.Configuration.SCREENLAYOUT_SIZE_UNDEFINED;
    public static final int SCREENLAYOUT_SIZE_XLARGE = android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE;
    public static final int SCREENLAYOUT_UNDEFINED = android.content.res.Configuration.SCREENLAYOUT_UNDEFINED;
    public static final int SCREEN_HEIGHT_DP_UNDEFINED = android.content.res.Configuration.SCREEN_HEIGHT_DP_UNDEFINED;
    public static final int SCREEN_WIDTH_DP_UNDEFINED = android.content.res.Configuration.SCREEN_WIDTH_DP_UNDEFINED;
    public static final int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED = android.content.res.Configuration.SMALLEST_SCREEN_WIDTH_DP_UNDEFINED;
    public static final int TOUCHSCREEN_FINGER = android.content.res.Configuration.TOUCHSCREEN_FINGER;
    public static final int TOUCHSCREEN_NOTOUCH = android.content.res.Configuration.TOUCHSCREEN_NOTOUCH;
    public static final int TOUCHSCREEN_STYLUS = android.content.res.Configuration.TOUCHSCREEN_STYLUS;
    public static final int TOUCHSCREEN_UNDEFINED = android.content.res.Configuration.TOUCHSCREEN_UNDEFINED;
    public static final int UI_MODE_NIGHT_MASK = android.content.res.Configuration.UI_MODE_NIGHT_MASK;
    public static final int UI_MODE_NIGHT_NO = android.content.res.Configuration.UI_MODE_NIGHT_NO;
    public static final int UI_MODE_NIGHT_UNDEFINED = android.content.res.Configuration.UI_MODE_NIGHT_UNDEFINED;
    public static final int UI_MODE_NIGHT_YES = android.content.res.Configuration.UI_MODE_NIGHT_YES;
    public static final int UI_MODE_TYPE_APPLIANCE = android.content.res.Configuration.UI_MODE_TYPE_APPLIANCE;
    public static final int UI_MODE_TYPE_CAR = android.content.res.Configuration.UI_MODE_TYPE_CAR;
    public static final int UI_MODE_TYPE_DESK = android.content.res.Configuration.UI_MODE_TYPE_DESK;
    public static final int UI_MODE_TYPE_MASK = android.content.res.Configuration.UI_MODE_TYPE_MASK;
    public static final int UI_MODE_TYPE_NORMAL = android.content.res.Configuration.UI_MODE_TYPE_NORMAL;
    public static final int UI_MODE_TYPE_TELEVISION = android.content.res.Configuration.UI_MODE_TYPE_TELEVISION;
    public static final int UI_MODE_TYPE_UNDEFINED = android.content.res.Configuration.UI_MODE_TYPE_UNDEFINED;
    public static final int UI_MODE_TYPE_VR_HEADSET = android.content.res.Configuration.UI_MODE_TYPE_VR_HEADSET;
    public static final int UI_MODE_TYPE_WATCH = android.content.res.Configuration.UI_MODE_TYPE_WATCH;

}
