// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MealType {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MealType(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MealType wrap(android.health.connect.datatypes.MealType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MealType(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.MealType getReal() {
        return (android.health.connect.datatypes.MealType) real;
    }

    public android.health.connect.datatypes.MealType unwrap() {
        return getReal();
    }

    public static final int MEAL_TYPE_BREAKFAST = android.health.connect.datatypes.MealType.MEAL_TYPE_BREAKFAST;
    public static final int MEAL_TYPE_DINNER = android.health.connect.datatypes.MealType.MEAL_TYPE_DINNER;
    public static final int MEAL_TYPE_LUNCH = android.health.connect.datatypes.MealType.MEAL_TYPE_LUNCH;
    public static final int MEAL_TYPE_SNACK = android.health.connect.datatypes.MealType.MEAL_TYPE_SNACK;
    public static final int MEAL_TYPE_UNKNOWN = android.health.connect.datatypes.MealType.MEAL_TYPE_UNKNOWN;

}
