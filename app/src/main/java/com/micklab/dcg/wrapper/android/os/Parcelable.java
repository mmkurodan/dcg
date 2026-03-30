// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Parcelable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Parcelable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Parcelable wrap(android.os.Parcelable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Parcelable(real, (__DcgwBridgeToken) null);
    }

    public android.os.Parcelable getReal() {
        return (android.os.Parcelable) real;
    }

    public android.os.Parcelable unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable#describeContents()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable#writeToParcel(android.os.Parcel,int)");
    }


    public static final class ClassLoaderCreator {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ClassLoaderCreator(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Parcelable.ClassLoaderCreator wrap(android.os.Parcelable.ClassLoaderCreator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Parcelable.ClassLoaderCreator(real, (__DcgwBridgeToken) null);
        }

        public android.os.Parcelable.ClassLoaderCreator getReal() {
            return (android.os.Parcelable.ClassLoaderCreator) real;
        }

        public android.os.Parcelable.ClassLoaderCreator unwrap() {
            return getReal();
        }

        public java.lang.Object createFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, java.lang.ClassLoader arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable$ClassLoaderCreator#createFromParcel(android.os.Parcel,java.lang.ClassLoader)");
        }

    }
    public static final class Creator {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Creator(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Parcelable.Creator wrap(android.os.Parcelable.Creator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Parcelable.Creator(real, (__DcgwBridgeToken) null);
        }

        public android.os.Parcelable.Creator getReal() {
            return (android.os.Parcelable.Creator) real;
        }

        public android.os.Parcelable.Creator unwrap() {
            return getReal();
        }

        public java.lang.Object createFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable$Creator#createFromParcel(android.os.Parcel)");
        }

        public java.lang.Object[] newArray(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable$Creator#newArray(int)");
        }

    }
}
