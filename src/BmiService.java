public class BmiService {
    public double calculate(double weight, double height) {
        double result = (weight / (Math.pow(height, 2)));
        return result;
    }
}
