package Homework;

public class Ex1_2 {
    public static void main(String[] args) {
        try {
            int result = 7 / 0;
            System.out.println("Результат: " + result);
        } finally {
            System.out.println("Этот блок выполняется всегда, независимо от исключений.");
        }
    }
}

