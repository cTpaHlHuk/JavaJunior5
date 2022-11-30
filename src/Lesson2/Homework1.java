package Lesson2;

public class Homework1 {
    public static void main(String[] args) {
//        С помощью цикла For, напечатать на консоль:
//        1) Только четные от -100 до -50
//        2) Все числа в обратном порядке от 10 до 30
//        3) Кол-во четных чисел в диапазоне от 30 до 61
//        4) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно

        int count = 0;

        for (int i = -100; i < -50; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int i = 30; i > 10; i--) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int i = 30; i < 61; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("--------------------");
        for (int i = 20; i < 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------");
    }
}
