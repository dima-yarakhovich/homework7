public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();

    }

    private static void task9() {
        int a;
        for (int i=1; i<=10;i++){
           a=2*i;
            System.out.println("2*"+i+"="+a);
        }
    }

    private static void task8() {
        int yearNow = 2022;
        int futureYear = yearNow + 100;
        int pastYear = yearNow - 200;
        for (int year = 0; year <= futureYear; year = year + 79) {
            if (year >= pastYear) {
                System.out.println("В " + year + " году над Землей пролетают кометы и их можно будет увидеть");
            }
        }

    }

    private static void task7() {
        int friday = 5;
        for (int day = 1; day <= 31; day++) {
            if (day % 7 == 5) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

    }

    private static void task6() {
        double money = 15_000;
        double sum = 0;
        int yearsTotal = 9 * 12;
        for (int month = 1; month <= yearsTotal; month++) {
            money = money + money * 0.07;
            sum = money;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений Василия равна " + sum + " рублей");
            }
        }
    }

    private static void task4() {
        double money = 15_000;
        double sum = 0;
        for (int month = 1; sum <= 12_000_000; month++) {
            money = money + money * 0.07;
            sum = money;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений Василия равна " + sum + " рублей");
            }
        }
    }

    private static void task3() {
        int humanCountryY = 12_000_000;
        int years = 0;
        int birth = humanCountryY / 1000 * 17;
        int dead = humanCountryY / 1000 * 8;
        while (years <= 10) {
            years++;
            humanCountryY = humanCountryY + birth - dead;

            System.out.println("Год " + years + ", численность населения составляет " + humanCountryY);
        }

    }

    private static void task2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }


    private static void task1() {
        int summ = 29000;
        int cash = 0;
        for (int i = 1; cash <= 2459000; i++) {
            cash = cash + cash / 100;
            cash = cash + summ;
            System.out.println("Месяц " + i + " сумма накоплений равна " + cash + " рублей");
        }
    }
}