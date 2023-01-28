

public class Task_2 {


    String detectionVersion(int systemType, int yearsDevise) {

            StringBuilder result = new StringBuilder("Установите ");
            if (yearsDevise < 2015) {
                result.append("облегченную версию для ");
            } else {
                result.append("обычную версию для ");
            }
            if (systemType == 0) {
                result.append("iOS по ссылке");
            } else {
                result.append("Android по ссылке");
            }

            System.out.println(result);
            return result.toString();
        }
    }



