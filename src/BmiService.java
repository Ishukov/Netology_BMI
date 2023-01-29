import java.text.DecimalFormat;

public class BmiService {
    public double calculate(double m, double h) {
        double result = (m/(Math.pow(h, 2)));
        return result;
    }
}
