// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class PackagePolicy {
    private final android.app.admin.PackagePolicy real;

    public PackagePolicy(android.app.admin.PackagePolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.PackagePolicy wrap(android.app.admin.PackagePolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PackagePolicy(real);
    }

    public android.app.admin.PackagePolicy unwrap() {
        return real;
    }

    public PackagePolicy(int arg0) {
        this(new android.app.admin.PackagePolicy(arg0));
    }

    public PackagePolicy(int arg0, java.util.Set arg1) {
        this(new android.app.admin.PackagePolicy(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getPolicyType() {
        return real.getPolicyType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int PACKAGE_POLICY_ALLOWLIST = android.app.admin.PackagePolicy.PACKAGE_POLICY_ALLOWLIST;
    public static final int PACKAGE_POLICY_ALLOWLIST_AND_SYSTEM = android.app.admin.PackagePolicy.PACKAGE_POLICY_ALLOWLIST_AND_SYSTEM;
    public static final int PACKAGE_POLICY_BLOCKLIST = android.app.admin.PackagePolicy.PACKAGE_POLICY_BLOCKLIST;

}
