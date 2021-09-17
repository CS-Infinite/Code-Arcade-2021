import java.util.Scanner;
/*
    ไปให้ถึง
*/

public class Prob21 {
  
    static class Position {
        int x, y, z;
        Position (){}
        Position(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public static int distanceOf(int d1, int d2){
            if ((d1 > 0 && d2 > 0) || (d1 < 0 && d2 < 0)){
                return Math.abs(d1 - d2);
            }
            return Math.abs(d1) + Math.abs(d2);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Position pa = new Position();
        pa.x = sc.nextInt();
        pa.y = sc.nextInt();
        pa.z = sc.nextInt();
        Position pb = new Position();
        pb.x = sc.nextInt();
        pb.y = sc.nextInt();
        pb.z = sc.nextInt();

        String[] direc = new String[n];
        for (int i = 0; i < n; i++) {
            direc[i] = sc.next();
        }

        Position ans = new Position(0, 0, 0);

        for (String way:direc) {
            if (way.equals("-"))
                ans.x++;
            else if (way.equals("|"))
                ans.y++;
            else
                ans.z++;
        }

        if (Position.distanceOf(pa.x, pb.x) > ans.x){
            System.out.println(-1);
            return;
        }
        if (Position.distanceOf(pa.y, pb.y) > ans.y){
            System.out.println(-1);
            return;
        }
        if (Position.distanceOf(pa.z, pb.z) > ans.z){
            System.out.println(-1);
            return;
        }
        System.out.println(1);

        sc.close();
    }


}
