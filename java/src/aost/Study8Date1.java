package aost;

public class Study8Date1 {
    private String name;
    private int age;

    public Study8Date1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Study8Date1() {
    }

    @Override
    public String toString() {
        return "Study8Date1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
