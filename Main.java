import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Z1 part 1
        Multiplier  multiplier = new Multiplier();
        int result1_1_1 = multiplier.multiply(3, 2);
        int result1_1_2 = multiplier.multiply(3, 2, 3, 4);
        double result1_1_3 = multiplier.multiply(3.0d, 2.0d);
        BigDecimal result1_1_4 = multiplier.multiply(new BigDecimal(3), new BigDecimal(2));
        Integer result1_1_5 = multiplier.multiply(new ArrayList<>(3){{add(1); add(2); add(3);}});

//        Z1 part2
        Adder adder = new Adder();
        int result1_2_1 = adder.add(1, 2);
        BigInteger result1_2_2 = adder.add(new ArrayList<>(3){{add(new BigDecimal(1)); add(new BigDecimal(2)); add(new BigDecimal(3));}});

//        Z2
        Address address = new Address();
        String sAddress = address.createAddress("Poland", "Warsaw", "02-232", "Prosta", "12/2");
        System.out.println(sAddress);
    }
}
