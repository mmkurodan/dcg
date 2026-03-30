// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class ManagedSubscriptionsPolicy {
    private final android.app.admin.ManagedSubscriptionsPolicy real;

    public ManagedSubscriptionsPolicy(android.app.admin.ManagedSubscriptionsPolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.ManagedSubscriptionsPolicy wrap(android.app.admin.ManagedSubscriptionsPolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.ManagedSubscriptionsPolicy(real);
    }

    public android.app.admin.ManagedSubscriptionsPolicy unwrap() {
        return real;
    }

    public ManagedSubscriptionsPolicy(int arg0) {
        this(new android.app.admin.ManagedSubscriptionsPolicy(arg0));
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

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_ALL_MANAGED_SUBSCRIPTIONS = android.app.admin.ManagedSubscriptionsPolicy.TYPE_ALL_MANAGED_SUBSCRIPTIONS;
    public static final int TYPE_ALL_PERSONAL_SUBSCRIPTIONS = android.app.admin.ManagedSubscriptionsPolicy.TYPE_ALL_PERSONAL_SUBSCRIPTIONS;

}
