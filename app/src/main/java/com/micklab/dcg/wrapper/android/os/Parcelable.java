// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Parcelable {
    private final android.os.Parcelable real;

    public Parcelable(android.os.Parcelable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Parcelable wrap(android.os.Parcelable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Parcelable(real);
    }

    public android.os.Parcelable unwrap() {
        return real;
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable#describeContents()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable#writeToParcel(android.os.Parcel,int)");
    }


    public static final class ClassLoaderCreator {
        private final android.os.Parcelable.ClassLoaderCreator real;

        public ClassLoaderCreator(android.os.Parcelable.ClassLoaderCreator real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Parcelable.ClassLoaderCreator wrap(android.os.Parcelable.ClassLoaderCreator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Parcelable.ClassLoaderCreator(real);
        }

        public android.os.Parcelable.ClassLoaderCreator unwrap() {
            return real;
        }

        public java.lang.Object createFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, java.lang.ClassLoader arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable$ClassLoaderCreator#createFromParcel(android.os.Parcel,java.lang.ClassLoader)");
        }

    }
    public static final class Creator {
        private final android.os.Parcelable.Creator real;

        public Creator(android.os.Parcelable.Creator real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Parcelable.Creator wrap(android.os.Parcelable.Creator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Parcelable.Creator(real);
        }

        public android.os.Parcelable.Creator unwrap() {
            return real;
        }

        public java.lang.Object createFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable$Creator#createFromParcel(android.os.Parcel)");
        }

        public java.lang.Object[] newArray(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcelable$Creator#newArray(int)");
        }

    }
}
