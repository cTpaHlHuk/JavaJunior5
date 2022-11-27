package Lesson1;

import java.util.Scanner;

public class Homework4 {


    public static class Binary {

        public static void binar(int a) {
            int b;
            String temp = "";
            while (a != 0) {
                b = a % 2;
                temp = b + temp;
                a = a / 2;
            }
            System.out.print(temp);
        }

        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                binar(i);
                System.out.println();
            }
        }
    }
}

