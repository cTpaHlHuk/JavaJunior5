package Lesson2;

public class Homework3 {
    public static void main(String[] args) {
        // 6)*** Даны два числа (a,b).  a больше b. нужно посчитать, сколько раз нужно умножить на 2 число b чтобы тот был больше а

        int a = 333;
        int b = 3;
        int count = 0;

        for (int i = b; i <= a; i = i * 2) {
            count++;
        }
        System.out.println("Нужно умножить " + count + "раз");
    }
}
