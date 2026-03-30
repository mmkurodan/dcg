// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class PackagePolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PackagePolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.PackagePolicy wrap(android.app.admin.PackagePolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.PackagePolicy(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.PackagePolicy getReal() {
        return (android.app.admin.PackagePolicy) real;
    }

    public android.app.admin.PackagePolicy unwrap() {
        return getReal();
    }

    public PackagePolicy(int arg0) {
        this(new android.app.admin.PackagePolicy(arg0), (__DcgwBridgeToken) null);
    }

    public PackagePolicy(int arg0, java.util.Set arg1) {
        this(new android.app.admin.PackagePolicy(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.admin.PackagePolicy) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.admin.PackagePolicy) real).equals(arg0);
    }

    public int getPolicyType() {
        return ((android.app.admin.PackagePolicy) real).getPolicyType();
    }

    public int hashCode() {
        return ((android.app.admin.PackagePolicy) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.PackagePolicy) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int PACKAGE_POLICY_ALLOWLIST = android.app.admin.PackagePolicy.PACKAGE_POLICY_ALLOWLIST;
    public static final int PACKAGE_POLICY_ALLOWLIST_AND_SYSTEM = android.app.admin.PackagePolicy.PACKAGE_POLICY_ALLOWLIST_AND_SYSTEM;
    public static final int PACKAGE_POLICY_BLOCKLIST = android.app.admin.PackagePolicy.PACKAGE_POLICY_BLOCKLIST;

}
