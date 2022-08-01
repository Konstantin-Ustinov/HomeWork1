import  java.lang.Math;

public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        // Task 1
        boolean isEmpty = false;
        byte thisByte = 3;
        short thisShort = 8;
        int thisInt = 4;
        long thisLong = 1_00_00L;
        float thisFloat = 4.35f;
        double thisDouble = 5.543211;
        char thisChar = 'c';
    }

    public static void task2() {
        System.out.println("Задание 2");
        double boxer1 = 78.2;
        double boxer2 = 72.7;

        System.out.println("Общий вес двух бойцов: " + (boxer1 + boxer2));
        System.out.println("Разница в весе двух бойцов: " + (boxer1 - boxer2));
    }

    public static void task3() {
        System.out.println("Задание 3");
        int oneBananaGram = 80;
        int ml100MilkGram = 105;
        int oneBriquetteIcecreamGram = 100;
        int oneEggGram = 100;
        int bananaCount = 5;
        int milkCount = 2;
        int icecreamCount = 2;
        int eggCount = 1;
        double sumAllKg = (oneBananaGram * bananaCount + ml100MilkGram * milkCount + oneBriquetteIcecreamGram *
                icecreamCount + oneEggGram * eggCount) / 1000.0;

        System.out.println("Общий вес еды: " + sumAllKg + "кг");
    }

    public static void task4() {
        System.out.println("Задание 4");

        int target = 7;
        double weightPerDay1 = 0.25;
        double weightPerDay2 = 0.5;
        double dayCount1 = target / weightPerDay1;
        double dayCount2 = target / weightPerDay2;

        System.out.println("Количество дней для похудения на " + target + "кг, если худеть по " +
                (weightPerDay1 * 1000) + "гр в день: " + dayCount1);
        System.out.println("Количество дней для похудения на " + target + "кг, если худеть по " +
                (weightPerDay2 * 1000) + "гр в день: " + dayCount2);
        System.out.println("Среднее количество дней для похудения на " + target + "кг: " + ((dayCount1 + dayCount2) / 2));
    }

    public static void task5() {
        System.out.println("Задание 5");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double percentUpSalary = 1.1;
        double newSalaryMasha = Math.round(salaryMasha * percentUpSalary);
        double newSalaryDenis = Math.round(salaryDenis * percentUpSalary);
        double newSalaryKristina = Math.round(salaryKristina * percentUpSalary);

        System.out.println("Зарплата Маши стала: " + newSalaryMasha +
                ". Годовой доход вырос на: " + (newSalaryMasha - salaryMasha));
        System.out.println("Зарплата Дениса стала: " + newSalaryDenis +
                ". Годовой доход вырос на: " + (newSalaryDenis - salaryDenis));
        System.out.println("Зарплата Кристины стала: " + newSalaryKristina +
                ". Годовой доход вырос на: " + (newSalaryKristina - salaryKristina));
    }
}