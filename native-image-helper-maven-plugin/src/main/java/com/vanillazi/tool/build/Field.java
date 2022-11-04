package com.vanillazi.tool.build;

import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Field {

    @Parameter
    @Nonnull
    private String name;

    @Parameter
    @Nullable
    private Boolean allowWrite;

    @Parameter
    @Nullable
    private Boolean allowUnsafeAccess;

    public Field() {

    }

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }

    @Nullable
    public Boolean getAllowWrite() {
        return allowWrite;
    }

    public void setAllowWrite(@Nullable Boolean allowWrite) {
        this.allowWrite = allowWrite;
    }

    @Nullable
    public Boolean getAllowUnsafeAccess() {
        return allowUnsafeAccess;
    }

    public void setAllowUnsafeAccess(@Nullable Boolean allowUnsafeAccess) {
        this.allowUnsafeAccess = allowUnsafeAccess;
    }
}
