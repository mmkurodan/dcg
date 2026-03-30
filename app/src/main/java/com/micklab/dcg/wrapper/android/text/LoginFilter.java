// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class LoginFilter {
    private final android.text.LoginFilter real;

    public LoginFilter(android.text.LoginFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.LoginFilter wrap(android.text.LoginFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter(real);
    }

    public android.text.LoginFilter unwrap() {
        return real;
    }

    public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
        return real.filter(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5);
    }

    public boolean isAllowed(char arg0) {
        return real.isAllowed(arg0);
    }

    public void onInvalidCharacter(char arg0) {
        real.onInvalidCharacter(arg0);
    }

    public void onStart() {
        real.onStart();
    }

    public void onStop() {
        real.onStop();
    }

    public static final class PasswordFilterGMail {
        private final android.text.LoginFilter.PasswordFilterGMail real;

        public PasswordFilterGMail(android.text.LoginFilter.PasswordFilterGMail real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.LoginFilter.PasswordFilterGMail wrap(android.text.LoginFilter.PasswordFilterGMail real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter.PasswordFilterGMail(real);
        }

        public android.text.LoginFilter.PasswordFilterGMail unwrap() {
            return real;
        }

        public PasswordFilterGMail() {
            this(new android.text.LoginFilter.PasswordFilterGMail());
        }

        public PasswordFilterGMail(boolean arg0) {
            this(new android.text.LoginFilter.PasswordFilterGMail(arg0));
        }

        public boolean isAllowed(char arg0) {
            return real.isAllowed(arg0);
        }

    }
    public static final class UsernameFilterGMail {
        private final android.text.LoginFilter.UsernameFilterGMail real;

        public UsernameFilterGMail(android.text.LoginFilter.UsernameFilterGMail real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGMail wrap(android.text.LoginFilter.UsernameFilterGMail real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGMail(real);
        }

        public android.text.LoginFilter.UsernameFilterGMail unwrap() {
            return real;
        }

        public UsernameFilterGMail() {
            this(new android.text.LoginFilter.UsernameFilterGMail());
        }

        public UsernameFilterGMail(boolean arg0) {
            this(new android.text.LoginFilter.UsernameFilterGMail(arg0));
        }

        public boolean isAllowed(char arg0) {
            return real.isAllowed(arg0);
        }

    }
    public static final class UsernameFilterGeneric {
        private final android.text.LoginFilter.UsernameFilterGeneric real;

        public UsernameFilterGeneric(android.text.LoginFilter.UsernameFilterGeneric real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGeneric wrap(android.text.LoginFilter.UsernameFilterGeneric real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.LoginFilter.UsernameFilterGeneric(real);
        }

        public android.text.LoginFilter.UsernameFilterGeneric unwrap() {
            return real;
        }

        public UsernameFilterGeneric() {
            this(new android.text.LoginFilter.UsernameFilterGeneric());
        }

        public UsernameFilterGeneric(boolean arg0) {
            this(new android.text.LoginFilter.UsernameFilterGeneric(arg0));
        }

        public boolean isAllowed(char arg0) {
            return real.isAllowed(arg0);
        }

    }
}
