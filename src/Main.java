public class Main {
    public static void main(String[] args) {
        // Домашнее задание -3
        //Задание 1

        int vklad = 29000;
        int vkladSum = 0;

        for(int i = 1; i <= 12; i++ ) {
            vkladSum = vkladSum + vklad;
            System.out.println("Месяц " + i + " сумма накоплений равна "+ vkladSum + " рублей");

        }

    }
}