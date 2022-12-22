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
        // Задание 1
        byte a = 100;
            System.out.println(a);
        short b = -30000;
            System.out.println(b);
        int c = 50000;
            System.out.println(c);
        long d = 3000000000L;
            System.out.println(d);
        float i = 1.000001f;
            System.out.println(i);
        double f = 1.0000000001;
            System.out.println(f);
        }
        public static void task2() {
        // Задание 2
        float a = 27.12F;
            System.out.println(a);
        long b = 987678965549L;
            System.out.println(b);
        float c = 2.786F;
            System.out.println(c);
        short d = 569;
            System.out.println(d);
        short i = -159;
            System.out.println(i);
        short f = 27897;
            System.out.println(f);
        byte g = 67;
            System.out.println(g);
        }
        public static void task3() {
        // Задание 3
        byte numStudentsLudmilaPavlovna = 23;
        byte numStudentsAnnaSergeevna = 27;
        byte numStudentsEkaterinaAndreevna = 30;
        short sheetsOfPaper = 480;
        byte sumStudents = (byte) (numStudentsAnnaSergeevna + numStudentsEkaterinaAndreevna + numStudentsLudmilaPavlovna);
        short paperPerStudent = (short) (sheetsOfPaper / sumStudents);
            System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        }
        public static void task4() {
        // Задание 4
        int bottlesPerMinute = 16 / 2;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
            System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
            System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlesPer3Days = bottlesPerDay * 3;
            System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        int bottlePerMonth = bottlesPerDay * 30;
            System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");
        }
        public static void task5() {
        int paintNeed = 120;
        int whitePaintNeedPerClass = 2;
        int brownPaintNeedPerClass = 4;
        int paintPerClass = whitePaintNeedPerClass + brownPaintNeedPerClass;
        int numOfClasses = paintNeed / paintPerClass;
        int numOfWhitePaints = numOfClasses * whitePaintNeedPerClass;
        int numOfBrownPaints = numOfClasses * brownPaintNeedPerClass;
            System.out.println("В школе, где " + numOfClasses + " классов, нужно " + numOfWhitePaints + " банок белой краски и " + numOfBrownPaints + " банок коричневой краски");
        }
        public static void task6() {}
        public static void task7() {}
        public static void task8() {}
}