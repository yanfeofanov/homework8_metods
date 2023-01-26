public class Task_1 {
    int year;

    int transferOfTheYear(int desiredYear){
        year = desiredYear;
        return desiredYear;
    }

    void checkYear(){
        if (year%100 == 0 && year%400 == 0){
            System.out.println(year+" год - восокосный");
        }
        else if(year%100 == 0){
            System.out.println(year+" год - невисокосный");
        }
        else if(year%4 == 0){
            System.out.println(year+" год - високосный");
        }
        else {
            System.out.println(year+" год - невисокосный");
        }
    }
}
