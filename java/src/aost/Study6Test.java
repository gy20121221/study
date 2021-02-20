package aost;

public class Study6Test<E> {
    private E id;

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }
    public <E> void method(E e){
        System.out.println(e);
    }
}
