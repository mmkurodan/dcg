// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class ContactsContract {
    private final android.provider.ContactsContract real;

    public ContactsContract(android.provider.ContactsContract real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.ContactsContract wrap(android.provider.ContactsContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract(real);
    }

    public android.provider.ContactsContract unwrap() {
        return real;
    }

    public ContactsContract() {
        this(new android.provider.ContactsContract());
    }

    public static boolean isProfileId(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.ContactsContract#isProfileId(long)");
    }

    public static final java.lang.String AUTHORITY = android.provider.ContactsContract.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri AUTHORITY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.AUTHORITY_URI);
    public static final java.lang.String CALLER_IS_SYNCADAPTER = android.provider.ContactsContract.CALLER_IS_SYNCADAPTER;
    public static final java.lang.String DEFERRED_SNIPPETING = android.provider.ContactsContract.DEFERRED_SNIPPETING;
    public static final java.lang.String DEFERRED_SNIPPETING_QUERY = android.provider.ContactsContract.DEFERRED_SNIPPETING_QUERY;
    public static final java.lang.String DIRECTORY_PARAM_KEY = android.provider.ContactsContract.DIRECTORY_PARAM_KEY;
    public static final java.lang.String LIMIT_PARAM_KEY = android.provider.ContactsContract.LIMIT_PARAM_KEY;
    public static final java.lang.String PRIMARY_ACCOUNT_NAME = android.provider.ContactsContract.PRIMARY_ACCOUNT_NAME;
    public static final java.lang.String PRIMARY_ACCOUNT_TYPE = android.provider.ContactsContract.PRIMARY_ACCOUNT_TYPE;
    public static final java.lang.String REMOVE_DUPLICATE_ENTRIES = android.provider.ContactsContract.REMOVE_DUPLICATE_ENTRIES;
    public static final java.lang.String STREQUENT_PHONE_ONLY = android.provider.ContactsContract.STREQUENT_PHONE_ONLY;

    public static final class AggregationExceptions {
        private final android.provider.ContactsContract.AggregationExceptions real;

        public AggregationExceptions(android.provider.ContactsContract.AggregationExceptions real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.AggregationExceptions wrap(android.provider.ContactsContract.AggregationExceptions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.AggregationExceptions(real);
        }

        public android.provider.ContactsContract.AggregationExceptions unwrap() {
            return real;
        }

        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.AggregationExceptions.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.AggregationExceptions.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.AggregationExceptions.CONTENT_URI);
        public static final java.lang.String RAW_CONTACT_ID1 = android.provider.ContactsContract.AggregationExceptions.RAW_CONTACT_ID1;
        public static final java.lang.String RAW_CONTACT_ID2 = android.provider.ContactsContract.AggregationExceptions.RAW_CONTACT_ID2;
        public static final java.lang.String TYPE = android.provider.ContactsContract.AggregationExceptions.TYPE;
        public static final int TYPE_AUTOMATIC = android.provider.ContactsContract.AggregationExceptions.TYPE_AUTOMATIC;
        public static final int TYPE_KEEP_SEPARATE = android.provider.ContactsContract.AggregationExceptions.TYPE_KEEP_SEPARATE;
        public static final int TYPE_KEEP_TOGETHER = android.provider.ContactsContract.AggregationExceptions.TYPE_KEEP_TOGETHER;

    }
    public static final class CommonDataKinds {
        private final android.provider.ContactsContract.CommonDataKinds real;

        public CommonDataKinds(android.provider.ContactsContract.CommonDataKinds real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds wrap(android.provider.ContactsContract.CommonDataKinds real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds(real);
        }

        public android.provider.ContactsContract.CommonDataKinds unwrap() {
            return real;
        }

        public static final class BaseTypes {
            private final android.provider.ContactsContract.CommonDataKinds.BaseTypes real;

            public BaseTypes(android.provider.ContactsContract.CommonDataKinds.BaseTypes real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.BaseTypes wrap(android.provider.ContactsContract.CommonDataKinds.BaseTypes real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.BaseTypes(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.BaseTypes unwrap() {
                return real;
            }

            public static final int TYPE_CUSTOM = android.provider.ContactsContract.CommonDataKinds.BaseTypes.TYPE_CUSTOM;

        }
        public static final class Callable {
            private final android.provider.ContactsContract.CommonDataKinds.Callable real;

            public Callable(android.provider.ContactsContract.CommonDataKinds.Callable real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Callable wrap(android.provider.ContactsContract.CommonDataKinds.Callable real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Callable(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Callable unwrap() {
                return real;
            }

            public Callable() {
                this(new android.provider.ContactsContract.CommonDataKinds.Callable());
            }

            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Callable.CONTENT_FILTER_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Callable.CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Callable.ENTERPRISE_CONTENT_FILTER_URI);
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Callable.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Callable.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Callable.EXTRA_ADDRESS_BOOK_INDEX_TITLES;

        }
        public static final class Contactables {
            private final android.provider.ContactsContract.CommonDataKinds.Contactables real;

            public Contactables(android.provider.ContactsContract.CommonDataKinds.Contactables real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Contactables wrap(android.provider.ContactsContract.CommonDataKinds.Contactables real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Contactables(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Contactables unwrap() {
                return real;
            }

            public Contactables() {
                this(new android.provider.ContactsContract.CommonDataKinds.Contactables());
            }

            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Contactables.CONTENT_FILTER_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Contactables.CONTENT_URI);
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Contactables.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Contactables.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Contactables.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String VISIBLE_CONTACTS_ONLY = android.provider.ContactsContract.CommonDataKinds.Contactables.VISIBLE_CONTACTS_ONLY;

        }
        public static final class Email {
            private final android.provider.ContactsContract.CommonDataKinds.Email real;

            public Email(android.provider.ContactsContract.CommonDataKinds.Email real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Email wrap(android.provider.ContactsContract.CommonDataKinds.Email real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Email(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Email unwrap() {
                return real;
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(arg0);
            }

            public static final java.lang.String ADDRESS = android.provider.ContactsContract.CommonDataKinds.Email.ADDRESS;
            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI);
            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_LOOKUP_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_LOOKUP_URI);
            public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI);
            public static final java.lang.String DISPLAY_NAME = android.provider.ContactsContract.CommonDataKinds.Email.DISPLAY_NAME;
            public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_FILTER_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_LOOKUP_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_LOOKUP_URI);
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Email.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Email.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Email.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final int TYPE_HOME = android.provider.ContactsContract.CommonDataKinds.Email.TYPE_HOME;
            public static final int TYPE_MOBILE = android.provider.ContactsContract.CommonDataKinds.Email.TYPE_MOBILE;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.Email.TYPE_OTHER;
            public static final int TYPE_WORK = android.provider.ContactsContract.CommonDataKinds.Email.TYPE_WORK;

        }
        public static final class Event {
            private final android.provider.ContactsContract.CommonDataKinds.Event real;

            public Event(android.provider.ContactsContract.CommonDataKinds.Event real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Event wrap(android.provider.ContactsContract.CommonDataKinds.Event real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Event(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Event unwrap() {
                return real;
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.Event.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeResource(java.lang.Integer arg0) {
                return android.provider.ContactsContract.CommonDataKinds.Event.getTypeResource(arg0);
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Event.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Event.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Event.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Event.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String START_DATE = android.provider.ContactsContract.CommonDataKinds.Event.START_DATE;
            public static final int TYPE_ANNIVERSARY = android.provider.ContactsContract.CommonDataKinds.Event.TYPE_ANNIVERSARY;
            public static final int TYPE_BIRTHDAY = android.provider.ContactsContract.CommonDataKinds.Event.TYPE_BIRTHDAY;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.Event.TYPE_OTHER;

        }
        public static final class GroupMembership {
            private final android.provider.ContactsContract.CommonDataKinds.GroupMembership real;

            public GroupMembership(android.provider.ContactsContract.CommonDataKinds.GroupMembership real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.GroupMembership wrap(android.provider.ContactsContract.CommonDataKinds.GroupMembership real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.GroupMembership(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.GroupMembership unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.GroupMembership.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.GroupMembership.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.GroupMembership.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.GroupMembership.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String GROUP_ROW_ID = android.provider.ContactsContract.CommonDataKinds.GroupMembership.GROUP_ROW_ID;
            public static final java.lang.String GROUP_SOURCE_ID = android.provider.ContactsContract.CommonDataKinds.GroupMembership.GROUP_SOURCE_ID;

        }
        public static final class Identity {
            private final android.provider.ContactsContract.CommonDataKinds.Identity real;

            public Identity(android.provider.ContactsContract.CommonDataKinds.Identity real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Identity wrap(android.provider.ContactsContract.CommonDataKinds.Identity real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Identity(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Identity unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Identity.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Identity.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Identity.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Identity.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String IDENTITY = android.provider.ContactsContract.CommonDataKinds.Identity.IDENTITY;
            public static final java.lang.String NAMESPACE = android.provider.ContactsContract.CommonDataKinds.Identity.NAMESPACE;

        }
        public static final class Im {
            private final android.provider.ContactsContract.CommonDataKinds.Im real;

            public Im(android.provider.ContactsContract.CommonDataKinds.Im real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Im wrap(android.provider.ContactsContract.CommonDataKinds.Im real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Im(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Im unwrap() {
                return real;
            }

            public static java.lang.CharSequence getProtocolLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getProtocolLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(arg0);
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.Im.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.Im.getTypeLabelResource(arg0);
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Im.CONTENT_ITEM_TYPE;
            public static final java.lang.String CUSTOM_PROTOCOL = android.provider.ContactsContract.CommonDataKinds.Im.CUSTOM_PROTOCOL;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Im.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Im.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Im.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String PROTOCOL = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL;
            public static final int PROTOCOL_AIM = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_AIM;
            public static final int PROTOCOL_CUSTOM = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_CUSTOM;
            public static final int PROTOCOL_GOOGLE_TALK = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_GOOGLE_TALK;
            public static final int PROTOCOL_ICQ = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_ICQ;
            public static final int PROTOCOL_JABBER = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_JABBER;
            public static final int PROTOCOL_MSN = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_MSN;
            public static final int PROTOCOL_NETMEETING = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_NETMEETING;
            public static final int PROTOCOL_QQ = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_QQ;
            public static final int PROTOCOL_SKYPE = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_SKYPE;
            public static final int PROTOCOL_YAHOO = android.provider.ContactsContract.CommonDataKinds.Im.PROTOCOL_YAHOO;
            public static final int TYPE_HOME = android.provider.ContactsContract.CommonDataKinds.Im.TYPE_HOME;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.Im.TYPE_OTHER;
            public static final int TYPE_WORK = android.provider.ContactsContract.CommonDataKinds.Im.TYPE_WORK;

        }
        public static final class Nickname {
            private final android.provider.ContactsContract.CommonDataKinds.Nickname real;

            public Nickname(android.provider.ContactsContract.CommonDataKinds.Nickname real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Nickname wrap(android.provider.ContactsContract.CommonDataKinds.Nickname real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Nickname(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Nickname unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Nickname.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Nickname.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Nickname.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Nickname.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String NAME = android.provider.ContactsContract.CommonDataKinds.Nickname.NAME;
            public static final int TYPE_DEFAULT = android.provider.ContactsContract.CommonDataKinds.Nickname.TYPE_DEFAULT;
            public static final int TYPE_INITIALS = android.provider.ContactsContract.CommonDataKinds.Nickname.TYPE_INITIALS;
            public static final int TYPE_MAIDEN_NAME = android.provider.ContactsContract.CommonDataKinds.Nickname.TYPE_MAIDEN_NAME;
            public static final int TYPE_MAINDEN_NAME = android.provider.ContactsContract.CommonDataKinds.Nickname.TYPE_MAINDEN_NAME;
            public static final int TYPE_OTHER_NAME = android.provider.ContactsContract.CommonDataKinds.Nickname.TYPE_OTHER_NAME;
            public static final int TYPE_SHORT_NAME = android.provider.ContactsContract.CommonDataKinds.Nickname.TYPE_SHORT_NAME;

        }
        public static final class Note {
            private final android.provider.ContactsContract.CommonDataKinds.Note real;

            public Note(android.provider.ContactsContract.CommonDataKinds.Note real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Note wrap(android.provider.ContactsContract.CommonDataKinds.Note real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Note(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Note unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Note.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Note.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Note.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Note.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String NOTE = android.provider.ContactsContract.CommonDataKinds.Note.NOTE;

        }
        public static final class Organization {
            private final android.provider.ContactsContract.CommonDataKinds.Organization real;

            public Organization(android.provider.ContactsContract.CommonDataKinds.Organization real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Organization wrap(android.provider.ContactsContract.CommonDataKinds.Organization real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Organization(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Organization unwrap() {
                return real;
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.Organization.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.Organization.getTypeLabelResource(arg0);
            }

            public static final java.lang.String COMPANY = android.provider.ContactsContract.CommonDataKinds.Organization.COMPANY;
            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Organization.CONTENT_ITEM_TYPE;
            public static final java.lang.String DEPARTMENT = android.provider.ContactsContract.CommonDataKinds.Organization.DEPARTMENT;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Organization.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Organization.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Organization.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String JOB_DESCRIPTION = android.provider.ContactsContract.CommonDataKinds.Organization.JOB_DESCRIPTION;
            public static final java.lang.String OFFICE_LOCATION = android.provider.ContactsContract.CommonDataKinds.Organization.OFFICE_LOCATION;
            public static final java.lang.String PHONETIC_NAME = android.provider.ContactsContract.CommonDataKinds.Organization.PHONETIC_NAME;
            public static final java.lang.String PHONETIC_NAME_STYLE = android.provider.ContactsContract.CommonDataKinds.Organization.PHONETIC_NAME_STYLE;
            public static final java.lang.String SYMBOL = android.provider.ContactsContract.CommonDataKinds.Organization.SYMBOL;
            public static final java.lang.String TITLE = android.provider.ContactsContract.CommonDataKinds.Organization.TITLE;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.Organization.TYPE_OTHER;
            public static final int TYPE_WORK = android.provider.ContactsContract.CommonDataKinds.Organization.TYPE_WORK;

        }
        public static final class Phone {
            private final android.provider.ContactsContract.CommonDataKinds.Phone real;

            public Phone(android.provider.ContactsContract.CommonDataKinds.Phone real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Phone wrap(android.provider.ContactsContract.CommonDataKinds.Phone real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Phone(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Phone unwrap() {
                return real;
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(arg0);
            }

            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI);
            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE;
            public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Phone.ENTERPRISE_CONTENT_FILTER_URI);
            public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.Phone.ENTERPRISE_CONTENT_URI);
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Phone.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Phone.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Phone.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String NORMALIZED_NUMBER = android.provider.ContactsContract.CommonDataKinds.Phone.NORMALIZED_NUMBER;
            public static final java.lang.String NUMBER = android.provider.ContactsContract.CommonDataKinds.Phone.NUMBER;
            public static final java.lang.String SEARCH_DISPLAY_NAME_KEY = android.provider.ContactsContract.CommonDataKinds.Phone.SEARCH_DISPLAY_NAME_KEY;
            public static final java.lang.String SEARCH_PHONE_NUMBER_KEY = android.provider.ContactsContract.CommonDataKinds.Phone.SEARCH_PHONE_NUMBER_KEY;
            public static final int TYPE_ASSISTANT = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_ASSISTANT;
            public static final int TYPE_CALLBACK = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_CALLBACK;
            public static final int TYPE_CAR = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_CAR;
            public static final int TYPE_COMPANY_MAIN = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_COMPANY_MAIN;
            public static final int TYPE_FAX_HOME = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_FAX_HOME;
            public static final int TYPE_FAX_WORK = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_FAX_WORK;
            public static final int TYPE_HOME = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_HOME;
            public static final int TYPE_ISDN = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_ISDN;
            public static final int TYPE_MAIN = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_MAIN;
            public static final int TYPE_MMS = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_MMS;
            public static final int TYPE_MOBILE = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_OTHER;
            public static final int TYPE_OTHER_FAX = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_OTHER_FAX;
            public static final int TYPE_PAGER = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_PAGER;
            public static final int TYPE_RADIO = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_RADIO;
            public static final int TYPE_TELEX = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_TELEX;
            public static final int TYPE_TTY_TDD = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_TTY_TDD;
            public static final int TYPE_WORK = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_WORK;
            public static final int TYPE_WORK_MOBILE = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_WORK_MOBILE;
            public static final int TYPE_WORK_PAGER = android.provider.ContactsContract.CommonDataKinds.Phone.TYPE_WORK_PAGER;

        }
        public static final class Photo {
            private final android.provider.ContactsContract.CommonDataKinds.Photo real;

            public Photo(android.provider.ContactsContract.CommonDataKinds.Photo real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Photo wrap(android.provider.ContactsContract.CommonDataKinds.Photo real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Photo(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Photo unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Photo.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Photo.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Photo.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Photo.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String PHOTO = android.provider.ContactsContract.CommonDataKinds.Photo.PHOTO;

        }
        public static final class Relation {
            private final android.provider.ContactsContract.CommonDataKinds.Relation real;

            public Relation(android.provider.ContactsContract.CommonDataKinds.Relation real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Relation wrap(android.provider.ContactsContract.CommonDataKinds.Relation real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Relation(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Relation unwrap() {
                return real;
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.Relation.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.Relation.getTypeLabelResource(arg0);
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Relation.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Relation.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Relation.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Relation.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String NAME = android.provider.ContactsContract.CommonDataKinds.Relation.NAME;
            public static final int TYPE_ASSISTANT = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_ASSISTANT;
            public static final int TYPE_BROTHER = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_BROTHER;
            public static final int TYPE_CHILD = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_CHILD;
            public static final int TYPE_DOMESTIC_PARTNER = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_DOMESTIC_PARTNER;
            public static final int TYPE_FATHER = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_FATHER;
            public static final int TYPE_FRIEND = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_FRIEND;
            public static final int TYPE_MANAGER = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_MANAGER;
            public static final int TYPE_MOTHER = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_MOTHER;
            public static final int TYPE_PARENT = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_PARENT;
            public static final int TYPE_PARTNER = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_PARTNER;
            public static final int TYPE_REFERRED_BY = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_REFERRED_BY;
            public static final int TYPE_RELATIVE = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_RELATIVE;
            public static final int TYPE_SISTER = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_SISTER;
            public static final int TYPE_SPOUSE = android.provider.ContactsContract.CommonDataKinds.Relation.TYPE_SPOUSE;

        }
        public static final class SipAddress {
            private final android.provider.ContactsContract.CommonDataKinds.SipAddress real;

            public SipAddress(android.provider.ContactsContract.CommonDataKinds.SipAddress real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.SipAddress wrap(android.provider.ContactsContract.CommonDataKinds.SipAddress real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.SipAddress(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.SipAddress unwrap() {
                return real;
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.SipAddress.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.SipAddress.getTypeLabelResource(arg0);
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.SipAddress.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.SipAddress.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.SipAddress.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.SipAddress.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String SIP_ADDRESS = android.provider.ContactsContract.CommonDataKinds.SipAddress.SIP_ADDRESS;
            public static final int TYPE_HOME = android.provider.ContactsContract.CommonDataKinds.SipAddress.TYPE_HOME;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.SipAddress.TYPE_OTHER;
            public static final int TYPE_WORK = android.provider.ContactsContract.CommonDataKinds.SipAddress.TYPE_WORK;

        }
        public static final class StructuredName {
            private final android.provider.ContactsContract.CommonDataKinds.StructuredName real;

            public StructuredName(android.provider.ContactsContract.CommonDataKinds.StructuredName real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.StructuredName wrap(android.provider.ContactsContract.CommonDataKinds.StructuredName real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.StructuredName(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.StructuredName unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE;
            public static final java.lang.String DISPLAY_NAME = android.provider.ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.StructuredName.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.StructuredName.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.StructuredName.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String FAMILY_NAME = android.provider.ContactsContract.CommonDataKinds.StructuredName.FAMILY_NAME;
            public static final java.lang.String FULL_NAME_STYLE = android.provider.ContactsContract.CommonDataKinds.StructuredName.FULL_NAME_STYLE;
            public static final java.lang.String GIVEN_NAME = android.provider.ContactsContract.CommonDataKinds.StructuredName.GIVEN_NAME;
            public static final java.lang.String MIDDLE_NAME = android.provider.ContactsContract.CommonDataKinds.StructuredName.MIDDLE_NAME;
            public static final java.lang.String PHONETIC_FAMILY_NAME = android.provider.ContactsContract.CommonDataKinds.StructuredName.PHONETIC_FAMILY_NAME;
            public static final java.lang.String PHONETIC_GIVEN_NAME = android.provider.ContactsContract.CommonDataKinds.StructuredName.PHONETIC_GIVEN_NAME;
            public static final java.lang.String PHONETIC_MIDDLE_NAME = android.provider.ContactsContract.CommonDataKinds.StructuredName.PHONETIC_MIDDLE_NAME;
            public static final java.lang.String PHONETIC_NAME_STYLE = android.provider.ContactsContract.CommonDataKinds.StructuredName.PHONETIC_NAME_STYLE;
            public static final java.lang.String PREFIX = android.provider.ContactsContract.CommonDataKinds.StructuredName.PREFIX;
            public static final java.lang.String SUFFIX = android.provider.ContactsContract.CommonDataKinds.StructuredName.SUFFIX;

        }
        public static final class StructuredPostal {
            private final android.provider.ContactsContract.CommonDataKinds.StructuredPostal real;

            public StructuredPostal(android.provider.ContactsContract.CommonDataKinds.StructuredPostal real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.StructuredPostal wrap(android.provider.ContactsContract.CommonDataKinds.StructuredPostal real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.StructuredPostal(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.StructuredPostal unwrap() {
                return real;
            }

            public static java.lang.CharSequence getTypeLabel(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1, java.lang.CharSequence arg2) {
                return android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
            }

            public static int getTypeLabelResource(int arg0) {
                return android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(arg0);
            }

            public static final java.lang.String CITY = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CITY;
            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE;
            public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_TYPE;
            public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI);
            public static final java.lang.String COUNTRY = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.COUNTRY;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final java.lang.String FORMATTED_ADDRESS = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.FORMATTED_ADDRESS;
            public static final java.lang.String NEIGHBORHOOD = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.NEIGHBORHOOD;
            public static final java.lang.String POBOX = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.POBOX;
            public static final java.lang.String POSTCODE = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.POSTCODE;
            public static final java.lang.String REGION = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.REGION;
            public static final java.lang.String STREET = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.STREET;
            public static final int TYPE_HOME = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.TYPE_HOME;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.TYPE_OTHER;
            public static final int TYPE_WORK = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.TYPE_WORK;

        }
        public static final class Website {
            private final android.provider.ContactsContract.CommonDataKinds.Website real;

            public Website(android.provider.ContactsContract.CommonDataKinds.Website real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Website wrap(android.provider.ContactsContract.CommonDataKinds.Website real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.CommonDataKinds.Website(real);
            }

            public android.provider.ContactsContract.CommonDataKinds.Website unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.CommonDataKinds.Website.CONTENT_ITEM_TYPE;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.CommonDataKinds.Website.EXTRA_ADDRESS_BOOK_INDEX;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.CommonDataKinds.Website.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
            public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.CommonDataKinds.Website.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
            public static final int TYPE_BLOG = android.provider.ContactsContract.CommonDataKinds.Website.TYPE_BLOG;
            public static final int TYPE_FTP = android.provider.ContactsContract.CommonDataKinds.Website.TYPE_FTP;
            public static final int TYPE_HOME = android.provider.ContactsContract.CommonDataKinds.Website.TYPE_HOME;
            public static final int TYPE_HOMEPAGE = android.provider.ContactsContract.CommonDataKinds.Website.TYPE_HOMEPAGE;
            public static final int TYPE_OTHER = android.provider.ContactsContract.CommonDataKinds.Website.TYPE_OTHER;
            public static final int TYPE_WORK = android.provider.ContactsContract.CommonDataKinds.Website.TYPE_WORK;
            public static final java.lang.String URL = android.provider.ContactsContract.CommonDataKinds.Website.URL;

        }
    }
    public static final class Contacts {
        private final android.provider.ContactsContract.Contacts real;

        public Contacts(android.provider.ContactsContract.Contacts real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts wrap(android.provider.ContactsContract.Contacts real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts(real);
        }

        public android.provider.ContactsContract.Contacts unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getLookupUri(long arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.getLookupUri(arg0, arg1));
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getLookupUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.getLookupUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static boolean isEnterpriseContactId(long arg0) {
            return android.provider.ContactsContract.Contacts.isEnterpriseContactId(arg0);
        }

        public static com.micklab.dcg.wrapper.android.net.Uri lookupContact(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.lookupContact(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static void markAsContacted(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1) {
            android.provider.ContactsContract.Contacts.markAsContacted(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static java.io.InputStream openContactPhotoInputStream(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public static java.io.InputStream openContactPhotoInputStream(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, boolean arg2) {
            return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_FILTER_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FREQUENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_FREQUENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_GROUP_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_GROUP_URI);
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.Contacts.CONTENT_ITEM_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_LOOKUP_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_MULTI_VCARD_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_MULTI_VCARD_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_STREQUENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_STREQUENT_FILTER_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_STREQUENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_STREQUENT_URI);
        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.Contacts.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_URI);
        public static final java.lang.String CONTENT_VCARD_TYPE = android.provider.ContactsContract.Contacts.CONTENT_VCARD_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_VCARD_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.CONTENT_VCARD_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.ENTERPRISE_CONTENT_FILTER_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Contacts.ENTERPRISE_CONTENT_URI);
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.Contacts.EXTRA_ADDRESS_BOOK_INDEX;
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.Contacts.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.Contacts.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
        public static final java.lang.String QUERY_PARAMETER_VCARD_NO_PHOTO = android.provider.ContactsContract.Contacts.QUERY_PARAMETER_VCARD_NO_PHOTO;

        public static final class AggregationSuggestions {
            private final android.provider.ContactsContract.Contacts.AggregationSuggestions real;

            public AggregationSuggestions(android.provider.ContactsContract.Contacts.AggregationSuggestions real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions wrap(android.provider.ContactsContract.Contacts.AggregationSuggestions real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions(real);
            }

            public android.provider.ContactsContract.Contacts.AggregationSuggestions unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.Contacts.AggregationSuggestions.CONTENT_DIRECTORY;

            public static final class Builder {
                private final android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder real;

                public Builder(android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder real) {
                    this.real = real;
                }

                public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder wrap(android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder real) {
                    return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder(real);
                }

                public android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder unwrap() {
                    return real;
                }

                public Builder() {
                    this(new android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder());
                }

                public com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder addNameParameter(java.lang.String arg0) {
                    return com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder.wrap(real.addNameParameter(arg0));
                }

                public com.micklab.dcg.wrapper.android.net.Uri build() {
                    return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.build());
                }

                public com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder setContactId(long arg0) {
                    return com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder.wrap(real.setContactId(arg0));
                }

                public com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder setLimit(int arg0) {
                    return com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.AggregationSuggestions.Builder.wrap(real.setLimit(arg0));
                }

            }
        }
        public static final class Data {
            private final android.provider.ContactsContract.Contacts.Data real;

            public Data(android.provider.ContactsContract.Contacts.Data real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.Data wrap(android.provider.ContactsContract.Contacts.Data real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.Data(real);
            }

            public android.provider.ContactsContract.Contacts.Data unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.Contacts.Data.CONTENT_DIRECTORY;

        }
        public static final class Entity {
            private final android.provider.ContactsContract.Contacts.Entity real;

            public Entity(android.provider.ContactsContract.Contacts.Entity real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.Entity wrap(android.provider.ContactsContract.Contacts.Entity real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.Entity(real);
            }

            public android.provider.ContactsContract.Contacts.Entity unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.Contacts.Entity.CONTENT_DIRECTORY;
            public static final java.lang.String DATA_ID = android.provider.ContactsContract.Contacts.Entity.DATA_ID;
            public static final java.lang.String RAW_CONTACT_ID = android.provider.ContactsContract.Contacts.Entity.RAW_CONTACT_ID;

        }
        public static final class Photo {
            private final android.provider.ContactsContract.Contacts.Photo real;

            public Photo(android.provider.ContactsContract.Contacts.Photo real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.Photo wrap(android.provider.ContactsContract.Contacts.Photo real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Contacts.Photo(real);
            }

            public android.provider.ContactsContract.Contacts.Photo unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.Contacts.Photo.CONTENT_DIRECTORY;
            public static final java.lang.String DISPLAY_PHOTO = android.provider.ContactsContract.Contacts.Photo.DISPLAY_PHOTO;
            public static final java.lang.String PHOTO = android.provider.ContactsContract.Contacts.Photo.PHOTO;

        }
    }
    public static final class Data {
        private final android.provider.ContactsContract.Data real;

        public Data(android.provider.ContactsContract.Data real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Data wrap(android.provider.ContactsContract.Data real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Data(real);
        }

        public android.provider.ContactsContract.Data unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getContactLookupUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Data.getContactLookupUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.Data.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Data.CONTENT_URI);
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX = android.provider.ContactsContract.Data.EXTRA_ADDRESS_BOOK_INDEX;
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = android.provider.ContactsContract.Data.EXTRA_ADDRESS_BOOK_INDEX_COUNTS;
        public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = android.provider.ContactsContract.Data.EXTRA_ADDRESS_BOOK_INDEX_TITLES;
        public static final java.lang.String VISIBLE_CONTACTS_ONLY = android.provider.ContactsContract.Data.VISIBLE_CONTACTS_ONLY;

    }
    public static final class DataUsageFeedback {
        private final android.provider.ContactsContract.DataUsageFeedback real;

        public DataUsageFeedback(android.provider.ContactsContract.DataUsageFeedback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.DataUsageFeedback wrap(android.provider.ContactsContract.DataUsageFeedback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.DataUsageFeedback(real);
        }

        public android.provider.ContactsContract.DataUsageFeedback unwrap() {
            return real;
        }

        public DataUsageFeedback() {
            this(new android.provider.ContactsContract.DataUsageFeedback());
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri DELETE_USAGE_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.DataUsageFeedback.DELETE_USAGE_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri FEEDBACK_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.DataUsageFeedback.FEEDBACK_URI);
        public static final java.lang.String USAGE_TYPE = android.provider.ContactsContract.DataUsageFeedback.USAGE_TYPE;
        public static final java.lang.String USAGE_TYPE_CALL = android.provider.ContactsContract.DataUsageFeedback.USAGE_TYPE_CALL;
        public static final java.lang.String USAGE_TYPE_LONG_TEXT = android.provider.ContactsContract.DataUsageFeedback.USAGE_TYPE_LONG_TEXT;
        public static final java.lang.String USAGE_TYPE_SHORT_TEXT = android.provider.ContactsContract.DataUsageFeedback.USAGE_TYPE_SHORT_TEXT;

    }
    public static final class DeletedContacts {
        private final android.provider.ContactsContract.DeletedContacts real;

        public DeletedContacts(android.provider.ContactsContract.DeletedContacts real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.DeletedContacts wrap(android.provider.ContactsContract.DeletedContacts real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.DeletedContacts(real);
        }

        public android.provider.ContactsContract.DeletedContacts unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.DeletedContacts.CONTENT_URI);
        public static final long DAYS_KEPT_MILLISECONDS = android.provider.ContactsContract.DeletedContacts.DAYS_KEPT_MILLISECONDS;

    }
    public static final class Directory {
        private final android.provider.ContactsContract.Directory real;

        public Directory(android.provider.ContactsContract.Directory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Directory wrap(android.provider.ContactsContract.Directory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Directory(real);
        }

        public android.provider.ContactsContract.Directory unwrap() {
            return real;
        }

        public static boolean isEnterpriseDirectoryId(long arg0) {
            return android.provider.ContactsContract.Directory.isEnterpriseDirectoryId(arg0);
        }

        public static boolean isRemoteDirectoryId(long arg0) {
            return android.provider.ContactsContract.Directory.isRemoteDirectoryId(arg0);
        }

        public static void notifyDirectoryChange(com.micklab.dcg.wrapper.android.content.ContentResolver arg0) {
            android.provider.ContactsContract.Directory.notifyDirectoryChange(arg0 == null ? null : arg0.unwrap());
        }

        public static final java.lang.String ACCOUNT_NAME = android.provider.ContactsContract.Directory.ACCOUNT_NAME;
        public static final java.lang.String ACCOUNT_TYPE = android.provider.ContactsContract.Directory.ACCOUNT_TYPE;
        public static final java.lang.String CALLER_PACKAGE_PARAM_KEY = android.provider.ContactsContract.Directory.CALLER_PACKAGE_PARAM_KEY;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.Directory.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.Directory.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Directory.CONTENT_URI);
        public static final long DEFAULT = android.provider.ContactsContract.Directory.DEFAULT;
        public static final java.lang.String DIRECTORY_AUTHORITY = android.provider.ContactsContract.Directory.DIRECTORY_AUTHORITY;
        public static final java.lang.String DISPLAY_NAME = android.provider.ContactsContract.Directory.DISPLAY_NAME;
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Directory.ENTERPRISE_CONTENT_URI);
        public static final long ENTERPRISE_DEFAULT = android.provider.ContactsContract.Directory.ENTERPRISE_DEFAULT;
        public static final long ENTERPRISE_LOCAL_INVISIBLE = android.provider.ContactsContract.Directory.ENTERPRISE_LOCAL_INVISIBLE;
        public static final java.lang.String EXPORT_SUPPORT = android.provider.ContactsContract.Directory.EXPORT_SUPPORT;
        public static final int EXPORT_SUPPORT_ANY_ACCOUNT = android.provider.ContactsContract.Directory.EXPORT_SUPPORT_ANY_ACCOUNT;
        public static final int EXPORT_SUPPORT_NONE = android.provider.ContactsContract.Directory.EXPORT_SUPPORT_NONE;
        public static final int EXPORT_SUPPORT_SAME_ACCOUNT_ONLY = android.provider.ContactsContract.Directory.EXPORT_SUPPORT_SAME_ACCOUNT_ONLY;
        public static final long LOCAL_INVISIBLE = android.provider.ContactsContract.Directory.LOCAL_INVISIBLE;
        public static final java.lang.String PACKAGE_NAME = android.provider.ContactsContract.Directory.PACKAGE_NAME;
        public static final java.lang.String PHOTO_SUPPORT = android.provider.ContactsContract.Directory.PHOTO_SUPPORT;
        public static final int PHOTO_SUPPORT_FULL = android.provider.ContactsContract.Directory.PHOTO_SUPPORT_FULL;
        public static final int PHOTO_SUPPORT_FULL_SIZE_ONLY = android.provider.ContactsContract.Directory.PHOTO_SUPPORT_FULL_SIZE_ONLY;
        public static final int PHOTO_SUPPORT_NONE = android.provider.ContactsContract.Directory.PHOTO_SUPPORT_NONE;
        public static final int PHOTO_SUPPORT_THUMBNAIL_ONLY = android.provider.ContactsContract.Directory.PHOTO_SUPPORT_THUMBNAIL_ONLY;
        public static final java.lang.String SHORTCUT_SUPPORT = android.provider.ContactsContract.Directory.SHORTCUT_SUPPORT;
        public static final int SHORTCUT_SUPPORT_DATA_ITEMS_ONLY = android.provider.ContactsContract.Directory.SHORTCUT_SUPPORT_DATA_ITEMS_ONLY;
        public static final int SHORTCUT_SUPPORT_FULL = android.provider.ContactsContract.Directory.SHORTCUT_SUPPORT_FULL;
        public static final int SHORTCUT_SUPPORT_NONE = android.provider.ContactsContract.Directory.SHORTCUT_SUPPORT_NONE;
        public static final java.lang.String TYPE_RESOURCE_ID = android.provider.ContactsContract.Directory.TYPE_RESOURCE_ID;

    }
    public static final class DisplayNameSources {
        private final android.provider.ContactsContract.DisplayNameSources real;

        public DisplayNameSources(android.provider.ContactsContract.DisplayNameSources real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.DisplayNameSources wrap(android.provider.ContactsContract.DisplayNameSources real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.DisplayNameSources(real);
        }

        public android.provider.ContactsContract.DisplayNameSources unwrap() {
            return real;
        }

        public static final int EMAIL = android.provider.ContactsContract.DisplayNameSources.EMAIL;
        public static final int NICKNAME = android.provider.ContactsContract.DisplayNameSources.NICKNAME;
        public static final int ORGANIZATION = android.provider.ContactsContract.DisplayNameSources.ORGANIZATION;
        public static final int PHONE = android.provider.ContactsContract.DisplayNameSources.PHONE;
        public static final int STRUCTURED_NAME = android.provider.ContactsContract.DisplayNameSources.STRUCTURED_NAME;
        public static final int STRUCTURED_PHONETIC_NAME = android.provider.ContactsContract.DisplayNameSources.STRUCTURED_PHONETIC_NAME;
        public static final int UNDEFINED = android.provider.ContactsContract.DisplayNameSources.UNDEFINED;

    }
    public static final class DisplayPhoto {
        private final android.provider.ContactsContract.DisplayPhoto real;

        public DisplayPhoto(android.provider.ContactsContract.DisplayPhoto real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.DisplayPhoto wrap(android.provider.ContactsContract.DisplayPhoto real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.DisplayPhoto(real);
        }

        public android.provider.ContactsContract.DisplayPhoto unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_MAX_DIMENSIONS_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.DisplayPhoto.CONTENT_MAX_DIMENSIONS_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.DisplayPhoto.CONTENT_URI);
        public static final java.lang.String DISPLAY_MAX_DIM = android.provider.ContactsContract.DisplayPhoto.DISPLAY_MAX_DIM;
        public static final java.lang.String THUMBNAIL_MAX_DIM = android.provider.ContactsContract.DisplayPhoto.THUMBNAIL_MAX_DIM;

    }
    public static final class FullNameStyle {
        private final android.provider.ContactsContract.FullNameStyle real;

        public FullNameStyle(android.provider.ContactsContract.FullNameStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.FullNameStyle wrap(android.provider.ContactsContract.FullNameStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.FullNameStyle(real);
        }

        public android.provider.ContactsContract.FullNameStyle unwrap() {
            return real;
        }

        public static final int CHINESE = android.provider.ContactsContract.FullNameStyle.CHINESE;
        public static final int CJK = android.provider.ContactsContract.FullNameStyle.CJK;
        public static final int JAPANESE = android.provider.ContactsContract.FullNameStyle.JAPANESE;
        public static final int KOREAN = android.provider.ContactsContract.FullNameStyle.KOREAN;
        public static final int UNDEFINED = android.provider.ContactsContract.FullNameStyle.UNDEFINED;
        public static final int WESTERN = android.provider.ContactsContract.FullNameStyle.WESTERN;

    }
    public static final class Groups {
        private final android.provider.ContactsContract.Groups real;

        public Groups(android.provider.ContactsContract.Groups real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Groups wrap(android.provider.ContactsContract.Groups real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Groups(real);
        }

        public android.provider.ContactsContract.Groups unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.ContactsContract.Groups.newEntityIterator(arg0 == null ? null : arg0.unwrap()));
        }

        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.Groups.CONTENT_ITEM_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_SUMMARY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Groups.CONTENT_SUMMARY_URI);
        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.Groups.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Groups.CONTENT_URI);

    }
    public static final class Intents {
        private final android.provider.ContactsContract.Intents real;

        public Intents(android.provider.ContactsContract.Intents real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Intents wrap(android.provider.ContactsContract.Intents real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Intents(real);
        }

        public android.provider.ContactsContract.Intents unwrap() {
            return real;
        }

        public Intents() {
            this(new android.provider.ContactsContract.Intents());
        }

        public static final java.lang.String ACTION_VOICE_SEND_MESSAGE_TO_CONTACTS = android.provider.ContactsContract.Intents.ACTION_VOICE_SEND_MESSAGE_TO_CONTACTS;
        public static final java.lang.String ATTACH_IMAGE = android.provider.ContactsContract.Intents.ATTACH_IMAGE;
        public static final java.lang.String CONTACTS_DATABASE_CREATED = android.provider.ContactsContract.Intents.CONTACTS_DATABASE_CREATED;
        public static final java.lang.String EXTRA_CREATE_DESCRIPTION = android.provider.ContactsContract.Intents.EXTRA_CREATE_DESCRIPTION;
        public static final java.lang.String EXTRA_FORCE_CREATE = android.provider.ContactsContract.Intents.EXTRA_FORCE_CREATE;
        public static final java.lang.String EXTRA_RECIPIENT_CONTACT_CHAT_ID = android.provider.ContactsContract.Intents.EXTRA_RECIPIENT_CONTACT_CHAT_ID;
        public static final java.lang.String EXTRA_RECIPIENT_CONTACT_NAME = android.provider.ContactsContract.Intents.EXTRA_RECIPIENT_CONTACT_NAME;
        public static final java.lang.String EXTRA_RECIPIENT_CONTACT_URI = android.provider.ContactsContract.Intents.EXTRA_RECIPIENT_CONTACT_URI;
        public static final java.lang.String INVITE_CONTACT = android.provider.ContactsContract.Intents.INVITE_CONTACT;
        public static final java.lang.String METADATA_ACCOUNT_TYPE = android.provider.ContactsContract.Intents.METADATA_ACCOUNT_TYPE;
        public static final java.lang.String METADATA_MIMETYPE = android.provider.ContactsContract.Intents.METADATA_MIMETYPE;
        public static final java.lang.String SEARCH_SUGGESTION_CLICKED = android.provider.ContactsContract.Intents.SEARCH_SUGGESTION_CLICKED;
        public static final java.lang.String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = android.provider.ContactsContract.Intents.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED;
        public static final java.lang.String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = android.provider.ContactsContract.Intents.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED;
        public static final java.lang.String SHOW_OR_CREATE_CONTACT = android.provider.ContactsContract.Intents.SHOW_OR_CREATE_CONTACT;

        public static final class Insert {
            private final android.provider.ContactsContract.Intents.Insert real;

            public Insert(android.provider.ContactsContract.Intents.Insert real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Intents.Insert wrap(android.provider.ContactsContract.Intents.Insert real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Intents.Insert(real);
            }

            public android.provider.ContactsContract.Intents.Insert unwrap() {
                return real;
            }

            public Insert() {
                this(new android.provider.ContactsContract.Intents.Insert());
            }

            public static final java.lang.String ACTION = android.provider.ContactsContract.Intents.Insert.ACTION;
            public static final java.lang.String COMPANY = android.provider.ContactsContract.Intents.Insert.COMPANY;
            public static final java.lang.String DATA = android.provider.ContactsContract.Intents.Insert.DATA;
            public static final java.lang.String EMAIL = android.provider.ContactsContract.Intents.Insert.EMAIL;
            public static final java.lang.String EMAIL_ISPRIMARY = android.provider.ContactsContract.Intents.Insert.EMAIL_ISPRIMARY;
            public static final java.lang.String EMAIL_TYPE = android.provider.ContactsContract.Intents.Insert.EMAIL_TYPE;
            public static final java.lang.String EXTRA_ACCOUNT = android.provider.ContactsContract.Intents.Insert.EXTRA_ACCOUNT;
            public static final java.lang.String EXTRA_DATA_SET = android.provider.ContactsContract.Intents.Insert.EXTRA_DATA_SET;
            public static final java.lang.String FULL_MODE = android.provider.ContactsContract.Intents.Insert.FULL_MODE;
            public static final java.lang.String IM_HANDLE = android.provider.ContactsContract.Intents.Insert.IM_HANDLE;
            public static final java.lang.String IM_ISPRIMARY = android.provider.ContactsContract.Intents.Insert.IM_ISPRIMARY;
            public static final java.lang.String IM_PROTOCOL = android.provider.ContactsContract.Intents.Insert.IM_PROTOCOL;
            public static final java.lang.String JOB_TITLE = android.provider.ContactsContract.Intents.Insert.JOB_TITLE;
            public static final java.lang.String NAME = android.provider.ContactsContract.Intents.Insert.NAME;
            public static final java.lang.String NOTES = android.provider.ContactsContract.Intents.Insert.NOTES;
            public static final java.lang.String PHONE = android.provider.ContactsContract.Intents.Insert.PHONE;
            public static final java.lang.String PHONETIC_NAME = android.provider.ContactsContract.Intents.Insert.PHONETIC_NAME;
            public static final java.lang.String PHONE_ISPRIMARY = android.provider.ContactsContract.Intents.Insert.PHONE_ISPRIMARY;
            public static final java.lang.String PHONE_TYPE = android.provider.ContactsContract.Intents.Insert.PHONE_TYPE;
            public static final java.lang.String POSTAL = android.provider.ContactsContract.Intents.Insert.POSTAL;
            public static final java.lang.String POSTAL_ISPRIMARY = android.provider.ContactsContract.Intents.Insert.POSTAL_ISPRIMARY;
            public static final java.lang.String POSTAL_TYPE = android.provider.ContactsContract.Intents.Insert.POSTAL_TYPE;
            public static final java.lang.String SECONDARY_EMAIL = android.provider.ContactsContract.Intents.Insert.SECONDARY_EMAIL;
            public static final java.lang.String SECONDARY_EMAIL_TYPE = android.provider.ContactsContract.Intents.Insert.SECONDARY_EMAIL_TYPE;
            public static final java.lang.String SECONDARY_PHONE = android.provider.ContactsContract.Intents.Insert.SECONDARY_PHONE;
            public static final java.lang.String SECONDARY_PHONE_TYPE = android.provider.ContactsContract.Intents.Insert.SECONDARY_PHONE_TYPE;
            public static final java.lang.String TERTIARY_EMAIL = android.provider.ContactsContract.Intents.Insert.TERTIARY_EMAIL;
            public static final java.lang.String TERTIARY_EMAIL_TYPE = android.provider.ContactsContract.Intents.Insert.TERTIARY_EMAIL_TYPE;
            public static final java.lang.String TERTIARY_PHONE = android.provider.ContactsContract.Intents.Insert.TERTIARY_PHONE;
            public static final java.lang.String TERTIARY_PHONE_TYPE = android.provider.ContactsContract.Intents.Insert.TERTIARY_PHONE_TYPE;

        }
    }
    public static final class PhoneLookup {
        private final android.provider.ContactsContract.PhoneLookup real;

        public PhoneLookup(android.provider.ContactsContract.PhoneLookup real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.PhoneLookup wrap(android.provider.ContactsContract.PhoneLookup real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.PhoneLookup(real);
        }

        public android.provider.ContactsContract.PhoneLookup unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri ENTERPRISE_CONTENT_FILTER_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI);
        public static final java.lang.String QUERY_PARAMETER_SIP_ADDRESS = android.provider.ContactsContract.PhoneLookup.QUERY_PARAMETER_SIP_ADDRESS;

    }
    public static final class PhoneticNameStyle {
        private final android.provider.ContactsContract.PhoneticNameStyle real;

        public PhoneticNameStyle(android.provider.ContactsContract.PhoneticNameStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.PhoneticNameStyle wrap(android.provider.ContactsContract.PhoneticNameStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.PhoneticNameStyle(real);
        }

        public android.provider.ContactsContract.PhoneticNameStyle unwrap() {
            return real;
        }

        public static final int JAPANESE = android.provider.ContactsContract.PhoneticNameStyle.JAPANESE;
        public static final int KOREAN = android.provider.ContactsContract.PhoneticNameStyle.KOREAN;
        public static final int PINYIN = android.provider.ContactsContract.PhoneticNameStyle.PINYIN;
        public static final int UNDEFINED = android.provider.ContactsContract.PhoneticNameStyle.UNDEFINED;

    }
    public static final class PinnedPositions {
        private final android.provider.ContactsContract.PinnedPositions real;

        public PinnedPositions(android.provider.ContactsContract.PinnedPositions real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.PinnedPositions wrap(android.provider.ContactsContract.PinnedPositions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.PinnedPositions(real);
        }

        public android.provider.ContactsContract.PinnedPositions unwrap() {
            return real;
        }

        public PinnedPositions() {
            this(new android.provider.ContactsContract.PinnedPositions());
        }

        public static void pin(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1, int arg2) {
            android.provider.ContactsContract.PinnedPositions.pin(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public static void undemote(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, long arg1) {
            android.provider.ContactsContract.PinnedPositions.undemote(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int DEMOTED = android.provider.ContactsContract.PinnedPositions.DEMOTED;
        public static final int UNPINNED = android.provider.ContactsContract.PinnedPositions.UNPINNED;

    }
    public static final class Presence {
        private final android.provider.ContactsContract.Presence real;

        public Presence(android.provider.ContactsContract.Presence real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Presence wrap(android.provider.ContactsContract.Presence real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Presence(real);
        }

        public android.provider.ContactsContract.Presence unwrap() {
            return real;
        }

        public Presence() {
            this(new android.provider.ContactsContract.Presence());
        }

    }
    public static final class Profile {
        private final android.provider.ContactsContract.Profile real;

        public Profile(android.provider.ContactsContract.Profile real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Profile wrap(android.provider.ContactsContract.Profile real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Profile(real);
        }

        public android.provider.ContactsContract.Profile unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_RAW_CONTACTS_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Profile.CONTENT_RAW_CONTACTS_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Profile.CONTENT_URI);
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_VCARD_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Profile.CONTENT_VCARD_URI);
        public static final long MIN_ID = android.provider.ContactsContract.Profile.MIN_ID;

    }
    public static final class ProfileSyncState {
        private final android.provider.ContactsContract.ProfileSyncState real;

        public ProfileSyncState(android.provider.ContactsContract.ProfileSyncState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.ProfileSyncState wrap(android.provider.ContactsContract.ProfileSyncState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.ProfileSyncState(real);
        }

        public android.provider.ContactsContract.ProfileSyncState unwrap() {
            return real;
        }

        public static byte[] get(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1) throws android.os.RemoteException {
            return android.provider.ContactsContract.ProfileSyncState.get(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation newSetOperation(com.micklab.dcg.wrapper.android.accounts.Account arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(android.provider.ContactsContract.ProfileSyncState.newSetOperation(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public static void set(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, byte[] arg2) throws android.os.RemoteException {
            android.provider.ContactsContract.ProfileSyncState.set(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.ProfileSyncState.CONTENT_DIRECTORY;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.ProfileSyncState.CONTENT_URI);

    }
    public static final class ProviderStatus {
        private final android.provider.ContactsContract.ProviderStatus real;

        public ProviderStatus(android.provider.ContactsContract.ProviderStatus real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.ProviderStatus wrap(android.provider.ContactsContract.ProviderStatus real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.ProviderStatus(real);
        }

        public android.provider.ContactsContract.ProviderStatus unwrap() {
            return real;
        }

        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.ProviderStatus.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.ProviderStatus.CONTENT_URI);
        public static final java.lang.String DATABASE_CREATION_TIMESTAMP = android.provider.ContactsContract.ProviderStatus.DATABASE_CREATION_TIMESTAMP;
        public static final java.lang.String STATUS = android.provider.ContactsContract.ProviderStatus.STATUS;
        public static final int STATUS_BUSY = android.provider.ContactsContract.ProviderStatus.STATUS_BUSY;
        public static final int STATUS_EMPTY = android.provider.ContactsContract.ProviderStatus.STATUS_EMPTY;
        public static final int STATUS_NORMAL = android.provider.ContactsContract.ProviderStatus.STATUS_NORMAL;

    }
    public static final class QuickContact {
        private final android.provider.ContactsContract.QuickContact real;

        public QuickContact(android.provider.ContactsContract.QuickContact real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.QuickContact wrap(android.provider.ContactsContract.QuickContact real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.QuickContact(real);
        }

        public android.provider.ContactsContract.QuickContact unwrap() {
            return real;
        }

        public QuickContact() {
            this(new android.provider.ContactsContract.QuickContact());
        }

        public static void showQuickContact(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String[] arg3, java.lang.String arg4) {
            android.provider.ContactsContract.QuickContact.showQuickContact(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4);
        }

        public static void showQuickContact(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String[] arg3, java.lang.String arg4) {
            android.provider.ContactsContract.QuickContact.showQuickContact(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4);
        }

        public static void showQuickContact(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, int arg3, java.lang.String[] arg4) {
            android.provider.ContactsContract.QuickContact.showQuickContact(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4);
        }

        public static void showQuickContact(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, int arg3, java.lang.String[] arg4) {
            android.provider.ContactsContract.QuickContact.showQuickContact(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4);
        }

        public static final java.lang.String ACTION_QUICK_CONTACT = android.provider.ContactsContract.QuickContact.ACTION_QUICK_CONTACT;
        public static final java.lang.String EXTRA_EXCLUDE_MIMES = android.provider.ContactsContract.QuickContact.EXTRA_EXCLUDE_MIMES;
        public static final java.lang.String EXTRA_MODE = android.provider.ContactsContract.QuickContact.EXTRA_MODE;
        public static final java.lang.String EXTRA_PRIORITIZED_MIMETYPE = android.provider.ContactsContract.QuickContact.EXTRA_PRIORITIZED_MIMETYPE;
        public static final int MODE_LARGE = android.provider.ContactsContract.QuickContact.MODE_LARGE;
        public static final int MODE_MEDIUM = android.provider.ContactsContract.QuickContact.MODE_MEDIUM;
        public static final int MODE_SMALL = android.provider.ContactsContract.QuickContact.MODE_SMALL;

    }
    public static final class RawContacts {
        private final android.provider.ContactsContract.RawContacts real;

        public RawContacts(android.provider.ContactsContract.RawContacts real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts wrap(android.provider.ContactsContract.RawContacts real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts(real);
        }

        public android.provider.ContactsContract.RawContacts unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getContactLookupUri(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.RawContacts.getContactLookupUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static java.lang.String getLocalAccountName(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return android.provider.ContactsContract.RawContacts.getLocalAccountName(arg0 == null ? null : arg0.unwrap());
        }

        public static java.lang.String getLocalAccountType(com.micklab.dcg.wrapper.android.content.Context arg0) {
            return android.provider.ContactsContract.RawContacts.getLocalAccountType(arg0 == null ? null : arg0.unwrap());
        }

        public static com.micklab.dcg.wrapper.android.content.EntityIterator newEntityIterator(com.micklab.dcg.wrapper.android.database.Cursor arg0) {
            return com.micklab.dcg.wrapper.android.content.EntityIterator.wrap(android.provider.ContactsContract.RawContacts.newEntityIterator(arg0 == null ? null : arg0.unwrap()));
        }

        public static final int AGGREGATION_MODE_DEFAULT = android.provider.ContactsContract.RawContacts.AGGREGATION_MODE_DEFAULT;
        public static final int AGGREGATION_MODE_DISABLED = android.provider.ContactsContract.RawContacts.AGGREGATION_MODE_DISABLED;
        public static final int AGGREGATION_MODE_IMMEDIATE = android.provider.ContactsContract.RawContacts.AGGREGATION_MODE_IMMEDIATE;
        public static final int AGGREGATION_MODE_SUSPENDED = android.provider.ContactsContract.RawContacts.AGGREGATION_MODE_SUSPENDED;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.RawContacts.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.RawContacts.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.RawContacts.CONTENT_URI);

        public static final class Data {
            private final android.provider.ContactsContract.RawContacts.Data real;

            public Data(android.provider.ContactsContract.RawContacts.Data real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts.Data wrap(android.provider.ContactsContract.RawContacts.Data real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts.Data(real);
            }

            public android.provider.ContactsContract.RawContacts.Data unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.RawContacts.Data.CONTENT_DIRECTORY;

        }
        public static final class DisplayPhoto {
            private final android.provider.ContactsContract.RawContacts.DisplayPhoto real;

            public DisplayPhoto(android.provider.ContactsContract.RawContacts.DisplayPhoto real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts.DisplayPhoto wrap(android.provider.ContactsContract.RawContacts.DisplayPhoto real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts.DisplayPhoto(real);
            }

            public android.provider.ContactsContract.RawContacts.DisplayPhoto unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.RawContacts.DisplayPhoto.CONTENT_DIRECTORY;

        }
        public static final class Entity {
            private final android.provider.ContactsContract.RawContacts.Entity real;

            public Entity(android.provider.ContactsContract.RawContacts.Entity real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts.Entity wrap(android.provider.ContactsContract.RawContacts.Entity real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContacts.Entity(real);
            }

            public android.provider.ContactsContract.RawContacts.Entity unwrap() {
                return real;
            }

            public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.RawContacts.Entity.CONTENT_DIRECTORY;
            public static final java.lang.String DATA_ID = android.provider.ContactsContract.RawContacts.Entity.DATA_ID;

        }
    }
    public static final class RawContactsEntity {
        private final android.provider.ContactsContract.RawContactsEntity real;

        public RawContactsEntity(android.provider.ContactsContract.RawContactsEntity real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContactsEntity wrap(android.provider.ContactsContract.RawContactsEntity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.RawContactsEntity(real);
        }

        public android.provider.ContactsContract.RawContactsEntity unwrap() {
            return real;
        }

        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.RawContactsEntity.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.RawContactsEntity.CONTENT_URI);
        public static final java.lang.String DATA_ID = android.provider.ContactsContract.RawContactsEntity.DATA_ID;

    }
    public static final class SearchSnippets {
        private final android.provider.ContactsContract.SearchSnippets real;

        public SearchSnippets(android.provider.ContactsContract.SearchSnippets real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.SearchSnippets wrap(android.provider.ContactsContract.SearchSnippets real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.SearchSnippets(real);
        }

        public android.provider.ContactsContract.SearchSnippets unwrap() {
            return real;
        }

        public SearchSnippets() {
            this(new android.provider.ContactsContract.SearchSnippets());
        }

        public static final java.lang.String DEFERRED_SNIPPETING_KEY = android.provider.ContactsContract.SearchSnippets.DEFERRED_SNIPPETING_KEY;
        public static final java.lang.String SNIPPET = android.provider.ContactsContract.SearchSnippets.SNIPPET;

    }
    public static final class Settings {
        private final android.provider.ContactsContract.Settings real;

        public Settings(android.provider.ContactsContract.Settings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.Settings wrap(android.provider.ContactsContract.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.Settings(real);
        }

        public android.provider.ContactsContract.Settings unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.accounts.Account getDefaultAccount(com.micklab.dcg.wrapper.android.content.ContentResolver arg0) {
            return com.micklab.dcg.wrapper.android.accounts.Account.wrap(android.provider.ContactsContract.Settings.getDefaultAccount(arg0 == null ? null : arg0.unwrap()));
        }

        public static final java.lang.String ACTION_SET_DEFAULT_ACCOUNT = android.provider.ContactsContract.Settings.ACTION_SET_DEFAULT_ACCOUNT;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.Settings.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.Settings.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.Settings.CONTENT_URI);

    }
    public static final class SimAccount {
        private final android.provider.ContactsContract.SimAccount real;

        public SimAccount(android.provider.ContactsContract.SimAccount real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.SimAccount wrap(android.provider.ContactsContract.SimAccount real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.SimAccount(real);
        }

        public android.provider.ContactsContract.SimAccount unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getAccountName() {
            return real.getAccountName();
        }

        public java.lang.String getAccountType() {
            return real.getAccountType();
        }

        public int getEfType() {
            return real.getEfType();
        }

        public int getSimSlotIndex() {
            return real.getSimSlotIndex();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int ADN_EF_TYPE = android.provider.ContactsContract.SimAccount.ADN_EF_TYPE;
        public static final int FDN_EF_TYPE = android.provider.ContactsContract.SimAccount.FDN_EF_TYPE;
        public static final int SDN_EF_TYPE = android.provider.ContactsContract.SimAccount.SDN_EF_TYPE;
        public static final int UNKNOWN_EF_TYPE = android.provider.ContactsContract.SimAccount.UNKNOWN_EF_TYPE;

    }
    public static final class SimContacts {
        private final android.provider.ContactsContract.SimContacts real;

        public SimContacts(android.provider.ContactsContract.SimContacts real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.SimContacts wrap(android.provider.ContactsContract.SimContacts real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.SimContacts(real);
        }

        public android.provider.ContactsContract.SimContacts unwrap() {
            return real;
        }

        public static final java.lang.String ACTION_SIM_ACCOUNTS_CHANGED = android.provider.ContactsContract.SimContacts.ACTION_SIM_ACCOUNTS_CHANGED;

    }
    public static final class StatusUpdates {
        private final android.provider.ContactsContract.StatusUpdates real;

        public StatusUpdates(android.provider.ContactsContract.StatusUpdates real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.StatusUpdates wrap(android.provider.ContactsContract.StatusUpdates real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.StatusUpdates(real);
        }

        public android.provider.ContactsContract.StatusUpdates unwrap() {
            return real;
        }

        public static int getPresenceIconResourceId(int arg0) {
            return android.provider.ContactsContract.StatusUpdates.getPresenceIconResourceId(arg0);
        }

        public static int getPresencePrecedence(int arg0) {
            return android.provider.ContactsContract.StatusUpdates.getPresencePrecedence(arg0);
        }

        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.ContactsContract.StatusUpdates.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.ContactsContract.StatusUpdates.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.StatusUpdates.CONTENT_URI);

    }
    public static final class SyncState {
        private final android.provider.ContactsContract.SyncState real;

        public SyncState(android.provider.ContactsContract.SyncState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.ContactsContract.SyncState wrap(android.provider.ContactsContract.SyncState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.ContactsContract.SyncState(real);
        }

        public android.provider.ContactsContract.SyncState unwrap() {
            return real;
        }

        public static byte[] get(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1) throws android.os.RemoteException {
            return android.provider.ContactsContract.SyncState.get(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation newSetOperation(com.micklab.dcg.wrapper.android.accounts.Account arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(android.provider.ContactsContract.SyncState.newSetOperation(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public static void set(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, byte[] arg2) throws android.os.RemoteException {
            android.provider.ContactsContract.SyncState.set(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.ContactsContract.SyncState.CONTENT_DIRECTORY;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.ContactsContract.SyncState.CONTENT_URI);

    }
}
