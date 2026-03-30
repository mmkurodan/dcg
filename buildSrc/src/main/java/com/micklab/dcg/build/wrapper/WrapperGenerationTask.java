package com.micklab.dcg.build.wrapper;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
public abstract class WrapperGenerationTask extends DefaultTask {
    @InputFile
    public abstract RegularFileProperty getAndroidJar();

    @OutputDirectory
    public abstract DirectoryProperty getOutputDirectory();

    @Input
    public abstract Property<String> getWrapperRootPackage();

    @Input
    public abstract Property<String> getSecurityPolicyPrefix();

    @TaskAction
    public void generateWrappers() {
        File jar = getAndroidJar().getAsFile().get();
        File outputDir = getOutputDirectory().getAsFile().get();
        String wrapperRootPackage = getWrapperRootPackage().get();
        String securityPolicyPrefix = getSecurityPolicyPrefix().get();

        AndroidWrapperGenerator generator = new AndroidWrapperGenerator(
                jar,
                outputDir,
                wrapperRootPackage,
                securityPolicyPrefix,
                getLogger());
        generator.generate();
    }
}
