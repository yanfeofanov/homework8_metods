import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }
    private static void task1(){
        System.out.println("Задание №1");
        Task_1 years_one = new Task_1();
        years_one.transferOfTheYear(2021);
        years_one.checkYear();
    }
    private static void task2(){
        System.out.println("Задание №2");
        int currentYear = LocalDate.now().getYear();
        Task_2 systemIos = new Task_2();
        systemIos.operatingSystemTypeIos(currentYear,0);
        systemIos.detectionVersionIos();
        Task_2 systemAndroid = new Task_2();
        systemAndroid.operatingSystemTypeAndroid(2014,1);
        systemAndroid.detectionVersionAndroid();
    }
    private static void task3(){
        System.out.println("Задание №3");
        Task_3 delivery = new Task_3();
        delivery.printDistanceInfo(95);
    }
}