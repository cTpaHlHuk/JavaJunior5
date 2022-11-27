package Lesson1;

public class Homework3 {
    public static void main(String[] args) {

        double pizza = 230;
        double buuble = 26;
        double candy = 2.5;
        double summ = 1000;

        int pizzaAmount = (int) (summ / pizza);
        int buubleAmount = (int) ((summ - (pizzaAmount * pizza)) / buuble);
        int candyAmount = (int) ((summ - (pizzaAmount * pizza) - buubleAmount * buuble) / candy);
        int ost = (int) (summ - pizzaAmount * pizza - buubleAmount * buuble - candyAmount * candy);

        System.out.println("Количество пицц = " + pizzaAmount);
        System.out.println("Количество жвачек = " + buubleAmount);
        System.out.println("Количество конфет = " + candyAmount);
        System.out.println("Остаток = " + ost);


    }
}
