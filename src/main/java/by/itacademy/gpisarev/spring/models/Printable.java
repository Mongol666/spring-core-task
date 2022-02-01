package by.itacademy.gpisarev.spring.models;

public interface Printable {
    default void print() {
        System.out.println(this);
    }
}
