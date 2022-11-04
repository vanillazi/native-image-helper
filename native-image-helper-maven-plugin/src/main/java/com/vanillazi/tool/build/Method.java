package com.vanillazi.tool.build;

import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class Method {

    @Parameter
    @Nonnull
    private String name;

    @Parameter
    @Nullable
    private List<String> parameterTypes;

    public Method() {

    }

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }

    @Nullable
    public List<String> getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(@Nullable List<String> parameterTypes) {
        this.parameterTypes = parameterTypes;
    }
}
