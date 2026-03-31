package com.micklab.dcg.output;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class OutputModelJsonParser {
    private OutputModelJsonParser() {
    }

    public static Object parseSpec(String outputModelJson) {
        String trimmed = outputModelJson == null ? "" : outputModelJson.trim();
        if (trimmed.isEmpty()) {
            return null;
        }
        Parser parser = new Parser(trimmed);
        Object root = parser.parseValue();
        parser.skipWhitespace();
        if (!parser.isAtEnd()) {
            throw new IllegalArgumentException("Invalid OutputModel JSON.");
        }
        if (root instanceof Map<?, ?>) {
            Object spec = ((Map<?, ?>) root).get("spec");
            if (spec != null) {
                return spec;
            }
        }
        return root;
    }

    public static boolean isEmptySpec(Object spec) {
        if (spec == null) {
            return true;
        }
        if (spec instanceof Collection<?>) {
            return ((Collection<?>) spec).isEmpty();
        }
        if (spec instanceof Map<?, ?>) {
            return ((Map<?, ?>) spec).isEmpty();
        }
        if (spec.getClass().isArray()) {
            return Array.getLength(spec) == 0;
        }
        return false;
    }

    private static final class Parser {
        private final String input;
        private int index;

        private Parser(String input) {
            this.input = input == null ? "" : input;
        }

        private Object parseValue() {
            skipWhitespace();
            if (isAtEnd()) {
                throw error("Unexpected end of JSON.");
            }
            char current = input.charAt(index);
            if (current == '{') {
                return parseObject();
            }
            if (current == '[') {
                return parseArray();
            }
            if (current == '"') {
                return parseString();
            }
            if (current == 't' || current == 'f') {
                return parseBoolean();
            }
            if (current == 'n') {
                parseNull();
                return null;
            }
            if (current == '-' || Character.isDigit(current)) {
                return parseNumber();
            }
            throw error("Unexpected token: " + current);
        }

        private Map<String, Object> parseObject() {
            expect('{');
            LinkedHashMap<String, Object> object = new LinkedHashMap<>();
            skipWhitespace();
            if (peek('}')) {
                index++;
                return object;
            }
            while (true) {
                skipWhitespace();
                String key = parseString();
                skipWhitespace();
                expect(':');
                Object value = parseValue();
                object.put(key, value);
                skipWhitespace();
                if (peek('}')) {
                    index++;
                    return object;
                }
                expect(',');
            }
        }

        private List<Object> parseArray() {
            expect('[');
            ArrayList<Object> array = new ArrayList<>();
            skipWhitespace();
            if (peek(']')) {
                index++;
                return array;
            }
            while (true) {
                array.add(parseValue());
                skipWhitespace();
                if (peek(']')) {
                    index++;
                    return array;
                }
                expect(',');
            }
        }

        private String parseString() {
            expect('"');
            StringBuilder builder = new StringBuilder();
            while (!isAtEnd()) {
                char current = input.charAt(index++);
                if (current == '"') {
                    return builder.toString();
                }
                if (current == '\\') {
                    if (isAtEnd()) {
                        throw error("Invalid escape sequence.");
                    }
                    char escaped = input.charAt(index++);
                    switch (escaped) {
                        case '"':
                        case '\\':
                        case '/':
                            builder.append(escaped);
                            break;
                        case 'b':
                            builder.append('\b');
                            break;
                        case 'f':
                            builder.append('\f');
                            break;
                        case 'n':
                            builder.append('\n');
                            break;
                        case 'r':
                            builder.append('\r');
                            break;
                        case 't':
                            builder.append('\t');
                            break;
                        case 'u':
                            builder.append(parseUnicodeEscape());
                            break;
                        default:
                            throw error("Unsupported escape sequence: \\" + escaped);
                    }
                    continue;
                }
                builder.append(current);
            }
            throw error("Unterminated string.");
        }

        private char parseUnicodeEscape() {
            if (index + 4 > input.length()) {
                throw error("Incomplete unicode escape.");
            }
            String hex = input.substring(index, index + 4);
            index += 4;
            try {
                return (char) Integer.parseInt(hex, 16);
            } catch (NumberFormatException exception) {
                throw error("Invalid unicode escape: \\u" + hex);
            }
        }

        private Boolean parseBoolean() {
            if (input.startsWith("true", index)) {
                index += 4;
                return Boolean.TRUE;
            }
            if (input.startsWith("false", index)) {
                index += 5;
                return Boolean.FALSE;
            }
            throw error("Invalid boolean token.");
        }

        private void parseNull() {
            if (input.startsWith("null", index)) {
                index += 4;
                return;
            }
            throw error("Invalid null token.");
        }

        private Number parseNumber() {
            int start = index;
            if (peek('-')) {
                index++;
            }
            consumeDigits();
            boolean fractional = false;
            if (peek('.')) {
                fractional = true;
                index++;
                consumeDigits();
            }
            if (peek('e') || peek('E')) {
                fractional = true;
                index++;
                if (peek('+') || peek('-')) {
                    index++;
                }
                consumeDigits();
            }
            String token = input.substring(start, index);
            try {
                if (fractional) {
                    return Double.parseDouble(token);
                }
                long longValue = Long.parseLong(token);
                if (longValue >= Integer.MIN_VALUE && longValue <= Integer.MAX_VALUE) {
                    return (int) longValue;
                }
                return longValue;
            } catch (NumberFormatException exception) {
                throw error("Invalid number token: " + token);
            }
        }

        private void consumeDigits() {
            int start = index;
            while (!isAtEnd() && Character.isDigit(input.charAt(index))) {
                index++;
            }
            if (start == index) {
                throw error("Expected digits.");
            }
        }

        private void expect(char expected) {
            skipWhitespace();
            if (isAtEnd() || input.charAt(index) != expected) {
                throw error("Expected '" + expected + "'.");
            }
            index++;
        }

        private boolean peek(char expected) {
            return !isAtEnd() && input.charAt(index) == expected;
        }

        private void skipWhitespace() {
            while (!isAtEnd()) {
                char current = input.charAt(index);
                if (!Character.isWhitespace(current)) {
                    return;
                }
                index++;
            }
        }

        private boolean isAtEnd() {
            return index >= input.length();
        }

        private IllegalArgumentException error(String message) {
            return new IllegalArgumentException(message + " at index " + index + ".");
        }
    }
}
