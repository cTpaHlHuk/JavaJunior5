package Lesson2;

public class Main6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 500; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
