package com.vanillazi.tool.build;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mageddo.aptools.IoUtils;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import javax.annotation.Nonnull;
import javax.annotation.processing.ProcessingEnvironment;
import javax.tools.StandardLocation;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.rmi.RemoteException;
import java.util.List;

@Mojo(name = "generate",defaultPhase = LifecyclePhase.COMPILE)
public class ReflectionConfigGeneratorMojo extends AbstractMojo {


    @Parameter(required = true)
    @Nonnull
    private List<GeneratorConfig> generatorConfigs;

    @Component
    private MavenProject mavenProject;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        var output=mavenProject.getBuild().getOutputDirectory();
        generatorConfigs.forEach(generatorConfig->generate(output,generatorConfig));
    }

    public static void generate(String baseDir,GeneratorConfig config){
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        var path= Path.of(baseDir,
                "META-INF",
                "native-image",
                config.getGroupId(),
                config.getArtifactId());
        if(path.toFile().exists() || path.toFile().mkdirs()){
            var file=Path.of(path.toString(),"reflect.json");
            var content=gson.toJson(config.getReflectionConfigs());
            StandardOpenOption options;
            if(file.toFile().exists()){
                options=StandardOpenOption.TRUNCATE_EXISTING;
            }else{
                options=StandardOpenOption.CREATE_NEW;
            }
            try {
                Files.writeString(file,content, StandardCharsets.UTF_8,options);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            createNativeImageProperties(path);
        }else{
            throw new RuntimeException("mkdir "+path.toFile().getAbsolutePath()+" failed!");
        }
    }

    private static void createNativeImageProperties(Path path) {
        var file=Path.of(path.toString(),"native-image.properties").toFile();
        if(file.exists()){
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (Writer nativeImagePropsWriter = new FileWriter(file)){
            nativeImagePropsWriter.append("Args=-H:ReflectionConfigurationResources=${.}/reflect.json\n");
        } catch (Throwable e){
            throw new RuntimeException("",e);
        }
    }
}
