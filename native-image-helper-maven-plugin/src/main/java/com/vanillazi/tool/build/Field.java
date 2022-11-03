package com.vanillazi.tool.build;

import lombok.Data;
import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Data
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
}
