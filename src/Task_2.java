import java.time.LocalDate;

public class Task_2 {
    int iOSYear;
    int androidYear;
    int iOS;
    int android;


    void operatingSystemTypeIos(int systemTypeIos, int productionYearIos ){
        iOS = systemTypeIos;
        iOSYear = productionYearIos;
    }
    void operatingSystemTypeAndroid(int systemTypeAndroid, int productionYearAndroid){
        android = systemTypeAndroid;
        androidYear = productionYearAndroid;

    }

    void detectionVersionIos(){
        if(iOSYear < 2015 ){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(iOS != 0) {
            System.out.println("Не верный тип операционной системы");
        }
        else if(iOSYear > 2015){
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
    }
    void detectionVersionAndroid(){
        if(androidYear < 2015 ){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if(android > 0) {
            System.out.println("Не верный тип операционной системы");
        }
        else if(androidYear > 2015){
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }
}
