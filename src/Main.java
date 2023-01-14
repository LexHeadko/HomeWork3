public class Main {
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

    public static void task1() {
        System.out.println("Задача 1");
        byte per1 = 8;
        short per2 = 3;
        int per3 = 763789;
        long per4 = 789874564L;
        float per5 = 3.25f;
        double per6 = 3.231654354626149;
        System.out.println(
                "Значение переменной byte равно " + per1 + "," +
                        "Значение переменной short равно " + per2 + "," +
                        "Значение переменной int равно " + per3 + "," +
                        "Значение переменной long равно " + per4 + "," +
                        "Значение переменной float равно " + per5 + "," +
                        "Значение переменной double равно " + per6 + ".");
    }

    public static void task2() {
        System.out.println("Задача 2");
        float per1 = 27.12f;
        long per2 = 987678965549L;
        float per3 = 2.786f;
        short per4 = 569;
        short per5 = -159;
        short per6 = 27897;
        byte per7 = 67;
        float total = per1 + per2 + per3 + per4 + per5 + per6 + per7;
        System.out.println("Сумма всех переменных равна " + total);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte ludmilaPavlovnaLearners = 23;
        byte annaSergeevnaLeaarners = 27;
        byte ekaterinaAndreevnaLearners = 30;
        short totalPepers = 480;
        int pepers = totalPepers / (ludmilaPavlovnaLearners + annaSergeevnaLeaarners + ekaterinaAndreevnaLearners);
        System.out.println("На каждого ученика рассчитано " + pepers + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte productivityMachineInMinute = 16 / 2;
        int productivityIn20Minutes = productivityMachineInMinute * 20;
        int productivityIn24Hours = productivityIn20Minutes * 3 * 24;
        int productivityIn3Day = productivityIn24Hours * 3;
        int productivityInMonth = productivityIn3Day * 10;
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок(ки).");
        System.out.println("За 24 часа машина произвела " + productivityIn24Hours + " штук бутылок(ки).");
        System.out.println("За 3 дня машина произвела " + productivityIn3Day + " штук бутылок(ки).");
        System.out.println("За месяц машина произвела " + productivityInMonth + " штук бутылок(ки).");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalJar = 120;
        byte oneClassWhiteColorJars = 2;
        byte oneClassBrownColorsJars = 4;
        int totalClassInSchool = totalJar / (oneClassBrownColorsJars + oneClassWhiteColorJars);
        int totalWhiteColorJars = totalClassInSchool * 2;
        int totalBrownColorsJars = totalClassInSchool * 4;
        System.out.println("В школе, где " + totalClassInSchool + " классов, нужно " + totalWhiteColorJars + " банок белой краски и " + totalBrownColorsJars + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        short bananasGram = 5 * 80;
        short milkGram = 2 * 105;
        short iceCreamGram = 2 * 100;
        short eggsGram = 4 * 70;
        int totalGram = bananasGram + milkGram + iceCreamGram + eggsGram;
        int totalKilogram = totalGram / 1000;
        System.out.println("Итоговый вес завтрака " + totalGram + " грамм или " + totalKilogram + " килограмм.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte totalWeightKilogram = 7;
        short minWeightLossGram = 250;
        short maxWeightLossGram = 500;
        int dayOfWeightLoss;
        dayOfWeightLoss = totalWeightKilogram * 1000 / minWeightLossGram;
        System.out.println(dayOfWeightLoss + " дней потребуется, чтобы сбросить нужный вес, если сбрасывать по минимуму!");
        dayOfWeightLoss = totalWeightKilogram * 1000 / maxWeightLossGram;
        System.out.println(dayOfWeightLoss + " дней потребуется, чтобы сбросить нужный вес, если сбрасывать по максимуму!");
        dayOfWeightLoss = totalWeightKilogram * 1000 / ((maxWeightLossGram + minWeightLossGram) / 2);
        System.out.println(dayOfWeightLoss + " дней потребуется в среднем!");
    }
    public static void task8() {
        System.out.println("Задача 7.1");
        byte totalWeightKilogram = 7;
        short minWeightLossGram = 250;
        short maxWeightLossGram = 500;
        int minDayOfWeightLoss = totalWeightKilogram * 1000 / maxWeightLossGram;
        int maxDayOfWeightLoss = totalWeightKilogram * 1000 / minWeightLossGram;
        System.out.println(minDayOfWeightLoss + " дней потребуется, чтобы сбросить нужный вес, если сбрасывать по минимуму!");
        System.out.println(maxDayOfWeightLoss + " дней потребуется, чтобы сбросить нужный вес, если сбрасывать по максимуму!");
        int dayOfWeightLoss = (minDayOfWeightLoss + maxDayOfWeightLoss) / 2;
        System.out.println(dayOfWeightLoss + " дней потребуется в среднем!");
    }
}