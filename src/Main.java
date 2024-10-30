public class Main {
    public static void main(String[] args) {
        System.out.println("***");

        //Task#1
        int savings = 0;
        short i = 1;
        while (savings <= 2459000){
            savings += 15000;
            System.out.println("Месяц " +i
                    +", сумма накоплений равна "
                    +savings +" рублей.");
            i++;
        }
        System.out.println("Для накопления нужной суммы требуется " +i +" месяцев.");
        System.out.println("***");

        //Task#2
        i = 1;
        while (i<=10){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();
        i = 10;
        for (;i>=1;i--){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("***");

        //Task#3
        int population = 12_000_000;
        for (byte year = 1;year<=10;year++){
            population += (population/1000 *(17-8));
            System.out.println("Год " +year
                    +", численность населения составляет "
                    +population +".");
        }
        System.out.println("***");

        //Task#4
        savings = 15000;
        i = 1;
        while (savings<12_000_000){
            savings += savings/100*7;
            System.out.println("Месяц " +i
                    +", сумма накоплений - " +savings +".");
            i++;
        }
        System.out.println("***");

        //Task#5
        savings = 15000;
        i = 1;
        while (savings<12_000_000){
            savings += savings/100*7;
            if (i%6==0) {
                System.out.println("Месяц " +i
                        +", сумма накоплений - " +savings +".");
            }
            i++;
        }
        System.out.println("***");

        //Task#6
        savings = 15000;
        byte monthsPerYear = 12;
        byte years = 9;
        i = 1;
        for (;i<=(monthsPerYear*years);i++){
            savings += savings/100*7;
            if (i%6==0) {
                System.out.println("Месяц " +i
                        +", сумма накоплений - " +savings +".");
            }
        }
        System.out.println("***");

        //Task#7
        byte firstFriday = 3;
        i = 0;
        for (;(firstFriday+i)<=31;i++) {
            if (i%7==0) {
                System.out.println("Сегодня пятница, "
                        + (firstFriday + i) + "-е число. "
                        + "Необходимо подготовить отчет.");
            }
        }
        System.out.println("***");

        //Task#8
        short twoHundYearsAgo = 1824;
        short aHundredYearsLater = 2124;
        i = twoHundYearsAgo;
        while (i <= aHundredYearsLater){
            if (i%79==0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("***");
    }
}