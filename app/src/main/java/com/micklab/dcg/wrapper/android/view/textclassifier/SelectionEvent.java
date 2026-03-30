// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class SelectionEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SelectionEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent wrap(android.view.textclassifier.SelectionEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.SelectionEvent getReal() {
        return (android.view.textclassifier.SelectionEvent) real;
    }

    public android.view.textclassifier.SelectionEvent unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionActionEvent(int arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionActionEvent(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionActionEvent(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification arg3) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionActionEvent(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionModifiedEvent(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection arg2) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionModifiedEvent(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification arg2) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionModifiedEvent(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionStartedEvent(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionStartedEvent(arg0, arg1));
    }

    public int describeContents() {
        return ((android.view.textclassifier.SelectionEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.textclassifier.SelectionEvent) real).equals(arg0);
    }

    public long getDurationSincePreviousEvent() {
        return ((android.view.textclassifier.SelectionEvent) real).getDurationSincePreviousEvent();
    }

    public long getDurationSinceSessionStart() {
        return ((android.view.textclassifier.SelectionEvent) real).getDurationSinceSessionStart();
    }

    public int getEnd() {
        return ((android.view.textclassifier.SelectionEvent) real).getEnd();
    }

    public java.lang.String getEntityType() {
        return ((android.view.textclassifier.SelectionEvent) real).getEntityType();
    }

    public int getEventIndex() {
        return ((android.view.textclassifier.SelectionEvent) real).getEventIndex();
    }

    public long getEventTime() {
        return ((android.view.textclassifier.SelectionEvent) real).getEventTime();
    }

    public int getEventType() {
        return ((android.view.textclassifier.SelectionEvent) real).getEventType();
    }

    public int getInvocationMethod() {
        return ((android.view.textclassifier.SelectionEvent) real).getInvocationMethod();
    }

    public java.lang.String getPackageName() {
        return ((android.view.textclassifier.SelectionEvent) real).getPackageName();
    }

    public java.lang.String getResultId() {
        return ((android.view.textclassifier.SelectionEvent) real).getResultId();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId.wrap(((android.view.textclassifier.SelectionEvent) real).getSessionId());
    }

    public int getSmartEnd() {
        return ((android.view.textclassifier.SelectionEvent) real).getSmartEnd();
    }

    public int getSmartStart() {
        return ((android.view.textclassifier.SelectionEvent) real).getSmartStart();
    }

    public int getStart() {
        return ((android.view.textclassifier.SelectionEvent) real).getStart();
    }

    public java.lang.String getWidgetType() {
        return ((android.view.textclassifier.SelectionEvent) real).getWidgetType();
    }

    public java.lang.String getWidgetVersion() {
        return ((android.view.textclassifier.SelectionEvent) real).getWidgetVersion();
    }

    public int hashCode() {
        return ((android.view.textclassifier.SelectionEvent) real).hashCode();
    }

    public static boolean isTerminal(int arg0) {
        return android.view.textclassifier.SelectionEvent.isTerminal(arg0);
    }

    public java.lang.String toString() {
        return ((android.view.textclassifier.SelectionEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.SelectionEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ACTION_ABANDON = android.view.textclassifier.SelectionEvent.ACTION_ABANDON;
    public static final int ACTION_COPY = android.view.textclassifier.SelectionEvent.ACTION_COPY;
    public static final int ACTION_CUT = android.view.textclassifier.SelectionEvent.ACTION_CUT;
    public static final int ACTION_DRAG = android.view.textclassifier.SelectionEvent.ACTION_DRAG;
    public static final int ACTION_OTHER = android.view.textclassifier.SelectionEvent.ACTION_OTHER;
    public static final int ACTION_OVERTYPE = android.view.textclassifier.SelectionEvent.ACTION_OVERTYPE;
    public static final int ACTION_PASTE = android.view.textclassifier.SelectionEvent.ACTION_PASTE;
    public static final int ACTION_RESET = android.view.textclassifier.SelectionEvent.ACTION_RESET;
    public static final int ACTION_SELECT_ALL = android.view.textclassifier.SelectionEvent.ACTION_SELECT_ALL;
    public static final int ACTION_SHARE = android.view.textclassifier.SelectionEvent.ACTION_SHARE;
    public static final int ACTION_SMART_SHARE = android.view.textclassifier.SelectionEvent.ACTION_SMART_SHARE;
    public static final int EVENT_AUTO_SELECTION = android.view.textclassifier.SelectionEvent.EVENT_AUTO_SELECTION;
    public static final int EVENT_SELECTION_MODIFIED = android.view.textclassifier.SelectionEvent.EVENT_SELECTION_MODIFIED;
    public static final int EVENT_SELECTION_STARTED = android.view.textclassifier.SelectionEvent.EVENT_SELECTION_STARTED;
    public static final int EVENT_SMART_SELECTION_MULTI = android.view.textclassifier.SelectionEvent.EVENT_SMART_SELECTION_MULTI;
    public static final int EVENT_SMART_SELECTION_SINGLE = android.view.textclassifier.SelectionEvent.EVENT_SMART_SELECTION_SINGLE;
    public static final int INVOCATION_LINK = android.view.textclassifier.SelectionEvent.INVOCATION_LINK;
    public static final int INVOCATION_MANUAL = android.view.textclassifier.SelectionEvent.INVOCATION_MANUAL;
    public static final int INVOCATION_UNKNOWN = android.view.textclassifier.SelectionEvent.INVOCATION_UNKNOWN;

}
