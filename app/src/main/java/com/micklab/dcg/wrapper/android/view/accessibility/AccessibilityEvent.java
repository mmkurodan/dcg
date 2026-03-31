// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.accessibility;

public final class AccessibilityEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent wrap(android.view.accessibility.AccessibilityEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.accessibility.AccessibilityEvent getReal() {
        return (android.view.accessibility.AccessibilityEvent) real;
    }

    public android.view.accessibility.AccessibilityEvent unwrap() {
        return getReal();
    }

    public AccessibilityEvent() {
        this(new android.view.accessibility.AccessibilityEvent(), (__DcgwBridgeToken) null);
    }

    public AccessibilityEvent(int arg0) {
        this(new android.view.accessibility.AccessibilityEvent(arg0), (__DcgwBridgeToken) null);
    }

    public AccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        this(new android.view.accessibility.AccessibilityEvent(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void appendRecord(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).appendRecord(arg0 == null ? null : arg0.getReal());
    }

    public int describeContents() {
        return ((android.view.accessibility.AccessibilityEvent) real).describeContents();
    }

    public static java.lang.String eventTypeToString(int arg0) {
        return android.view.accessibility.AccessibilityEvent.eventTypeToString(arg0);
    }

    public int getAction() {
        return ((android.view.accessibility.AccessibilityEvent) real).getAction();
    }

    public int getContentChangeTypes() {
        return ((android.view.accessibility.AccessibilityEvent) real).getContentChangeTypes();
    }

    public long getEventTime() {
        return ((android.view.accessibility.AccessibilityEvent) real).getEventTime();
    }

    public int getEventType() {
        return ((android.view.accessibility.AccessibilityEvent) real).getEventType();
    }

    public int getMovementGranularity() {
        return ((android.view.accessibility.AccessibilityEvent) real).getMovementGranularity();
    }

    public java.lang.CharSequence getPackageName() {
        return ((android.view.accessibility.AccessibilityEvent) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord getRecord(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityRecord.wrap(((android.view.accessibility.AccessibilityEvent) real).getRecord(arg0));
    }

    public int getRecordCount() {
        return ((android.view.accessibility.AccessibilityEvent) real).getRecordCount();
    }

    public int getSpeechStateChangeTypes() {
        return ((android.view.accessibility.AccessibilityEvent) real).getSpeechStateChangeTypes();
    }

    public int getWindowChanges() {
        return ((android.view.accessibility.AccessibilityEvent) real).getWindowChanges();
    }

    public void initFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).initFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public boolean isAccessibilityDataSensitive() {
        return ((android.view.accessibility.AccessibilityEvent) real).isAccessibilityDataSensitive();
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent obtain() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent.wrap(android.view.accessibility.AccessibilityEvent.obtain());
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent obtain(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent.wrap(android.view.accessibility.AccessibilityEvent.obtain(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent obtain(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent.wrap(android.view.accessibility.AccessibilityEvent.obtain(arg0));
    }

    public void recycle() {
        ((android.view.accessibility.AccessibilityEvent) real).recycle();
    }

    public void setAccessibilityDataSensitive(boolean arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setAccessibilityDataSensitive(arg0);
    }

    public void setAction(int arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setAction(arg0);
    }

    public void setContentChangeTypes(int arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setContentChangeTypes(arg0);
    }

    public void setEventTime(long arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setEventTime(arg0);
    }

    public void setEventType(int arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setEventType(arg0);
    }

    public void setMovementGranularity(int arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setMovementGranularity(arg0);
    }

    public void setPackageName(java.lang.CharSequence arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setPackageName(arg0);
    }

    public void setSpeechStateChangeTypes(int arg0) {
        ((android.view.accessibility.AccessibilityEvent) real).setSpeechStateChangeTypes(arg0);
    }

    public java.lang.String toString() {
        return ((android.view.accessibility.AccessibilityEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.accessibility.AccessibilityEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONTENT_CHANGE_TYPE_CHECKED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_CHECKED;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_INVALID = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_CONTENT_INVALID;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_DRAG_CANCELLED;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_DRAG_DROPPED;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_DRAG_STARTED;
    public static final int CONTENT_CHANGE_TYPE_ENABLED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_ENABLED;
    public static final int CONTENT_CHANGE_TYPE_ERROR = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_ERROR;
    public static final int CONTENT_CHANGE_TYPE_EXPANDED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_EXPANDED;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_APPEARED;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_DISAPPEARED;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_TITLE;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_STATE_DESCRIPTION;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_SUBTREE;
    public static final int CONTENT_CHANGE_TYPE_SUPPLEMENTAL_DESCRIPTION = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_SUPPLEMENTAL_DESCRIPTION;
    public static final int CONTENT_CHANGE_TYPE_TEXT = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_TEXT;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = android.view.accessibility.AccessibilityEvent.CONTENT_CHANGE_TYPE_UNDEFINED;
    public static final int INVALID_POSITION = android.view.accessibility.AccessibilityEvent.INVALID_POSITION;
    public static final int MAX_TEXT_LENGTH = android.view.accessibility.AccessibilityEvent.MAX_TEXT_LENGTH;
    public static final int SPEECH_STATE_LISTENING_END = android.view.accessibility.AccessibilityEvent.SPEECH_STATE_LISTENING_END;
    public static final int SPEECH_STATE_LISTENING_START = android.view.accessibility.AccessibilityEvent.SPEECH_STATE_LISTENING_START;
    public static final int SPEECH_STATE_SPEAKING_END = android.view.accessibility.AccessibilityEvent.SPEECH_STATE_SPEAKING_END;
    public static final int SPEECH_STATE_SPEAKING_START = android.view.accessibility.AccessibilityEvent.SPEECH_STATE_SPEAKING_START;
    public static final int TYPES_ALL_MASK = android.view.accessibility.AccessibilityEvent.TYPES_ALL_MASK;
    public static final int TYPE_ANNOUNCEMENT = android.view.accessibility.AccessibilityEvent.TYPE_ANNOUNCEMENT;
    public static final int TYPE_ASSIST_READING_CONTEXT = android.view.accessibility.AccessibilityEvent.TYPE_ASSIST_READING_CONTEXT;
    public static final int TYPE_GESTURE_DETECTION_END = android.view.accessibility.AccessibilityEvent.TYPE_GESTURE_DETECTION_END;
    public static final int TYPE_GESTURE_DETECTION_START = android.view.accessibility.AccessibilityEvent.TYPE_GESTURE_DETECTION_START;
    public static final int TYPE_NOTIFICATION_STATE_CHANGED = android.view.accessibility.AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED;
    public static final int TYPE_SPEECH_STATE_CHANGE = android.view.accessibility.AccessibilityEvent.TYPE_SPEECH_STATE_CHANGE;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_END;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_START;
    public static final int TYPE_TOUCH_INTERACTION_END = android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_INTERACTION_END;
    public static final int TYPE_TOUCH_INTERACTION_START = android.view.accessibility.AccessibilityEvent.TYPE_TOUCH_INTERACTION_START;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
    public static final int TYPE_VIEW_CLICKED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_CLICKED;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_CONTEXT_CLICKED;
    public static final int TYPE_VIEW_FOCUSED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_FOCUSED;
    public static final int TYPE_VIEW_HOVER_ENTER = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_HOVER_ENTER;
    public static final int TYPE_VIEW_HOVER_EXIT = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_HOVER_EXIT;
    public static final int TYPE_VIEW_LONG_CLICKED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_LONG_CLICKED;
    public static final int TYPE_VIEW_SCROLLED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_SCROLLED;
    public static final int TYPE_VIEW_SELECTED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_SELECTED;
    public static final int TYPE_VIEW_TARGETED_BY_SCROLL = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_TARGETED_BY_SCROLL;
    public static final int TYPE_VIEW_TEXT_CHANGED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED;
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = android.view.accessibility.AccessibilityEvent.TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY;
    public static final int TYPE_WINDOWS_CHANGED = android.view.accessibility.AccessibilityEvent.TYPE_WINDOWS_CHANGED;
    public static final int TYPE_WINDOW_CONTENT_CHANGED = android.view.accessibility.AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED;
    public static final int TYPE_WINDOW_STATE_CHANGED = android.view.accessibility.AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED;
    public static final int WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED;
    public static final int WINDOWS_CHANGE_ACTIVE = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_ACTIVE;
    public static final int WINDOWS_CHANGE_ADDED = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_ADDED;
    public static final int WINDOWS_CHANGE_BOUNDS = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_BOUNDS;
    public static final int WINDOWS_CHANGE_CHILDREN = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_CHILDREN;
    public static final int WINDOWS_CHANGE_FOCUSED = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_FOCUSED;
    public static final int WINDOWS_CHANGE_LAYER = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_LAYER;
    public static final int WINDOWS_CHANGE_PARENT = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_PARENT;
    public static final int WINDOWS_CHANGE_PIP = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_PIP;
    public static final int WINDOWS_CHANGE_REMOVED = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_REMOVED;
    public static final int WINDOWS_CHANGE_TITLE = android.view.accessibility.AccessibilityEvent.WINDOWS_CHANGE_TITLE;

}
