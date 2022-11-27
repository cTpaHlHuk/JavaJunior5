package Lesson1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число");
        int a = scanner.nextInt();
        System.out.println("Введи второе число");
        int b = scanner.nextInt();
        System.out.println("Введи третье число");
        int c = scanner.nextInt();
        int per = a + b + c;
        System.out.println("Периметр = " + per);
    }
}
