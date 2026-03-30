// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowId wrap(android.view.WindowId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowId(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowId getReal() {
        return (android.view.WindowId) real;
    }

    public android.view.WindowId unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.WindowId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.WindowId) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.view.WindowId) real).hashCode();
    }

    public boolean isFocused() {
        return ((android.view.WindowId) real).isFocused();
    }

    public void registerFocusObserver(com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver arg0) {
        ((android.view.WindowId) real).registerFocusObserver(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.view.WindowId) real).toString();
    }

    public void unregisterFocusObserver(com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver arg0) {
        ((android.view.WindowId) real).unregisterFocusObserver(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.WindowId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class FocusObserver {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FocusObserver(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver wrap(android.view.WindowId.FocusObserver real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver(real, (__DcgwBridgeToken) null);
        }

        public android.view.WindowId.FocusObserver getReal() {
            return (android.view.WindowId.FocusObserver) real;
        }

        public android.view.WindowId.FocusObserver unwrap() {
            return getReal();
        }

        public void onFocusGained(com.micklab.dcg.wrapper.android.view.WindowId arg0) {
            ((android.view.WindowId.FocusObserver) real).onFocusGained(arg0 == null ? null : arg0.getReal());
        }

        public void onFocusLost(com.micklab.dcg.wrapper.android.view.WindowId arg0) {
            ((android.view.WindowId.FocusObserver) real).onFocusLost(arg0 == null ? null : arg0.getReal());
        }

    }
}
