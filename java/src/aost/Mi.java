package aost;

import aost.Phone;

public class Mi extends Phone {
    @Override
    public String toString() {
        System.out.println("我是小米手机");
        return "Mi{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
