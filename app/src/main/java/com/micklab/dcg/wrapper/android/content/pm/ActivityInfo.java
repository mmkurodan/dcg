// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class ActivityInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActivityInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.ActivityInfo wrap(android.content.pm.ActivityInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.ActivityInfo(real, (__DcgwBridgeToken) null);
    }

    public android.content.pm.ActivityInfo getReal() {
        return (android.content.pm.ActivityInfo) real;
    }

    public android.content.pm.ActivityInfo unwrap() {
        return getReal();
    }

    public ActivityInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo#android.content.pm.ActivityInfo()");
    }

    public ActivityInfo(com.micklab.dcg.wrapper.android.content.pm.ActivityInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo#android.content.pm.ActivityInfo(android.content.pm.ActivityInfo)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo#describeContents()");
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo#dump(android.util.Printer,java.lang.String)");
    }

    public int getThemeResource() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo#getThemeResource()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo#writeToParcel(android.os.Parcel,int)");
    }


    public static final class WindowLayout {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WindowLayout(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.ActivityInfo.WindowLayout wrap(android.content.pm.ActivityInfo.WindowLayout real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.ActivityInfo.WindowLayout(real, (__DcgwBridgeToken) null);
        }

        public android.content.pm.ActivityInfo.WindowLayout getReal() {
            return (android.content.pm.ActivityInfo.WindowLayout) real;
        }

        public android.content.pm.ActivityInfo.WindowLayout unwrap() {
            return getReal();
        }

        public WindowLayout(int arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.ActivityInfo$WindowLayout#android.content.pm.ActivityInfo$WindowLayout(int,float,int,float,int,int,int)");
        }


    }
}
