// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class KeyEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.KeyEvent wrap(android.view.KeyEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.KeyEvent getReal() {
        return (android.view.KeyEvent) real;
    }

    public android.view.KeyEvent unwrap() {
        return getReal();
    }

    public KeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        this(new android.view.KeyEvent(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public KeyEvent(int arg0, int arg1) {
        this(new android.view.KeyEvent(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public KeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0, long arg1, int arg2) {
        this(new android.view.KeyEvent(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public KeyEvent(long arg0, java.lang.String arg1, int arg2, int arg3) {
        this(new android.view.KeyEvent(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public KeyEvent(long arg0, long arg1, int arg2, int arg3, int arg4) {
        this(new android.view.KeyEvent(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public KeyEvent(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.view.KeyEvent(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public KeyEvent(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this(new android.view.KeyEvent(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7), (__DcgwBridgeToken) null);
    }

    public KeyEvent(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this(new android.view.KeyEvent(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8), (__DcgwBridgeToken) null);
    }

    public KeyEvent(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this(new android.view.KeyEvent(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.view.KeyEvent changeAction(com.micklab.dcg.wrapper.android.view.KeyEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.wrap(android.view.KeyEvent.changeAction(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.KeyEvent changeFlags(com.micklab.dcg.wrapper.android.view.KeyEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.wrap(android.view.KeyEvent.changeFlags(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.KeyEvent changeTimeRepeat(com.micklab.dcg.wrapper.android.view.KeyEvent arg0, long arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.wrap(android.view.KeyEvent.changeTimeRepeat(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.view.KeyEvent changeTimeRepeat(com.micklab.dcg.wrapper.android.view.KeyEvent arg0, long arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.KeyEvent.wrap(android.view.KeyEvent.changeTimeRepeat(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public boolean dispatch(com.micklab.dcg.wrapper.android.view.KeyEvent.Callback arg0) {
        return ((android.view.KeyEvent) real).dispatch(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatch(com.micklab.dcg.wrapper.android.view.KeyEvent.Callback arg0, com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState arg1, java.lang.Object arg2) {
        return ((android.view.KeyEvent) real).dispatch(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int getAction() {
        return ((android.view.KeyEvent) real).getAction();
    }

    public java.lang.String getCharacters() {
        return ((android.view.KeyEvent) real).getCharacters();
    }

    public static int getDeadChar(int arg0, int arg1) {
        return android.view.KeyEvent.getDeadChar(arg0, arg1);
    }

    public int getDeviceId() {
        return ((android.view.KeyEvent) real).getDeviceId();
    }

    public char getDisplayLabel() {
        return ((android.view.KeyEvent) real).getDisplayLabel();
    }

    public long getDownTime() {
        return ((android.view.KeyEvent) real).getDownTime();
    }

    public long getEventTime() {
        return ((android.view.KeyEvent) real).getEventTime();
    }

    public int getFlags() {
        return ((android.view.KeyEvent) real).getFlags();
    }

    public com.micklab.dcg.wrapper.android.view.KeyCharacterMap getKeyCharacterMap() {
        return com.micklab.dcg.wrapper.android.view.KeyCharacterMap.wrap(((android.view.KeyEvent) real).getKeyCharacterMap());
    }

    public int getKeyCode() {
        return ((android.view.KeyEvent) real).getKeyCode();
    }

    public boolean getKeyData(com.micklab.dcg.wrapper.android.view.KeyCharacterMap.KeyData arg0) {
        return ((android.view.KeyEvent) real).getKeyData(arg0 == null ? null : arg0.getReal());
    }

    public char getMatch(char[] arg0) {
        return ((android.view.KeyEvent) real).getMatch(arg0);
    }

    public char getMatch(char[] arg0, int arg1) {
        return ((android.view.KeyEvent) real).getMatch(arg0, arg1);
    }

    public static int getMaxKeyCode() {
        return android.view.KeyEvent.getMaxKeyCode();
    }

    public int getMetaState() {
        return ((android.view.KeyEvent) real).getMetaState();
    }

    public static int getModifierMetaStateMask() {
        return android.view.KeyEvent.getModifierMetaStateMask();
    }

    public int getModifiers() {
        return ((android.view.KeyEvent) real).getModifiers();
    }

    public char getNumber() {
        return ((android.view.KeyEvent) real).getNumber();
    }

    public int getRepeatCount() {
        return ((android.view.KeyEvent) real).getRepeatCount();
    }

    public int getScanCode() {
        return ((android.view.KeyEvent) real).getScanCode();
    }

    public int getSource() {
        return ((android.view.KeyEvent) real).getSource();
    }

    public int getUnicodeChar() {
        return ((android.view.KeyEvent) real).getUnicodeChar();
    }

    public int getUnicodeChar(int arg0) {
        return ((android.view.KeyEvent) real).getUnicodeChar(arg0);
    }

    public boolean hasModifiers(int arg0) {
        return ((android.view.KeyEvent) real).hasModifiers(arg0);
    }

    public boolean hasNoModifiers() {
        return ((android.view.KeyEvent) real).hasNoModifiers();
    }

    public boolean isAltPressed() {
        return ((android.view.KeyEvent) real).isAltPressed();
    }

    public boolean isCanceled() {
        return ((android.view.KeyEvent) real).isCanceled();
    }

    public boolean isCapsLockOn() {
        return ((android.view.KeyEvent) real).isCapsLockOn();
    }

    public boolean isCtrlPressed() {
        return ((android.view.KeyEvent) real).isCtrlPressed();
    }

    public boolean isFunctionPressed() {
        return ((android.view.KeyEvent) real).isFunctionPressed();
    }

    public static boolean isGamepadButton(int arg0) {
        return android.view.KeyEvent.isGamepadButton(arg0);
    }

    public boolean isLongPress() {
        return ((android.view.KeyEvent) real).isLongPress();
    }

    public static boolean isMediaSessionKey(int arg0) {
        return android.view.KeyEvent.isMediaSessionKey(arg0);
    }

    public boolean isMetaPressed() {
        return ((android.view.KeyEvent) real).isMetaPressed();
    }

    public static boolean isModifierKey(int arg0) {
        return android.view.KeyEvent.isModifierKey(arg0);
    }

    public boolean isNumLockOn() {
        return ((android.view.KeyEvent) real).isNumLockOn();
    }

    public boolean isPrintingKey() {
        return ((android.view.KeyEvent) real).isPrintingKey();
    }

    public boolean isScrollLockOn() {
        return ((android.view.KeyEvent) real).isScrollLockOn();
    }

    public boolean isShiftPressed() {
        return ((android.view.KeyEvent) real).isShiftPressed();
    }

    public boolean isSymPressed() {
        return ((android.view.KeyEvent) real).isSymPressed();
    }

    public boolean isSystem() {
        return ((android.view.KeyEvent) real).isSystem();
    }

    public boolean isTracking() {
        return ((android.view.KeyEvent) real).isTracking();
    }

    public static int keyCodeFromString(java.lang.String arg0) {
        return android.view.KeyEvent.keyCodeFromString(arg0);
    }

    public static java.lang.String keyCodeToString(int arg0) {
        return android.view.KeyEvent.keyCodeToString(arg0);
    }

    public static boolean metaStateHasModifiers(int arg0, int arg1) {
        return android.view.KeyEvent.metaStateHasModifiers(arg0, arg1);
    }

    public static boolean metaStateHasNoModifiers(int arg0) {
        return android.view.KeyEvent.metaStateHasNoModifiers(arg0);
    }

    public static int normalizeMetaState(int arg0) {
        return android.view.KeyEvent.normalizeMetaState(arg0);
    }

    public void setSource(int arg0) {
        ((android.view.KeyEvent) real).setSource(arg0);
    }

    public void startTracking() {
        ((android.view.KeyEvent) real).startTracking();
    }

    public java.lang.String toString() {
        return ((android.view.KeyEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.KeyEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ACTION_DOWN = android.view.KeyEvent.ACTION_DOWN;
    public static final int ACTION_MULTIPLE = android.view.KeyEvent.ACTION_MULTIPLE;
    public static final int ACTION_UP = android.view.KeyEvent.ACTION_UP;
    public static final int FLAG_CANCELED = android.view.KeyEvent.FLAG_CANCELED;
    public static final int FLAG_CANCELED_LONG_PRESS = android.view.KeyEvent.FLAG_CANCELED_LONG_PRESS;
    public static final int FLAG_EDITOR_ACTION = android.view.KeyEvent.FLAG_EDITOR_ACTION;
    public static final int FLAG_FALLBACK = android.view.KeyEvent.FLAG_FALLBACK;
    public static final int FLAG_FROM_SYSTEM = android.view.KeyEvent.FLAG_FROM_SYSTEM;
    public static final int FLAG_KEEP_TOUCH_MODE = android.view.KeyEvent.FLAG_KEEP_TOUCH_MODE;
    public static final int FLAG_LONG_PRESS = android.view.KeyEvent.FLAG_LONG_PRESS;
    public static final int FLAG_SOFT_KEYBOARD = android.view.KeyEvent.FLAG_SOFT_KEYBOARD;
    public static final int FLAG_TRACKING = android.view.KeyEvent.FLAG_TRACKING;
    public static final int FLAG_VIRTUAL_HARD_KEY = android.view.KeyEvent.FLAG_VIRTUAL_HARD_KEY;
    public static final int FLAG_WOKE_HERE = android.view.KeyEvent.FLAG_WOKE_HERE;
    public static final int KEYCODE_0 = android.view.KeyEvent.KEYCODE_0;
    public static final int KEYCODE_1 = android.view.KeyEvent.KEYCODE_1;
    public static final int KEYCODE_11 = android.view.KeyEvent.KEYCODE_11;
    public static final int KEYCODE_12 = android.view.KeyEvent.KEYCODE_12;
    public static final int KEYCODE_2 = android.view.KeyEvent.KEYCODE_2;
    public static final int KEYCODE_3 = android.view.KeyEvent.KEYCODE_3;
    public static final int KEYCODE_3D_MODE = android.view.KeyEvent.KEYCODE_3D_MODE;
    public static final int KEYCODE_4 = android.view.KeyEvent.KEYCODE_4;
    public static final int KEYCODE_5 = android.view.KeyEvent.KEYCODE_5;
    public static final int KEYCODE_6 = android.view.KeyEvent.KEYCODE_6;
    public static final int KEYCODE_7 = android.view.KeyEvent.KEYCODE_7;
    public static final int KEYCODE_8 = android.view.KeyEvent.KEYCODE_8;
    public static final int KEYCODE_9 = android.view.KeyEvent.KEYCODE_9;
    public static final int KEYCODE_A = android.view.KeyEvent.KEYCODE_A;
    public static final int KEYCODE_ALL_APPS = android.view.KeyEvent.KEYCODE_ALL_APPS;
    public static final int KEYCODE_ALT_LEFT = android.view.KeyEvent.KEYCODE_ALT_LEFT;
    public static final int KEYCODE_ALT_RIGHT = android.view.KeyEvent.KEYCODE_ALT_RIGHT;
    public static final int KEYCODE_APOSTROPHE = android.view.KeyEvent.KEYCODE_APOSTROPHE;
    public static final int KEYCODE_APP_SWITCH = android.view.KeyEvent.KEYCODE_APP_SWITCH;
    public static final int KEYCODE_ASSIST = android.view.KeyEvent.KEYCODE_ASSIST;
    public static final int KEYCODE_AT = android.view.KeyEvent.KEYCODE_AT;
    public static final int KEYCODE_AVR_INPUT = android.view.KeyEvent.KEYCODE_AVR_INPUT;
    public static final int KEYCODE_AVR_POWER = android.view.KeyEvent.KEYCODE_AVR_POWER;
    public static final int KEYCODE_B = android.view.KeyEvent.KEYCODE_B;
    public static final int KEYCODE_BACK = android.view.KeyEvent.KEYCODE_BACK;
    public static final int KEYCODE_BACKSLASH = android.view.KeyEvent.KEYCODE_BACKSLASH;
    public static final int KEYCODE_BOOKMARK = android.view.KeyEvent.KEYCODE_BOOKMARK;
    public static final int KEYCODE_BREAK = android.view.KeyEvent.KEYCODE_BREAK;
    public static final int KEYCODE_BRIGHTNESS_DOWN = android.view.KeyEvent.KEYCODE_BRIGHTNESS_DOWN;
    public static final int KEYCODE_BRIGHTNESS_UP = android.view.KeyEvent.KEYCODE_BRIGHTNESS_UP;
    public static final int KEYCODE_BUTTON_1 = android.view.KeyEvent.KEYCODE_BUTTON_1;
    public static final int KEYCODE_BUTTON_10 = android.view.KeyEvent.KEYCODE_BUTTON_10;
    public static final int KEYCODE_BUTTON_11 = android.view.KeyEvent.KEYCODE_BUTTON_11;
    public static final int KEYCODE_BUTTON_12 = android.view.KeyEvent.KEYCODE_BUTTON_12;
    public static final int KEYCODE_BUTTON_13 = android.view.KeyEvent.KEYCODE_BUTTON_13;
    public static final int KEYCODE_BUTTON_14 = android.view.KeyEvent.KEYCODE_BUTTON_14;
    public static final int KEYCODE_BUTTON_15 = android.view.KeyEvent.KEYCODE_BUTTON_15;
    public static final int KEYCODE_BUTTON_16 = android.view.KeyEvent.KEYCODE_BUTTON_16;
    public static final int KEYCODE_BUTTON_2 = android.view.KeyEvent.KEYCODE_BUTTON_2;
    public static final int KEYCODE_BUTTON_3 = android.view.KeyEvent.KEYCODE_BUTTON_3;
    public static final int KEYCODE_BUTTON_4 = android.view.KeyEvent.KEYCODE_BUTTON_4;
    public static final int KEYCODE_BUTTON_5 = android.view.KeyEvent.KEYCODE_BUTTON_5;
    public static final int KEYCODE_BUTTON_6 = android.view.KeyEvent.KEYCODE_BUTTON_6;
    public static final int KEYCODE_BUTTON_7 = android.view.KeyEvent.KEYCODE_BUTTON_7;
    public static final int KEYCODE_BUTTON_8 = android.view.KeyEvent.KEYCODE_BUTTON_8;
    public static final int KEYCODE_BUTTON_9 = android.view.KeyEvent.KEYCODE_BUTTON_9;
    public static final int KEYCODE_BUTTON_A = android.view.KeyEvent.KEYCODE_BUTTON_A;
    public static final int KEYCODE_BUTTON_B = android.view.KeyEvent.KEYCODE_BUTTON_B;
    public static final int KEYCODE_BUTTON_C = android.view.KeyEvent.KEYCODE_BUTTON_C;
    public static final int KEYCODE_BUTTON_L1 = android.view.KeyEvent.KEYCODE_BUTTON_L1;
    public static final int KEYCODE_BUTTON_L2 = android.view.KeyEvent.KEYCODE_BUTTON_L2;
    public static final int KEYCODE_BUTTON_MODE = android.view.KeyEvent.KEYCODE_BUTTON_MODE;
    public static final int KEYCODE_BUTTON_R1 = android.view.KeyEvent.KEYCODE_BUTTON_R1;
    public static final int KEYCODE_BUTTON_R2 = android.view.KeyEvent.KEYCODE_BUTTON_R2;
    public static final int KEYCODE_BUTTON_SELECT = android.view.KeyEvent.KEYCODE_BUTTON_SELECT;
    public static final int KEYCODE_BUTTON_START = android.view.KeyEvent.KEYCODE_BUTTON_START;
    public static final int KEYCODE_BUTTON_THUMBL = android.view.KeyEvent.KEYCODE_BUTTON_THUMBL;
    public static final int KEYCODE_BUTTON_THUMBR = android.view.KeyEvent.KEYCODE_BUTTON_THUMBR;
    public static final int KEYCODE_BUTTON_X = android.view.KeyEvent.KEYCODE_BUTTON_X;
    public static final int KEYCODE_BUTTON_Y = android.view.KeyEvent.KEYCODE_BUTTON_Y;
    public static final int KEYCODE_BUTTON_Z = android.view.KeyEvent.KEYCODE_BUTTON_Z;
    public static final int KEYCODE_C = android.view.KeyEvent.KEYCODE_C;
    public static final int KEYCODE_CALCULATOR = android.view.KeyEvent.KEYCODE_CALCULATOR;
    public static final int KEYCODE_CALENDAR = android.view.KeyEvent.KEYCODE_CALENDAR;
    public static final int KEYCODE_CALL = android.view.KeyEvent.KEYCODE_CALL;
    public static final int KEYCODE_CAMERA = android.view.KeyEvent.KEYCODE_CAMERA;
    public static final int KEYCODE_CAPS_LOCK = android.view.KeyEvent.KEYCODE_CAPS_LOCK;
    public static final int KEYCODE_CAPTIONS = android.view.KeyEvent.KEYCODE_CAPTIONS;
    public static final int KEYCODE_CHANNEL_DOWN = android.view.KeyEvent.KEYCODE_CHANNEL_DOWN;
    public static final int KEYCODE_CHANNEL_UP = android.view.KeyEvent.KEYCODE_CHANNEL_UP;
    public static final int KEYCODE_CLEAR = android.view.KeyEvent.KEYCODE_CLEAR;
    public static final int KEYCODE_COMMA = android.view.KeyEvent.KEYCODE_COMMA;
    public static final int KEYCODE_CONTACTS = android.view.KeyEvent.KEYCODE_CONTACTS;
    public static final int KEYCODE_COPY = android.view.KeyEvent.KEYCODE_COPY;
    public static final int KEYCODE_CTRL_LEFT = android.view.KeyEvent.KEYCODE_CTRL_LEFT;
    public static final int KEYCODE_CTRL_RIGHT = android.view.KeyEvent.KEYCODE_CTRL_RIGHT;
    public static final int KEYCODE_CUT = android.view.KeyEvent.KEYCODE_CUT;
    public static final int KEYCODE_D = android.view.KeyEvent.KEYCODE_D;
    public static final int KEYCODE_DEL = android.view.KeyEvent.KEYCODE_DEL;
    public static final int KEYCODE_DEMO_APP_1 = android.view.KeyEvent.KEYCODE_DEMO_APP_1;
    public static final int KEYCODE_DEMO_APP_2 = android.view.KeyEvent.KEYCODE_DEMO_APP_2;
    public static final int KEYCODE_DEMO_APP_3 = android.view.KeyEvent.KEYCODE_DEMO_APP_3;
    public static final int KEYCODE_DEMO_APP_4 = android.view.KeyEvent.KEYCODE_DEMO_APP_4;
    public static final int KEYCODE_DPAD_CENTER = android.view.KeyEvent.KEYCODE_DPAD_CENTER;
    public static final int KEYCODE_DPAD_DOWN = android.view.KeyEvent.KEYCODE_DPAD_DOWN;
    public static final int KEYCODE_DPAD_DOWN_LEFT = android.view.KeyEvent.KEYCODE_DPAD_DOWN_LEFT;
    public static final int KEYCODE_DPAD_DOWN_RIGHT = android.view.KeyEvent.KEYCODE_DPAD_DOWN_RIGHT;
    public static final int KEYCODE_DPAD_LEFT = android.view.KeyEvent.KEYCODE_DPAD_LEFT;
    public static final int KEYCODE_DPAD_RIGHT = android.view.KeyEvent.KEYCODE_DPAD_RIGHT;
    public static final int KEYCODE_DPAD_UP = android.view.KeyEvent.KEYCODE_DPAD_UP;
    public static final int KEYCODE_DPAD_UP_LEFT = android.view.KeyEvent.KEYCODE_DPAD_UP_LEFT;
    public static final int KEYCODE_DPAD_UP_RIGHT = android.view.KeyEvent.KEYCODE_DPAD_UP_RIGHT;
    public static final int KEYCODE_DVR = android.view.KeyEvent.KEYCODE_DVR;
    public static final int KEYCODE_E = android.view.KeyEvent.KEYCODE_E;
    public static final int KEYCODE_EISU = android.view.KeyEvent.KEYCODE_EISU;
    public static final int KEYCODE_EMOJI_PICKER = android.view.KeyEvent.KEYCODE_EMOJI_PICKER;
    public static final int KEYCODE_ENDCALL = android.view.KeyEvent.KEYCODE_ENDCALL;
    public static final int KEYCODE_ENTER = android.view.KeyEvent.KEYCODE_ENTER;
    public static final int KEYCODE_ENVELOPE = android.view.KeyEvent.KEYCODE_ENVELOPE;
    public static final int KEYCODE_EQUALS = android.view.KeyEvent.KEYCODE_EQUALS;
    public static final int KEYCODE_ESCAPE = android.view.KeyEvent.KEYCODE_ESCAPE;
    public static final int KEYCODE_EXPLORER = android.view.KeyEvent.KEYCODE_EXPLORER;
    public static final int KEYCODE_F = android.view.KeyEvent.KEYCODE_F;
    public static final int KEYCODE_F1 = android.view.KeyEvent.KEYCODE_F1;
    public static final int KEYCODE_F10 = android.view.KeyEvent.KEYCODE_F10;
    public static final int KEYCODE_F11 = android.view.KeyEvent.KEYCODE_F11;
    public static final int KEYCODE_F12 = android.view.KeyEvent.KEYCODE_F12;
    public static final int KEYCODE_F2 = android.view.KeyEvent.KEYCODE_F2;
    public static final int KEYCODE_F3 = android.view.KeyEvent.KEYCODE_F3;
    public static final int KEYCODE_F4 = android.view.KeyEvent.KEYCODE_F4;
    public static final int KEYCODE_F5 = android.view.KeyEvent.KEYCODE_F5;
    public static final int KEYCODE_F6 = android.view.KeyEvent.KEYCODE_F6;
    public static final int KEYCODE_F7 = android.view.KeyEvent.KEYCODE_F7;
    public static final int KEYCODE_F8 = android.view.KeyEvent.KEYCODE_F8;
    public static final int KEYCODE_F9 = android.view.KeyEvent.KEYCODE_F9;
    public static final int KEYCODE_FEATURED_APP_1 = android.view.KeyEvent.KEYCODE_FEATURED_APP_1;
    public static final int KEYCODE_FEATURED_APP_2 = android.view.KeyEvent.KEYCODE_FEATURED_APP_2;
    public static final int KEYCODE_FEATURED_APP_3 = android.view.KeyEvent.KEYCODE_FEATURED_APP_3;
    public static final int KEYCODE_FEATURED_APP_4 = android.view.KeyEvent.KEYCODE_FEATURED_APP_4;
    public static final int KEYCODE_FOCUS = android.view.KeyEvent.KEYCODE_FOCUS;
    public static final int KEYCODE_FORWARD = android.view.KeyEvent.KEYCODE_FORWARD;
    public static final int KEYCODE_FORWARD_DEL = android.view.KeyEvent.KEYCODE_FORWARD_DEL;
    public static final int KEYCODE_FUNCTION = android.view.KeyEvent.KEYCODE_FUNCTION;
    public static final int KEYCODE_G = android.view.KeyEvent.KEYCODE_G;
    public static final int KEYCODE_GRAVE = android.view.KeyEvent.KEYCODE_GRAVE;
    public static final int KEYCODE_GUIDE = android.view.KeyEvent.KEYCODE_GUIDE;
    public static final int KEYCODE_H = android.view.KeyEvent.KEYCODE_H;
    public static final int KEYCODE_HEADSETHOOK = android.view.KeyEvent.KEYCODE_HEADSETHOOK;
    public static final int KEYCODE_HELP = android.view.KeyEvent.KEYCODE_HELP;
    public static final int KEYCODE_HENKAN = android.view.KeyEvent.KEYCODE_HENKAN;
    public static final int KEYCODE_HOME = android.view.KeyEvent.KEYCODE_HOME;
    public static final int KEYCODE_I = android.view.KeyEvent.KEYCODE_I;
    public static final int KEYCODE_INFO = android.view.KeyEvent.KEYCODE_INFO;
    public static final int KEYCODE_INSERT = android.view.KeyEvent.KEYCODE_INSERT;
    public static final int KEYCODE_J = android.view.KeyEvent.KEYCODE_J;
    public static final int KEYCODE_K = android.view.KeyEvent.KEYCODE_K;
    public static final int KEYCODE_KANA = android.view.KeyEvent.KEYCODE_KANA;
    public static final int KEYCODE_KATAKANA_HIRAGANA = android.view.KeyEvent.KEYCODE_KATAKANA_HIRAGANA;
    public static final int KEYCODE_KEYBOARD_BACKLIGHT_DOWN = android.view.KeyEvent.KEYCODE_KEYBOARD_BACKLIGHT_DOWN;
    public static final int KEYCODE_KEYBOARD_BACKLIGHT_TOGGLE = android.view.KeyEvent.KEYCODE_KEYBOARD_BACKLIGHT_TOGGLE;
    public static final int KEYCODE_KEYBOARD_BACKLIGHT_UP = android.view.KeyEvent.KEYCODE_KEYBOARD_BACKLIGHT_UP;
    public static final int KEYCODE_L = android.view.KeyEvent.KEYCODE_L;
    public static final int KEYCODE_LANGUAGE_SWITCH = android.view.KeyEvent.KEYCODE_LANGUAGE_SWITCH;
    public static final int KEYCODE_LAST_CHANNEL = android.view.KeyEvent.KEYCODE_LAST_CHANNEL;
    public static final int KEYCODE_LEFT_BRACKET = android.view.KeyEvent.KEYCODE_LEFT_BRACKET;
    public static final int KEYCODE_M = android.view.KeyEvent.KEYCODE_M;
    public static final int KEYCODE_MACRO_1 = android.view.KeyEvent.KEYCODE_MACRO_1;
    public static final int KEYCODE_MACRO_2 = android.view.KeyEvent.KEYCODE_MACRO_2;
    public static final int KEYCODE_MACRO_3 = android.view.KeyEvent.KEYCODE_MACRO_3;
    public static final int KEYCODE_MACRO_4 = android.view.KeyEvent.KEYCODE_MACRO_4;
    public static final int KEYCODE_MANNER_MODE = android.view.KeyEvent.KEYCODE_MANNER_MODE;
    public static final int KEYCODE_MEDIA_AUDIO_TRACK = android.view.KeyEvent.KEYCODE_MEDIA_AUDIO_TRACK;
    public static final int KEYCODE_MEDIA_CLOSE = android.view.KeyEvent.KEYCODE_MEDIA_CLOSE;
    public static final int KEYCODE_MEDIA_EJECT = android.view.KeyEvent.KEYCODE_MEDIA_EJECT;
    public static final int KEYCODE_MEDIA_FAST_FORWARD = android.view.KeyEvent.KEYCODE_MEDIA_FAST_FORWARD;
    public static final int KEYCODE_MEDIA_NEXT = android.view.KeyEvent.KEYCODE_MEDIA_NEXT;
    public static final int KEYCODE_MEDIA_PAUSE = android.view.KeyEvent.KEYCODE_MEDIA_PAUSE;
    public static final int KEYCODE_MEDIA_PLAY = android.view.KeyEvent.KEYCODE_MEDIA_PLAY;
    public static final int KEYCODE_MEDIA_PLAY_PAUSE = android.view.KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE;
    public static final int KEYCODE_MEDIA_PREVIOUS = android.view.KeyEvent.KEYCODE_MEDIA_PREVIOUS;
    public static final int KEYCODE_MEDIA_RECORD = android.view.KeyEvent.KEYCODE_MEDIA_RECORD;
    public static final int KEYCODE_MEDIA_REWIND = android.view.KeyEvent.KEYCODE_MEDIA_REWIND;
    public static final int KEYCODE_MEDIA_SKIP_BACKWARD = android.view.KeyEvent.KEYCODE_MEDIA_SKIP_BACKWARD;
    public static final int KEYCODE_MEDIA_SKIP_FORWARD = android.view.KeyEvent.KEYCODE_MEDIA_SKIP_FORWARD;
    public static final int KEYCODE_MEDIA_STEP_BACKWARD = android.view.KeyEvent.KEYCODE_MEDIA_STEP_BACKWARD;
    public static final int KEYCODE_MEDIA_STEP_FORWARD = android.view.KeyEvent.KEYCODE_MEDIA_STEP_FORWARD;
    public static final int KEYCODE_MEDIA_STOP = android.view.KeyEvent.KEYCODE_MEDIA_STOP;
    public static final int KEYCODE_MEDIA_TOP_MENU = android.view.KeyEvent.KEYCODE_MEDIA_TOP_MENU;
    public static final int KEYCODE_MENU = android.view.KeyEvent.KEYCODE_MENU;
    public static final int KEYCODE_META_LEFT = android.view.KeyEvent.KEYCODE_META_LEFT;
    public static final int KEYCODE_META_RIGHT = android.view.KeyEvent.KEYCODE_META_RIGHT;
    public static final int KEYCODE_MINUS = android.view.KeyEvent.KEYCODE_MINUS;
    public static final int KEYCODE_MOVE_END = android.view.KeyEvent.KEYCODE_MOVE_END;
    public static final int KEYCODE_MOVE_HOME = android.view.KeyEvent.KEYCODE_MOVE_HOME;
    public static final int KEYCODE_MUHENKAN = android.view.KeyEvent.KEYCODE_MUHENKAN;
    public static final int KEYCODE_MUSIC = android.view.KeyEvent.KEYCODE_MUSIC;
    public static final int KEYCODE_MUTE = android.view.KeyEvent.KEYCODE_MUTE;
    public static final int KEYCODE_N = android.view.KeyEvent.KEYCODE_N;
    public static final int KEYCODE_NAVIGATE_IN = android.view.KeyEvent.KEYCODE_NAVIGATE_IN;
    public static final int KEYCODE_NAVIGATE_NEXT = android.view.KeyEvent.KEYCODE_NAVIGATE_NEXT;
    public static final int KEYCODE_NAVIGATE_OUT = android.view.KeyEvent.KEYCODE_NAVIGATE_OUT;
    public static final int KEYCODE_NAVIGATE_PREVIOUS = android.view.KeyEvent.KEYCODE_NAVIGATE_PREVIOUS;
    public static final int KEYCODE_NOTIFICATION = android.view.KeyEvent.KEYCODE_NOTIFICATION;
    public static final int KEYCODE_NUM = android.view.KeyEvent.KEYCODE_NUM;
    public static final int KEYCODE_NUMPAD_0 = android.view.KeyEvent.KEYCODE_NUMPAD_0;
    public static final int KEYCODE_NUMPAD_1 = android.view.KeyEvent.KEYCODE_NUMPAD_1;
    public static final int KEYCODE_NUMPAD_2 = android.view.KeyEvent.KEYCODE_NUMPAD_2;
    public static final int KEYCODE_NUMPAD_3 = android.view.KeyEvent.KEYCODE_NUMPAD_3;
    public static final int KEYCODE_NUMPAD_4 = android.view.KeyEvent.KEYCODE_NUMPAD_4;
    public static final int KEYCODE_NUMPAD_5 = android.view.KeyEvent.KEYCODE_NUMPAD_5;
    public static final int KEYCODE_NUMPAD_6 = android.view.KeyEvent.KEYCODE_NUMPAD_6;
    public static final int KEYCODE_NUMPAD_7 = android.view.KeyEvent.KEYCODE_NUMPAD_7;
    public static final int KEYCODE_NUMPAD_8 = android.view.KeyEvent.KEYCODE_NUMPAD_8;
    public static final int KEYCODE_NUMPAD_9 = android.view.KeyEvent.KEYCODE_NUMPAD_9;
    public static final int KEYCODE_NUMPAD_ADD = android.view.KeyEvent.KEYCODE_NUMPAD_ADD;
    public static final int KEYCODE_NUMPAD_COMMA = android.view.KeyEvent.KEYCODE_NUMPAD_COMMA;
    public static final int KEYCODE_NUMPAD_DIVIDE = android.view.KeyEvent.KEYCODE_NUMPAD_DIVIDE;
    public static final int KEYCODE_NUMPAD_DOT = android.view.KeyEvent.KEYCODE_NUMPAD_DOT;
    public static final int KEYCODE_NUMPAD_ENTER = android.view.KeyEvent.KEYCODE_NUMPAD_ENTER;
    public static final int KEYCODE_NUMPAD_EQUALS = android.view.KeyEvent.KEYCODE_NUMPAD_EQUALS;
    public static final int KEYCODE_NUMPAD_LEFT_PAREN = android.view.KeyEvent.KEYCODE_NUMPAD_LEFT_PAREN;
    public static final int KEYCODE_NUMPAD_MULTIPLY = android.view.KeyEvent.KEYCODE_NUMPAD_MULTIPLY;
    public static final int KEYCODE_NUMPAD_RIGHT_PAREN = android.view.KeyEvent.KEYCODE_NUMPAD_RIGHT_PAREN;
    public static final int KEYCODE_NUMPAD_SUBTRACT = android.view.KeyEvent.KEYCODE_NUMPAD_SUBTRACT;
    public static final int KEYCODE_NUM_LOCK = android.view.KeyEvent.KEYCODE_NUM_LOCK;
    public static final int KEYCODE_O = android.view.KeyEvent.KEYCODE_O;
    public static final int KEYCODE_P = android.view.KeyEvent.KEYCODE_P;
    public static final int KEYCODE_PAGE_DOWN = android.view.KeyEvent.KEYCODE_PAGE_DOWN;
    public static final int KEYCODE_PAGE_UP = android.view.KeyEvent.KEYCODE_PAGE_UP;
    public static final int KEYCODE_PAIRING = android.view.KeyEvent.KEYCODE_PAIRING;
    public static final int KEYCODE_PASTE = android.view.KeyEvent.KEYCODE_PASTE;
    public static final int KEYCODE_PERIOD = android.view.KeyEvent.KEYCODE_PERIOD;
    public static final int KEYCODE_PICTSYMBOLS = android.view.KeyEvent.KEYCODE_PICTSYMBOLS;
    public static final int KEYCODE_PLUS = android.view.KeyEvent.KEYCODE_PLUS;
    public static final int KEYCODE_POUND = android.view.KeyEvent.KEYCODE_POUND;
    public static final int KEYCODE_POWER = android.view.KeyEvent.KEYCODE_POWER;
    public static final int KEYCODE_PROG_BLUE = android.view.KeyEvent.KEYCODE_PROG_BLUE;
    public static final int KEYCODE_PROG_GREEN = android.view.KeyEvent.KEYCODE_PROG_GREEN;
    public static final int KEYCODE_PROG_RED = android.view.KeyEvent.KEYCODE_PROG_RED;
    public static final int KEYCODE_PROG_YELLOW = android.view.KeyEvent.KEYCODE_PROG_YELLOW;
    public static final int KEYCODE_Q = android.view.KeyEvent.KEYCODE_Q;
    public static final int KEYCODE_R = android.view.KeyEvent.KEYCODE_R;
    public static final int KEYCODE_RECENT_APPS = android.view.KeyEvent.KEYCODE_RECENT_APPS;
    public static final int KEYCODE_REFRESH = android.view.KeyEvent.KEYCODE_REFRESH;
    public static final int KEYCODE_RIGHT_BRACKET = android.view.KeyEvent.KEYCODE_RIGHT_BRACKET;
    public static final int KEYCODE_RO = android.view.KeyEvent.KEYCODE_RO;
    public static final int KEYCODE_S = android.view.KeyEvent.KEYCODE_S;
    public static final int KEYCODE_SCREENSHOT = android.view.KeyEvent.KEYCODE_SCREENSHOT;
    public static final int KEYCODE_SCROLL_LOCK = android.view.KeyEvent.KEYCODE_SCROLL_LOCK;
    public static final int KEYCODE_SEARCH = android.view.KeyEvent.KEYCODE_SEARCH;
    public static final int KEYCODE_SEMICOLON = android.view.KeyEvent.KEYCODE_SEMICOLON;
    public static final int KEYCODE_SETTINGS = android.view.KeyEvent.KEYCODE_SETTINGS;
    public static final int KEYCODE_SHIFT_LEFT = android.view.KeyEvent.KEYCODE_SHIFT_LEFT;
    public static final int KEYCODE_SHIFT_RIGHT = android.view.KeyEvent.KEYCODE_SHIFT_RIGHT;
    public static final int KEYCODE_SLASH = android.view.KeyEvent.KEYCODE_SLASH;
    public static final int KEYCODE_SLEEP = android.view.KeyEvent.KEYCODE_SLEEP;
    public static final int KEYCODE_SOFT_LEFT = android.view.KeyEvent.KEYCODE_SOFT_LEFT;
    public static final int KEYCODE_SOFT_RIGHT = android.view.KeyEvent.KEYCODE_SOFT_RIGHT;
    public static final int KEYCODE_SOFT_SLEEP = android.view.KeyEvent.KEYCODE_SOFT_SLEEP;
    public static final int KEYCODE_SPACE = android.view.KeyEvent.KEYCODE_SPACE;
    public static final int KEYCODE_STAR = android.view.KeyEvent.KEYCODE_STAR;
    public static final int KEYCODE_STB_INPUT = android.view.KeyEvent.KEYCODE_STB_INPUT;
    public static final int KEYCODE_STB_POWER = android.view.KeyEvent.KEYCODE_STB_POWER;
    public static final int KEYCODE_STEM_1 = android.view.KeyEvent.KEYCODE_STEM_1;
    public static final int KEYCODE_STEM_2 = android.view.KeyEvent.KEYCODE_STEM_2;
    public static final int KEYCODE_STEM_3 = android.view.KeyEvent.KEYCODE_STEM_3;
    public static final int KEYCODE_STEM_PRIMARY = android.view.KeyEvent.KEYCODE_STEM_PRIMARY;
    public static final int KEYCODE_STYLUS_BUTTON_PRIMARY = android.view.KeyEvent.KEYCODE_STYLUS_BUTTON_PRIMARY;
    public static final int KEYCODE_STYLUS_BUTTON_SECONDARY = android.view.KeyEvent.KEYCODE_STYLUS_BUTTON_SECONDARY;
    public static final int KEYCODE_STYLUS_BUTTON_TAIL = android.view.KeyEvent.KEYCODE_STYLUS_BUTTON_TAIL;
    public static final int KEYCODE_STYLUS_BUTTON_TERTIARY = android.view.KeyEvent.KEYCODE_STYLUS_BUTTON_TERTIARY;
    public static final int KEYCODE_SWITCH_CHARSET = android.view.KeyEvent.KEYCODE_SWITCH_CHARSET;
    public static final int KEYCODE_SYM = android.view.KeyEvent.KEYCODE_SYM;
    public static final int KEYCODE_SYSRQ = android.view.KeyEvent.KEYCODE_SYSRQ;
    public static final int KEYCODE_SYSTEM_NAVIGATION_DOWN = android.view.KeyEvent.KEYCODE_SYSTEM_NAVIGATION_DOWN;
    public static final int KEYCODE_SYSTEM_NAVIGATION_LEFT = android.view.KeyEvent.KEYCODE_SYSTEM_NAVIGATION_LEFT;
    public static final int KEYCODE_SYSTEM_NAVIGATION_RIGHT = android.view.KeyEvent.KEYCODE_SYSTEM_NAVIGATION_RIGHT;
    public static final int KEYCODE_SYSTEM_NAVIGATION_UP = android.view.KeyEvent.KEYCODE_SYSTEM_NAVIGATION_UP;
    public static final int KEYCODE_T = android.view.KeyEvent.KEYCODE_T;
    public static final int KEYCODE_TAB = android.view.KeyEvent.KEYCODE_TAB;
    public static final int KEYCODE_THUMBS_DOWN = android.view.KeyEvent.KEYCODE_THUMBS_DOWN;
    public static final int KEYCODE_THUMBS_UP = android.view.KeyEvent.KEYCODE_THUMBS_UP;
    public static final int KEYCODE_TV = android.view.KeyEvent.KEYCODE_TV;
    public static final int KEYCODE_TV_ANTENNA_CABLE = android.view.KeyEvent.KEYCODE_TV_ANTENNA_CABLE;
    public static final int KEYCODE_TV_AUDIO_DESCRIPTION = android.view.KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION;
    public static final int KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN = android.view.KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION_MIX_DOWN;
    public static final int KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP = android.view.KeyEvent.KEYCODE_TV_AUDIO_DESCRIPTION_MIX_UP;
    public static final int KEYCODE_TV_CONTENTS_MENU = android.view.KeyEvent.KEYCODE_TV_CONTENTS_MENU;
    public static final int KEYCODE_TV_DATA_SERVICE = android.view.KeyEvent.KEYCODE_TV_DATA_SERVICE;
    public static final int KEYCODE_TV_INPUT = android.view.KeyEvent.KEYCODE_TV_INPUT;
    public static final int KEYCODE_TV_INPUT_COMPONENT_1 = android.view.KeyEvent.KEYCODE_TV_INPUT_COMPONENT_1;
    public static final int KEYCODE_TV_INPUT_COMPONENT_2 = android.view.KeyEvent.KEYCODE_TV_INPUT_COMPONENT_2;
    public static final int KEYCODE_TV_INPUT_COMPOSITE_1 = android.view.KeyEvent.KEYCODE_TV_INPUT_COMPOSITE_1;
    public static final int KEYCODE_TV_INPUT_COMPOSITE_2 = android.view.KeyEvent.KEYCODE_TV_INPUT_COMPOSITE_2;
    public static final int KEYCODE_TV_INPUT_HDMI_1 = android.view.KeyEvent.KEYCODE_TV_INPUT_HDMI_1;
    public static final int KEYCODE_TV_INPUT_HDMI_2 = android.view.KeyEvent.KEYCODE_TV_INPUT_HDMI_2;
    public static final int KEYCODE_TV_INPUT_HDMI_3 = android.view.KeyEvent.KEYCODE_TV_INPUT_HDMI_3;
    public static final int KEYCODE_TV_INPUT_HDMI_4 = android.view.KeyEvent.KEYCODE_TV_INPUT_HDMI_4;
    public static final int KEYCODE_TV_INPUT_VGA_1 = android.view.KeyEvent.KEYCODE_TV_INPUT_VGA_1;
    public static final int KEYCODE_TV_MEDIA_CONTEXT_MENU = android.view.KeyEvent.KEYCODE_TV_MEDIA_CONTEXT_MENU;
    public static final int KEYCODE_TV_NUMBER_ENTRY = android.view.KeyEvent.KEYCODE_TV_NUMBER_ENTRY;
    public static final int KEYCODE_TV_POWER = android.view.KeyEvent.KEYCODE_TV_POWER;
    public static final int KEYCODE_TV_RADIO_SERVICE = android.view.KeyEvent.KEYCODE_TV_RADIO_SERVICE;
    public static final int KEYCODE_TV_SATELLITE = android.view.KeyEvent.KEYCODE_TV_SATELLITE;
    public static final int KEYCODE_TV_SATELLITE_BS = android.view.KeyEvent.KEYCODE_TV_SATELLITE_BS;
    public static final int KEYCODE_TV_SATELLITE_CS = android.view.KeyEvent.KEYCODE_TV_SATELLITE_CS;
    public static final int KEYCODE_TV_SATELLITE_SERVICE = android.view.KeyEvent.KEYCODE_TV_SATELLITE_SERVICE;
    public static final int KEYCODE_TV_TELETEXT = android.view.KeyEvent.KEYCODE_TV_TELETEXT;
    public static final int KEYCODE_TV_TERRESTRIAL_ANALOG = android.view.KeyEvent.KEYCODE_TV_TERRESTRIAL_ANALOG;
    public static final int KEYCODE_TV_TERRESTRIAL_DIGITAL = android.view.KeyEvent.KEYCODE_TV_TERRESTRIAL_DIGITAL;
    public static final int KEYCODE_TV_TIMER_PROGRAMMING = android.view.KeyEvent.KEYCODE_TV_TIMER_PROGRAMMING;
    public static final int KEYCODE_TV_ZOOM_MODE = android.view.KeyEvent.KEYCODE_TV_ZOOM_MODE;
    public static final int KEYCODE_U = android.view.KeyEvent.KEYCODE_U;
    public static final int KEYCODE_UNKNOWN = android.view.KeyEvent.KEYCODE_UNKNOWN;
    public static final int KEYCODE_V = android.view.KeyEvent.KEYCODE_V;
    public static final int KEYCODE_VIDEO_APP_1 = android.view.KeyEvent.KEYCODE_VIDEO_APP_1;
    public static final int KEYCODE_VIDEO_APP_2 = android.view.KeyEvent.KEYCODE_VIDEO_APP_2;
    public static final int KEYCODE_VIDEO_APP_3 = android.view.KeyEvent.KEYCODE_VIDEO_APP_3;
    public static final int KEYCODE_VIDEO_APP_4 = android.view.KeyEvent.KEYCODE_VIDEO_APP_4;
    public static final int KEYCODE_VIDEO_APP_5 = android.view.KeyEvent.KEYCODE_VIDEO_APP_5;
    public static final int KEYCODE_VIDEO_APP_6 = android.view.KeyEvent.KEYCODE_VIDEO_APP_6;
    public static final int KEYCODE_VIDEO_APP_7 = android.view.KeyEvent.KEYCODE_VIDEO_APP_7;
    public static final int KEYCODE_VIDEO_APP_8 = android.view.KeyEvent.KEYCODE_VIDEO_APP_8;
    public static final int KEYCODE_VOICE_ASSIST = android.view.KeyEvent.KEYCODE_VOICE_ASSIST;
    public static final int KEYCODE_VOLUME_DOWN = android.view.KeyEvent.KEYCODE_VOLUME_DOWN;
    public static final int KEYCODE_VOLUME_MUTE = android.view.KeyEvent.KEYCODE_VOLUME_MUTE;
    public static final int KEYCODE_VOLUME_UP = android.view.KeyEvent.KEYCODE_VOLUME_UP;
    public static final int KEYCODE_W = android.view.KeyEvent.KEYCODE_W;
    public static final int KEYCODE_WAKEUP = android.view.KeyEvent.KEYCODE_WAKEUP;
    public static final int KEYCODE_WINDOW = android.view.KeyEvent.KEYCODE_WINDOW;
    public static final int KEYCODE_X = android.view.KeyEvent.KEYCODE_X;
    public static final int KEYCODE_Y = android.view.KeyEvent.KEYCODE_Y;
    public static final int KEYCODE_YEN = android.view.KeyEvent.KEYCODE_YEN;
    public static final int KEYCODE_Z = android.view.KeyEvent.KEYCODE_Z;
    public static final int KEYCODE_ZENKAKU_HANKAKU = android.view.KeyEvent.KEYCODE_ZENKAKU_HANKAKU;
    public static final int KEYCODE_ZOOM_IN = android.view.KeyEvent.KEYCODE_ZOOM_IN;
    public static final int KEYCODE_ZOOM_OUT = android.view.KeyEvent.KEYCODE_ZOOM_OUT;
    public static final int MAX_KEYCODE = android.view.KeyEvent.MAX_KEYCODE;
    public static final int META_ALT_LEFT_ON = android.view.KeyEvent.META_ALT_LEFT_ON;
    public static final int META_ALT_MASK = android.view.KeyEvent.META_ALT_MASK;
    public static final int META_ALT_ON = android.view.KeyEvent.META_ALT_ON;
    public static final int META_ALT_RIGHT_ON = android.view.KeyEvent.META_ALT_RIGHT_ON;
    public static final int META_CAPS_LOCK_ON = android.view.KeyEvent.META_CAPS_LOCK_ON;
    public static final int META_CTRL_LEFT_ON = android.view.KeyEvent.META_CTRL_LEFT_ON;
    public static final int META_CTRL_MASK = android.view.KeyEvent.META_CTRL_MASK;
    public static final int META_CTRL_ON = android.view.KeyEvent.META_CTRL_ON;
    public static final int META_CTRL_RIGHT_ON = android.view.KeyEvent.META_CTRL_RIGHT_ON;
    public static final int META_FUNCTION_ON = android.view.KeyEvent.META_FUNCTION_ON;
    public static final int META_META_LEFT_ON = android.view.KeyEvent.META_META_LEFT_ON;
    public static final int META_META_MASK = android.view.KeyEvent.META_META_MASK;
    public static final int META_META_ON = android.view.KeyEvent.META_META_ON;
    public static final int META_META_RIGHT_ON = android.view.KeyEvent.META_META_RIGHT_ON;
    public static final int META_NUM_LOCK_ON = android.view.KeyEvent.META_NUM_LOCK_ON;
    public static final int META_SCROLL_LOCK_ON = android.view.KeyEvent.META_SCROLL_LOCK_ON;
    public static final int META_SHIFT_LEFT_ON = android.view.KeyEvent.META_SHIFT_LEFT_ON;
    public static final int META_SHIFT_MASK = android.view.KeyEvent.META_SHIFT_MASK;
    public static final int META_SHIFT_ON = android.view.KeyEvent.META_SHIFT_ON;
    public static final int META_SHIFT_RIGHT_ON = android.view.KeyEvent.META_SHIFT_RIGHT_ON;
    public static final int META_SYM_ON = android.view.KeyEvent.META_SYM_ON;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.KeyEvent.Callback wrap(android.view.KeyEvent.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyEvent.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.view.KeyEvent.Callback getReal() {
            return (android.view.KeyEvent.Callback) real;
        }

        public android.view.KeyEvent.Callback unwrap() {
            return getReal();
        }

        public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.view.KeyEvent.Callback) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.view.KeyEvent.Callback) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return ((android.view.KeyEvent.Callback) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.view.KeyEvent.Callback) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class DispatcherState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DispatcherState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState wrap(android.view.KeyEvent.DispatcherState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.KeyEvent.DispatcherState(real, (__DcgwBridgeToken) null);
        }

        public android.view.KeyEvent.DispatcherState getReal() {
            return (android.view.KeyEvent.DispatcherState) real;
        }

        public android.view.KeyEvent.DispatcherState unwrap() {
            return getReal();
        }

        public DispatcherState() {
            this(new android.view.KeyEvent.DispatcherState(), (__DcgwBridgeToken) null);
        }

        public void handleUpEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            ((android.view.KeyEvent.DispatcherState) real).handleUpEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean isTracking(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            return ((android.view.KeyEvent.DispatcherState) real).isTracking(arg0 == null ? null : arg0.getReal());
        }

        public void performedLongPress(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
            ((android.view.KeyEvent.DispatcherState) real).performedLongPress(arg0 == null ? null : arg0.getReal());
        }

        public void reset() {
            ((android.view.KeyEvent.DispatcherState) real).reset();
        }

        public void reset(java.lang.Object arg0) {
            ((android.view.KeyEvent.DispatcherState) real).reset(arg0);
        }

        public void startTracking(com.micklab.dcg.wrapper.android.view.KeyEvent arg0, java.lang.Object arg1) {
            ((android.view.KeyEvent.DispatcherState) real).startTracking(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
