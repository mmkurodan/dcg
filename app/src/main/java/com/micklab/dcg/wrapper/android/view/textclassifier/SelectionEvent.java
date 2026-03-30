// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class SelectionEvent {
    private final android.view.textclassifier.SelectionEvent real;

    public SelectionEvent(android.view.textclassifier.SelectionEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent wrap(android.view.textclassifier.SelectionEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent(real);
    }

    public android.view.textclassifier.SelectionEvent unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionActionEvent(int arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionActionEvent(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionActionEvent(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification arg3) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionActionEvent(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionModifiedEvent(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.textclassifier.TextSelection arg2) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionModifiedEvent(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.textclassifier.TextClassification arg2) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionModifiedEvent(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent createSelectionStartedEvent(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.SelectionEvent.wrap(android.view.textclassifier.SelectionEvent.createSelectionStartedEvent(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getDurationSincePreviousEvent() {
        return real.getDurationSincePreviousEvent();
    }

    public long getDurationSinceSessionStart() {
        return real.getDurationSinceSessionStart();
    }

    public int getEnd() {
        return real.getEnd();
    }

    public java.lang.String getEntityType() {
        return real.getEntityType();
    }

    public int getEventIndex() {
        return real.getEventIndex();
    }

    public long getEventTime() {
        return real.getEventTime();
    }

    public int getEventType() {
        return real.getEventType();
    }

    public int getInvocationMethod() {
        return real.getInvocationMethod();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public java.lang.String getResultId() {
        return real.getResultId();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionId.wrap(real.getSessionId());
    }

    public int getSmartEnd() {
        return real.getSmartEnd();
    }

    public int getSmartStart() {
        return real.getSmartStart();
    }

    public int getStart() {
        return real.getStart();
    }

    public java.lang.String getWidgetType() {
        return real.getWidgetType();
    }

    public java.lang.String getWidgetVersion() {
        return real.getWidgetVersion();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static boolean isTerminal(int arg0) {
        return android.view.textclassifier.SelectionEvent.isTerminal(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
