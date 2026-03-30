// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.people;

public final class PeopleManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PeopleManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.people.PeopleManager wrap(android.app.people.PeopleManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.people.PeopleManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.people.PeopleManager getReal() {
        return (android.app.people.PeopleManager) real;
    }

    public android.app.people.PeopleManager unwrap() {
        return getReal();
    }

    public void addOrUpdateStatus(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.people.ConversationStatus arg1) {
        ((android.app.people.PeopleManager) real).addOrUpdateStatus(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void clearStatus(java.lang.String arg0, java.lang.String arg1) {
        ((android.app.people.PeopleManager) real).clearStatus(arg0, arg1);
    }

    public void clearStatuses(java.lang.String arg0) {
        ((android.app.people.PeopleManager) real).clearStatuses(arg0);
    }

}
