package Lesson1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну первой стороны");
        int a = scanner.nextInt();
        System.out.println("Введите длинну второй стороны");
        int b = scanner.nextInt();
        System.out.println("Введите длинну третий стороны");
        int c = scanner.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println("Треугольник равносторонний");
        }
        else if ((a == b && a != c) || (a == c && a != b)) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник разносторонний");
        }
    }
}
