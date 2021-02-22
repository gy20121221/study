package aost;

import java.util.Objects;

public class Study7Test {
    private String name;
    private int id;

    public Study7Test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Study7Test() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Study7Test that = (Study7Test) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Study7Test{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
