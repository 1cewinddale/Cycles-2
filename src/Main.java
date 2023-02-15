public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }public static void task1() {
        System.out.println("Задача 1");
        int postpone = 15_000;
        int  total = 0;
        int month = 0;
        while (total <=2_459_000) {
            month = month + 1;
            total = total + postpone;
            System.out.println("Месяц " + month + " Сумма накоплений равна " + total);
        }
    }public static void task2() {
            System.out.println("Задача 2");
            int total = 0;
            while (total < 10) {
                total = total + 1;
                System.out.print(" " + total);
            }
        System.out.println();

            for (int i = 10; i >0; i--) {
            System.out.print(" " +i);
            }
        System.out.println();
    }public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for(int year = 1; year <= 10; year++) {
        population = population/1000*fertility-population/1000*mortality;
        System.out.println("Год "+year+" Численность населения составляет "+population);
        }
    }public static void task4() {
        System.out.println("Задача 4");
        int postpone = 15_000;
        int total = 0;
        for (int i = 0 ;i < 12_000_000; i++);{
            total = postpone*7/100;
            total = total + postpone;

            System.out.println(total);

        }

    }


}
