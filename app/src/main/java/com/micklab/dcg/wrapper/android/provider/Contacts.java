// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class Contacts {
    private final android.provider.Contacts real;

    public Contacts(android.provider.Contacts real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.Contacts wrap(android.provider.Contacts real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts(real);
    }

    public android.provider.Contacts unwrap() {
        return real;
    }

    public static final java.lang.String AUTHORITY = android.provider.Contacts.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.CONTENT_URI);
    public static final int KIND_EMAIL = android.provider.Contacts.KIND_EMAIL;
    public static final int KIND_IM = android.provider.Contacts.KIND_IM;
    public static final int KIND_ORGANIZATION = android.provider.Contacts.KIND_ORGANIZATION;
    public static final int KIND_PHONE = android.provider.Contacts.KIND_PHONE;
    public static final int KIND_POSTAL = android.provider.Contacts.KIND_POSTAL;

    public static final class ContactMethods {
        private final android.provider.Contacts.ContactMethods real;

        public ContactMethods(android.provider.Contacts.ContactMethods real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.ContactMethods wrap(android.provider.Contacts.ContactMethods real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.ContactMethods(real);
        }

        public android.provider.Contacts.ContactMethods unwrap() {
            return real;
        }

        public void addPostalLocation(com.micklab.dcg.wrapper.android.content.Context arg0, long arg1, double arg2, double arg3) {
            real.addPostalLocation(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

        public static java.lang.Object decodeImProtocol(java.lang.String arg0) {
            return android.provider.Contacts.ContactMethods.decodeImProtocol(arg0);
        }

        public static java.lang.String encodeCustomImProtocol(java.lang.String arg0) {
            return android.provider.Contacts.ContactMethods.encodeCustomImProtocol(arg0);
        }

        public static java.lang.String encodePredefinedImProtocol(int arg0) {
            return android.provider.Contacts.ContactMethods.encodePredefinedImProtocol(arg0);
        }

        public static java.lang.CharSequence getDisplayLabel(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, java.lang.CharSequence arg3) {
            return android.provider.Contacts.ContactMethods.getDisplayLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

        public static final java.lang.String CONTENT_EMAIL_ITEM_TYPE = android.provider.Contacts.ContactMethods.CONTENT_EMAIL_ITEM_TYPE;
        public static final java.lang.String CONTENT_EMAIL_TYPE = android.provider.Contacts.ContactMethods.CONTENT_EMAIL_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_EMAIL_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.ContactMethods.CONTENT_EMAIL_URI);
        public static final java.lang.String CONTENT_IM_ITEM_TYPE = android.provider.Contacts.ContactMethods.CONTENT_IM_ITEM_TYPE;
        public static final java.lang.String CONTENT_POSTAL_ITEM_TYPE = android.provider.Contacts.ContactMethods.CONTENT_POSTAL_ITEM_TYPE;
        public static final java.lang.String CONTENT_POSTAL_TYPE = android.provider.Contacts.ContactMethods.CONTENT_POSTAL_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.Contacts.ContactMethods.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.ContactMethods.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.ContactMethods.DEFAULT_SORT_ORDER;
        public static final java.lang.String PERSON_ID = android.provider.Contacts.ContactMethods.PERSON_ID;
        public static final java.lang.String POSTAL_LOCATION_LATITUDE = android.provider.Contacts.ContactMethods.POSTAL_LOCATION_LATITUDE;
        public static final java.lang.String POSTAL_LOCATION_LONGITUDE = android.provider.Contacts.ContactMethods.POSTAL_LOCATION_LONGITUDE;
        public static final int PROTOCOL_AIM = android.provider.Contacts.ContactMethods.PROTOCOL_AIM;
        public static final int PROTOCOL_GOOGLE_TALK = android.provider.Contacts.ContactMethods.PROTOCOL_GOOGLE_TALK;
        public static final int PROTOCOL_ICQ = android.provider.Contacts.ContactMethods.PROTOCOL_ICQ;
        public static final int PROTOCOL_JABBER = android.provider.Contacts.ContactMethods.PROTOCOL_JABBER;
        public static final int PROTOCOL_MSN = android.provider.Contacts.ContactMethods.PROTOCOL_MSN;
        public static final int PROTOCOL_QQ = android.provider.Contacts.ContactMethods.PROTOCOL_QQ;
        public static final int PROTOCOL_SKYPE = android.provider.Contacts.ContactMethods.PROTOCOL_SKYPE;
        public static final int PROTOCOL_YAHOO = android.provider.Contacts.ContactMethods.PROTOCOL_YAHOO;

    }
    public static final class ContactMethodsColumns {
        private final android.provider.Contacts.ContactMethodsColumns real;

        public ContactMethodsColumns(android.provider.Contacts.ContactMethodsColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.ContactMethodsColumns wrap(android.provider.Contacts.ContactMethodsColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.ContactMethodsColumns(real);
        }

        public android.provider.Contacts.ContactMethodsColumns unwrap() {
            return real;
        }

        public static final java.lang.String AUX_DATA = android.provider.Contacts.ContactMethodsColumns.AUX_DATA;
        public static final java.lang.String DATA = android.provider.Contacts.ContactMethodsColumns.DATA;
        public static final java.lang.String ISPRIMARY = android.provider.Contacts.ContactMethodsColumns.ISPRIMARY;
        public static final java.lang.String KIND = android.provider.Contacts.ContactMethodsColumns.KIND;
        public static final java.lang.String LABEL = android.provider.Contacts.ContactMethodsColumns.LABEL;
        public static final java.lang.String TYPE = android.provider.Contacts.ContactMethodsColumns.TYPE;
        public static final int TYPE_CUSTOM = android.provider.Contacts.ContactMethodsColumns.TYPE_CUSTOM;
        public static final int TYPE_HOME = android.provider.Contacts.ContactMethodsColumns.TYPE_HOME;
        public static final int TYPE_OTHER = android.provider.Contacts.ContactMethodsColumns.TYPE_OTHER;
        public static final int TYPE_WORK = android.provider.Contacts.ContactMethodsColumns.TYPE_WORK;

    }
    public static final class Extensions {
        private final android.provider.Contacts.Extensions real;

        public Extensions(android.provider.Contacts.Extensions real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.Extensions wrap(android.provider.Contacts.Extensions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Extensions(real);
        }

        public android.provider.Contacts.Extensions unwrap() {
            return real;
        }

        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.Contacts.Extensions.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.Contacts.Extensions.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Extensions.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.Extensions.DEFAULT_SORT_ORDER;
        public static final java.lang.String PERSON_ID = android.provider.Contacts.Extensions.PERSON_ID;

    }
    public static final class ExtensionsColumns {
        private final android.provider.Contacts.ExtensionsColumns real;

        public ExtensionsColumns(android.provider.Contacts.ExtensionsColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.ExtensionsColumns wrap(android.provider.Contacts.ExtensionsColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.ExtensionsColumns(real);
        }

        public android.provider.Contacts.ExtensionsColumns unwrap() {
            return real;
        }

        public static final java.lang.String NAME = android.provider.Contacts.ExtensionsColumns.NAME;
        public static final java.lang.String VALUE = android.provider.Contacts.ExtensionsColumns.VALUE;

    }
    public static final class GroupMembership {
        private final android.provider.Contacts.GroupMembership real;

        public GroupMembership(android.provider.Contacts.GroupMembership real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.GroupMembership wrap(android.provider.Contacts.GroupMembership real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.GroupMembership(real);
        }

        public android.provider.Contacts.GroupMembership unwrap() {
            return real;
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.Contacts.GroupMembership.CONTENT_DIRECTORY;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.Contacts.GroupMembership.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.Contacts.GroupMembership.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.GroupMembership.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.GroupMembership.DEFAULT_SORT_ORDER;
        public static final java.lang.String GROUP_ID = android.provider.Contacts.GroupMembership.GROUP_ID;
        public static final java.lang.String GROUP_SYNC_ACCOUNT = android.provider.Contacts.GroupMembership.GROUP_SYNC_ACCOUNT;
        public static final java.lang.String GROUP_SYNC_ACCOUNT_TYPE = android.provider.Contacts.GroupMembership.GROUP_SYNC_ACCOUNT_TYPE;
        public static final java.lang.String GROUP_SYNC_ID = android.provider.Contacts.GroupMembership.GROUP_SYNC_ID;
        public static final java.lang.String PERSON_ID = android.provider.Contacts.GroupMembership.PERSON_ID;
        public static final com.micklab.dcg.wrapper.android.net.Uri RAW_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.GroupMembership.RAW_CONTENT_URI);

    }
    public static final class Groups {
        private final android.provider.Contacts.Groups real;

        public Groups(android.provider.Contacts.Groups real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.Groups wrap(android.provider.Contacts.Groups real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Groups(real);
        }

        public android.provider.Contacts.Groups unwrap() {
            return real;
        }

        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.Contacts.Groups.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.Contacts.Groups.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Groups.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.Groups.DEFAULT_SORT_ORDER;
        public static final com.micklab.dcg.wrapper.android.net.Uri DELETED_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Groups.DELETED_CONTENT_URI);
        public static final java.lang.String GROUP_ANDROID_STARRED = android.provider.Contacts.Groups.GROUP_ANDROID_STARRED;
        public static final java.lang.String GROUP_MY_CONTACTS = android.provider.Contacts.Groups.GROUP_MY_CONTACTS;

    }
    public static final class GroupsColumns {
        private final android.provider.Contacts.GroupsColumns real;

        public GroupsColumns(android.provider.Contacts.GroupsColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.GroupsColumns wrap(android.provider.Contacts.GroupsColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.GroupsColumns(real);
        }

        public android.provider.Contacts.GroupsColumns unwrap() {
            return real;
        }

        public static final java.lang.String NAME = android.provider.Contacts.GroupsColumns.NAME;
        public static final java.lang.String NOTES = android.provider.Contacts.GroupsColumns.NOTES;
        public static final java.lang.String SHOULD_SYNC = android.provider.Contacts.GroupsColumns.SHOULD_SYNC;
        public static final java.lang.String SYSTEM_ID = android.provider.Contacts.GroupsColumns.SYSTEM_ID;

    }
    public static final class Intents {
        private final android.provider.Contacts.Intents real;

        public Intents(android.provider.Contacts.Intents real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.Intents wrap(android.provider.Contacts.Intents real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Intents(real);
        }

        public android.provider.Contacts.Intents unwrap() {
            return real;
        }

        public Intents() {
            this(new android.provider.Contacts.Intents());
        }

        public static final java.lang.String ATTACH_IMAGE = android.provider.Contacts.Intents.ATTACH_IMAGE;
        public static final java.lang.String EXTRA_CREATE_DESCRIPTION = android.provider.Contacts.Intents.EXTRA_CREATE_DESCRIPTION;
        public static final java.lang.String EXTRA_FORCE_CREATE = android.provider.Contacts.Intents.EXTRA_FORCE_CREATE;
        public static final java.lang.String SEARCH_SUGGESTION_CLICKED = android.provider.Contacts.Intents.SEARCH_SUGGESTION_CLICKED;
        public static final java.lang.String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = android.provider.Contacts.Intents.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED;
        public static final java.lang.String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = android.provider.Contacts.Intents.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED;
        public static final java.lang.String SHOW_OR_CREATE_CONTACT = android.provider.Contacts.Intents.SHOW_OR_CREATE_CONTACT;

        public static final class Insert {
            private final android.provider.Contacts.Intents.Insert real;

            public Insert(android.provider.Contacts.Intents.Insert real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.Contacts.Intents.Insert wrap(android.provider.Contacts.Intents.Insert real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Intents.Insert(real);
            }

            public android.provider.Contacts.Intents.Insert unwrap() {
                return real;
            }

            public Insert() {
                this(new android.provider.Contacts.Intents.Insert());
            }

            public static final java.lang.String ACTION = android.provider.Contacts.Intents.Insert.ACTION;
            public static final java.lang.String COMPANY = android.provider.Contacts.Intents.Insert.COMPANY;
            public static final java.lang.String EMAIL = android.provider.Contacts.Intents.Insert.EMAIL;
            public static final java.lang.String EMAIL_ISPRIMARY = android.provider.Contacts.Intents.Insert.EMAIL_ISPRIMARY;
            public static final java.lang.String EMAIL_TYPE = android.provider.Contacts.Intents.Insert.EMAIL_TYPE;
            public static final java.lang.String FULL_MODE = android.provider.Contacts.Intents.Insert.FULL_MODE;
            public static final java.lang.String IM_HANDLE = android.provider.Contacts.Intents.Insert.IM_HANDLE;
            public static final java.lang.String IM_ISPRIMARY = android.provider.Contacts.Intents.Insert.IM_ISPRIMARY;
            public static final java.lang.String IM_PROTOCOL = android.provider.Contacts.Intents.Insert.IM_PROTOCOL;
            public static final java.lang.String JOB_TITLE = android.provider.Contacts.Intents.Insert.JOB_TITLE;
            public static final java.lang.String NAME = android.provider.Contacts.Intents.Insert.NAME;
            public static final java.lang.String NOTES = android.provider.Contacts.Intents.Insert.NOTES;
            public static final java.lang.String PHONE = android.provider.Contacts.Intents.Insert.PHONE;
            public static final java.lang.String PHONETIC_NAME = android.provider.Contacts.Intents.Insert.PHONETIC_NAME;
            public static final java.lang.String PHONE_ISPRIMARY = android.provider.Contacts.Intents.Insert.PHONE_ISPRIMARY;
            public static final java.lang.String PHONE_TYPE = android.provider.Contacts.Intents.Insert.PHONE_TYPE;
            public static final java.lang.String POSTAL = android.provider.Contacts.Intents.Insert.POSTAL;
            public static final java.lang.String POSTAL_ISPRIMARY = android.provider.Contacts.Intents.Insert.POSTAL_ISPRIMARY;
            public static final java.lang.String POSTAL_TYPE = android.provider.Contacts.Intents.Insert.POSTAL_TYPE;
            public static final java.lang.String SECONDARY_EMAIL = android.provider.Contacts.Intents.Insert.SECONDARY_EMAIL;
            public static final java.lang.String SECONDARY_EMAIL_TYPE = android.provider.Contacts.Intents.Insert.SECONDARY_EMAIL_TYPE;
            public static final java.lang.String SECONDARY_PHONE = android.provider.Contacts.Intents.Insert.SECONDARY_PHONE;
            public static final java.lang.String SECONDARY_PHONE_TYPE = android.provider.Contacts.Intents.Insert.SECONDARY_PHONE_TYPE;
            public static final java.lang.String TERTIARY_EMAIL = android.provider.Contacts.Intents.Insert.TERTIARY_EMAIL;
            public static final java.lang.String TERTIARY_EMAIL_TYPE = android.provider.Contacts.Intents.Insert.TERTIARY_EMAIL_TYPE;
            public static final java.lang.String TERTIARY_PHONE = android.provider.Contacts.Intents.Insert.TERTIARY_PHONE;
            public static final java.lang.String TERTIARY_PHONE_TYPE = android.provider.Contacts.Intents.Insert.TERTIARY_PHONE_TYPE;

        }
        public static final class UI {
            private final android.provider.Contacts.Intents.UI real;

            public UI(android.provider.Contacts.Intents.UI real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.Contacts.Intents.UI wrap(android.provider.Contacts.Intents.UI real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Intents.UI(real);
            }

            public android.provider.Contacts.Intents.UI unwrap() {
                return real;
            }

            public UI() {
                this(new android.provider.Contacts.Intents.UI());
            }

            public static final java.lang.String FILTER_CONTACTS_ACTION = android.provider.Contacts.Intents.UI.FILTER_CONTACTS_ACTION;
            public static final java.lang.String FILTER_TEXT_EXTRA_KEY = android.provider.Contacts.Intents.UI.FILTER_TEXT_EXTRA_KEY;
            public static final java.lang.String GROUP_NAME_EXTRA_KEY = android.provider.Contacts.Intents.UI.GROUP_NAME_EXTRA_KEY;
            public static final java.lang.String LIST_ALL_CONTACTS_ACTION = android.provider.Contacts.Intents.UI.LIST_ALL_CONTACTS_ACTION;
            public static final java.lang.String LIST_CONTACTS_WITH_PHONES_ACTION = android.provider.Contacts.Intents.UI.LIST_CONTACTS_WITH_PHONES_ACTION;
            public static final java.lang.String LIST_DEFAULT = android.provider.Contacts.Intents.UI.LIST_DEFAULT;
            public static final java.lang.String LIST_FREQUENT_ACTION = android.provider.Contacts.Intents.UI.LIST_FREQUENT_ACTION;
            public static final java.lang.String LIST_GROUP_ACTION = android.provider.Contacts.Intents.UI.LIST_GROUP_ACTION;
            public static final java.lang.String LIST_STARRED_ACTION = android.provider.Contacts.Intents.UI.LIST_STARRED_ACTION;
            public static final java.lang.String LIST_STREQUENT_ACTION = android.provider.Contacts.Intents.UI.LIST_STREQUENT_ACTION;
            public static final java.lang.String TITLE_EXTRA_KEY = android.provider.Contacts.Intents.UI.TITLE_EXTRA_KEY;

        }
    }
    public static final class OrganizationColumns {
        private final android.provider.Contacts.OrganizationColumns real;

        public OrganizationColumns(android.provider.Contacts.OrganizationColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.OrganizationColumns wrap(android.provider.Contacts.OrganizationColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.OrganizationColumns(real);
        }

        public android.provider.Contacts.OrganizationColumns unwrap() {
            return real;
        }

        public static final java.lang.String COMPANY = android.provider.Contacts.OrganizationColumns.COMPANY;
        public static final java.lang.String ISPRIMARY = android.provider.Contacts.OrganizationColumns.ISPRIMARY;
        public static final java.lang.String LABEL = android.provider.Contacts.OrganizationColumns.LABEL;
        public static final java.lang.String PERSON_ID = android.provider.Contacts.OrganizationColumns.PERSON_ID;
        public static final java.lang.String TITLE = android.provider.Contacts.OrganizationColumns.TITLE;
        public static final java.lang.String TYPE = android.provider.Contacts.OrganizationColumns.TYPE;
        public static final int TYPE_CUSTOM = android.provider.Contacts.OrganizationColumns.TYPE_CUSTOM;
        public static final int TYPE_OTHER = android.provider.Contacts.OrganizationColumns.TYPE_OTHER;
        public static final int TYPE_WORK = android.provider.Contacts.OrganizationColumns.TYPE_WORK;

    }
    public static final class Organizations {
        private final android.provider.Contacts.Organizations real;

        public Organizations(android.provider.Contacts.Organizations real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.Organizations wrap(android.provider.Contacts.Organizations real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Organizations(real);
        }

        public android.provider.Contacts.Organizations unwrap() {
            return real;
        }

        public static java.lang.CharSequence getDisplayLabel(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.CharSequence arg2) {
            return android.provider.Contacts.Organizations.getDisplayLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.Contacts.Organizations.CONTENT_DIRECTORY;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Organizations.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.Organizations.DEFAULT_SORT_ORDER;

    }
    public static final class People {
        private final android.provider.Contacts.People real;

        public People(android.provider.Contacts.People real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.People wrap(android.provider.Contacts.People real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.People(real);
        }

        public android.provider.Contacts.People unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.Uri addToGroup(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, long arg2) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.People.addToGroup(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public static com.micklab.dcg.wrapper.android.net.Uri addToGroup(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.People.addToGroup(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public static com.micklab.dcg.wrapper.android.net.Uri addToMyContactsGroup(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.People.addToMyContactsGroup(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public static com.micklab.dcg.wrapper.android.net.Uri createPersonInMyContactsGroup(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.People.createPersonInMyContactsGroup(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static com.micklab.dcg.wrapper.android.graphics.Bitmap loadContactPhoto(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg3) {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.provider.Contacts.People.loadContactPhoto(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public static void markAsContacted(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1) {
            android.provider.Contacts.People.markAsContacted(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static java.io.InputStream openContactPhotoInputStream(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            return android.provider.Contacts.People.openContactPhotoInputStream(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public static com.micklab.dcg.wrapper.android.database.Cursor queryGroups(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.database.Cursor.wrap(android.provider.Contacts.People.queryGroups(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public static void setPhotoData(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, byte[] arg2) {
            android.provider.Contacts.People.setPhotoData(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.People.CONTENT_FILTER_URI);
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.Contacts.People.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.Contacts.People.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.People.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.People.DEFAULT_SORT_ORDER;
        public static final com.micklab.dcg.wrapper.android.net.Uri DELETED_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.People.DELETED_CONTENT_URI);
        public static final java.lang.String PRIMARY_EMAIL_ID = android.provider.Contacts.People.PRIMARY_EMAIL_ID;
        public static final java.lang.String PRIMARY_ORGANIZATION_ID = android.provider.Contacts.People.PRIMARY_ORGANIZATION_ID;
        public static final java.lang.String PRIMARY_PHONE_ID = android.provider.Contacts.People.PRIMARY_PHONE_ID;

        public static final class ContactMethods {
            private final android.provider.Contacts.People.ContactMethods real;

            public ContactMethods(android.provider.Contacts.People.ContactMethods real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.Contacts.People.ContactMethods wrap(android.provider.Contacts.People.ContactMethods real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.People.ContactMethods(real);
            }

            public android.provider.Contacts.People.ContactMethods unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.Contacts.People.ContactMethods.CONTENT_DIRECTORY;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.People.ContactMethods.DEFAULT_SORT_ORDER;

        }
        public static final class Extensions {
            private final android.provider.Contacts.People.Extensions real;

            public Extensions(android.provider.Contacts.People.Extensions real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.Contacts.People.Extensions wrap(android.provider.Contacts.People.Extensions real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.People.Extensions(real);
            }

            public android.provider.Contacts.People.Extensions unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.Contacts.People.Extensions.CONTENT_DIRECTORY;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.People.Extensions.DEFAULT_SORT_ORDER;
            public static final java.lang.String PERSON_ID = android.provider.Contacts.People.Extensions.PERSON_ID;

        }
        public static final class Phones {
            private final android.provider.Contacts.People.Phones real;

            public Phones(android.provider.Contacts.People.Phones real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.Contacts.People.Phones wrap(android.provider.Contacts.People.Phones real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.People.Phones(real);
            }

            public android.provider.Contacts.People.Phones unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.Contacts.People.Phones.CONTENT_DIRECTORY;
            public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.People.Phones.DEFAULT_SORT_ORDER;

        }
    }
    public static final class PeopleColumns {
        private final android.provider.Contacts.PeopleColumns real;

        public PeopleColumns(android.provider.Contacts.PeopleColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.PeopleColumns wrap(android.provider.Contacts.PeopleColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.PeopleColumns(real);
        }

        public android.provider.Contacts.PeopleColumns unwrap() {
            return real;
        }

        public static final java.lang.String CUSTOM_RINGTONE = android.provider.Contacts.PeopleColumns.CUSTOM_RINGTONE;
        public static final java.lang.String DISPLAY_NAME = android.provider.Contacts.PeopleColumns.DISPLAY_NAME;
        public static final java.lang.String LAST_TIME_CONTACTED = android.provider.Contacts.PeopleColumns.LAST_TIME_CONTACTED;
        public static final java.lang.String NAME = android.provider.Contacts.PeopleColumns.NAME;
        public static final java.lang.String NOTES = android.provider.Contacts.PeopleColumns.NOTES;
        public static final java.lang.String PHONETIC_NAME = android.provider.Contacts.PeopleColumns.PHONETIC_NAME;
        public static final java.lang.String PHOTO_VERSION = android.provider.Contacts.PeopleColumns.PHOTO_VERSION;
        public static final java.lang.String SEND_TO_VOICEMAIL = android.provider.Contacts.PeopleColumns.SEND_TO_VOICEMAIL;
        public static final java.lang.String STARRED = android.provider.Contacts.PeopleColumns.STARRED;
        public static final java.lang.String TIMES_CONTACTED = android.provider.Contacts.PeopleColumns.TIMES_CONTACTED;

    }
    public static final class Phones {
        private final android.provider.Contacts.Phones real;

        public Phones(android.provider.Contacts.Phones real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.Phones wrap(android.provider.Contacts.Phones real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Phones(real);
        }

        public android.provider.Contacts.Phones unwrap() {
            return real;
        }

        public static java.lang.CharSequence getDisplayLabel(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.CharSequence arg2) {
            return android.provider.Contacts.Phones.getDisplayLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public static java.lang.CharSequence getDisplayLabel(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.CharSequence arg2, java.lang.CharSequence[] arg3) {
            return android.provider.Contacts.Phones.getDisplayLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URL = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Phones.CONTENT_FILTER_URL);
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.Contacts.Phones.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.Contacts.Phones.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Phones.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.Phones.DEFAULT_SORT_ORDER;
        public static final java.lang.String PERSON_ID = android.provider.Contacts.Phones.PERSON_ID;

    }
    public static final class PhonesColumns {
        private final android.provider.Contacts.PhonesColumns real;

        public PhonesColumns(android.provider.Contacts.PhonesColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.PhonesColumns wrap(android.provider.Contacts.PhonesColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.PhonesColumns(real);
        }

        public android.provider.Contacts.PhonesColumns unwrap() {
            return real;
        }

        public static final java.lang.String ISPRIMARY = android.provider.Contacts.PhonesColumns.ISPRIMARY;
        public static final java.lang.String LABEL = android.provider.Contacts.PhonesColumns.LABEL;
        public static final java.lang.String NUMBER = android.provider.Contacts.PhonesColumns.NUMBER;
        public static final java.lang.String NUMBER_KEY = android.provider.Contacts.PhonesColumns.NUMBER_KEY;
        public static final java.lang.String TYPE = android.provider.Contacts.PhonesColumns.TYPE;
        public static final int TYPE_CUSTOM = android.provider.Contacts.PhonesColumns.TYPE_CUSTOM;
        public static final int TYPE_FAX_HOME = android.provider.Contacts.PhonesColumns.TYPE_FAX_HOME;
        public static final int TYPE_FAX_WORK = android.provider.Contacts.PhonesColumns.TYPE_FAX_WORK;
        public static final int TYPE_HOME = android.provider.Contacts.PhonesColumns.TYPE_HOME;
        public static final int TYPE_MOBILE = android.provider.Contacts.PhonesColumns.TYPE_MOBILE;
        public static final int TYPE_OTHER = android.provider.Contacts.PhonesColumns.TYPE_OTHER;
        public static final int TYPE_PAGER = android.provider.Contacts.PhonesColumns.TYPE_PAGER;
        public static final int TYPE_WORK = android.provider.Contacts.PhonesColumns.TYPE_WORK;

    }
    public static final class Photos {
        private final android.provider.Contacts.Photos real;

        public Photos(android.provider.Contacts.Photos real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.Photos wrap(android.provider.Contacts.Photos real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Photos(real);
        }

        public android.provider.Contacts.Photos unwrap() {
            return real;
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.Contacts.Photos.CONTENT_DIRECTORY;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Photos.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.Photos.DEFAULT_SORT_ORDER;

    }
    public static final class PhotosColumns {
        private final android.provider.Contacts.PhotosColumns real;

        public PhotosColumns(android.provider.Contacts.PhotosColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.PhotosColumns wrap(android.provider.Contacts.PhotosColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.PhotosColumns(real);
        }

        public android.provider.Contacts.PhotosColumns unwrap() {
            return real;
        }

        public static final java.lang.String DATA = android.provider.Contacts.PhotosColumns.DATA;
        public static final java.lang.String DOWNLOAD_REQUIRED = android.provider.Contacts.PhotosColumns.DOWNLOAD_REQUIRED;
        public static final java.lang.String EXISTS_ON_SERVER = android.provider.Contacts.PhotosColumns.EXISTS_ON_SERVER;
        public static final java.lang.String LOCAL_VERSION = android.provider.Contacts.PhotosColumns.LOCAL_VERSION;
        public static final java.lang.String PERSON_ID = android.provider.Contacts.PhotosColumns.PERSON_ID;
        public static final java.lang.String SYNC_ERROR = android.provider.Contacts.PhotosColumns.SYNC_ERROR;

    }
    public static final class PresenceColumns {
        private final android.provider.Contacts.PresenceColumns real;

        public PresenceColumns(android.provider.Contacts.PresenceColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.PresenceColumns wrap(android.provider.Contacts.PresenceColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.PresenceColumns(real);
        }

        public android.provider.Contacts.PresenceColumns unwrap() {
            return real;
        }

        public static final int AVAILABLE = android.provider.Contacts.PresenceColumns.AVAILABLE;
        public static final int AWAY = android.provider.Contacts.PresenceColumns.AWAY;
        public static final int DO_NOT_DISTURB = android.provider.Contacts.PresenceColumns.DO_NOT_DISTURB;
        public static final int IDLE = android.provider.Contacts.PresenceColumns.IDLE;
        public static final java.lang.String IM_ACCOUNT = android.provider.Contacts.PresenceColumns.IM_ACCOUNT;
        public static final java.lang.String IM_HANDLE = android.provider.Contacts.PresenceColumns.IM_HANDLE;
        public static final java.lang.String IM_PROTOCOL = android.provider.Contacts.PresenceColumns.IM_PROTOCOL;
        public static final int INVISIBLE = android.provider.Contacts.PresenceColumns.INVISIBLE;
        public static final int OFFLINE = android.provider.Contacts.PresenceColumns.OFFLINE;
        public static final java.lang.String PRESENCE_CUSTOM_STATUS = android.provider.Contacts.PresenceColumns.PRESENCE_CUSTOM_STATUS;
        public static final java.lang.String PRESENCE_STATUS = android.provider.Contacts.PresenceColumns.PRESENCE_STATUS;
        public static final java.lang.String PRIORITY = android.provider.Contacts.PresenceColumns.PRIORITY;

    }
    public static final class Settings {
        private final android.provider.Contacts.Settings real;

        public Settings(android.provider.Contacts.Settings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.Settings wrap(android.provider.Contacts.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.Settings(real);
        }

        public android.provider.Contacts.Settings unwrap() {
            return real;
        }

        public static java.lang.String getSetting(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, java.lang.String arg2) {
            return android.provider.Contacts.Settings.getSetting(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public static void setSetting(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
            android.provider.Contacts.Settings.setSetting(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.Contacts.Settings.CONTENT_DIRECTORY;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.Contacts.Settings.CONTENT_URI);
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.Contacts.Settings.DEFAULT_SORT_ORDER;
        public static final java.lang.String SYNC_EVERYTHING = android.provider.Contacts.Settings.SYNC_EVERYTHING;

    }
    public static final class SettingsColumns {
        private final android.provider.Contacts.SettingsColumns real;

        public SettingsColumns(android.provider.Contacts.SettingsColumns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.Contacts.SettingsColumns wrap(android.provider.Contacts.SettingsColumns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.Contacts.SettingsColumns(real);
        }

        public android.provider.Contacts.SettingsColumns unwrap() {
            return real;
        }

        public static final java.lang.String KEY = android.provider.Contacts.SettingsColumns.KEY;
        public static final java.lang.String VALUE = android.provider.Contacts.SettingsColumns.VALUE;
        public static final java.lang.String _SYNC_ACCOUNT = android.provider.Contacts.SettingsColumns._SYNC_ACCOUNT;
        public static final java.lang.String _SYNC_ACCOUNT_TYPE = android.provider.Contacts.SettingsColumns._SYNC_ACCOUNT_TYPE;

    }
}
