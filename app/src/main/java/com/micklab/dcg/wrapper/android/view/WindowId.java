// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowId {
    private final android.view.WindowId real;

    public WindowId(android.view.WindowId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowId wrap(android.view.WindowId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowId(real);
    }

    public android.view.WindowId unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isFocused() {
        return real.isFocused();
    }

    public void registerFocusObserver(com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver arg0) {
        real.registerFocusObserver(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void unregisterFocusObserver(com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver arg0) {
        real.unregisterFocusObserver(arg0 == null ? null : arg0.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class FocusObserver {
        private final android.view.WindowId.FocusObserver real;

        public FocusObserver(android.view.WindowId.FocusObserver real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver wrap(android.view.WindowId.FocusObserver real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowId.FocusObserver(real);
        }

        public android.view.WindowId.FocusObserver unwrap() {
            return real;
        }

        public void onFocusGained(com.micklab.dcg.wrapper.android.view.WindowId arg0) {
            real.onFocusGained(arg0 == null ? null : arg0.unwrap());
        }

        public void onFocusLost(com.micklab.dcg.wrapper.android.view.WindowId arg0) {
            real.onFocusLost(arg0 == null ? null : arg0.unwrap());
        }

    }
}
