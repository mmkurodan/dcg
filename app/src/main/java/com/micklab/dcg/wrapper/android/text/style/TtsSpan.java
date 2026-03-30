// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class TtsSpan {
    private final android.text.style.TtsSpan real;

    public TtsSpan(android.text.style.TtsSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.TtsSpan wrap(android.text.style.TtsSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan(real);
    }

    public android.text.style.TtsSpan unwrap() {
        return real;
    }

    public TtsSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.TtsSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public TtsSpan(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.PersistableBundle arg1) {
        this(new android.text.style.TtsSpan(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getArgs() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getArgs());
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String ANIMACY_ANIMATE = android.text.style.TtsSpan.ANIMACY_ANIMATE;
    public static final java.lang.String ANIMACY_INANIMATE = android.text.style.TtsSpan.ANIMACY_INANIMATE;
    public static final java.lang.String ARG_ANIMACY = android.text.style.TtsSpan.ARG_ANIMACY;
    public static final java.lang.String ARG_CASE = android.text.style.TtsSpan.ARG_CASE;
    public static final java.lang.String ARG_COUNTRY_CODE = android.text.style.TtsSpan.ARG_COUNTRY_CODE;
    public static final java.lang.String ARG_CURRENCY = android.text.style.TtsSpan.ARG_CURRENCY;
    public static final java.lang.String ARG_DAY = android.text.style.TtsSpan.ARG_DAY;
    public static final java.lang.String ARG_DENOMINATOR = android.text.style.TtsSpan.ARG_DENOMINATOR;
    public static final java.lang.String ARG_DIGITS = android.text.style.TtsSpan.ARG_DIGITS;
    public static final java.lang.String ARG_DOMAIN = android.text.style.TtsSpan.ARG_DOMAIN;
    public static final java.lang.String ARG_EXTENSION = android.text.style.TtsSpan.ARG_EXTENSION;
    public static final java.lang.String ARG_FRACTIONAL_PART = android.text.style.TtsSpan.ARG_FRACTIONAL_PART;
    public static final java.lang.String ARG_FRAGMENT_ID = android.text.style.TtsSpan.ARG_FRAGMENT_ID;
    public static final java.lang.String ARG_GENDER = android.text.style.TtsSpan.ARG_GENDER;
    public static final java.lang.String ARG_HOURS = android.text.style.TtsSpan.ARG_HOURS;
    public static final java.lang.String ARG_INTEGER_PART = android.text.style.TtsSpan.ARG_INTEGER_PART;
    public static final java.lang.String ARG_MINUTES = android.text.style.TtsSpan.ARG_MINUTES;
    public static final java.lang.String ARG_MONTH = android.text.style.TtsSpan.ARG_MONTH;
    public static final java.lang.String ARG_MULTIPLICITY = android.text.style.TtsSpan.ARG_MULTIPLICITY;
    public static final java.lang.String ARG_NUMBER = android.text.style.TtsSpan.ARG_NUMBER;
    public static final java.lang.String ARG_NUMBER_PARTS = android.text.style.TtsSpan.ARG_NUMBER_PARTS;
    public static final java.lang.String ARG_NUMERATOR = android.text.style.TtsSpan.ARG_NUMERATOR;
    public static final java.lang.String ARG_PASSWORD = android.text.style.TtsSpan.ARG_PASSWORD;
    public static final java.lang.String ARG_PATH = android.text.style.TtsSpan.ARG_PATH;
    public static final java.lang.String ARG_PORT = android.text.style.TtsSpan.ARG_PORT;
    public static final java.lang.String ARG_PROTOCOL = android.text.style.TtsSpan.ARG_PROTOCOL;
    public static final java.lang.String ARG_QUANTITY = android.text.style.TtsSpan.ARG_QUANTITY;
    public static final java.lang.String ARG_QUERY_STRING = android.text.style.TtsSpan.ARG_QUERY_STRING;
    public static final java.lang.String ARG_TEXT = android.text.style.TtsSpan.ARG_TEXT;
    public static final java.lang.String ARG_UNIT = android.text.style.TtsSpan.ARG_UNIT;
    public static final java.lang.String ARG_USERNAME = android.text.style.TtsSpan.ARG_USERNAME;
    public static final java.lang.String ARG_VERBATIM = android.text.style.TtsSpan.ARG_VERBATIM;
    public static final java.lang.String ARG_WEEKDAY = android.text.style.TtsSpan.ARG_WEEKDAY;
    public static final java.lang.String ARG_YEAR = android.text.style.TtsSpan.ARG_YEAR;
    public static final java.lang.String CASE_ABLATIVE = android.text.style.TtsSpan.CASE_ABLATIVE;
    public static final java.lang.String CASE_ACCUSATIVE = android.text.style.TtsSpan.CASE_ACCUSATIVE;
    public static final java.lang.String CASE_DATIVE = android.text.style.TtsSpan.CASE_DATIVE;
    public static final java.lang.String CASE_GENITIVE = android.text.style.TtsSpan.CASE_GENITIVE;
    public static final java.lang.String CASE_INSTRUMENTAL = android.text.style.TtsSpan.CASE_INSTRUMENTAL;
    public static final java.lang.String CASE_LOCATIVE = android.text.style.TtsSpan.CASE_LOCATIVE;
    public static final java.lang.String CASE_NOMINATIVE = android.text.style.TtsSpan.CASE_NOMINATIVE;
    public static final java.lang.String CASE_VOCATIVE = android.text.style.TtsSpan.CASE_VOCATIVE;
    public static final java.lang.String GENDER_FEMALE = android.text.style.TtsSpan.GENDER_FEMALE;
    public static final java.lang.String GENDER_MALE = android.text.style.TtsSpan.GENDER_MALE;
    public static final java.lang.String GENDER_NEUTRAL = android.text.style.TtsSpan.GENDER_NEUTRAL;
    public static final int MONTH_APRIL = android.text.style.TtsSpan.MONTH_APRIL;
    public static final int MONTH_AUGUST = android.text.style.TtsSpan.MONTH_AUGUST;
    public static final int MONTH_DECEMBER = android.text.style.TtsSpan.MONTH_DECEMBER;
    public static final int MONTH_FEBRUARY = android.text.style.TtsSpan.MONTH_FEBRUARY;
    public static final int MONTH_JANUARY = android.text.style.TtsSpan.MONTH_JANUARY;
    public static final int MONTH_JULY = android.text.style.TtsSpan.MONTH_JULY;
    public static final int MONTH_JUNE = android.text.style.TtsSpan.MONTH_JUNE;
    public static final int MONTH_MARCH = android.text.style.TtsSpan.MONTH_MARCH;
    public static final int MONTH_MAY = android.text.style.TtsSpan.MONTH_MAY;
    public static final int MONTH_NOVEMBER = android.text.style.TtsSpan.MONTH_NOVEMBER;
    public static final int MONTH_OCTOBER = android.text.style.TtsSpan.MONTH_OCTOBER;
    public static final int MONTH_SEPTEMBER = android.text.style.TtsSpan.MONTH_SEPTEMBER;
    public static final java.lang.String MULTIPLICITY_DUAL = android.text.style.TtsSpan.MULTIPLICITY_DUAL;
    public static final java.lang.String MULTIPLICITY_PLURAL = android.text.style.TtsSpan.MULTIPLICITY_PLURAL;
    public static final java.lang.String MULTIPLICITY_SINGLE = android.text.style.TtsSpan.MULTIPLICITY_SINGLE;
    public static final java.lang.String TYPE_CARDINAL = android.text.style.TtsSpan.TYPE_CARDINAL;
    public static final java.lang.String TYPE_DATE = android.text.style.TtsSpan.TYPE_DATE;
    public static final java.lang.String TYPE_DECIMAL = android.text.style.TtsSpan.TYPE_DECIMAL;
    public static final java.lang.String TYPE_DIGITS = android.text.style.TtsSpan.TYPE_DIGITS;
    public static final java.lang.String TYPE_ELECTRONIC = android.text.style.TtsSpan.TYPE_ELECTRONIC;
    public static final java.lang.String TYPE_FRACTION = android.text.style.TtsSpan.TYPE_FRACTION;
    public static final java.lang.String TYPE_MEASURE = android.text.style.TtsSpan.TYPE_MEASURE;
    public static final java.lang.String TYPE_MONEY = android.text.style.TtsSpan.TYPE_MONEY;
    public static final java.lang.String TYPE_ORDINAL = android.text.style.TtsSpan.TYPE_ORDINAL;
    public static final java.lang.String TYPE_TELEPHONE = android.text.style.TtsSpan.TYPE_TELEPHONE;
    public static final java.lang.String TYPE_TEXT = android.text.style.TtsSpan.TYPE_TEXT;
    public static final java.lang.String TYPE_TIME = android.text.style.TtsSpan.TYPE_TIME;
    public static final java.lang.String TYPE_VERBATIM = android.text.style.TtsSpan.TYPE_VERBATIM;
    public static final int WEEKDAY_FRIDAY = android.text.style.TtsSpan.WEEKDAY_FRIDAY;
    public static final int WEEKDAY_MONDAY = android.text.style.TtsSpan.WEEKDAY_MONDAY;
    public static final int WEEKDAY_SATURDAY = android.text.style.TtsSpan.WEEKDAY_SATURDAY;
    public static final int WEEKDAY_SUNDAY = android.text.style.TtsSpan.WEEKDAY_SUNDAY;
    public static final int WEEKDAY_THURSDAY = android.text.style.TtsSpan.WEEKDAY_THURSDAY;
    public static final int WEEKDAY_TUESDAY = android.text.style.TtsSpan.WEEKDAY_TUESDAY;
    public static final int WEEKDAY_WEDNESDAY = android.text.style.TtsSpan.WEEKDAY_WEDNESDAY;

    public static final class Builder {
        private final android.text.style.TtsSpan.Builder real;

        public Builder(android.text.style.TtsSpan.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.Builder wrap(android.text.style.TtsSpan.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.Builder(real);
        }

        public android.text.style.TtsSpan.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan build() {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.wrap(real.build());
        }

    }
    public static final class CardinalBuilder {
        private final android.text.style.TtsSpan.CardinalBuilder real;

        public CardinalBuilder(android.text.style.TtsSpan.CardinalBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.CardinalBuilder wrap(android.text.style.TtsSpan.CardinalBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.CardinalBuilder(real);
        }

        public android.text.style.TtsSpan.CardinalBuilder unwrap() {
            return real;
        }

        public CardinalBuilder() {
            this(new android.text.style.TtsSpan.CardinalBuilder());
        }

        public CardinalBuilder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.CardinalBuilder(arg0));
        }

        public CardinalBuilder(long arg0) {
            this(new android.text.style.TtsSpan.CardinalBuilder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.CardinalBuilder setNumber(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.CardinalBuilder.wrap(real.setNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.CardinalBuilder setNumber(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.CardinalBuilder.wrap(real.setNumber(arg0));
        }

    }
    public static final class DateBuilder {
        private final android.text.style.TtsSpan.DateBuilder real;

        public DateBuilder(android.text.style.TtsSpan.DateBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder wrap(android.text.style.TtsSpan.DateBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder(real);
        }

        public android.text.style.TtsSpan.DateBuilder unwrap() {
            return real;
        }

        public DateBuilder() {
            this(new android.text.style.TtsSpan.DateBuilder());
        }

        public DateBuilder(java.lang.Integer arg0, java.lang.Integer arg1, java.lang.Integer arg2, java.lang.Integer arg3) {
            this(new android.text.style.TtsSpan.DateBuilder(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder setDay(int arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder.wrap(real.setDay(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder setMonth(int arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder.wrap(real.setMonth(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder setWeekday(int arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder.wrap(real.setWeekday(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder setYear(int arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DateBuilder.wrap(real.setYear(arg0));
        }

    }
    public static final class DecimalBuilder {
        private final android.text.style.TtsSpan.DecimalBuilder real;

        public DecimalBuilder(android.text.style.TtsSpan.DecimalBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder wrap(android.text.style.TtsSpan.DecimalBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder(real);
        }

        public android.text.style.TtsSpan.DecimalBuilder unwrap() {
            return real;
        }

        public DecimalBuilder() {
            this(new android.text.style.TtsSpan.DecimalBuilder());
        }

        public DecimalBuilder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.text.style.TtsSpan.DecimalBuilder(arg0, arg1));
        }

        public DecimalBuilder(double arg0, int arg1, int arg2) {
            this(new android.text.style.TtsSpan.DecimalBuilder(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder setArgumentsFromDouble(double arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder.wrap(real.setArgumentsFromDouble(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder setFractionalPart(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder.wrap(real.setFractionalPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder setIntegerPart(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder.wrap(real.setIntegerPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder setIntegerPart(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DecimalBuilder.wrap(real.setIntegerPart(arg0));
        }

    }
    public static final class DigitsBuilder {
        private final android.text.style.TtsSpan.DigitsBuilder real;

        public DigitsBuilder(android.text.style.TtsSpan.DigitsBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.DigitsBuilder wrap(android.text.style.TtsSpan.DigitsBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.DigitsBuilder(real);
        }

        public android.text.style.TtsSpan.DigitsBuilder unwrap() {
            return real;
        }

        public DigitsBuilder() {
            this(new android.text.style.TtsSpan.DigitsBuilder());
        }

        public DigitsBuilder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.DigitsBuilder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.DigitsBuilder setDigits(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.DigitsBuilder.wrap(real.setDigits(arg0));
        }

    }
    public static final class ElectronicBuilder {
        private final android.text.style.TtsSpan.ElectronicBuilder real;

        public ElectronicBuilder(android.text.style.TtsSpan.ElectronicBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder wrap(android.text.style.TtsSpan.ElectronicBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder(real);
        }

        public android.text.style.TtsSpan.ElectronicBuilder unwrap() {
            return real;
        }

        public ElectronicBuilder() {
            this(new android.text.style.TtsSpan.ElectronicBuilder());
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setDomain(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setDomain(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setEmailArguments(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setEmailArguments(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setFragmentId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setFragmentId(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setPassword(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setPassword(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setPath(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setPath(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setPort(int arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setPort(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setProtocol(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setProtocol(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setQueryString(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setQueryString(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder setUsername(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.ElectronicBuilder.wrap(real.setUsername(arg0));
        }

    }
    public static final class FractionBuilder {
        private final android.text.style.TtsSpan.FractionBuilder real;

        public FractionBuilder(android.text.style.TtsSpan.FractionBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder wrap(android.text.style.TtsSpan.FractionBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder(real);
        }

        public android.text.style.TtsSpan.FractionBuilder unwrap() {
            return real;
        }

        public FractionBuilder() {
            this(new android.text.style.TtsSpan.FractionBuilder());
        }

        public FractionBuilder(long arg0, long arg1, long arg2) {
            this(new android.text.style.TtsSpan.FractionBuilder(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder setDenominator(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder.wrap(real.setDenominator(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder setDenominator(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder.wrap(real.setDenominator(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder setIntegerPart(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder.wrap(real.setIntegerPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder setIntegerPart(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder.wrap(real.setIntegerPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder setNumerator(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder.wrap(real.setNumerator(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder setNumerator(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.FractionBuilder.wrap(real.setNumerator(arg0));
        }

    }
    public static final class MeasureBuilder {
        private final android.text.style.TtsSpan.MeasureBuilder real;

        public MeasureBuilder(android.text.style.TtsSpan.MeasureBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder wrap(android.text.style.TtsSpan.MeasureBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder(real);
        }

        public android.text.style.TtsSpan.MeasureBuilder unwrap() {
            return real;
        }

        public MeasureBuilder() {
            this(new android.text.style.TtsSpan.MeasureBuilder());
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setDenominator(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setDenominator(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setDenominator(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setDenominator(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setFractionalPart(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setFractionalPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setIntegerPart(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setIntegerPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setIntegerPart(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setIntegerPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setNumber(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setNumber(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setNumerator(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setNumerator(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setNumerator(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setNumerator(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder setUnit(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MeasureBuilder.wrap(real.setUnit(arg0));
        }

    }
    public static final class MoneyBuilder {
        private final android.text.style.TtsSpan.MoneyBuilder real;

        public MoneyBuilder(android.text.style.TtsSpan.MoneyBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder wrap(android.text.style.TtsSpan.MoneyBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder(real);
        }

        public android.text.style.TtsSpan.MoneyBuilder unwrap() {
            return real;
        }

        public MoneyBuilder() {
            this(new android.text.style.TtsSpan.MoneyBuilder());
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder setCurrency(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder.wrap(real.setCurrency(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder setFractionalPart(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder.wrap(real.setFractionalPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder setIntegerPart(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder.wrap(real.setIntegerPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder setIntegerPart(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder.wrap(real.setIntegerPart(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder setQuantity(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.MoneyBuilder.wrap(real.setQuantity(arg0));
        }

    }
    public static final class OrdinalBuilder {
        private final android.text.style.TtsSpan.OrdinalBuilder real;

        public OrdinalBuilder(android.text.style.TtsSpan.OrdinalBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.OrdinalBuilder wrap(android.text.style.TtsSpan.OrdinalBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.OrdinalBuilder(real);
        }

        public android.text.style.TtsSpan.OrdinalBuilder unwrap() {
            return real;
        }

        public OrdinalBuilder() {
            this(new android.text.style.TtsSpan.OrdinalBuilder());
        }

        public OrdinalBuilder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.OrdinalBuilder(arg0));
        }

        public OrdinalBuilder(long arg0) {
            this(new android.text.style.TtsSpan.OrdinalBuilder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.OrdinalBuilder setNumber(long arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.OrdinalBuilder.wrap(real.setNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.OrdinalBuilder setNumber(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.OrdinalBuilder.wrap(real.setNumber(arg0));
        }

    }
    public static final class SemioticClassBuilder {
        private final android.text.style.TtsSpan.SemioticClassBuilder real;

        public SemioticClassBuilder(android.text.style.TtsSpan.SemioticClassBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.SemioticClassBuilder wrap(android.text.style.TtsSpan.SemioticClassBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.SemioticClassBuilder(real);
        }

        public android.text.style.TtsSpan.SemioticClassBuilder unwrap() {
            return real;
        }

        public SemioticClassBuilder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.SemioticClassBuilder(arg0));
        }

    }
    public static final class TelephoneBuilder {
        private final android.text.style.TtsSpan.TelephoneBuilder real;

        public TelephoneBuilder(android.text.style.TtsSpan.TelephoneBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder wrap(android.text.style.TtsSpan.TelephoneBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder(real);
        }

        public android.text.style.TtsSpan.TelephoneBuilder unwrap() {
            return real;
        }

        public TelephoneBuilder() {
            this(new android.text.style.TtsSpan.TelephoneBuilder());
        }

        public TelephoneBuilder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.TelephoneBuilder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder setCountryCode(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder.wrap(real.setCountryCode(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder setExtension(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder.wrap(real.setExtension(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder setNumberParts(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.TelephoneBuilder.wrap(real.setNumberParts(arg0));
        }

    }
    public static final class TextBuilder {
        private final android.text.style.TtsSpan.TextBuilder real;

        public TextBuilder(android.text.style.TtsSpan.TextBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.TextBuilder wrap(android.text.style.TtsSpan.TextBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.TextBuilder(real);
        }

        public android.text.style.TtsSpan.TextBuilder unwrap() {
            return real;
        }

        public TextBuilder() {
            this(new android.text.style.TtsSpan.TextBuilder());
        }

        public TextBuilder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.TextBuilder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.TextBuilder setText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.TextBuilder.wrap(real.setText(arg0));
        }

    }
    public static final class TimeBuilder {
        private final android.text.style.TtsSpan.TimeBuilder real;

        public TimeBuilder(android.text.style.TtsSpan.TimeBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.TimeBuilder wrap(android.text.style.TtsSpan.TimeBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.TimeBuilder(real);
        }

        public android.text.style.TtsSpan.TimeBuilder unwrap() {
            return real;
        }

        public TimeBuilder() {
            this(new android.text.style.TtsSpan.TimeBuilder());
        }

        public TimeBuilder(int arg0, int arg1) {
            this(new android.text.style.TtsSpan.TimeBuilder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.TimeBuilder setHours(int arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.TimeBuilder.wrap(real.setHours(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.TimeBuilder setMinutes(int arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.TimeBuilder.wrap(real.setMinutes(arg0));
        }

    }
    public static final class VerbatimBuilder {
        private final android.text.style.TtsSpan.VerbatimBuilder real;

        public VerbatimBuilder(android.text.style.TtsSpan.VerbatimBuilder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.style.TtsSpan.VerbatimBuilder wrap(android.text.style.TtsSpan.VerbatimBuilder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.TtsSpan.VerbatimBuilder(real);
        }

        public android.text.style.TtsSpan.VerbatimBuilder unwrap() {
            return real;
        }

        public VerbatimBuilder() {
            this(new android.text.style.TtsSpan.VerbatimBuilder());
        }

        public VerbatimBuilder(java.lang.String arg0) {
            this(new android.text.style.TtsSpan.VerbatimBuilder(arg0));
        }

        public com.micklab.dcg.wrapper.android.text.style.TtsSpan.VerbatimBuilder setVerbatim(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.text.style.TtsSpan.VerbatimBuilder.wrap(real.setVerbatim(arg0));
        }

    }
}
