// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.people;

public final class PeopleManager {
    private final android.app.people.PeopleManager real;

    public PeopleManager(android.app.people.PeopleManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.people.PeopleManager wrap(android.app.people.PeopleManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.people.PeopleManager(real);
    }

    public android.app.people.PeopleManager unwrap() {
        return real;
    }

    public void addOrUpdateStatus(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.people.ConversationStatus arg1) {
        real.addOrUpdateStatus(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void clearStatus(java.lang.String arg0, java.lang.String arg1) {
        real.clearStatus(arg0, arg1);
    }

    public void clearStatuses(java.lang.String arg0) {
        real.clearStatuses(arg0);
    }

}
