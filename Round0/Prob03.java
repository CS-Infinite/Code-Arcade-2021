import java.util.Scanner;
/*
    Move on เป็นวงกลม
*/
public class Prob03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("%.2f", area);
        scanner.close();
    }
}
