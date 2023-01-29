import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double m = 90; //вес в киллограммах
        double h = 1.7; //рост в метрах
        String bmi = decimalFormat.format(service.calculate(m, h));

        System.out.println("Ваш идекс массы тела равен " + bmi);
    }
}