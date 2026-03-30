package com.micklab.dcg.build.wrapper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;

final class WrapperMethodDescriptor {
    private final String ownerClass;
    private final String name;
    private final String signatureKey;

    private WrapperMethodDescriptor(String ownerClass, String name, String signatureKey) {
        this.ownerClass = ownerClass;
        this.name = name;
        this.signatureKey = signatureKey;
    }

    static WrapperMethodDescriptor of(Method method) {
        return new WrapperMethodDescriptor(
                method.getDeclaringClass().getName(),
                method.getName(),
                signatureOf(method.getParameterTypes()));
    }

    static WrapperMethodDescriptor of(Constructor<?> constructor) {
        return new WrapperMethodDescriptor(
                constructor.getDeclaringClass().getName(),
                "<init>",
                signatureOf(constructor.getParameterTypes()));
    }

    private static String signatureOf(Class<?>[] parameterTypes) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                builder.append(',');
            }
            builder.append(parameterTypes[i].getName());
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrapperMethodDescriptor)) {
            return false;
        }
        WrapperMethodDescriptor that = (WrapperMethodDescriptor) other;
        return ownerClass.equals(that.ownerClass)
                && name.equals(that.name)
                && signatureKey.equals(that.signatureKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerClass, name, signatureKey);
    }
}
