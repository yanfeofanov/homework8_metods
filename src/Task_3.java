public class Task_3 {
    int distance ;
    int dayDelivery = 1;

    void printDistanceInfo(int deliveryDistance){
        distance = deliveryDistance;
        if(distance  <= 20){
            System.out.println("Потребуется дней "+dayDelivery);
        }
        else if (distance  >= 20 && distance  <= 60){
            System.out.println("Потребуется дней "+(dayDelivery+1));
        }
        else if (distance  >= 60 && distance  <= 100){
            System.out.println("Потребуется дней "+(dayDelivery+2));
        }
        else if (distance  > 100){
            System.out.println("Доставки нет");
        }
    }
}
