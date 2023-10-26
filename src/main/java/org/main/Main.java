package org.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое значение: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе значение: ");
        double b = scanner.nextDouble();

        System.out.print("Введите действие: ");
        String oper = scanner.next();

        switch (oper) {
            case "+":
                addition(a, b); break;
            case "-":
                subtraction(a, b); break;
            case "*":
                multiplication(a, b); break;
            case "/":
                division(a, b); break;
            default:
                System.out.println("Некорректный ввод действия"); break;
        }
    }

    public static void addition(double a, double b) {
        System.out.println(a+b);
    }


    public static void multiplication(double a, double b) {
        System.out.println(a*b);
    }

    public static void division(double a, double b) {
        if (b != 0) {
            System.out.println(a/b);
        } else {
            System.out.println(-1);
        }
    }

    public static void subtraction(double a, double b) {
        System.out.println(a-b);
    }
}