public class Task_1 {
    int year;

    int transferOfTheYear(int desiredYear){
        year = desiredYear;
        return desiredYear;
    }

    void checkYear(){
        if ((year%400 == 0) || ((year%4 == 0) && (year%100 !=0))){
            System.out.println(year+" год - восокосный");
        }
        else {
            System.out.println(year+" год - невисокосный");
        }
    }
}
