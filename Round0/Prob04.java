import java.util.*; 
/*
  Victory
*/
class Prob04 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();

      int ans = num;
      int i = 1;
      if (num > 0) {
        while (i < ans) {
          num *= i;
          i++;
        }
        System.out.println(num);
      } else {
        System.out.println(0);
      }
      scanner.close();
  }
}