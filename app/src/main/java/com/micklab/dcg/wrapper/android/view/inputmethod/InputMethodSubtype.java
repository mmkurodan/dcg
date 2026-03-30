// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class InputMethodSubtype {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputMethodSubtype(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype wrap(android.view.inputmethod.InputMethodSubtype real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.InputMethodSubtype getReal() {
        return (android.view.inputmethod.InputMethodSubtype) real;
    }

    public android.view.inputmethod.InputMethodSubtype unwrap() {
        return getReal();
    }

    public InputMethodSubtype(int arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, boolean arg6) {
        this(new android.view.inputmethod.InputMethodSubtype(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public InputMethodSubtype(int arg0, int arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, boolean arg5, boolean arg6, int arg7) {
        this(new android.view.inputmethod.InputMethodSubtype(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public boolean containsExtraValueKey(java.lang.String arg0) {
        return ((android.view.inputmethod.InputMethodSubtype) real).containsExtraValueKey(arg0);
    }

    public int describeContents() {
        return ((android.view.inputmethod.InputMethodSubtype) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.inputmethod.InputMethodSubtype) real).equals(arg0);
    }

    public java.lang.CharSequence getDisplayName(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg2) {
        return ((android.view.inputmethod.InputMethodSubtype) real).getDisplayName(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.String getExtraValue() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getExtraValue();
    }

    public java.lang.String getExtraValueOf(java.lang.String arg0) {
        return ((android.view.inputmethod.InputMethodSubtype) real).getExtraValueOf(arg0);
    }

    public int getIconResId() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getIconResId();
    }

    public java.lang.String getLanguageTag() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getLanguageTag();
    }

    public java.lang.String getLocale() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getLocale();
    }

    public java.lang.String getMode() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getMode();
    }

    public java.lang.CharSequence getNameOverride() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getNameOverride();
    }

    public int getNameResId() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getNameResId();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getPhysicalKeyboardHintLanguageTag() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(((android.view.inputmethod.InputMethodSubtype) real).getPhysicalKeyboardHintLanguageTag());
    }

    public java.lang.String getPhysicalKeyboardHintLayoutType() {
        return ((android.view.inputmethod.InputMethodSubtype) real).getPhysicalKeyboardHintLayoutType();
    }

    public int hashCode() {
        return ((android.view.inputmethod.InputMethodSubtype) real).hashCode();
    }

    public boolean isAsciiCapable() {
        return ((android.view.inputmethod.InputMethodSubtype) real).isAsciiCapable();
    }

    public boolean isAuxiliary() {
        return ((android.view.inputmethod.InputMethodSubtype) real).isAuxiliary();
    }

    public boolean overridesImplicitlyEnabledSubtype() {
        return ((android.view.inputmethod.InputMethodSubtype) real).overridesImplicitlyEnabledSubtype();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.InputMethodSubtype) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class InputMethodSubtypeBuilder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InputMethodSubtypeBuilder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder wrap(android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder getReal() {
            return (android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real;
        }

        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder unwrap() {
            return getReal();
        }

        public InputMethodSubtypeBuilder() {
            this(new android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAsciiCapable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setIsAsciiCapable(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAuxiliary(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setIsAuxiliary(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLanguageTag(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setLanguageTag(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setOverridesImplicitlyEnabledSubtype(boolean arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setOverridesImplicitlyEnabledSubtype(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setPhysicalKeyboardHint(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setPhysicalKeyboardHint(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeExtraValue(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setSubtypeExtraValue(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeIconResId(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setSubtypeIconResId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeId(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setSubtypeId(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeLocale(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setSubtypeLocale(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeMode(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setSubtypeMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameOverride(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setSubtypeNameOverride(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameResId(int arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder.wrap(((android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder) real).setSubtypeNameResId(arg0));
        }

    }
}
