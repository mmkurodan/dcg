package com.micklab.dcg.model;

public class SourceSnippet {
    private String id;
    private String title;
    private String fileName;
    private SupportedLanguage language;
    private String content;
    private long updatedAt;

    public SourceSnippet() {
        this.language = SupportedLanguage.JAVA;
        this.content = "";
    }

    public SourceSnippet(String id, String title, String fileName, SupportedLanguage language, String content, long updatedAt) {
        this.id = id;
        this.title = title;
        this.fileName = fileName;
        this.language = language == null ? SupportedLanguage.JAVA : language;
        this.content = content == null ? "" : content;
        this.updatedAt = updatedAt;
    }

    public static SourceSnippet createTemplate(SupportedLanguage language) {
        SupportedLanguage target = language == null ? SupportedLanguage.JAVA : language;
        String baseName = target == SupportedLanguage.JAVA ? "HelloJava" : target.getDisplayName().replaceAll("[^A-Za-z0-9]+", "");
        SourceSnippet snippet = new SourceSnippet();
        snippet.setTitle(baseName);
        snippet.setLanguage(target);
        snippet.setFileName(target.buildFileName(baseName));
        snippet.setContent(target.defaultTemplate(baseName));
        snippet.setUpdatedAt(System.currentTimeMillis());
        return snippet;
    }

    public SourceSnippet copy() {
        return new SourceSnippet(id, title, fileName, language, content, updatedAt);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public SupportedLanguage getLanguage() {
        return language;
    }

    public void setLanguage(SupportedLanguage language) {
        this.language = language == null ? SupportedLanguage.JAVA : language;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? "" : content;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
