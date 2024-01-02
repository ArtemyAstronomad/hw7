public class HW7 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    private static void task1 (){
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000){
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            total = total + salary;
            month = month+1;
        }
    }
    private static void task2 (){
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for ( int d = 10; d >= 1; d--){
            System.out.print(d + " ");
        }
        System.out.println(" ");
    }
    private static void task3 (){
        int population = 12_000_000;
        int born = population/1000*17;
        int death = population/1000*8;
        int year = 0;
        while (year <= 10){
            System.out.println("Население страны Y " + population + " человек");
            year++;
            population = population - death + born;
        }
    }
    private static void task4(){
        int month = 0;
        double deposit = 15_000;
        for (;deposit<=12_000_000; month++){
            System.out.println("Месяц " + month + " , сумма вклада равна " + deposit);
            deposit = deposit * 1.07;
        }
    }
    private static void task5 (){
        double deposit = 15_000;
        double targetDeposit = 12_000_000;
        int months = 0;

        while (deposit < targetDeposit) {
            months++;
            deposit += deposit * 0.07;

            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ": Сумма накоплений - " + deposit);
            }
        }

        System.out.println("Для достижения целевой суммы в " + targetDeposit + " рублей Василию потребуется " + months + " месяцев");
    }
    private static void task6 (){
        double deposit = 15_000;
        double targetMonth = 108;
        int months = 0;

        while (months <= targetMonth) {
            months++;
            deposit += deposit * 0.07;

            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ": Сумма накоплений - " + deposit);
            }
        }

        System.out.println("Накопления Василия за 9 лет составят " + deposit);
    }
    private static void task7 (){
        int firstFriday = 5;
            for (int i = firstFriday; i <= 31; i+=7){
                System.out.println("Сегодня пятница " + i + "-ое число, пора готовить отчет");
            }
    }
    private static void task8 (){

        for (int flyBy = 0; flyBy % 79 == 0; flyBy += 79){
            while (flyBy > 1824 && flyBy < 2124){
                System.out.println(flyBy);
                flyBy += 79;
            }
        }

    }
}