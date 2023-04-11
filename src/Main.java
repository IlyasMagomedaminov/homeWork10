public class Main {
    public static void main(String[] args) {
        task1();
       // task2();
        //task3();
    }

    public static void task1(){
        System.out.println("Задача 1.");
        checkYearIsLeap(2023);
        checkYearIsLeap(2077);
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
    }
    public static void task3(){

    }
}