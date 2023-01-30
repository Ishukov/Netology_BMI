import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double weight = 90; //вес в киллограммах
        double height = 1.7; //рост в метрах
        String bmi = decimalFormat.format(service.calculate(weight, height));

        System.out.println("Ваш идекс массы тела равен " + bmi);
    }
}