import java.util.Scanner;
/*
    นาย ก
*/
class Prob13
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int input=sc.nextInt();
        int input2=sc.nextInt();
        if(input2>=2&&input2<=10)
        {
            int basechanged=0;
            int multiple=1;

            while(input>0){
                int dig=input%input2;
                input=input/input2;
                basechanged+=dig*multiple;
                multiple*=10;
            }
        System.out.println(basechanged);
        } else System.out.println("base error");
    }
}