package Homework;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        MySubclass mySubclass = new MySubclass();
        try {
            mySubclass.processValue(-1);
        } catch (MySubclassCheckedException e) {
            System.out.println("Перехвачено исключение MySubclassCheckedException: " + e.getMessage());
        } catch (MyCheckedException e) {
            System.out.println("Перехвачено исключение MyCheckedException: " + e.getMessage());
        }
    }
}