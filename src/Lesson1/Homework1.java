package Lesson1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число что бы узнать, четное или нет");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        }else{
            System.out.println("Число не четное");
        }
    }
}
