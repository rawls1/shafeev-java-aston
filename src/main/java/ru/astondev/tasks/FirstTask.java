package ru.astondev.tasks;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));

        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("Частное: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно.");
        }
    }
}
