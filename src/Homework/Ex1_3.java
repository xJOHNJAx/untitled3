package Homework;

public class Ex1_3 {
    public static void main(String[] args) {
        try {
            int result = 7 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Нельзя делить на ноль.");
        } finally {
            System.out.println("Этот блок выполняется всегда после try или catch, независимо от исключений.");
        }
    }
}
