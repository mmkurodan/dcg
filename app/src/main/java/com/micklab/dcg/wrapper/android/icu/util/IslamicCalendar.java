// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class IslamicCalendar {
    private final android.icu.util.IslamicCalendar real;

    public IslamicCalendar(android.icu.util.IslamicCalendar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar wrap(android.icu.util.IslamicCalendar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar(real);
    }

    public android.icu.util.IslamicCalendar unwrap() {
        return real;
    }

    public IslamicCalendar() {
        this(new android.icu.util.IslamicCalendar());
    }

    public IslamicCalendar(java.util.Date arg0) {
        this(new android.icu.util.IslamicCalendar(arg0));
    }

    public IslamicCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        this(new android.icu.util.IslamicCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public IslamicCalendar(java.util.Locale arg0) {
        this(new android.icu.util.IslamicCalendar(arg0));
    }

    public IslamicCalendar(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.util.IslamicCalendar(arg0 == null ? null : arg0.unwrap()));
    }

    public IslamicCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, java.util.Locale arg1) {
        this(new android.icu.util.IslamicCalendar(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public IslamicCalendar(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.util.IslamicCalendar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public IslamicCalendar(int arg0, int arg1, int arg2) {
        this(new android.icu.util.IslamicCalendar(arg0, arg1, arg2));
    }

    public IslamicCalendar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.icu.util.IslamicCalendar(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType getCalculationType() {
        return com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType.wrap(real.getCalculationType());
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public void setCalculationType(com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType arg0) {
        real.setCalculationType(arg0 == null ? null : arg0.unwrap());
    }

    public static final int DHU_AL_HIJJAH = android.icu.util.IslamicCalendar.DHU_AL_HIJJAH;
    public static final int DHU_AL_QIDAH = android.icu.util.IslamicCalendar.DHU_AL_QIDAH;
    public static final int JUMADA_1 = android.icu.util.IslamicCalendar.JUMADA_1;
    public static final int JUMADA_2 = android.icu.util.IslamicCalendar.JUMADA_2;
    public static final int MUHARRAM = android.icu.util.IslamicCalendar.MUHARRAM;
    public static final int RABI_1 = android.icu.util.IslamicCalendar.RABI_1;
    public static final int RABI_2 = android.icu.util.IslamicCalendar.RABI_2;
    public static final int RAJAB = android.icu.util.IslamicCalendar.RAJAB;
    public static final int RAMADAN = android.icu.util.IslamicCalendar.RAMADAN;
    public static final int SAFAR = android.icu.util.IslamicCalendar.SAFAR;
    public static final int SHABAN = android.icu.util.IslamicCalendar.SHABAN;
    public static final int SHAWWAL = android.icu.util.IslamicCalendar.SHAWWAL;

    public static final class CalculationType {
        private final android.icu.util.IslamicCalendar.CalculationType real;

        public CalculationType(android.icu.util.IslamicCalendar.CalculationType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType wrap(android.icu.util.IslamicCalendar.CalculationType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType(real);
        }

        public android.icu.util.IslamicCalendar.CalculationType unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType.wrap(android.icu.util.IslamicCalendar.CalculationType.valueOf(arg0));
        }

        public static android.icu.util.IslamicCalendar.CalculationType[] values() {
            return android.icu.util.IslamicCalendar.CalculationType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType ISLAMIC = com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType.wrap(android.icu.util.IslamicCalendar.CalculationType.ISLAMIC);
        public static final com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType ISLAMIC_CIVIL = com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType.wrap(android.icu.util.IslamicCalendar.CalculationType.ISLAMIC_CIVIL);
        public static final com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType ISLAMIC_TBLA = com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType.wrap(android.icu.util.IslamicCalendar.CalculationType.ISLAMIC_TBLA);
        public static final com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType ISLAMIC_UMALQURA = com.micklab.dcg.wrapper.android.icu.util.IslamicCalendar.CalculationType.wrap(android.icu.util.IslamicCalendar.CalculationType.ISLAMIC_UMALQURA);

    }
}
