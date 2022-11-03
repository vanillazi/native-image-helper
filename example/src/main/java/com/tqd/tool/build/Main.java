package com.tqd.tool.build;

import com.google.gson.GsonBuilder;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.Converter;

import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        var person=new Person();
        person.setName("test");
        person.setAge(1);
/*        Stream.of(Person.class.getDeclaredFields()).forEach(f->{
            System.out.println(f.getName());
        });*/
        var gson=new GsonBuilder().setPrettyPrinting().create();
        var json=gson.toJson(person);
        System.out.println("json:"+json);
        var type=Class.forName(Person.class.getCanonicalName()+"A");
        var object=gson.fromJson(json,type);
        var personA=(PersonA)object;
        System.out.println(personA.getName()+"-->"+personA.getAge());
        System.out.println(gson.toJson(object));
    }


    public void test1() throws NoSuchFieldException, IllegalAccessException {
        var s="""
                        <reflectionConfig>
                                                           <name>%s</name>
                                                           <allDeclaredConstructors>true</allDeclaredConstructors>
                                                           <allPublicConstructors>true</allPublicConstructors>
                                                           <allDeclaredFields>true</allDeclaredFields>
                                                           <allPublicFields>true</allPublicFields>
                                                           <fields>
                                                           <field>
                                                             <name>length</name>
                                                             <allowUnsafeAccess>true</allowUnsafeAccess>
                                                           </field>
                                                           </fields>
                                                       </reflectionConfig>
                """;
        var cu=new ConvertUtilsBean();
        var cf=ConvertUtilsBean.class.getDeclaredField("converters");
        cf.setAccessible(true);
        HashMap<Class<?>, Converter> cs= (HashMap<Class<?>, Converter>) cf.get(cu);
        cs.keySet().forEach(c->{
            if(c.getCanonicalName().contains("[]")) {
                System.out.println(s.formatted(c.getCanonicalName()));
            }
        });
    }
}