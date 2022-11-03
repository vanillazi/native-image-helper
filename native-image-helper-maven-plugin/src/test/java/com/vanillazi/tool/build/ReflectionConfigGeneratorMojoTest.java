package com.vanillazi.tool.build;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionConfigGeneratorMojoTest {

    @Test
    public void test(){
        GeneratorConfig config=new GeneratorConfig();
        config.setGroupId("com.tqd.tool");
        config.setArtifactId("native-image-helper-maven-plugin");
        List<ReflectionConfig> cfgs=new ArrayList<>();
        var rc=new ReflectionConfig();
        rc.setAllDeclaredFields(true);
        rc.setName(MainTest.Person.class.getCanonicalName());
        cfgs.add(rc);
        config.setReflectionConfigs(cfgs);
        ReflectionConfigGeneratorMojo.generate("target",config);
    }
}