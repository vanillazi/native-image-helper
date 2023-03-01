package cn.vanillazi.tool.build;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ReflectionConfigGeneratorMojoTest {

    @Test
    public void test(){
        GeneratorConfig config=new GeneratorConfig();
        config.setGroupId("cn.vanillazi.tool");
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