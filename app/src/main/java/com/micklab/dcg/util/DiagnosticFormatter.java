package com.micklab.dcg.util;

public final class DiagnosticFormatter {
    private DiagnosticFormatter() {
    }

    public static String formatCompilerOutput(String rawOutput, String workspacePath, String sourceFilePath, String displayFileName) {
        String sanitized = rawOutput == null ? "" : rawOutput;
        if (sourceFilePath != null && displayFileName != null) {
            sanitized = sanitized.replace(sourceFilePath, displayFileName);
        }
        if (workspacePath != null) {
            sanitized = sanitized.replace(workspacePath, "workspace");
        }
        sanitized = sanitized.replace("\r\n", "\n");
        sanitized = sanitized.replaceAll("\n{3,}", "\n\n");
        sanitized = sanitized.trim();
        return sanitized.isEmpty() ? "Compilation failed with no diagnostic output." : sanitized;
    }

    public static String formatThrowable(Throwable throwable) {
        if (throwable == null) {
            return "Unknown runtime failure.";
        }
        StringBuilder builder = new StringBuilder();
        Throwable current = throwable;
        int causeIndex = 0;
        while (current != null && causeIndex < 4) {
            if (causeIndex > 0) {
                builder.append("\n\nCaused by: ");
            }
            builder.append(current.getClass().getName());
            if (current.getMessage() != null && !current.getMessage().trim().isEmpty()) {
                builder.append(": ").append(current.getMessage());
            }
            StackTraceElement[] trace = current.getStackTrace();
            for (int frame = 0; frame < trace.length && frame < 12; frame++) {
                builder.append("\n at ").append(trace[frame]);
            }
            current = current.getCause();
            causeIndex++;
        }
        return builder.toString();
    }

    public static String formatEntrypointGuidance(String qualifiedClassName) {
        return "No supported entrypoint found in " + qualifiedClassName
                + ". Add public static String run() or public static void main(String[] args).";
    }
}
