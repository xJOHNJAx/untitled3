package Homework;

import java.util.*;
import java.util.stream.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int errorCount = 0;

        System.out.println("Введите числа для массива (для завершения введите 'end'):");

        while (true) {
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
                errorCount = 0;
            } catch (NumberFormatException e) {
                errorCount++;
                System.out.println("Ошибка: Введено не число. Попробуйте еще раз.");
                if (errorCount >= 3) {
                    System.out.println("Превышено количество ошибочных попыток. Программа завершена.");
                    return;
                }
            }
        }
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();

        System.out.println("Отсортированный список: " + sortedNumbers);
    }
}

