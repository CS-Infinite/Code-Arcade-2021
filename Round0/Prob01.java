import java.util.Scanner;
/*
    ง่ายที่สุดของรอบนี้
*/
public class Prob01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 1 && number < 13) {
            for (int i = 1; i < 13; i++) {
                int answer = number * i;
                System.out.printf("%d * %d = %d \n", number, i, answer);
            }
        } else {
            System.out.println("What happens to your brain?");
        }
        scanner.close();
    }
}