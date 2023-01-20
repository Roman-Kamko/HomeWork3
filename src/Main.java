import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        byte childCount = 3;
        System.out.println("Значение переменной childCount с типом byte равно " + childCount);

        short roomNum = 128;
        System.out.println("Значение переменной roomNum с типом short равно " + roomNum);

        int moneyCount = 100_000;
        System.out.println("Значение переменной moneyCount с типом int равно " + moneyCount);

        long personCount = 8_000_000_000L;
        System.out.println("Значение переменной personCount с типом long равно " + personCount);

        float e = 2.718F;
        System.out.println("Значение переменной e с типом float равно " + e);

        double pi = 3.141_592_653;
        System.out.println("Значение переменной pi с типом double равно " + pi);

        // Задание 2
        float floatNum = 27.12F;
        long longNum = 987_678_965_549L;
        double doubleNum = 2.786;
        int intNum = 569;
        short shortNum = -159;
        char charNum = 27897;
        byte byteNum = 67;

        // Задание 3
        System.out.println("Задание 3");

        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int totalPapersCount = 480;

        int totalPupils = pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass;
        int paperPerPupil = totalPapersCount / totalPupils;

        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");

        // Задание 4
        System.out.println("Задание 4");

        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;

        int bottlesPer20Minutes = productivityPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");

        int bottlesPerDay = productivityPerMinute * 60 * 24;
        System.out.println("За день машина произвела " + bottlesPerDay + " штук бутылок");

        int bottlesPer3Days = bottlesPerDay * 3;
        System.out.println("За за 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");

        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        // Задание 5
        System.out.println("Задание 5");

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задание 6
        System.out.println("Задание 6");

        int bananas = 5;
        int bananaWeight = 80;
        int milk = 2;
        int milkWeight = 105;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int eggs = 4;
        int eggWeight = 70;

        int totalBananasWeight = bananas * bananaWeight;
        int totalMilkWeight = milk * milkWeight;
        int totalIceCreamWeight = iceCream * iceCreamWeight;
        int totalEggsWeight = eggs * eggWeight;
        int totalWeightInGrams = totalEggsWeight + totalBananasWeight + totalMilkWeight + totalIceCreamWeight;
        double totalWeightInKg = totalWeightInGrams / 1_000D;

        System.out.println("Вес завтрака спортсмена " + totalWeightInGrams + " гр или " + totalWeightInKg + " кг");

        // Задание 7
        System.out.println("Задание 7");

        int loseWeightInKg = 7;
        int loseWeightInGram = loseWeightInKg * 1_000;
        int minLoseWeight = 250;
        int maxLoseWeight = 500;
        double averageLoseWeight = (minLoseWeight + maxLoseWeight) / 2D;

        int minDays = loseWeightInGram / maxLoseWeight;
        int maxDays = loseWeightInGram / minLoseWeight;
        double averageDays = loseWeightInGram / averageLoseWeight;

        System.out.println("Если спортсмен будет терять " + minLoseWeight + " гр в день, то у него уйдет " + maxDays + " дней, чтобы похудеть на " + loseWeightInKg + " кг");
        System.out.println("Если спортсмен будет терять " + maxLoseWeight + " гр в день, то у него уйдет " + minDays + " дней, чтобы похудеть на " + loseWeightInKg + " кг");
        System.out.printf(Locale.US, "В среднем у спортсмена уйдет %.1f дней%n", averageDays);

        // Задание 8
        System.out.println("Задание 8");

        double indexPercent = 1.1;

        int mashaSalary = 67_760;
        double newMashaSalary = mashaSalary * indexPercent;
        double mashaSalaryChangePerYear = newMashaSalary * 12 - mashaSalary * 12;

        int denisSalary = 83_960;
        double newDenisSalary = denisSalary * indexPercent;
        double denisSalaryChangePerYear = newDenisSalary * 12 - denisSalary * 12;

        int kristinaSalary = 76_230;
        double newKristinaSalary = kristinaSalary * indexPercent;
        double kristinaSalaryChangePerYear = newKristinaSalary * 12 - kristinaSalary * 12;

        System.out.printf(Locale.US, "Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей %n", newMashaSalary, mashaSalaryChangePerYear);
        System.out.printf(Locale.US, "Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей %n", newDenisSalary, denisSalaryChangePerYear);
        System.out.printf(Locale.US, "Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей %n", newKristinaSalary, kristinaSalaryChangePerYear);
    }
}