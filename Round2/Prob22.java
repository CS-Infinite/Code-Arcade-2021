import java.util.*;
/* 
  Maximum One Out
*/
class Prob22 {
  public static void main(String[] args) {
    // input
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int filter = input.nextInt();
    int[] students = new int[n];
    for(int i = 0; i < n; i++) {
      students[i] = input.nextInt();
    }
    
    // calculation
    ArrayList<Integer> selected = new ArrayList<>();
    selected.add(0);
    for(int i = 0; i <= students.length-filter; i++) {
      int max = students[i];
      for(int j = i+1; j-i < filter && j < students.length; j++) {
        if(students[j] > max) {
          max = students[j];
        }
      }
      // if(max != selected.get(selected.size()-1)) selected.add(max);
      boolean isExist = false;
      for (int k = 0; k < selected.size(); k++) {
        if(selected.get(k) == max) isExist = isExist || true;
      }
      if(!isExist) selected.add(max);
    }

    for(int i = 1; i < selected.size(); i++) {
      System.out.print(selected.get(i) + " ");
    }

    input.close();
  }
}