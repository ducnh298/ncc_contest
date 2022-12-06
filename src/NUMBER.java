import java.math.BigInteger;
import java.util.Scanner;

public class NUMBER {

    private static BigInteger f(BigInteger n) {

        if (n.remainder(BigInteger.TEN).intValue() % 2 == 0)
            return new BigInteger("1").multiply(n.divide(new BigInteger("2")));
        else
            return new BigInteger("-1").multiply(n.add(new BigInteger("1")).divide(new BigInteger("2")));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger n = new BigInteger(in.nextLine());
        System.out.println(f(n));

    }
}