package ru.vadim_danilov.java.basik.homeworks.lesson1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5: ");

        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 3;
        int c = (int) (Math.random() * 10) + 4;
        boolean boo = (a % 2 == 0);

        switch (scanner.nextInt()) {
            case 1 -> greetings();
            case 2 -> checkSign(a, b, c);
            case 3 -> selectColor();
            case 4 -> compareNumbers();
            case 5 -> addOrSubstarctAndPrint(a, b, boo);
            default -> System.out.println("Вы ввели число не из интервала от 1 до 5");
        }

    }

    public static void greetings() {
        System.out.println("""
                Hello
                World
                from
                Java
                """);
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 25;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubstarctAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}
