public class Main {
    public static void main(String[] args) {
        // Домашнее задание -3
        //Задание 2

        int vklad = 29000;
        double vkladSum = 0;
        int proc = 12;
        // по хорошему ндо сумму вклада умножать на 12%
        // затем делить на 365(366) и умножать на количество дней в месяце
        // но для упрощения буду просто умножать на 1%

        for(int i = 1; i <= 12; i++ ) {
            vkladSum = vkladSum + vkladSum/100;
            vkladSum = vkladSum  + vklad;
            System.out.println("Месяц " + i + " сумма накоплений равна "+ vkladSum + " рублей");

        }

    }
}