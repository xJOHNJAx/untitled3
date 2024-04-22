package Homework;

public class Ex1_1 {
    public static void main(String[] args) {
        try {
            int result = 7 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Нельзя делить на ноль.");
        }
    }
}

