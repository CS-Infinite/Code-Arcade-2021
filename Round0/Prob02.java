import java.util.Scanner;
/*
    แค่น้ำเกลือ...
*/
public class Prob02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Not this year!");
        } else if (age >= 18 && age < 31) {
            System.out.println("2");
        } else if (age >= 31 && age < 41) {
            System.out.println("3");
        } else if (age >= 41 && age < 51) {
            System.out.println("4");
        } else if (age >= 51) {
            System.out.println("5");
        }
        scanner.close();
    }
}