import java.util.*;
/*
  Scoreboard จำเป็น
*/
class Prob12 {
  public static void main(String[] args) {
    // input
    Scanner input = new Scanner(System.in);
    int competitors = input.nextInt();
    List<Integer> scores = new ArrayList<Integer>();
    for(int i = 0; i < competitors; i++) {
      int s = input.nextInt();
      scores.add(s);
    }
    int round = input.nextInt();
    int[] myScores = new int[round];
    for(int i = 0; i < round; i++) {
      myScores[i] = input.nextInt();
    }

    // Calculating
    ArrayList<Integer> rank = new ArrayList<>();
    for(int i = 0; i < myScores.length; i++) {
      scores.add(myScores[i]);

      Collections.sort(scores, Collections.reverseOrder()); 

      int r = 1;
      for(int j = 1; j < scores.size(); j++) {
        if(scores.get(j-1) == myScores[i]) break;
        if(scores.get(j-1) > scores.get(j)) r++;
      }
      rank.add(r);
      scores.remove(scores.indexOf(myScores[i]));
    }

    // System.out.println("Ranking...");
    for(int i = 0; i < rank.size(); i++){
      System.out.println(rank.get(i));
    }
  }
}