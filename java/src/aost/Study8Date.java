package aost;

public class Study8Date implements Comparable<Study8Date> {
    private String name;
    private int age;

    public Study8Date(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Study8Date() {
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

    @Override
    public String toString() {
        return "Strudy8Date{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Study8Date o) {


        return this.age-o.age;

    }
}
