package cn.vanillazi.tool.build;

import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import java.util.List;

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

    @Nonnull
    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(@Nonnull String artifactId) {
        this.artifactId = artifactId;
    }

    @Nonnull
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(@Nonnull String groupId) {
        this.groupId = groupId;
    }

    @Nonnull
    public List<ReflectionConfig> getReflectionConfigs() {
        return reflectionConfigs;
    }

    public void setReflectionConfigs(@Nonnull List<ReflectionConfig> reflectionConfigs) {
        this.reflectionConfigs = reflectionConfigs;
    }
}
