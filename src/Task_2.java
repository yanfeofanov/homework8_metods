import java.time.LocalDate;

public class Task_2 {
    int iOSYear;
    int androidYear;
    int iOS;
    int android;

    void productionYearIos(int productionYearIos){
        iOSYear = productionYearIos;
    }
    void productionYearAndroid(int productionYearAndroid){
        androidYear = productionYearAndroid;
    }
    void operatingSystemTypeIos(int systemTypeIos){
        iOS = systemTypeIos;
    }
    void operatingSystemTypeAndroid(int systemTypeAndroid){
        android = systemTypeAndroid;

    }

    void detectionVersionIos(){
        if(iOSYear < 2015 && iOS == 0){
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
        if(androidYear < 2015 && android == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if(android != 0) {
            System.out.println("Не верный тип операционной системы");
        }
        else if(androidYear > 2015){
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }
}
