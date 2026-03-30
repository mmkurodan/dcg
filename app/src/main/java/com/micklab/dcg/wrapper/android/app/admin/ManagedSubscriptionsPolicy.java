// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class ManagedSubscriptionsPolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ManagedSubscriptionsPolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.ManagedSubscriptionsPolicy wrap(android.app.admin.ManagedSubscriptionsPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.ManagedSubscriptionsPolicy(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.ManagedSubscriptionsPolicy getReal() {
        return (android.app.admin.ManagedSubscriptionsPolicy) real;
    }

    public android.app.admin.ManagedSubscriptionsPolicy unwrap() {
        return getReal();
    }

    public ManagedSubscriptionsPolicy(int arg0) {
        this(new android.app.admin.ManagedSubscriptionsPolicy(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.admin.ManagedSubscriptionsPolicy) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.admin.ManagedSubscriptionsPolicy) real).equals(arg0);
    }

    public int getPolicyType() {
        return ((android.app.admin.ManagedSubscriptionsPolicy) real).getPolicyType();
    }

    public int hashCode() {
        return ((android.app.admin.ManagedSubscriptionsPolicy) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.admin.ManagedSubscriptionsPolicy) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.ManagedSubscriptionsPolicy) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_ALL_MANAGED_SUBSCRIPTIONS = android.app.admin.ManagedSubscriptionsPolicy.TYPE_ALL_MANAGED_SUBSCRIPTIONS;
    public static final int TYPE_ALL_PERSONAL_SUBSCRIPTIONS = android.app.admin.ManagedSubscriptionsPolicy.TYPE_ALL_PERSONAL_SUBSCRIPTIONS;

}
