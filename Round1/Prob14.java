import java.util.*;
/*
    จันทร์อังารพฤหัสศุกร์เสาร์อาทิตย์
*/

public class Prob14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] charArr = word.toCharArray();

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum + (int) charArr[i];
        }
        System.out.println(sum);
        
        scanner.close();
    }
    
}
