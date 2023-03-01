package cn.vanillazi.tool.build;

import com.google.gson.GsonBuilder;

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

}