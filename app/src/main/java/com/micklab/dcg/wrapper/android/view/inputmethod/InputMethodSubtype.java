// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodSubtype {
    private final android.view.inputmethod.InputMethodSubtype real;

    public InputMethodSubtype(android.view.inputmethod.InputMethodSubtype real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype wrap(android.view.inputmethod.InputMethodSubtype real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype(real);
    }

    public android.view.inputmethod.InputMethodSubtype unwrap() {
        return real;
    }

    public InputMethodSubtype(int arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, boolean arg6) {
        this(new android.view.inputmethod.InputMethodSubtype(arg0, arg1, arg2, arg3, arg4, arg5, arg6));
    }

    public InputMethodSubtype(int arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, boolean arg6, int arg7) {
        this(new android.view.inputmethod.InputMethodSubtype(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
    }

    public boolean containsExtraValueKey(java.lang.String arg0) {
        return real.containsExtraValueKey(arg0);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.CharSequence getDisplayName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg2) {
        return real.getDisplayName(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.String getExtraValue() {
        return real.getExtraValue();
    }

    public java.lang.String getExtraValueOf(java.lang.String arg0) {
        return real.getExtraValueOf(arg0);
    }

    public int getIconResId() {
        return real.getIconResId();
    }

    public java.lang.String getLanguageTag() {
        return real.getLanguageTag();
    }

    public java.lang.String getLocale() {
        return real.getLocale();
    }

    public java.lang.String getMode() {
        return real.getMode();
    }

    public java.lang.CharSequence getNameOverride() {
        return real.getNameOverride();
    }

    public int getNameResId() {
        return real.getNameResId();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getPhysicalKeyboardHintLanguageTag() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getPhysicalKeyboardHintLanguageTag());
    }

    public java.lang.String getPhysicalKeyboardHintLayoutType() {
        return real.getPhysicalKeyboardHintLayoutType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isAsciiCapable() {
        return real.isAsciiCapable();
    }

    public boolean isAuxiliary() {
        return real.isAuxiliary();
    }

    public boolean overridesImplicitlyEnabledSubtype() {
        return real.overridesImplicitlyEnabledSubtype();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class InputMethodSubtypeBuilder {
        private final android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder real;

        public InputMethodSubtypeBuilder(android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder wrap(android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder(real);
        }

        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder unwrap() {
            return real;
        }

        public InputMethodSubtypeBuilder() {
            this(new android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAsciiCapable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setIsAsciiCapable(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAuxiliary(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setIsAuxiliary(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLanguageTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setLanguageTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setOverridesImplicitlyEnabledSubtype(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setOverridesImplicitlyEnabledSubtype(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setPhysicalKeyboardHint(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setPhysicalKeyboardHint(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeExtraValue(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setSubtypeExtraValue(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeIconResId(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setSubtypeIconResId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeId(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setSubtypeId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeLocale(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setSubtypeLocale(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeMode(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setSubtypeMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameOverride(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setSubtypeNameOverride(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameResId(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(real.setSubtypeNameResId(arg0));
        }

    }
}
