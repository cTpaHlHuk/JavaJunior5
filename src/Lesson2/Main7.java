package Lesson2;

public class Main7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0 && i % 2 == 0 && i % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

