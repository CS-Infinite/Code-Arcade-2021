import java.util.*;
/*
    เจ้าช๊ายย เจ้าชาย
*/

public class Prob11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
    
        int tmp = Math.min(b, c) / 2;
        int glasses = tmp <= a ? tmp * 3 : a * 3;
        System.out.println(glasses / 18 + (glasses % 18 / 6) + (glasses % 18 % 6 / 3));
    }
}
