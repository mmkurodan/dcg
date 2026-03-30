// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class MotionEvent {
    private final android.view.MotionEvent real;

    public MotionEvent(android.view.MotionEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent wrap(android.view.MotionEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.MotionEvent(real);
    }

    public android.view.MotionEvent unwrap() {
        return real;
    }

    public static java.lang.String actionToString(int arg0) {
        return android.view.MotionEvent.actionToString(arg0);
    }

    public void addBatch(long arg0, android.view.MotionEvent.PointerCoords[] arg1, int arg2) {
        real.addBatch(arg0, arg1, arg2);
    }

    public void addBatch(long arg0, float arg1, float arg2, float arg3, float arg4, int arg5) {
        real.addBatch(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int axisFromString(java.lang.String arg0) {
        return android.view.MotionEvent.axisFromString(arg0);
    }

    public static java.lang.String axisToString(int arg0) {
        return android.view.MotionEvent.axisToString(arg0);
    }

    public int findPointerIndex(int arg0) {
        return real.findPointerIndex(arg0);
    }

    public int getAction() {
        return real.getAction();
    }

    public int getActionButton() {
        return real.getActionButton();
    }

    public int getActionIndex() {
        return real.getActionIndex();
    }

    public int getActionMasked() {
        return real.getActionMasked();
    }

    public float getAxisValue(int arg0) {
        return real.getAxisValue(arg0);
    }

    public float getAxisValue(int arg0, int arg1) {
        return real.getAxisValue(arg0, arg1);
    }

    public int getButtonState() {
        return real.getButtonState();
    }

    public int getClassification() {
        return real.getClassification();
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public long getDownTime() {
        return real.getDownTime();
    }

    public int getEdgeFlags() {
        return real.getEdgeFlags();
    }

    public long getEventTime() {
        return real.getEventTime();
    }

    public long getEventTimeNanos() {
        return real.getEventTimeNanos();
    }

    public int getFlags() {
        return real.getFlags();
    }

    public float getHistoricalAxisValue(int arg0, int arg1) {
        return real.getHistoricalAxisValue(arg0, arg1);
    }

    public float getHistoricalAxisValue(int arg0, int arg1, int arg2) {
        return real.getHistoricalAxisValue(arg0, arg1, arg2);
    }

    public long getHistoricalEventTime(int arg0) {
        return real.getHistoricalEventTime(arg0);
    }

    public long getHistoricalEventTimeNanos(int arg0) {
        return real.getHistoricalEventTimeNanos(arg0);
    }

    public float getHistoricalOrientation(int arg0) {
        return real.getHistoricalOrientation(arg0);
    }

    public float getHistoricalOrientation(int arg0, int arg1) {
        return real.getHistoricalOrientation(arg0, arg1);
    }

    public void getHistoricalPointerCoords(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.MotionEvent.PointerCoords arg2) {
        real.getHistoricalPointerCoords(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public float getHistoricalPressure(int arg0) {
        return real.getHistoricalPressure(arg0);
    }

    public float getHistoricalPressure(int arg0, int arg1) {
        return real.getHistoricalPressure(arg0, arg1);
    }

    public float getHistoricalSize(int arg0) {
        return real.getHistoricalSize(arg0);
    }

    public float getHistoricalSize(int arg0, int arg1) {
        return real.getHistoricalSize(arg0, arg1);
    }

    public float getHistoricalToolMajor(int arg0) {
        return real.getHistoricalToolMajor(arg0);
    }

    public float getHistoricalToolMajor(int arg0, int arg1) {
        return real.getHistoricalToolMajor(arg0, arg1);
    }

    public float getHistoricalToolMinor(int arg0) {
        return real.getHistoricalToolMinor(arg0);
    }

    public float getHistoricalToolMinor(int arg0, int arg1) {
        return real.getHistoricalToolMinor(arg0, arg1);
    }

    public float getHistoricalTouchMajor(int arg0) {
        return real.getHistoricalTouchMajor(arg0);
    }

    public float getHistoricalTouchMajor(int arg0, int arg1) {
        return real.getHistoricalTouchMajor(arg0, arg1);
    }

    public float getHistoricalTouchMinor(int arg0) {
        return real.getHistoricalTouchMinor(arg0);
    }

    public float getHistoricalTouchMinor(int arg0, int arg1) {
        return real.getHistoricalTouchMinor(arg0, arg1);
    }

    public float getHistoricalX(int arg0) {
        return real.getHistoricalX(arg0);
    }

    public float getHistoricalX(int arg0, int arg1) {
        return real.getHistoricalX(arg0, arg1);
    }

    public float getHistoricalY(int arg0) {
        return real.getHistoricalY(arg0);
    }

    public float getHistoricalY(int arg0, int arg1) {
        return real.getHistoricalY(arg0, arg1);
    }

    public int getHistorySize() {
        return real.getHistorySize();
    }

    public int getMetaState() {
        return real.getMetaState();
    }

    public float getOrientation() {
        return real.getOrientation();
    }

    public float getOrientation(int arg0) {
        return real.getOrientation(arg0);
    }

    public void getPointerCoords(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent.PointerCoords arg1) {
        real.getPointerCoords(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int getPointerCount() {
        return real.getPointerCount();
    }

    public int getPointerId(int arg0) {
        return real.getPointerId(arg0);
    }

    public void getPointerProperties(int arg0, com.micklab.dcg.wrapper.android.view.MotionEvent.PointerProperties arg1) {
        real.getPointerProperties(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public float getPressure() {
        return real.getPressure();
    }

    public float getPressure(int arg0) {
        return real.getPressure(arg0);
    }

    public float getRawX() {
        return real.getRawX();
    }

    public float getRawX(int arg0) {
        return real.getRawX(arg0);
    }

    public float getRawY() {
        return real.getRawY();
    }

    public float getRawY(int arg0) {
        return real.getRawY(arg0);
    }

    public float getSize() {
        return real.getSize();
    }

    public float getSize(int arg0) {
        return real.getSize(arg0);
    }

    public int getSource() {
        return real.getSource();
    }

    public float getToolMajor() {
        return real.getToolMajor();
    }

    public float getToolMajor(int arg0) {
        return real.getToolMajor(arg0);
    }

    public float getToolMinor() {
        return real.getToolMinor();
    }

    public float getToolMinor(int arg0) {
        return real.getToolMinor(arg0);
    }

    public int getToolType(int arg0) {
        return real.getToolType(arg0);
    }

    public float getTouchMajor() {
        return real.getTouchMajor();
    }

    public float getTouchMajor(int arg0) {
        return real.getTouchMajor(arg0);
    }

    public float getTouchMinor() {
        return real.getTouchMinor();
    }

    public float getTouchMinor(int arg0) {
        return real.getTouchMinor(arg0);
    }

    public float getX() {
        return real.getX();
    }

    public float getX(int arg0) {
        return real.getX(arg0);
    }

    public float getXPrecision() {
        return real.getXPrecision();
    }

    public float getY() {
        return real.getY();
    }

    public float getY(int arg0) {
        return real.getY(arg0);
    }

    public float getYPrecision() {
        return real.getYPrecision();
    }

    public boolean isButtonPressed(int arg0) {
        return real.isButtonPressed(arg0);
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtain(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtain(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtain(long arg0, long arg1, int arg2, float arg3, float arg4, int arg5) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtain(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtain(long arg0, long arg1, int arg2, float arg3, float arg4, float arg5, float arg6, int arg7, float arg8, float arg9, int arg10, int arg11) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtain(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11));
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtain(long arg0, long arg1, int arg2, int arg3, int[] arg4, android.view.MotionEvent.PointerCoords[] arg5, int arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtain(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12));
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtain(long arg0, long arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, int arg8, float arg9, float arg10, int arg11, int arg12) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtain(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12));
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtain(long arg0, long arg1, int arg2, int arg3, android.view.MotionEvent.PointerProperties[] arg4, android.view.MotionEvent.PointerCoords[] arg5, int arg6, int arg7, float arg8, float arg9, int arg10, int arg11, int arg12, int arg13) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtain(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13));
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtain(long arg0, long arg1, int arg2, int arg3, android.view.MotionEvent.PointerProperties[] arg4, android.view.MotionEvent.PointerCoords[] arg5, int arg6, int arg7, float arg8, float arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtain(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15));
    }

    public static com.micklab.dcg.wrapper.android.view.MotionEvent obtainNoHistory(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(android.view.MotionEvent.obtainNoHistory(arg0 == null ? null : arg0.unwrap()));
    }

    public void offsetLocation(float arg0, float arg1) {
        real.offsetLocation(arg0, arg1);
    }

    public void recycle() {
        real.recycle();
    }

    public void setAction(int arg0) {
        real.setAction(arg0);
    }

    public void setEdgeFlags(int arg0) {
        real.setEdgeFlags(arg0);
    }

    public void setLocation(float arg0, float arg1) {
        real.setLocation(arg0, arg1);
    }

    public void setSource(int arg0) {
        real.setSource(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void transform(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.transform(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ACTION_BUTTON_PRESS = android.view.MotionEvent.ACTION_BUTTON_PRESS;
    public static final int ACTION_BUTTON_RELEASE = android.view.MotionEvent.ACTION_BUTTON_RELEASE;
    public static final int ACTION_CANCEL = android.view.MotionEvent.ACTION_CANCEL;
    public static final int ACTION_DOWN = android.view.MotionEvent.ACTION_DOWN;
    public static final int ACTION_HOVER_ENTER = android.view.MotionEvent.ACTION_HOVER_ENTER;
    public static final int ACTION_HOVER_EXIT = android.view.MotionEvent.ACTION_HOVER_EXIT;
    public static final int ACTION_HOVER_MOVE = android.view.MotionEvent.ACTION_HOVER_MOVE;
    public static final int ACTION_MASK = android.view.MotionEvent.ACTION_MASK;
    public static final int ACTION_MOVE = android.view.MotionEvent.ACTION_MOVE;
    public static final int ACTION_OUTSIDE = android.view.MotionEvent.ACTION_OUTSIDE;
    public static final int ACTION_POINTER_1_DOWN = android.view.MotionEvent.ACTION_POINTER_1_DOWN;
    public static final int ACTION_POINTER_1_UP = android.view.MotionEvent.ACTION_POINTER_1_UP;
    public static final int ACTION_POINTER_2_DOWN = android.view.MotionEvent.ACTION_POINTER_2_DOWN;
    public static final int ACTION_POINTER_2_UP = android.view.MotionEvent.ACTION_POINTER_2_UP;
    public static final int ACTION_POINTER_3_DOWN = android.view.MotionEvent.ACTION_POINTER_3_DOWN;
    public static final int ACTION_POINTER_3_UP = android.view.MotionEvent.ACTION_POINTER_3_UP;
    public static final int ACTION_POINTER_DOWN = android.view.MotionEvent.ACTION_POINTER_DOWN;
    public static final int ACTION_POINTER_ID_MASK = android.view.MotionEvent.ACTION_POINTER_ID_MASK;
    public static final int ACTION_POINTER_ID_SHIFT = android.view.MotionEvent.ACTION_POINTER_ID_SHIFT;
    public static final int ACTION_POINTER_INDEX_MASK = android.view.MotionEvent.ACTION_POINTER_INDEX_MASK;
    public static final int ACTION_POINTER_INDEX_SHIFT = android.view.MotionEvent.ACTION_POINTER_INDEX_SHIFT;
    public static final int ACTION_POINTER_UP = android.view.MotionEvent.ACTION_POINTER_UP;
    public static final int ACTION_SCROLL = android.view.MotionEvent.ACTION_SCROLL;
    public static final int ACTION_UP = android.view.MotionEvent.ACTION_UP;
    public static final int AXIS_BRAKE = android.view.MotionEvent.AXIS_BRAKE;
    public static final int AXIS_DISTANCE = android.view.MotionEvent.AXIS_DISTANCE;
    public static final int AXIS_GAS = android.view.MotionEvent.AXIS_GAS;
    public static final int AXIS_GENERIC_1 = android.view.MotionEvent.AXIS_GENERIC_1;
    public static final int AXIS_GENERIC_10 = android.view.MotionEvent.AXIS_GENERIC_10;
    public static final int AXIS_GENERIC_11 = android.view.MotionEvent.AXIS_GENERIC_11;
    public static final int AXIS_GENERIC_12 = android.view.MotionEvent.AXIS_GENERIC_12;
    public static final int AXIS_GENERIC_13 = android.view.MotionEvent.AXIS_GENERIC_13;
    public static final int AXIS_GENERIC_14 = android.view.MotionEvent.AXIS_GENERIC_14;
    public static final int AXIS_GENERIC_15 = android.view.MotionEvent.AXIS_GENERIC_15;
    public static final int AXIS_GENERIC_16 = android.view.MotionEvent.AXIS_GENERIC_16;
    public static final int AXIS_GENERIC_2 = android.view.MotionEvent.AXIS_GENERIC_2;
    public static final int AXIS_GENERIC_3 = android.view.MotionEvent.AXIS_GENERIC_3;
    public static final int AXIS_GENERIC_4 = android.view.MotionEvent.AXIS_GENERIC_4;
    public static final int AXIS_GENERIC_5 = android.view.MotionEvent.AXIS_GENERIC_5;
    public static final int AXIS_GENERIC_6 = android.view.MotionEvent.AXIS_GENERIC_6;
    public static final int AXIS_GENERIC_7 = android.view.MotionEvent.AXIS_GENERIC_7;
    public static final int AXIS_GENERIC_8 = android.view.MotionEvent.AXIS_GENERIC_8;
    public static final int AXIS_GENERIC_9 = android.view.MotionEvent.AXIS_GENERIC_9;
    public static final int AXIS_GESTURE_PINCH_SCALE_FACTOR = android.view.MotionEvent.AXIS_GESTURE_PINCH_SCALE_FACTOR;
    public static final int AXIS_GESTURE_SCROLL_X_DISTANCE = android.view.MotionEvent.AXIS_GESTURE_SCROLL_X_DISTANCE;
    public static final int AXIS_GESTURE_SCROLL_Y_DISTANCE = android.view.MotionEvent.AXIS_GESTURE_SCROLL_Y_DISTANCE;
    public static final int AXIS_GESTURE_X_OFFSET = android.view.MotionEvent.AXIS_GESTURE_X_OFFSET;
    public static final int AXIS_GESTURE_Y_OFFSET = android.view.MotionEvent.AXIS_GESTURE_Y_OFFSET;
    public static final int AXIS_HAT_X = android.view.MotionEvent.AXIS_HAT_X;
    public static final int AXIS_HAT_Y = android.view.MotionEvent.AXIS_HAT_Y;
    public static final int AXIS_HSCROLL = android.view.MotionEvent.AXIS_HSCROLL;
    public static final int AXIS_LTRIGGER = android.view.MotionEvent.AXIS_LTRIGGER;
    public static final int AXIS_ORIENTATION = android.view.MotionEvent.AXIS_ORIENTATION;
    public static final int AXIS_PRESSURE = android.view.MotionEvent.AXIS_PRESSURE;
    public static final int AXIS_RELATIVE_X = android.view.MotionEvent.AXIS_RELATIVE_X;
    public static final int AXIS_RELATIVE_Y = android.view.MotionEvent.AXIS_RELATIVE_Y;
    public static final int AXIS_RTRIGGER = android.view.MotionEvent.AXIS_RTRIGGER;
    public static final int AXIS_RUDDER = android.view.MotionEvent.AXIS_RUDDER;
    public static final int AXIS_RX = android.view.MotionEvent.AXIS_RX;
    public static final int AXIS_RY = android.view.MotionEvent.AXIS_RY;
    public static final int AXIS_RZ = android.view.MotionEvent.AXIS_RZ;
    public static final int AXIS_SCROLL = android.view.MotionEvent.AXIS_SCROLL;
    public static final int AXIS_SIZE = android.view.MotionEvent.AXIS_SIZE;
    public static final int AXIS_THROTTLE = android.view.MotionEvent.AXIS_THROTTLE;
    public static final int AXIS_TILT = android.view.MotionEvent.AXIS_TILT;
    public static final int AXIS_TOOL_MAJOR = android.view.MotionEvent.AXIS_TOOL_MAJOR;
    public static final int AXIS_TOOL_MINOR = android.view.MotionEvent.AXIS_TOOL_MINOR;
    public static final int AXIS_TOUCH_MAJOR = android.view.MotionEvent.AXIS_TOUCH_MAJOR;
    public static final int AXIS_TOUCH_MINOR = android.view.MotionEvent.AXIS_TOUCH_MINOR;
    public static final int AXIS_VSCROLL = android.view.MotionEvent.AXIS_VSCROLL;
    public static final int AXIS_WHEEL = android.view.MotionEvent.AXIS_WHEEL;
    public static final int AXIS_X = android.view.MotionEvent.AXIS_X;
    public static final int AXIS_Y = android.view.MotionEvent.AXIS_Y;
    public static final int AXIS_Z = android.view.MotionEvent.AXIS_Z;
    public static final int BUTTON_BACK = android.view.MotionEvent.BUTTON_BACK;
    public static final int BUTTON_FORWARD = android.view.MotionEvent.BUTTON_FORWARD;
    public static final int BUTTON_PRIMARY = android.view.MotionEvent.BUTTON_PRIMARY;
    public static final int BUTTON_SECONDARY = android.view.MotionEvent.BUTTON_SECONDARY;
    public static final int BUTTON_STYLUS_PRIMARY = android.view.MotionEvent.BUTTON_STYLUS_PRIMARY;
    public static final int BUTTON_STYLUS_SECONDARY = android.view.MotionEvent.BUTTON_STYLUS_SECONDARY;
    public static final int BUTTON_TERTIARY = android.view.MotionEvent.BUTTON_TERTIARY;
    public static final int CLASSIFICATION_AMBIGUOUS_GESTURE = android.view.MotionEvent.CLASSIFICATION_AMBIGUOUS_GESTURE;
    public static final int CLASSIFICATION_DEEP_PRESS = android.view.MotionEvent.CLASSIFICATION_DEEP_PRESS;
    public static final int CLASSIFICATION_NONE = android.view.MotionEvent.CLASSIFICATION_NONE;
    public static final int CLASSIFICATION_PINCH = android.view.MotionEvent.CLASSIFICATION_PINCH;
    public static final int CLASSIFICATION_TWO_FINGER_SWIPE = android.view.MotionEvent.CLASSIFICATION_TWO_FINGER_SWIPE;
    public static final int EDGE_BOTTOM = android.view.MotionEvent.EDGE_BOTTOM;
    public static final int EDGE_LEFT = android.view.MotionEvent.EDGE_LEFT;
    public static final int EDGE_RIGHT = android.view.MotionEvent.EDGE_RIGHT;
    public static final int EDGE_TOP = android.view.MotionEvent.EDGE_TOP;
    public static final int FLAG_CANCELED = android.view.MotionEvent.FLAG_CANCELED;
    public static final int FLAG_WINDOW_IS_OBSCURED = android.view.MotionEvent.FLAG_WINDOW_IS_OBSCURED;
    public static final int FLAG_WINDOW_IS_PARTIALLY_OBSCURED = android.view.MotionEvent.FLAG_WINDOW_IS_PARTIALLY_OBSCURED;
    public static final int INVALID_POINTER_ID = android.view.MotionEvent.INVALID_POINTER_ID;
    public static final int TOOL_TYPE_ERASER = android.view.MotionEvent.TOOL_TYPE_ERASER;
    public static final int TOOL_TYPE_FINGER = android.view.MotionEvent.TOOL_TYPE_FINGER;
    public static final int TOOL_TYPE_MOUSE = android.view.MotionEvent.TOOL_TYPE_MOUSE;
    public static final int TOOL_TYPE_STYLUS = android.view.MotionEvent.TOOL_TYPE_STYLUS;
    public static final int TOOL_TYPE_UNKNOWN = android.view.MotionEvent.TOOL_TYPE_UNKNOWN;

    public static final class PointerCoords {
        private final android.view.MotionEvent.PointerCoords real;

        public PointerCoords(android.view.MotionEvent.PointerCoords real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.MotionEvent.PointerCoords wrap(android.view.MotionEvent.PointerCoords real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.MotionEvent.PointerCoords(real);
        }

        public android.view.MotionEvent.PointerCoords unwrap() {
            return real;
        }

        public PointerCoords() {
            this(new android.view.MotionEvent.PointerCoords());
        }

        public PointerCoords(com.micklab.dcg.wrapper.android.view.MotionEvent.PointerCoords arg0) {
            this(new android.view.MotionEvent.PointerCoords(arg0 == null ? null : arg0.unwrap()));
        }

        public void clear() {
            real.clear();
        }

        public void copyFrom(com.micklab.dcg.wrapper.android.view.MotionEvent.PointerCoords arg0) {
            real.copyFrom(arg0 == null ? null : arg0.unwrap());
        }

        public float getAxisValue(int arg0) {
            return real.getAxisValue(arg0);
        }

        public boolean isResampled() {
            return real.isResampled();
        }

        public void setAxisValue(int arg0, float arg1) {
            real.setAxisValue(arg0, arg1);
        }


    }
    public static final class PointerProperties {
        private final android.view.MotionEvent.PointerProperties real;

        public PointerProperties(android.view.MotionEvent.PointerProperties real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.MotionEvent.PointerProperties wrap(android.view.MotionEvent.PointerProperties real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.MotionEvent.PointerProperties(real);
        }

        public android.view.MotionEvent.PointerProperties unwrap() {
            return real;
        }

        public PointerProperties() {
            this(new android.view.MotionEvent.PointerProperties());
        }

        public PointerProperties(com.micklab.dcg.wrapper.android.view.MotionEvent.PointerProperties arg0) {
            this(new android.view.MotionEvent.PointerProperties(arg0 == null ? null : arg0.unwrap()));
        }

        public void clear() {
            real.clear();
        }

        public void copyFrom(com.micklab.dcg.wrapper.android.view.MotionEvent.PointerProperties arg0) {
            real.copyFrom(arg0 == null ? null : arg0.unwrap());
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }


    }
}
