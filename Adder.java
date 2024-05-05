import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public BigInteger add(ArrayList<BigDecimal> array) {
        BigInteger result = BigInteger.ZERO;
        for (BigDecimal b : array) {
            result = result.add(b.toBigInteger());
        }
        return result;
    }
}
