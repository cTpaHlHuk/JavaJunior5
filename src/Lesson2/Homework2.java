package Lesson2;

public class Homework2 {
    public static void main(String[] args) {
        //5) ** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500;

        int money = 9500;
        int cost = 200000;
        double age = 0;
        int month = 0;

        for (int i = 0; i <= cost; i = i + money) {
            month++;
            age = Math.ceil(month / (double)12);
        }
        System.out.println("Нужно " + age + " год(а)");
        System.out.println("И вы нанакопите за " + month + "месяц(а-ов) " + money * month);
    }
}
