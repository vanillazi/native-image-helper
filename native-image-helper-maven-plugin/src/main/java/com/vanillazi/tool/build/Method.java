package com.vanillazi.tool.build;

import lombok.Data;
import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

@Data
public class Method {

    @Parameter
    @Nonnull
    private String name;

    @Parameter
    @Nullable
    private List<String> parameterTypes;

    public Method() {

    }
}
