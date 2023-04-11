public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        System.out.println("Задача 1.");
        checkYearIsLeap(2023);
        checkYearIsLeap(2077);

        System.out.println();
    }
    public static void checkYearIsLeap(int year){

        if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0){
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task2(){
        System.out.println("Задача 2.");

        getOsRecomendation(2010,1);
        getOsRecomendation(2014,0);

        System.out.println();
    }
    public static void getOsRecomendation(int currentYear,int clientOs){

        int boarderYear = 2015;

        String lightInfo;

        if (currentYear < boarderYear){
            lightInfo = "облегченную";
        }else {
            lightInfo = "";
        }

        String osType;

        if (clientOs == 0){
            osType = "iOS";
        }else {
            osType = "Android";
        }

        String generalInfo = "Установите " + lightInfo + " версию приложения для " + osType + " по ссылке";
        System.out.println(generalInfo);

    }
    public static void task3(){
        System.out.println("Задача 3.");
        fox(2);
        fox(40);
        fox(90);
        fox(110);

        System.out.println();
    }
    public static void fox(int distance){
        int days = computeDeliveryDays(distance);
        String deliveriInfo = days == -1? "Доставки нет" : String.format("Потребуется дней: %s", days );

        System.out.println(deliveriInfo);
    }
    public static int computeDeliveryDays(int distance){
        if (distance <= 20){
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <=100) {
            return 3;
        }else {
            return -1;
        }
    }
}