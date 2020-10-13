package aost;

public class Person {
    String name;
    int age;

    public Person(String szr, int i) {
        name=szr;
        age=i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(name+""+age);
    }
}
