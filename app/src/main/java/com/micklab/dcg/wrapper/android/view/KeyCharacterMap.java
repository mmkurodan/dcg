// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class KeyCharacterMap {
    private final android.view.KeyCharacterMap real;

    public KeyCharacterMap(android.view.KeyCharacterMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.KeyCharacterMap wrap(android.view.KeyCharacterMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyCharacterMap(real);
    }

    public android.view.KeyCharacterMap unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public static boolean deviceHasKey(int arg0) {
        return android.view.KeyCharacterMap.deviceHasKey(arg0);
    }

    public static boolean[] deviceHasKeys(int[] arg0) {
        return android.view.KeyCharacterMap.deviceHasKeys(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int get(int arg0, int arg1) {
        return real.get(arg0, arg1);
    }

    public static int getDeadChar(int arg0, int arg1) {
        return android.view.KeyCharacterMap.getDeadChar(arg0, arg1);
    }

    public char getDisplayLabel(int arg0) {
        return real.getDisplayLabel(arg0);
    }

    public android.view.KeyEvent[] getEvents(char[] arg0) {
        return real.getEvents(arg0);
    }

    public boolean getKeyData(int arg0, com.micklab.dcg.wrapper.android.view.KeyCharacterMap.KeyData arg1) {
        return real.getKeyData(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int getKeyboardType() {
        return real.getKeyboardType();
    }

    public char getMatch(int arg0, char[] arg1) {
        return real.getMatch(arg0, arg1);
    }

    public char getMatch(int arg0, char[] arg1, int arg2) {
        return real.getMatch(arg0, arg1, arg2);
    }

    public int getModifierBehavior() {
        return real.getModifierBehavior();
    }

    public char getNumber(int arg0) {
        return real.getNumber(arg0);
    }

    public boolean isPrintingKey(int arg0) {
        return real.isPrintingKey(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.KeyCharacterMap load(int arg0) {
        return com.micklab.dcg.wrapper.android.view.KeyCharacterMap.wrap(android.view.KeyCharacterMap.load(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ALPHA = android.view.KeyCharacterMap.ALPHA;
    public static final int BUILT_IN_KEYBOARD = android.view.KeyCharacterMap.BUILT_IN_KEYBOARD;
    public static final int COMBINING_ACCENT = android.view.KeyCharacterMap.COMBINING_ACCENT;
    public static final int COMBINING_ACCENT_MASK = android.view.KeyCharacterMap.COMBINING_ACCENT_MASK;
    public static final int FULL = android.view.KeyCharacterMap.FULL;
    public static final char HEX_INPUT = android.view.KeyCharacterMap.HEX_INPUT;
    public static final int MODIFIER_BEHAVIOR_CHORDED = android.view.KeyCharacterMap.MODIFIER_BEHAVIOR_CHORDED;
    public static final int MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED = android.view.KeyCharacterMap.MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED;
    public static final int NUMERIC = android.view.KeyCharacterMap.NUMERIC;
    public static final char PICKER_DIALOG_INPUT = android.view.KeyCharacterMap.PICKER_DIALOG_INPUT;
    public static final int PREDICTIVE = android.view.KeyCharacterMap.PREDICTIVE;
    public static final int SPECIAL_FUNCTION = android.view.KeyCharacterMap.SPECIAL_FUNCTION;
    public static final int VIRTUAL_KEYBOARD = android.view.KeyCharacterMap.VIRTUAL_KEYBOARD;

    public static final class KeyData {
        private final android.view.KeyCharacterMap.KeyData real;

        public KeyData(android.view.KeyCharacterMap.KeyData real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.KeyCharacterMap.KeyData wrap(android.view.KeyCharacterMap.KeyData real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyCharacterMap.KeyData(real);
        }

        public android.view.KeyCharacterMap.KeyData unwrap() {
            return real;
        }

        public KeyData() {
            this(new android.view.KeyCharacterMap.KeyData());
        }

        public static final int META_LENGTH = android.view.KeyCharacterMap.KeyData.META_LENGTH;

    }
    public static final class UnavailableException {
        private final android.view.KeyCharacterMap.UnavailableException real;

        public UnavailableException(android.view.KeyCharacterMap.UnavailableException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.KeyCharacterMap.UnavailableException wrap(android.view.KeyCharacterMap.UnavailableException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyCharacterMap.UnavailableException(real);
        }

        public android.view.KeyCharacterMap.UnavailableException unwrap() {
            return real;
        }

        public UnavailableException(java.lang.String arg0) {
            this(new android.view.KeyCharacterMap.UnavailableException(arg0));
        }

    }
}
