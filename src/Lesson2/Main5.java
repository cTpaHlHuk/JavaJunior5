package Lesson2;

public class Main5 {
    public static void main(String[] args) {
        for (int i = 100; i < 500; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
