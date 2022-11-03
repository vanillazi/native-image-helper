package com.vanillazi.tool.build;

import lombok.Data;
import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

@Data
public class ReflectionConfig {

    @Parameter
    @Nonnull
    private String name;
    @Parameter
    @Nullable
    private Boolean allDeclaredConstructors;
    @Parameter
    @Nullable
    private Boolean allPublicConstructors;
    @Parameter
    @Nullable
    private Boolean allDeclaredMethods;
    @Parameter
    @Nullable
    private Boolean allPublicMethods;
    @Parameter
    @Nullable
    private Boolean allPublicFields;
    @Parameter
    @Nullable
    private Boolean allDeclaredFields;
    @Parameter
    @Nullable
    private Boolean allDeclaredClasses;
    @Parameter
    @Nullable
    private Boolean allPermittedSubclasses;
    @Parameter
    @Nullable
    private Boolean allPublicClasses;
    @Parameter
    @Nullable
    private Boolean queryAllDeclaredConstructors;
    @Parameter
    @Nullable
    private Boolean queryAllPublicConstructors;
    @Parameter
    @Nullable
    private Boolean queryAllDeclaredMethods;
    @Parameter
    @Nullable
    private Boolean queryAllPublicMethods;
    @Parameter
    @Nullable
    private List<Method> methods;
    @Parameter
    @Nullable
    private List<Method> queriedMethods;
    @Parameter
    @Nullable
    private List<Field> fields;

    public ReflectionConfig() {

    }
}
