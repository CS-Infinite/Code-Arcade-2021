import java.math.BigInteger;
import java.util.Scanner;

/* 
    Source of Memory
*/

public class Prob24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();
        
        if (n.equals(BigInteger.ONE)) {
            System.out.println(0);
            return;
        }

        BigInteger num = BigInteger.ONE;

        int i = 0;
        for (i = 1; num.compareTo(m) == -1; i++) {
            num = num.add(n.pow(i));
        }

        System.out.println(num.subtract(m));

        in.close();
    }
}