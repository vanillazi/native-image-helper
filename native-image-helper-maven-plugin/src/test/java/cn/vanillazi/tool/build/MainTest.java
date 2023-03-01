package cn.vanillazi.tool.build;

import com.google.gson.GsonBuilder;
import nativeimage.Reflection;
import nativeimage.core.ReflectionConfigBuilder;
import nativeimage.core.TypeBuilder;
import nativeimage.core.domain.Method;
import nativeimage.core.domain.ReflectionConfig;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Reflection(declaredConstructors = true, declaredFields = true)
    public static class Person{
        private String name;
        private Integer age;
    }
    public static void main(String[] args) {
        var gson=new GsonBuilder()
                .setPrettyPrinting()
                .create();
        var config=Person.class.getAnnotation(Reflection.class);
        //ReflectionConfigBuilder.of(Person.class,config);
        var type=Person.class.getCanonicalName();
        var builder=toBuilder()
                            .type(type)
                            .build();
        System.out.println(gson.toJson(builder));

    }

    private static ReflectionConfig.ReflectionConfigBuilder toBuilder() {
        final ReflectionConfig.ReflectionConfigBuilder builder = ReflectionConfig
                .builder()
                .allPublicConstructors(true)
                .allDeclaredConstructors(true)
                .allPublicFields(true)
                .allDeclaredFields(true)
                .allPublicMethods(true)
                .allDeclaredMethods(true)
                ;

            final List<Method> methods = new ArrayList<>();
            methods.add(Method.of("<init>"));
            builder.allDeclaredConstructors(true);
            builder.allPublicConstructors(true);
            builder.methods(methods);

        return builder;
    }
}