// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class BroadcastOptions {
    private final android.app.BroadcastOptions real;

    public BroadcastOptions(android.app.BroadcastOptions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.BroadcastOptions wrap(android.app.BroadcastOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.BroadcastOptions(real);
    }

    public android.app.BroadcastOptions unwrap() {
        return real;
    }

    public void clearDeferralPolicy() {
        real.clearDeferralPolicy();
    }

    public void clearDeliveryGroupMatchingKey() {
        real.clearDeliveryGroupMatchingKey();
    }

    public void clearDeliveryGroupPolicy() {
        real.clearDeliveryGroupPolicy();
    }

    public static com.micklab.dcg.wrapper.android.app.BroadcastOptions fromBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(android.app.BroadcastOptions.fromBundle(arg0 == null ? null : arg0.unwrap()));
    }

    public int getDeferralPolicy() {
        return real.getDeferralPolicy();
    }

    public java.lang.String getDeliveryGroupMatchingKey() {
        return real.getDeliveryGroupMatchingKey();
    }

    public int getDeliveryGroupPolicy() {
        return real.getDeliveryGroupPolicy();
    }

    public boolean isShareIdentityEnabled() {
        return real.isShareIdentityEnabled();
    }

    public static com.micklab.dcg.wrapper.android.app.BroadcastOptions makeBasic() {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(android.app.BroadcastOptions.makeBasic());
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setDeferralPolicy(int arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(real.setDeferralPolicy(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setDeliveryGroupMatchingKey(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(real.setDeliveryGroupMatchingKey(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setDeliveryGroupPolicy(int arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(real.setDeliveryGroupPolicy(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.BroadcastOptions setShareIdentityEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.BroadcastOptions.wrap(real.setShareIdentityEnabled(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle toBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.toBundle());
    }

    public static final int DEFERRAL_POLICY_DEFAULT = android.app.BroadcastOptions.DEFERRAL_POLICY_DEFAULT;
    public static final int DEFERRAL_POLICY_NONE = android.app.BroadcastOptions.DEFERRAL_POLICY_NONE;
    public static final int DEFERRAL_POLICY_UNTIL_ACTIVE = android.app.BroadcastOptions.DEFERRAL_POLICY_UNTIL_ACTIVE;
    public static final int DELIVERY_GROUP_POLICY_ALL = android.app.BroadcastOptions.DELIVERY_GROUP_POLICY_ALL;
    public static final int DELIVERY_GROUP_POLICY_MOST_RECENT = android.app.BroadcastOptions.DELIVERY_GROUP_POLICY_MOST_RECENT;

}
