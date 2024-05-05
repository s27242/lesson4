import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c, int d) {
        return this.multiply(this.multiply(a, b), this.multiply(c, d));
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public Integer multiply(ArrayList<Integer> array) {
        Integer result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            result *= array.get(i);
        }
        return result;
    }
}
