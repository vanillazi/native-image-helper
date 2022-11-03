package com.vanillazi.tool.build;

import lombok.Data;
import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import java.util.List;

@Data
public class GeneratorConfig {

    @Parameter
    @Nonnull
    private String artifactId;

    @Parameter
    @Nonnull
    private String groupId;

    @Parameter
    @Nonnull
    private List<ReflectionConfig> reflectionConfigs;

    public GeneratorConfig() {

    }
}
