package cn.vanillazi.tool.build;

import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ReflectionConfig {

    @Parameter
    @Nonnull
    private String name;
    @Parameter
    @Nullable
    private Boolean allDeclaredConstructors=true;
    @Parameter
    @Nullable
    private Boolean allPublicConstructors=true;
    @Parameter
    @Nullable
    private Boolean allDeclaredMethods;
    @Parameter
    @Nullable
    private Boolean allPublicMethods;
    @Parameter
    @Nullable
    private Boolean allPublicFields=true;
    @Parameter
    @Nullable
    private Boolean allDeclaredFields=true;
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

    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        this.name = name;
    }

    @Nullable
    public Boolean getAllDeclaredConstructors() {
        return allDeclaredConstructors;
    }

    public void setAllDeclaredConstructors(@Nullable Boolean allDeclaredConstructors) {
        this.allDeclaredConstructors = allDeclaredConstructors;
    }

    @Nullable
    public Boolean getAllPublicConstructors() {
        return allPublicConstructors;
    }

    public void setAllPublicConstructors(@Nullable Boolean allPublicConstructors) {
        this.allPublicConstructors = allPublicConstructors;
    }

    @Nullable
    public Boolean getAllDeclaredMethods() {
        return allDeclaredMethods;
    }

    public void setAllDeclaredMethods(@Nullable Boolean allDeclaredMethods) {
        this.allDeclaredMethods = allDeclaredMethods;
    }

    @Nullable
    public Boolean getAllPublicMethods() {
        return allPublicMethods;
    }

    public void setAllPublicMethods(@Nullable Boolean allPublicMethods) {
        this.allPublicMethods = allPublicMethods;
    }

    @Nullable
    public Boolean getAllPublicFields() {
        return allPublicFields;
    }

    public void setAllPublicFields(@Nullable Boolean allPublicFields) {
        this.allPublicFields = allPublicFields;
    }

    @Nullable
    public Boolean getAllDeclaredFields() {
        return allDeclaredFields;
    }

    public void setAllDeclaredFields(@Nullable Boolean allDeclaredFields) {
        this.allDeclaredFields = allDeclaredFields;
    }

    @Nullable
    public Boolean getAllDeclaredClasses() {
        return allDeclaredClasses;
    }

    public void setAllDeclaredClasses(@Nullable Boolean allDeclaredClasses) {
        this.allDeclaredClasses = allDeclaredClasses;
    }

    @Nullable
    public Boolean getAllPermittedSubclasses() {
        return allPermittedSubclasses;
    }

    public void setAllPermittedSubclasses(@Nullable Boolean allPermittedSubclasses) {
        this.allPermittedSubclasses = allPermittedSubclasses;
    }

    @Nullable
    public Boolean getAllPublicClasses() {
        return allPublicClasses;
    }

    public void setAllPublicClasses(@Nullable Boolean allPublicClasses) {
        this.allPublicClasses = allPublicClasses;
    }

    @Nullable
    public Boolean getQueryAllDeclaredConstructors() {
        return queryAllDeclaredConstructors;
    }

    public void setQueryAllDeclaredConstructors(@Nullable Boolean queryAllDeclaredConstructors) {
        this.queryAllDeclaredConstructors = queryAllDeclaredConstructors;
    }

    @Nullable
    public Boolean getQueryAllPublicConstructors() {
        return queryAllPublicConstructors;
    }

    public void setQueryAllPublicConstructors(@Nullable Boolean queryAllPublicConstructors) {
        this.queryAllPublicConstructors = queryAllPublicConstructors;
    }

    @Nullable
    public Boolean getQueryAllDeclaredMethods() {
        return queryAllDeclaredMethods;
    }

    public void setQueryAllDeclaredMethods(@Nullable Boolean queryAllDeclaredMethods) {
        this.queryAllDeclaredMethods = queryAllDeclaredMethods;
    }

    @Nullable
    public Boolean getQueryAllPublicMethods() {
        return queryAllPublicMethods;
    }

    public void setQueryAllPublicMethods(@Nullable Boolean queryAllPublicMethods) {
        this.queryAllPublicMethods = queryAllPublicMethods;
    }

    @Nullable
    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(@Nullable List<Method> methods) {
        this.methods = methods;
    }

    @Nullable
    public List<Method> getQueriedMethods() {
        return queriedMethods;
    }

    public void setQueriedMethods(@Nullable List<Method> queriedMethods) {
        this.queriedMethods = queriedMethods;
    }

    @Nullable
    public List<Field> getFields() {
        return fields;
    }

    public void setFields(@Nullable List<Field> fields) {
        this.fields = fields;
    }
}
