// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class LoginFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LoginFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.LoginFilter wrap(android.text.LoginFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter(real, (__DcgwBridgeToken) null);
    }

    public android.text.LoginFilter getReal() {
        return (android.text.LoginFilter) real;
    }

    public android.text.LoginFilter unwrap() {
        return getReal();
    }

    public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
        return ((android.text.LoginFilter) real).filter(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5);
    }

    public boolean isAllowed(char arg0) {
        return ((android.text.LoginFilter) real).isAllowed(arg0);
    }

    public void onInvalidCharacter(char arg0) {
        ((android.text.LoginFilter) real).onInvalidCharacter(arg0);
    }

    public void onStart() {
        ((android.text.LoginFilter) real).onStart();
    }

    public void onStop() {
        ((android.text.LoginFilter) real).onStop();
    }

    public static final class PasswordFilterGMail {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PasswordFilterGMail(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.LoginFilter.PasswordFilterGMail wrap(android.text.LoginFilter.PasswordFilterGMail real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter.PasswordFilterGMail(real, (__DcgwBridgeToken) null);
        }

        public android.text.LoginFilter.PasswordFilterGMail getReal() {
            return (android.text.LoginFilter.PasswordFilterGMail) real;
        }

        public android.text.LoginFilter.PasswordFilterGMail unwrap() {
            return getReal();
        }

        public PasswordFilterGMail() {
            this(new android.text.LoginFilter.PasswordFilterGMail(), (__DcgwBridgeToken) null);
        }

        public PasswordFilterGMail(boolean arg0) {
            this(new android.text.LoginFilter.PasswordFilterGMail(arg0), (__DcgwBridgeToken) null);
        }

        public boolean isAllowed(char arg0) {
            return ((android.text.LoginFilter.PasswordFilterGMail) real).isAllowed(arg0);
        }

    }
    public static final class UsernameFilterGMail {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UsernameFilterGMail(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGMail wrap(android.text.LoginFilter.UsernameFilterGMail real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGMail(real, (__DcgwBridgeToken) null);
        }

        public android.text.LoginFilter.UsernameFilterGMail getReal() {
            return (android.text.LoginFilter.UsernameFilterGMail) real;
        }

        public android.text.LoginFilter.UsernameFilterGMail unwrap() {
            return getReal();
        }

        public UsernameFilterGMail() {
            this(new android.text.LoginFilter.UsernameFilterGMail(), (__DcgwBridgeToken) null);
        }

        public UsernameFilterGMail(boolean arg0) {
            this(new android.text.LoginFilter.UsernameFilterGMail(arg0), (__DcgwBridgeToken) null);
        }

        public boolean isAllowed(char arg0) {
            return ((android.text.LoginFilter.UsernameFilterGMail) real).isAllowed(arg0);
        }

    }
    public static final class UsernameFilterGeneric {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private UsernameFilterGeneric(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGeneric wrap(android.text.LoginFilter.UsernameFilterGeneric real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGeneric(real, (__DcgwBridgeToken) null);
        }

        public android.text.LoginFilter.UsernameFilterGeneric getReal() {
            return (android.text.LoginFilter.UsernameFilterGeneric) real;
        }

        public android.text.LoginFilter.UsernameFilterGeneric unwrap() {
            return getReal();
        }

        public UsernameFilterGeneric() {
            this(new android.text.LoginFilter.UsernameFilterGeneric(), (__DcgwBridgeToken) null);
        }

        public UsernameFilterGeneric(boolean arg0) {
            this(new android.text.LoginFilter.UsernameFilterGeneric(arg0), (__DcgwBridgeToken) null);
        }

        public boolean isAllowed(char arg0) {
            return ((android.text.LoginFilter.UsernameFilterGeneric) real).isAllowed(arg0);
        }

    }
}
